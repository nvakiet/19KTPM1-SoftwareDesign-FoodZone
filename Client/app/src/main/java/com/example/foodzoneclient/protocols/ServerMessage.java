// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PATH/MessageWrapper.proto

package com.example.foodzoneclient.protocols;

/**
 * Protobuf type {@code foodzone_protocols.ServerMessage}
 */
public  final class ServerMessage extends
    com.google.protobuf.GeneratedMessageLite<
        ServerMessage, ServerMessage.Builder> implements
    // @@protoc_insertion_point(message_implements:foodzone_protocols.ServerMessage)
    ServerMessageOrBuilder {
  private ServerMessage() {
    msg_ = "";
  }
  private int responsesCase_ = 0;
  private java.lang.Object responses_;
  public enum ResponsesCase {
    LOGINRESPONSE(2),
    REGISTERRESPONSE(3),
    UPDATEINFORESPONSE(4),
    UPDATEPASSWORDRESPONSE(5),
    SUBMITORDERRESPONSE(6),
    RESPONSES_NOT_SET(0);
    private final int value;
    private ResponsesCase(int value) {
      this.value = value;
    }
    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static ResponsesCase valueOf(int value) {
      return forNumber(value);
    }

    public static ResponsesCase forNumber(int value) {
      switch (value) {
        case 2: return LOGINRESPONSE;
        case 3: return REGISTERRESPONSE;
        case 4: return UPDATEINFORESPONSE;
        case 5: return UPDATEPASSWORDRESPONSE;
        case 6: return SUBMITORDERRESPONSE;
        case 0: return RESPONSES_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  @java.lang.Override
  public ResponsesCase
  getResponsesCase() {
    return ResponsesCase.forNumber(
        responsesCase_);
  }

  private void clearResponses() {
    responsesCase_ = 0;
    responses_ = null;
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

  public static final int LOGINRESPONSE_FIELD_NUMBER = 2;
  /**
   * <code>.foodzone_protocols.LoginResponse loginResponse = 2;</code>
   */
  @java.lang.Override
  public boolean hasLoginResponse() {
    return responsesCase_ == 2;
  }
  /**
   * <code>.foodzone_protocols.LoginResponse loginResponse = 2;</code>
   */
  @java.lang.Override
  public com.example.foodzoneclient.protocols.LoginResponse getLoginResponse() {
    if (responsesCase_ == 2) {
       return (com.example.foodzoneclient.protocols.LoginResponse) responses_;
    }
    return com.example.foodzoneclient.protocols.LoginResponse.getDefaultInstance();
  }
  /**
   * <code>.foodzone_protocols.LoginResponse loginResponse = 2;</code>
   */
  private void setLoginResponse(com.example.foodzoneclient.protocols.LoginResponse value) {
    value.getClass();
  responses_ = value;
    responsesCase_ = 2;
  }
  /**
   * <code>.foodzone_protocols.LoginResponse loginResponse = 2;</code>
   */
  private void mergeLoginResponse(com.example.foodzoneclient.protocols.LoginResponse value) {
    value.getClass();
  if (responsesCase_ == 2 &&
        responses_ != com.example.foodzoneclient.protocols.LoginResponse.getDefaultInstance()) {
      responses_ = com.example.foodzoneclient.protocols.LoginResponse.newBuilder((com.example.foodzoneclient.protocols.LoginResponse) responses_)
          .mergeFrom(value).buildPartial();
    } else {
      responses_ = value;
    }
    responsesCase_ = 2;
  }
  /**
   * <code>.foodzone_protocols.LoginResponse loginResponse = 2;</code>
   */
  private void clearLoginResponse() {
    if (responsesCase_ == 2) {
      responsesCase_ = 0;
      responses_ = null;
    }
  }

  public static final int REGISTERRESPONSE_FIELD_NUMBER = 3;
  /**
   * <code>.foodzone_protocols.RegisterResponse registerResponse = 3;</code>
   */
  @java.lang.Override
  public boolean hasRegisterResponse() {
    return responsesCase_ == 3;
  }
  /**
   * <code>.foodzone_protocols.RegisterResponse registerResponse = 3;</code>
   */
  @java.lang.Override
  public com.example.foodzoneclient.protocols.RegisterResponse getRegisterResponse() {
    if (responsesCase_ == 3) {
       return (com.example.foodzoneclient.protocols.RegisterResponse) responses_;
    }
    return com.example.foodzoneclient.protocols.RegisterResponse.getDefaultInstance();
  }
  /**
   * <code>.foodzone_protocols.RegisterResponse registerResponse = 3;</code>
   */
  private void setRegisterResponse(com.example.foodzoneclient.protocols.RegisterResponse value) {
    value.getClass();
  responses_ = value;
    responsesCase_ = 3;
  }
  /**
   * <code>.foodzone_protocols.RegisterResponse registerResponse = 3;</code>
   */
  private void mergeRegisterResponse(com.example.foodzoneclient.protocols.RegisterResponse value) {
    value.getClass();
  if (responsesCase_ == 3 &&
        responses_ != com.example.foodzoneclient.protocols.RegisterResponse.getDefaultInstance()) {
      responses_ = com.example.foodzoneclient.protocols.RegisterResponse.newBuilder((com.example.foodzoneclient.protocols.RegisterResponse) responses_)
          .mergeFrom(value).buildPartial();
    } else {
      responses_ = value;
    }
    responsesCase_ = 3;
  }
  /**
   * <code>.foodzone_protocols.RegisterResponse registerResponse = 3;</code>
   */
  private void clearRegisterResponse() {
    if (responsesCase_ == 3) {
      responsesCase_ = 0;
      responses_ = null;
    }
  }

  public static final int UPDATEINFORESPONSE_FIELD_NUMBER = 4;
  /**
   * <code>.foodzone_protocols.UpdateInfoResponse updateInfoResponse = 4;</code>
   */
  @java.lang.Override
  public boolean hasUpdateInfoResponse() {
    return responsesCase_ == 4;
  }
  /**
   * <code>.foodzone_protocols.UpdateInfoResponse updateInfoResponse = 4;</code>
   */
  @java.lang.Override
  public com.example.foodzoneclient.protocols.UpdateInfoResponse getUpdateInfoResponse() {
    if (responsesCase_ == 4) {
       return (com.example.foodzoneclient.protocols.UpdateInfoResponse) responses_;
    }
    return com.example.foodzoneclient.protocols.UpdateInfoResponse.getDefaultInstance();
  }
  /**
   * <code>.foodzone_protocols.UpdateInfoResponse updateInfoResponse = 4;</code>
   */
  private void setUpdateInfoResponse(com.example.foodzoneclient.protocols.UpdateInfoResponse value) {
    value.getClass();
  responses_ = value;
    responsesCase_ = 4;
  }
  /**
   * <code>.foodzone_protocols.UpdateInfoResponse updateInfoResponse = 4;</code>
   */
  private void mergeUpdateInfoResponse(com.example.foodzoneclient.protocols.UpdateInfoResponse value) {
    value.getClass();
  if (responsesCase_ == 4 &&
        responses_ != com.example.foodzoneclient.protocols.UpdateInfoResponse.getDefaultInstance()) {
      responses_ = com.example.foodzoneclient.protocols.UpdateInfoResponse.newBuilder((com.example.foodzoneclient.protocols.UpdateInfoResponse) responses_)
          .mergeFrom(value).buildPartial();
    } else {
      responses_ = value;
    }
    responsesCase_ = 4;
  }
  /**
   * <code>.foodzone_protocols.UpdateInfoResponse updateInfoResponse = 4;</code>
   */
  private void clearUpdateInfoResponse() {
    if (responsesCase_ == 4) {
      responsesCase_ = 0;
      responses_ = null;
    }
  }

  public static final int UPDATEPASSWORDRESPONSE_FIELD_NUMBER = 5;
  /**
   * <code>.foodzone_protocols.UpdatePasswordResponse updatePasswordResponse = 5;</code>
   */
  @java.lang.Override
  public boolean hasUpdatePasswordResponse() {
    return responsesCase_ == 5;
  }
  /**
   * <code>.foodzone_protocols.UpdatePasswordResponse updatePasswordResponse = 5;</code>
   */
  @java.lang.Override
  public com.example.foodzoneclient.protocols.UpdatePasswordResponse getUpdatePasswordResponse() {
    if (responsesCase_ == 5) {
       return (com.example.foodzoneclient.protocols.UpdatePasswordResponse) responses_;
    }
    return com.example.foodzoneclient.protocols.UpdatePasswordResponse.getDefaultInstance();
  }
  /**
   * <code>.foodzone_protocols.UpdatePasswordResponse updatePasswordResponse = 5;</code>
   */
  private void setUpdatePasswordResponse(com.example.foodzoneclient.protocols.UpdatePasswordResponse value) {
    value.getClass();
  responses_ = value;
    responsesCase_ = 5;
  }
  /**
   * <code>.foodzone_protocols.UpdatePasswordResponse updatePasswordResponse = 5;</code>
   */
  private void mergeUpdatePasswordResponse(com.example.foodzoneclient.protocols.UpdatePasswordResponse value) {
    value.getClass();
  if (responsesCase_ == 5 &&
        responses_ != com.example.foodzoneclient.protocols.UpdatePasswordResponse.getDefaultInstance()) {
      responses_ = com.example.foodzoneclient.protocols.UpdatePasswordResponse.newBuilder((com.example.foodzoneclient.protocols.UpdatePasswordResponse) responses_)
          .mergeFrom(value).buildPartial();
    } else {
      responses_ = value;
    }
    responsesCase_ = 5;
  }
  /**
   * <code>.foodzone_protocols.UpdatePasswordResponse updatePasswordResponse = 5;</code>
   */
  private void clearUpdatePasswordResponse() {
    if (responsesCase_ == 5) {
      responsesCase_ = 0;
      responses_ = null;
    }
  }

  public static final int SUBMITORDERRESPONSE_FIELD_NUMBER = 6;
  /**
   * <code>.foodzone_protocols.SubmitOrderResponse submitOrderResponse = 6;</code>
   */
  @java.lang.Override
  public boolean hasSubmitOrderResponse() {
    return responsesCase_ == 6;
  }
  /**
   * <code>.foodzone_protocols.SubmitOrderResponse submitOrderResponse = 6;</code>
   */
  @java.lang.Override
  public com.example.foodzoneclient.protocols.SubmitOrderResponse getSubmitOrderResponse() {
    if (responsesCase_ == 6) {
       return (com.example.foodzoneclient.protocols.SubmitOrderResponse) responses_;
    }
    return com.example.foodzoneclient.protocols.SubmitOrderResponse.getDefaultInstance();
  }
  /**
   * <code>.foodzone_protocols.SubmitOrderResponse submitOrderResponse = 6;</code>
   */
  private void setSubmitOrderResponse(com.example.foodzoneclient.protocols.SubmitOrderResponse value) {
    value.getClass();
  responses_ = value;
    responsesCase_ = 6;
  }
  /**
   * <code>.foodzone_protocols.SubmitOrderResponse submitOrderResponse = 6;</code>
   */
  private void mergeSubmitOrderResponse(com.example.foodzoneclient.protocols.SubmitOrderResponse value) {
    value.getClass();
  if (responsesCase_ == 6 &&
        responses_ != com.example.foodzoneclient.protocols.SubmitOrderResponse.getDefaultInstance()) {
      responses_ = com.example.foodzoneclient.protocols.SubmitOrderResponse.newBuilder((com.example.foodzoneclient.protocols.SubmitOrderResponse) responses_)
          .mergeFrom(value).buildPartial();
    } else {
      responses_ = value;
    }
    responsesCase_ = 6;
  }
  /**
   * <code>.foodzone_protocols.SubmitOrderResponse submitOrderResponse = 6;</code>
   */
  private void clearSubmitOrderResponse() {
    if (responsesCase_ == 6) {
      responsesCase_ = 0;
      responses_ = null;
    }
  }

  public static com.example.foodzoneclient.protocols.ServerMessage parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.example.foodzoneclient.protocols.ServerMessage parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.example.foodzoneclient.protocols.ServerMessage parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.example.foodzoneclient.protocols.ServerMessage parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.example.foodzoneclient.protocols.ServerMessage parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.example.foodzoneclient.protocols.ServerMessage parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.example.foodzoneclient.protocols.ServerMessage parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.example.foodzoneclient.protocols.ServerMessage parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.example.foodzoneclient.protocols.ServerMessage parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static com.example.foodzoneclient.protocols.ServerMessage parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.example.foodzoneclient.protocols.ServerMessage parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.example.foodzoneclient.protocols.ServerMessage parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(com.example.foodzoneclient.protocols.ServerMessage prototype) {
    return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * Protobuf type {@code foodzone_protocols.ServerMessage}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        com.example.foodzoneclient.protocols.ServerMessage, Builder> implements
      // @@protoc_insertion_point(builder_implements:foodzone_protocols.ServerMessage)
      com.example.foodzoneclient.protocols.ServerMessageOrBuilder {
    // Construct using com.example.foodzoneclient.protocols.ServerMessage.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }

    @java.lang.Override
    public ResponsesCase
        getResponsesCase() {
      return instance.getResponsesCase();
    }

    public Builder clearResponses() {
      copyOnWrite();
      instance.clearResponses();
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
     * <code>.foodzone_protocols.LoginResponse loginResponse = 2;</code>
     */
    @java.lang.Override
    public boolean hasLoginResponse() {
      return instance.hasLoginResponse();
    }
    /**
     * <code>.foodzone_protocols.LoginResponse loginResponse = 2;</code>
     */
    @java.lang.Override
    public com.example.foodzoneclient.protocols.LoginResponse getLoginResponse() {
      return instance.getLoginResponse();
    }
    /**
     * <code>.foodzone_protocols.LoginResponse loginResponse = 2;</code>
     */
    public Builder setLoginResponse(com.example.foodzoneclient.protocols.LoginResponse value) {
      copyOnWrite();
      instance.setLoginResponse(value);
      return this;
    }
    /**
     * <code>.foodzone_protocols.LoginResponse loginResponse = 2;</code>
     */
    public Builder setLoginResponse(
        com.example.foodzoneclient.protocols.LoginResponse.Builder builderForValue) {
      copyOnWrite();
      instance.setLoginResponse(builderForValue.build());
      return this;
    }
    /**
     * <code>.foodzone_protocols.LoginResponse loginResponse = 2;</code>
     */
    public Builder mergeLoginResponse(com.example.foodzoneclient.protocols.LoginResponse value) {
      copyOnWrite();
      instance.mergeLoginResponse(value);
      return this;
    }
    /**
     * <code>.foodzone_protocols.LoginResponse loginResponse = 2;</code>
     */
    public Builder clearLoginResponse() {
      copyOnWrite();
      instance.clearLoginResponse();
      return this;
    }

    /**
     * <code>.foodzone_protocols.RegisterResponse registerResponse = 3;</code>
     */
    @java.lang.Override
    public boolean hasRegisterResponse() {
      return instance.hasRegisterResponse();
    }
    /**
     * <code>.foodzone_protocols.RegisterResponse registerResponse = 3;</code>
     */
    @java.lang.Override
    public com.example.foodzoneclient.protocols.RegisterResponse getRegisterResponse() {
      return instance.getRegisterResponse();
    }
    /**
     * <code>.foodzone_protocols.RegisterResponse registerResponse = 3;</code>
     */
    public Builder setRegisterResponse(com.example.foodzoneclient.protocols.RegisterResponse value) {
      copyOnWrite();
      instance.setRegisterResponse(value);
      return this;
    }
    /**
     * <code>.foodzone_protocols.RegisterResponse registerResponse = 3;</code>
     */
    public Builder setRegisterResponse(
        com.example.foodzoneclient.protocols.RegisterResponse.Builder builderForValue) {
      copyOnWrite();
      instance.setRegisterResponse(builderForValue.build());
      return this;
    }
    /**
     * <code>.foodzone_protocols.RegisterResponse registerResponse = 3;</code>
     */
    public Builder mergeRegisterResponse(com.example.foodzoneclient.protocols.RegisterResponse value) {
      copyOnWrite();
      instance.mergeRegisterResponse(value);
      return this;
    }
    /**
     * <code>.foodzone_protocols.RegisterResponse registerResponse = 3;</code>
     */
    public Builder clearRegisterResponse() {
      copyOnWrite();
      instance.clearRegisterResponse();
      return this;
    }

    /**
     * <code>.foodzone_protocols.UpdateInfoResponse updateInfoResponse = 4;</code>
     */
    @java.lang.Override
    public boolean hasUpdateInfoResponse() {
      return instance.hasUpdateInfoResponse();
    }
    /**
     * <code>.foodzone_protocols.UpdateInfoResponse updateInfoResponse = 4;</code>
     */
    @java.lang.Override
    public com.example.foodzoneclient.protocols.UpdateInfoResponse getUpdateInfoResponse() {
      return instance.getUpdateInfoResponse();
    }
    /**
     * <code>.foodzone_protocols.UpdateInfoResponse updateInfoResponse = 4;</code>
     */
    public Builder setUpdateInfoResponse(com.example.foodzoneclient.protocols.UpdateInfoResponse value) {
      copyOnWrite();
      instance.setUpdateInfoResponse(value);
      return this;
    }
    /**
     * <code>.foodzone_protocols.UpdateInfoResponse updateInfoResponse = 4;</code>
     */
    public Builder setUpdateInfoResponse(
        com.example.foodzoneclient.protocols.UpdateInfoResponse.Builder builderForValue) {
      copyOnWrite();
      instance.setUpdateInfoResponse(builderForValue.build());
      return this;
    }
    /**
     * <code>.foodzone_protocols.UpdateInfoResponse updateInfoResponse = 4;</code>
     */
    public Builder mergeUpdateInfoResponse(com.example.foodzoneclient.protocols.UpdateInfoResponse value) {
      copyOnWrite();
      instance.mergeUpdateInfoResponse(value);
      return this;
    }
    /**
     * <code>.foodzone_protocols.UpdateInfoResponse updateInfoResponse = 4;</code>
     */
    public Builder clearUpdateInfoResponse() {
      copyOnWrite();
      instance.clearUpdateInfoResponse();
      return this;
    }

    /**
     * <code>.foodzone_protocols.UpdatePasswordResponse updatePasswordResponse = 5;</code>
     */
    @java.lang.Override
    public boolean hasUpdatePasswordResponse() {
      return instance.hasUpdatePasswordResponse();
    }
    /**
     * <code>.foodzone_protocols.UpdatePasswordResponse updatePasswordResponse = 5;</code>
     */
    @java.lang.Override
    public com.example.foodzoneclient.protocols.UpdatePasswordResponse getUpdatePasswordResponse() {
      return instance.getUpdatePasswordResponse();
    }
    /**
     * <code>.foodzone_protocols.UpdatePasswordResponse updatePasswordResponse = 5;</code>
     */
    public Builder setUpdatePasswordResponse(com.example.foodzoneclient.protocols.UpdatePasswordResponse value) {
      copyOnWrite();
      instance.setUpdatePasswordResponse(value);
      return this;
    }
    /**
     * <code>.foodzone_protocols.UpdatePasswordResponse updatePasswordResponse = 5;</code>
     */
    public Builder setUpdatePasswordResponse(
        com.example.foodzoneclient.protocols.UpdatePasswordResponse.Builder builderForValue) {
      copyOnWrite();
      instance.setUpdatePasswordResponse(builderForValue.build());
      return this;
    }
    /**
     * <code>.foodzone_protocols.UpdatePasswordResponse updatePasswordResponse = 5;</code>
     */
    public Builder mergeUpdatePasswordResponse(com.example.foodzoneclient.protocols.UpdatePasswordResponse value) {
      copyOnWrite();
      instance.mergeUpdatePasswordResponse(value);
      return this;
    }
    /**
     * <code>.foodzone_protocols.UpdatePasswordResponse updatePasswordResponse = 5;</code>
     */
    public Builder clearUpdatePasswordResponse() {
      copyOnWrite();
      instance.clearUpdatePasswordResponse();
      return this;
    }

    /**
     * <code>.foodzone_protocols.SubmitOrderResponse submitOrderResponse = 6;</code>
     */
    @java.lang.Override
    public boolean hasSubmitOrderResponse() {
      return instance.hasSubmitOrderResponse();
    }
    /**
     * <code>.foodzone_protocols.SubmitOrderResponse submitOrderResponse = 6;</code>
     */
    @java.lang.Override
    public com.example.foodzoneclient.protocols.SubmitOrderResponse getSubmitOrderResponse() {
      return instance.getSubmitOrderResponse();
    }
    /**
     * <code>.foodzone_protocols.SubmitOrderResponse submitOrderResponse = 6;</code>
     */
    public Builder setSubmitOrderResponse(com.example.foodzoneclient.protocols.SubmitOrderResponse value) {
      copyOnWrite();
      instance.setSubmitOrderResponse(value);
      return this;
    }
    /**
     * <code>.foodzone_protocols.SubmitOrderResponse submitOrderResponse = 6;</code>
     */
    public Builder setSubmitOrderResponse(
        com.example.foodzoneclient.protocols.SubmitOrderResponse.Builder builderForValue) {
      copyOnWrite();
      instance.setSubmitOrderResponse(builderForValue.build());
      return this;
    }
    /**
     * <code>.foodzone_protocols.SubmitOrderResponse submitOrderResponse = 6;</code>
     */
    public Builder mergeSubmitOrderResponse(com.example.foodzoneclient.protocols.SubmitOrderResponse value) {
      copyOnWrite();
      instance.mergeSubmitOrderResponse(value);
      return this;
    }
    /**
     * <code>.foodzone_protocols.SubmitOrderResponse submitOrderResponse = 6;</code>
     */
    public Builder clearSubmitOrderResponse() {
      copyOnWrite();
      instance.clearSubmitOrderResponse();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:foodzone_protocols.ServerMessage)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new com.example.foodzoneclient.protocols.ServerMessage();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "responses_",
            "responsesCase_",
            "msg_",
            com.example.foodzoneclient.protocols.LoginResponse.class,
            com.example.foodzoneclient.protocols.RegisterResponse.class,
            com.example.foodzoneclient.protocols.UpdateInfoResponse.class,
            com.example.foodzoneclient.protocols.UpdatePasswordResponse.class,
            com.example.foodzoneclient.protocols.SubmitOrderResponse.class,
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
        com.google.protobuf.Parser<com.example.foodzoneclient.protocols.ServerMessage> parser = PARSER;
        if (parser == null) {
          synchronized (com.example.foodzoneclient.protocols.ServerMessage.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<com.example.foodzoneclient.protocols.ServerMessage>(
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


  // @@protoc_insertion_point(class_scope:foodzone_protocols.ServerMessage)
  private static final com.example.foodzoneclient.protocols.ServerMessage DEFAULT_INSTANCE;
  static {
    ServerMessage defaultInstance = new ServerMessage();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      ServerMessage.class, defaultInstance);
  }

  public static com.example.foodzoneclient.protocols.ServerMessage getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<ServerMessage> PARSER;

  public static com.google.protobuf.Parser<ServerMessage> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

