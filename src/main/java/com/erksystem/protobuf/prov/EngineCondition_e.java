// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ErkProvMsg.proto

package com.erksystem.protobuf.prov;

/**
 * Protobuf enum {@code EngineCondition_e}
 */
public enum EngineCondition_e
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>ENGINE_UNKNOWN_CONDITION = 0;</code>
   */
  ENGINE_UNKNOWN_CONDITION(0),
  /**
   * <code>ENGINE_AVAILABLE = 1;</code>
   */
  ENGINE_AVAILABLE(1),
  /**
   * <code>ENGINE_NOT_AVAILABLE = 2;</code>
   */
  ENGINE_NOT_AVAILABLE(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>ENGINE_UNKNOWN_CONDITION = 0;</code>
   */
  public static final int ENGINE_UNKNOWN_CONDITION_VALUE = 0;
  /**
   * <code>ENGINE_AVAILABLE = 1;</code>
   */
  public static final int ENGINE_AVAILABLE_VALUE = 1;
  /**
   * <code>ENGINE_NOT_AVAILABLE = 2;</code>
   */
  public static final int ENGINE_NOT_AVAILABLE_VALUE = 2;


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
  public static EngineCondition_e valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static EngineCondition_e forNumber(int value) {
    switch (value) {
      case 0: return ENGINE_UNKNOWN_CONDITION;
      case 1: return ENGINE_AVAILABLE;
      case 2: return ENGINE_NOT_AVAILABLE;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<EngineCondition_e>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      EngineCondition_e> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<EngineCondition_e>() {
          public EngineCondition_e findValueByNumber(int number) {
            return EngineCondition_e.forNumber(number);
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
    return com.erksystem.protobuf.prov.ErkProvMsgOuterClass.getDescriptor().getEnumTypes().get(3);
  }

  private static final EngineCondition_e[] VALUES = values();

  public static EngineCondition_e valueOf(
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

  private EngineCondition_e(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:EngineCondition_e)
}
