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
  }
  private int serverResponsesCase_ = 0;
  private java.lang.Object serverResponses_;
  public enum ServerResponsesCase {
    INFORESPONSE(2),
    RESPONSECODE(3),
    ORDERRES(4),
    CHANGERES(5),
    SERVERRESPONSES_NOT_SET(0);
    private final int value;
    private ServerResponsesCase(int value) {
      this.value = value;
    }
    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static ServerResponsesCase valueOf(int value) {
      return forNumber(value);
    }

    public static ServerResponsesCase forNumber(int value) {
      switch (value) {
        case 2: return INFORESPONSE;
        case 3: return RESPONSECODE;
        case 4: return ORDERRES;
        case 5: return CHANGERES;
        case 0: return SERVERRESPONSES_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  @java.lang.Override
  public ServerResponsesCase
  getServerResponsesCase() {
    return ServerResponsesCase.forNumber(
        serverResponsesCase_);
  }

  private void clearServerResponses() {
    serverResponsesCase_ = 0;
    serverResponses_ = null;
  }

  public static final int OPCODE_FIELD_NUMBER = 1;
  private int opcode_;
  /**
   * <code>int32 opcode = 1;</code>
   * @return The opcode.
   */
  @java.lang.Override
  public int getOpcode() {
    return opcode_;
  }
  /**
   * <code>int32 opcode = 1;</code>
   * @param value The opcode to set.
   */
  private void setOpcode(int value) {
    
    opcode_ = value;
  }
  /**
   * <code>int32 opcode = 1;</code>
   */
  private void clearOpcode() {
    
    opcode_ = 0;
  }

  public static final int INFORESPONSE_FIELD_NUMBER = 2;
  /**
   * <code>.foodzone_protocols.InfoResponse infoResponse = 2;</code>
   */
  @java.lang.Override
  public boolean hasInfoResponse() {
    return serverResponsesCase_ == 2;
  }
  /**
   * <code>.foodzone_protocols.InfoResponse infoResponse = 2;</code>
   */
  @java.lang.Override
  public com.example.foodzoneclient.protocols.InfoResponse getInfoResponse() {
    if (serverResponsesCase_ == 2) {
       return (com.example.foodzoneclient.protocols.InfoResponse) serverResponses_;
    }
    return com.example.foodzoneclient.protocols.InfoResponse.getDefaultInstance();
  }
  /**
   * <code>.foodzone_protocols.InfoResponse infoResponse = 2;</code>
   */
  private void setInfoResponse(com.example.foodzoneclient.protocols.InfoResponse value) {
    value.getClass();
  serverResponses_ = value;
    serverResponsesCase_ = 2;
  }
  /**
   * <code>.foodzone_protocols.InfoResponse infoResponse = 2;</code>
   */
  private void mergeInfoResponse(com.example.foodzoneclient.protocols.InfoResponse value) {
    value.getClass();
  if (serverResponsesCase_ == 2 &&
        serverResponses_ != com.example.foodzoneclient.protocols.InfoResponse.getDefaultInstance()) {
      serverResponses_ = com.example.foodzoneclient.protocols.InfoResponse.newBuilder((com.example.foodzoneclient.protocols.InfoResponse) serverResponses_)
          .mergeFrom(value).buildPartial();
    } else {
      serverResponses_ = value;
    }
    serverResponsesCase_ = 2;
  }
  /**
   * <code>.foodzone_protocols.InfoResponse infoResponse = 2;</code>
   */
  private void clearInfoResponse() {
    if (serverResponsesCase_ == 2) {
      serverResponsesCase_ = 0;
      serverResponses_ = null;
    }
  }

  public static final int RESPONSECODE_FIELD_NUMBER = 3;
  /**
   * <pre>
   *Announce Register status and change password status
   * </pre>
   *
   * <code>int32 responseCode = 3;</code>
   * @return Whether the responseCode field is set.
   */
  @java.lang.Override
  public boolean hasResponseCode() {
    return serverResponsesCase_ == 3;
  }
  /**
   * <pre>
   *Announce Register status and change password status
   * </pre>
   *
   * <code>int32 responseCode = 3;</code>
   * @return The responseCode.
   */
  @java.lang.Override
  public int getResponseCode() {
    if (serverResponsesCase_ == 3) {
      return (java.lang.Integer) serverResponses_;
    }
    return 0;
  }
  /**
   * <pre>
   *Announce Register status and change password status
   * </pre>
   *
   * <code>int32 responseCode = 3;</code>
   * @param value The responseCode to set.
   */
  private void setResponseCode(int value) {
    serverResponsesCase_ = 3;
    serverResponses_ = value;
  }
  /**
   * <pre>
   *Announce Register status and change password status
   * </pre>
   *
   * <code>int32 responseCode = 3;</code>
   */
  private void clearResponseCode() {
    if (serverResponsesCase_ == 3) {
      serverResponsesCase_ = 0;
      serverResponses_ = null;
    }
  }

  public static final int ORDERRES_FIELD_NUMBER = 4;
  /**
   * <code>.foodzone_protocols.orderResponse orderRes = 4;</code>
   */
  @java.lang.Override
  public boolean hasOrderRes() {
    return serverResponsesCase_ == 4;
  }
  /**
   * <code>.foodzone_protocols.orderResponse orderRes = 4;</code>
   */
  @java.lang.Override
  public com.example.foodzoneclient.protocols.orderResponse getOrderRes() {
    if (serverResponsesCase_ == 4) {
       return (com.example.foodzoneclient.protocols.orderResponse) serverResponses_;
    }
    return com.example.foodzoneclient.protocols.orderResponse.getDefaultInstance();
  }
  /**
   * <code>.foodzone_protocols.orderResponse orderRes = 4;</code>
   */
  private void setOrderRes(com.example.foodzoneclient.protocols.orderResponse value) {
    value.getClass();
  serverResponses_ = value;
    serverResponsesCase_ = 4;
  }
  /**
   * <code>.foodzone_protocols.orderResponse orderRes = 4;</code>
   */
  private void mergeOrderRes(com.example.foodzoneclient.protocols.orderResponse value) {
    value.getClass();
  if (serverResponsesCase_ == 4 &&
        serverResponses_ != com.example.foodzoneclient.protocols.orderResponse.getDefaultInstance()) {
      serverResponses_ = com.example.foodzoneclient.protocols.orderResponse.newBuilder((com.example.foodzoneclient.protocols.orderResponse) serverResponses_)
          .mergeFrom(value).buildPartial();
    } else {
      serverResponses_ = value;
    }
    serverResponsesCase_ = 4;
  }
  /**
   * <code>.foodzone_protocols.orderResponse orderRes = 4;</code>
   */
  private void clearOrderRes() {
    if (serverResponsesCase_ == 4) {
      serverResponsesCase_ = 0;
      serverResponses_ = null;
    }
  }

  public static final int CHANGERES_FIELD_NUMBER = 5;
  /**
   * <code>.foodzone_protocols.changePassInfo changeRes = 5;</code>
   */
  @java.lang.Override
  public boolean hasChangeRes() {
    return serverResponsesCase_ == 5;
  }
  /**
   * <code>.foodzone_protocols.changePassInfo changeRes = 5;</code>
   */
  @java.lang.Override
  public com.example.foodzoneclient.protocols.changePassInfo getChangeRes() {
    if (serverResponsesCase_ == 5) {
       return (com.example.foodzoneclient.protocols.changePassInfo) serverResponses_;
    }
    return com.example.foodzoneclient.protocols.changePassInfo.getDefaultInstance();
  }
  /**
   * <code>.foodzone_protocols.changePassInfo changeRes = 5;</code>
   */
  private void setChangeRes(com.example.foodzoneclient.protocols.changePassInfo value) {
    value.getClass();
  serverResponses_ = value;
    serverResponsesCase_ = 5;
  }
  /**
   * <code>.foodzone_protocols.changePassInfo changeRes = 5;</code>
   */
  private void mergeChangeRes(com.example.foodzoneclient.protocols.changePassInfo value) {
    value.getClass();
  if (serverResponsesCase_ == 5 &&
        serverResponses_ != com.example.foodzoneclient.protocols.changePassInfo.getDefaultInstance()) {
      serverResponses_ = com.example.foodzoneclient.protocols.changePassInfo.newBuilder((com.example.foodzoneclient.protocols.changePassInfo) serverResponses_)
          .mergeFrom(value).buildPartial();
    } else {
      serverResponses_ = value;
    }
    serverResponsesCase_ = 5;
  }
  /**
   * <code>.foodzone_protocols.changePassInfo changeRes = 5;</code>
   */
  private void clearChangeRes() {
    if (serverResponsesCase_ == 5) {
      serverResponsesCase_ = 0;
      serverResponses_ = null;
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
    public ServerResponsesCase
        getServerResponsesCase() {
      return instance.getServerResponsesCase();
    }

    public Builder clearServerResponses() {
      copyOnWrite();
      instance.clearServerResponses();
      return this;
    }


    /**
     * <code>int32 opcode = 1;</code>
     * @return The opcode.
     */
    @java.lang.Override
    public int getOpcode() {
      return instance.getOpcode();
    }
    /**
     * <code>int32 opcode = 1;</code>
     * @param value The opcode to set.
     * @return This builder for chaining.
     */
    public Builder setOpcode(int value) {
      copyOnWrite();
      instance.setOpcode(value);
      return this;
    }
    /**
     * <code>int32 opcode = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearOpcode() {
      copyOnWrite();
      instance.clearOpcode();
      return this;
    }

    /**
     * <code>.foodzone_protocols.InfoResponse infoResponse = 2;</code>
     */
    @java.lang.Override
    public boolean hasInfoResponse() {
      return instance.hasInfoResponse();
    }
    /**
     * <code>.foodzone_protocols.InfoResponse infoResponse = 2;</code>
     */
    @java.lang.Override
    public com.example.foodzoneclient.protocols.InfoResponse getInfoResponse() {
      return instance.getInfoResponse();
    }
    /**
     * <code>.foodzone_protocols.InfoResponse infoResponse = 2;</code>
     */
    public Builder setInfoResponse(com.example.foodzoneclient.protocols.InfoResponse value) {
      copyOnWrite();
      instance.setInfoResponse(value);
      return this;
    }
    /**
     * <code>.foodzone_protocols.InfoResponse infoResponse = 2;</code>
     */
    public Builder setInfoResponse(
        com.example.foodzoneclient.protocols.InfoResponse.Builder builderForValue) {
      copyOnWrite();
      instance.setInfoResponse(builderForValue.build());
      return this;
    }
    /**
     * <code>.foodzone_protocols.InfoResponse infoResponse = 2;</code>
     */
    public Builder mergeInfoResponse(com.example.foodzoneclient.protocols.InfoResponse value) {
      copyOnWrite();
      instance.mergeInfoResponse(value);
      return this;
    }
    /**
     * <code>.foodzone_protocols.InfoResponse infoResponse = 2;</code>
     */
    public Builder clearInfoResponse() {
      copyOnWrite();
      instance.clearInfoResponse();
      return this;
    }

    /**
     * <pre>
     *Announce Register status and change password status
     * </pre>
     *
     * <code>int32 responseCode = 3;</code>
     * @return Whether the responseCode field is set.
     */
    @java.lang.Override
    public boolean hasResponseCode() {
      return instance.hasResponseCode();
    }
    /**
     * <pre>
     *Announce Register status and change password status
     * </pre>
     *
     * <code>int32 responseCode = 3;</code>
     * @return The responseCode.
     */
    @java.lang.Override
    public int getResponseCode() {
      return instance.getResponseCode();
    }
    /**
     * <pre>
     *Announce Register status and change password status
     * </pre>
     *
     * <code>int32 responseCode = 3;</code>
     * @param value The responseCode to set.
     * @return This builder for chaining.
     */
    public Builder setResponseCode(int value) {
      copyOnWrite();
      instance.setResponseCode(value);
      return this;
    }
    /**
     * <pre>
     *Announce Register status and change password status
     * </pre>
     *
     * <code>int32 responseCode = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearResponseCode() {
      copyOnWrite();
      instance.clearResponseCode();
      return this;
    }

    /**
     * <code>.foodzone_protocols.orderResponse orderRes = 4;</code>
     */
    @java.lang.Override
    public boolean hasOrderRes() {
      return instance.hasOrderRes();
    }
    /**
     * <code>.foodzone_protocols.orderResponse orderRes = 4;</code>
     */
    @java.lang.Override
    public com.example.foodzoneclient.protocols.orderResponse getOrderRes() {
      return instance.getOrderRes();
    }
    /**
     * <code>.foodzone_protocols.orderResponse orderRes = 4;</code>
     */
    public Builder setOrderRes(com.example.foodzoneclient.protocols.orderResponse value) {
      copyOnWrite();
      instance.setOrderRes(value);
      return this;
    }
    /**
     * <code>.foodzone_protocols.orderResponse orderRes = 4;</code>
     */
    public Builder setOrderRes(
        com.example.foodzoneclient.protocols.orderResponse.Builder builderForValue) {
      copyOnWrite();
      instance.setOrderRes(builderForValue.build());
      return this;
    }
    /**
     * <code>.foodzone_protocols.orderResponse orderRes = 4;</code>
     */
    public Builder mergeOrderRes(com.example.foodzoneclient.protocols.orderResponse value) {
      copyOnWrite();
      instance.mergeOrderRes(value);
      return this;
    }
    /**
     * <code>.foodzone_protocols.orderResponse orderRes = 4;</code>
     */
    public Builder clearOrderRes() {
      copyOnWrite();
      instance.clearOrderRes();
      return this;
    }

    /**
     * <code>.foodzone_protocols.changePassInfo changeRes = 5;</code>
     */
    @java.lang.Override
    public boolean hasChangeRes() {
      return instance.hasChangeRes();
    }
    /**
     * <code>.foodzone_protocols.changePassInfo changeRes = 5;</code>
     */
    @java.lang.Override
    public com.example.foodzoneclient.protocols.changePassInfo getChangeRes() {
      return instance.getChangeRes();
    }
    /**
     * <code>.foodzone_protocols.changePassInfo changeRes = 5;</code>
     */
    public Builder setChangeRes(com.example.foodzoneclient.protocols.changePassInfo value) {
      copyOnWrite();
      instance.setChangeRes(value);
      return this;
    }
    /**
     * <code>.foodzone_protocols.changePassInfo changeRes = 5;</code>
     */
    public Builder setChangeRes(
        com.example.foodzoneclient.protocols.changePassInfo.Builder builderForValue) {
      copyOnWrite();
      instance.setChangeRes(builderForValue.build());
      return this;
    }
    /**
     * <code>.foodzone_protocols.changePassInfo changeRes = 5;</code>
     */
    public Builder mergeChangeRes(com.example.foodzoneclient.protocols.changePassInfo value) {
      copyOnWrite();
      instance.mergeChangeRes(value);
      return this;
    }
    /**
     * <code>.foodzone_protocols.changePassInfo changeRes = 5;</code>
     */
    public Builder clearChangeRes() {
      copyOnWrite();
      instance.clearChangeRes();
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
            "serverResponses_",
            "serverResponsesCase_",
            "opcode_",
            com.example.foodzoneclient.protocols.InfoResponse.class,
            com.example.foodzoneclient.protocols.orderResponse.class,
            com.example.foodzoneclient.protocols.changePassInfo.class,
          };
          java.lang.String info =
              "\u0000\u0005\u0001\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u0004\u0002<\u0000" +
              "\u00037\u0000\u0004<\u0000\u0005<\u0000";
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

