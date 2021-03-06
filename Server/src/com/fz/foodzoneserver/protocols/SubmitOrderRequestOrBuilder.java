// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PATH/MessageWrapper.proto

package com.fz.foodzoneserver.protocols;

public interface SubmitOrderRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:foodzone_protocols.SubmitOrderRequest)
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
   * <code>string datetime = 2;</code>
   * @return The datetime.
   */
  java.lang.String getDatetime();
  /**
   * <code>string datetime = 2;</code>
   * @return The bytes for datetime.
   */
  com.google.protobuf.ByteString
      getDatetimeBytes();

  /**
   * <code>repeated string mealID = 3;</code>
   * @return A list containing the mealID.
   */
  java.util.List<java.lang.String>
      getMealIDList();
  /**
   * <code>repeated string mealID = 3;</code>
   * @return The count of mealID.
   */
  int getMealIDCount();
  /**
   * <code>repeated string mealID = 3;</code>
   * @param index The index of the element to return.
   * @return The mealID at the given index.
   */
  java.lang.String getMealID(int index);
  /**
   * <code>repeated string mealID = 3;</code>
   * @param index The index of the value to return.
   * @return The bytes of the mealID at the given index.
   */
  com.google.protobuf.ByteString
      getMealIDBytes(int index);

  /**
   * <code>repeated int32 mealQuantity = 4;</code>
   * @return A list containing the mealQuantity.
   */
  java.util.List<java.lang.Integer> getMealQuantityList();
  /**
   * <code>repeated int32 mealQuantity = 4;</code>
   * @return The count of mealQuantity.
   */
  int getMealQuantityCount();
  /**
   * <code>repeated int32 mealQuantity = 4;</code>
   * @param index The index of the element to return.
   * @return The mealQuantity at the given index.
   */
  int getMealQuantity(int index);

  /**
   * <code>string recipientFullName = 5;</code>
   * @return The recipientFullName.
   */
  java.lang.String getRecipientFullName();
  /**
   * <code>string recipientFullName = 5;</code>
   * @return The bytes for recipientFullName.
   */
  com.google.protobuf.ByteString
      getRecipientFullNameBytes();

  /**
   * <code>string recipientID = 6;</code>
   * @return The recipientID.
   */
  java.lang.String getRecipientID();
  /**
   * <code>string recipientID = 6;</code>
   * @return The bytes for recipientID.
   */
  com.google.protobuf.ByteString
      getRecipientIDBytes();

  /**
   * <code>string recipientAddress = 7;</code>
   * @return The recipientAddress.
   */
  java.lang.String getRecipientAddress();
  /**
   * <code>string recipientAddress = 7;</code>
   * @return The bytes for recipientAddress.
   */
  com.google.protobuf.ByteString
      getRecipientAddressBytes();

  /**
   * <code>string recipientPhone = 8;</code>
   * @return The recipientPhone.
   */
  java.lang.String getRecipientPhone();
  /**
   * <code>string recipientPhone = 8;</code>
   * @return The bytes for recipientPhone.
   */
  com.google.protobuf.ByteString
      getRecipientPhoneBytes();

  /**
   * <code>string recipientEmail = 9;</code>
   * @return The recipientEmail.
   */
  java.lang.String getRecipientEmail();
  /**
   * <code>string recipientEmail = 9;</code>
   * @return The bytes for recipientEmail.
   */
  com.google.protobuf.ByteString
      getRecipientEmailBytes();
}
