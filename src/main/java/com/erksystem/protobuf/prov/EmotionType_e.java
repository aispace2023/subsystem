// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ErkProvMsg.proto

// Protobuf Java Version: 3.25.0
package com.erksystem.protobuf.prov;

/**
 * Protobuf enum {@code EmotionType_e}
 */
public enum EmotionType_e
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>EmotionType_unknown = 0;</code>
   */
  EmotionType_unknown(0),
  /**
   * <code>EmotionType_neutral = 1;</code>
   */
  EmotionType_neutral(1),
  /**
   * <code>EmotionType_positive = 2;</code>
   */
  EmotionType_positive(2),
  /**
   * <code>EmotionType_negative = 3;</code>
   */
  EmotionType_negative(3),
  /**
   * <code>EmotionType_stress = 4;</code>
   */
  EmotionType_stress(4),
  /**
   * <code>EmotionType_joy = 5;</code>
   */
  EmotionType_joy(5),
  /**
   * <code>EmotionType_happy = 6;</code>
   */
  EmotionType_happy(6),
  /**
   * <code>EmotionType_sadness = 7;</code>
   */
  EmotionType_sadness(7),
  /**
   * <code>EmotionType_anger = 8;</code>
   */
  EmotionType_anger(8),
  /**
   * <code>EmotionType_arousal = 9;</code>
   */
  EmotionType_arousal(9),
  /**
   * <code>EmotionType_relaxation = 10;</code>
   */
  EmotionType_relaxation(10),
  /**
   * <code>EmotionType_peace = 11;</code>
   */
  EmotionType_peace(11),
  /**
   * <code>EmotionType_anxiety = 12;</code>
   */
  EmotionType_anxiety(12),
  /**
   * <code>EmotionType_fear = 13;</code>
   */
  EmotionType_fear(13),
  /**
   * <code>EmotionType_disgust = 14;</code>
   */
  EmotionType_disgust(14),
  /**
   * <code>EmotionType_reserved1 = 15;</code>
   */
  EmotionType_reserved1(15),
  /**
   * <code>EmotionType_reserved2 = 16;</code>
   */
  EmotionType_reserved2(16),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>EmotionType_unknown = 0;</code>
   */
  public static final int EmotionType_unknown_VALUE = 0;
  /**
   * <code>EmotionType_neutral = 1;</code>
   */
  public static final int EmotionType_neutral_VALUE = 1;
  /**
   * <code>EmotionType_positive = 2;</code>
   */
  public static final int EmotionType_positive_VALUE = 2;
  /**
   * <code>EmotionType_negative = 3;</code>
   */
  public static final int EmotionType_negative_VALUE = 3;
  /**
   * <code>EmotionType_stress = 4;</code>
   */
  public static final int EmotionType_stress_VALUE = 4;
  /**
   * <code>EmotionType_joy = 5;</code>
   */
  public static final int EmotionType_joy_VALUE = 5;
  /**
   * <code>EmotionType_happy = 6;</code>
   */
  public static final int EmotionType_happy_VALUE = 6;
  /**
   * <code>EmotionType_sadness = 7;</code>
   */
  public static final int EmotionType_sadness_VALUE = 7;
  /**
   * <code>EmotionType_anger = 8;</code>
   */
  public static final int EmotionType_anger_VALUE = 8;
  /**
   * <code>EmotionType_arousal = 9;</code>
   */
  public static final int EmotionType_arousal_VALUE = 9;
  /**
   * <code>EmotionType_relaxation = 10;</code>
   */
  public static final int EmotionType_relaxation_VALUE = 10;
  /**
   * <code>EmotionType_peace = 11;</code>
   */
  public static final int EmotionType_peace_VALUE = 11;
  /**
   * <code>EmotionType_anxiety = 12;</code>
   */
  public static final int EmotionType_anxiety_VALUE = 12;
  /**
   * <code>EmotionType_fear = 13;</code>
   */
  public static final int EmotionType_fear_VALUE = 13;
  /**
   * <code>EmotionType_disgust = 14;</code>
   */
  public static final int EmotionType_disgust_VALUE = 14;
  /**
   * <code>EmotionType_reserved1 = 15;</code>
   */
  public static final int EmotionType_reserved1_VALUE = 15;
  /**
   * <code>EmotionType_reserved2 = 16;</code>
   */
  public static final int EmotionType_reserved2_VALUE = 16;


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
  public static EmotionType_e valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static EmotionType_e forNumber(int value) {
    switch (value) {
      case 0: return EmotionType_unknown;
      case 1: return EmotionType_neutral;
      case 2: return EmotionType_positive;
      case 3: return EmotionType_negative;
      case 4: return EmotionType_stress;
      case 5: return EmotionType_joy;
      case 6: return EmotionType_happy;
      case 7: return EmotionType_sadness;
      case 8: return EmotionType_anger;
      case 9: return EmotionType_arousal;
      case 10: return EmotionType_relaxation;
      case 11: return EmotionType_peace;
      case 12: return EmotionType_anxiety;
      case 13: return EmotionType_fear;
      case 14: return EmotionType_disgust;
      case 15: return EmotionType_reserved1;
      case 16: return EmotionType_reserved2;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<EmotionType_e>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      EmotionType_e> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<EmotionType_e>() {
          public EmotionType_e findValueByNumber(int number) {
            return EmotionType_e.forNumber(number);
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
    return com.erksystem.protobuf.prov.ErkProvMsg.getDescriptor().getEnumTypes().get(5);
  }

  private static final EmotionType_e[] VALUES = values();

  public static EmotionType_e valueOf(
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

  private EmotionType_e(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:EmotionType_e)
}

