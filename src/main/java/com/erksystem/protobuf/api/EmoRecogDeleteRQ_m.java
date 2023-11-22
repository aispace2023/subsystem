// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ErkApiMsg.proto

// Protobuf Java Version: 3.25.0
package com.erksystem.protobuf.api;

/**
 * Protobuf type {@code EmoRecogDeleteRQ_m}
 */
public final class EmoRecogDeleteRQ_m extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:EmoRecogDeleteRQ_m)
    EmoRecogDeleteRQ_mOrBuilder {
private static final long serialVersionUID = 0L;
  // Use EmoRecogDeleteRQ_m.newBuilder() to construct.
  private EmoRecogDeleteRQ_m(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private EmoRecogDeleteRQ_m() {
    serviceType_ = 0;
    receiveQueueName_ = "";
    sendQueueName_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new EmoRecogDeleteRQ_m();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.erksystem.protobuf.api.ErkApiMsgOuterClass.internal_static_EmoRecogDeleteRQ_m_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.erksystem.protobuf.api.ErkApiMsgOuterClass.internal_static_EmoRecogDeleteRQ_m_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.erksystem.protobuf.api.EmoRecogDeleteRQ_m.class, com.erksystem.protobuf.api.EmoRecogDeleteRQ_m.Builder.class);
  }

  private int bitField0_;
  public static final int ERKMSGHEAD_FIELD_NUMBER = 1;
  private com.erksystem.protobuf.api.ErkMsgHeader erkMsgHead_;
  /**
   * <code>.ErkMsgHeader ErkMsgHead = 1;</code>
   * @return Whether the erkMsgHead field is set.
   */
  @java.lang.Override
  public boolean hasErkMsgHead() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>.ErkMsgHeader ErkMsgHead = 1;</code>
   * @return The erkMsgHead.
   */
  @java.lang.Override
  public com.erksystem.protobuf.api.ErkMsgHeader getErkMsgHead() {
    return erkMsgHead_ == null ? com.erksystem.protobuf.api.ErkMsgHeader.getDefaultInstance() : erkMsgHead_;
  }
  /**
   * <code>.ErkMsgHeader ErkMsgHead = 1;</code>
   */
  @java.lang.Override
  public com.erksystem.protobuf.api.ErkMsgHeaderOrBuilder getErkMsgHeadOrBuilder() {
    return erkMsgHead_ == null ? com.erksystem.protobuf.api.ErkMsgHeader.getDefaultInstance() : erkMsgHead_;
  }

  public static final int MSGTIME_FIELD_NUMBER = 2;
  private long msgTime_ = 0L;
  /**
   * <code>int64 MsgTime = 2;</code>
   * @return The msgTime.
   */
  @java.lang.Override
  public long getMsgTime() {
    return msgTime_;
  }

  public static final int SERVICETYPE_FIELD_NUMBER = 3;
  private int serviceType_ = 0;
  /**
   * <code>.ServiceType_e ServiceType = 3;</code>
   * @return The enum numeric value on the wire for serviceType.
   */
  @java.lang.Override public int getServiceTypeValue() {
    return serviceType_;
  }
  /**
   * <code>.ServiceType_e ServiceType = 3;</code>
   * @return The serviceType.
   */
  @java.lang.Override public com.erksystem.protobuf.api.ServiceType_e getServiceType() {
    com.erksystem.protobuf.api.ServiceType_e result = com.erksystem.protobuf.api.ServiceType_e.forNumber(serviceType_);
    return result == null ? com.erksystem.protobuf.api.ServiceType_e.UNRECOGNIZED : result;
  }

  public static final int RECEIVEQUEUENAME_FIELD_NUMBER = 4;
  @SuppressWarnings("serial")
  private volatile java.lang.Object receiveQueueName_ = "";
  /**
   * <code>string ReceiveQueueName = 4;</code>
   * @return The receiveQueueName.
   */
  @java.lang.Override
  public java.lang.String getReceiveQueueName() {
    java.lang.Object ref = receiveQueueName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      receiveQueueName_ = s;
      return s;
    }
  }
  /**
   * <code>string ReceiveQueueName = 4;</code>
   * @return The bytes for receiveQueueName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getReceiveQueueNameBytes() {
    java.lang.Object ref = receiveQueueName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      receiveQueueName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SENDQUEUENAME_FIELD_NUMBER = 5;
  @SuppressWarnings("serial")
  private volatile java.lang.Object sendQueueName_ = "";
  /**
   * <code>string SendQueueName = 5;</code>
   * @return The sendQueueName.
   */
  @java.lang.Override
  public java.lang.String getSendQueueName() {
    java.lang.Object ref = sendQueueName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      sendQueueName_ = s;
      return s;
    }
  }
  /**
   * <code>string SendQueueName = 5;</code>
   * @return The bytes for sendQueueName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSendQueueNameBytes() {
    java.lang.Object ref = sendQueueName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      sendQueueName_ = b;
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
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(1, getErkMsgHead());
    }
    if (msgTime_ != 0L) {
      output.writeInt64(2, msgTime_);
    }
    if (serviceType_ != com.erksystem.protobuf.api.ServiceType_e.ServiceType_unknown.getNumber()) {
      output.writeEnum(3, serviceType_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(receiveQueueName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, receiveQueueName_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(sendQueueName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, sendQueueName_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getErkMsgHead());
    }
    if (msgTime_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, msgTime_);
    }
    if (serviceType_ != com.erksystem.protobuf.api.ServiceType_e.ServiceType_unknown.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(3, serviceType_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(receiveQueueName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, receiveQueueName_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(sendQueueName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, sendQueueName_);
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
    if (!(obj instanceof com.erksystem.protobuf.api.EmoRecogDeleteRQ_m)) {
      return super.equals(obj);
    }
    com.erksystem.protobuf.api.EmoRecogDeleteRQ_m other = (com.erksystem.protobuf.api.EmoRecogDeleteRQ_m) obj;

    if (hasErkMsgHead() != other.hasErkMsgHead()) return false;
    if (hasErkMsgHead()) {
      if (!getErkMsgHead()
          .equals(other.getErkMsgHead())) return false;
    }
    if (getMsgTime()
        != other.getMsgTime()) return false;
    if (serviceType_ != other.serviceType_) return false;
    if (!getReceiveQueueName()
        .equals(other.getReceiveQueueName())) return false;
    if (!getSendQueueName()
        .equals(other.getSendQueueName())) return false;
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
    if (hasErkMsgHead()) {
      hash = (37 * hash) + ERKMSGHEAD_FIELD_NUMBER;
      hash = (53 * hash) + getErkMsgHead().hashCode();
    }
    hash = (37 * hash) + MSGTIME_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getMsgTime());
    hash = (37 * hash) + SERVICETYPE_FIELD_NUMBER;
    hash = (53 * hash) + serviceType_;
    hash = (37 * hash) + RECEIVEQUEUENAME_FIELD_NUMBER;
    hash = (53 * hash) + getReceiveQueueName().hashCode();
    hash = (37 * hash) + SENDQUEUENAME_FIELD_NUMBER;
    hash = (53 * hash) + getSendQueueName().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.erksystem.protobuf.api.EmoRecogDeleteRQ_m parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.erksystem.protobuf.api.EmoRecogDeleteRQ_m parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.erksystem.protobuf.api.EmoRecogDeleteRQ_m parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.erksystem.protobuf.api.EmoRecogDeleteRQ_m parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.erksystem.protobuf.api.EmoRecogDeleteRQ_m parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.erksystem.protobuf.api.EmoRecogDeleteRQ_m parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.erksystem.protobuf.api.EmoRecogDeleteRQ_m parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.erksystem.protobuf.api.EmoRecogDeleteRQ_m parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.erksystem.protobuf.api.EmoRecogDeleteRQ_m parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.erksystem.protobuf.api.EmoRecogDeleteRQ_m parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.erksystem.protobuf.api.EmoRecogDeleteRQ_m parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.erksystem.protobuf.api.EmoRecogDeleteRQ_m parseFrom(
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
  public static Builder newBuilder(com.erksystem.protobuf.api.EmoRecogDeleteRQ_m prototype) {
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
   * Protobuf type {@code EmoRecogDeleteRQ_m}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:EmoRecogDeleteRQ_m)
      com.erksystem.protobuf.api.EmoRecogDeleteRQ_mOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.erksystem.protobuf.api.ErkApiMsgOuterClass.internal_static_EmoRecogDeleteRQ_m_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.erksystem.protobuf.api.ErkApiMsgOuterClass.internal_static_EmoRecogDeleteRQ_m_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.erksystem.protobuf.api.EmoRecogDeleteRQ_m.class, com.erksystem.protobuf.api.EmoRecogDeleteRQ_m.Builder.class);
    }

    // Construct using com.erksystem.protobuf.api.EmoRecogDeleteRQ_m.newBuilder()
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
        getErkMsgHeadFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      erkMsgHead_ = null;
      if (erkMsgHeadBuilder_ != null) {
        erkMsgHeadBuilder_.dispose();
        erkMsgHeadBuilder_ = null;
      }
      msgTime_ = 0L;
      serviceType_ = 0;
      receiveQueueName_ = "";
      sendQueueName_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.erksystem.protobuf.api.ErkApiMsgOuterClass.internal_static_EmoRecogDeleteRQ_m_descriptor;
    }

    @java.lang.Override
    public com.erksystem.protobuf.api.EmoRecogDeleteRQ_m getDefaultInstanceForType() {
      return com.erksystem.protobuf.api.EmoRecogDeleteRQ_m.getDefaultInstance();
    }

    @java.lang.Override
    public com.erksystem.protobuf.api.EmoRecogDeleteRQ_m build() {
      com.erksystem.protobuf.api.EmoRecogDeleteRQ_m result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.erksystem.protobuf.api.EmoRecogDeleteRQ_m buildPartial() {
      com.erksystem.protobuf.api.EmoRecogDeleteRQ_m result = new com.erksystem.protobuf.api.EmoRecogDeleteRQ_m(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.erksystem.protobuf.api.EmoRecogDeleteRQ_m result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.erkMsgHead_ = erkMsgHeadBuilder_ == null
            ? erkMsgHead_
            : erkMsgHeadBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.msgTime_ = msgTime_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.serviceType_ = serviceType_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.receiveQueueName_ = receiveQueueName_;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.sendQueueName_ = sendQueueName_;
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
      if (other instanceof com.erksystem.protobuf.api.EmoRecogDeleteRQ_m) {
        return mergeFrom((com.erksystem.protobuf.api.EmoRecogDeleteRQ_m)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.erksystem.protobuf.api.EmoRecogDeleteRQ_m other) {
      if (other == com.erksystem.protobuf.api.EmoRecogDeleteRQ_m.getDefaultInstance()) return this;
      if (other.hasErkMsgHead()) {
        mergeErkMsgHead(other.getErkMsgHead());
      }
      if (other.getMsgTime() != 0L) {
        setMsgTime(other.getMsgTime());
      }
      if (other.serviceType_ != 0) {
        setServiceTypeValue(other.getServiceTypeValue());
      }
      if (!other.getReceiveQueueName().isEmpty()) {
        receiveQueueName_ = other.receiveQueueName_;
        bitField0_ |= 0x00000008;
        onChanged();
      }
      if (!other.getSendQueueName().isEmpty()) {
        sendQueueName_ = other.sendQueueName_;
        bitField0_ |= 0x00000010;
        onChanged();
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
            case 10: {
              input.readMessage(
                  getErkMsgHeadFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 16: {
              msgTime_ = input.readInt64();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 24: {
              serviceType_ = input.readEnum();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
            case 34: {
              receiveQueueName_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000008;
              break;
            } // case 34
            case 42: {
              sendQueueName_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000010;
              break;
            } // case 42
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

    private com.erksystem.protobuf.api.ErkMsgHeader erkMsgHead_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.erksystem.protobuf.api.ErkMsgHeader, com.erksystem.protobuf.api.ErkMsgHeader.Builder, com.erksystem.protobuf.api.ErkMsgHeaderOrBuilder> erkMsgHeadBuilder_;
    /**
     * <code>.ErkMsgHeader ErkMsgHead = 1;</code>
     * @return Whether the erkMsgHead field is set.
     */
    public boolean hasErkMsgHead() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.ErkMsgHeader ErkMsgHead = 1;</code>
     * @return The erkMsgHead.
     */
    public com.erksystem.protobuf.api.ErkMsgHeader getErkMsgHead() {
      if (erkMsgHeadBuilder_ == null) {
        return erkMsgHead_ == null ? com.erksystem.protobuf.api.ErkMsgHeader.getDefaultInstance() : erkMsgHead_;
      } else {
        return erkMsgHeadBuilder_.getMessage();
      }
    }
    /**
     * <code>.ErkMsgHeader ErkMsgHead = 1;</code>
     */
    public Builder setErkMsgHead(com.erksystem.protobuf.api.ErkMsgHeader value) {
      if (erkMsgHeadBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        erkMsgHead_ = value;
      } else {
        erkMsgHeadBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.ErkMsgHeader ErkMsgHead = 1;</code>
     */
    public Builder setErkMsgHead(
        com.erksystem.protobuf.api.ErkMsgHeader.Builder builderForValue) {
      if (erkMsgHeadBuilder_ == null) {
        erkMsgHead_ = builderForValue.build();
      } else {
        erkMsgHeadBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.ErkMsgHeader ErkMsgHead = 1;</code>
     */
    public Builder mergeErkMsgHead(com.erksystem.protobuf.api.ErkMsgHeader value) {
      if (erkMsgHeadBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          erkMsgHead_ != null &&
          erkMsgHead_ != com.erksystem.protobuf.api.ErkMsgHeader.getDefaultInstance()) {
          getErkMsgHeadBuilder().mergeFrom(value);
        } else {
          erkMsgHead_ = value;
        }
      } else {
        erkMsgHeadBuilder_.mergeFrom(value);
      }
      if (erkMsgHead_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     * <code>.ErkMsgHeader ErkMsgHead = 1;</code>
     */
    public Builder clearErkMsgHead() {
      bitField0_ = (bitField0_ & ~0x00000001);
      erkMsgHead_ = null;
      if (erkMsgHeadBuilder_ != null) {
        erkMsgHeadBuilder_.dispose();
        erkMsgHeadBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.ErkMsgHeader ErkMsgHead = 1;</code>
     */
    public com.erksystem.protobuf.api.ErkMsgHeader.Builder getErkMsgHeadBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getErkMsgHeadFieldBuilder().getBuilder();
    }
    /**
     * <code>.ErkMsgHeader ErkMsgHead = 1;</code>
     */
    public com.erksystem.protobuf.api.ErkMsgHeaderOrBuilder getErkMsgHeadOrBuilder() {
      if (erkMsgHeadBuilder_ != null) {
        return erkMsgHeadBuilder_.getMessageOrBuilder();
      } else {
        return erkMsgHead_ == null ?
            com.erksystem.protobuf.api.ErkMsgHeader.getDefaultInstance() : erkMsgHead_;
      }
    }
    /**
     * <code>.ErkMsgHeader ErkMsgHead = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.erksystem.protobuf.api.ErkMsgHeader, com.erksystem.protobuf.api.ErkMsgHeader.Builder, com.erksystem.protobuf.api.ErkMsgHeaderOrBuilder> 
        getErkMsgHeadFieldBuilder() {
      if (erkMsgHeadBuilder_ == null) {
        erkMsgHeadBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.erksystem.protobuf.api.ErkMsgHeader, com.erksystem.protobuf.api.ErkMsgHeader.Builder, com.erksystem.protobuf.api.ErkMsgHeaderOrBuilder>(
                getErkMsgHead(),
                getParentForChildren(),
                isClean());
        erkMsgHead_ = null;
      }
      return erkMsgHeadBuilder_;
    }

    private long msgTime_ ;
    /**
     * <code>int64 MsgTime = 2;</code>
     * @return The msgTime.
     */
    @java.lang.Override
    public long getMsgTime() {
      return msgTime_;
    }
    /**
     * <code>int64 MsgTime = 2;</code>
     * @param value The msgTime to set.
     * @return This builder for chaining.
     */
    public Builder setMsgTime(long value) {

      msgTime_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>int64 MsgTime = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearMsgTime() {
      bitField0_ = (bitField0_ & ~0x00000002);
      msgTime_ = 0L;
      onChanged();
      return this;
    }

    private int serviceType_ = 0;
    /**
     * <code>.ServiceType_e ServiceType = 3;</code>
     * @return The enum numeric value on the wire for serviceType.
     */
    @java.lang.Override public int getServiceTypeValue() {
      return serviceType_;
    }
    /**
     * <code>.ServiceType_e ServiceType = 3;</code>
     * @param value The enum numeric value on the wire for serviceType to set.
     * @return This builder for chaining.
     */
    public Builder setServiceTypeValue(int value) {
      serviceType_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.ServiceType_e ServiceType = 3;</code>
     * @return The serviceType.
     */
    @java.lang.Override
    public com.erksystem.protobuf.api.ServiceType_e getServiceType() {
      com.erksystem.protobuf.api.ServiceType_e result = com.erksystem.protobuf.api.ServiceType_e.forNumber(serviceType_);
      return result == null ? com.erksystem.protobuf.api.ServiceType_e.UNRECOGNIZED : result;
    }
    /**
     * <code>.ServiceType_e ServiceType = 3;</code>
     * @param value The serviceType to set.
     * @return This builder for chaining.
     */
    public Builder setServiceType(com.erksystem.protobuf.api.ServiceType_e value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000004;
      serviceType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.ServiceType_e ServiceType = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearServiceType() {
      bitField0_ = (bitField0_ & ~0x00000004);
      serviceType_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object receiveQueueName_ = "";
    /**
     * <code>string ReceiveQueueName = 4;</code>
     * @return The receiveQueueName.
     */
    public java.lang.String getReceiveQueueName() {
      java.lang.Object ref = receiveQueueName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        receiveQueueName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string ReceiveQueueName = 4;</code>
     * @return The bytes for receiveQueueName.
     */
    public com.google.protobuf.ByteString
        getReceiveQueueNameBytes() {
      java.lang.Object ref = receiveQueueName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        receiveQueueName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string ReceiveQueueName = 4;</code>
     * @param value The receiveQueueName to set.
     * @return This builder for chaining.
     */
    public Builder setReceiveQueueName(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      receiveQueueName_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>string ReceiveQueueName = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearReceiveQueueName() {
      receiveQueueName_ = getDefaultInstance().getReceiveQueueName();
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }
    /**
     * <code>string ReceiveQueueName = 4;</code>
     * @param value The bytes for receiveQueueName to set.
     * @return This builder for chaining.
     */
    public Builder setReceiveQueueNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      receiveQueueName_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }

    private java.lang.Object sendQueueName_ = "";
    /**
     * <code>string SendQueueName = 5;</code>
     * @return The sendQueueName.
     */
    public java.lang.String getSendQueueName() {
      java.lang.Object ref = sendQueueName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        sendQueueName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string SendQueueName = 5;</code>
     * @return The bytes for sendQueueName.
     */
    public com.google.protobuf.ByteString
        getSendQueueNameBytes() {
      java.lang.Object ref = sendQueueName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        sendQueueName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string SendQueueName = 5;</code>
     * @param value The sendQueueName to set.
     * @return This builder for chaining.
     */
    public Builder setSendQueueName(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      sendQueueName_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <code>string SendQueueName = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearSendQueueName() {
      sendQueueName_ = getDefaultInstance().getSendQueueName();
      bitField0_ = (bitField0_ & ~0x00000010);
      onChanged();
      return this;
    }
    /**
     * <code>string SendQueueName = 5;</code>
     * @param value The bytes for sendQueueName to set.
     * @return This builder for chaining.
     */
    public Builder setSendQueueNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      sendQueueName_ = value;
      bitField0_ |= 0x00000010;
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


    // @@protoc_insertion_point(builder_scope:EmoRecogDeleteRQ_m)
  }

  // @@protoc_insertion_point(class_scope:EmoRecogDeleteRQ_m)
  private static final com.erksystem.protobuf.api.EmoRecogDeleteRQ_m DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.erksystem.protobuf.api.EmoRecogDeleteRQ_m();
  }

  public static com.erksystem.protobuf.api.EmoRecogDeleteRQ_m getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<EmoRecogDeleteRQ_m>
      PARSER = new com.google.protobuf.AbstractParser<EmoRecogDeleteRQ_m>() {
    @java.lang.Override
    public EmoRecogDeleteRQ_m parsePartialFrom(
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

  public static com.google.protobuf.Parser<EmoRecogDeleteRQ_m> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<EmoRecogDeleteRQ_m> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.erksystem.protobuf.api.EmoRecogDeleteRQ_m getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

