// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PATH/MessageWrapper.proto

package com.example.foodzoneclient.protocols;

/**
 * Protobuf type {@code foodzone_protocols.UserInfo}
 */
public  final class UserInfo extends
    com.google.protobuf.GeneratedMessageLite<
        UserInfo, UserInfo.Builder> implements
    // @@protoc_insertion_point(message_implements:foodzone_protocols.UserInfo)
    UserInfoOrBuilder {
  private UserInfo() {
    username_ = "";
    fullname_ = "";
    id_ = "";
    address_ = "";
    phone_ = "";
    imgName_ = "";
  }
  public static final int USERNAME_FIELD_NUMBER = 1;
  private java.lang.String username_;
  /**
   * <code>string username = 1;</code>
   * @return The username.
   */
  @java.lang.Override
  public java.lang.String getUsername() {
    return username_;
  }
  /**
   * <code>string username = 1;</code>
   * @return The bytes for username.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getUsernameBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(username_);
  }
  /**
   * <code>string username = 1;</code>
   * @param value The username to set.
   */
  private void setUsername(
      java.lang.String value) {
    java.lang.Class<?> valueClass = value.getClass();
  
    username_ = value;
  }
  /**
   * <code>string username = 1;</code>
   */
  private void clearUsername() {
    
    username_ = getDefaultInstance().getUsername();
  }
  /**
   * <code>string username = 1;</code>
   * @param value The bytes for username to set.
   */
  private void setUsernameBytes(
      com.google.protobuf.ByteString value) {
    checkByteStringIsUtf8(value);
    username_ = value.toStringUtf8();
    
  }

  public static final int FULLNAME_FIELD_NUMBER = 2;
  private java.lang.String fullname_;
  /**
   * <code>string fullname = 2;</code>
   * @return The fullname.
   */
  @java.lang.Override
  public java.lang.String getFullname() {
    return fullname_;
  }
  /**
   * <code>string fullname = 2;</code>
   * @return The bytes for fullname.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getFullnameBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(fullname_);
  }
  /**
   * <code>string fullname = 2;</code>
   * @param value The fullname to set.
   */
  private void setFullname(
      java.lang.String value) {
    java.lang.Class<?> valueClass = value.getClass();
  
    fullname_ = value;
  }
  /**
   * <code>string fullname = 2;</code>
   */
  private void clearFullname() {
    
    fullname_ = getDefaultInstance().getFullname();
  }
  /**
   * <code>string fullname = 2;</code>
   * @param value The bytes for fullname to set.
   */
  private void setFullnameBytes(
      com.google.protobuf.ByteString value) {
    checkByteStringIsUtf8(value);
    fullname_ = value.toStringUtf8();
    
  }

  public static final int ID_FIELD_NUMBER = 3;
  private java.lang.String id_;
  /**
   * <code>string id = 3;</code>
   * @return The id.
   */
  @java.lang.Override
  public java.lang.String getId() {
    return id_;
  }
  /**
   * <code>string id = 3;</code>
   * @return The bytes for id.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getIdBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(id_);
  }
  /**
   * <code>string id = 3;</code>
   * @param value The id to set.
   */
  private void setId(
      java.lang.String value) {
    java.lang.Class<?> valueClass = value.getClass();
  
    id_ = value;
  }
  /**
   * <code>string id = 3;</code>
   */
  private void clearId() {
    
    id_ = getDefaultInstance().getId();
  }
  /**
   * <code>string id = 3;</code>
   * @param value The bytes for id to set.
   */
  private void setIdBytes(
      com.google.protobuf.ByteString value) {
    checkByteStringIsUtf8(value);
    id_ = value.toStringUtf8();
    
  }

  public static final int ADDRESS_FIELD_NUMBER = 4;
  private java.lang.String address_;
  /**
   * <code>string address = 4;</code>
   * @return The address.
   */
  @java.lang.Override
  public java.lang.String getAddress() {
    return address_;
  }
  /**
   * <code>string address = 4;</code>
   * @return The bytes for address.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getAddressBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(address_);
  }
  /**
   * <code>string address = 4;</code>
   * @param value The address to set.
   */
  private void setAddress(
      java.lang.String value) {
    java.lang.Class<?> valueClass = value.getClass();
  
    address_ = value;
  }
  /**
   * <code>string address = 4;</code>
   */
  private void clearAddress() {
    
    address_ = getDefaultInstance().getAddress();
  }
  /**
   * <code>string address = 4;</code>
   * @param value The bytes for address to set.
   */
  private void setAddressBytes(
      com.google.protobuf.ByteString value) {
    checkByteStringIsUtf8(value);
    address_ = value.toStringUtf8();
    
  }

  public static final int PHONE_FIELD_NUMBER = 5;
  private java.lang.String phone_;
  /**
   * <code>string phone = 5;</code>
   * @return The phone.
   */
  @java.lang.Override
  public java.lang.String getPhone() {
    return phone_;
  }
  /**
   * <code>string phone = 5;</code>
   * @return The bytes for phone.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getPhoneBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(phone_);
  }
  /**
   * <code>string phone = 5;</code>
   * @param value The phone to set.
   */
  private void setPhone(
      java.lang.String value) {
    java.lang.Class<?> valueClass = value.getClass();
  
    phone_ = value;
  }
  /**
   * <code>string phone = 5;</code>
   */
  private void clearPhone() {
    
    phone_ = getDefaultInstance().getPhone();
  }
  /**
   * <code>string phone = 5;</code>
   * @param value The bytes for phone to set.
   */
  private void setPhoneBytes(
      com.google.protobuf.ByteString value) {
    checkByteStringIsUtf8(value);
    phone_ = value.toStringUtf8();
    
  }

  public static final int IMGNAME_FIELD_NUMBER = 6;
  private java.lang.String imgName_;
  /**
   * <code>string imgName = 6;</code>
   * @return The imgName.
   */
  @java.lang.Override
  public java.lang.String getImgName() {
    return imgName_;
  }
  /**
   * <code>string imgName = 6;</code>
   * @return The bytes for imgName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getImgNameBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(imgName_);
  }
  /**
   * <code>string imgName = 6;</code>
   * @param value The imgName to set.
   */
  private void setImgName(
      java.lang.String value) {
    java.lang.Class<?> valueClass = value.getClass();
  
    imgName_ = value;
  }
  /**
   * <code>string imgName = 6;</code>
   */
  private void clearImgName() {
    
    imgName_ = getDefaultInstance().getImgName();
  }
  /**
   * <code>string imgName = 6;</code>
   * @param value The bytes for imgName to set.
   */
  private void setImgNameBytes(
      com.google.protobuf.ByteString value) {
    checkByteStringIsUtf8(value);
    imgName_ = value.toStringUtf8();
    
  }

  public static com.example.foodzoneclient.protocols.UserInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.example.foodzoneclient.protocols.UserInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.example.foodzoneclient.protocols.UserInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.example.foodzoneclient.protocols.UserInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.example.foodzoneclient.protocols.UserInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.example.foodzoneclient.protocols.UserInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.example.foodzoneclient.protocols.UserInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.example.foodzoneclient.protocols.UserInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.example.foodzoneclient.protocols.UserInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static com.example.foodzoneclient.protocols.UserInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.example.foodzoneclient.protocols.UserInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.example.foodzoneclient.protocols.UserInfo parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(com.example.foodzoneclient.protocols.UserInfo prototype) {
    return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * Protobuf type {@code foodzone_protocols.UserInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        com.example.foodzoneclient.protocols.UserInfo, Builder> implements
      // @@protoc_insertion_point(builder_implements:foodzone_protocols.UserInfo)
      com.example.foodzoneclient.protocols.UserInfoOrBuilder {
    // Construct using com.example.foodzoneclient.protocols.UserInfo.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <code>string username = 1;</code>
     * @return The username.
     */
    @java.lang.Override
    public java.lang.String getUsername() {
      return instance.getUsername();
    }
    /**
     * <code>string username = 1;</code>
     * @return The bytes for username.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getUsernameBytes() {
      return instance.getUsernameBytes();
    }
    /**
     * <code>string username = 1;</code>
     * @param value The username to set.
     * @return This builder for chaining.
     */
    public Builder setUsername(
        java.lang.String value) {
      copyOnWrite();
      instance.setUsername(value);
      return this;
    }
    /**
     * <code>string username = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearUsername() {
      copyOnWrite();
      instance.clearUsername();
      return this;
    }
    /**
     * <code>string username = 1;</code>
     * @param value The bytes for username to set.
     * @return This builder for chaining.
     */
    public Builder setUsernameBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setUsernameBytes(value);
      return this;
    }

    /**
     * <code>string fullname = 2;</code>
     * @return The fullname.
     */
    @java.lang.Override
    public java.lang.String getFullname() {
      return instance.getFullname();
    }
    /**
     * <code>string fullname = 2;</code>
     * @return The bytes for fullname.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getFullnameBytes() {
      return instance.getFullnameBytes();
    }
    /**
     * <code>string fullname = 2;</code>
     * @param value The fullname to set.
     * @return This builder for chaining.
     */
    public Builder setFullname(
        java.lang.String value) {
      copyOnWrite();
      instance.setFullname(value);
      return this;
    }
    /**
     * <code>string fullname = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearFullname() {
      copyOnWrite();
      instance.clearFullname();
      return this;
    }
    /**
     * <code>string fullname = 2;</code>
     * @param value The bytes for fullname to set.
     * @return This builder for chaining.
     */
    public Builder setFullnameBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setFullnameBytes(value);
      return this;
    }

    /**
     * <code>string id = 3;</code>
     * @return The id.
     */
    @java.lang.Override
    public java.lang.String getId() {
      return instance.getId();
    }
    /**
     * <code>string id = 3;</code>
     * @return The bytes for id.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getIdBytes() {
      return instance.getIdBytes();
    }
    /**
     * <code>string id = 3;</code>
     * @param value The id to set.
     * @return This builder for chaining.
     */
    public Builder setId(
        java.lang.String value) {
      copyOnWrite();
      instance.setId(value);
      return this;
    }
    /**
     * <code>string id = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearId() {
      copyOnWrite();
      instance.clearId();
      return this;
    }
    /**
     * <code>string id = 3;</code>
     * @param value The bytes for id to set.
     * @return This builder for chaining.
     */
    public Builder setIdBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setIdBytes(value);
      return this;
    }

    /**
     * <code>string address = 4;</code>
     * @return The address.
     */
    @java.lang.Override
    public java.lang.String getAddress() {
      return instance.getAddress();
    }
    /**
     * <code>string address = 4;</code>
     * @return The bytes for address.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getAddressBytes() {
      return instance.getAddressBytes();
    }
    /**
     * <code>string address = 4;</code>
     * @param value The address to set.
     * @return This builder for chaining.
     */
    public Builder setAddress(
        java.lang.String value) {
      copyOnWrite();
      instance.setAddress(value);
      return this;
    }
    /**
     * <code>string address = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearAddress() {
      copyOnWrite();
      instance.clearAddress();
      return this;
    }
    /**
     * <code>string address = 4;</code>
     * @param value The bytes for address to set.
     * @return This builder for chaining.
     */
    public Builder setAddressBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setAddressBytes(value);
      return this;
    }

    /**
     * <code>string phone = 5;</code>
     * @return The phone.
     */
    @java.lang.Override
    public java.lang.String getPhone() {
      return instance.getPhone();
    }
    /**
     * <code>string phone = 5;</code>
     * @return The bytes for phone.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getPhoneBytes() {
      return instance.getPhoneBytes();
    }
    /**
     * <code>string phone = 5;</code>
     * @param value The phone to set.
     * @return This builder for chaining.
     */
    public Builder setPhone(
        java.lang.String value) {
      copyOnWrite();
      instance.setPhone(value);
      return this;
    }
    /**
     * <code>string phone = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearPhone() {
      copyOnWrite();
      instance.clearPhone();
      return this;
    }
    /**
     * <code>string phone = 5;</code>
     * @param value The bytes for phone to set.
     * @return This builder for chaining.
     */
    public Builder setPhoneBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setPhoneBytes(value);
      return this;
    }

    /**
     * <code>string imgName = 6;</code>
     * @return The imgName.
     */
    @java.lang.Override
    public java.lang.String getImgName() {
      return instance.getImgName();
    }
    /**
     * <code>string imgName = 6;</code>
     * @return The bytes for imgName.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getImgNameBytes() {
      return instance.getImgNameBytes();
    }
    /**
     * <code>string imgName = 6;</code>
     * @param value The imgName to set.
     * @return This builder for chaining.
     */
    public Builder setImgName(
        java.lang.String value) {
      copyOnWrite();
      instance.setImgName(value);
      return this;
    }
    /**
     * <code>string imgName = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearImgName() {
      copyOnWrite();
      instance.clearImgName();
      return this;
    }
    /**
     * <code>string imgName = 6;</code>
     * @param value The bytes for imgName to set.
     * @return This builder for chaining.
     */
    public Builder setImgNameBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setImgNameBytes(value);
      return this;
    }

    // @@protoc_insertion_point(builder_scope:foodzone_protocols.UserInfo)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new com.example.foodzoneclient.protocols.UserInfo();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "username_",
            "fullname_",
            "id_",
            "address_",
            "phone_",
            "imgName_",
          };
          java.lang.String info =
              "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u0208\u0002\u0208" +
              "\u0003\u0208\u0004\u0208\u0005\u0208\u0006\u0208";
          return newMessageInfo(DEFAULT_INSTANCE, info, objects);
      }
      // fall through
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        com.google.protobuf.Parser<com.example.foodzoneclient.protocols.UserInfo> parser = PARSER;
        if (parser == null) {
          synchronized (com.example.foodzoneclient.protocols.UserInfo.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<com.example.foodzoneclient.protocols.UserInfo>(
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


  // @@protoc_insertion_point(class_scope:foodzone_protocols.UserInfo)
  private static final com.example.foodzoneclient.protocols.UserInfo DEFAULT_INSTANCE;
  static {
    UserInfo defaultInstance = new UserInfo();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      UserInfo.class, defaultInstance);
  }

  public static com.example.foodzoneclient.protocols.UserInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<UserInfo> PARSER;

  public static com.google.protobuf.Parser<UserInfo> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

