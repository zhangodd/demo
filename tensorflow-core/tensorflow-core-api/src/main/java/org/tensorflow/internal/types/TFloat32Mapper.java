/*
 *  Copyright 2020 The TensorFlow Authors. All Rights Reserved.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *  =======================================================================
 */
package org.tensorflow.internal.types;

import org.bytedeco.javacpp.PointerScope;
import org.tensorflow.RawTensor;
import org.tensorflow.SparseTensor;
import org.tensorflow.TensorMapper;
import org.tensorflow.internal.buffer.TensorBuffers;
import org.tensorflow.ndarray.buffer.FloatDataBuffer;
import org.tensorflow.ndarray.impl.dense.FloatDenseNdArray;
import org.tensorflow.ndarray.impl.sparse.FloatSparseNdArray;
import org.tensorflow.proto.DataType;
import org.tensorflow.types.TFloat32;
import org.tensorflow.types.TInt64;

/**
 * Maps memory of {@link org.tensorflow.proto.DataType#DT_FLOAT} tensors to a n-dimensional data
 * space.
 */
public final class TFloat32Mapper extends TensorMapper<TFloat32> {

  @Override
  protected TFloat32 mapDense(RawTensor tensor) {
    FloatDataBuffer buffer = TensorBuffers.toFloats(nativeHandle(tensor));
    return new DenseTFloat32(tensor, buffer);
  }

  @Override
  protected SparseTensor<TFloat32> mapSparse(
      TInt64 indices, TFloat32 values, TInt64 denseShape, PointerScope tensorScope) {
    return new SparseTFloat32(indices, values, denseShape, tensorScope);
  }

  private static final class DenseTFloat32 extends FloatDenseNdArray implements TFloat32 {

    @Override
    public Class<TFloat32> type() {
      return TFloat32.class;
    }

    @Override
    public DataType dataType() {
      return asRawTensor().dataType();
    }

    @Override
    public long numBytes() {
      return asRawTensor().numBytes();
    }

    @Override
    public void close() {
      asRawTensor().close();
    }

    @Override
    public RawTensor asRawTensor() {
      return rawTensor;
    }

    final RawTensor rawTensor;

    DenseTFloat32(RawTensor rawTensor, FloatDataBuffer buffer) {
      super(buffer, rawTensor.shape());
      this.rawTensor = rawTensor;
    }
  }

  private static final class SparseTFloat32 extends FloatSparseNdArray
      implements TFloat32, SparseTensor<TFloat32> {

    @Override
    public Class<TFloat32> type() {
      return TFloat32.class;
    }

    @Override
    public DataType dataType() {
      return values().dataType();
    }

    @Override
    public long numBytes() {
      return SparseHelpers.numBytes(this);
    }

    @Override
    public void close() {
      tensorScope.close();
    }

    @Override
    public boolean isSparse() {
      return true;
    }

    @Override
    public TInt64 indices() {
      return (TInt64) getIndices();
    }

    @Override
    public TFloat32 values() {
      return (TFloat32) getValues();
    }

    @Override
    public TInt64 denseShape() {
      return denseShape;
    }

    SparseTFloat32(TInt64 indices, TFloat32 values, TInt64 denseShape, PointerScope tensorScope) {
      super(indices, values, 0.0f, SparseHelpers.toDimensionalSpace(denseShape));
      this.denseShape = denseShape;
      this.tensorScope = tensorScope.extend();
    }

    private final TInt64 denseShape;
    private final PointerScope tensorScope;
  }
}
