// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow/core/framework/resource_handle.proto

package org.tensorflow.proto.framework;

public interface ResourceHandleProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tensorflow.ResourceHandleProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Unique name for the device containing the resource.
   * </pre>
   *
   * <code>string device = 1;</code>
   * @return The device.
   */
  java.lang.String getDevice();
  /**
   * <pre>
   * Unique name for the device containing the resource.
   * </pre>
   *
   * <code>string device = 1;</code>
   * @return The bytes for device.
   */
  com.google.protobuf.ByteString
      getDeviceBytes();

  /**
   * <pre>
   * Container in which this resource is placed.
   * </pre>
   *
   * <code>string container = 2;</code>
   * @return The container.
   */
  java.lang.String getContainer();
  /**
   * <pre>
   * Container in which this resource is placed.
   * </pre>
   *
   * <code>string container = 2;</code>
   * @return The bytes for container.
   */
  com.google.protobuf.ByteString
      getContainerBytes();

  /**
   * <pre>
   * Unique name of this resource.
   * </pre>
   *
   * <code>string name = 3;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Unique name of this resource.
   * </pre>
   *
   * <code>string name = 3;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Hash code for the type of the resource. Is only valid in the same device
   * and in the same execution.
   * </pre>
   *
   * <code>uint64 hash_code = 4;</code>
   * @return The hashCode.
   */
  long getHashCode();

  /**
   * <pre>
   * For debug-only, the name of the type pointed to by this handle, if
   * available.
   * </pre>
   *
   * <code>string maybe_type_name = 5;</code>
   * @return The maybeTypeName.
   */
  java.lang.String getMaybeTypeName();
  /**
   * <pre>
   * For debug-only, the name of the type pointed to by this handle, if
   * available.
   * </pre>
   *
   * <code>string maybe_type_name = 5;</code>
   * @return The bytes for maybeTypeName.
   */
  com.google.protobuf.ByteString
      getMaybeTypeNameBytes();

  /**
   * <pre>
   * Data types and shapes for the underlying resource.
   * </pre>
   *
   * <code>repeated .tensorflow.ResourceHandleProto.DtypeAndShape dtypes_and_shapes = 6;</code>
   */
  java.util.List<org.tensorflow.proto.framework.ResourceHandleProto.DtypeAndShape> 
      getDtypesAndShapesList();
  /**
   * <pre>
   * Data types and shapes for the underlying resource.
   * </pre>
   *
   * <code>repeated .tensorflow.ResourceHandleProto.DtypeAndShape dtypes_and_shapes = 6;</code>
   */
  org.tensorflow.proto.framework.ResourceHandleProto.DtypeAndShape getDtypesAndShapes(int index);
  /**
   * <pre>
   * Data types and shapes for the underlying resource.
   * </pre>
   *
   * <code>repeated .tensorflow.ResourceHandleProto.DtypeAndShape dtypes_and_shapes = 6;</code>
   */
  int getDtypesAndShapesCount();
  /**
   * <pre>
   * Data types and shapes for the underlying resource.
   * </pre>
   *
   * <code>repeated .tensorflow.ResourceHandleProto.DtypeAndShape dtypes_and_shapes = 6;</code>
   */
  java.util.List<? extends org.tensorflow.proto.framework.ResourceHandleProto.DtypeAndShapeOrBuilder> 
      getDtypesAndShapesOrBuilderList();
  /**
   * <pre>
   * Data types and shapes for the underlying resource.
   * </pre>
   *
   * <code>repeated .tensorflow.ResourceHandleProto.DtypeAndShape dtypes_and_shapes = 6;</code>
   */
  org.tensorflow.proto.framework.ResourceHandleProto.DtypeAndShapeOrBuilder getDtypesAndShapesOrBuilder(
      int index);
}
