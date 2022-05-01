// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PATH/MessageWrapper.proto

package com.fz.foodzoneserver.protocols;

/**
 * Protobuf type {@code foodzone_protocols.RestaurantListResponse}
 */
public final class RestaurantListResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:foodzone_protocols.RestaurantListResponse)
    RestaurantListResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RestaurantListResponse.newBuilder() to construct.
  private RestaurantListResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RestaurantListResponse() {
    result_ = "";
    restaurant_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new RestaurantListResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private RestaurantListResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
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

            result_ = s;
            break;
          }
          case 18: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              restaurant_ = new java.util.ArrayList<com.fz.foodzoneserver.protocols.RestaurantInfo>();
              mutable_bitField0_ |= 0x00000001;
            }
            restaurant_.add(
                input.readMessage(com.fz.foodzoneserver.protocols.RestaurantInfo.parser(), extensionRegistry));
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        restaurant_ = java.util.Collections.unmodifiableList(restaurant_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.fz.foodzoneserver.protocols.MessageWrapper.internal_static_foodzone_protocols_RestaurantListResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.fz.foodzoneserver.protocols.MessageWrapper.internal_static_foodzone_protocols_RestaurantListResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.fz.foodzoneserver.protocols.RestaurantListResponse.class, com.fz.foodzoneserver.protocols.RestaurantListResponse.Builder.class);
  }

  public static final int RESULT_FIELD_NUMBER = 1;
  private volatile java.lang.Object result_;
  /**
   * <code>string result = 1;</code>
   * @return The result.
   */
  @java.lang.Override
  public java.lang.String getResult() {
    java.lang.Object ref = result_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      result_ = s;
      return s;
    }
  }
  /**
   * <code>string result = 1;</code>
   * @return The bytes for result.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getResultBytes() {
    java.lang.Object ref = result_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      result_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int RESTAURANT_FIELD_NUMBER = 2;
  private java.util.List<com.fz.foodzoneserver.protocols.RestaurantInfo> restaurant_;
  /**
   * <code>repeated .foodzone_protocols.RestaurantInfo restaurant = 2;</code>
   */
  @java.lang.Override
  public java.util.List<com.fz.foodzoneserver.protocols.RestaurantInfo> getRestaurantList() {
    return restaurant_;
  }
  /**
   * <code>repeated .foodzone_protocols.RestaurantInfo restaurant = 2;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.fz.foodzoneserver.protocols.RestaurantInfoOrBuilder> 
      getRestaurantOrBuilderList() {
    return restaurant_;
  }
  /**
   * <code>repeated .foodzone_protocols.RestaurantInfo restaurant = 2;</code>
   */
  @java.lang.Override
  public int getRestaurantCount() {
    return restaurant_.size();
  }
  /**
   * <code>repeated .foodzone_protocols.RestaurantInfo restaurant = 2;</code>
   */
  @java.lang.Override
  public com.fz.foodzoneserver.protocols.RestaurantInfo getRestaurant(int index) {
    return restaurant_.get(index);
  }
  /**
   * <code>repeated .foodzone_protocols.RestaurantInfo restaurant = 2;</code>
   */
  @java.lang.Override
  public com.fz.foodzoneserver.protocols.RestaurantInfoOrBuilder getRestaurantOrBuilder(
      int index) {
    return restaurant_.get(index);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(result_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, result_);
    }
    for (int i = 0; i < restaurant_.size(); i++) {
      output.writeMessage(2, restaurant_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(result_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, result_);
    }
    for (int i = 0; i < restaurant_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, restaurant_.get(i));
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.fz.foodzoneserver.protocols.RestaurantListResponse)) {
      return super.equals(obj);
    }
    com.fz.foodzoneserver.protocols.RestaurantListResponse other = (com.fz.foodzoneserver.protocols.RestaurantListResponse) obj;

    if (!getResult()
        .equals(other.getResult())) return false;
    if (!getRestaurantList()
        .equals(other.getRestaurantList())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + RESULT_FIELD_NUMBER;
    hash = (53 * hash) + getResult().hashCode();
    if (getRestaurantCount() > 0) {
      hash = (37 * hash) + RESTAURANT_FIELD_NUMBER;
      hash = (53 * hash) + getRestaurantList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.fz.foodzoneserver.protocols.RestaurantListResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.fz.foodzoneserver.protocols.RestaurantListResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.fz.foodzoneserver.protocols.RestaurantListResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.fz.foodzoneserver.protocols.RestaurantListResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.fz.foodzoneserver.protocols.RestaurantListResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.fz.foodzoneserver.protocols.RestaurantListResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.fz.foodzoneserver.protocols.RestaurantListResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.fz.foodzoneserver.protocols.RestaurantListResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.fz.foodzoneserver.protocols.RestaurantListResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.fz.foodzoneserver.protocols.RestaurantListResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.fz.foodzoneserver.protocols.RestaurantListResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.fz.foodzoneserver.protocols.RestaurantListResponse parseFrom(
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
  public static Builder newBuilder(com.fz.foodzoneserver.protocols.RestaurantListResponse prototype) {
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
   * Protobuf type {@code foodzone_protocols.RestaurantListResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:foodzone_protocols.RestaurantListResponse)
      com.fz.foodzoneserver.protocols.RestaurantListResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.fz.foodzoneserver.protocols.MessageWrapper.internal_static_foodzone_protocols_RestaurantListResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.fz.foodzoneserver.protocols.MessageWrapper.internal_static_foodzone_protocols_RestaurantListResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.fz.foodzoneserver.protocols.RestaurantListResponse.class, com.fz.foodzoneserver.protocols.RestaurantListResponse.Builder.class);
    }

    // Construct using com.fz.foodzoneserver.protocols.RestaurantListResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getRestaurantFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      result_ = "";

      if (restaurantBuilder_ == null) {
        restaurant_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        restaurantBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.fz.foodzoneserver.protocols.MessageWrapper.internal_static_foodzone_protocols_RestaurantListResponse_descriptor;
    }

    @java.lang.Override
    public com.fz.foodzoneserver.protocols.RestaurantListResponse getDefaultInstanceForType() {
      return com.fz.foodzoneserver.protocols.RestaurantListResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.fz.foodzoneserver.protocols.RestaurantListResponse build() {
      com.fz.foodzoneserver.protocols.RestaurantListResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.fz.foodzoneserver.protocols.RestaurantListResponse buildPartial() {
      com.fz.foodzoneserver.protocols.RestaurantListResponse result = new com.fz.foodzoneserver.protocols.RestaurantListResponse(this);
      int from_bitField0_ = bitField0_;
      result.result_ = result_;
      if (restaurantBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          restaurant_ = java.util.Collections.unmodifiableList(restaurant_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.restaurant_ = restaurant_;
      } else {
        result.restaurant_ = restaurantBuilder_.build();
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
      if (other instanceof com.fz.foodzoneserver.protocols.RestaurantListResponse) {
        return mergeFrom((com.fz.foodzoneserver.protocols.RestaurantListResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.fz.foodzoneserver.protocols.RestaurantListResponse other) {
      if (other == com.fz.foodzoneserver.protocols.RestaurantListResponse.getDefaultInstance()) return this;
      if (!other.getResult().isEmpty()) {
        result_ = other.result_;
        onChanged();
      }
      if (restaurantBuilder_ == null) {
        if (!other.restaurant_.isEmpty()) {
          if (restaurant_.isEmpty()) {
            restaurant_ = other.restaurant_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureRestaurantIsMutable();
            restaurant_.addAll(other.restaurant_);
          }
          onChanged();
        }
      } else {
        if (!other.restaurant_.isEmpty()) {
          if (restaurantBuilder_.isEmpty()) {
            restaurantBuilder_.dispose();
            restaurantBuilder_ = null;
            restaurant_ = other.restaurant_;
            bitField0_ = (bitField0_ & ~0x00000001);
            restaurantBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getRestaurantFieldBuilder() : null;
          } else {
            restaurantBuilder_.addAllMessages(other.restaurant_);
          }
        }
      }
      this.mergeUnknownFields(other.unknownFields);
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
      com.fz.foodzoneserver.protocols.RestaurantListResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.fz.foodzoneserver.protocols.RestaurantListResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object result_ = "";
    /**
     * <code>string result = 1;</code>
     * @return The result.
     */
    public java.lang.String getResult() {
      java.lang.Object ref = result_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        result_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string result = 1;</code>
     * @return The bytes for result.
     */
    public com.google.protobuf.ByteString
        getResultBytes() {
      java.lang.Object ref = result_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        result_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string result = 1;</code>
     * @param value The result to set.
     * @return This builder for chaining.
     */
    public Builder setResult(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      result_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string result = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearResult() {
      
      result_ = getDefaultInstance().getResult();
      onChanged();
      return this;
    }
    /**
     * <code>string result = 1;</code>
     * @param value The bytes for result to set.
     * @return This builder for chaining.
     */
    public Builder setResultBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      result_ = value;
      onChanged();
      return this;
    }

    private java.util.List<com.fz.foodzoneserver.protocols.RestaurantInfo> restaurant_ =
      java.util.Collections.emptyList();
    private void ensureRestaurantIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        restaurant_ = new java.util.ArrayList<com.fz.foodzoneserver.protocols.RestaurantInfo>(restaurant_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.fz.foodzoneserver.protocols.RestaurantInfo, com.fz.foodzoneserver.protocols.RestaurantInfo.Builder, com.fz.foodzoneserver.protocols.RestaurantInfoOrBuilder> restaurantBuilder_;

    /**
     * <code>repeated .foodzone_protocols.RestaurantInfo restaurant = 2;</code>
     */
    public java.util.List<com.fz.foodzoneserver.protocols.RestaurantInfo> getRestaurantList() {
      if (restaurantBuilder_ == null) {
        return java.util.Collections.unmodifiableList(restaurant_);
      } else {
        return restaurantBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .foodzone_protocols.RestaurantInfo restaurant = 2;</code>
     */
    public int getRestaurantCount() {
      if (restaurantBuilder_ == null) {
        return restaurant_.size();
      } else {
        return restaurantBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .foodzone_protocols.RestaurantInfo restaurant = 2;</code>
     */
    public com.fz.foodzoneserver.protocols.RestaurantInfo getRestaurant(int index) {
      if (restaurantBuilder_ == null) {
        return restaurant_.get(index);
      } else {
        return restaurantBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .foodzone_protocols.RestaurantInfo restaurant = 2;</code>
     */
    public Builder setRestaurant(
        int index, com.fz.foodzoneserver.protocols.RestaurantInfo value) {
      if (restaurantBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRestaurantIsMutable();
        restaurant_.set(index, value);
        onChanged();
      } else {
        restaurantBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .foodzone_protocols.RestaurantInfo restaurant = 2;</code>
     */
    public Builder setRestaurant(
        int index, com.fz.foodzoneserver.protocols.RestaurantInfo.Builder builderForValue) {
      if (restaurantBuilder_ == null) {
        ensureRestaurantIsMutable();
        restaurant_.set(index, builderForValue.build());
        onChanged();
      } else {
        restaurantBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .foodzone_protocols.RestaurantInfo restaurant = 2;</code>
     */
    public Builder addRestaurant(com.fz.foodzoneserver.protocols.RestaurantInfo value) {
      if (restaurantBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRestaurantIsMutable();
        restaurant_.add(value);
        onChanged();
      } else {
        restaurantBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .foodzone_protocols.RestaurantInfo restaurant = 2;</code>
     */
    public Builder addRestaurant(
        int index, com.fz.foodzoneserver.protocols.RestaurantInfo value) {
      if (restaurantBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRestaurantIsMutable();
        restaurant_.add(index, value);
        onChanged();
      } else {
        restaurantBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .foodzone_protocols.RestaurantInfo restaurant = 2;</code>
     */
    public Builder addRestaurant(
        com.fz.foodzoneserver.protocols.RestaurantInfo.Builder builderForValue) {
      if (restaurantBuilder_ == null) {
        ensureRestaurantIsMutable();
        restaurant_.add(builderForValue.build());
        onChanged();
      } else {
        restaurantBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .foodzone_protocols.RestaurantInfo restaurant = 2;</code>
     */
    public Builder addRestaurant(
        int index, com.fz.foodzoneserver.protocols.RestaurantInfo.Builder builderForValue) {
      if (restaurantBuilder_ == null) {
        ensureRestaurantIsMutable();
        restaurant_.add(index, builderForValue.build());
        onChanged();
      } else {
        restaurantBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .foodzone_protocols.RestaurantInfo restaurant = 2;</code>
     */
    public Builder addAllRestaurant(
        java.lang.Iterable<? extends com.fz.foodzoneserver.protocols.RestaurantInfo> values) {
      if (restaurantBuilder_ == null) {
        ensureRestaurantIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, restaurant_);
        onChanged();
      } else {
        restaurantBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .foodzone_protocols.RestaurantInfo restaurant = 2;</code>
     */
    public Builder clearRestaurant() {
      if (restaurantBuilder_ == null) {
        restaurant_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        restaurantBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .foodzone_protocols.RestaurantInfo restaurant = 2;</code>
     */
    public Builder removeRestaurant(int index) {
      if (restaurantBuilder_ == null) {
        ensureRestaurantIsMutable();
        restaurant_.remove(index);
        onChanged();
      } else {
        restaurantBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .foodzone_protocols.RestaurantInfo restaurant = 2;</code>
     */
    public com.fz.foodzoneserver.protocols.RestaurantInfo.Builder getRestaurantBuilder(
        int index) {
      return getRestaurantFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .foodzone_protocols.RestaurantInfo restaurant = 2;</code>
     */
    public com.fz.foodzoneserver.protocols.RestaurantInfoOrBuilder getRestaurantOrBuilder(
        int index) {
      if (restaurantBuilder_ == null) {
        return restaurant_.get(index);  } else {
        return restaurantBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .foodzone_protocols.RestaurantInfo restaurant = 2;</code>
     */
    public java.util.List<? extends com.fz.foodzoneserver.protocols.RestaurantInfoOrBuilder> 
         getRestaurantOrBuilderList() {
      if (restaurantBuilder_ != null) {
        return restaurantBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(restaurant_);
      }
    }
    /**
     * <code>repeated .foodzone_protocols.RestaurantInfo restaurant = 2;</code>
     */
    public com.fz.foodzoneserver.protocols.RestaurantInfo.Builder addRestaurantBuilder() {
      return getRestaurantFieldBuilder().addBuilder(
          com.fz.foodzoneserver.protocols.RestaurantInfo.getDefaultInstance());
    }
    /**
     * <code>repeated .foodzone_protocols.RestaurantInfo restaurant = 2;</code>
     */
    public com.fz.foodzoneserver.protocols.RestaurantInfo.Builder addRestaurantBuilder(
        int index) {
      return getRestaurantFieldBuilder().addBuilder(
          index, com.fz.foodzoneserver.protocols.RestaurantInfo.getDefaultInstance());
    }
    /**
     * <code>repeated .foodzone_protocols.RestaurantInfo restaurant = 2;</code>
     */
    public java.util.List<com.fz.foodzoneserver.protocols.RestaurantInfo.Builder> 
         getRestaurantBuilderList() {
      return getRestaurantFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.fz.foodzoneserver.protocols.RestaurantInfo, com.fz.foodzoneserver.protocols.RestaurantInfo.Builder, com.fz.foodzoneserver.protocols.RestaurantInfoOrBuilder> 
        getRestaurantFieldBuilder() {
      if (restaurantBuilder_ == null) {
        restaurantBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.fz.foodzoneserver.protocols.RestaurantInfo, com.fz.foodzoneserver.protocols.RestaurantInfo.Builder, com.fz.foodzoneserver.protocols.RestaurantInfoOrBuilder>(
                restaurant_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        restaurant_ = null;
      }
      return restaurantBuilder_;
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


    // @@protoc_insertion_point(builder_scope:foodzone_protocols.RestaurantListResponse)
  }

  // @@protoc_insertion_point(class_scope:foodzone_protocols.RestaurantListResponse)
  private static final com.fz.foodzoneserver.protocols.RestaurantListResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.fz.foodzoneserver.protocols.RestaurantListResponse();
  }

  public static com.fz.foodzoneserver.protocols.RestaurantListResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RestaurantListResponse>
      PARSER = new com.google.protobuf.AbstractParser<RestaurantListResponse>() {
    @java.lang.Override
    public RestaurantListResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new RestaurantListResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<RestaurantListResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RestaurantListResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.fz.foodzoneserver.protocols.RestaurantListResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
