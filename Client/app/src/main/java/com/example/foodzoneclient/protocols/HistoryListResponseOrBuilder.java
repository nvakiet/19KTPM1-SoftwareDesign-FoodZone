// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PATH/MessageWrapper.proto

package com.example.foodzoneclient.protocols;

public interface HistoryListResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:foodzone_protocols.HistoryListResponse)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <code>string result = 1;</code>
   * @return The result.
   */
  java.lang.String getResult();
  /**
   * <code>string result = 1;</code>
   * @return The bytes for result.
   */
  com.google.protobuf.ByteString
      getResultBytes();

  /**
   * <code>repeated .foodzone_protocols.Order orderHistory = 2;</code>
   */
  java.util.List<com.example.foodzoneclient.protocols.Order> 
      getOrderHistoryList();
  /**
   * <code>repeated .foodzone_protocols.Order orderHistory = 2;</code>
   */
  com.example.foodzoneclient.protocols.Order getOrderHistory(int index);
  /**
   * <code>repeated .foodzone_protocols.Order orderHistory = 2;</code>
   */
  int getOrderHistoryCount();
}