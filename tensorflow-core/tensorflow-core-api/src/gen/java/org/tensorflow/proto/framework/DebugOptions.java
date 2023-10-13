// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow/core/protobuf/debug.proto

package org.tensorflow.proto.framework;

/**
 * <pre>
 * Options for initializing DebuggerState in TensorFlow Debugger (tfdbg).
 * </pre>
 *
 * Protobuf type {@code tensorflow.DebugOptions}
 */
public final class DebugOptions extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:tensorflow.DebugOptions)
    DebugOptionsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DebugOptions.newBuilder() to construct.
  private DebugOptions(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DebugOptions() {
    debugTensorWatchOpts_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DebugOptions();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.tensorflow.proto.framework.DebugProtos.internal_static_tensorflow_DebugOptions_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.tensorflow.proto.framework.DebugProtos.internal_static_tensorflow_DebugOptions_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.tensorflow.proto.framework.DebugOptions.class, org.tensorflow.proto.framework.DebugOptions.Builder.class);
  }

  public static final int DEBUG_TENSOR_WATCH_OPTS_FIELD_NUMBER = 4;
  private java.util.List<org.tensorflow.proto.framework.DebugTensorWatch> debugTensorWatchOpts_;
  /**
   * <pre>
   * Debugging options
   * </pre>
   *
   * <code>repeated .tensorflow.DebugTensorWatch debug_tensor_watch_opts = 4;</code>
   */
  @java.lang.Override
  public java.util.List<org.tensorflow.proto.framework.DebugTensorWatch> getDebugTensorWatchOptsList() {
    return debugTensorWatchOpts_;
  }
  /**
   * <pre>
   * Debugging options
   * </pre>
   *
   * <code>repeated .tensorflow.DebugTensorWatch debug_tensor_watch_opts = 4;</code>
   */
  @java.lang.Override
  public java.util.List<? extends org.tensorflow.proto.framework.DebugTensorWatchOrBuilder> 
      getDebugTensorWatchOptsOrBuilderList() {
    return debugTensorWatchOpts_;
  }
  /**
   * <pre>
   * Debugging options
   * </pre>
   *
   * <code>repeated .tensorflow.DebugTensorWatch debug_tensor_watch_opts = 4;</code>
   */
  @java.lang.Override
  public int getDebugTensorWatchOptsCount() {
    return debugTensorWatchOpts_.size();
  }
  /**
   * <pre>
   * Debugging options
   * </pre>
   *
   * <code>repeated .tensorflow.DebugTensorWatch debug_tensor_watch_opts = 4;</code>
   */
  @java.lang.Override
  public org.tensorflow.proto.framework.DebugTensorWatch getDebugTensorWatchOpts(int index) {
    return debugTensorWatchOpts_.get(index);
  }
  /**
   * <pre>
   * Debugging options
   * </pre>
   *
   * <code>repeated .tensorflow.DebugTensorWatch debug_tensor_watch_opts = 4;</code>
   */
  @java.lang.Override
  public org.tensorflow.proto.framework.DebugTensorWatchOrBuilder getDebugTensorWatchOptsOrBuilder(
      int index) {
    return debugTensorWatchOpts_.get(index);
  }

  public static final int GLOBAL_STEP_FIELD_NUMBER = 10;
  private long globalStep_;
  /**
   * <pre>
   * Caller-specified global step count.
   * Note that this is distinct from the session run count and the executor
   * step count.
   * </pre>
   *
   * <code>int64 global_step = 10;</code>
   * @return The globalStep.
   */
  @java.lang.Override
  public long getGlobalStep() {
    return globalStep_;
  }

  public static final int RESET_DISK_BYTE_USAGE_FIELD_NUMBER = 11;
  private boolean resetDiskByteUsage_;
  /**
   * <pre>
   * Whether the total disk usage of tfdbg is to be reset to zero
   * in this Session.run call. This is used by wrappers and hooks
   * such as the local CLI ones to indicate that the dumped tensors
   * are cleaned up from the disk after each Session.run.
   * </pre>
   *
   * <code>bool reset_disk_byte_usage = 11;</code>
   * @return The resetDiskByteUsage.
   */
  @java.lang.Override
  public boolean getResetDiskByteUsage() {
    return resetDiskByteUsage_;
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
    for (int i = 0; i < debugTensorWatchOpts_.size(); i++) {
      output.writeMessage(4, debugTensorWatchOpts_.get(i));
    }
    if (globalStep_ != 0L) {
      output.writeInt64(10, globalStep_);
    }
    if (resetDiskByteUsage_ != false) {
      output.writeBool(11, resetDiskByteUsage_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < debugTensorWatchOpts_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, debugTensorWatchOpts_.get(i));
    }
    if (globalStep_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(10, globalStep_);
    }
    if (resetDiskByteUsage_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(11, resetDiskByteUsage_);
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
    if (!(obj instanceof org.tensorflow.proto.framework.DebugOptions)) {
      return super.equals(obj);
    }
    org.tensorflow.proto.framework.DebugOptions other = (org.tensorflow.proto.framework.DebugOptions) obj;

    if (!getDebugTensorWatchOptsList()
        .equals(other.getDebugTensorWatchOptsList())) return false;
    if (getGlobalStep()
        != other.getGlobalStep()) return false;
    if (getResetDiskByteUsage()
        != other.getResetDiskByteUsage()) return false;
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
    if (getDebugTensorWatchOptsCount() > 0) {
      hash = (37 * hash) + DEBUG_TENSOR_WATCH_OPTS_FIELD_NUMBER;
      hash = (53 * hash) + getDebugTensorWatchOptsList().hashCode();
    }
    hash = (37 * hash) + GLOBAL_STEP_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getGlobalStep());
    hash = (37 * hash) + RESET_DISK_BYTE_USAGE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getResetDiskByteUsage());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.tensorflow.proto.framework.DebugOptions parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.proto.framework.DebugOptions parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.proto.framework.DebugOptions parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.proto.framework.DebugOptions parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.proto.framework.DebugOptions parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.proto.framework.DebugOptions parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.proto.framework.DebugOptions parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tensorflow.proto.framework.DebugOptions parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tensorflow.proto.framework.DebugOptions parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.tensorflow.proto.framework.DebugOptions parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tensorflow.proto.framework.DebugOptions parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tensorflow.proto.framework.DebugOptions parseFrom(
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
  public static Builder newBuilder(org.tensorflow.proto.framework.DebugOptions prototype) {
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
   * Options for initializing DebuggerState in TensorFlow Debugger (tfdbg).
   * </pre>
   *
   * Protobuf type {@code tensorflow.DebugOptions}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:tensorflow.DebugOptions)
      org.tensorflow.proto.framework.DebugOptionsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.tensorflow.proto.framework.DebugProtos.internal_static_tensorflow_DebugOptions_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.tensorflow.proto.framework.DebugProtos.internal_static_tensorflow_DebugOptions_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.tensorflow.proto.framework.DebugOptions.class, org.tensorflow.proto.framework.DebugOptions.Builder.class);
    }

    // Construct using org.tensorflow.proto.framework.DebugOptions.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (debugTensorWatchOptsBuilder_ == null) {
        debugTensorWatchOpts_ = java.util.Collections.emptyList();
      } else {
        debugTensorWatchOpts_ = null;
        debugTensorWatchOptsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      globalStep_ = 0L;

      resetDiskByteUsage_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.tensorflow.proto.framework.DebugProtos.internal_static_tensorflow_DebugOptions_descriptor;
    }

    @java.lang.Override
    public org.tensorflow.proto.framework.DebugOptions getDefaultInstanceForType() {
      return org.tensorflow.proto.framework.DebugOptions.getDefaultInstance();
    }

    @java.lang.Override
    public org.tensorflow.proto.framework.DebugOptions build() {
      org.tensorflow.proto.framework.DebugOptions result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.tensorflow.proto.framework.DebugOptions buildPartial() {
      org.tensorflow.proto.framework.DebugOptions result = new org.tensorflow.proto.framework.DebugOptions(this);
      int from_bitField0_ = bitField0_;
      if (debugTensorWatchOptsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          debugTensorWatchOpts_ = java.util.Collections.unmodifiableList(debugTensorWatchOpts_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.debugTensorWatchOpts_ = debugTensorWatchOpts_;
      } else {
        result.debugTensorWatchOpts_ = debugTensorWatchOptsBuilder_.build();
      }
      result.globalStep_ = globalStep_;
      result.resetDiskByteUsage_ = resetDiskByteUsage_;
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
      if (other instanceof org.tensorflow.proto.framework.DebugOptions) {
        return mergeFrom((org.tensorflow.proto.framework.DebugOptions)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.tensorflow.proto.framework.DebugOptions other) {
      if (other == org.tensorflow.proto.framework.DebugOptions.getDefaultInstance()) return this;
      if (debugTensorWatchOptsBuilder_ == null) {
        if (!other.debugTensorWatchOpts_.isEmpty()) {
          if (debugTensorWatchOpts_.isEmpty()) {
            debugTensorWatchOpts_ = other.debugTensorWatchOpts_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureDebugTensorWatchOptsIsMutable();
            debugTensorWatchOpts_.addAll(other.debugTensorWatchOpts_);
          }
          onChanged();
        }
      } else {
        if (!other.debugTensorWatchOpts_.isEmpty()) {
          if (debugTensorWatchOptsBuilder_.isEmpty()) {
            debugTensorWatchOptsBuilder_.dispose();
            debugTensorWatchOptsBuilder_ = null;
            debugTensorWatchOpts_ = other.debugTensorWatchOpts_;
            bitField0_ = (bitField0_ & ~0x00000001);
            debugTensorWatchOptsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getDebugTensorWatchOptsFieldBuilder() : null;
          } else {
            debugTensorWatchOptsBuilder_.addAllMessages(other.debugTensorWatchOpts_);
          }
        }
      }
      if (other.getGlobalStep() != 0L) {
        setGlobalStep(other.getGlobalStep());
      }
      if (other.getResetDiskByteUsage() != false) {
        setResetDiskByteUsage(other.getResetDiskByteUsage());
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
            case 34: {
              org.tensorflow.proto.framework.DebugTensorWatch m =
                  input.readMessage(
                      org.tensorflow.proto.framework.DebugTensorWatch.parser(),
                      extensionRegistry);
              if (debugTensorWatchOptsBuilder_ == null) {
                ensureDebugTensorWatchOptsIsMutable();
                debugTensorWatchOpts_.add(m);
              } else {
                debugTensorWatchOptsBuilder_.addMessage(m);
              }
              break;
            } // case 34
            case 80: {
              globalStep_ = input.readInt64();

              break;
            } // case 80
            case 88: {
              resetDiskByteUsage_ = input.readBool();

              break;
            } // case 88
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
    private int bitField0_;

    private java.util.List<org.tensorflow.proto.framework.DebugTensorWatch> debugTensorWatchOpts_ =
      java.util.Collections.emptyList();
    private void ensureDebugTensorWatchOptsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        debugTensorWatchOpts_ = new java.util.ArrayList<org.tensorflow.proto.framework.DebugTensorWatch>(debugTensorWatchOpts_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.tensorflow.proto.framework.DebugTensorWatch, org.tensorflow.proto.framework.DebugTensorWatch.Builder, org.tensorflow.proto.framework.DebugTensorWatchOrBuilder> debugTensorWatchOptsBuilder_;

    /**
     * <pre>
     * Debugging options
     * </pre>
     *
     * <code>repeated .tensorflow.DebugTensorWatch debug_tensor_watch_opts = 4;</code>
     */
    public java.util.List<org.tensorflow.proto.framework.DebugTensorWatch> getDebugTensorWatchOptsList() {
      if (debugTensorWatchOptsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(debugTensorWatchOpts_);
      } else {
        return debugTensorWatchOptsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * Debugging options
     * </pre>
     *
     * <code>repeated .tensorflow.DebugTensorWatch debug_tensor_watch_opts = 4;</code>
     */
    public int getDebugTensorWatchOptsCount() {
      if (debugTensorWatchOptsBuilder_ == null) {
        return debugTensorWatchOpts_.size();
      } else {
        return debugTensorWatchOptsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * Debugging options
     * </pre>
     *
     * <code>repeated .tensorflow.DebugTensorWatch debug_tensor_watch_opts = 4;</code>
     */
    public org.tensorflow.proto.framework.DebugTensorWatch getDebugTensorWatchOpts(int index) {
      if (debugTensorWatchOptsBuilder_ == null) {
        return debugTensorWatchOpts_.get(index);
      } else {
        return debugTensorWatchOptsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * Debugging options
     * </pre>
     *
     * <code>repeated .tensorflow.DebugTensorWatch debug_tensor_watch_opts = 4;</code>
     */
    public Builder setDebugTensorWatchOpts(
        int index, org.tensorflow.proto.framework.DebugTensorWatch value) {
      if (debugTensorWatchOptsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDebugTensorWatchOptsIsMutable();
        debugTensorWatchOpts_.set(index, value);
        onChanged();
      } else {
        debugTensorWatchOptsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Debugging options
     * </pre>
     *
     * <code>repeated .tensorflow.DebugTensorWatch debug_tensor_watch_opts = 4;</code>
     */
    public Builder setDebugTensorWatchOpts(
        int index, org.tensorflow.proto.framework.DebugTensorWatch.Builder builderForValue) {
      if (debugTensorWatchOptsBuilder_ == null) {
        ensureDebugTensorWatchOptsIsMutable();
        debugTensorWatchOpts_.set(index, builderForValue.build());
        onChanged();
      } else {
        debugTensorWatchOptsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Debugging options
     * </pre>
     *
     * <code>repeated .tensorflow.DebugTensorWatch debug_tensor_watch_opts = 4;</code>
     */
    public Builder addDebugTensorWatchOpts(org.tensorflow.proto.framework.DebugTensorWatch value) {
      if (debugTensorWatchOptsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDebugTensorWatchOptsIsMutable();
        debugTensorWatchOpts_.add(value);
        onChanged();
      } else {
        debugTensorWatchOptsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * Debugging options
     * </pre>
     *
     * <code>repeated .tensorflow.DebugTensorWatch debug_tensor_watch_opts = 4;</code>
     */
    public Builder addDebugTensorWatchOpts(
        int index, org.tensorflow.proto.framework.DebugTensorWatch value) {
      if (debugTensorWatchOptsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDebugTensorWatchOptsIsMutable();
        debugTensorWatchOpts_.add(index, value);
        onChanged();
      } else {
        debugTensorWatchOptsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Debugging options
     * </pre>
     *
     * <code>repeated .tensorflow.DebugTensorWatch debug_tensor_watch_opts = 4;</code>
     */
    public Builder addDebugTensorWatchOpts(
        org.tensorflow.proto.framework.DebugTensorWatch.Builder builderForValue) {
      if (debugTensorWatchOptsBuilder_ == null) {
        ensureDebugTensorWatchOptsIsMutable();
        debugTensorWatchOpts_.add(builderForValue.build());
        onChanged();
      } else {
        debugTensorWatchOptsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Debugging options
     * </pre>
     *
     * <code>repeated .tensorflow.DebugTensorWatch debug_tensor_watch_opts = 4;</code>
     */
    public Builder addDebugTensorWatchOpts(
        int index, org.tensorflow.proto.framework.DebugTensorWatch.Builder builderForValue) {
      if (debugTensorWatchOptsBuilder_ == null) {
        ensureDebugTensorWatchOptsIsMutable();
        debugTensorWatchOpts_.add(index, builderForValue.build());
        onChanged();
      } else {
        debugTensorWatchOptsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Debugging options
     * </pre>
     *
     * <code>repeated .tensorflow.DebugTensorWatch debug_tensor_watch_opts = 4;</code>
     */
    public Builder addAllDebugTensorWatchOpts(
        java.lang.Iterable<? extends org.tensorflow.proto.framework.DebugTensorWatch> values) {
      if (debugTensorWatchOptsBuilder_ == null) {
        ensureDebugTensorWatchOptsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, debugTensorWatchOpts_);
        onChanged();
      } else {
        debugTensorWatchOptsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * Debugging options
     * </pre>
     *
     * <code>repeated .tensorflow.DebugTensorWatch debug_tensor_watch_opts = 4;</code>
     */
    public Builder clearDebugTensorWatchOpts() {
      if (debugTensorWatchOptsBuilder_ == null) {
        debugTensorWatchOpts_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        debugTensorWatchOptsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * Debugging options
     * </pre>
     *
     * <code>repeated .tensorflow.DebugTensorWatch debug_tensor_watch_opts = 4;</code>
     */
    public Builder removeDebugTensorWatchOpts(int index) {
      if (debugTensorWatchOptsBuilder_ == null) {
        ensureDebugTensorWatchOptsIsMutable();
        debugTensorWatchOpts_.remove(index);
        onChanged();
      } else {
        debugTensorWatchOptsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * Debugging options
     * </pre>
     *
     * <code>repeated .tensorflow.DebugTensorWatch debug_tensor_watch_opts = 4;</code>
     */
    public org.tensorflow.proto.framework.DebugTensorWatch.Builder getDebugTensorWatchOptsBuilder(
        int index) {
      return getDebugTensorWatchOptsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * Debugging options
     * </pre>
     *
     * <code>repeated .tensorflow.DebugTensorWatch debug_tensor_watch_opts = 4;</code>
     */
    public org.tensorflow.proto.framework.DebugTensorWatchOrBuilder getDebugTensorWatchOptsOrBuilder(
        int index) {
      if (debugTensorWatchOptsBuilder_ == null) {
        return debugTensorWatchOpts_.get(index);  } else {
        return debugTensorWatchOptsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * Debugging options
     * </pre>
     *
     * <code>repeated .tensorflow.DebugTensorWatch debug_tensor_watch_opts = 4;</code>
     */
    public java.util.List<? extends org.tensorflow.proto.framework.DebugTensorWatchOrBuilder> 
         getDebugTensorWatchOptsOrBuilderList() {
      if (debugTensorWatchOptsBuilder_ != null) {
        return debugTensorWatchOptsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(debugTensorWatchOpts_);
      }
    }
    /**
     * <pre>
     * Debugging options
     * </pre>
     *
     * <code>repeated .tensorflow.DebugTensorWatch debug_tensor_watch_opts = 4;</code>
     */
    public org.tensorflow.proto.framework.DebugTensorWatch.Builder addDebugTensorWatchOptsBuilder() {
      return getDebugTensorWatchOptsFieldBuilder().addBuilder(
          org.tensorflow.proto.framework.DebugTensorWatch.getDefaultInstance());
    }
    /**
     * <pre>
     * Debugging options
     * </pre>
     *
     * <code>repeated .tensorflow.DebugTensorWatch debug_tensor_watch_opts = 4;</code>
     */
    public org.tensorflow.proto.framework.DebugTensorWatch.Builder addDebugTensorWatchOptsBuilder(
        int index) {
      return getDebugTensorWatchOptsFieldBuilder().addBuilder(
          index, org.tensorflow.proto.framework.DebugTensorWatch.getDefaultInstance());
    }
    /**
     * <pre>
     * Debugging options
     * </pre>
     *
     * <code>repeated .tensorflow.DebugTensorWatch debug_tensor_watch_opts = 4;</code>
     */
    public java.util.List<org.tensorflow.proto.framework.DebugTensorWatch.Builder> 
         getDebugTensorWatchOptsBuilderList() {
      return getDebugTensorWatchOptsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.tensorflow.proto.framework.DebugTensorWatch, org.tensorflow.proto.framework.DebugTensorWatch.Builder, org.tensorflow.proto.framework.DebugTensorWatchOrBuilder> 
        getDebugTensorWatchOptsFieldBuilder() {
      if (debugTensorWatchOptsBuilder_ == null) {
        debugTensorWatchOptsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            org.tensorflow.proto.framework.DebugTensorWatch, org.tensorflow.proto.framework.DebugTensorWatch.Builder, org.tensorflow.proto.framework.DebugTensorWatchOrBuilder>(
                debugTensorWatchOpts_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        debugTensorWatchOpts_ = null;
      }
      return debugTensorWatchOptsBuilder_;
    }

    private long globalStep_ ;
    /**
     * <pre>
     * Caller-specified global step count.
     * Note that this is distinct from the session run count and the executor
     * step count.
     * </pre>
     *
     * <code>int64 global_step = 10;</code>
     * @return The globalStep.
     */
    @java.lang.Override
    public long getGlobalStep() {
      return globalStep_;
    }
    /**
     * <pre>
     * Caller-specified global step count.
     * Note that this is distinct from the session run count and the executor
     * step count.
     * </pre>
     *
     * <code>int64 global_step = 10;</code>
     * @param value The globalStep to set.
     * @return This builder for chaining.
     */
    public Builder setGlobalStep(long value) {
      
      globalStep_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Caller-specified global step count.
     * Note that this is distinct from the session run count and the executor
     * step count.
     * </pre>
     *
     * <code>int64 global_step = 10;</code>
     * @return This builder for chaining.
     */
    public Builder clearGlobalStep() {
      
      globalStep_ = 0L;
      onChanged();
      return this;
    }

    private boolean resetDiskByteUsage_ ;
    /**
     * <pre>
     * Whether the total disk usage of tfdbg is to be reset to zero
     * in this Session.run call. This is used by wrappers and hooks
     * such as the local CLI ones to indicate that the dumped tensors
     * are cleaned up from the disk after each Session.run.
     * </pre>
     *
     * <code>bool reset_disk_byte_usage = 11;</code>
     * @return The resetDiskByteUsage.
     */
    @java.lang.Override
    public boolean getResetDiskByteUsage() {
      return resetDiskByteUsage_;
    }
    /**
     * <pre>
     * Whether the total disk usage of tfdbg is to be reset to zero
     * in this Session.run call. This is used by wrappers and hooks
     * such as the local CLI ones to indicate that the dumped tensors
     * are cleaned up from the disk after each Session.run.
     * </pre>
     *
     * <code>bool reset_disk_byte_usage = 11;</code>
     * @param value The resetDiskByteUsage to set.
     * @return This builder for chaining.
     */
    public Builder setResetDiskByteUsage(boolean value) {
      
      resetDiskByteUsage_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Whether the total disk usage of tfdbg is to be reset to zero
     * in this Session.run call. This is used by wrappers and hooks
     * such as the local CLI ones to indicate that the dumped tensors
     * are cleaned up from the disk after each Session.run.
     * </pre>
     *
     * <code>bool reset_disk_byte_usage = 11;</code>
     * @return This builder for chaining.
     */
    public Builder clearResetDiskByteUsage() {
      
      resetDiskByteUsage_ = false;
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


    // @@protoc_insertion_point(builder_scope:tensorflow.DebugOptions)
  }

  // @@protoc_insertion_point(class_scope:tensorflow.DebugOptions)
  private static final org.tensorflow.proto.framework.DebugOptions DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.tensorflow.proto.framework.DebugOptions();
  }

  public static org.tensorflow.proto.framework.DebugOptions getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DebugOptions>
      PARSER = new com.google.protobuf.AbstractParser<DebugOptions>() {
    @java.lang.Override
    public DebugOptions parsePartialFrom(
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

  public static com.google.protobuf.Parser<DebugOptions> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DebugOptions> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.tensorflow.proto.framework.DebugOptions getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

