// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PATH/MessageWrapper.proto

package com.example.foodzoneclient.protocols;

/**
 * Protobuf type {@code p4f_protocols.changePassInfo}
 */
public final class changePassInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:p4f_protocols.changePassInfo)
    changePassInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use changePassInfo.newBuilder() to construct.
  private changePassInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private changePassInfo() {
    username_ = "";
    oldPass_ = "";
    newPass_ = "";
    newPassConfirm_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new changePassInfo();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private changePassInfo(
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

            oldPass_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            newPass_ = s;
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            newPassConfirm_ = s;
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
    return com.example.foodzoneclient.protocols.MessageWrapper.internal_static_p4f_protocols_changePassInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.example.foodzoneclient.protocols.MessageWrapper.internal_static_p4f_protocols_changePassInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.example.foodzoneclient.protocols.changePassInfo.class, com.example.foodzoneclient.protocols.changePassInfo.Builder.class);
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

  public static final int OLDPASS_FIELD_NUMBER = 2;
  private volatile java.lang.Object oldPass_;
  /**
   * <code>string oldPass = 2;</code>
   * @return The oldPass.
   */
  @java.lang.Override
  public java.lang.String getOldPass() {
    java.lang.Object ref = oldPass_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      oldPass_ = s;
      return s;
    }
  }
  /**
   * <code>string oldPass = 2;</code>
   * @return The bytes for oldPass.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getOldPassBytes() {
    java.lang.Object ref = oldPass_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      oldPass_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int NEWPASS_FIELD_NUMBER = 3;
  private volatile java.lang.Object newPass_;
  /**
   * <code>string newPass = 3;</code>
   * @return The newPass.
   */
  @java.lang.Override
  public java.lang.String getNewPass() {
    java.lang.Object ref = newPass_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      newPass_ = s;
      return s;
    }
  }
  /**
   * <code>string newPass = 3;</code>
   * @return The bytes for newPass.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNewPassBytes() {
    java.lang.Object ref = newPass_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      newPass_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int NEWPASSCONFIRM_FIELD_NUMBER = 4;
  private volatile java.lang.Object newPassConfirm_;
  /**
   * <code>string newPassConfirm = 4;</code>
   * @return The newPassConfirm.
   */
  @java.lang.Override
  public java.lang.String getNewPassConfirm() {
    java.lang.Object ref = newPassConfirm_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      newPassConfirm_ = s;
      return s;
    }
  }
  /**
   * <code>string newPassConfirm = 4;</code>
   * @return The bytes for newPassConfirm.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNewPassConfirmBytes() {
    java.lang.Object ref = newPassConfirm_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      newPassConfirm_ = b;
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
    if (!getUsernameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, username_);
    }
    if (!getOldPassBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, oldPass_);
    }
    if (!getNewPassBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, newPass_);
    }
    if (!getNewPassConfirmBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, newPassConfirm_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getUsernameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, username_);
    }
    if (!getOldPassBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, oldPass_);
    }
    if (!getNewPassBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, newPass_);
    }
    if (!getNewPassConfirmBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, newPassConfirm_);
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
    if (!(obj instanceof com.example.foodzoneclient.protocols.changePassInfo)) {
      return super.equals(obj);
    }
    com.example.foodzoneclient.protocols.changePassInfo other = (com.example.foodzoneclient.protocols.changePassInfo) obj;

    if (!getUsername()
        .equals(other.getUsername())) return false;
    if (!getOldPass()
        .equals(other.getOldPass())) return false;
    if (!getNewPass()
        .equals(other.getNewPass())) return false;
    if (!getNewPassConfirm()
        .equals(other.getNewPassConfirm())) return false;
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
    hash = (37 * hash) + OLDPASS_FIELD_NUMBER;
    hash = (53 * hash) + getOldPass().hashCode();
    hash = (37 * hash) + NEWPASS_FIELD_NUMBER;
    hash = (53 * hash) + getNewPass().hashCode();
    hash = (37 * hash) + NEWPASSCONFIRM_FIELD_NUMBER;
    hash = (53 * hash) + getNewPassConfirm().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.example.foodzoneclient.protocols.changePassInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.foodzoneclient.protocols.changePassInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.foodzoneclient.protocols.changePassInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.foodzoneclient.protocols.changePassInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.foodzoneclient.protocols.changePassInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.foodzoneclient.protocols.changePassInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.foodzoneclient.protocols.changePassInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.example.foodzoneclient.protocols.changePassInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.example.foodzoneclient.protocols.changePassInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.example.foodzoneclient.protocols.changePassInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.example.foodzoneclient.protocols.changePassInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.example.foodzoneclient.protocols.changePassInfo parseFrom(
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
  public static Builder newBuilder(com.example.foodzoneclient.protocols.changePassInfo prototype) {
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
   * Protobuf type {@code p4f_protocols.changePassInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:p4f_protocols.changePassInfo)
      com.example.foodzoneclient.protocols.changePassInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.example.foodzoneclient.protocols.MessageWrapper.internal_static_p4f_protocols_changePassInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.example.foodzoneclient.protocols.MessageWrapper.internal_static_p4f_protocols_changePassInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.example.foodzoneclient.protocols.changePassInfo.class, com.example.foodzoneclient.protocols.changePassInfo.Builder.class);
    }

    // Construct using com.example.foodzoneclient.protocols.changePassInfo.newBuilder()
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

      oldPass_ = "";

      newPass_ = "";

      newPassConfirm_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.example.foodzoneclient.protocols.MessageWrapper.internal_static_p4f_protocols_changePassInfo_descriptor;
    }

    @java.lang.Override
    public com.example.foodzoneclient.protocols.changePassInfo getDefaultInstanceForType() {
      return com.example.foodzoneclient.protocols.changePassInfo.getDefaultInstance();
    }

    @java.lang.Override
    public com.example.foodzoneclient.protocols.changePassInfo build() {
      com.example.foodzoneclient.protocols.changePassInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.example.foodzoneclient.protocols.changePassInfo buildPartial() {
      com.example.foodzoneclient.protocols.changePassInfo result = new com.example.foodzoneclient.protocols.changePassInfo(this);
      result.username_ = username_;
      result.oldPass_ = oldPass_;
      result.newPass_ = newPass_;
      result.newPassConfirm_ = newPassConfirm_;
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
      if (other instanceof com.example.foodzoneclient.protocols.changePassInfo) {
        return mergeFrom((com.example.foodzoneclient.protocols.changePassInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.example.foodzoneclient.protocols.changePassInfo other) {
      if (other == com.example.foodzoneclient.protocols.changePassInfo.getDefaultInstance()) return this;
      if (!other.getUsername().isEmpty()) {
        username_ = other.username_;
        onChanged();
      }
      if (!other.getOldPass().isEmpty()) {
        oldPass_ = other.oldPass_;
        onChanged();
      }
      if (!other.getNewPass().isEmpty()) {
        newPass_ = other.newPass_;
        onChanged();
      }
      if (!other.getNewPassConfirm().isEmpty()) {
        newPassConfirm_ = other.newPassConfirm_;
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
      com.example.foodzoneclient.protocols.changePassInfo parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.example.foodzoneclient.protocols.changePassInfo) e.getUnfinishedMessage();
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

    private java.lang.Object oldPass_ = "";
    /**
     * <code>string oldPass = 2;</code>
     * @return The oldPass.
     */
    public java.lang.String getOldPass() {
      java.lang.Object ref = oldPass_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        oldPass_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string oldPass = 2;</code>
     * @return The bytes for oldPass.
     */
    public com.google.protobuf.ByteString
        getOldPassBytes() {
      java.lang.Object ref = oldPass_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        oldPass_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string oldPass = 2;</code>
     * @param value The oldPass to set.
     * @return This builder for chaining.
     */
    public Builder setOldPass(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      oldPass_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string oldPass = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearOldPass() {
      
      oldPass_ = getDefaultInstance().getOldPass();
      onChanged();
      return this;
    }
    /**
     * <code>string oldPass = 2;</code>
     * @param value The bytes for oldPass to set.
     * @return This builder for chaining.
     */
    public Builder setOldPassBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      oldPass_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object newPass_ = "";
    /**
     * <code>string newPass = 3;</code>
     * @return The newPass.
     */
    public java.lang.String getNewPass() {
      java.lang.Object ref = newPass_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        newPass_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string newPass = 3;</code>
     * @return The bytes for newPass.
     */
    public com.google.protobuf.ByteString
        getNewPassBytes() {
      java.lang.Object ref = newPass_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        newPass_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string newPass = 3;</code>
     * @param value The newPass to set.
     * @return This builder for chaining.
     */
    public Builder setNewPass(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      newPass_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string newPass = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearNewPass() {
      
      newPass_ = getDefaultInstance().getNewPass();
      onChanged();
      return this;
    }
    /**
     * <code>string newPass = 3;</code>
     * @param value The bytes for newPass to set.
     * @return This builder for chaining.
     */
    public Builder setNewPassBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      newPass_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object newPassConfirm_ = "";
    /**
     * <code>string newPassConfirm = 4;</code>
     * @return The newPassConfirm.
     */
    public java.lang.String getNewPassConfirm() {
      java.lang.Object ref = newPassConfirm_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        newPassConfirm_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string newPassConfirm = 4;</code>
     * @return The bytes for newPassConfirm.
     */
    public com.google.protobuf.ByteString
        getNewPassConfirmBytes() {
      java.lang.Object ref = newPassConfirm_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        newPassConfirm_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string newPassConfirm = 4;</code>
     * @param value The newPassConfirm to set.
     * @return This builder for chaining.
     */
    public Builder setNewPassConfirm(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      newPassConfirm_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string newPassConfirm = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearNewPassConfirm() {
      
      newPassConfirm_ = getDefaultInstance().getNewPassConfirm();
      onChanged();
      return this;
    }
    /**
     * <code>string newPassConfirm = 4;</code>
     * @param value The bytes for newPassConfirm to set.
     * @return This builder for chaining.
     */
    public Builder setNewPassConfirmBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      newPassConfirm_ = value;
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


    // @@protoc_insertion_point(builder_scope:p4f_protocols.changePassInfo)
  }

  // @@protoc_insertion_point(class_scope:p4f_protocols.changePassInfo)
  private static final com.example.foodzoneclient.protocols.changePassInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.example.foodzoneclient.protocols.changePassInfo();
  }

  public static com.example.foodzoneclient.protocols.changePassInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<changePassInfo>
      PARSER = new com.google.protobuf.AbstractParser<changePassInfo>() {
    @java.lang.Override
    public changePassInfo parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new changePassInfo(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<changePassInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<changePassInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.example.foodzoneclient.protocols.changePassInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

