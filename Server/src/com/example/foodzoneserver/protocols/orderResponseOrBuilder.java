// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PATH/MessageWrapper.proto

package com.example.foodzoneserver.protocols;

public interface orderResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:p4f_protocols.orderResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   *orderID = username +_+ buyDate +_+ resID
   * </pre>
   *
   * <code>optional string orderID = 1;</code>
   * @return Whether the orderID field is set.
   */
  boolean hasOrderID();
  /**
   * <pre>
   *orderID = username +_+ buyDate +_+ resID
   * </pre>
   *
   * <code>optional string orderID = 1;</code>
   * @return The orderID.
   */
  java.lang.String getOrderID();
  /**
   * <pre>
   *orderID = username +_+ buyDate +_+ resID
   * </pre>
   *
   * <code>optional string orderID = 1;</code>
   * @return The bytes for orderID.
   */
  com.google.protobuf.ByteString
      getOrderIDBytes();

  /**
   * <code>int32 orderResult = 2;</code>
   * @return The orderResult.
   */
  int getOrderResult();
}