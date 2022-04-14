// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PATH/MessageWrapper.proto

package com.fz.foodzoneserver.protocols;

public interface ServerMessageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:p4f_protocols.ServerMessage)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 opcode = 1;</code>
   * @return The opcode.
   */
  int getOpcode();

  /**
   * <code>.p4f_protocols.InfoResponse infoResponse = 2;</code>
   * @return Whether the infoResponse field is set.
   */
  boolean hasInfoResponse();
  /**
   * <code>.p4f_protocols.InfoResponse infoResponse = 2;</code>
   * @return The infoResponse.
   */
  InfoResponse getInfoResponse();
  /**
   * <code>.p4f_protocols.InfoResponse infoResponse = 2;</code>
   */
  InfoResponseOrBuilder getInfoResponseOrBuilder();

  /**
   * <pre>
   *Announce Register status and change password status
   * </pre>
   *
   * <code>int32 responseCode = 3;</code>
   * @return Whether the responseCode field is set.
   */
  boolean hasResponseCode();
  /**
   * <pre>
   *Announce Register status and change password status
   * </pre>
   *
   * <code>int32 responseCode = 3;</code>
   * @return The responseCode.
   */
  int getResponseCode();

  /**
   * <code>.p4f_protocols.orderResponse orderRes = 4;</code>
   * @return Whether the orderRes field is set.
   */
  boolean hasOrderRes();
  /**
   * <code>.p4f_protocols.orderResponse orderRes = 4;</code>
   * @return The orderRes.
   */
  orderResponse getOrderRes();
  /**
   * <code>.p4f_protocols.orderResponse orderRes = 4;</code>
   */
  orderResponseOrBuilder getOrderResOrBuilder();

  /**
   * <code>.p4f_protocols.changePassInfo changeRes = 5;</code>
   * @return Whether the changeRes field is set.
   */
  boolean hasChangeRes();
  /**
   * <code>.p4f_protocols.changePassInfo changeRes = 5;</code>
   * @return The changeRes.
   */
  changePassInfo getChangeRes();
  /**
   * <code>.p4f_protocols.changePassInfo changeRes = 5;</code>
   */
  changePassInfoOrBuilder getChangeResOrBuilder();

  public ServerMessage.ServerResponsesCase getServerResponsesCase();
}