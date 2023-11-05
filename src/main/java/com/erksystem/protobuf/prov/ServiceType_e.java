// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ErkProvMsg.proto

package com.erksystem.protobuf.prov;

/**
 * Protobuf enum {@code ServiceType_e}
 */
public enum ServiceType_e
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>SERVICE_UNKNOWN = 0;</code>
   */
  SERVICE_UNKNOWN(0),
  /**
   * <code>SERVICE_PHYSIOLOGY = 1;</code>
   */
  SERVICE_PHYSIOLOGY(1),
  /**
   * <code>SERVICE_SPEECH = 2;</code>
   */
  SERVICE_SPEECH(2),
  /**
   * <code>SERVICE_VIDEO = 3;</code>
   */
  SERVICE_VIDEO(3),
  /**
   * <code>SERVICE_PHYSIOLOGY_SPEECH = 4;</code>
   */
  SERVICE_PHYSIOLOGY_SPEECH(4),
  /**
   * <code>SERVICE_PHYSIOLOGY_VIDEO = 5;</code>
   */
  SERVICE_PHYSIOLOGY_VIDEO(5),
  /**
   * <code>SERVICE_SPEECH_VIDEO = 6;</code>
   */
  SERVICE_SPEECH_VIDEO(6),
  /**
   * <code>SERVICE_PHYSIOLOGY_SPEECH_VIDEO = 7;</code>
   */
  SERVICE_PHYSIOLOGY_SPEECH_VIDEO(7),
  /**
   * <code>SERVICE_KNOWLEDGE = 8;</code>
   */
  SERVICE_KNOWLEDGE(8),
  /**
   * <code>SERVICE_ALL = 9;</code>
   */
  SERVICE_ALL(9),
  /**
   * <code>SERVICE_RESERVED1 = 10;</code>
   */
  SERVICE_RESERVED1(10),
  /**
   * <code>SERVICE_RESERVED2 = 11;</code>
   */
  SERVICE_RESERVED2(11),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>SERVICE_UNKNOWN = 0;</code>
   */
  public static final int SERVICE_UNKNOWN_VALUE = 0;
  /**
   * <code>SERVICE_PHYSIOLOGY = 1;</code>
   */
  public static final int SERVICE_PHYSIOLOGY_VALUE = 1;
  /**
   * <code>SERVICE_SPEECH = 2;</code>
   */
  public static final int SERVICE_SPEECH_VALUE = 2;
  /**
   * <code>SERVICE_VIDEO = 3;</code>
   */
  public static final int SERVICE_VIDEO_VALUE = 3;
  /**
   * <code>SERVICE_PHYSIOLOGY_SPEECH = 4;</code>
   */
  public static final int SERVICE_PHYSIOLOGY_SPEECH_VALUE = 4;
  /**
   * <code>SERVICE_PHYSIOLOGY_VIDEO = 5;</code>
   */
  public static final int SERVICE_PHYSIOLOGY_VIDEO_VALUE = 5;
  /**
   * <code>SERVICE_SPEECH_VIDEO = 6;</code>
   */
  public static final int SERVICE_SPEECH_VIDEO_VALUE = 6;
  /**
   * <code>SERVICE_PHYSIOLOGY_SPEECH_VIDEO = 7;</code>
   */
  public static final int SERVICE_PHYSIOLOGY_SPEECH_VIDEO_VALUE = 7;
  /**
   * <code>SERVICE_KNOWLEDGE = 8;</code>
   */
  public static final int SERVICE_KNOWLEDGE_VALUE = 8;
  /**
   * <code>SERVICE_ALL = 9;</code>
   */
  public static final int SERVICE_ALL_VALUE = 9;
  /**
   * <code>SERVICE_RESERVED1 = 10;</code>
   */
  public static final int SERVICE_RESERVED1_VALUE = 10;
  /**
   * <code>SERVICE_RESERVED2 = 11;</code>
   */
  public static final int SERVICE_RESERVED2_VALUE = 11;


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
  public static ServiceType_e valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static ServiceType_e forNumber(int value) {
    switch (value) {
      case 0: return SERVICE_UNKNOWN;
      case 1: return SERVICE_PHYSIOLOGY;
      case 2: return SERVICE_SPEECH;
      case 3: return SERVICE_VIDEO;
      case 4: return SERVICE_PHYSIOLOGY_SPEECH;
      case 5: return SERVICE_PHYSIOLOGY_VIDEO;
      case 6: return SERVICE_SPEECH_VIDEO;
      case 7: return SERVICE_PHYSIOLOGY_SPEECH_VIDEO;
      case 8: return SERVICE_KNOWLEDGE;
      case 9: return SERVICE_ALL;
      case 10: return SERVICE_RESERVED1;
      case 11: return SERVICE_RESERVED2;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<ServiceType_e>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      ServiceType_e> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<ServiceType_e>() {
          public ServiceType_e findValueByNumber(int number) {
            return ServiceType_e.forNumber(number);
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
    return com.erksystem.protobuf.prov.ErkProvMsgOuterClass.getDescriptor().getEnumTypes().get(4);
  }

  private static final ServiceType_e[] VALUES = values();

  public static ServiceType_e valueOf(
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

  private ServiceType_e(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:ServiceType_e)
}
