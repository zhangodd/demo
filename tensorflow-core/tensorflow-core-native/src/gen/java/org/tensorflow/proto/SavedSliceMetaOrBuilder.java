// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow/core/util/saved_tensor_slice.proto

package org.tensorflow.proto;

public interface SavedSliceMetaOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tensorflow.SavedSliceMeta)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Name of the tensor.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Name of the tensor.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Shape of the tensor
   * </pre>
   *
   * <code>.tensorflow.TensorShapeProto shape = 2;</code>
   * @return Whether the shape field is set.
   */
  boolean hasShape();
  /**
   * <pre>
   * Shape of the tensor
   * </pre>
   *
   * <code>.tensorflow.TensorShapeProto shape = 2;</code>
   * @return The shape.
   */
  org.tensorflow.proto.TensorShapeProto getShape();
  /**
   * <pre>
   * Shape of the tensor
   * </pre>
   *
   * <code>.tensorflow.TensorShapeProto shape = 2;</code>
   */
  org.tensorflow.proto.TensorShapeProtoOrBuilder getShapeOrBuilder();

  /**
   * <pre>
   * Type of the tensor
   * </pre>
   *
   * <code>.tensorflow.DataType type = 3;</code>
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   * <pre>
   * Type of the tensor
   * </pre>
   *
   * <code>.tensorflow.DataType type = 3;</code>
   * @return The type.
   */
  org.tensorflow.proto.DataType getType();

  /**
   * <pre>
   * Explicit list of slices saved in the checkpoint file.
   * </pre>
   *
   * <code>repeated .tensorflow.TensorSliceProto slice = 4;</code>
   */
  java.util.List<org.tensorflow.proto.TensorSliceProto> 
      getSliceList();
  /**
   * <pre>
   * Explicit list of slices saved in the checkpoint file.
   * </pre>
   *
   * <code>repeated .tensorflow.TensorSliceProto slice = 4;</code>
   */
  org.tensorflow.proto.TensorSliceProto getSlice(int index);
  /**
   * <pre>
   * Explicit list of slices saved in the checkpoint file.
   * </pre>
   *
   * <code>repeated .tensorflow.TensorSliceProto slice = 4;</code>
   */
  int getSliceCount();
  /**
   * <pre>
   * Explicit list of slices saved in the checkpoint file.
   * </pre>
   *
   * <code>repeated .tensorflow.TensorSliceProto slice = 4;</code>
   */
  java.util.List<? extends org.tensorflow.proto.TensorSliceProtoOrBuilder> 
      getSliceOrBuilderList();
  /**
   * <pre>
   * Explicit list of slices saved in the checkpoint file.
   * </pre>
   *
   * <code>repeated .tensorflow.TensorSliceProto slice = 4;</code>
   */
  org.tensorflow.proto.TensorSliceProtoOrBuilder getSliceOrBuilder(
      int index);
}