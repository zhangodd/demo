// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow/core/protobuf/fingerprint.proto

package org.tensorflow.proto;

public final class FingerprintProtos {
  private FingerprintProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_FingerprintDef_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_FingerprintDef_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n*tensorflow/core/protobuf/fingerprint.p" +
      "roto\022\ntensorflow\032(tensorflow/core/framew" +
      "ork/versions.proto\"\315\001\n\016FingerprintDef\022\034\n" +
      "\024saved_model_checksum\030\001 \001(\004\022\036\n\026graph_def" +
      "_program_hash\030\002 \001(\004\022\032\n\022signature_def_has" +
      "h\030\003 \001(\004\022\037\n\027saved_object_graph_hash\030\004 \001(\004" +
      "\022\027\n\017checkpoint_hash\030\005 \001(\004\022\'\n\007version\030\006 \001" +
      "(\0132\026.tensorflow.VersionDefB\205\001\n\024org.tenso" +
      "rflow.protoB\021FingerprintProtosP\001ZUgithub" +
      ".com/tensorflow/tensorflow/tensorflow/go" +
      "/core/protobuf/for_core_protos_go_proto\370" +
      "\001\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          org.tensorflow.proto.VersionsProtos.getDescriptor(),
        });
    internal_static_tensorflow_FingerprintDef_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_tensorflow_FingerprintDef_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_FingerprintDef_descriptor,
        new java.lang.String[] { "SavedModelChecksum", "GraphDefProgramHash", "SignatureDefHash", "SavedObjectGraphHash", "CheckpointHash", "Version", });
    org.tensorflow.proto.VersionsProtos.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}