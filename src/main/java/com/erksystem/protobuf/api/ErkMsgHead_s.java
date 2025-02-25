// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ErkApiMsg.proto

// Protobuf Java Version: 3.25.3
package com.erksystem.protobuf.api;

/**
 * Protobuf type {@code ErkMsgHead_s}
 */
public final class ErkMsgHead_s extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ErkMsgHead_s)
    ErkMsgHead_sOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ErkMsgHead_s.newBuilder() to construct.
  private ErkMsgHead_s(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ErkMsgHead_s() {
    msgType_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ErkMsgHead_s();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.erksystem.protobuf.api.ErkApiMsgOuterClass.internal_static_ErkMsgHead_s_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.erksystem.protobuf.api.ErkApiMsgOuterClass.internal_static_ErkMsgHead_s_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.erksystem.protobuf.api.ErkMsgHead_s.class, com.erksystem.protobuf.api.ErkMsgHead_s.Builder.class);
  }

  private int bitField0_;
  public static final int MSGTYPE_FIELD_NUMBER = 1;
  private int msgType_ = 0;
  /**
   * <code>.ErkMsgType_e MsgType = 1;</code>
   * @return The enum numeric value on the wire for msgType.
   */
  @java.lang.Override public int getMsgTypeValue() {
    return msgType_;
  }
  /**
   * <code>.ErkMsgType_e MsgType = 1;</code>
   * @return The msgType.
   */
  @java.lang.Override public com.erksystem.protobuf.api.ErkMsgType_e getMsgType() {
    com.erksystem.protobuf.api.ErkMsgType_e result = com.erksystem.protobuf.api.ErkMsgType_e.forNumber(msgType_);
    return result == null ? com.erksystem.protobuf.api.ErkMsgType_e.UNRECOGNIZED : result;
  }

  public static final int QUEUEINFO_FIELD_NUMBER = 2;
  private com.erksystem.protobuf.api.QueueInfo_s queueInfo_;
  /**
   * <code>.QueueInfo_s QueueInfo = 2;</code>
   * @return Whether the queueInfo field is set.
   */
  @java.lang.Override
  public boolean hasQueueInfo() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>.QueueInfo_s QueueInfo = 2;</code>
   * @return The queueInfo.
   */
  @java.lang.Override
  public com.erksystem.protobuf.api.QueueInfo_s getQueueInfo() {
    return queueInfo_ == null ? com.erksystem.protobuf.api.QueueInfo_s.getDefaultInstance() : queueInfo_;
  }
  /**
   * <code>.QueueInfo_s QueueInfo = 2;</code>
   */
  @java.lang.Override
  public com.erksystem.protobuf.api.QueueInfo_sOrBuilder getQueueInfoOrBuilder() {
    return queueInfo_ == null ? com.erksystem.protobuf.api.QueueInfo_s.getDefaultInstance() : queueInfo_;
  }

  public static final int ORGID_FIELD_NUMBER = 3;
  private int orgId_ = 0;
  /**
   * <code>int32 OrgId = 3;</code>
   * @return The orgId.
   */
  @java.lang.Override
  public int getOrgId() {
    return orgId_;
  }

  public static final int USERID_FIELD_NUMBER = 4;
  private int userId_ = 0;
  /**
   * <code>int32 UserId = 4;</code>
   * @return The userId.
   */
  @java.lang.Override
  public int getUserId() {
    return userId_;
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
    if (msgType_ != com.erksystem.protobuf.api.ErkMsgType_e.ErkMsgType_unknown.getNumber()) {
      output.writeEnum(1, msgType_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(2, getQueueInfo());
    }
    if (orgId_ != 0) {
      output.writeInt32(3, orgId_);
    }
    if (userId_ != 0) {
      output.writeInt32(4, userId_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (msgType_ != com.erksystem.protobuf.api.ErkMsgType_e.ErkMsgType_unknown.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, msgType_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getQueueInfo());
    }
    if (orgId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, orgId_);
    }
    if (userId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, userId_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.erksystem.protobuf.api.ErkMsgHead_s)) {
      return super.equals(obj);
    }
    com.erksystem.protobuf.api.ErkMsgHead_s other = (com.erksystem.protobuf.api.ErkMsgHead_s) obj;

    if (msgType_ != other.msgType_) return false;
    if (hasQueueInfo() != other.hasQueueInfo()) return false;
    if (hasQueueInfo()) {
      if (!getQueueInfo()
          .equals(other.getQueueInfo())) return false;
    }
    if (getOrgId()
        != other.getOrgId()) return false;
    if (getUserId()
        != other.getUserId()) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + MSGTYPE_FIELD_NUMBER;
    hash = (53 * hash) + msgType_;
    if (hasQueueInfo()) {
      hash = (37 * hash) + QUEUEINFO_FIELD_NUMBER;
      hash = (53 * hash) + getQueueInfo().hashCode();
    }
    hash = (37 * hash) + ORGID_FIELD_NUMBER;
    hash = (53 * hash) + getOrgId();
    hash = (37 * hash) + USERID_FIELD_NUMBER;
    hash = (53 * hash) + getUserId();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.erksystem.protobuf.api.ErkMsgHead_s parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.erksystem.protobuf.api.ErkMsgHead_s parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.erksystem.protobuf.api.ErkMsgHead_s parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.erksystem.protobuf.api.ErkMsgHead_s parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.erksystem.protobuf.api.ErkMsgHead_s parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.erksystem.protobuf.api.ErkMsgHead_s parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.erksystem.protobuf.api.ErkMsgHead_s parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.erksystem.protobuf.api.ErkMsgHead_s parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.erksystem.protobuf.api.ErkMsgHead_s parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.erksystem.protobuf.api.ErkMsgHead_s parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.erksystem.protobuf.api.ErkMsgHead_s parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.erksystem.protobuf.api.ErkMsgHead_s parseFrom(
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
  public static Builder newBuilder(com.erksystem.protobuf.api.ErkMsgHead_s prototype) {
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
   * Protobuf type {@code ErkMsgHead_s}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ErkMsgHead_s)
      com.erksystem.protobuf.api.ErkMsgHead_sOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.erksystem.protobuf.api.ErkApiMsgOuterClass.internal_static_ErkMsgHead_s_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.erksystem.protobuf.api.ErkApiMsgOuterClass.internal_static_ErkMsgHead_s_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.erksystem.protobuf.api.ErkMsgHead_s.class, com.erksystem.protobuf.api.ErkMsgHead_s.Builder.class);
    }

    // Construct using com.erksystem.protobuf.api.ErkMsgHead_s.newBuilder()
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
        getQueueInfoFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      msgType_ = 0;
      queueInfo_ = null;
      if (queueInfoBuilder_ != null) {
        queueInfoBuilder_.dispose();
        queueInfoBuilder_ = null;
      }
      orgId_ = 0;
      userId_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.erksystem.protobuf.api.ErkApiMsgOuterClass.internal_static_ErkMsgHead_s_descriptor;
    }

    @java.lang.Override
    public com.erksystem.protobuf.api.ErkMsgHead_s getDefaultInstanceForType() {
      return com.erksystem.protobuf.api.ErkMsgHead_s.getDefaultInstance();
    }

    @java.lang.Override
    public com.erksystem.protobuf.api.ErkMsgHead_s build() {
      com.erksystem.protobuf.api.ErkMsgHead_s result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.erksystem.protobuf.api.ErkMsgHead_s buildPartial() {
      com.erksystem.protobuf.api.ErkMsgHead_s result = new com.erksystem.protobuf.api.ErkMsgHead_s(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.erksystem.protobuf.api.ErkMsgHead_s result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.msgType_ = msgType_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.queueInfo_ = queueInfoBuilder_ == null
            ? queueInfo_
            : queueInfoBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.orgId_ = orgId_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.userId_ = userId_;
      }
      result.bitField0_ |= to_bitField0_;
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
      if (other instanceof com.erksystem.protobuf.api.ErkMsgHead_s) {
        return mergeFrom((com.erksystem.protobuf.api.ErkMsgHead_s)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.erksystem.protobuf.api.ErkMsgHead_s other) {
      if (other == com.erksystem.protobuf.api.ErkMsgHead_s.getDefaultInstance()) return this;
      if (other.msgType_ != 0) {
        setMsgTypeValue(other.getMsgTypeValue());
      }
      if (other.hasQueueInfo()) {
        mergeQueueInfo(other.getQueueInfo());
      }
      if (other.getOrgId() != 0) {
        setOrgId(other.getOrgId());
      }
      if (other.getUserId() != 0) {
        setUserId(other.getUserId());
      }
      this.mergeUnknownFields(other.getUnknownFields());
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
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8: {
              msgType_ = input.readEnum();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              input.readMessage(
                  getQueueInfoFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 24: {
              orgId_ = input.readInt32();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
            case 32: {
              userId_ = input.readInt32();
              bitField0_ |= 0x00000008;
              break;
            } // case 32
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private int msgType_ = 0;
    /**
     * <code>.ErkMsgType_e MsgType = 1;</code>
     * @return The enum numeric value on the wire for msgType.
     */
    @java.lang.Override public int getMsgTypeValue() {
      return msgType_;
    }
    /**
     * <code>.ErkMsgType_e MsgType = 1;</code>
     * @param value The enum numeric value on the wire for msgType to set.
     * @return This builder for chaining.
     */
    public Builder setMsgTypeValue(int value) {
      msgType_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.ErkMsgType_e MsgType = 1;</code>
     * @return The msgType.
     */
    @java.lang.Override
    public com.erksystem.protobuf.api.ErkMsgType_e getMsgType() {
      com.erksystem.protobuf.api.ErkMsgType_e result = com.erksystem.protobuf.api.ErkMsgType_e.forNumber(msgType_);
      return result == null ? com.erksystem.protobuf.api.ErkMsgType_e.UNRECOGNIZED : result;
    }
    /**
     * <code>.ErkMsgType_e MsgType = 1;</code>
     * @param value The msgType to set.
     * @return This builder for chaining.
     */
    public Builder setMsgType(com.erksystem.protobuf.api.ErkMsgType_e value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      msgType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.ErkMsgType_e MsgType = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearMsgType() {
      bitField0_ = (bitField0_ & ~0x00000001);
      msgType_ = 0;
      onChanged();
      return this;
    }

    private com.erksystem.protobuf.api.QueueInfo_s queueInfo_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.erksystem.protobuf.api.QueueInfo_s, com.erksystem.protobuf.api.QueueInfo_s.Builder, com.erksystem.protobuf.api.QueueInfo_sOrBuilder> queueInfoBuilder_;
    /**
     * <code>.QueueInfo_s QueueInfo = 2;</code>
     * @return Whether the queueInfo field is set.
     */
    public boolean hasQueueInfo() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>.QueueInfo_s QueueInfo = 2;</code>
     * @return The queueInfo.
     */
    public com.erksystem.protobuf.api.QueueInfo_s getQueueInfo() {
      if (queueInfoBuilder_ == null) {
        return queueInfo_ == null ? com.erksystem.protobuf.api.QueueInfo_s.getDefaultInstance() : queueInfo_;
      } else {
        return queueInfoBuilder_.getMessage();
      }
    }
    /**
     * <code>.QueueInfo_s QueueInfo = 2;</code>
     */
    public Builder setQueueInfo(com.erksystem.protobuf.api.QueueInfo_s value) {
      if (queueInfoBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        queueInfo_ = value;
      } else {
        queueInfoBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.QueueInfo_s QueueInfo = 2;</code>
     */
    public Builder setQueueInfo(
        com.erksystem.protobuf.api.QueueInfo_s.Builder builderForValue) {
      if (queueInfoBuilder_ == null) {
        queueInfo_ = builderForValue.build();
      } else {
        queueInfoBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.QueueInfo_s QueueInfo = 2;</code>
     */
    public Builder mergeQueueInfo(com.erksystem.protobuf.api.QueueInfo_s value) {
      if (queueInfoBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          queueInfo_ != null &&
          queueInfo_ != com.erksystem.protobuf.api.QueueInfo_s.getDefaultInstance()) {
          getQueueInfoBuilder().mergeFrom(value);
        } else {
          queueInfo_ = value;
        }
      } else {
        queueInfoBuilder_.mergeFrom(value);
      }
      if (queueInfo_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     * <code>.QueueInfo_s QueueInfo = 2;</code>
     */
    public Builder clearQueueInfo() {
      bitField0_ = (bitField0_ & ~0x00000002);
      queueInfo_ = null;
      if (queueInfoBuilder_ != null) {
        queueInfoBuilder_.dispose();
        queueInfoBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.QueueInfo_s QueueInfo = 2;</code>
     */
    public com.erksystem.protobuf.api.QueueInfo_s.Builder getQueueInfoBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getQueueInfoFieldBuilder().getBuilder();
    }
    /**
     * <code>.QueueInfo_s QueueInfo = 2;</code>
     */
    public com.erksystem.protobuf.api.QueueInfo_sOrBuilder getQueueInfoOrBuilder() {
      if (queueInfoBuilder_ != null) {
        return queueInfoBuilder_.getMessageOrBuilder();
      } else {
        return queueInfo_ == null ?
            com.erksystem.protobuf.api.QueueInfo_s.getDefaultInstance() : queueInfo_;
      }
    }
    /**
     * <code>.QueueInfo_s QueueInfo = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.erksystem.protobuf.api.QueueInfo_s, com.erksystem.protobuf.api.QueueInfo_s.Builder, com.erksystem.protobuf.api.QueueInfo_sOrBuilder> 
        getQueueInfoFieldBuilder() {
      if (queueInfoBuilder_ == null) {
        queueInfoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.erksystem.protobuf.api.QueueInfo_s, com.erksystem.protobuf.api.QueueInfo_s.Builder, com.erksystem.protobuf.api.QueueInfo_sOrBuilder>(
                getQueueInfo(),
                getParentForChildren(),
                isClean());
        queueInfo_ = null;
      }
      return queueInfoBuilder_;
    }

    private int orgId_ ;
    /**
     * <code>int32 OrgId = 3;</code>
     * @return The orgId.
     */
    @java.lang.Override
    public int getOrgId() {
      return orgId_;
    }
    /**
     * <code>int32 OrgId = 3;</code>
     * @param value The orgId to set.
     * @return This builder for chaining.
     */
    public Builder setOrgId(int value) {

      orgId_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>int32 OrgId = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearOrgId() {
      bitField0_ = (bitField0_ & ~0x00000004);
      orgId_ = 0;
      onChanged();
      return this;
    }

    private int userId_ ;
    /**
     * <code>int32 UserId = 4;</code>
     * @return The userId.
     */
    @java.lang.Override
    public int getUserId() {
      return userId_;
    }
    /**
     * <code>int32 UserId = 4;</code>
     * @param value The userId to set.
     * @return This builder for chaining.
     */
    public Builder setUserId(int value) {

      userId_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>int32 UserId = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearUserId() {
      bitField0_ = (bitField0_ & ~0x00000008);
      userId_ = 0;
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


    // @@protoc_insertion_point(builder_scope:ErkMsgHead_s)
  }

  // @@protoc_insertion_point(class_scope:ErkMsgHead_s)
  private static final com.erksystem.protobuf.api.ErkMsgHead_s DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.erksystem.protobuf.api.ErkMsgHead_s();
  }

  public static com.erksystem.protobuf.api.ErkMsgHead_s getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ErkMsgHead_s>
      PARSER = new com.google.protobuf.AbstractParser<ErkMsgHead_s>() {
    @java.lang.Override
    public ErkMsgHead_s parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<ErkMsgHead_s> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ErkMsgHead_s> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.erksystem.protobuf.api.ErkMsgHead_s getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

