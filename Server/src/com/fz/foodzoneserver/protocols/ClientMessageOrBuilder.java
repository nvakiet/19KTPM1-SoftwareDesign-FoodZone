// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PATH/MessageWrapper.proto

package com.fz.foodzoneserver.protocols;

public interface ClientMessageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:foodzone_protocols.ClientMessage)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string msg = 1;</code>
   * @return The msg.
   */
  java.lang.String getMsg();
  /**
   * <code>string msg = 1;</code>
   * @return The bytes for msg.
   */
  com.google.protobuf.ByteString
      getMsgBytes();

  /**
   * <code>.foodzone_protocols.LoginRequest loginRequest = 2;</code>
   * @return Whether the loginRequest field is set.
   */
  boolean hasLoginRequest();
  /**
   * <code>.foodzone_protocols.LoginRequest loginRequest = 2;</code>
   * @return The loginRequest.
   */
  com.fz.foodzoneserver.protocols.LoginRequest getLoginRequest();
  /**
   * <code>.foodzone_protocols.LoginRequest loginRequest = 2;</code>
   */
  com.fz.foodzoneserver.protocols.LoginRequestOrBuilder getLoginRequestOrBuilder();

  /**
   * <code>.foodzone_protocols.RegisterRequest registerRequest = 3;</code>
   * @return Whether the registerRequest field is set.
   */
  boolean hasRegisterRequest();
  /**
   * <code>.foodzone_protocols.RegisterRequest registerRequest = 3;</code>
   * @return The registerRequest.
   */
  com.fz.foodzoneserver.protocols.RegisterRequest getRegisterRequest();
  /**
   * <code>.foodzone_protocols.RegisterRequest registerRequest = 3;</code>
   */
  com.fz.foodzoneserver.protocols.RegisterRequestOrBuilder getRegisterRequestOrBuilder();

  /**
   * <code>.foodzone_protocols.UserInfo updateInfoRequest = 4;</code>
   * @return Whether the updateInfoRequest field is set.
   */
  boolean hasUpdateInfoRequest();
  /**
   * <code>.foodzone_protocols.UserInfo updateInfoRequest = 4;</code>
   * @return The updateInfoRequest.
   */
  com.fz.foodzoneserver.protocols.UserInfo getUpdateInfoRequest();
  /**
   * <code>.foodzone_protocols.UserInfo updateInfoRequest = 4;</code>
   */
  com.fz.foodzoneserver.protocols.UserInfoOrBuilder getUpdateInfoRequestOrBuilder();

  public com.fz.foodzoneserver.protocols.ClientMessage.RequestsCase getRequestsCase();
}
