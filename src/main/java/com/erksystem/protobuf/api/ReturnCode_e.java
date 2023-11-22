// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ErkApiMsg.proto

// Protobuf Java Version: 3.25.0
package com.erksystem.protobuf.api;

/**
 * Protobuf enum {@code ReturnCode_e}
 */
public enum ReturnCode_e
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>ReturnCode_unknown = 0;</code>
   */
  ReturnCode_unknown(0),
  /**
   * <code>ReturnCode_ok = 1;</code>
   */
  ReturnCode_ok(1),
  /**
   * <code>ReturnCode_nok_Org = 2;</code>
   */
  ReturnCode_nok_Org(2),
  /**
   * <code>ReturnCode_nok_User = 3;</code>
   */
  ReturnCode_nok_User(3),
  /**
   * <code>ReturnCode_nok_MsgType = 4;</code>
   */
  ReturnCode_nok_MsgType(4),
  /**
   * <code>ReturnCode_nok_EngineType = 5;</code>
   */
  ReturnCode_nok_EngineType(5),
  /**
   * <code>ReturnCode_nok_EngineCondition = 6;</code>
   */
  ReturnCode_nok_EngineCondition(6),
  /**
   * <code>ReturnCode_nok_PhysioEngineCondition = 7;</code>
   */
  ReturnCode_nok_PhysioEngineCondition(7),
  /**
   * <code>ReturnCode_nok_SpeechEngineCondition = 8;</code>
   */
  ReturnCode_nok_SpeechEngineCondition(8),
  /**
   * <code>ReturnCode_nok_FaceEmoEngineCondition = 9;</code>
   */
  ReturnCode_nok_FaceEmoEngineCondition(9),
  /**
   * <code>ReturnCode_nok_DevPlatform = 10;</code>
   */
  ReturnCode_nok_DevPlatform(10),
  /**
   * <code>ReturnCode_nok_EmotionType = 11;</code>
   */
  ReturnCode_nok_EmotionType(11),
  /**
   * <code>ReturnCode_nok_reason1 = 12;</code>
   */
  ReturnCode_nok_reason1(12),
  /**
   * <code>ReturnCode_nok_reason2 = 13;</code>
   */
  ReturnCode_nok_reason2(13),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>ReturnCode_unknown = 0;</code>
   */
  public static final int ReturnCode_unknown_VALUE = 0;
  /**
   * <code>ReturnCode_ok = 1;</code>
   */
  public static final int ReturnCode_ok_VALUE = 1;
  /**
   * <code>ReturnCode_nok_Org = 2;</code>
   */
  public static final int ReturnCode_nok_Org_VALUE = 2;
  /**
   * <code>ReturnCode_nok_User = 3;</code>
   */
  public static final int ReturnCode_nok_User_VALUE = 3;
  /**
   * <code>ReturnCode_nok_MsgType = 4;</code>
   */
  public static final int ReturnCode_nok_MsgType_VALUE = 4;
  /**
   * <code>ReturnCode_nok_EngineType = 5;</code>
   */
  public static final int ReturnCode_nok_EngineType_VALUE = 5;
  /**
   * <code>ReturnCode_nok_EngineCondition = 6;</code>
   */
  public static final int ReturnCode_nok_EngineCondition_VALUE = 6;
  /**
   * <code>ReturnCode_nok_PhysioEngineCondition = 7;</code>
   */
  public static final int ReturnCode_nok_PhysioEngineCondition_VALUE = 7;
  /**
   * <code>ReturnCode_nok_SpeechEngineCondition = 8;</code>
   */
  public static final int ReturnCode_nok_SpeechEngineCondition_VALUE = 8;
  /**
   * <code>ReturnCode_nok_FaceEmoEngineCondition = 9;</code>
   */
  public static final int ReturnCode_nok_FaceEmoEngineCondition_VALUE = 9;
  /**
   * <code>ReturnCode_nok_DevPlatform = 10;</code>
   */
  public static final int ReturnCode_nok_DevPlatform_VALUE = 10;
  /**
   * <code>ReturnCode_nok_EmotionType = 11;</code>
   */
  public static final int ReturnCode_nok_EmotionType_VALUE = 11;
  /**
   * <code>ReturnCode_nok_reason1 = 12;</code>
   */
  public static final int ReturnCode_nok_reason1_VALUE = 12;
  /**
   * <code>ReturnCode_nok_reason2 = 13;</code>
   */
  public static final int ReturnCode_nok_reason2_VALUE = 13;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static ReturnCode_e valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static ReturnCode_e forNumber(int value) {
    switch (value) {
      case 0: return ReturnCode_unknown;
      case 1: return ReturnCode_ok;
      case 2: return ReturnCode_nok_Org;
      case 3: return ReturnCode_nok_User;
      case 4: return ReturnCode_nok_MsgType;
      case 5: return ReturnCode_nok_EngineType;
      case 6: return ReturnCode_nok_EngineCondition;
      case 7: return ReturnCode_nok_PhysioEngineCondition;
      case 8: return ReturnCode_nok_SpeechEngineCondition;
      case 9: return ReturnCode_nok_FaceEmoEngineCondition;
      case 10: return ReturnCode_nok_DevPlatform;
      case 11: return ReturnCode_nok_EmotionType;
      case 12: return ReturnCode_nok_reason1;
      case 13: return ReturnCode_nok_reason2;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<ReturnCode_e>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      ReturnCode_e> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<ReturnCode_e>() {
          public ReturnCode_e findValueByNumber(int number) {
            return ReturnCode_e.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return com.erksystem.protobuf.api.ErkApiMsgOuterClass.getDescriptor().getEnumTypes().get(1);
  }

  private static final ReturnCode_e[] VALUES = values();

  public static ReturnCode_e valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private ReturnCode_e(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:ReturnCode_e)
}

