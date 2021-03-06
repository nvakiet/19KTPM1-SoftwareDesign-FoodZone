// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PATH/MessageWrapper.proto

package com.fz.foodzoneserver.protocols;

/**
 * Protobuf type {@code foodzone_protocols.UpdatePasswordRequest}
 */
public final class UpdatePasswordRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:foodzone_protocols.UpdatePasswordRequest)
    UpdatePasswordRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UpdatePasswordRequest.newBuilder() to construct.
  private UpdatePasswordRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpdatePasswordRequest() {
    username_ = "";
    oldPassword_ = "";
    newPassword_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UpdatePasswordRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private UpdatePasswordRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            username_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            oldPassword_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            newPassword_ = s;
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.fz.foodzoneserver.protocols.MessageWrapper.internal_static_foodzone_protocols_UpdatePasswordRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.fz.foodzoneserver.protocols.MessageWrapper.internal_static_foodzone_protocols_UpdatePasswordRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.fz.foodzoneserver.protocols.UpdatePasswordRequest.class, com.fz.foodzoneserver.protocols.UpdatePasswordRequest.Builder.class);
  }

  public static final int USERNAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object username_;
  /**
   * <code>string username = 1;</code>
   * @return The username.
   */
  @java.lang.Override
  public java.lang.String getUsername() {
    java.lang.Object ref = username_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      username_ = s;
      return s;
    }
  }
  /**
   * <code>string username = 1;</code>
   * @return The bytes for username.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getUsernameBytes() {
    java.lang.Object ref = username_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      username_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int OLDPASSWORD_FIELD_NUMBER = 2;
  private volatile java.lang.Object oldPassword_;
  /**
   * <code>string oldPassword = 2;</code>
   * @return The oldPassword.
   */
  @java.lang.Override
  public java.lang.String getOldPassword() {
    java.lang.Object ref = oldPassword_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      oldPassword_ = s;
      return s;
    }
  }
  /**
   * <code>string oldPassword = 2;</code>
   * @return The bytes for oldPassword.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getOldPasswordBytes() {
    java.lang.Object ref = oldPassword_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      oldPassword_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int NEWPASSWORD_FIELD_NUMBER = 3;
  private volatile java.lang.Object newPassword_;
  /**
   * <code>string newPassword = 3;</code>
   * @return The newPassword.
   */
  @java.lang.Override
  public java.lang.String getNewPassword() {
    java.lang.Object ref = newPassword_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      newPassword_ = s;
      return s;
    }
  }
  /**
   * <code>string newPassword = 3;</code>
   * @return The bytes for newPassword.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNewPasswordBytes() {
    java.lang.Object ref = newPassword_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      newPassword_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(username_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, username_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(oldPassword_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, oldPassword_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(newPassword_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, newPassword_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(username_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, username_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(oldPassword_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, oldPassword_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(newPassword_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, newPassword_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.fz.foodzoneserver.protocols.UpdatePasswordRequest)) {
      return super.equals(obj);
    }
    com.fz.foodzoneserver.protocols.UpdatePasswordRequest other = (com.fz.foodzoneserver.protocols.UpdatePasswordRequest) obj;

    if (!getUsername()
        .equals(other.getUsername())) return false;
    if (!getOldPassword()
        .equals(other.getOldPassword())) return false;
    if (!getNewPassword()
        .equals(other.getNewPassword())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + USERNAME_FIELD_NUMBER;
    hash = (53 * hash) + getUsername().hashCode();
    hash = (37 * hash) + OLDPASSWORD_FIELD_NUMBER;
    hash = (53 * hash) + getOldPassword().hashCode();
    hash = (37 * hash) + NEWPASSWORD_FIELD_NUMBER;
    hash = (53 * hash) + getNewPassword().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.fz.foodzoneserver.protocols.UpdatePasswordRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.fz.foodzoneserver.protocols.UpdatePasswordRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.fz.foodzoneserver.protocols.UpdatePasswordRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.fz.foodzoneserver.protocols.UpdatePasswordRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.fz.foodzoneserver.protocols.UpdatePasswordRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.fz.foodzoneserver.protocols.UpdatePasswordRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.fz.foodzoneserver.protocols.UpdatePasswordRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.fz.foodzoneserver.protocols.UpdatePasswordRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.fz.foodzoneserver.protocols.UpdatePasswordRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.fz.foodzoneserver.protocols.UpdatePasswordRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.fz.foodzoneserver.protocols.UpdatePasswordRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.fz.foodzoneserver.protocols.UpdatePasswordRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.fz.foodzoneserver.protocols.UpdatePasswordRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code foodzone_protocols.UpdatePasswordRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:foodzone_protocols.UpdatePasswordRequest)
      com.fz.foodzoneserver.protocols.UpdatePasswordRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.fz.foodzoneserver.protocols.MessageWrapper.internal_static_foodzone_protocols_UpdatePasswordRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.fz.foodzoneserver.protocols.MessageWrapper.internal_static_foodzone_protocols_UpdatePasswordRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.fz.foodzoneserver.protocols.UpdatePasswordRequest.class, com.fz.foodzoneserver.protocols.UpdatePasswordRequest.Builder.class);
    }

    // Construct using com.fz.foodzoneserver.protocols.UpdatePasswordRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      username_ = "";

      oldPassword_ = "";

      newPassword_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.fz.foodzoneserver.protocols.MessageWrapper.internal_static_foodzone_protocols_UpdatePasswordRequest_descriptor;
    }

    @java.lang.Override
    public com.fz.foodzoneserver.protocols.UpdatePasswordRequest getDefaultInstanceForType() {
      return com.fz.foodzoneserver.protocols.UpdatePasswordRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.fz.foodzoneserver.protocols.UpdatePasswordRequest build() {
      com.fz.foodzoneserver.protocols.UpdatePasswordRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.fz.foodzoneserver.protocols.UpdatePasswordRequest buildPartial() {
      com.fz.foodzoneserver.protocols.UpdatePasswordRequest result = new com.fz.foodzoneserver.protocols.UpdatePasswordRequest(this);
      result.username_ = username_;
      result.oldPassword_ = oldPassword_;
      result.newPassword_ = newPassword_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.fz.foodzoneserver.protocols.UpdatePasswordRequest) {
        return mergeFrom((com.fz.foodzoneserver.protocols.UpdatePasswordRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.fz.foodzoneserver.protocols.UpdatePasswordRequest other) {
      if (other == com.fz.foodzoneserver.protocols.UpdatePasswordRequest.getDefaultInstance()) return this;
      if (!other.getUsername().isEmpty()) {
        username_ = other.username_;
        onChanged();
      }
      if (!other.getOldPassword().isEmpty()) {
        oldPassword_ = other.oldPassword_;
        onChanged();
      }
      if (!other.getNewPassword().isEmpty()) {
        newPassword_ = other.newPassword_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.fz.foodzoneserver.protocols.UpdatePasswordRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.fz.foodzoneserver.protocols.UpdatePasswordRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object username_ = "";
    /**
     * <code>string username = 1;</code>
     * @return The username.
     */
    public java.lang.String getUsername() {
      java.lang.Object ref = username_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        username_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string username = 1;</code>
     * @return The bytes for username.
     */
    public com.google.protobuf.ByteString
        getUsernameBytes() {
      java.lang.Object ref = username_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        username_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string username = 1;</code>
     * @param value The username to set.
     * @return This builder for chaining.
     */
    public Builder setUsername(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      username_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string username = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearUsername() {
      
      username_ = getDefaultInstance().getUsername();
      onChanged();
      return this;
    }
    /**
     * <code>string username = 1;</code>
     * @param value The bytes for username to set.
     * @return This builder for chaining.
     */
    public Builder setUsernameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      username_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object oldPassword_ = "";
    /**
     * <code>string oldPassword = 2;</code>
     * @return The oldPassword.
     */
    public java.lang.String getOldPassword() {
      java.lang.Object ref = oldPassword_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        oldPassword_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string oldPassword = 2;</code>
     * @return The bytes for oldPassword.
     */
    public com.google.protobuf.ByteString
        getOldPasswordBytes() {
      java.lang.Object ref = oldPassword_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        oldPassword_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string oldPassword = 2;</code>
     * @param value The oldPassword to set.
     * @return This builder for chaining.
     */
    public Builder setOldPassword(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      oldPassword_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string oldPassword = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearOldPassword() {
      
      oldPassword_ = getDefaultInstance().getOldPassword();
      onChanged();
      return this;
    }
    /**
     * <code>string oldPassword = 2;</code>
     * @param value The bytes for oldPassword to set.
     * @return This builder for chaining.
     */
    public Builder setOldPasswordBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      oldPassword_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object newPassword_ = "";
    /**
     * <code>string newPassword = 3;</code>
     * @return The newPassword.
     */
    public java.lang.String getNewPassword() {
      java.lang.Object ref = newPassword_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        newPassword_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string newPassword = 3;</code>
     * @return The bytes for newPassword.
     */
    public com.google.protobuf.ByteString
        getNewPasswordBytes() {
      java.lang.Object ref = newPassword_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        newPassword_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string newPassword = 3;</code>
     * @param value The newPassword to set.
     * @return This builder for chaining.
     */
    public Builder setNewPassword(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      newPassword_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string newPassword = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearNewPassword() {
      
      newPassword_ = getDefaultInstance().getNewPassword();
      onChanged();
      return this;
    }
    /**
     * <code>string newPassword = 3;</code>
     * @param value The bytes for newPassword to set.
     * @return This builder for chaining.
     */
    public Builder setNewPasswordBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      newPassword_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:foodzone_protocols.UpdatePasswordRequest)
  }

  // @@protoc_insertion_point(class_scope:foodzone_protocols.UpdatePasswordRequest)
  private static final com.fz.foodzoneserver.protocols.UpdatePasswordRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.fz.foodzoneserver.protocols.UpdatePasswordRequest();
  }

  public static com.fz.foodzoneserver.protocols.UpdatePasswordRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdatePasswordRequest>
      PARSER = new com.google.protobuf.AbstractParser<UpdatePasswordRequest>() {
    @java.lang.Override
    public UpdatePasswordRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new UpdatePasswordRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<UpdatePasswordRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdatePasswordRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.fz.foodzoneserver.protocols.UpdatePasswordRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

