// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow/core/framework/tensor_description.proto

package org.tensorflow.proto;

/**
 * Protobuf type {@code tensorflow.TensorDescription}
 */
public final class TensorDescription extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:tensorflow.TensorDescription)
    TensorDescriptionOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TensorDescription.newBuilder() to construct.
  private TensorDescription(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TensorDescription() {
    dtype_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new TensorDescription();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.tensorflow.proto.TensorDescriptionProtos.internal_static_tensorflow_TensorDescription_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.tensorflow.proto.TensorDescriptionProtos.internal_static_tensorflow_TensorDescription_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.tensorflow.proto.TensorDescription.class, org.tensorflow.proto.TensorDescription.Builder.class);
  }

  public static final int DTYPE_FIELD_NUMBER = 1;
  private int dtype_;
  /**
   * <pre>
   * Data type of tensor elements
   * </pre>
   *
   * <code>.tensorflow.DataType dtype = 1;</code>
   * @return The enum numeric value on the wire for dtype.
   */
  @java.lang.Override public int getDtypeValue() {
    return dtype_;
  }
  /**
   * <pre>
   * Data type of tensor elements
   * </pre>
   *
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
   * <pre>
   * Shape of the tensor.
   * </pre>
   *
   * <code>.tensorflow.TensorShapeProto shape = 2;</code>
   * @return Whether the shape field is set.
   */
  @java.lang.Override
  public boolean hasShape() {
    return shape_ != null;
  }
  /**
   * <pre>
   * Shape of the tensor.
   * </pre>
   *
   * <code>.tensorflow.TensorShapeProto shape = 2;</code>
   * @return The shape.
   */
  @java.lang.Override
  public org.tensorflow.proto.TensorShapeProto getShape() {
    return shape_ == null ? org.tensorflow.proto.TensorShapeProto.getDefaultInstance() : shape_;
  }
  /**
   * <pre>
   * Shape of the tensor.
   * </pre>
   *
   * <code>.tensorflow.TensorShapeProto shape = 2;</code>
   */
  @java.lang.Override
  public org.tensorflow.proto.TensorShapeProtoOrBuilder getShapeOrBuilder() {
    return getShape();
  }

  public static final int ALLOCATION_DESCRIPTION_FIELD_NUMBER = 4;
  private org.tensorflow.proto.AllocationDescription allocationDescription_;
  /**
   * <pre>
   * Information about the size and allocator used for the data
   * </pre>
   *
   * <code>.tensorflow.AllocationDescription allocation_description = 4;</code>
   * @return Whether the allocationDescription field is set.
   */
  @java.lang.Override
  public boolean hasAllocationDescription() {
    return allocationDescription_ != null;
  }
  /**
   * <pre>
   * Information about the size and allocator used for the data
   * </pre>
   *
   * <code>.tensorflow.AllocationDescription allocation_description = 4;</code>
   * @return The allocationDescription.
   */
  @java.lang.Override
  public org.tensorflow.proto.AllocationDescription getAllocationDescription() {
    return allocationDescription_ == null ? org.tensorflow.proto.AllocationDescription.getDefaultInstance() : allocationDescription_;
  }
  /**
   * <pre>
   * Information about the size and allocator used for the data
   * </pre>
   *
   * <code>.tensorflow.AllocationDescription allocation_description = 4;</code>
   */
  @java.lang.Override
  public org.tensorflow.proto.AllocationDescriptionOrBuilder getAllocationDescriptionOrBuilder() {
    return getAllocationDescription();
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
    if (allocationDescription_ != null) {
      output.writeMessage(4, getAllocationDescription());
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
    if (allocationDescription_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, getAllocationDescription());
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
    if (!(obj instanceof org.tensorflow.proto.TensorDescription)) {
      return super.equals(obj);
    }
    org.tensorflow.proto.TensorDescription other = (org.tensorflow.proto.TensorDescription) obj;

    if (dtype_ != other.dtype_) return false;
    if (hasShape() != other.hasShape()) return false;
    if (hasShape()) {
      if (!getShape()
          .equals(other.getShape())) return false;
    }
    if (hasAllocationDescription() != other.hasAllocationDescription()) return false;
    if (hasAllocationDescription()) {
      if (!getAllocationDescription()
          .equals(other.getAllocationDescription())) return false;
    }
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
    if (hasAllocationDescription()) {
      hash = (37 * hash) + ALLOCATION_DESCRIPTION_FIELD_NUMBER;
      hash = (53 * hash) + getAllocationDescription().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.tensorflow.proto.TensorDescription parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.proto.TensorDescription parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.proto.TensorDescription parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.proto.TensorDescription parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.proto.TensorDescription parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.proto.TensorDescription parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.proto.TensorDescription parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tensorflow.proto.TensorDescription parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tensorflow.proto.TensorDescription parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.tensorflow.proto.TensorDescription parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tensorflow.proto.TensorDescription parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tensorflow.proto.TensorDescription parseFrom(
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
  public static Builder newBuilder(org.tensorflow.proto.TensorDescription prototype) {
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
   * Protobuf type {@code tensorflow.TensorDescription}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:tensorflow.TensorDescription)
      org.tensorflow.proto.TensorDescriptionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.tensorflow.proto.TensorDescriptionProtos.internal_static_tensorflow_TensorDescription_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.tensorflow.proto.TensorDescriptionProtos.internal_static_tensorflow_TensorDescription_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.tensorflow.proto.TensorDescription.class, org.tensorflow.proto.TensorDescription.Builder.class);
    }

    // Construct using org.tensorflow.proto.TensorDescription.newBuilder()
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
      if (allocationDescriptionBuilder_ == null) {
        allocationDescription_ = null;
      } else {
        allocationDescription_ = null;
        allocationDescriptionBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.tensorflow.proto.TensorDescriptionProtos.internal_static_tensorflow_TensorDescription_descriptor;
    }

    @java.lang.Override
    public org.tensorflow.proto.TensorDescription getDefaultInstanceForType() {
      return org.tensorflow.proto.TensorDescription.getDefaultInstance();
    }

    @java.lang.Override
    public org.tensorflow.proto.TensorDescription build() {
      org.tensorflow.proto.TensorDescription result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.tensorflow.proto.TensorDescription buildPartial() {
      org.tensorflow.proto.TensorDescription result = new org.tensorflow.proto.TensorDescription(this);
      result.dtype_ = dtype_;
      if (shapeBuilder_ == null) {
        result.shape_ = shape_;
      } else {
        result.shape_ = shapeBuilder_.build();
      }
      if (allocationDescriptionBuilder_ == null) {
        result.allocationDescription_ = allocationDescription_;
      } else {
        result.allocationDescription_ = allocationDescriptionBuilder_.build();
      }
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
      if (other instanceof org.tensorflow.proto.TensorDescription) {
        return mergeFrom((org.tensorflow.proto.TensorDescription)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.tensorflow.proto.TensorDescription other) {
      if (other == org.tensorflow.proto.TensorDescription.getDefaultInstance()) return this;
      if (other.dtype_ != 0) {
        setDtypeValue(other.getDtypeValue());
      }
      if (other.hasShape()) {
        mergeShape(other.getShape());
      }
      if (other.hasAllocationDescription()) {
        mergeAllocationDescription(other.getAllocationDescription());
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
            case 34: {
              input.readMessage(
                  getAllocationDescriptionFieldBuilder().getBuilder(),
                  extensionRegistry);

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
     * <pre>
     * Data type of tensor elements
     * </pre>
     *
     * <code>.tensorflow.DataType dtype = 1;</code>
     * @return The enum numeric value on the wire for dtype.
     */
    @java.lang.Override public int getDtypeValue() {
      return dtype_;
    }
    /**
     * <pre>
     * Data type of tensor elements
     * </pre>
     *
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
     * <pre>
     * Data type of tensor elements
     * </pre>
     *
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
     * <pre>
     * Data type of tensor elements
     * </pre>
     *
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
     * <pre>
     * Data type of tensor elements
     * </pre>
     *
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
     * <pre>
     * Shape of the tensor.
     * </pre>
     *
     * <code>.tensorflow.TensorShapeProto shape = 2;</code>
     * @return Whether the shape field is set.
     */
    public boolean hasShape() {
      return shapeBuilder_ != null || shape_ != null;
    }
    /**
     * <pre>
     * Shape of the tensor.
     * </pre>
     *
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
     * <pre>
     * Shape of the tensor.
     * </pre>
     *
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
     * <pre>
     * Shape of the tensor.
     * </pre>
     *
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
     * <pre>
     * Shape of the tensor.
     * </pre>
     *
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
     * <pre>
     * Shape of the tensor.
     * </pre>
     *
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
     * <pre>
     * Shape of the tensor.
     * </pre>
     *
     * <code>.tensorflow.TensorShapeProto shape = 2;</code>
     */
    public org.tensorflow.proto.TensorShapeProto.Builder getShapeBuilder() {
      
      onChanged();
      return getShapeFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Shape of the tensor.
     * </pre>
     *
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
     * <pre>
     * Shape of the tensor.
     * </pre>
     *
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

    private org.tensorflow.proto.AllocationDescription allocationDescription_;
    private com.google.protobuf.SingleFieldBuilderV3<
        org.tensorflow.proto.AllocationDescription, org.tensorflow.proto.AllocationDescription.Builder, org.tensorflow.proto.AllocationDescriptionOrBuilder> allocationDescriptionBuilder_;
    /**
     * <pre>
     * Information about the size and allocator used for the data
     * </pre>
     *
     * <code>.tensorflow.AllocationDescription allocation_description = 4;</code>
     * @return Whether the allocationDescription field is set.
     */
    public boolean hasAllocationDescription() {
      return allocationDescriptionBuilder_ != null || allocationDescription_ != null;
    }
    /**
     * <pre>
     * Information about the size and allocator used for the data
     * </pre>
     *
     * <code>.tensorflow.AllocationDescription allocation_description = 4;</code>
     * @return The allocationDescription.
     */
    public org.tensorflow.proto.AllocationDescription getAllocationDescription() {
      if (allocationDescriptionBuilder_ == null) {
        return allocationDescription_ == null ? org.tensorflow.proto.AllocationDescription.getDefaultInstance() : allocationDescription_;
      } else {
        return allocationDescriptionBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Information about the size and allocator used for the data
     * </pre>
     *
     * <code>.tensorflow.AllocationDescription allocation_description = 4;</code>
     */
    public Builder setAllocationDescription(org.tensorflow.proto.AllocationDescription value) {
      if (allocationDescriptionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        allocationDescription_ = value;
        onChanged();
      } else {
        allocationDescriptionBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Information about the size and allocator used for the data
     * </pre>
     *
     * <code>.tensorflow.AllocationDescription allocation_description = 4;</code>
     */
    public Builder setAllocationDescription(
        org.tensorflow.proto.AllocationDescription.Builder builderForValue) {
      if (allocationDescriptionBuilder_ == null) {
        allocationDescription_ = builderForValue.build();
        onChanged();
      } else {
        allocationDescriptionBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Information about the size and allocator used for the data
     * </pre>
     *
     * <code>.tensorflow.AllocationDescription allocation_description = 4;</code>
     */
    public Builder mergeAllocationDescription(org.tensorflow.proto.AllocationDescription value) {
      if (allocationDescriptionBuilder_ == null) {
        if (allocationDescription_ != null) {
          allocationDescription_ =
            org.tensorflow.proto.AllocationDescription.newBuilder(allocationDescription_).mergeFrom(value).buildPartial();
        } else {
          allocationDescription_ = value;
        }
        onChanged();
      } else {
        allocationDescriptionBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Information about the size and allocator used for the data
     * </pre>
     *
     * <code>.tensorflow.AllocationDescription allocation_description = 4;</code>
     */
    public Builder clearAllocationDescription() {
      if (allocationDescriptionBuilder_ == null) {
        allocationDescription_ = null;
        onChanged();
      } else {
        allocationDescription_ = null;
        allocationDescriptionBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Information about the size and allocator used for the data
     * </pre>
     *
     * <code>.tensorflow.AllocationDescription allocation_description = 4;</code>
     */
    public org.tensorflow.proto.AllocationDescription.Builder getAllocationDescriptionBuilder() {
      
      onChanged();
      return getAllocationDescriptionFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Information about the size and allocator used for the data
     * </pre>
     *
     * <code>.tensorflow.AllocationDescription allocation_description = 4;</code>
     */
    public org.tensorflow.proto.AllocationDescriptionOrBuilder getAllocationDescriptionOrBuilder() {
      if (allocationDescriptionBuilder_ != null) {
        return allocationDescriptionBuilder_.getMessageOrBuilder();
      } else {
        return allocationDescription_ == null ?
            org.tensorflow.proto.AllocationDescription.getDefaultInstance() : allocationDescription_;
      }
    }
    /**
     * <pre>
     * Information about the size and allocator used for the data
     * </pre>
     *
     * <code>.tensorflow.AllocationDescription allocation_description = 4;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.tensorflow.proto.AllocationDescription, org.tensorflow.proto.AllocationDescription.Builder, org.tensorflow.proto.AllocationDescriptionOrBuilder> 
        getAllocationDescriptionFieldBuilder() {
      if (allocationDescriptionBuilder_ == null) {
        allocationDescriptionBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.tensorflow.proto.AllocationDescription, org.tensorflow.proto.AllocationDescription.Builder, org.tensorflow.proto.AllocationDescriptionOrBuilder>(
                getAllocationDescription(),
                getParentForChildren(),
                isClean());
        allocationDescription_ = null;
      }
      return allocationDescriptionBuilder_;
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


    // @@protoc_insertion_point(builder_scope:tensorflow.TensorDescription)
  }

  // @@protoc_insertion_point(class_scope:tensorflow.TensorDescription)
  private static final org.tensorflow.proto.TensorDescription DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.tensorflow.proto.TensorDescription();
  }

  public static org.tensorflow.proto.TensorDescription getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TensorDescription>
      PARSER = new com.google.protobuf.AbstractParser<TensorDescription>() {
    @java.lang.Override
    public TensorDescription parsePartialFrom(
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

  public static com.google.protobuf.Parser<TensorDescription> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TensorDescription> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.tensorflow.proto.TensorDescription getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

