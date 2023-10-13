// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow/core/protobuf/control_flow.proto

package org.tensorflow.proto.framework;

/**
 * <pre>
 * Protocol buffer representing the values in ControlFlowContext.
 * </pre>
 *
 * Protobuf type {@code tensorflow.ValuesDef}
 */
public final class ValuesDef extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:tensorflow.ValuesDef)
    ValuesDefOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ValuesDef.newBuilder() to construct.
  private ValuesDef(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ValuesDef() {
    values_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ValuesDef();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.tensorflow.proto.framework.ControlFlowProtos.internal_static_tensorflow_ValuesDef_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  @java.lang.Override
  protected com.google.protobuf.MapField internalGetMapField(
      int number) {
    switch (number) {
      case 2:
        return internalGetExternalValues();
      default:
        throw new RuntimeException(
            "Invalid map field number: " + number);
    }
  }
  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.tensorflow.proto.framework.ControlFlowProtos.internal_static_tensorflow_ValuesDef_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.tensorflow.proto.framework.ValuesDef.class, org.tensorflow.proto.framework.ValuesDef.Builder.class);
  }

  public static final int VALUES_FIELD_NUMBER = 1;
  private com.google.protobuf.LazyStringList values_;
  /**
   * <pre>
   * Value names that have been seen in this context.
   * </pre>
   *
   * <code>repeated string values = 1;</code>
   * @return A list containing the values.
   */
  public com.google.protobuf.ProtocolStringList
      getValuesList() {
    return values_;
  }
  /**
   * <pre>
   * Value names that have been seen in this context.
   * </pre>
   *
   * <code>repeated string values = 1;</code>
   * @return The count of values.
   */
  public int getValuesCount() {
    return values_.size();
  }
  /**
   * <pre>
   * Value names that have been seen in this context.
   * </pre>
   *
   * <code>repeated string values = 1;</code>
   * @param index The index of the element to return.
   * @return The values at the given index.
   */
  public java.lang.String getValues(int index) {
    return values_.get(index);
  }
  /**
   * <pre>
   * Value names that have been seen in this context.
   * </pre>
   *
   * <code>repeated string values = 1;</code>
   * @param index The index of the value to return.
   * @return The bytes of the values at the given index.
   */
  public com.google.protobuf.ByteString
      getValuesBytes(int index) {
    return values_.getByteString(index);
  }

  public static final int EXTERNAL_VALUES_FIELD_NUMBER = 2;
  private static final class ExternalValuesDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<
        java.lang.String, java.lang.String> defaultEntry =
            com.google.protobuf.MapEntry
            .<java.lang.String, java.lang.String>newDefaultInstance(
                org.tensorflow.proto.framework.ControlFlowProtos.internal_static_tensorflow_ValuesDef_ExternalValuesEntry_descriptor, 
                com.google.protobuf.WireFormat.FieldType.STRING,
                "",
                com.google.protobuf.WireFormat.FieldType.STRING,
                "");
  }
  private com.google.protobuf.MapField<
      java.lang.String, java.lang.String> externalValues_;
  private com.google.protobuf.MapField<java.lang.String, java.lang.String>
  internalGetExternalValues() {
    if (externalValues_ == null) {
      return com.google.protobuf.MapField.emptyMapField(
          ExternalValuesDefaultEntryHolder.defaultEntry);
    }
    return externalValues_;
  }

  public int getExternalValuesCount() {
    return internalGetExternalValues().getMap().size();
  }
  /**
   * <pre>
   * Value names referenced by but external to this context.
   * </pre>
   *
   * <code>map&lt;string, string&gt; external_values = 2;</code>
   */

  @java.lang.Override
  public boolean containsExternalValues(
      java.lang.String key) {
    if (key == null) { throw new NullPointerException("map key"); }
    return internalGetExternalValues().getMap().containsKey(key);
  }
  /**
   * Use {@link #getExternalValuesMap()} instead.
   */
  @java.lang.Override
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, java.lang.String> getExternalValues() {
    return getExternalValuesMap();
  }
  /**
   * <pre>
   * Value names referenced by but external to this context.
   * </pre>
   *
   * <code>map&lt;string, string&gt; external_values = 2;</code>
   */
  @java.lang.Override

  public java.util.Map<java.lang.String, java.lang.String> getExternalValuesMap() {
    return internalGetExternalValues().getMap();
  }
  /**
   * <pre>
   * Value names referenced by but external to this context.
   * </pre>
   *
   * <code>map&lt;string, string&gt; external_values = 2;</code>
   */
  @java.lang.Override

  public java.lang.String getExternalValuesOrDefault(
      java.lang.String key,
      java.lang.String defaultValue) {
    if (key == null) { throw new NullPointerException("map key"); }
    java.util.Map<java.lang.String, java.lang.String> map =
        internalGetExternalValues().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   * <pre>
   * Value names referenced by but external to this context.
   * </pre>
   *
   * <code>map&lt;string, string&gt; external_values = 2;</code>
   */
  @java.lang.Override

  public java.lang.String getExternalValuesOrThrow(
      java.lang.String key) {
    if (key == null) { throw new NullPointerException("map key"); }
    java.util.Map<java.lang.String, java.lang.String> map =
        internalGetExternalValues().getMap();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
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
    for (int i = 0; i < values_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, values_.getRaw(i));
    }
    com.google.protobuf.GeneratedMessageV3
      .serializeStringMapTo(
        output,
        internalGetExternalValues(),
        ExternalValuesDefaultEntryHolder.defaultEntry,
        2);
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < values_.size(); i++) {
        dataSize += computeStringSizeNoTag(values_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getValuesList().size();
    }
    for (java.util.Map.Entry<java.lang.String, java.lang.String> entry
         : internalGetExternalValues().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.String, java.lang.String>
      externalValues__ = ExternalValuesDefaultEntryHolder.defaultEntry.newBuilderForType()
          .setKey(entry.getKey())
          .setValue(entry.getValue())
          .build();
      size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, externalValues__);
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
    if (!(obj instanceof org.tensorflow.proto.framework.ValuesDef)) {
      return super.equals(obj);
    }
    org.tensorflow.proto.framework.ValuesDef other = (org.tensorflow.proto.framework.ValuesDef) obj;

    if (!getValuesList()
        .equals(other.getValuesList())) return false;
    if (!internalGetExternalValues().equals(
        other.internalGetExternalValues())) return false;
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
    if (getValuesCount() > 0) {
      hash = (37 * hash) + VALUES_FIELD_NUMBER;
      hash = (53 * hash) + getValuesList().hashCode();
    }
    if (!internalGetExternalValues().getMap().isEmpty()) {
      hash = (37 * hash) + EXTERNAL_VALUES_FIELD_NUMBER;
      hash = (53 * hash) + internalGetExternalValues().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.tensorflow.proto.framework.ValuesDef parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.proto.framework.ValuesDef parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.proto.framework.ValuesDef parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.proto.framework.ValuesDef parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.proto.framework.ValuesDef parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.proto.framework.ValuesDef parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.proto.framework.ValuesDef parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tensorflow.proto.framework.ValuesDef parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tensorflow.proto.framework.ValuesDef parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.tensorflow.proto.framework.ValuesDef parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tensorflow.proto.framework.ValuesDef parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tensorflow.proto.framework.ValuesDef parseFrom(
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
  public static Builder newBuilder(org.tensorflow.proto.framework.ValuesDef prototype) {
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
   * Protocol buffer representing the values in ControlFlowContext.
   * </pre>
   *
   * Protobuf type {@code tensorflow.ValuesDef}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:tensorflow.ValuesDef)
      org.tensorflow.proto.framework.ValuesDefOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.tensorflow.proto.framework.ControlFlowProtos.internal_static_tensorflow_ValuesDef_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 2:
          return internalGetExternalValues();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMutableMapField(
        int number) {
      switch (number) {
        case 2:
          return internalGetMutableExternalValues();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.tensorflow.proto.framework.ControlFlowProtos.internal_static_tensorflow_ValuesDef_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.tensorflow.proto.framework.ValuesDef.class, org.tensorflow.proto.framework.ValuesDef.Builder.class);
    }

    // Construct using org.tensorflow.proto.framework.ValuesDef.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      values_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      internalGetMutableExternalValues().clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.tensorflow.proto.framework.ControlFlowProtos.internal_static_tensorflow_ValuesDef_descriptor;
    }

    @java.lang.Override
    public org.tensorflow.proto.framework.ValuesDef getDefaultInstanceForType() {
      return org.tensorflow.proto.framework.ValuesDef.getDefaultInstance();
    }

    @java.lang.Override
    public org.tensorflow.proto.framework.ValuesDef build() {
      org.tensorflow.proto.framework.ValuesDef result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.tensorflow.proto.framework.ValuesDef buildPartial() {
      org.tensorflow.proto.framework.ValuesDef result = new org.tensorflow.proto.framework.ValuesDef(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) != 0)) {
        values_ = values_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.values_ = values_;
      result.externalValues_ = internalGetExternalValues();
      result.externalValues_.makeImmutable();
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
      if (other instanceof org.tensorflow.proto.framework.ValuesDef) {
        return mergeFrom((org.tensorflow.proto.framework.ValuesDef)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.tensorflow.proto.framework.ValuesDef other) {
      if (other == org.tensorflow.proto.framework.ValuesDef.getDefaultInstance()) return this;
      if (!other.values_.isEmpty()) {
        if (values_.isEmpty()) {
          values_ = other.values_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureValuesIsMutable();
          values_.addAll(other.values_);
        }
        onChanged();
      }
      internalGetMutableExternalValues().mergeFrom(
          other.internalGetExternalValues());
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
            case 10: {
              java.lang.String s = input.readStringRequireUtf8();
              ensureValuesIsMutable();
              values_.add(s);
              break;
            } // case 10
            case 18: {
              com.google.protobuf.MapEntry<java.lang.String, java.lang.String>
              externalValues__ = input.readMessage(
                  ExternalValuesDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
              internalGetMutableExternalValues().getMutableMap().put(
                  externalValues__.getKey(), externalValues__.getValue());
              break;
            } // case 18
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

    private com.google.protobuf.LazyStringList values_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureValuesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        values_ = new com.google.protobuf.LazyStringArrayList(values_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <pre>
     * Value names that have been seen in this context.
     * </pre>
     *
     * <code>repeated string values = 1;</code>
     * @return A list containing the values.
     */
    public com.google.protobuf.ProtocolStringList
        getValuesList() {
      return values_.getUnmodifiableView();
    }
    /**
     * <pre>
     * Value names that have been seen in this context.
     * </pre>
     *
     * <code>repeated string values = 1;</code>
     * @return The count of values.
     */
    public int getValuesCount() {
      return values_.size();
    }
    /**
     * <pre>
     * Value names that have been seen in this context.
     * </pre>
     *
     * <code>repeated string values = 1;</code>
     * @param index The index of the element to return.
     * @return The values at the given index.
     */
    public java.lang.String getValues(int index) {
      return values_.get(index);
    }
    /**
     * <pre>
     * Value names that have been seen in this context.
     * </pre>
     *
     * <code>repeated string values = 1;</code>
     * @param index The index of the value to return.
     * @return The bytes of the values at the given index.
     */
    public com.google.protobuf.ByteString
        getValuesBytes(int index) {
      return values_.getByteString(index);
    }
    /**
     * <pre>
     * Value names that have been seen in this context.
     * </pre>
     *
     * <code>repeated string values = 1;</code>
     * @param index The index to set the value at.
     * @param value The values to set.
     * @return This builder for chaining.
     */
    public Builder setValues(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureValuesIsMutable();
      values_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Value names that have been seen in this context.
     * </pre>
     *
     * <code>repeated string values = 1;</code>
     * @param value The values to add.
     * @return This builder for chaining.
     */
    public Builder addValues(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureValuesIsMutable();
      values_.add(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Value names that have been seen in this context.
     * </pre>
     *
     * <code>repeated string values = 1;</code>
     * @param values The values to add.
     * @return This builder for chaining.
     */
    public Builder addAllValues(
        java.lang.Iterable<java.lang.String> values) {
      ensureValuesIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, values_);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Value names that have been seen in this context.
     * </pre>
     *
     * <code>repeated string values = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearValues() {
      values_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Value names that have been seen in this context.
     * </pre>
     *
     * <code>repeated string values = 1;</code>
     * @param value The bytes of the values to add.
     * @return This builder for chaining.
     */
    public Builder addValuesBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureValuesIsMutable();
      values_.add(value);
      onChanged();
      return this;
    }

    private com.google.protobuf.MapField<
        java.lang.String, java.lang.String> externalValues_;
    private com.google.protobuf.MapField<java.lang.String, java.lang.String>
    internalGetExternalValues() {
      if (externalValues_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            ExternalValuesDefaultEntryHolder.defaultEntry);
      }
      return externalValues_;
    }
    private com.google.protobuf.MapField<java.lang.String, java.lang.String>
    internalGetMutableExternalValues() {
      onChanged();;
      if (externalValues_ == null) {
        externalValues_ = com.google.protobuf.MapField.newMapField(
            ExternalValuesDefaultEntryHolder.defaultEntry);
      }
      if (!externalValues_.isMutable()) {
        externalValues_ = externalValues_.copy();
      }
      return externalValues_;
    }

    public int getExternalValuesCount() {
      return internalGetExternalValues().getMap().size();
    }
    /**
     * <pre>
     * Value names referenced by but external to this context.
     * </pre>
     *
     * <code>map&lt;string, string&gt; external_values = 2;</code>
     */

    @java.lang.Override
    public boolean containsExternalValues(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      return internalGetExternalValues().getMap().containsKey(key);
    }
    /**
     * Use {@link #getExternalValuesMap()} instead.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String> getExternalValues() {
      return getExternalValuesMap();
    }
    /**
     * <pre>
     * Value names referenced by but external to this context.
     * </pre>
     *
     * <code>map&lt;string, string&gt; external_values = 2;</code>
     */
    @java.lang.Override

    public java.util.Map<java.lang.String, java.lang.String> getExternalValuesMap() {
      return internalGetExternalValues().getMap();
    }
    /**
     * <pre>
     * Value names referenced by but external to this context.
     * </pre>
     *
     * <code>map&lt;string, string&gt; external_values = 2;</code>
     */
    @java.lang.Override

    public java.lang.String getExternalValuesOrDefault(
        java.lang.String key,
        java.lang.String defaultValue) {
      if (key == null) { throw new NullPointerException("map key"); }
      java.util.Map<java.lang.String, java.lang.String> map =
          internalGetExternalValues().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <pre>
     * Value names referenced by but external to this context.
     * </pre>
     *
     * <code>map&lt;string, string&gt; external_values = 2;</code>
     */
    @java.lang.Override

    public java.lang.String getExternalValuesOrThrow(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      java.util.Map<java.lang.String, java.lang.String> map =
          internalGetExternalValues().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public Builder clearExternalValues() {
      internalGetMutableExternalValues().getMutableMap()
          .clear();
      return this;
    }
    /**
     * <pre>
     * Value names referenced by but external to this context.
     * </pre>
     *
     * <code>map&lt;string, string&gt; external_values = 2;</code>
     */

    public Builder removeExternalValues(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      internalGetMutableExternalValues().getMutableMap()
          .remove(key);
      return this;
    }
    /**
     * Use alternate mutation accessors instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String>
    getMutableExternalValues() {
      return internalGetMutableExternalValues().getMutableMap();
    }
    /**
     * <pre>
     * Value names referenced by but external to this context.
     * </pre>
     *
     * <code>map&lt;string, string&gt; external_values = 2;</code>
     */
    public Builder putExternalValues(
        java.lang.String key,
        java.lang.String value) {
      if (key == null) { throw new NullPointerException("map key"); }
      if (value == null) {
  throw new NullPointerException("map value");
}

      internalGetMutableExternalValues().getMutableMap()
          .put(key, value);
      return this;
    }
    /**
     * <pre>
     * Value names referenced by but external to this context.
     * </pre>
     *
     * <code>map&lt;string, string&gt; external_values = 2;</code>
     */

    public Builder putAllExternalValues(
        java.util.Map<java.lang.String, java.lang.String> values) {
      internalGetMutableExternalValues().getMutableMap()
          .putAll(values);
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


    // @@protoc_insertion_point(builder_scope:tensorflow.ValuesDef)
  }

  // @@protoc_insertion_point(class_scope:tensorflow.ValuesDef)
  private static final org.tensorflow.proto.framework.ValuesDef DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.tensorflow.proto.framework.ValuesDef();
  }

  public static org.tensorflow.proto.framework.ValuesDef getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ValuesDef>
      PARSER = new com.google.protobuf.AbstractParser<ValuesDef>() {
    @java.lang.Override
    public ValuesDef parsePartialFrom(
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

  public static com.google.protobuf.Parser<ValuesDef> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ValuesDef> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.tensorflow.proto.framework.ValuesDef getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

