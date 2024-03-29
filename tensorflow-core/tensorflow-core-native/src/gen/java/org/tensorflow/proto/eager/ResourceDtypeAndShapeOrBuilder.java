// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow/core/protobuf/remote_tensor_handle.proto

package org.tensorflow.proto.eager;

public interface ResourceDtypeAndShapeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tensorflow.eager.ResourceDtypeAndShape)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.tensorflow.DataType dtype = 1;</code>
   * @return The enum numeric value on the wire for dtype.
   */
  int getDtypeValue();
  /**
   * <code>.tensorflow.DataType dtype = 1;</code>
   * @return The dtype.
   */
  org.tensorflow.proto.DataType getDtype();

  /**
   * <code>.tensorflow.TensorShapeProto shape = 2;</code>
   * @return Whether the shape field is set.
   */
  boolean hasShape();
  /**
   * <code>.tensorflow.TensorShapeProto shape = 2;</code>
   * @return The shape.
   */
  org.tensorflow.proto.TensorShapeProto getShape();
  /**
   * <code>.tensorflow.TensorShapeProto shape = 2;</code>
   */
  org.tensorflow.proto.TensorShapeProtoOrBuilder getShapeOrBuilder();
}
