// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PATH/MessageWrapper.proto

package com.example.foodzoneclient.protocols;

/**
 * Protobuf type {@code foodzone_protocols.FoodInfo}
 */
public  final class FoodInfo extends
    com.google.protobuf.GeneratedMessageLite<
        FoodInfo, FoodInfo.Builder> implements
    // @@protoc_insertion_point(message_implements:foodzone_protocols.FoodInfo)
    FoodInfoOrBuilder {
  private FoodInfo() {
    iD_ = "";
    name_ = "";
    description_ = "";
    image_ = "";
  }
  public static final int ID_FIELD_NUMBER = 1;
  private java.lang.String iD_;
  /**
   * <code>string ID = 1;</code>
   * @return The iD.
   */
  @java.lang.Override
  public java.lang.String getID() {
    return iD_;
  }
  /**
   * <code>string ID = 1;</code>
   * @return The bytes for iD.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getIDBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(iD_);
  }
  /**
   * <code>string ID = 1;</code>
   * @param value The iD to set.
   */
  private void setID(
      java.lang.String value) {
    java.lang.Class<?> valueClass = value.getClass();
  
    iD_ = value;
  }
  /**
   * <code>string ID = 1;</code>
   */
  private void clearID() {
    
    iD_ = getDefaultInstance().getID();
  }
  /**
   * <code>string ID = 1;</code>
   * @param value The bytes for iD to set.
   */
  private void setIDBytes(
      com.google.protobuf.ByteString value) {
    checkByteStringIsUtf8(value);
    iD_ = value.toStringUtf8();
    
  }

  public static final int NAME_FIELD_NUMBER = 2;
  private java.lang.String name_;
  /**
   * <code>string name = 2;</code>
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    return name_;
  }
  /**
   * <code>string name = 2;</code>
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNameBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(name_);
  }
  /**
   * <code>string name = 2;</code>
   * @param value The name to set.
   */
  private void setName(
      java.lang.String value) {
    java.lang.Class<?> valueClass = value.getClass();
  
    name_ = value;
  }
  /**
   * <code>string name = 2;</code>
   */
  private void clearName() {
    
    name_ = getDefaultInstance().getName();
  }
  /**
   * <code>string name = 2;</code>
   * @param value The bytes for name to set.
   */
  private void setNameBytes(
      com.google.protobuf.ByteString value) {
    checkByteStringIsUtf8(value);
    name_ = value.toStringUtf8();
    
  }

  public static final int DESCRIPTION_FIELD_NUMBER = 3;
  private java.lang.String description_;
  /**
   * <code>string description = 3;</code>
   * @return The description.
   */
  @java.lang.Override
  public java.lang.String getDescription() {
    return description_;
  }
  /**
   * <code>string description = 3;</code>
   * @return The bytes for description.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDescriptionBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(description_);
  }
  /**
   * <code>string description = 3;</code>
   * @param value The description to set.
   */
  private void setDescription(
      java.lang.String value) {
    java.lang.Class<?> valueClass = value.getClass();
  
    description_ = value;
  }
  /**
   * <code>string description = 3;</code>
   */
  private void clearDescription() {
    
    description_ = getDefaultInstance().getDescription();
  }
  /**
   * <code>string description = 3;</code>
   * @param value The bytes for description to set.
   */
  private void setDescriptionBytes(
      com.google.protobuf.ByteString value) {
    checkByteStringIsUtf8(value);
    description_ = value.toStringUtf8();
    
  }

  public static final int PRICE_FIELD_NUMBER = 4;
  private int price_;
  /**
   * <code>int32 price = 4;</code>
   * @return The price.
   */
  @java.lang.Override
  public int getPrice() {
    return price_;
  }
  /**
   * <code>int32 price = 4;</code>
   * @param value The price to set.
   */
  private void setPrice(int value) {
    
    price_ = value;
  }
  /**
   * <code>int32 price = 4;</code>
   */
  private void clearPrice() {
    
    price_ = 0;
  }

  public static final int IMAGE_FIELD_NUMBER = 5;
  private java.lang.String image_;
  /**
   * <code>string image = 5;</code>
   * @return The image.
   */
  @java.lang.Override
  public java.lang.String getImage() {
    return image_;
  }
  /**
   * <code>string image = 5;</code>
   * @return The bytes for image.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getImageBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(image_);
  }
  /**
   * <code>string image = 5;</code>
   * @param value The image to set.
   */
  private void setImage(
      java.lang.String value) {
    java.lang.Class<?> valueClass = value.getClass();
  
    image_ = value;
  }
  /**
   * <code>string image = 5;</code>
   */
  private void clearImage() {
    
    image_ = getDefaultInstance().getImage();
  }
  /**
   * <code>string image = 5;</code>
   * @param value The bytes for image to set.
   */
  private void setImageBytes(
      com.google.protobuf.ByteString value) {
    checkByteStringIsUtf8(value);
    image_ = value.toStringUtf8();
    
  }

  public static com.example.foodzoneclient.protocols.FoodInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.example.foodzoneclient.protocols.FoodInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.example.foodzoneclient.protocols.FoodInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.example.foodzoneclient.protocols.FoodInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.example.foodzoneclient.protocols.FoodInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.example.foodzoneclient.protocols.FoodInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.example.foodzoneclient.protocols.FoodInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.example.foodzoneclient.protocols.FoodInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.example.foodzoneclient.protocols.FoodInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static com.example.foodzoneclient.protocols.FoodInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.example.foodzoneclient.protocols.FoodInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.example.foodzoneclient.protocols.FoodInfo parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(com.example.foodzoneclient.protocols.FoodInfo prototype) {
    return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * Protobuf type {@code foodzone_protocols.FoodInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        com.example.foodzoneclient.protocols.FoodInfo, Builder> implements
      // @@protoc_insertion_point(builder_implements:foodzone_protocols.FoodInfo)
      com.example.foodzoneclient.protocols.FoodInfoOrBuilder {
    // Construct using com.example.foodzoneclient.protocols.FoodInfo.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <code>string ID = 1;</code>
     * @return The iD.
     */
    @java.lang.Override
    public java.lang.String getID() {
      return instance.getID();
    }
    /**
     * <code>string ID = 1;</code>
     * @return The bytes for iD.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getIDBytes() {
      return instance.getIDBytes();
    }
    /**
     * <code>string ID = 1;</code>
     * @param value The iD to set.
     * @return This builder for chaining.
     */
    public Builder setID(
        java.lang.String value) {
      copyOnWrite();
      instance.setID(value);
      return this;
    }
    /**
     * <code>string ID = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearID() {
      copyOnWrite();
      instance.clearID();
      return this;
    }
    /**
     * <code>string ID = 1;</code>
     * @param value The bytes for iD to set.
     * @return This builder for chaining.
     */
    public Builder setIDBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setIDBytes(value);
      return this;
    }

    /**
     * <code>string name = 2;</code>
     * @return The name.
     */
    @java.lang.Override
    public java.lang.String getName() {
      return instance.getName();
    }
    /**
     * <code>string name = 2;</code>
     * @return The bytes for name.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getNameBytes() {
      return instance.getNameBytes();
    }
    /**
     * <code>string name = 2;</code>
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(
        java.lang.String value) {
      copyOnWrite();
      instance.setName(value);
      return this;
    }
    /**
     * <code>string name = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      copyOnWrite();
      instance.clearName();
      return this;
    }
    /**
     * <code>string name = 2;</code>
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setNameBytes(value);
      return this;
    }

    /**
     * <code>string description = 3;</code>
     * @return The description.
     */
    @java.lang.Override
    public java.lang.String getDescription() {
      return instance.getDescription();
    }
    /**
     * <code>string description = 3;</code>
     * @return The bytes for description.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getDescriptionBytes() {
      return instance.getDescriptionBytes();
    }
    /**
     * <code>string description = 3;</code>
     * @param value The description to set.
     * @return This builder for chaining.
     */
    public Builder setDescription(
        java.lang.String value) {
      copyOnWrite();
      instance.setDescription(value);
      return this;
    }
    /**
     * <code>string description = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearDescription() {
      copyOnWrite();
      instance.clearDescription();
      return this;
    }
    /**
     * <code>string description = 3;</code>
     * @param value The bytes for description to set.
     * @return This builder for chaining.
     */
    public Builder setDescriptionBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setDescriptionBytes(value);
      return this;
    }

    /**
     * <code>int32 price = 4;</code>
     * @return The price.
     */
    @java.lang.Override
    public int getPrice() {
      return instance.getPrice();
    }
    /**
     * <code>int32 price = 4;</code>
     * @param value The price to set.
     * @return This builder for chaining.
     */
    public Builder setPrice(int value) {
      copyOnWrite();
      instance.setPrice(value);
      return this;
    }
    /**
     * <code>int32 price = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearPrice() {
      copyOnWrite();
      instance.clearPrice();
      return this;
    }

    /**
     * <code>string image = 5;</code>
     * @return The image.
     */
    @java.lang.Override
    public java.lang.String getImage() {
      return instance.getImage();
    }
    /**
     * <code>string image = 5;</code>
     * @return The bytes for image.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getImageBytes() {
      return instance.getImageBytes();
    }
    /**
     * <code>string image = 5;</code>
     * @param value The image to set.
     * @return This builder for chaining.
     */
    public Builder setImage(
        java.lang.String value) {
      copyOnWrite();
      instance.setImage(value);
      return this;
    }
    /**
     * <code>string image = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearImage() {
      copyOnWrite();
      instance.clearImage();
      return this;
    }
    /**
     * <code>string image = 5;</code>
     * @param value The bytes for image to set.
     * @return This builder for chaining.
     */
    public Builder setImageBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setImageBytes(value);
      return this;
    }

    // @@protoc_insertion_point(builder_scope:foodzone_protocols.FoodInfo)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new com.example.foodzoneclient.protocols.FoodInfo();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "iD_",
            "name_",
            "description_",
            "price_",
            "image_",
          };
          java.lang.String info =
              "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u0208\u0002\u0208" +
              "\u0003\u0208\u0004\u0004\u0005\u0208";
          return newMessageInfo(DEFAULT_INSTANCE, info, objects);
      }
      // fall through
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        com.google.protobuf.Parser<com.example.foodzoneclient.protocols.FoodInfo> parser = PARSER;
        if (parser == null) {
          synchronized (com.example.foodzoneclient.protocols.FoodInfo.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<com.example.foodzoneclient.protocols.FoodInfo>(
                      DEFAULT_INSTANCE);
              PARSER = parser;
            }
          }
        }
        return parser;
    }
    case GET_MEMOIZED_IS_INITIALIZED: {
      return (byte) 1;
    }
    case SET_MEMOIZED_IS_INITIALIZED: {
      return null;
    }
    }
    throw new UnsupportedOperationException();
  }


  // @@protoc_insertion_point(class_scope:foodzone_protocols.FoodInfo)
  private static final com.example.foodzoneclient.protocols.FoodInfo DEFAULT_INSTANCE;
  static {
    FoodInfo defaultInstance = new FoodInfo();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      FoodInfo.class, defaultInstance);
  }

  public static com.example.foodzoneclient.protocols.FoodInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<FoodInfo> PARSER;

  public static com.google.protobuf.Parser<FoodInfo> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

