// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PATH/MessageWrapper.proto

package com.example.foodzoneserver.protocols;

public interface OrderOrBuilder extends
    // @@protoc_insertion_point(interface_extends:p4f_protocols.Order)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string username = 1;</code>
   * @return The username.
   */
  java.lang.String getUsername();
  /**
   * <code>string username = 1;</code>
   * @return The bytes for username.
   */
  com.google.protobuf.ByteString
      getUsernameBytes();

  /**
   * <code>string buyDate = 2;</code>
   * @return The buyDate.
   */
  java.lang.String getBuyDate();
  /**
   * <code>string buyDate = 2;</code>
   * @return The bytes for buyDate.
   */
  com.google.protobuf.ByteString
      getBuyDateBytes();

  /**
   * <code>string resID = 3;</code>
   * @return The resID.
   */
  java.lang.String getResID();
  /**
   * <code>string resID = 3;</code>
   * @return The bytes for resID.
   */
  com.google.protobuf.ByteString
      getResIDBytes();

  /**
   * <code>repeated .p4f_protocols.Food foodList = 4;</code>
   */
  java.util.List<Food>
      getFoodListList();
  /**
   * <code>repeated .p4f_protocols.Food foodList = 4;</code>
   */
  Food getFoodList(int index);
  /**
   * <code>repeated .p4f_protocols.Food foodList = 4;</code>
   */
  int getFoodListCount();
  /**
   * <code>repeated .p4f_protocols.Food foodList = 4;</code>
   */
  java.util.List<? extends FoodOrBuilder>
      getFoodListOrBuilderList();
  /**
   * <code>repeated .p4f_protocols.Food foodList = 4;</code>
   */
  FoodOrBuilder getFoodListOrBuilder(
      int index);
}