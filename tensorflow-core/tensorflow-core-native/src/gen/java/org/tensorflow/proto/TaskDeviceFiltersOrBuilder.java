// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow/core/protobuf/device_filters.proto

package org.tensorflow.proto;

public interface TaskDeviceFiltersOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tensorflow.TaskDeviceFilters)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated string device_filters = 1;</code>
   * @return A list containing the deviceFilters.
   */
  java.util.List<java.lang.String>
      getDeviceFiltersList();
  /**
   * <code>repeated string device_filters = 1;</code>
   * @return The count of deviceFilters.
   */
  int getDeviceFiltersCount();
  /**
   * <code>repeated string device_filters = 1;</code>
   * @param index The index of the element to return.
   * @return The deviceFilters at the given index.
   */
  java.lang.String getDeviceFilters(int index);
  /**
   * <code>repeated string device_filters = 1;</code>
   * @param index The index of the value to return.
   * @return The bytes of the deviceFilters at the given index.
   */
  com.google.protobuf.ByteString
      getDeviceFiltersBytes(int index);
}
