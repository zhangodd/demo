// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow/core/framework/variable.proto

package org.tensorflow.proto;

public final class VariableProtos {
  private VariableProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_VariableDef_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_VariableDef_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_SaveSliceInfoDef_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_SaveSliceInfoDef_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n(tensorflow/core/framework/variable.pro" +
      "to\022\ntensorflow\"\310\002\n\013VariableDef\022\025\n\rvariab" +
      "le_name\030\001 \001(\t\022\032\n\022initial_value_name\030\006 \001(" +
      "\t\022\030\n\020initializer_name\030\002 \001(\t\022\025\n\rsnapshot_" +
      "name\030\003 \001(\t\0229\n\023save_slice_info_def\030\004 \001(\0132" +
      "\034.tensorflow.SaveSliceInfoDef\022\023\n\013is_reso" +
      "urce\030\005 \001(\010\022\021\n\ttrainable\030\007 \001(\010\022<\n\017synchro" +
      "nization\030\010 \001(\0162#.tensorflow.VariableSync" +
      "hronization\0224\n\013aggregation\030\t \001(\0162\037.tenso" +
      "rflow.VariableAggregation\"`\n\020SaveSliceIn" +
      "foDef\022\021\n\tfull_name\030\001 \001(\t\022\022\n\nfull_shape\030\002" +
      " \003(\003\022\022\n\nvar_offset\030\003 \003(\003\022\021\n\tvar_shape\030\004 " +
      "\003(\003*\254\001\n\027VariableSynchronization\022!\n\035VARIA" +
      "BLE_SYNCHRONIZATION_AUTO\020\000\022!\n\035VARIABLE_S" +
      "YNCHRONIZATION_NONE\020\001\022%\n!VARIABLE_SYNCHR" +
      "ONIZATION_ON_WRITE\020\002\022$\n VARIABLE_SYNCHRO" +
      "NIZATION_ON_READ\020\003*\236\001\n\023VariableAggregati" +
      "on\022\035\n\031VARIABLE_AGGREGATION_NONE\020\000\022\034\n\030VAR" +
      "IABLE_AGGREGATION_SUM\020\001\022\035\n\031VARIABLE_AGGR" +
      "EGATION_MEAN\020\002\022+\n\'VARIABLE_AGGREGATION_O" +
      "NLY_FIRST_REPLICA\020\003B|\n\024org.tensorflow.pr" +
      "otoB\016VariableProtosP\001ZOgithub.com/tensor" +
      "flow/tensorflow/tensorflow/go/core/frame" +
      "work/variable_go_proto\370\001\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_tensorflow_VariableDef_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_tensorflow_VariableDef_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_VariableDef_descriptor,
        new java.lang.String[] { "VariableName", "InitialValueName", "InitializerName", "SnapshotName", "SaveSliceInfoDef", "IsResource", "Trainable", "Synchronization", "Aggregation", });
    internal_static_tensorflow_SaveSliceInfoDef_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_tensorflow_SaveSliceInfoDef_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_SaveSliceInfoDef_descriptor,
        new java.lang.String[] { "FullName", "FullShape", "VarOffset", "VarShape", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
