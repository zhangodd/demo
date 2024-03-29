// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow/core/framework/graph_transfer_info.proto

package org.tensorflow.proto;

public interface GraphTransferNodeOutputInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tensorflow.GraphTransferNodeOutputInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 node_id = 1;</code>
   * @return The nodeId.
   */
  int getNodeId();

  /**
   * <code>repeated int32 max_byte_size = 2;</code>
   * @return A list containing the maxByteSize.
   */
  java.util.List<java.lang.Integer> getMaxByteSizeList();
  /**
   * <code>repeated int32 max_byte_size = 2;</code>
   * @return The count of maxByteSize.
   */
  int getMaxByteSizeCount();
  /**
   * <code>repeated int32 max_byte_size = 2;</code>
   * @param index The index of the element to return.
   * @return The maxByteSize at the given index.
   */
  int getMaxByteSize(int index);
}
