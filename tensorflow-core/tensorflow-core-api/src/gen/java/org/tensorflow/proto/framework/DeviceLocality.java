// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow/core/framework/device_attributes.proto

package org.tensorflow.proto.framework;

/**
 * Protobuf type {@code tensorflow.DeviceLocality}
 */
public final class DeviceLocality extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:tensorflow.DeviceLocality)
    DeviceLocalityOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DeviceLocality.newBuilder() to construct.
  private DeviceLocality(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DeviceLocality() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DeviceLocality();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.tensorflow.proto.framework.DeviceAttributesProtos.internal_static_tensorflow_DeviceLocality_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.tensorflow.proto.framework.DeviceAttributesProtos.internal_static_tensorflow_DeviceLocality_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.tensorflow.proto.framework.DeviceLocality.class, org.tensorflow.proto.framework.DeviceLocality.Builder.class);
  }

  public static final int BUS_ID_FIELD_NUMBER = 1;
  private int busId_;
  /**
   * <pre>
   * Optional bus locality of device.  Default value of 0 means
   * no specific locality.  Specific localities are indexed from 1.
   * </pre>
   *
   * <code>int32 bus_id = 1;</code>
   * @return The busId.
   */
  @java.lang.Override
  public int getBusId() {
    return busId_;
  }

  public static final int NUMA_NODE_FIELD_NUMBER = 2;
  private int numaNode_;
  /**
   * <pre>
   * Optional NUMA locality of device.
   * </pre>
   *
   * <code>int32 numa_node = 2;</code>
   * @return The numaNode.
   */
  @java.lang.Override
  public int getNumaNode() {
    return numaNode_;
  }

  public static final int LINKS_FIELD_NUMBER = 3;
  private org.tensorflow.proto.framework.LocalLinks links_;
  /**
   * <pre>
   * Optional local interconnect links to other devices.
   * </pre>
   *
   * <code>.tensorflow.LocalLinks links = 3;</code>
   * @return Whether the links field is set.
   */
  @java.lang.Override
  public boolean hasLinks() {
    return links_ != null;
  }
  /**
   * <pre>
   * Optional local interconnect links to other devices.
   * </pre>
   *
   * <code>.tensorflow.LocalLinks links = 3;</code>
   * @return The links.
   */
  @java.lang.Override
  public org.tensorflow.proto.framework.LocalLinks getLinks() {
    return links_ == null ? org.tensorflow.proto.framework.LocalLinks.getDefaultInstance() : links_;
  }
  /**
   * <pre>
   * Optional local interconnect links to other devices.
   * </pre>
   *
   * <code>.tensorflow.LocalLinks links = 3;</code>
   */
  @java.lang.Override
  public org.tensorflow.proto.framework.LocalLinksOrBuilder getLinksOrBuilder() {
    return getLinks();
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
    if (busId_ != 0) {
      output.writeInt32(1, busId_);
    }
    if (numaNode_ != 0) {
      output.writeInt32(2, numaNode_);
    }
    if (links_ != null) {
      output.writeMessage(3, getLinks());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (busId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, busId_);
    }
    if (numaNode_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, numaNode_);
    }
    if (links_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getLinks());
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
    if (!(obj instanceof org.tensorflow.proto.framework.DeviceLocality)) {
      return super.equals(obj);
    }
    org.tensorflow.proto.framework.DeviceLocality other = (org.tensorflow.proto.framework.DeviceLocality) obj;

    if (getBusId()
        != other.getBusId()) return false;
    if (getNumaNode()
        != other.getNumaNode()) return false;
    if (hasLinks() != other.hasLinks()) return false;
    if (hasLinks()) {
      if (!getLinks()
          .equals(other.getLinks())) return false;
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
    hash = (37 * hash) + BUS_ID_FIELD_NUMBER;
    hash = (53 * hash) + getBusId();
    hash = (37 * hash) + NUMA_NODE_FIELD_NUMBER;
    hash = (53 * hash) + getNumaNode();
    if (hasLinks()) {
      hash = (37 * hash) + LINKS_FIELD_NUMBER;
      hash = (53 * hash) + getLinks().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.tensorflow.proto.framework.DeviceLocality parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.proto.framework.DeviceLocality parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.proto.framework.DeviceLocality parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.proto.framework.DeviceLocality parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.proto.framework.DeviceLocality parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.proto.framework.DeviceLocality parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.proto.framework.DeviceLocality parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tensorflow.proto.framework.DeviceLocality parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tensorflow.proto.framework.DeviceLocality parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.tensorflow.proto.framework.DeviceLocality parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tensorflow.proto.framework.DeviceLocality parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tensorflow.proto.framework.DeviceLocality parseFrom(
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
  public static Builder newBuilder(org.tensorflow.proto.framework.DeviceLocality prototype) {
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
   * Protobuf type {@code tensorflow.DeviceLocality}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:tensorflow.DeviceLocality)
      org.tensorflow.proto.framework.DeviceLocalityOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.tensorflow.proto.framework.DeviceAttributesProtos.internal_static_tensorflow_DeviceLocality_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.tensorflow.proto.framework.DeviceAttributesProtos.internal_static_tensorflow_DeviceLocality_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.tensorflow.proto.framework.DeviceLocality.class, org.tensorflow.proto.framework.DeviceLocality.Builder.class);
    }

    // Construct using org.tensorflow.proto.framework.DeviceLocality.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      busId_ = 0;

      numaNode_ = 0;

      if (linksBuilder_ == null) {
        links_ = null;
      } else {
        links_ = null;
        linksBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.tensorflow.proto.framework.DeviceAttributesProtos.internal_static_tensorflow_DeviceLocality_descriptor;
    }

    @java.lang.Override
    public org.tensorflow.proto.framework.DeviceLocality getDefaultInstanceForType() {
      return org.tensorflow.proto.framework.DeviceLocality.getDefaultInstance();
    }

    @java.lang.Override
    public org.tensorflow.proto.framework.DeviceLocality build() {
      org.tensorflow.proto.framework.DeviceLocality result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.tensorflow.proto.framework.DeviceLocality buildPartial() {
      org.tensorflow.proto.framework.DeviceLocality result = new org.tensorflow.proto.framework.DeviceLocality(this);
      result.busId_ = busId_;
      result.numaNode_ = numaNode_;
      if (linksBuilder_ == null) {
        result.links_ = links_;
      } else {
        result.links_ = linksBuilder_.build();
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
      if (other instanceof org.tensorflow.proto.framework.DeviceLocality) {
        return mergeFrom((org.tensorflow.proto.framework.DeviceLocality)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.tensorflow.proto.framework.DeviceLocality other) {
      if (other == org.tensorflow.proto.framework.DeviceLocality.getDefaultInstance()) return this;
      if (other.getBusId() != 0) {
        setBusId(other.getBusId());
      }
      if (other.getNumaNode() != 0) {
        setNumaNode(other.getNumaNode());
      }
      if (other.hasLinks()) {
        mergeLinks(other.getLinks());
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
              busId_ = input.readInt32();

              break;
            } // case 8
            case 16: {
              numaNode_ = input.readInt32();

              break;
            } // case 16
            case 26: {
              input.readMessage(
                  getLinksFieldBuilder().getBuilder(),
                  extensionRegistry);

              break;
            } // case 26
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

    private int busId_ ;
    /**
     * <pre>
     * Optional bus locality of device.  Default value of 0 means
     * no specific locality.  Specific localities are indexed from 1.
     * </pre>
     *
     * <code>int32 bus_id = 1;</code>
     * @return The busId.
     */
    @java.lang.Override
    public int getBusId() {
      return busId_;
    }
    /**
     * <pre>
     * Optional bus locality of device.  Default value of 0 means
     * no specific locality.  Specific localities are indexed from 1.
     * </pre>
     *
     * <code>int32 bus_id = 1;</code>
     * @param value The busId to set.
     * @return This builder for chaining.
     */
    public Builder setBusId(int value) {
      
      busId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional bus locality of device.  Default value of 0 means
     * no specific locality.  Specific localities are indexed from 1.
     * </pre>
     *
     * <code>int32 bus_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearBusId() {
      
      busId_ = 0;
      onChanged();
      return this;
    }

    private int numaNode_ ;
    /**
     * <pre>
     * Optional NUMA locality of device.
     * </pre>
     *
     * <code>int32 numa_node = 2;</code>
     * @return The numaNode.
     */
    @java.lang.Override
    public int getNumaNode() {
      return numaNode_;
    }
    /**
     * <pre>
     * Optional NUMA locality of device.
     * </pre>
     *
     * <code>int32 numa_node = 2;</code>
     * @param value The numaNode to set.
     * @return This builder for chaining.
     */
    public Builder setNumaNode(int value) {
      
      numaNode_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional NUMA locality of device.
     * </pre>
     *
     * <code>int32 numa_node = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearNumaNode() {
      
      numaNode_ = 0;
      onChanged();
      return this;
    }

    private org.tensorflow.proto.framework.LocalLinks links_;
    private com.google.protobuf.SingleFieldBuilderV3<
        org.tensorflow.proto.framework.LocalLinks, org.tensorflow.proto.framework.LocalLinks.Builder, org.tensorflow.proto.framework.LocalLinksOrBuilder> linksBuilder_;
    /**
     * <pre>
     * Optional local interconnect links to other devices.
     * </pre>
     *
     * <code>.tensorflow.LocalLinks links = 3;</code>
     * @return Whether the links field is set.
     */
    public boolean hasLinks() {
      return linksBuilder_ != null || links_ != null;
    }
    /**
     * <pre>
     * Optional local interconnect links to other devices.
     * </pre>
     *
     * <code>.tensorflow.LocalLinks links = 3;</code>
     * @return The links.
     */
    public org.tensorflow.proto.framework.LocalLinks getLinks() {
      if (linksBuilder_ == null) {
        return links_ == null ? org.tensorflow.proto.framework.LocalLinks.getDefaultInstance() : links_;
      } else {
        return linksBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Optional local interconnect links to other devices.
     * </pre>
     *
     * <code>.tensorflow.LocalLinks links = 3;</code>
     */
    public Builder setLinks(org.tensorflow.proto.framework.LocalLinks value) {
      if (linksBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        links_ = value;
        onChanged();
      } else {
        linksBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Optional local interconnect links to other devices.
     * </pre>
     *
     * <code>.tensorflow.LocalLinks links = 3;</code>
     */
    public Builder setLinks(
        org.tensorflow.proto.framework.LocalLinks.Builder builderForValue) {
      if (linksBuilder_ == null) {
        links_ = builderForValue.build();
        onChanged();
      } else {
        linksBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Optional local interconnect links to other devices.
     * </pre>
     *
     * <code>.tensorflow.LocalLinks links = 3;</code>
     */
    public Builder mergeLinks(org.tensorflow.proto.framework.LocalLinks value) {
      if (linksBuilder_ == null) {
        if (links_ != null) {
          links_ =
            org.tensorflow.proto.framework.LocalLinks.newBuilder(links_).mergeFrom(value).buildPartial();
        } else {
          links_ = value;
        }
        onChanged();
      } else {
        linksBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Optional local interconnect links to other devices.
     * </pre>
     *
     * <code>.tensorflow.LocalLinks links = 3;</code>
     */
    public Builder clearLinks() {
      if (linksBuilder_ == null) {
        links_ = null;
        onChanged();
      } else {
        links_ = null;
        linksBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Optional local interconnect links to other devices.
     * </pre>
     *
     * <code>.tensorflow.LocalLinks links = 3;</code>
     */
    public org.tensorflow.proto.framework.LocalLinks.Builder getLinksBuilder() {
      
      onChanged();
      return getLinksFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Optional local interconnect links to other devices.
     * </pre>
     *
     * <code>.tensorflow.LocalLinks links = 3;</code>
     */
    public org.tensorflow.proto.framework.LocalLinksOrBuilder getLinksOrBuilder() {
      if (linksBuilder_ != null) {
        return linksBuilder_.getMessageOrBuilder();
      } else {
        return links_ == null ?
            org.tensorflow.proto.framework.LocalLinks.getDefaultInstance() : links_;
      }
    }
    /**
     * <pre>
     * Optional local interconnect links to other devices.
     * </pre>
     *
     * <code>.tensorflow.LocalLinks links = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.tensorflow.proto.framework.LocalLinks, org.tensorflow.proto.framework.LocalLinks.Builder, org.tensorflow.proto.framework.LocalLinksOrBuilder> 
        getLinksFieldBuilder() {
      if (linksBuilder_ == null) {
        linksBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.tensorflow.proto.framework.LocalLinks, org.tensorflow.proto.framework.LocalLinks.Builder, org.tensorflow.proto.framework.LocalLinksOrBuilder>(
                getLinks(),
                getParentForChildren(),
                isClean());
        links_ = null;
      }
      return linksBuilder_;
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


    // @@protoc_insertion_point(builder_scope:tensorflow.DeviceLocality)
  }

  // @@protoc_insertion_point(class_scope:tensorflow.DeviceLocality)
  private static final org.tensorflow.proto.framework.DeviceLocality DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.tensorflow.proto.framework.DeviceLocality();
  }

  public static org.tensorflow.proto.framework.DeviceLocality getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DeviceLocality>
      PARSER = new com.google.protobuf.AbstractParser<DeviceLocality>() {
    @java.lang.Override
    public DeviceLocality parsePartialFrom(
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

  public static com.google.protobuf.Parser<DeviceLocality> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DeviceLocality> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.tensorflow.proto.framework.DeviceLocality getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

