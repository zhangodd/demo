// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow/core/framework/tensor_description.proto

package org.tensorflow.proto;

public final class TensorDescriptionProtos {
  private TensorDescriptionProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_TensorDescription_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_TensorDescription_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n2tensorflow/core/framework/tensor_descr" +
      "iption.proto\022\ntensorflow\0326tensorflow/cor" +
      "e/framework/allocation_description.proto" +
      "\032,tensorflow/core/framework/tensor_shape" +
      ".proto\032%tensorflow/core/framework/types." +
      "proto\"\250\001\n\021TensorDescription\022#\n\005dtype\030\001 \001" +
      "(\0162\024.tensorflow.DataType\022+\n\005shape\030\002 \001(\0132" +
      "\034.tensorflow.TensorShapeProto\022A\n\026allocat" +
      "ion_description\030\004 \001(\0132!.tensorflow.Alloc" +
      "ationDescriptionB\217\001\n\024org.tensorflow.prot" +
      "oB\027TensorDescriptionProtosP\001ZYgithub.com" +
      "/tensorflow/tensorflow/tensorflow/go/cor" +
      "e/framework/tensor_description_go_proto\370" +
      "\001\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          org.tensorflow.proto.AllocationDescriptionProtos.getDescriptor(),
          org.tensorflow.proto.TensorShapeProtos.getDescriptor(),
          org.tensorflow.proto.TypesProtos.getDescriptor(),
        });
    internal_static_tensorflow_TensorDescription_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_tensorflow_TensorDescription_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_TensorDescription_descriptor,
        new java.lang.String[] { "Dtype", "Shape", "AllocationDescription", });
    org.tensorflow.proto.AllocationDescriptionProtos.getDescriptor();
    org.tensorflow.proto.TensorShapeProtos.getDescriptor();
    org.tensorflow.proto.TypesProtos.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
