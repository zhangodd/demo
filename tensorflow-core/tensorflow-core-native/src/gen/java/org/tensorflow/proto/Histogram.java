// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tsl/protobuf/histogram.proto

package org.tensorflow.proto;

public final class Histogram {
  private Histogram() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_HistogramProto_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_HistogramProto_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034tsl/protobuf/histogram.proto\022\ntensorfl" +
      "ow\"\207\001\n\016HistogramProto\022\013\n\003min\030\001 \001(\001\022\013\n\003ma" +
      "x\030\002 \001(\001\022\013\n\003num\030\003 \001(\001\022\013\n\003sum\030\004 \001(\001\022\023\n\013sum" +
      "_squares\030\005 \001(\001\022\030\n\014bucket_limit\030\006 \003(\001B\002\020\001" +
      "\022\022\n\006bucket\030\007 \003(\001B\002\020\001BX\n\024org.tensorflow.p" +
      "rotoP\001Z;github.com/google/tsl/tsl/go/cor" +
      "e/protobuf/summary_go_proto\370\001\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_tensorflow_HistogramProto_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_tensorflow_HistogramProto_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_HistogramProto_descriptor,
        new java.lang.String[] { "Min", "Max", "Num", "Sum", "SumSquares", "BucketLimit", "Bucket", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}