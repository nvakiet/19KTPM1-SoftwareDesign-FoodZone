// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PATH/MessageWrapper.proto

package com.example.foodzoneclient.protocols;

public interface FoodOrBuilder extends
    // @@protoc_insertion_point(interface_extends:foodzone_protocols.Food)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <code>string foodID = 1;</code>
   * @return The foodID.
   */
  java.lang.String getFoodID();
  /**
   * <code>string foodID = 1;</code>
   * @return The bytes for foodID.
   */
  com.google.protobuf.ByteString
      getFoodIDBytes();

  /**
   * <pre>
   *description
   * </pre>
   *
   * <code>optional string des = 2;</code>
   * @return Whether the des field is set.
   */
  boolean hasDes();
  /**
   * <pre>
   *description
   * </pre>
   *
   * <code>optional string des = 2;</code>
   * @return The des.
   */
  java.lang.String getDes();
  /**
   * <pre>
   *description
   * </pre>
   *
   * <code>optional string des = 2;</code>
   * @return The bytes for des.
   */
  com.google.protobuf.ByteString
      getDesBytes();

  /**
   * <code>optional string foodName = 3;</code>
   * @return Whether the foodName field is set.
   */
  boolean hasFoodName();
  /**
   * <code>optional string foodName = 3;</code>
   * @return The foodName.
   */
  java.lang.String getFoodName();
  /**
   * <code>optional string foodName = 3;</code>
   * @return The bytes for foodName.
   */
  com.google.protobuf.ByteString
      getFoodNameBytes();

  /**
   * <code>int32 price = 4;</code>
   * @return The price.
   */
  int getPrice();

  /**
   * <code>int32 amount = 5;</code>
   * @return The amount.
   */
  int getAmount();
}
