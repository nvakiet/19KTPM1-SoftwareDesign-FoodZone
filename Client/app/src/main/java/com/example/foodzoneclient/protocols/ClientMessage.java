// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PATH/MessageWrapper.proto

package com.example.foodzoneclient.protocols;

/**
 * Protobuf type {@code foodzone_protocols.ClientMessage}
 */
public  final class ClientMessage extends
    com.google.protobuf.GeneratedMessageLite<
        ClientMessage, ClientMessage.Builder> implements
    // @@protoc_insertion_point(message_implements:foodzone_protocols.ClientMessage)
    ClientMessageOrBuilder {
  private ClientMessage() {
    msg_ = "";
  }
  private int requestsCase_ = 0;
  private java.lang.Object requests_;
  public enum RequestsCase {
    LOGINREQUEST(2),
    REGISTERREQUEST(3),
    UPDATEINFOREQUEST(4),
    UPDATEPASSWORDREQUEST(5),
    SUBMITORDER(6),
    REQUESTS_NOT_SET(0);
    private final int value;
    private RequestsCase(int value) {
      this.value = value;
    }
    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static RequestsCase valueOf(int value) {
      return forNumber(value);
    }

    public static RequestsCase forNumber(int value) {
      switch (value) {
        case 2: return LOGINREQUEST;
        case 3: return REGISTERREQUEST;
        case 4: return UPDATEINFOREQUEST;
        case 5: return UPDATEPASSWORDREQUEST;
        case 6: return SUBMITORDER;
        case 0: return REQUESTS_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  @java.lang.Override
  public RequestsCase
  getRequestsCase() {
    return RequestsCase.forNumber(
        requestsCase_);
  }

  private void clearRequests() {
    requestsCase_ = 0;
    requests_ = null;
  }

  public static final int MSG_FIELD_NUMBER = 1;
  private java.lang.String msg_;
  /**
   * <code>string msg = 1;</code>
   * @return The msg.
   */
  @java.lang.Override
  public java.lang.String getMsg() {
    return msg_;
  }
  /**
   * <code>string msg = 1;</code>
   * @return The bytes for msg.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getMsgBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(msg_);
  }
  /**
   * <code>string msg = 1;</code>
   * @param value The msg to set.
   */
  private void setMsg(
      java.lang.String value) {
    java.lang.Class<?> valueClass = value.getClass();
  
    msg_ = value;
  }
  /**
   * <code>string msg = 1;</code>
   */
  private void clearMsg() {
    
    msg_ = getDefaultInstance().getMsg();
  }
  /**
   * <code>string msg = 1;</code>
   * @param value The bytes for msg to set.
   */
  private void setMsgBytes(
      com.google.protobuf.ByteString value) {
    checkByteStringIsUtf8(value);
    msg_ = value.toStringUtf8();
    
  }

  public static final int LOGINREQUEST_FIELD_NUMBER = 2;
  /**
   * <code>.foodzone_protocols.LoginRequest loginRequest = 2;</code>
   */
  @java.lang.Override
  public boolean hasLoginRequest() {
    return requestsCase_ == 2;
  }
  /**
   * <code>.foodzone_protocols.LoginRequest loginRequest = 2;</code>
   */
  @java.lang.Override
  public com.example.foodzoneclient.protocols.LoginRequest getLoginRequest() {
    if (requestsCase_ == 2) {
       return (com.example.foodzoneclient.protocols.LoginRequest) requests_;
    }
    return com.example.foodzoneclient.protocols.LoginRequest.getDefaultInstance();
  }
  /**
   * <code>.foodzone_protocols.LoginRequest loginRequest = 2;</code>
   */
  private void setLoginRequest(com.example.foodzoneclient.protocols.LoginRequest value) {
    value.getClass();
  requests_ = value;
    requestsCase_ = 2;
  }
  /**
   * <code>.foodzone_protocols.LoginRequest loginRequest = 2;</code>
   */
  private void mergeLoginRequest(com.example.foodzoneclient.protocols.LoginRequest value) {
    value.getClass();
  if (requestsCase_ == 2 &&
        requests_ != com.example.foodzoneclient.protocols.LoginRequest.getDefaultInstance()) {
      requests_ = com.example.foodzoneclient.protocols.LoginRequest.newBuilder((com.example.foodzoneclient.protocols.LoginRequest) requests_)
          .mergeFrom(value).buildPartial();
    } else {
      requests_ = value;
    }
    requestsCase_ = 2;
  }
  /**
   * <code>.foodzone_protocols.LoginRequest loginRequest = 2;</code>
   */
  private void clearLoginRequest() {
    if (requestsCase_ == 2) {
      requestsCase_ = 0;
      requests_ = null;
    }
  }

  public static final int REGISTERREQUEST_FIELD_NUMBER = 3;
  /**
   * <code>.foodzone_protocols.RegisterRequest registerRequest = 3;</code>
   */
  @java.lang.Override
  public boolean hasRegisterRequest() {
    return requestsCase_ == 3;
  }
  /**
   * <code>.foodzone_protocols.RegisterRequest registerRequest = 3;</code>
   */
  @java.lang.Override
  public com.example.foodzoneclient.protocols.RegisterRequest getRegisterRequest() {
    if (requestsCase_ == 3) {
       return (com.example.foodzoneclient.protocols.RegisterRequest) requests_;
    }
    return com.example.foodzoneclient.protocols.RegisterRequest.getDefaultInstance();
  }
  /**
   * <code>.foodzone_protocols.RegisterRequest registerRequest = 3;</code>
   */
  private void setRegisterRequest(com.example.foodzoneclient.protocols.RegisterRequest value) {
    value.getClass();
  requests_ = value;
    requestsCase_ = 3;
  }
  /**
   * <code>.foodzone_protocols.RegisterRequest registerRequest = 3;</code>
   */
  private void mergeRegisterRequest(com.example.foodzoneclient.protocols.RegisterRequest value) {
    value.getClass();
  if (requestsCase_ == 3 &&
        requests_ != com.example.foodzoneclient.protocols.RegisterRequest.getDefaultInstance()) {
      requests_ = com.example.foodzoneclient.protocols.RegisterRequest.newBuilder((com.example.foodzoneclient.protocols.RegisterRequest) requests_)
          .mergeFrom(value).buildPartial();
    } else {
      requests_ = value;
    }
    requestsCase_ = 3;
  }
  /**
   * <code>.foodzone_protocols.RegisterRequest registerRequest = 3;</code>
   */
  private void clearRegisterRequest() {
    if (requestsCase_ == 3) {
      requestsCase_ = 0;
      requests_ = null;
    }
  }

  public static final int UPDATEINFOREQUEST_FIELD_NUMBER = 4;
  /**
   * <code>.foodzone_protocols.UserInfo updateInfoRequest = 4;</code>
   */
  @java.lang.Override
  public boolean hasUpdateInfoRequest() {
    return requestsCase_ == 4;
  }
  /**
   * <code>.foodzone_protocols.UserInfo updateInfoRequest = 4;</code>
   */
  @java.lang.Override
  public com.example.foodzoneclient.protocols.UserInfo getUpdateInfoRequest() {
    if (requestsCase_ == 4) {
       return (com.example.foodzoneclient.protocols.UserInfo) requests_;
    }
    return com.example.foodzoneclient.protocols.UserInfo.getDefaultInstance();
  }
  /**
   * <code>.foodzone_protocols.UserInfo updateInfoRequest = 4;</code>
   */
  private void setUpdateInfoRequest(com.example.foodzoneclient.protocols.UserInfo value) {
    value.getClass();
  requests_ = value;
    requestsCase_ = 4;
  }
  /**
   * <code>.foodzone_protocols.UserInfo updateInfoRequest = 4;</code>
   */
  private void mergeUpdateInfoRequest(com.example.foodzoneclient.protocols.UserInfo value) {
    value.getClass();
  if (requestsCase_ == 4 &&
        requests_ != com.example.foodzoneclient.protocols.UserInfo.getDefaultInstance()) {
      requests_ = com.example.foodzoneclient.protocols.UserInfo.newBuilder((com.example.foodzoneclient.protocols.UserInfo) requests_)
          .mergeFrom(value).buildPartial();
    } else {
      requests_ = value;
    }
    requestsCase_ = 4;
  }
  /**
   * <code>.foodzone_protocols.UserInfo updateInfoRequest = 4;</code>
   */
  private void clearUpdateInfoRequest() {
    if (requestsCase_ == 4) {
      requestsCase_ = 0;
      requests_ = null;
    }
  }

  public static final int UPDATEPASSWORDREQUEST_FIELD_NUMBER = 5;
  /**
   * <code>.foodzone_protocols.UpdatePasswordRequest updatePasswordRequest = 5;</code>
   */
  @java.lang.Override
  public boolean hasUpdatePasswordRequest() {
    return requestsCase_ == 5;
  }
  /**
   * <code>.foodzone_protocols.UpdatePasswordRequest updatePasswordRequest = 5;</code>
   */
  @java.lang.Override
  public com.example.foodzoneclient.protocols.UpdatePasswordRequest getUpdatePasswordRequest() {
    if (requestsCase_ == 5) {
       return (com.example.foodzoneclient.protocols.UpdatePasswordRequest) requests_;
    }
    return com.example.foodzoneclient.protocols.UpdatePasswordRequest.getDefaultInstance();
  }
  /**
   * <code>.foodzone_protocols.UpdatePasswordRequest updatePasswordRequest = 5;</code>
   */
  private void setUpdatePasswordRequest(com.example.foodzoneclient.protocols.UpdatePasswordRequest value) {
    value.getClass();
  requests_ = value;
    requestsCase_ = 5;
  }
  /**
   * <code>.foodzone_protocols.UpdatePasswordRequest updatePasswordRequest = 5;</code>
   */
  private void mergeUpdatePasswordRequest(com.example.foodzoneclient.protocols.UpdatePasswordRequest value) {
    value.getClass();
  if (requestsCase_ == 5 &&
        requests_ != com.example.foodzoneclient.protocols.UpdatePasswordRequest.getDefaultInstance()) {
      requests_ = com.example.foodzoneclient.protocols.UpdatePasswordRequest.newBuilder((com.example.foodzoneclient.protocols.UpdatePasswordRequest) requests_)
          .mergeFrom(value).buildPartial();
    } else {
      requests_ = value;
    }
    requestsCase_ = 5;
  }
  /**
   * <code>.foodzone_protocols.UpdatePasswordRequest updatePasswordRequest = 5;</code>
   */
  private void clearUpdatePasswordRequest() {
    if (requestsCase_ == 5) {
      requestsCase_ = 0;
      requests_ = null;
    }
  }

  public static final int SUBMITORDER_FIELD_NUMBER = 6;
  /**
   * <code>.foodzone_protocols.SubmitOrder submitOrder = 6;</code>
   */
  @java.lang.Override
  public boolean hasSubmitOrder() {
    return requestsCase_ == 6;
  }
  /**
   * <code>.foodzone_protocols.SubmitOrder submitOrder = 6;</code>
   */
  @java.lang.Override
  public com.example.foodzoneclient.protocols.SubmitOrder getSubmitOrder() {
    if (requestsCase_ == 6) {
       return (com.example.foodzoneclient.protocols.SubmitOrder) requests_;
    }
    return com.example.foodzoneclient.protocols.SubmitOrder.getDefaultInstance();
  }
  /**
   * <code>.foodzone_protocols.SubmitOrder submitOrder = 6;</code>
   */
  private void setSubmitOrder(com.example.foodzoneclient.protocols.SubmitOrder value) {
    value.getClass();
  requests_ = value;
    requestsCase_ = 6;
  }
  /**
   * <code>.foodzone_protocols.SubmitOrder submitOrder = 6;</code>
   */
  private void mergeSubmitOrder(com.example.foodzoneclient.protocols.SubmitOrder value) {
    value.getClass();
  if (requestsCase_ == 6 &&
        requests_ != com.example.foodzoneclient.protocols.SubmitOrder.getDefaultInstance()) {
      requests_ = com.example.foodzoneclient.protocols.SubmitOrder.newBuilder((com.example.foodzoneclient.protocols.SubmitOrder) requests_)
          .mergeFrom(value).buildPartial();
    } else {
      requests_ = value;
    }
    requestsCase_ = 6;
  }
  /**
   * <code>.foodzone_protocols.SubmitOrder submitOrder = 6;</code>
   */
  private void clearSubmitOrder() {
    if (requestsCase_ == 6) {
      requestsCase_ = 0;
      requests_ = null;
    }
  }

  public static com.example.foodzoneclient.protocols.ClientMessage parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.example.foodzoneclient.protocols.ClientMessage parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.example.foodzoneclient.protocols.ClientMessage parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.example.foodzoneclient.protocols.ClientMessage parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.example.foodzoneclient.protocols.ClientMessage parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.example.foodzoneclient.protocols.ClientMessage parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.example.foodzoneclient.protocols.ClientMessage parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.example.foodzoneclient.protocols.ClientMessage parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.example.foodzoneclient.protocols.ClientMessage parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static com.example.foodzoneclient.protocols.ClientMessage parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.example.foodzoneclient.protocols.ClientMessage parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.example.foodzoneclient.protocols.ClientMessage parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(com.example.foodzoneclient.protocols.ClientMessage prototype) {
    return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * Protobuf type {@code foodzone_protocols.ClientMessage}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        com.example.foodzoneclient.protocols.ClientMessage, Builder> implements
      // @@protoc_insertion_point(builder_implements:foodzone_protocols.ClientMessage)
      com.example.foodzoneclient.protocols.ClientMessageOrBuilder {
    // Construct using com.example.foodzoneclient.protocols.ClientMessage.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }

    @java.lang.Override
    public RequestsCase
        getRequestsCase() {
      return instance.getRequestsCase();
    }

    public Builder clearRequests() {
      copyOnWrite();
      instance.clearRequests();
      return this;
    }


    /**
     * <code>string msg = 1;</code>
     * @return The msg.
     */
    @java.lang.Override
    public java.lang.String getMsg() {
      return instance.getMsg();
    }
    /**
     * <code>string msg = 1;</code>
     * @return The bytes for msg.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getMsgBytes() {
      return instance.getMsgBytes();
    }
    /**
     * <code>string msg = 1;</code>
     * @param value The msg to set.
     * @return This builder for chaining.
     */
    public Builder setMsg(
        java.lang.String value) {
      copyOnWrite();
      instance.setMsg(value);
      return this;
    }
    /**
     * <code>string msg = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearMsg() {
      copyOnWrite();
      instance.clearMsg();
      return this;
    }
    /**
     * <code>string msg = 1;</code>
     * @param value The bytes for msg to set.
     * @return This builder for chaining.
     */
    public Builder setMsgBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setMsgBytes(value);
      return this;
    }

    /**
     * <code>.foodzone_protocols.LoginRequest loginRequest = 2;</code>
     */
    @java.lang.Override
    public boolean hasLoginRequest() {
      return instance.hasLoginRequest();
    }
    /**
     * <code>.foodzone_protocols.LoginRequest loginRequest = 2;</code>
     */
    @java.lang.Override
    public com.example.foodzoneclient.protocols.LoginRequest getLoginRequest() {
      return instance.getLoginRequest();
    }
    /**
     * <code>.foodzone_protocols.LoginRequest loginRequest = 2;</code>
     */
    public Builder setLoginRequest(com.example.foodzoneclient.protocols.LoginRequest value) {
      copyOnWrite();
      instance.setLoginRequest(value);
      return this;
    }
    /**
     * <code>.foodzone_protocols.LoginRequest loginRequest = 2;</code>
     */
    public Builder setLoginRequest(
        com.example.foodzoneclient.protocols.LoginRequest.Builder builderForValue) {
      copyOnWrite();
      instance.setLoginRequest(builderForValue.build());
      return this;
    }
    /**
     * <code>.foodzone_protocols.LoginRequest loginRequest = 2;</code>
     */
    public Builder mergeLoginRequest(com.example.foodzoneclient.protocols.LoginRequest value) {
      copyOnWrite();
      instance.mergeLoginRequest(value);
      return this;
    }
    /**
     * <code>.foodzone_protocols.LoginRequest loginRequest = 2;</code>
     */
    public Builder clearLoginRequest() {
      copyOnWrite();
      instance.clearLoginRequest();
      return this;
    }

    /**
     * <code>.foodzone_protocols.RegisterRequest registerRequest = 3;</code>
     */
    @java.lang.Override
    public boolean hasRegisterRequest() {
      return instance.hasRegisterRequest();
    }
    /**
     * <code>.foodzone_protocols.RegisterRequest registerRequest = 3;</code>
     */
    @java.lang.Override
    public com.example.foodzoneclient.protocols.RegisterRequest getRegisterRequest() {
      return instance.getRegisterRequest();
    }
    /**
     * <code>.foodzone_protocols.RegisterRequest registerRequest = 3;</code>
     */
    public Builder setRegisterRequest(com.example.foodzoneclient.protocols.RegisterRequest value) {
      copyOnWrite();
      instance.setRegisterRequest(value);
      return this;
    }
    /**
     * <code>.foodzone_protocols.RegisterRequest registerRequest = 3;</code>
     */
    public Builder setRegisterRequest(
        com.example.foodzoneclient.protocols.RegisterRequest.Builder builderForValue) {
      copyOnWrite();
      instance.setRegisterRequest(builderForValue.build());
      return this;
    }
    /**
     * <code>.foodzone_protocols.RegisterRequest registerRequest = 3;</code>
     */
    public Builder mergeRegisterRequest(com.example.foodzoneclient.protocols.RegisterRequest value) {
      copyOnWrite();
      instance.mergeRegisterRequest(value);
      return this;
    }
    /**
     * <code>.foodzone_protocols.RegisterRequest registerRequest = 3;</code>
     */
    public Builder clearRegisterRequest() {
      copyOnWrite();
      instance.clearRegisterRequest();
      return this;
    }

    /**
     * <code>.foodzone_protocols.UserInfo updateInfoRequest = 4;</code>
     */
    @java.lang.Override
    public boolean hasUpdateInfoRequest() {
      return instance.hasUpdateInfoRequest();
    }
    /**
     * <code>.foodzone_protocols.UserInfo updateInfoRequest = 4;</code>
     */
    @java.lang.Override
    public com.example.foodzoneclient.protocols.UserInfo getUpdateInfoRequest() {
      return instance.getUpdateInfoRequest();
    }
    /**
     * <code>.foodzone_protocols.UserInfo updateInfoRequest = 4;</code>
     */
    public Builder setUpdateInfoRequest(com.example.foodzoneclient.protocols.UserInfo value) {
      copyOnWrite();
      instance.setUpdateInfoRequest(value);
      return this;
    }
    /**
     * <code>.foodzone_protocols.UserInfo updateInfoRequest = 4;</code>
     */
    public Builder setUpdateInfoRequest(
        com.example.foodzoneclient.protocols.UserInfo.Builder builderForValue) {
      copyOnWrite();
      instance.setUpdateInfoRequest(builderForValue.build());
      return this;
    }
    /**
     * <code>.foodzone_protocols.UserInfo updateInfoRequest = 4;</code>
     */
    public Builder mergeUpdateInfoRequest(com.example.foodzoneclient.protocols.UserInfo value) {
      copyOnWrite();
      instance.mergeUpdateInfoRequest(value);
      return this;
    }
    /**
     * <code>.foodzone_protocols.UserInfo updateInfoRequest = 4;</code>
     */
    public Builder clearUpdateInfoRequest() {
      copyOnWrite();
      instance.clearUpdateInfoRequest();
      return this;
    }

    /**
     * <code>.foodzone_protocols.UpdatePasswordRequest updatePasswordRequest = 5;</code>
     */
    @java.lang.Override
    public boolean hasUpdatePasswordRequest() {
      return instance.hasUpdatePasswordRequest();
    }
    /**
     * <code>.foodzone_protocols.UpdatePasswordRequest updatePasswordRequest = 5;</code>
     */
    @java.lang.Override
    public com.example.foodzoneclient.protocols.UpdatePasswordRequest getUpdatePasswordRequest() {
      return instance.getUpdatePasswordRequest();
    }
    /**
     * <code>.foodzone_protocols.UpdatePasswordRequest updatePasswordRequest = 5;</code>
     */
    public Builder setUpdatePasswordRequest(com.example.foodzoneclient.protocols.UpdatePasswordRequest value) {
      copyOnWrite();
      instance.setUpdatePasswordRequest(value);
      return this;
    }
    /**
     * <code>.foodzone_protocols.UpdatePasswordRequest updatePasswordRequest = 5;</code>
     */
    public Builder setUpdatePasswordRequest(
        com.example.foodzoneclient.protocols.UpdatePasswordRequest.Builder builderForValue) {
      copyOnWrite();
      instance.setUpdatePasswordRequest(builderForValue.build());
      return this;
    }
    /**
     * <code>.foodzone_protocols.UpdatePasswordRequest updatePasswordRequest = 5;</code>
     */
    public Builder mergeUpdatePasswordRequest(com.example.foodzoneclient.protocols.UpdatePasswordRequest value) {
      copyOnWrite();
      instance.mergeUpdatePasswordRequest(value);
      return this;
    }
    /**
     * <code>.foodzone_protocols.UpdatePasswordRequest updatePasswordRequest = 5;</code>
     */
    public Builder clearUpdatePasswordRequest() {
      copyOnWrite();
      instance.clearUpdatePasswordRequest();
      return this;
    }

    /**
     * <code>.foodzone_protocols.SubmitOrder submitOrder = 6;</code>
     */
    @java.lang.Override
    public boolean hasSubmitOrder() {
      return instance.hasSubmitOrder();
    }
    /**
     * <code>.foodzone_protocols.SubmitOrder submitOrder = 6;</code>
     */
    @java.lang.Override
    public com.example.foodzoneclient.protocols.SubmitOrder getSubmitOrder() {
      return instance.getSubmitOrder();
    }
    /**
     * <code>.foodzone_protocols.SubmitOrder submitOrder = 6;</code>
     */
    public Builder setSubmitOrder(com.example.foodzoneclient.protocols.SubmitOrder value) {
      copyOnWrite();
      instance.setSubmitOrder(value);
      return this;
    }
    /**
     * <code>.foodzone_protocols.SubmitOrder submitOrder = 6;</code>
     */
    public Builder setSubmitOrder(
        com.example.foodzoneclient.protocols.SubmitOrder.Builder builderForValue) {
      copyOnWrite();
      instance.setSubmitOrder(builderForValue.build());
      return this;
    }
    /**
     * <code>.foodzone_protocols.SubmitOrder submitOrder = 6;</code>
     */
    public Builder mergeSubmitOrder(com.example.foodzoneclient.protocols.SubmitOrder value) {
      copyOnWrite();
      instance.mergeSubmitOrder(value);
      return this;
    }
    /**
     * <code>.foodzone_protocols.SubmitOrder submitOrder = 6;</code>
     */
    public Builder clearSubmitOrder() {
      copyOnWrite();
      instance.clearSubmitOrder();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:foodzone_protocols.ClientMessage)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new com.example.foodzoneclient.protocols.ClientMessage();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "requests_",
            "requestsCase_",
            "msg_",
            com.example.foodzoneclient.protocols.LoginRequest.class,
            com.example.foodzoneclient.protocols.RegisterRequest.class,
            com.example.foodzoneclient.protocols.UserInfo.class,
            com.example.foodzoneclient.protocols.UpdatePasswordRequest.class,
            com.example.foodzoneclient.protocols.SubmitOrder.class,
          };
          java.lang.String info =
              "\u0000\u0006\u0001\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u0208\u0002<\u0000" +
              "\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000";
          return newMessageInfo(DEFAULT_INSTANCE, info, objects);
      }
      // fall through
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        com.google.protobuf.Parser<com.example.foodzoneclient.protocols.ClientMessage> parser = PARSER;
        if (parser == null) {
          synchronized (com.example.foodzoneclient.protocols.ClientMessage.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<com.example.foodzoneclient.protocols.ClientMessage>(
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


  // @@protoc_insertion_point(class_scope:foodzone_protocols.ClientMessage)
  private static final com.example.foodzoneclient.protocols.ClientMessage DEFAULT_INSTANCE;
  static {
    ClientMessage defaultInstance = new ClientMessage();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      ClientMessage.class, defaultInstance);
  }

  public static com.example.foodzoneclient.protocols.ClientMessage getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<ClientMessage> PARSER;

  public static com.google.protobuf.Parser<ClientMessage> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

