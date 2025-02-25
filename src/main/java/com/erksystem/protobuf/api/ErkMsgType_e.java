// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ErkApiMsg.proto

// Protobuf Java Version: 3.25.3
package com.erksystem.protobuf.api;

/**
 * Protobuf enum {@code ErkMsgType_e}
 */
public enum ErkMsgType_e
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>ErkMsgType_unknown = 0;</code>
   */
  ErkMsgType_unknown(0),
  /**
   * <code>AddServiceProviderInfoRQ = 1;</code>
   */
  AddServiceProviderInfoRQ(1),
  /**
   * <code>AddServiceProviderInfoRP = 2;</code>
   */
  AddServiceProviderInfoRP(2),
  /**
   * <code>DelServiceProviderInfoRQ = 3;</code>
   */
  DelServiceProviderInfoRQ(3),
  /**
   * <code>DelServiceProviderInfoRP = 4;</code>
   */
  DelServiceProviderInfoRP(4),
  /**
   * <code>UpdServiceProviderInfoRQ = 5;</code>
   */
  UpdServiceProviderInfoRQ(5),
  /**
   * <code>UpdServiceProviderInfoRP = 6;</code>
   */
  UpdServiceProviderInfoRP(6),
  /**
   * <code>AddUserInfoRQ = 7;</code>
   */
  AddUserInfoRQ(7),
  /**
   * <code>AddUserInfoRP = 8;</code>
   */
  AddUserInfoRP(8),
  /**
   * <code>DelUserInfoRQ = 9;</code>
   */
  DelUserInfoRQ(9),
  /**
   * <code>DelUserInfoRP = 10;</code>
   */
  DelUserInfoRP(10),
  /**
   * <code>UpdUserInfoRQ = 11;</code>
   */
  UpdUserInfoRQ(11),
  /**
   * <code>UpdUserInfoRP = 12;</code>
   */
  UpdUserInfoRP(12),
  /**
   * <code>ErkServiceConnRQ = 13;</code>
   */
  ErkServiceConnRQ(13),
  /**
   * <code>ErkServiceConnRP = 14;</code>
   */
  ErkServiceConnRP(14),
  /**
   * <code>ErkServiceDisConnRQ = 15;</code>
   */
  ErkServiceDisConnRQ(15),
  /**
   * <code>ErkServiceDisConnRP = 16;</code>
   */
  ErkServiceDisConnRP(16),
  /**
   * <code>EmoServiceStartRQ = 17;</code>
   */
  EmoServiceStartRQ(17),
  /**
   * <code>EmoServiceStartRP = 18;</code>
   */
  EmoServiceStartRP(18),
  /**
   * <code>EmoServiceStopRQ = 19;</code>
   */
  EmoServiceStopRQ(19),
  /**
   * <code>EmoServiceStopRP = 20;</code>
   */
  EmoServiceStopRP(20),
  /**
   * <code>PhysioEmoRecogRQ = 21;</code>
   */
  PhysioEmoRecogRQ(21),
  /**
   * <code>SpeechEmoRecogRQ = 22;</code>
   */
  SpeechEmoRecogRQ(22),
  /**
   * <code>FaceEmoRecogRQ = 23;</code>
   */
  FaceEmoRecogRQ(23),
  /**
   * <code>PhysioEmoRecogRP = 24;</code>
   */
  PhysioEmoRecogRP(24),
  /**
   * <code>SpeechEmoRecogRP = 25;</code>
   */
  SpeechEmoRecogRP(25),
  /**
   * <code>FaceEmoRecogRP = 26;</code>
   */
  FaceEmoRecogRP(26),
  /**
   * <code>EmoRecogRQ = 27;</code>
   */
  EmoRecogRQ(27),
  /**
   * <code>EmoRecogRP = 28;</code>
   */
  EmoRecogRP(28),
  /**
   * <code>HeartBeatRQ = 29;</code>
   */
  HeartBeatRQ(29),
  /**
   * <code>HeartBeatRP = 30;</code>
   */
  HeartBeatRP(30),
  /**
   * <code>ErkMsgType_reserved1 = 31;</code>
   */
  ErkMsgType_reserved1(31),
  /**
   * <code>ErkMsgType_reserved2 = 32;</code>
   */
  ErkMsgType_reserved2(32),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>ErkMsgType_unknown = 0;</code>
   */
  public static final int ErkMsgType_unknown_VALUE = 0;
  /**
   * <code>AddServiceProviderInfoRQ = 1;</code>
   */
  public static final int AddServiceProviderInfoRQ_VALUE = 1;
  /**
   * <code>AddServiceProviderInfoRP = 2;</code>
   */
  public static final int AddServiceProviderInfoRP_VALUE = 2;
  /**
   * <code>DelServiceProviderInfoRQ = 3;</code>
   */
  public static final int DelServiceProviderInfoRQ_VALUE = 3;
  /**
   * <code>DelServiceProviderInfoRP = 4;</code>
   */
  public static final int DelServiceProviderInfoRP_VALUE = 4;
  /**
   * <code>UpdServiceProviderInfoRQ = 5;</code>
   */
  public static final int UpdServiceProviderInfoRQ_VALUE = 5;
  /**
   * <code>UpdServiceProviderInfoRP = 6;</code>
   */
  public static final int UpdServiceProviderInfoRP_VALUE = 6;
  /**
   * <code>AddUserInfoRQ = 7;</code>
   */
  public static final int AddUserInfoRQ_VALUE = 7;
  /**
   * <code>AddUserInfoRP = 8;</code>
   */
  public static final int AddUserInfoRP_VALUE = 8;
  /**
   * <code>DelUserInfoRQ = 9;</code>
   */
  public static final int DelUserInfoRQ_VALUE = 9;
  /**
   * <code>DelUserInfoRP = 10;</code>
   */
  public static final int DelUserInfoRP_VALUE = 10;
  /**
   * <code>UpdUserInfoRQ = 11;</code>
   */
  public static final int UpdUserInfoRQ_VALUE = 11;
  /**
   * <code>UpdUserInfoRP = 12;</code>
   */
  public static final int UpdUserInfoRP_VALUE = 12;
  /**
   * <code>ErkServiceConnRQ = 13;</code>
   */
  public static final int ErkServiceConnRQ_VALUE = 13;
  /**
   * <code>ErkServiceConnRP = 14;</code>
   */
  public static final int ErkServiceConnRP_VALUE = 14;
  /**
   * <code>ErkServiceDisConnRQ = 15;</code>
   */
  public static final int ErkServiceDisConnRQ_VALUE = 15;
  /**
   * <code>ErkServiceDisConnRP = 16;</code>
   */
  public static final int ErkServiceDisConnRP_VALUE = 16;
  /**
   * <code>EmoServiceStartRQ = 17;</code>
   */
  public static final int EmoServiceStartRQ_VALUE = 17;
  /**
   * <code>EmoServiceStartRP = 18;</code>
   */
  public static final int EmoServiceStartRP_VALUE = 18;
  /**
   * <code>EmoServiceStopRQ = 19;</code>
   */
  public static final int EmoServiceStopRQ_VALUE = 19;
  /**
   * <code>EmoServiceStopRP = 20;</code>
   */
  public static final int EmoServiceStopRP_VALUE = 20;
  /**
   * <code>PhysioEmoRecogRQ = 21;</code>
   */
  public static final int PhysioEmoRecogRQ_VALUE = 21;
  /**
   * <code>SpeechEmoRecogRQ = 22;</code>
   */
  public static final int SpeechEmoRecogRQ_VALUE = 22;
  /**
   * <code>FaceEmoRecogRQ = 23;</code>
   */
  public static final int FaceEmoRecogRQ_VALUE = 23;
  /**
   * <code>PhysioEmoRecogRP = 24;</code>
   */
  public static final int PhysioEmoRecogRP_VALUE = 24;
  /**
   * <code>SpeechEmoRecogRP = 25;</code>
   */
  public static final int SpeechEmoRecogRP_VALUE = 25;
  /**
   * <code>FaceEmoRecogRP = 26;</code>
   */
  public static final int FaceEmoRecogRP_VALUE = 26;
  /**
   * <code>EmoRecogRQ = 27;</code>
   */
  public static final int EmoRecogRQ_VALUE = 27;
  /**
   * <code>EmoRecogRP = 28;</code>
   */
  public static final int EmoRecogRP_VALUE = 28;
  /**
   * <code>HeartBeatRQ = 29;</code>
   */
  public static final int HeartBeatRQ_VALUE = 29;
  /**
   * <code>HeartBeatRP = 30;</code>
   */
  public static final int HeartBeatRP_VALUE = 30;
  /**
   * <code>ErkMsgType_reserved1 = 31;</code>
   */
  public static final int ErkMsgType_reserved1_VALUE = 31;
  /**
   * <code>ErkMsgType_reserved2 = 32;</code>
   */
  public static final int ErkMsgType_reserved2_VALUE = 32;


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
  public static ErkMsgType_e valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static ErkMsgType_e forNumber(int value) {
    switch (value) {
      case 0: return ErkMsgType_unknown;
      case 1: return AddServiceProviderInfoRQ;
      case 2: return AddServiceProviderInfoRP;
      case 3: return DelServiceProviderInfoRQ;
      case 4: return DelServiceProviderInfoRP;
      case 5: return UpdServiceProviderInfoRQ;
      case 6: return UpdServiceProviderInfoRP;
      case 7: return AddUserInfoRQ;
      case 8: return AddUserInfoRP;
      case 9: return DelUserInfoRQ;
      case 10: return DelUserInfoRP;
      case 11: return UpdUserInfoRQ;
      case 12: return UpdUserInfoRP;
      case 13: return ErkServiceConnRQ;
      case 14: return ErkServiceConnRP;
      case 15: return ErkServiceDisConnRQ;
      case 16: return ErkServiceDisConnRP;
      case 17: return EmoServiceStartRQ;
      case 18: return EmoServiceStartRP;
      case 19: return EmoServiceStopRQ;
      case 20: return EmoServiceStopRP;
      case 21: return PhysioEmoRecogRQ;
      case 22: return SpeechEmoRecogRQ;
      case 23: return FaceEmoRecogRQ;
      case 24: return PhysioEmoRecogRP;
      case 25: return SpeechEmoRecogRP;
      case 26: return FaceEmoRecogRP;
      case 27: return EmoRecogRQ;
      case 28: return EmoRecogRP;
      case 29: return HeartBeatRQ;
      case 30: return HeartBeatRP;
      case 31: return ErkMsgType_reserved1;
      case 32: return ErkMsgType_reserved2;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<ErkMsgType_e>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      ErkMsgType_e> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<ErkMsgType_e>() {
          public ErkMsgType_e findValueByNumber(int number) {
            return ErkMsgType_e.forNumber(number);
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
    return com.erksystem.protobuf.api.ErkApiMsgOuterClass.getDescriptor().getEnumTypes().get(0);
  }

  private static final ErkMsgType_e[] VALUES = values();

  public static ErkMsgType_e valueOf(
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

  private ErkMsgType_e(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:ErkMsgType_e)
}

