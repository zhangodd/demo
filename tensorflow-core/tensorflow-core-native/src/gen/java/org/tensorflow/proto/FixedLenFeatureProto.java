// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow/core/example/example_parser_configuration.proto

package org.tensorflow.proto;

/**
 * Protobuf type {@code tensorflow.FixedLenFeatureProto}
 */
public final class FixedLenFeatureProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:tensorflow.FixedLenFeatureProto)
    FixedLenFeatureProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use FixedLenFeatureProto.newBuilder() to construct.
  private FixedLenFeatureProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FixedLenFeatureProto() {
    dtype_ = 0;
    valuesOutputTensorName_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new FixedLenFeatureProto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.tensorflow.proto.ExampleParserConfigurationProtos.internal_static_tensorflow_FixedLenFeatureProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.tensorflow.proto.ExampleParserConfigurationProtos.internal_static_tensorflow_FixedLenFeatureProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.tensorflow.proto.FixedLenFeatureProto.class, org.tensorflow.proto.FixedLenFeatureProto.Builder.class);
  }

  public static final int DTYPE_FIELD_NUMBER = 1;
  private int dtype_;
  /**
   * <code>.tensorflow.DataType dtype = 1;</code>
   * @return The enum numeric value on the wire for dtype.
   */
  @java.lang.Override public int getDtypeValue() {
    return dtype_;
  }
  /**
   * <code>.tensorflow.DataType dtype = 1;</code>
   * @return The dtype.
   */
  @java.lang.Override public org.tensorflow.proto.DataType getDtype() {
    @SuppressWarnings("deprecation")
    org.tensorflow.proto.DataType result = org.tensorflow.proto.DataType.valueOf(dtype_);
    return result == null ? org.tensorflow.proto.DataType.UNRECOGNIZED : result;
  }

  public static final int SHAPE_FIELD_NUMBER = 2;
  private org.tensorflow.proto.TensorShapeProto shape_;
  /**
   * <code>.tensorflow.TensorShapeProto shape = 2;</code>
   * @return Whether the shape field is set.
   */
  @java.lang.Override
  public boolean hasShape() {
    return shape_ != null;
  }
  /**
   * <code>.tensorflow.TensorShapeProto shape = 2;</code>
   * @return The shape.
   */
  @java.lang.Override
  public org.tensorflow.proto.TensorShapeProto getShape() {
    return shape_ == null ? org.tensorflow.proto.TensorShapeProto.getDefaultInstance() : shape_;
  }
  /**
   * <code>.tensorflow.TensorShapeProto shape = 2;</code>
   */
  @java.lang.Override
  public org.tensorflow.proto.TensorShapeProtoOrBuilder getShapeOrBuilder() {
    return getShape();
  }

  public static final int DEFAULT_VALUE_FIELD_NUMBER = 3;
  private org.tensorflow.proto.TensorProto defaultValue_;
  /**
   * <code>.tensorflow.TensorProto default_value = 3;</code>
   * @return Whether the defaultValue field is set.
   */
  @java.lang.Override
  public boolean hasDefaultValue() {
    return defaultValue_ != null;
  }
  /**
   * <code>.tensorflow.TensorProto default_value = 3;</code>
   * @return The defaultValue.
   */
  @java.lang.Override
  public org.tensorflow.proto.TensorProto getDefaultValue() {
    return defaultValue_ == null ? org.tensorflow.proto.TensorProto.getDefaultInstance() : defaultValue_;
  }
  /**
   * <code>.tensorflow.TensorProto default_value = 3;</code>
   */
  @java.lang.Override
  public org.tensorflow.proto.TensorProtoOrBuilder getDefaultValueOrBuilder() {
    return getDefaultValue();
  }

  public static final int VALUES_OUTPUT_TENSOR_NAME_FIELD_NUMBER = 4;
  private volatile java.lang.Object valuesOutputTensorName_;
  /**
   * <code>string values_output_tensor_name = 4;</code>
   * @return The valuesOutputTensorName.
   */
  @java.lang.Override
  public java.lang.String getValuesOutputTensorName() {
    java.lang.Object ref = valuesOutputTensorName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      valuesOutputTensorName_ = s;
      return s;
    }
  }
  /**
   * <code>string values_output_tensor_name = 4;</code>
   * @return The bytes for valuesOutputTensorName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getValuesOutputTensorNameBytes() {
    java.lang.Object ref = valuesOutputTensorName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      valuesOutputTensorName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (dtype_ != org.tensorflow.proto.DataType.DT_INVALID.getNumber()) {
      output.writeEnum(1, dtype_);
    }
    if (shape_ != null) {
      output.writeMessage(2, getShape());
    }
    if (defaultValue_ != null) {
      output.writeMessage(3, getDefaultValue());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(valuesOutputTensorName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, valuesOutputTensorName_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (dtype_ != org.tensorflow.proto.DataType.DT_INVALID.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, dtype_);
    }
    if (shape_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getShape());
    }
    if (defaultValue_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getDefaultValue());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(valuesOutputTensorName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, valuesOutputTensorName_);
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
    if (!(obj instanceof org.tensorflow.proto.FixedLenFeatureProto)) {
      return super.equals(obj);
    }
    org.tensorflow.proto.FixedLenFeatureProto other = (org.tensorflow.proto.FixedLenFeatureProto) obj;

    if (dtype_ != other.dtype_) return false;
    if (hasShape() != other.hasShape()) return false;
    if (hasShape()) {
      if (!getShape()
          .equals(other.getShape())) return false;
    }
    if (hasDefaultValue() != other.hasDefaultValue()) return false;
    if (hasDefaultValue()) {
      if (!getDefaultValue()
          .equals(other.getDefaultValue())) return false;
    }
    if (!getValuesOutputTensorName()
        .equals(other.getValuesOutputTensorName())) return false;
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
    hash = (37 * hash) + DTYPE_FIELD_NUMBER;
    hash = (53 * hash) + dtype_;
    if (hasShape()) {
      hash = (37 * hash) + SHAPE_FIELD_NUMBER;
      hash = (53 * hash) + getShape().hashCode();
    }
    if (hasDefaultValue()) {
      hash = (37 * hash) + DEFAULT_VALUE_FIELD_NUMBER;
      hash = (53 * hash) + getDefaultValue().hashCode();
    }
    hash = (37 * hash) + VALUES_OUTPUT_TENSOR_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getValuesOutputTensorName().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.tensorflow.proto.FixedLenFeatureProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.proto.FixedLenFeatureProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.proto.FixedLenFeatureProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.proto.FixedLenFeatureProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.proto.FixedLenFeatureProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.proto.FixedLenFeatureProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.proto.FixedLenFeatureProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tensorflow.proto.FixedLenFeatureProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tensorflow.proto.FixedLenFeatureProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.tensorflow.proto.FixedLenFeatureProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tensorflow.proto.FixedLenFeatureProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tensorflow.proto.FixedLenFeatureProto parseFrom(
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
  public static Builder newBuilder(org.tensorflow.proto.FixedLenFeatureProto prototype) {
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
   * Protobuf type {@code tensorflow.FixedLenFeatureProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:tensorflow.FixedLenFeatureProto)
      org.tensorflow.proto.FixedLenFeatureProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.tensorflow.proto.ExampleParserConfigurationProtos.internal_static_tensorflow_FixedLenFeatureProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.tensorflow.proto.ExampleParserConfigurationProtos.internal_static_tensorflow_FixedLenFeatureProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.tensorflow.proto.FixedLenFeatureProto.class, org.tensorflow.proto.FixedLenFeatureProto.Builder.class);
    }

    // Construct using org.tensorflow.proto.FixedLenFeatureProto.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      dtype_ = 0;

      if (shapeBuilder_ == null) {
        shape_ = null;
      } else {
        shape_ = null;
        shapeBuilder_ = null;
      }
      if (defaultValueBuilder_ == null) {
        defaultValue_ = null;
      } else {
        defaultValue_ = null;
        defaultValueBuilder_ = null;
      }
      valuesOutputTensorName_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.tensorflow.proto.ExampleParserConfigurationProtos.internal_static_tensorflow_FixedLenFeatureProto_descriptor;
    }

    @java.lang.Override
    public org.tensorflow.proto.FixedLenFeatureProto getDefaultInstanceForType() {
      return org.tensorflow.proto.FixedLenFeatureProto.getDefaultInstance();
    }

    @java.lang.Override
    public org.tensorflow.proto.FixedLenFeatureProto build() {
      org.tensorflow.proto.FixedLenFeatureProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.tensorflow.proto.FixedLenFeatureProto buildPartial() {
      org.tensorflow.proto.FixedLenFeatureProto result = new org.tensorflow.proto.FixedLenFeatureProto(this);
      result.dtype_ = dtype_;
      if (shapeBuilder_ == null) {
        result.shape_ = shape_;
      } else {
        result.shape_ = shapeBuilder_.build();
      }
      if (defaultValueBuilder_ == null) {
        result.defaultValue_ = defaultValue_;
      } else {
        result.defaultValue_ = defaultValueBuilder_.build();
      }
      result.valuesOutputTensorName_ = valuesOutputTensorName_;
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
      if (other instanceof org.tensorflow.proto.FixedLenFeatureProto) {
        return mergeFrom((org.tensorflow.proto.FixedLenFeatureProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.tensorflow.proto.FixedLenFeatureProto other) {
      if (other == org.tensorflow.proto.FixedLenFeatureProto.getDefaultInstance()) return this;
      if (other.dtype_ != 0) {
        setDtypeValue(other.getDtypeValue());
      }
      if (other.hasShape()) {
        mergeShape(other.getShape());
      }
      if (other.hasDefaultValue()) {
        mergeDefaultValue(other.getDefaultValue());
      }
      if (!other.getValuesOutputTensorName().isEmpty()) {
        valuesOutputTensorName_ = other.valuesOutputTensorName_;
        onChanged();
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
              dtype_ = input.readEnum();

              break;
            } // case 8
            case 18: {
              input.readMessage(
                  getShapeFieldBuilder().getBuilder(),
                  extensionRegistry);

              break;
            } // case 18
            case 26: {
              input.readMessage(
                  getDefaultValueFieldBuilder().getBuilder(),
                  extensionRegistry);

              break;
            } // case 26
            case 34: {
              valuesOutputTensorName_ = input.readStringRequireUtf8();

              break;
            } // case 34
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

    private int dtype_ = 0;
    /**
     * <code>.tensorflow.DataType dtype = 1;</code>
     * @return The enum numeric value on the wire for dtype.
     */
    @java.lang.Override public int getDtypeValue() {
      return dtype_;
    }
    /**
     * <code>.tensorflow.DataType dtype = 1;</code>
     * @param value The enum numeric value on the wire for dtype to set.
     * @return This builder for chaining.
     */
    public Builder setDtypeValue(int value) {
      
      dtype_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.tensorflow.DataType dtype = 1;</code>
     * @return The dtype.
     */
    @java.lang.Override
    public org.tensorflow.proto.DataType getDtype() {
      @SuppressWarnings("deprecation")
      org.tensorflow.proto.DataType result = org.tensorflow.proto.DataType.valueOf(dtype_);
      return result == null ? org.tensorflow.proto.DataType.UNRECOGNIZED : result;
    }
    /**
     * <code>.tensorflow.DataType dtype = 1;</code>
     * @param value The dtype to set.
     * @return This builder for chaining.
     */
    public Builder setDtype(org.tensorflow.proto.DataType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      dtype_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.tensorflow.DataType dtype = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearDtype() {
      
      dtype_ = 0;
      onChanged();
      return this;
    }

    private org.tensorflow.proto.TensorShapeProto shape_;
    private com.google.protobuf.SingleFieldBuilderV3<
        org.tensorflow.proto.TensorShapeProto, org.tensorflow.proto.TensorShapeProto.Builder, org.tensorflow.proto.TensorShapeProtoOrBuilder> shapeBuilder_;
    /**
     * <code>.tensorflow.TensorShapeProto shape = 2;</code>
     * @return Whether the shape field is set.
     */
    public boolean hasShape() {
      return shapeBuilder_ != null || shape_ != null;
    }
    /**
     * <code>.tensorflow.TensorShapeProto shape = 2;</code>
     * @return The shape.
     */
    public org.tensorflow.proto.TensorShapeProto getShape() {
      if (shapeBuilder_ == null) {
        return shape_ == null ? org.tensorflow.proto.TensorShapeProto.getDefaultInstance() : shape_;
      } else {
        return shapeBuilder_.getMessage();
      }
    }
    /**
     * <code>.tensorflow.TensorShapeProto shape = 2;</code>
     */
    public Builder setShape(org.tensorflow.proto.TensorShapeProto value) {
      if (shapeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        shape_ = value;
        onChanged();
      } else {
        shapeBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.tensorflow.TensorShapeProto shape = 2;</code>
     */
    public Builder setShape(
        org.tensorflow.proto.TensorShapeProto.Builder builderForValue) {
      if (shapeBuilder_ == null) {
        shape_ = builderForValue.build();
        onChanged();
      } else {
        shapeBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.tensorflow.TensorShapeProto shape = 2;</code>
     */
    public Builder mergeShape(org.tensorflow.proto.TensorShapeProto value) {
      if (shapeBuilder_ == null) {
        if (shape_ != null) {
          shape_ =
            org.tensorflow.proto.TensorShapeProto.newBuilder(shape_).mergeFrom(value).buildPartial();
        } else {
          shape_ = value;
        }
        onChanged();
      } else {
        shapeBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.tensorflow.TensorShapeProto shape = 2;</code>
     */
    public Builder clearShape() {
      if (shapeBuilder_ == null) {
        shape_ = null;
        onChanged();
      } else {
        shape_ = null;
        shapeBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.tensorflow.TensorShapeProto shape = 2;</code>
     */
    public org.tensorflow.proto.TensorShapeProto.Builder getShapeBuilder() {
      
      onChanged();
      return getShapeFieldBuilder().getBuilder();
    }
    /**
     * <code>.tensorflow.TensorShapeProto shape = 2;</code>
     */
    public org.tensorflow.proto.TensorShapeProtoOrBuilder getShapeOrBuilder() {
      if (shapeBuilder_ != null) {
        return shapeBuilder_.getMessageOrBuilder();
      } else {
        return shape_ == null ?
            org.tensorflow.proto.TensorShapeProto.getDefaultInstance() : shape_;
      }
    }
    /**
     * <code>.tensorflow.TensorShapeProto shape = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.tensorflow.proto.TensorShapeProto, org.tensorflow.proto.TensorShapeProto.Builder, org.tensorflow.proto.TensorShapeProtoOrBuilder> 
        getShapeFieldBuilder() {
      if (shapeBuilder_ == null) {
        shapeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.tensorflow.proto.TensorShapeProto, org.tensorflow.proto.TensorShapeProto.Builder, org.tensorflow.proto.TensorShapeProtoOrBuilder>(
                getShape(),
                getParentForChildren(),
                isClean());
        shape_ = null;
      }
      return shapeBuilder_;
    }

    private org.tensorflow.proto.TensorProto defaultValue_;
    private com.google.protobuf.SingleFieldBuilderV3<
        org.tensorflow.proto.TensorProto, org.tensorflow.proto.TensorProto.Builder, org.tensorflow.proto.TensorProtoOrBuilder> defaultValueBuilder_;
    /**
     * <code>.tensorflow.TensorProto default_value = 3;</code>
     * @return Whether the defaultValue field is set.
     */
    public boolean hasDefaultValue() {
      return defaultValueBuilder_ != null || defaultValue_ != null;
    }
    /**
     * <code>.tensorflow.TensorProto default_value = 3;</code>
     * @return The defaultValue.
     */
    public org.tensorflow.proto.TensorProto getDefaultValue() {
      if (defaultValueBuilder_ == null) {
        return defaultValue_ == null ? org.tensorflow.proto.TensorProto.getDefaultInstance() : defaultValue_;
      } else {
        return defaultValueBuilder_.getMessage();
      }
    }
    /**
     * <code>.tensorflow.TensorProto default_value = 3;</code>
     */
    public Builder setDefaultValue(org.tensorflow.proto.TensorProto value) {
      if (defaultValueBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        defaultValue_ = value;
        onChanged();
      } else {
        defaultValueBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.tensorflow.TensorProto default_value = 3;</code>
     */
    public Builder setDefaultValue(
        org.tensorflow.proto.TensorProto.Builder builderForValue) {
      if (defaultValueBuilder_ == null) {
        defaultValue_ = builderForValue.build();
        onChanged();
      } else {
        defaultValueBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.tensorflow.TensorProto default_value = 3;</code>
     */
    public Builder mergeDefaultValue(org.tensorflow.proto.TensorProto value) {
      if (defaultValueBuilder_ == null) {
        if (defaultValue_ != null) {
          defaultValue_ =
            org.tensorflow.proto.TensorProto.newBuilder(defaultValue_).mergeFrom(value).buildPartial();
        } else {
          defaultValue_ = value;
        }
        onChanged();
      } else {
        defaultValueBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.tensorflow.TensorProto default_value = 3;</code>
     */
    public Builder clearDefaultValue() {
      if (defaultValueBuilder_ == null) {
        defaultValue_ = null;
        onChanged();
      } else {
        defaultValue_ = null;
        defaultValueBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.tensorflow.TensorProto default_value = 3;</code>
     */
    public org.tensorflow.proto.TensorProto.Builder getDefaultValueBuilder() {
      
      onChanged();
      return getDefaultValueFieldBuilder().getBuilder();
    }
    /**
     * <code>.tensorflow.TensorProto default_value = 3;</code>
     */
    public org.tensorflow.proto.TensorProtoOrBuilder getDefaultValueOrBuilder() {
      if (defaultValueBuilder_ != null) {
        return defaultValueBuilder_.getMessageOrBuilder();
      } else {
        return defaultValue_ == null ?
            org.tensorflow.proto.TensorProto.getDefaultInstance() : defaultValue_;
      }
    }
    /**
     * <code>.tensorflow.TensorProto default_value = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.tensorflow.proto.TensorProto, org.tensorflow.proto.TensorProto.Builder, org.tensorflow.proto.TensorProtoOrBuilder> 
        getDefaultValueFieldBuilder() {
      if (defaultValueBuilder_ == null) {
        defaultValueBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.tensorflow.proto.TensorProto, org.tensorflow.proto.TensorProto.Builder, org.tensorflow.proto.TensorProtoOrBuilder>(
                getDefaultValue(),
                getParentForChildren(),
                isClean());
        defaultValue_ = null;
      }
      return defaultValueBuilder_;
    }

    private java.lang.Object valuesOutputTensorName_ = "";
    /**
     * <code>string values_output_tensor_name = 4;</code>
     * @return The valuesOutputTensorName.
     */
    public java.lang.String getValuesOutputTensorName() {
      java.lang.Object ref = valuesOutputTensorName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        valuesOutputTensorName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string values_output_tensor_name = 4;</code>
     * @return The bytes for valuesOutputTensorName.
     */
    public com.google.protobuf.ByteString
        getValuesOutputTensorNameBytes() {
      java.lang.Object ref = valuesOutputTensorName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        valuesOutputTensorName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string values_output_tensor_name = 4;</code>
     * @param value The valuesOutputTensorName to set.
     * @return This builder for chaining.
     */
    public Builder setValuesOutputTensorName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      valuesOutputTensorName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string values_output_tensor_name = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearValuesOutputTensorName() {
      
      valuesOutputTensorName_ = getDefaultInstance().getValuesOutputTensorName();
      onChanged();
      return this;
    }
    /**
     * <code>string values_output_tensor_name = 4;</code>
     * @param value The bytes for valuesOutputTensorName to set.
     * @return This builder for chaining.
     */
    public Builder setValuesOutputTensorNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      valuesOutputTensorName_ = value;
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


    // @@protoc_insertion_point(builder_scope:tensorflow.FixedLenFeatureProto)
  }

  // @@protoc_insertion_point(class_scope:tensorflow.FixedLenFeatureProto)
  private static final org.tensorflow.proto.FixedLenFeatureProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.tensorflow.proto.FixedLenFeatureProto();
  }

  public static org.tensorflow.proto.FixedLenFeatureProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FixedLenFeatureProto>
      PARSER = new com.google.protobuf.AbstractParser<FixedLenFeatureProto>() {
    @java.lang.Override
    public FixedLenFeatureProto parsePartialFrom(
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

  public static com.google.protobuf.Parser<FixedLenFeatureProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FixedLenFeatureProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.tensorflow.proto.FixedLenFeatureProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

