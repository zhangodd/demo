// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow/core/framework/function.proto

package org.tensorflow.proto;

public interface RegisteredGradientOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tensorflow.RegisteredGradient)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The gradient function's name.
   * </pre>
   *
   * <code>string gradient_func = 1;</code>
   * @return The gradientFunc.
   */
  java.lang.String getGradientFunc();
  /**
   * <pre>
   * The gradient function's name.
   * </pre>
   *
   * <code>string gradient_func = 1;</code>
   * @return The bytes for gradientFunc.
   */
  com.google.protobuf.ByteString
      getGradientFuncBytes();

  /**
   * <pre>
   * The gradient function's registered op type.
   * </pre>
   *
   * <code>string registered_op_type = 2;</code>
   * @return The registeredOpType.
   */
  java.lang.String getRegisteredOpType();
  /**
   * <pre>
   * The gradient function's registered op type.
   * </pre>
   *
   * <code>string registered_op_type = 2;</code>
   * @return The bytes for registeredOpType.
   */
  com.google.protobuf.ByteString
      getRegisteredOpTypeBytes();
}
