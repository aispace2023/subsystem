// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ErkApiMsg.proto

// Protobuf Java Version: 3.25.3
package com.erksystem.protobuf.api;

/**
 * Protobuf enum {@code EngineType_e}
 */
public enum EngineType_e
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>EngineType_unknown = 0;</code>
   */
  EngineType_unknown(0),
  /**
   * <code>EngineType_physiology = 1;</code>
   */
  EngineType_physiology(1),
  /**
   * <code>EngineType_speech = 2;</code>
   */
  EngineType_speech(2),
  /**
   * <code>EngineType_face = 3;</code>
   */
  EngineType_face(3),
  /**
   * <code>EngineType_emo_recog_all = 4;</code>
   */
  EngineType_emo_recog_all(4),
  /**
   * <code>EngineType_knowledge = 5;</code>
   */
  EngineType_knowledge(5),
  /**
   * <code>EngineType_reserved1 = 6;</code>
   */
  EngineType_reserved1(6),
  /**
   * <code>EngineType_reserved2 = 7;</code>
   */
  EngineType_reserved2(7),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>EngineType_unknown = 0;</code>
   */
  public static final int EngineType_unknown_VALUE = 0;
  /**
   * <code>EngineType_physiology = 1;</code>
   */
  public static final int EngineType_physiology_VALUE = 1;
  /**
   * <code>EngineType_speech = 2;</code>
   */
  public static final int EngineType_speech_VALUE = 2;
  /**
   * <code>EngineType_face = 3;</code>
   */
  public static final int EngineType_face_VALUE = 3;
  /**
   * <code>EngineType_emo_recog_all = 4;</code>
   */
  public static final int EngineType_emo_recog_all_VALUE = 4;
  /**
   * <code>EngineType_knowledge = 5;</code>
   */
  public static final int EngineType_knowledge_VALUE = 5;
  /**
   * <code>EngineType_reserved1 = 6;</code>
   */
  public static final int EngineType_reserved1_VALUE = 6;
  /**
   * <code>EngineType_reserved2 = 7;</code>
   */
  public static final int EngineType_reserved2_VALUE = 7;


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
  public static EngineType_e valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static EngineType_e forNumber(int value) {
    switch (value) {
      case 0: return EngineType_unknown;
      case 1: return EngineType_physiology;
      case 2: return EngineType_speech;
      case 3: return EngineType_face;
      case 4: return EngineType_emo_recog_all;
      case 5: return EngineType_knowledge;
      case 6: return EngineType_reserved1;
      case 7: return EngineType_reserved2;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<EngineType_e>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      EngineType_e> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<EngineType_e>() {
          public EngineType_e findValueByNumber(int number) {
            return EngineType_e.forNumber(number);
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
    return com.erksystem.protobuf.api.ErkApiMsgOuterClass.getDescriptor().getEnumTypes().get(3);
  }

  private static final EngineType_e[] VALUES = values();

  public static EngineType_e valueOf(
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

  private EngineType_e(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:EngineType_e)
}

