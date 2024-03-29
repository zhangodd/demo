// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow/core/framework/kernel_def.proto

package org.tensorflow.proto;

public interface KernelDefOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tensorflow.KernelDef)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Must match the name of an Op.
   * </pre>
   *
   * <code>string op = 1;</code>
   * @return The op.
   */
  java.lang.String getOp();
  /**
   * <pre>
   * Must match the name of an Op.
   * </pre>
   *
   * <code>string op = 1;</code>
   * @return The bytes for op.
   */
  com.google.protobuf.ByteString
      getOpBytes();

  /**
   * <pre>
   * Type of device this kernel runs on.
   * </pre>
   *
   * <code>string device_type = 2;</code>
   * @return The deviceType.
   */
  java.lang.String getDeviceType();
  /**
   * <pre>
   * Type of device this kernel runs on.
   * </pre>
   *
   * <code>string device_type = 2;</code>
   * @return The bytes for deviceType.
   */
  com.google.protobuf.ByteString
      getDeviceTypeBytes();

  /**
   * <code>repeated .tensorflow.KernelDef.AttrConstraint constraint = 3;</code>
   */
  java.util.List<org.tensorflow.proto.KernelDef.AttrConstraint> 
      getConstraintList();
  /**
   * <code>repeated .tensorflow.KernelDef.AttrConstraint constraint = 3;</code>
   */
  org.tensorflow.proto.KernelDef.AttrConstraint getConstraint(int index);
  /**
   * <code>repeated .tensorflow.KernelDef.AttrConstraint constraint = 3;</code>
   */
  int getConstraintCount();
  /**
   * <code>repeated .tensorflow.KernelDef.AttrConstraint constraint = 3;</code>
   */
  java.util.List<? extends org.tensorflow.proto.KernelDef.AttrConstraintOrBuilder> 
      getConstraintOrBuilderList();
  /**
   * <code>repeated .tensorflow.KernelDef.AttrConstraint constraint = 3;</code>
   */
  org.tensorflow.proto.KernelDef.AttrConstraintOrBuilder getConstraintOrBuilder(
      int index);

  /**
   * <pre>
   * Names of the Op's input_/output_args that reside in host memory
   * instead of device memory.
   * </pre>
   *
   * <code>repeated string host_memory_arg = 4;</code>
   * @return A list containing the hostMemoryArg.
   */
  java.util.List<java.lang.String>
      getHostMemoryArgList();
  /**
   * <pre>
   * Names of the Op's input_/output_args that reside in host memory
   * instead of device memory.
   * </pre>
   *
   * <code>repeated string host_memory_arg = 4;</code>
   * @return The count of hostMemoryArg.
   */
  int getHostMemoryArgCount();
  /**
   * <pre>
   * Names of the Op's input_/output_args that reside in host memory
   * instead of device memory.
   * </pre>
   *
   * <code>repeated string host_memory_arg = 4;</code>
   * @param index The index of the element to return.
   * @return The hostMemoryArg at the given index.
   */
  java.lang.String getHostMemoryArg(int index);
  /**
   * <pre>
   * Names of the Op's input_/output_args that reside in host memory
   * instead of device memory.
   * </pre>
   *
   * <code>repeated string host_memory_arg = 4;</code>
   * @param index The index of the value to return.
   * @return The bytes of the hostMemoryArg at the given index.
   */
  com.google.protobuf.ByteString
      getHostMemoryArgBytes(int index);

  /**
   * <pre>
   * This allows experimental kernels to be registered for an op that
   * won't be used unless the user specifies a "_kernel" attr with
   * value matching this.
   * </pre>
   *
   * <code>string label = 5;</code>
   * @return The label.
   */
  java.lang.String getLabel();
  /**
   * <pre>
   * This allows experimental kernels to be registered for an op that
   * won't be used unless the user specifies a "_kernel" attr with
   * value matching this.
   * </pre>
   *
   * <code>string label = 5;</code>
   * @return The bytes for label.
   */
  com.google.protobuf.ByteString
      getLabelBytes();

  /**
   * <pre>
   * Prioritization of kernel amongst different devices. By default we assume
   * priority is 0. The higher the priority the better. By default (i.e. if
   * this is not set), we prefer GPU kernels over CPU.
   * </pre>
   *
   * <code>int32 priority = 6;</code>
   * @return The priority.
   */
  int getPriority();
}
