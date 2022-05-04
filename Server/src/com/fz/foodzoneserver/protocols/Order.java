// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PATH/MessageWrapper.proto

package com.fz.foodzoneserver.protocols;

/**
 * Protobuf type {@code foodzone_protocols.Order}
 */
public final class Order extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:foodzone_protocols.Order)
    OrderOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Order.newBuilder() to construct.
  private Order(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Order() {
    date_ = "";
    desc_ = "";
    state_ = "";
    recipientName_ = "";
    restaurant_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Order();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Order(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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

            date_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            desc_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            state_ = s;
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            recipientName_ = s;
            break;
          }
          case 40: {

            price_ = input.readInt32();
            break;
          }
          case 50: {
            java.lang.String s = input.readStringRequireUtf8();

            restaurant_ = s;
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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.fz.foodzoneserver.protocols.MessageWrapper.internal_static_foodzone_protocols_Order_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.fz.foodzoneserver.protocols.MessageWrapper.internal_static_foodzone_protocols_Order_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.fz.foodzoneserver.protocols.Order.class, com.fz.foodzoneserver.protocols.Order.Builder.class);
  }

  public static final int DATE_FIELD_NUMBER = 1;
  private volatile java.lang.Object date_;
  /**
   * <code>string date = 1;</code>
   * @return The date.
   */
  @java.lang.Override
  public java.lang.String getDate() {
    java.lang.Object ref = date_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      date_ = s;
      return s;
    }
  }
  /**
   * <code>string date = 1;</code>
   * @return The bytes for date.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDateBytes() {
    java.lang.Object ref = date_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      date_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DESC_FIELD_NUMBER = 2;
  private volatile java.lang.Object desc_;
  /**
   * <code>string desc = 2;</code>
   * @return The desc.
   */
  @java.lang.Override
  public java.lang.String getDesc() {
    java.lang.Object ref = desc_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      desc_ = s;
      return s;
    }
  }
  /**
   * <code>string desc = 2;</code>
   * @return The bytes for desc.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDescBytes() {
    java.lang.Object ref = desc_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      desc_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int STATE_FIELD_NUMBER = 3;
  private volatile java.lang.Object state_;
  /**
   * <code>string state = 3;</code>
   * @return The state.
   */
  @java.lang.Override
  public java.lang.String getState() {
    java.lang.Object ref = state_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      state_ = s;
      return s;
    }
  }
  /**
   * <code>string state = 3;</code>
   * @return The bytes for state.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getStateBytes() {
    java.lang.Object ref = state_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      state_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int RECIPIENTNAME_FIELD_NUMBER = 4;
  private volatile java.lang.Object recipientName_;
  /**
   * <code>string recipientName = 4;</code>
   * @return The recipientName.
   */
  @java.lang.Override
  public java.lang.String getRecipientName() {
    java.lang.Object ref = recipientName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      recipientName_ = s;
      return s;
    }
  }
  /**
   * <code>string recipientName = 4;</code>
   * @return The bytes for recipientName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getRecipientNameBytes() {
    java.lang.Object ref = recipientName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      recipientName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PRICE_FIELD_NUMBER = 5;
  private int price_;
  /**
   * <code>int32 price = 5;</code>
   * @return The price.
   */
  @java.lang.Override
  public int getPrice() {
    return price_;
  }

  public static final int RESTAURANT_FIELD_NUMBER = 6;
  private volatile java.lang.Object restaurant_;
  /**
   * <code>string restaurant = 6;</code>
   * @return The restaurant.
   */
  @java.lang.Override
  public java.lang.String getRestaurant() {
    java.lang.Object ref = restaurant_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      restaurant_ = s;
      return s;
    }
  }
  /**
   * <code>string restaurant = 6;</code>
   * @return The bytes for restaurant.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getRestaurantBytes() {
    java.lang.Object ref = restaurant_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      restaurant_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(date_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, date_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(desc_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, desc_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(state_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, state_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(recipientName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, recipientName_);
    }
    if (price_ != 0) {
      output.writeInt32(5, price_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(restaurant_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 6, restaurant_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(date_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, date_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(desc_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, desc_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(state_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, state_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(recipientName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, recipientName_);
    }
    if (price_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(5, price_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(restaurant_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(6, restaurant_);
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
    if (!(obj instanceof com.fz.foodzoneserver.protocols.Order)) {
      return super.equals(obj);
    }
    com.fz.foodzoneserver.protocols.Order other = (com.fz.foodzoneserver.protocols.Order) obj;

    if (!getDate()
        .equals(other.getDate())) return false;
    if (!getDesc()
        .equals(other.getDesc())) return false;
    if (!getState()
        .equals(other.getState())) return false;
    if (!getRecipientName()
        .equals(other.getRecipientName())) return false;
    if (getPrice()
        != other.getPrice()) return false;
    if (!getRestaurant()
        .equals(other.getRestaurant())) return false;
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
    hash = (37 * hash) + DATE_FIELD_NUMBER;
    hash = (53 * hash) + getDate().hashCode();
    hash = (37 * hash) + DESC_FIELD_NUMBER;
    hash = (53 * hash) + getDesc().hashCode();
    hash = (37 * hash) + STATE_FIELD_NUMBER;
    hash = (53 * hash) + getState().hashCode();
    hash = (37 * hash) + RECIPIENTNAME_FIELD_NUMBER;
    hash = (53 * hash) + getRecipientName().hashCode();
    hash = (37 * hash) + PRICE_FIELD_NUMBER;
    hash = (53 * hash) + getPrice();
    hash = (37 * hash) + RESTAURANT_FIELD_NUMBER;
    hash = (53 * hash) + getRestaurant().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.fz.foodzoneserver.protocols.Order parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.fz.foodzoneserver.protocols.Order parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.fz.foodzoneserver.protocols.Order parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.fz.foodzoneserver.protocols.Order parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.fz.foodzoneserver.protocols.Order parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.fz.foodzoneserver.protocols.Order parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.fz.foodzoneserver.protocols.Order parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.fz.foodzoneserver.protocols.Order parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.fz.foodzoneserver.protocols.Order parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.fz.foodzoneserver.protocols.Order parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.fz.foodzoneserver.protocols.Order parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.fz.foodzoneserver.protocols.Order parseFrom(
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
  public static Builder newBuilder(com.fz.foodzoneserver.protocols.Order prototype) {
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
   * Protobuf type {@code foodzone_protocols.Order}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:foodzone_protocols.Order)
      com.fz.foodzoneserver.protocols.OrderOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.fz.foodzoneserver.protocols.MessageWrapper.internal_static_foodzone_protocols_Order_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.fz.foodzoneserver.protocols.MessageWrapper.internal_static_foodzone_protocols_Order_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.fz.foodzoneserver.protocols.Order.class, com.fz.foodzoneserver.protocols.Order.Builder.class);
    }

    // Construct using com.fz.foodzoneserver.protocols.Order.newBuilder()
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
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      date_ = "";

      desc_ = "";

      state_ = "";

      recipientName_ = "";

      price_ = 0;

      restaurant_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.fz.foodzoneserver.protocols.MessageWrapper.internal_static_foodzone_protocols_Order_descriptor;
    }

    @java.lang.Override
    public com.fz.foodzoneserver.protocols.Order getDefaultInstanceForType() {
      return com.fz.foodzoneserver.protocols.Order.getDefaultInstance();
    }

    @java.lang.Override
    public com.fz.foodzoneserver.protocols.Order build() {
      com.fz.foodzoneserver.protocols.Order result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.fz.foodzoneserver.protocols.Order buildPartial() {
      com.fz.foodzoneserver.protocols.Order result = new com.fz.foodzoneserver.protocols.Order(this);
      result.date_ = date_;
      result.desc_ = desc_;
      result.state_ = state_;
      result.recipientName_ = recipientName_;
      result.price_ = price_;
      result.restaurant_ = restaurant_;
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
      if (other instanceof com.fz.foodzoneserver.protocols.Order) {
        return mergeFrom((com.fz.foodzoneserver.protocols.Order)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.fz.foodzoneserver.protocols.Order other) {
      if (other == com.fz.foodzoneserver.protocols.Order.getDefaultInstance()) return this;
      if (!other.getDate().isEmpty()) {
        date_ = other.date_;
        onChanged();
      }
      if (!other.getDesc().isEmpty()) {
        desc_ = other.desc_;
        onChanged();
      }
      if (!other.getState().isEmpty()) {
        state_ = other.state_;
        onChanged();
      }
      if (!other.getRecipientName().isEmpty()) {
        recipientName_ = other.recipientName_;
        onChanged();
      }
      if (other.getPrice() != 0) {
        setPrice(other.getPrice());
      }
      if (!other.getRestaurant().isEmpty()) {
        restaurant_ = other.restaurant_;
        onChanged();
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
      com.fz.foodzoneserver.protocols.Order parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.fz.foodzoneserver.protocols.Order) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object date_ = "";
    /**
     * <code>string date = 1;</code>
     * @return The date.
     */
    public java.lang.String getDate() {
      java.lang.Object ref = date_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        date_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string date = 1;</code>
     * @return The bytes for date.
     */
    public com.google.protobuf.ByteString
        getDateBytes() {
      java.lang.Object ref = date_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        date_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string date = 1;</code>
     * @param value The date to set.
     * @return This builder for chaining.
     */
    public Builder setDate(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      date_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string date = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearDate() {
      
      date_ = getDefaultInstance().getDate();
      onChanged();
      return this;
    }
    /**
     * <code>string date = 1;</code>
     * @param value The bytes for date to set.
     * @return This builder for chaining.
     */
    public Builder setDateBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      date_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object desc_ = "";
    /**
     * <code>string desc = 2;</code>
     * @return The desc.
     */
    public java.lang.String getDesc() {
      java.lang.Object ref = desc_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        desc_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string desc = 2;</code>
     * @return The bytes for desc.
     */
    public com.google.protobuf.ByteString
        getDescBytes() {
      java.lang.Object ref = desc_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        desc_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string desc = 2;</code>
     * @param value The desc to set.
     * @return This builder for chaining.
     */
    public Builder setDesc(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      desc_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string desc = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearDesc() {
      
      desc_ = getDefaultInstance().getDesc();
      onChanged();
      return this;
    }
    /**
     * <code>string desc = 2;</code>
     * @param value The bytes for desc to set.
     * @return This builder for chaining.
     */
    public Builder setDescBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      desc_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object state_ = "";
    /**
     * <code>string state = 3;</code>
     * @return The state.
     */
    public java.lang.String getState() {
      java.lang.Object ref = state_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        state_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string state = 3;</code>
     * @return The bytes for state.
     */
    public com.google.protobuf.ByteString
        getStateBytes() {
      java.lang.Object ref = state_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        state_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string state = 3;</code>
     * @param value The state to set.
     * @return This builder for chaining.
     */
    public Builder setState(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      state_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string state = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearState() {
      
      state_ = getDefaultInstance().getState();
      onChanged();
      return this;
    }
    /**
     * <code>string state = 3;</code>
     * @param value The bytes for state to set.
     * @return This builder for chaining.
     */
    public Builder setStateBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      state_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object recipientName_ = "";
    /**
     * <code>string recipientName = 4;</code>
     * @return The recipientName.
     */
    public java.lang.String getRecipientName() {
      java.lang.Object ref = recipientName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        recipientName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string recipientName = 4;</code>
     * @return The bytes for recipientName.
     */
    public com.google.protobuf.ByteString
        getRecipientNameBytes() {
      java.lang.Object ref = recipientName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        recipientName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string recipientName = 4;</code>
     * @param value The recipientName to set.
     * @return This builder for chaining.
     */
    public Builder setRecipientName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      recipientName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string recipientName = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearRecipientName() {
      
      recipientName_ = getDefaultInstance().getRecipientName();
      onChanged();
      return this;
    }
    /**
     * <code>string recipientName = 4;</code>
     * @param value The bytes for recipientName to set.
     * @return This builder for chaining.
     */
    public Builder setRecipientNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      recipientName_ = value;
      onChanged();
      return this;
    }

    private int price_ ;
    /**
     * <code>int32 price = 5;</code>
     * @return The price.
     */
    @java.lang.Override
    public int getPrice() {
      return price_;
    }
    /**
     * <code>int32 price = 5;</code>
     * @param value The price to set.
     * @return This builder for chaining.
     */
    public Builder setPrice(int value) {
      
      price_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 price = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearPrice() {
      
      price_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object restaurant_ = "";
    /**
     * <code>string restaurant = 6;</code>
     * @return The restaurant.
     */
    public java.lang.String getRestaurant() {
      java.lang.Object ref = restaurant_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        restaurant_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string restaurant = 6;</code>
     * @return The bytes for restaurant.
     */
    public com.google.protobuf.ByteString
        getRestaurantBytes() {
      java.lang.Object ref = restaurant_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        restaurant_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string restaurant = 6;</code>
     * @param value The restaurant to set.
     * @return This builder for chaining.
     */
    public Builder setRestaurant(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      restaurant_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string restaurant = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearRestaurant() {
      
      restaurant_ = getDefaultInstance().getRestaurant();
      onChanged();
      return this;
    }
    /**
     * <code>string restaurant = 6;</code>
     * @param value The bytes for restaurant to set.
     * @return This builder for chaining.
     */
    public Builder setRestaurantBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      restaurant_ = value;
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


    // @@protoc_insertion_point(builder_scope:foodzone_protocols.Order)
  }

  // @@protoc_insertion_point(class_scope:foodzone_protocols.Order)
  private static final com.fz.foodzoneserver.protocols.Order DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.fz.foodzoneserver.protocols.Order();
  }

  public static com.fz.foodzoneserver.protocols.Order getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Order>
      PARSER = new com.google.protobuf.AbstractParser<Order>() {
    @java.lang.Override
    public Order parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Order(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Order> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Order> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.fz.foodzoneserver.protocols.Order getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
