// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow/core/protobuf/core_platform_payloads.proto

package org.tensorflow.proto.core.platform;

public final class CorePlatformPayloads {
  private CorePlatformPayloads() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ErrorSourceProtoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:tensorflow.core.platform.ErrorSourceProto)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.tensorflow.core.platform.ErrorSourceProto.ErrorSource error_source = 1;</code>
     * @return The enum numeric value on the wire for errorSource.
     */
    int getErrorSourceValue();
    /**
     * <code>.tensorflow.core.platform.ErrorSourceProto.ErrorSource error_source = 1;</code>
     * @return The errorSource.
     */
    org.tensorflow.proto.core.platform.CorePlatformPayloads.ErrorSourceProto.ErrorSource getErrorSource();
  }
  /**
   * <pre>
   * If included as a payload, this message contains the error source information
   * where the error was raised.
   * URI: "type.googleapis.com/tensorflow.core.platform.ErrorSourceProto"
   * </pre>
   *
   * Protobuf type {@code tensorflow.core.platform.ErrorSourceProto}
   */
  public static final class ErrorSourceProto extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:tensorflow.core.platform.ErrorSourceProto)
      ErrorSourceProtoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ErrorSourceProto.newBuilder() to construct.
    private ErrorSourceProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ErrorSourceProto() {
      errorSource_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ErrorSourceProto();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.tensorflow.proto.core.platform.CorePlatformPayloads.internal_static_tensorflow_core_platform_ErrorSourceProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.tensorflow.proto.core.platform.CorePlatformPayloads.internal_static_tensorflow_core_platform_ErrorSourceProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.tensorflow.proto.core.platform.CorePlatformPayloads.ErrorSourceProto.class, org.tensorflow.proto.core.platform.CorePlatformPayloads.ErrorSourceProto.Builder.class);
    }

    /**
     * Protobuf enum {@code tensorflow.core.platform.ErrorSourceProto.ErrorSource}
     */
    public enum ErrorSource
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>UNKNOWN = 0;</code>
       */
      UNKNOWN(0),
      /**
       * <code>TPU_COMPILE_OP = 1;</code>
       */
      TPU_COMPILE_OP(1),
      /**
       * <pre>
       * Old bridge.
       * </pre>
       *
       * <code>TF_XLA_BRIDGE = 2;</code>
       */
      TF_XLA_BRIDGE(2),
      /**
       * <pre>
       * TPUBridge.
       * </pre>
       *
       * <code>MLIR_BRIDGE_PHASE_1 = 3;</code>
       */
      MLIR_BRIDGE_PHASE_1(3),
      /**
       * <pre>
       * LegalizeToHlo.
       * </pre>
       *
       * <code>MLIR_BRIDGE_PHASE_2 = 4;</code>
       */
      MLIR_BRIDGE_PHASE_2(4),
      /**
       * <pre>
       * eager::RemoteMgr.
       * </pre>
       *
       * <code>EAGER_REMOTE_MGR = 5;</code>
       */
      EAGER_REMOTE_MGR(5),
      UNRECOGNIZED(-1),
      ;

      /**
       * <code>UNKNOWN = 0;</code>
       */
      public static final int UNKNOWN_VALUE = 0;
      /**
       * <code>TPU_COMPILE_OP = 1;</code>
       */
      public static final int TPU_COMPILE_OP_VALUE = 1;
      /**
       * <pre>
       * Old bridge.
       * </pre>
       *
       * <code>TF_XLA_BRIDGE = 2;</code>
       */
      public static final int TF_XLA_BRIDGE_VALUE = 2;
      /**
       * <pre>
       * TPUBridge.
       * </pre>
       *
       * <code>MLIR_BRIDGE_PHASE_1 = 3;</code>
       */
      public static final int MLIR_BRIDGE_PHASE_1_VALUE = 3;
      /**
       * <pre>
       * LegalizeToHlo.
       * </pre>
       *
       * <code>MLIR_BRIDGE_PHASE_2 = 4;</code>
       */
      public static final int MLIR_BRIDGE_PHASE_2_VALUE = 4;
      /**
       * <pre>
       * eager::RemoteMgr.
       * </pre>
       *
       * <code>EAGER_REMOTE_MGR = 5;</code>
       */
      public static final int EAGER_REMOTE_MGR_VALUE = 5;


      public final int getNumber() {
        if (this == UNRECOGNIZED) {
          throw new java.lang.IllegalArgumentException(
              "Can't get the number of an unknown enum value.");
        }
        return value;
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       * @deprecated Use {@link #forNumber(int)} instead.
       */
      @java.lang.Deprecated
      public static ErrorSource valueOf(int value) {
        return forNumber(value);
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       */
      public static ErrorSource forNumber(int value) {
        switch (value) {
          case 0: return UNKNOWN;
          case 1: return TPU_COMPILE_OP;
          case 2: return TF_XLA_BRIDGE;
          case 3: return MLIR_BRIDGE_PHASE_1;
          case 4: return MLIR_BRIDGE_PHASE_2;
          case 5: return EAGER_REMOTE_MGR;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<ErrorSource>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          ErrorSource> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<ErrorSource>() {
              public ErrorSource findValueByNumber(int number) {
                return ErrorSource.forNumber(number);
              }
            };

      public final com.google.protobuf.Descriptors.EnumValueDescriptor
          getValueDescriptor() {
        if (this == UNRECOGNIZED) {
          throw new java.lang.IllegalStateException(
              "Can't get the descriptor of an unrecognized enum value.");
        }
        return getDescriptor().getValues().get(ordinal());
      }
      public final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptorForType() {
        return getDescriptor();
      }
      public static final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptor() {
        return org.tensorflow.proto.core.platform.CorePlatformPayloads.ErrorSourceProto.getDescriptor().getEnumTypes().get(0);
      }

      private static final ErrorSource[] VALUES = values();

      public static ErrorSource valueOf(
          com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
        if (desc.getType() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException(
            "EnumValueDescriptor is not for this type.");
        }
        if (desc.getIndex() == -1) {
          return UNRECOGNIZED;
        }
        return VALUES[desc.getIndex()];
      }

      private final int value;

      private ErrorSource(int value) {
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:tensorflow.core.platform.ErrorSourceProto.ErrorSource)
    }

    public static final int ERROR_SOURCE_FIELD_NUMBER = 1;
    private int errorSource_;
    /**
     * <code>.tensorflow.core.platform.ErrorSourceProto.ErrorSource error_source = 1;</code>
     * @return The enum numeric value on the wire for errorSource.
     */
    @java.lang.Override public int getErrorSourceValue() {
      return errorSource_;
    }
    /**
     * <code>.tensorflow.core.platform.ErrorSourceProto.ErrorSource error_source = 1;</code>
     * @return The errorSource.
     */
    @java.lang.Override public org.tensorflow.proto.core.platform.CorePlatformPayloads.ErrorSourceProto.ErrorSource getErrorSource() {
      @SuppressWarnings("deprecation")
      org.tensorflow.proto.core.platform.CorePlatformPayloads.ErrorSourceProto.ErrorSource result = org.tensorflow.proto.core.platform.CorePlatformPayloads.ErrorSourceProto.ErrorSource.valueOf(errorSource_);
      return result == null ? org.tensorflow.proto.core.platform.CorePlatformPayloads.ErrorSourceProto.ErrorSource.UNRECOGNIZED : result;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (errorSource_ != org.tensorflow.proto.core.platform.CorePlatformPayloads.ErrorSourceProto.ErrorSource.UNKNOWN.getNumber()) {
        output.writeEnum(1, errorSource_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (errorSource_ != org.tensorflow.proto.core.platform.CorePlatformPayloads.ErrorSourceProto.ErrorSource.UNKNOWN.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(1, errorSource_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof org.tensorflow.proto.core.platform.CorePlatformPayloads.ErrorSourceProto)) {
        return super.equals(obj);
      }
      org.tensorflow.proto.core.platform.CorePlatformPayloads.ErrorSourceProto other = (org.tensorflow.proto.core.platform.CorePlatformPayloads.ErrorSourceProto) obj;

      if (errorSource_ != other.errorSource_) return false;
      if (!getUnknownFields().equals(other.getUnknownFields())) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + ERROR_SOURCE_FIELD_NUMBER;
      hash = (53 * hash) + errorSource_;
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.tensorflow.proto.core.platform.CorePlatformPayloads.ErrorSourceProto parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.tensorflow.proto.core.platform.CorePlatformPayloads.ErrorSourceProto parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.tensorflow.proto.core.platform.CorePlatformPayloads.ErrorSourceProto parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.tensorflow.proto.core.platform.CorePlatformPayloads.ErrorSourceProto parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.tensorflow.proto.core.platform.CorePlatformPayloads.ErrorSourceProto parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.tensorflow.proto.core.platform.CorePlatformPayloads.ErrorSourceProto parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.tensorflow.proto.core.platform.CorePlatformPayloads.ErrorSourceProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.tensorflow.proto.core.platform.CorePlatformPayloads.ErrorSourceProto parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.tensorflow.proto.core.platform.CorePlatformPayloads.ErrorSourceProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.tensorflow.proto.core.platform.CorePlatformPayloads.ErrorSourceProto parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.tensorflow.proto.core.platform.CorePlatformPayloads.ErrorSourceProto parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.tensorflow.proto.core.platform.CorePlatformPayloads.ErrorSourceProto parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(org.tensorflow.proto.core.platform.CorePlatformPayloads.ErrorSourceProto prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <pre>
     * If included as a payload, this message contains the error source information
     * where the error was raised.
     * URI: "type.googleapis.com/tensorflow.core.platform.ErrorSourceProto"
     * </pre>
     *
     * Protobuf type {@code tensorflow.core.platform.ErrorSourceProto}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:tensorflow.core.platform.ErrorSourceProto)
        org.tensorflow.proto.core.platform.CorePlatformPayloads.ErrorSourceProtoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.tensorflow.proto.core.platform.CorePlatformPayloads.internal_static_tensorflow_core_platform_ErrorSourceProto_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.tensorflow.proto.core.platform.CorePlatformPayloads.internal_static_tensorflow_core_platform_ErrorSourceProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.tensorflow.proto.core.platform.CorePlatformPayloads.ErrorSourceProto.class, org.tensorflow.proto.core.platform.CorePlatformPayloads.ErrorSourceProto.Builder.class);
      }

      // Construct using org.tensorflow.proto.core.platform.CorePlatformPayloads.ErrorSourceProto.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        errorSource_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.tensorflow.proto.core.platform.CorePlatformPayloads.internal_static_tensorflow_core_platform_ErrorSourceProto_descriptor;
      }

      @java.lang.Override
      public org.tensorflow.proto.core.platform.CorePlatformPayloads.ErrorSourceProto getDefaultInstanceForType() {
        return org.tensorflow.proto.core.platform.CorePlatformPayloads.ErrorSourceProto.getDefaultInstance();
      }

      @java.lang.Override
      public org.tensorflow.proto.core.platform.CorePlatformPayloads.ErrorSourceProto build() {
        org.tensorflow.proto.core.platform.CorePlatformPayloads.ErrorSourceProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.tensorflow.proto.core.platform.CorePlatformPayloads.ErrorSourceProto buildPartial() {
        org.tensorflow.proto.core.platform.CorePlatformPayloads.ErrorSourceProto result = new org.tensorflow.proto.core.platform.CorePlatformPayloads.ErrorSourceProto(this);
        result.errorSource_ = errorSource_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof org.tensorflow.proto.core.platform.CorePlatformPayloads.ErrorSourceProto) {
          return mergeFrom((org.tensorflow.proto.core.platform.CorePlatformPayloads.ErrorSourceProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.tensorflow.proto.core.platform.CorePlatformPayloads.ErrorSourceProto other) {
        if (other == org.tensorflow.proto.core.platform.CorePlatformPayloads.ErrorSourceProto.getDefaultInstance()) return this;
        if (other.errorSource_ != 0) {
          setErrorSourceValue(other.getErrorSourceValue());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        if (extensionRegistry == null) {
          throw new java.lang.NullPointerException();
        }
        try {
          boolean done = false;
          while (!done) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                done = true;
                break;
              case 8: {
                errorSource_ = input.readEnum();

                break;
              } // case 8
              default: {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
            } // switch (tag)
          } // while (!done)
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.unwrapIOException();
        } finally {
          onChanged();
        } // finally
        return this;
      }

      private int errorSource_ = 0;
      /**
       * <code>.tensorflow.core.platform.ErrorSourceProto.ErrorSource error_source = 1;</code>
       * @return The enum numeric value on the wire for errorSource.
       */
      @java.lang.Override public int getErrorSourceValue() {
        return errorSource_;
      }
      /**
       * <code>.tensorflow.core.platform.ErrorSourceProto.ErrorSource error_source = 1;</code>
       * @param value The enum numeric value on the wire for errorSource to set.
       * @return This builder for chaining.
       */
      public Builder setErrorSourceValue(int value) {
        
        errorSource_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.tensorflow.core.platform.ErrorSourceProto.ErrorSource error_source = 1;</code>
       * @return The errorSource.
       */
      @java.lang.Override
      public org.tensorflow.proto.core.platform.CorePlatformPayloads.ErrorSourceProto.ErrorSource getErrorSource() {
        @SuppressWarnings("deprecation")
        org.tensorflow.proto.core.platform.CorePlatformPayloads.ErrorSourceProto.ErrorSource result = org.tensorflow.proto.core.platform.CorePlatformPayloads.ErrorSourceProto.ErrorSource.valueOf(errorSource_);
        return result == null ? org.tensorflow.proto.core.platform.CorePlatformPayloads.ErrorSourceProto.ErrorSource.UNRECOGNIZED : result;
      }
      /**
       * <code>.tensorflow.core.platform.ErrorSourceProto.ErrorSource error_source = 1;</code>
       * @param value The errorSource to set.
       * @return This builder for chaining.
       */
      public Builder setErrorSource(org.tensorflow.proto.core.platform.CorePlatformPayloads.ErrorSourceProto.ErrorSource value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        errorSource_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.tensorflow.core.platform.ErrorSourceProto.ErrorSource error_source = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearErrorSource() {
        
        errorSource_ = 0;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:tensorflow.core.platform.ErrorSourceProto)
    }

    // @@protoc_insertion_point(class_scope:tensorflow.core.platform.ErrorSourceProto)
    private static final org.tensorflow.proto.core.platform.CorePlatformPayloads.ErrorSourceProto DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.tensorflow.proto.core.platform.CorePlatformPayloads.ErrorSourceProto();
    }

    public static org.tensorflow.proto.core.platform.CorePlatformPayloads.ErrorSourceProto getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ErrorSourceProto>
        PARSER = new com.google.protobuf.AbstractParser<ErrorSourceProto>() {
      @java.lang.Override
      public ErrorSourceProto parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        Builder builder = newBuilder();
        try {
          builder.mergeFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.setUnfinishedMessage(builder.buildPartial());
        } catch (com.google.protobuf.UninitializedMessageException e) {
          throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
        } catch (java.io.IOException e) {
          throw new com.google.protobuf.InvalidProtocolBufferException(e)
              .setUnfinishedMessage(builder.buildPartial());
        }
        return builder.buildPartial();
      }
    };

    public static com.google.protobuf.Parser<ErrorSourceProto> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ErrorSourceProto> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.tensorflow.proto.core.platform.CorePlatformPayloads.ErrorSourceProto getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_core_platform_ErrorSourceProto_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_core_platform_ErrorSourceProto_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n5tensorflow/core/protobuf/core_platform" +
      "_payloads.proto\022\030tensorflow.core.platfor" +
      "m\"\354\001\n\020ErrorSourceProto\022L\n\014error_source\030\001" +
      " \001(\01626.tensorflow.core.platform.ErrorSou" +
      "rceProto.ErrorSource\"\211\001\n\013ErrorSource\022\013\n\007" +
      "UNKNOWN\020\000\022\022\n\016TPU_COMPILE_OP\020\001\022\021\n\rTF_XLA_" +
      "BRIDGE\020\002\022\027\n\023MLIR_BRIDGE_PHASE_1\020\003\022\027\n\023MLI" +
      "R_BRIDGE_PHASE_2\020\004\022\024\n\020EAGER_REMOTE_MGR\020\005" +
      "B~\n\"org.tensorflow.proto.core.platformZU" +
      "github.com/tensorflow/tensorflow/tensorf" +
      "low/go/core/protobuf/for_core_protos_go_" +
      "proto\370\001\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_tensorflow_core_platform_ErrorSourceProto_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_tensorflow_core_platform_ErrorSourceProto_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_core_platform_ErrorSourceProto_descriptor,
        new java.lang.String[] { "ErrorSource", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
