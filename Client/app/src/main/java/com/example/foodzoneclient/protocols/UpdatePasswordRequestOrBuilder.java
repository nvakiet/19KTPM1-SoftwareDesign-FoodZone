// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PATH/MessageWrapper.proto

package com.example.foodzoneclient.protocols;

public interface UpdatePasswordRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:foodzone_protocols.UpdatePasswordRequest)
    com.google.protobuf.MessageLiteOrBuilder {

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
   * <code>string oldPassword = 2;</code>
   * @return The oldPassword.
   */
  java.lang.String getOldPassword();
  /**
   * <code>string oldPassword = 2;</code>
   * @return The bytes for oldPassword.
   */
  com.google.protobuf.ByteString
      getOldPasswordBytes();

  /**
   * <code>string newPassword = 3;</code>
   * @return The newPassword.
   */
  java.lang.String getNewPassword();
  /**
   * <code>string newPassword = 3;</code>
   * @return The bytes for newPassword.
   */
  com.google.protobuf.ByteString
      getNewPasswordBytes();
}