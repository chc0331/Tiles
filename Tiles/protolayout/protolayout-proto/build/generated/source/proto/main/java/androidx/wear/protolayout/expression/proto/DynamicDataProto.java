// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: dynamic_data.proto

package androidx.wear.protolayout.expression.proto;

public final class DynamicDataProto {
  private DynamicDataProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }
  public interface DynamicDataValueOrBuilder extends
      // @@protoc_insertion_point(interface_extends:androidx.wear.protolayout.expression.proto.DynamicDataValue)
      com.google.protobuf.MessageLiteOrBuilder {

    /**
     * <code>.androidx.wear.protolayout.expression.proto.FixedString string_val = 1;</code>
     * @return Whether the stringVal field is set.
     */
    boolean hasStringVal();
    /**
     * <code>.androidx.wear.protolayout.expression.proto.FixedString string_val = 1;</code>
     * @return The stringVal.
     */
    androidx.wear.protolayout.expression.proto.FixedProto.FixedString getStringVal();

    /**
     * <code>.androidx.wear.protolayout.expression.proto.FixedInt32 int32_val = 2;</code>
     * @return Whether the int32Val field is set.
     */
    boolean hasInt32Val();
    /**
     * <code>.androidx.wear.protolayout.expression.proto.FixedInt32 int32_val = 2;</code>
     * @return The int32Val.
     */
    androidx.wear.protolayout.expression.proto.FixedProto.FixedInt32 getInt32Val();

    /**
     * <code>.androidx.wear.protolayout.expression.proto.FixedFloat float_val = 3;</code>
     * @return Whether the floatVal field is set.
     */
    boolean hasFloatVal();
    /**
     * <code>.androidx.wear.protolayout.expression.proto.FixedFloat float_val = 3;</code>
     * @return The floatVal.
     */
    androidx.wear.protolayout.expression.proto.FixedProto.FixedFloat getFloatVal();

    /**
     * <code>.androidx.wear.protolayout.expression.proto.FixedBool bool_val = 4;</code>
     * @return Whether the boolVal field is set.
     */
    boolean hasBoolVal();
    /**
     * <code>.androidx.wear.protolayout.expression.proto.FixedBool bool_val = 4;</code>
     * @return The boolVal.
     */
    androidx.wear.protolayout.expression.proto.FixedProto.FixedBool getBoolVal();

    /**
     * <code>.androidx.wear.protolayout.expression.proto.FixedColor color_val = 5;</code>
     * @return Whether the colorVal field is set.
     */
    boolean hasColorVal();
    /**
     * <code>.androidx.wear.protolayout.expression.proto.FixedColor color_val = 5;</code>
     * @return The colorVal.
     */
    androidx.wear.protolayout.expression.proto.FixedProto.FixedColor getColorVal();

    public androidx.wear.protolayout.expression.proto.DynamicDataProto.DynamicDataValue.InnerCase getInnerCase();
  }
  /**
   * <pre>
   * A dynamic data value.
   * </pre>
   *
   * Protobuf type {@code androidx.wear.protolayout.expression.proto.DynamicDataValue}
   */
  public  static final class DynamicDataValue extends
      com.google.protobuf.GeneratedMessageLite<
          DynamicDataValue, DynamicDataValue.Builder> implements
      // @@protoc_insertion_point(message_implements:androidx.wear.protolayout.expression.proto.DynamicDataValue)
      DynamicDataValueOrBuilder {
    private DynamicDataValue() {
    }
    private int innerCase_ = 0;
    private java.lang.Object inner_;
    public enum InnerCase {
      STRING_VAL(1),
      INT32_VAL(2),
      FLOAT_VAL(3),
      BOOL_VAL(4),
      COLOR_VAL(5),
      INNER_NOT_SET(0);
      private final int value;
      private InnerCase(int value) {
        this.value = value;
      }
      /**
       * @deprecated Use {@link #forNumber(int)} instead.
       */
      @java.lang.Deprecated
      public static InnerCase valueOf(int value) {
        return forNumber(value);
      }

      public static InnerCase forNumber(int value) {
        switch (value) {
          case 1: return STRING_VAL;
          case 2: return INT32_VAL;
          case 3: return FLOAT_VAL;
          case 4: return BOOL_VAL;
          case 5: return COLOR_VAL;
          case 0: return INNER_NOT_SET;
          default: return null;
        }
      }
      public int getNumber() {
        return this.value;
      }
    };

    @java.lang.Override
    public InnerCase
    getInnerCase() {
      return InnerCase.forNumber(
          innerCase_);
    }

    private void clearInner() {
      innerCase_ = 0;
      inner_ = null;
    }

    public static final int STRING_VAL_FIELD_NUMBER = 1;
    /**
     * <code>.androidx.wear.protolayout.expression.proto.FixedString string_val = 1;</code>
     */
    @java.lang.Override
    public boolean hasStringVal() {
      return innerCase_ == 1;
    }
    /**
     * <code>.androidx.wear.protolayout.expression.proto.FixedString string_val = 1;</code>
     */
    @java.lang.Override
    public androidx.wear.protolayout.expression.proto.FixedProto.FixedString getStringVal() {
      if (innerCase_ == 1) {
         return (androidx.wear.protolayout.expression.proto.FixedProto.FixedString) inner_;
      }
      return androidx.wear.protolayout.expression.proto.FixedProto.FixedString.getDefaultInstance();
    }
    /**
     * <code>.androidx.wear.protolayout.expression.proto.FixedString string_val = 1;</code>
     */
    private void setStringVal(androidx.wear.protolayout.expression.proto.FixedProto.FixedString value) {
      value.getClass();
  inner_ = value;
      innerCase_ = 1;
    }
    /**
     * <code>.androidx.wear.protolayout.expression.proto.FixedString string_val = 1;</code>
     */
    private void mergeStringVal(androidx.wear.protolayout.expression.proto.FixedProto.FixedString value) {
      value.getClass();
  if (innerCase_ == 1 &&
          inner_ != androidx.wear.protolayout.expression.proto.FixedProto.FixedString.getDefaultInstance()) {
        inner_ = androidx.wear.protolayout.expression.proto.FixedProto.FixedString.newBuilder((androidx.wear.protolayout.expression.proto.FixedProto.FixedString) inner_)
            .mergeFrom(value).buildPartial();
      } else {
        inner_ = value;
      }
      innerCase_ = 1;
    }
    /**
     * <code>.androidx.wear.protolayout.expression.proto.FixedString string_val = 1;</code>
     */
    private void clearStringVal() {
      if (innerCase_ == 1) {
        innerCase_ = 0;
        inner_ = null;
      }
    }

    public static final int INT32_VAL_FIELD_NUMBER = 2;
    /**
     * <code>.androidx.wear.protolayout.expression.proto.FixedInt32 int32_val = 2;</code>
     */
    @java.lang.Override
    public boolean hasInt32Val() {
      return innerCase_ == 2;
    }
    /**
     * <code>.androidx.wear.protolayout.expression.proto.FixedInt32 int32_val = 2;</code>
     */
    @java.lang.Override
    public androidx.wear.protolayout.expression.proto.FixedProto.FixedInt32 getInt32Val() {
      if (innerCase_ == 2) {
         return (androidx.wear.protolayout.expression.proto.FixedProto.FixedInt32) inner_;
      }
      return androidx.wear.protolayout.expression.proto.FixedProto.FixedInt32.getDefaultInstance();
    }
    /**
     * <code>.androidx.wear.protolayout.expression.proto.FixedInt32 int32_val = 2;</code>
     */
    private void setInt32Val(androidx.wear.protolayout.expression.proto.FixedProto.FixedInt32 value) {
      value.getClass();
  inner_ = value;
      innerCase_ = 2;
    }
    /**
     * <code>.androidx.wear.protolayout.expression.proto.FixedInt32 int32_val = 2;</code>
     */
    private void mergeInt32Val(androidx.wear.protolayout.expression.proto.FixedProto.FixedInt32 value) {
      value.getClass();
  if (innerCase_ == 2 &&
          inner_ != androidx.wear.protolayout.expression.proto.FixedProto.FixedInt32.getDefaultInstance()) {
        inner_ = androidx.wear.protolayout.expression.proto.FixedProto.FixedInt32.newBuilder((androidx.wear.protolayout.expression.proto.FixedProto.FixedInt32) inner_)
            .mergeFrom(value).buildPartial();
      } else {
        inner_ = value;
      }
      innerCase_ = 2;
    }
    /**
     * <code>.androidx.wear.protolayout.expression.proto.FixedInt32 int32_val = 2;</code>
     */
    private void clearInt32Val() {
      if (innerCase_ == 2) {
        innerCase_ = 0;
        inner_ = null;
      }
    }

    public static final int FLOAT_VAL_FIELD_NUMBER = 3;
    /**
     * <code>.androidx.wear.protolayout.expression.proto.FixedFloat float_val = 3;</code>
     */
    @java.lang.Override
    public boolean hasFloatVal() {
      return innerCase_ == 3;
    }
    /**
     * <code>.androidx.wear.protolayout.expression.proto.FixedFloat float_val = 3;</code>
     */
    @java.lang.Override
    public androidx.wear.protolayout.expression.proto.FixedProto.FixedFloat getFloatVal() {
      if (innerCase_ == 3) {
         return (androidx.wear.protolayout.expression.proto.FixedProto.FixedFloat) inner_;
      }
      return androidx.wear.protolayout.expression.proto.FixedProto.FixedFloat.getDefaultInstance();
    }
    /**
     * <code>.androidx.wear.protolayout.expression.proto.FixedFloat float_val = 3;</code>
     */
    private void setFloatVal(androidx.wear.protolayout.expression.proto.FixedProto.FixedFloat value) {
      value.getClass();
  inner_ = value;
      innerCase_ = 3;
    }
    /**
     * <code>.androidx.wear.protolayout.expression.proto.FixedFloat float_val = 3;</code>
     */
    private void mergeFloatVal(androidx.wear.protolayout.expression.proto.FixedProto.FixedFloat value) {
      value.getClass();
  if (innerCase_ == 3 &&
          inner_ != androidx.wear.protolayout.expression.proto.FixedProto.FixedFloat.getDefaultInstance()) {
        inner_ = androidx.wear.protolayout.expression.proto.FixedProto.FixedFloat.newBuilder((androidx.wear.protolayout.expression.proto.FixedProto.FixedFloat) inner_)
            .mergeFrom(value).buildPartial();
      } else {
        inner_ = value;
      }
      innerCase_ = 3;
    }
    /**
     * <code>.androidx.wear.protolayout.expression.proto.FixedFloat float_val = 3;</code>
     */
    private void clearFloatVal() {
      if (innerCase_ == 3) {
        innerCase_ = 0;
        inner_ = null;
      }
    }

    public static final int BOOL_VAL_FIELD_NUMBER = 4;
    /**
     * <code>.androidx.wear.protolayout.expression.proto.FixedBool bool_val = 4;</code>
     */
    @java.lang.Override
    public boolean hasBoolVal() {
      return innerCase_ == 4;
    }
    /**
     * <code>.androidx.wear.protolayout.expression.proto.FixedBool bool_val = 4;</code>
     */
    @java.lang.Override
    public androidx.wear.protolayout.expression.proto.FixedProto.FixedBool getBoolVal() {
      if (innerCase_ == 4) {
         return (androidx.wear.protolayout.expression.proto.FixedProto.FixedBool) inner_;
      }
      return androidx.wear.protolayout.expression.proto.FixedProto.FixedBool.getDefaultInstance();
    }
    /**
     * <code>.androidx.wear.protolayout.expression.proto.FixedBool bool_val = 4;</code>
     */
    private void setBoolVal(androidx.wear.protolayout.expression.proto.FixedProto.FixedBool value) {
      value.getClass();
  inner_ = value;
      innerCase_ = 4;
    }
    /**
     * <code>.androidx.wear.protolayout.expression.proto.FixedBool bool_val = 4;</code>
     */
    private void mergeBoolVal(androidx.wear.protolayout.expression.proto.FixedProto.FixedBool value) {
      value.getClass();
  if (innerCase_ == 4 &&
          inner_ != androidx.wear.protolayout.expression.proto.FixedProto.FixedBool.getDefaultInstance()) {
        inner_ = androidx.wear.protolayout.expression.proto.FixedProto.FixedBool.newBuilder((androidx.wear.protolayout.expression.proto.FixedProto.FixedBool) inner_)
            .mergeFrom(value).buildPartial();
      } else {
        inner_ = value;
      }
      innerCase_ = 4;
    }
    /**
     * <code>.androidx.wear.protolayout.expression.proto.FixedBool bool_val = 4;</code>
     */
    private void clearBoolVal() {
      if (innerCase_ == 4) {
        innerCase_ = 0;
        inner_ = null;
      }
    }

    public static final int COLOR_VAL_FIELD_NUMBER = 5;
    /**
     * <code>.androidx.wear.protolayout.expression.proto.FixedColor color_val = 5;</code>
     */
    @java.lang.Override
    public boolean hasColorVal() {
      return innerCase_ == 5;
    }
    /**
     * <code>.androidx.wear.protolayout.expression.proto.FixedColor color_val = 5;</code>
     */
    @java.lang.Override
    public androidx.wear.protolayout.expression.proto.FixedProto.FixedColor getColorVal() {
      if (innerCase_ == 5) {
         return (androidx.wear.protolayout.expression.proto.FixedProto.FixedColor) inner_;
      }
      return androidx.wear.protolayout.expression.proto.FixedProto.FixedColor.getDefaultInstance();
    }
    /**
     * <code>.androidx.wear.protolayout.expression.proto.FixedColor color_val = 5;</code>
     */
    private void setColorVal(androidx.wear.protolayout.expression.proto.FixedProto.FixedColor value) {
      value.getClass();
  inner_ = value;
      innerCase_ = 5;
    }
    /**
     * <code>.androidx.wear.protolayout.expression.proto.FixedColor color_val = 5;</code>
     */
    private void mergeColorVal(androidx.wear.protolayout.expression.proto.FixedProto.FixedColor value) {
      value.getClass();
  if (innerCase_ == 5 &&
          inner_ != androidx.wear.protolayout.expression.proto.FixedProto.FixedColor.getDefaultInstance()) {
        inner_ = androidx.wear.protolayout.expression.proto.FixedProto.FixedColor.newBuilder((androidx.wear.protolayout.expression.proto.FixedProto.FixedColor) inner_)
            .mergeFrom(value).buildPartial();
      } else {
        inner_ = value;
      }
      innerCase_ = 5;
    }
    /**
     * <code>.androidx.wear.protolayout.expression.proto.FixedColor color_val = 5;</code>
     */
    private void clearColorVal() {
      if (innerCase_ == 5) {
        innerCase_ = 0;
        inner_ = null;
      }
    }

    public static androidx.wear.protolayout.expression.proto.DynamicDataProto.DynamicDataValue parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static androidx.wear.protolayout.expression.proto.DynamicDataProto.DynamicDataValue parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static androidx.wear.protolayout.expression.proto.DynamicDataProto.DynamicDataValue parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static androidx.wear.protolayout.expression.proto.DynamicDataProto.DynamicDataValue parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static androidx.wear.protolayout.expression.proto.DynamicDataProto.DynamicDataValue parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static androidx.wear.protolayout.expression.proto.DynamicDataProto.DynamicDataValue parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static androidx.wear.protolayout.expression.proto.DynamicDataProto.DynamicDataValue parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static androidx.wear.protolayout.expression.proto.DynamicDataProto.DynamicDataValue parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static androidx.wear.protolayout.expression.proto.DynamicDataProto.DynamicDataValue parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }

    public static androidx.wear.protolayout.expression.proto.DynamicDataProto.DynamicDataValue parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static androidx.wear.protolayout.expression.proto.DynamicDataProto.DynamicDataValue parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static androidx.wear.protolayout.expression.proto.DynamicDataProto.DynamicDataValue parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return (Builder) DEFAULT_INSTANCE.createBuilder();
    }
    public static Builder newBuilder(androidx.wear.protolayout.expression.proto.DynamicDataProto.DynamicDataValue prototype) {
      return DEFAULT_INSTANCE.createBuilder(prototype);
    }

    /**
     * <pre>
     * A dynamic data value.
     * </pre>
     *
     * Protobuf type {@code androidx.wear.protolayout.expression.proto.DynamicDataValue}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageLite.Builder<
          androidx.wear.protolayout.expression.proto.DynamicDataProto.DynamicDataValue, Builder> implements
        // @@protoc_insertion_point(builder_implements:androidx.wear.protolayout.expression.proto.DynamicDataValue)
        androidx.wear.protolayout.expression.proto.DynamicDataProto.DynamicDataValueOrBuilder {
      // Construct using androidx.wear.protolayout.expression.proto.DynamicDataProto.DynamicDataValue.newBuilder()
      private Builder() {
        super(DEFAULT_INSTANCE);
      }

      @java.lang.Override
      public InnerCase
          getInnerCase() {
        return instance.getInnerCase();
      }

      public Builder clearInner() {
        copyOnWrite();
        instance.clearInner();
        return this;
      }


      /**
       * <code>.androidx.wear.protolayout.expression.proto.FixedString string_val = 1;</code>
       */
      @java.lang.Override
      public boolean hasStringVal() {
        return instance.hasStringVal();
      }
      /**
       * <code>.androidx.wear.protolayout.expression.proto.FixedString string_val = 1;</code>
       */
      @java.lang.Override
      public androidx.wear.protolayout.expression.proto.FixedProto.FixedString getStringVal() {
        return instance.getStringVal();
      }
      /**
       * <code>.androidx.wear.protolayout.expression.proto.FixedString string_val = 1;</code>
       */
      public Builder setStringVal(androidx.wear.protolayout.expression.proto.FixedProto.FixedString value) {
        copyOnWrite();
        instance.setStringVal(value);
        return this;
      }
      /**
       * <code>.androidx.wear.protolayout.expression.proto.FixedString string_val = 1;</code>
       */
      public Builder setStringVal(
          androidx.wear.protolayout.expression.proto.FixedProto.FixedString.Builder builderForValue) {
        copyOnWrite();
        instance.setStringVal(builderForValue.build());
        return this;
      }
      /**
       * <code>.androidx.wear.protolayout.expression.proto.FixedString string_val = 1;</code>
       */
      public Builder mergeStringVal(androidx.wear.protolayout.expression.proto.FixedProto.FixedString value) {
        copyOnWrite();
        instance.mergeStringVal(value);
        return this;
      }
      /**
       * <code>.androidx.wear.protolayout.expression.proto.FixedString string_val = 1;</code>
       */
      public Builder clearStringVal() {
        copyOnWrite();
        instance.clearStringVal();
        return this;
      }

      /**
       * <code>.androidx.wear.protolayout.expression.proto.FixedInt32 int32_val = 2;</code>
       */
      @java.lang.Override
      public boolean hasInt32Val() {
        return instance.hasInt32Val();
      }
      /**
       * <code>.androidx.wear.protolayout.expression.proto.FixedInt32 int32_val = 2;</code>
       */
      @java.lang.Override
      public androidx.wear.protolayout.expression.proto.FixedProto.FixedInt32 getInt32Val() {
        return instance.getInt32Val();
      }
      /**
       * <code>.androidx.wear.protolayout.expression.proto.FixedInt32 int32_val = 2;</code>
       */
      public Builder setInt32Val(androidx.wear.protolayout.expression.proto.FixedProto.FixedInt32 value) {
        copyOnWrite();
        instance.setInt32Val(value);
        return this;
      }
      /**
       * <code>.androidx.wear.protolayout.expression.proto.FixedInt32 int32_val = 2;</code>
       */
      public Builder setInt32Val(
          androidx.wear.protolayout.expression.proto.FixedProto.FixedInt32.Builder builderForValue) {
        copyOnWrite();
        instance.setInt32Val(builderForValue.build());
        return this;
      }
      /**
       * <code>.androidx.wear.protolayout.expression.proto.FixedInt32 int32_val = 2;</code>
       */
      public Builder mergeInt32Val(androidx.wear.protolayout.expression.proto.FixedProto.FixedInt32 value) {
        copyOnWrite();
        instance.mergeInt32Val(value);
        return this;
      }
      /**
       * <code>.androidx.wear.protolayout.expression.proto.FixedInt32 int32_val = 2;</code>
       */
      public Builder clearInt32Val() {
        copyOnWrite();
        instance.clearInt32Val();
        return this;
      }

      /**
       * <code>.androidx.wear.protolayout.expression.proto.FixedFloat float_val = 3;</code>
       */
      @java.lang.Override
      public boolean hasFloatVal() {
        return instance.hasFloatVal();
      }
      /**
       * <code>.androidx.wear.protolayout.expression.proto.FixedFloat float_val = 3;</code>
       */
      @java.lang.Override
      public androidx.wear.protolayout.expression.proto.FixedProto.FixedFloat getFloatVal() {
        return instance.getFloatVal();
      }
      /**
       * <code>.androidx.wear.protolayout.expression.proto.FixedFloat float_val = 3;</code>
       */
      public Builder setFloatVal(androidx.wear.protolayout.expression.proto.FixedProto.FixedFloat value) {
        copyOnWrite();
        instance.setFloatVal(value);
        return this;
      }
      /**
       * <code>.androidx.wear.protolayout.expression.proto.FixedFloat float_val = 3;</code>
       */
      public Builder setFloatVal(
          androidx.wear.protolayout.expression.proto.FixedProto.FixedFloat.Builder builderForValue) {
        copyOnWrite();
        instance.setFloatVal(builderForValue.build());
        return this;
      }
      /**
       * <code>.androidx.wear.protolayout.expression.proto.FixedFloat float_val = 3;</code>
       */
      public Builder mergeFloatVal(androidx.wear.protolayout.expression.proto.FixedProto.FixedFloat value) {
        copyOnWrite();
        instance.mergeFloatVal(value);
        return this;
      }
      /**
       * <code>.androidx.wear.protolayout.expression.proto.FixedFloat float_val = 3;</code>
       */
      public Builder clearFloatVal() {
        copyOnWrite();
        instance.clearFloatVal();
        return this;
      }

      /**
       * <code>.androidx.wear.protolayout.expression.proto.FixedBool bool_val = 4;</code>
       */
      @java.lang.Override
      public boolean hasBoolVal() {
        return instance.hasBoolVal();
      }
      /**
       * <code>.androidx.wear.protolayout.expression.proto.FixedBool bool_val = 4;</code>
       */
      @java.lang.Override
      public androidx.wear.protolayout.expression.proto.FixedProto.FixedBool getBoolVal() {
        return instance.getBoolVal();
      }
      /**
       * <code>.androidx.wear.protolayout.expression.proto.FixedBool bool_val = 4;</code>
       */
      public Builder setBoolVal(androidx.wear.protolayout.expression.proto.FixedProto.FixedBool value) {
        copyOnWrite();
        instance.setBoolVal(value);
        return this;
      }
      /**
       * <code>.androidx.wear.protolayout.expression.proto.FixedBool bool_val = 4;</code>
       */
      public Builder setBoolVal(
          androidx.wear.protolayout.expression.proto.FixedProto.FixedBool.Builder builderForValue) {
        copyOnWrite();
        instance.setBoolVal(builderForValue.build());
        return this;
      }
      /**
       * <code>.androidx.wear.protolayout.expression.proto.FixedBool bool_val = 4;</code>
       */
      public Builder mergeBoolVal(androidx.wear.protolayout.expression.proto.FixedProto.FixedBool value) {
        copyOnWrite();
        instance.mergeBoolVal(value);
        return this;
      }
      /**
       * <code>.androidx.wear.protolayout.expression.proto.FixedBool bool_val = 4;</code>
       */
      public Builder clearBoolVal() {
        copyOnWrite();
        instance.clearBoolVal();
        return this;
      }

      /**
       * <code>.androidx.wear.protolayout.expression.proto.FixedColor color_val = 5;</code>
       */
      @java.lang.Override
      public boolean hasColorVal() {
        return instance.hasColorVal();
      }
      /**
       * <code>.androidx.wear.protolayout.expression.proto.FixedColor color_val = 5;</code>
       */
      @java.lang.Override
      public androidx.wear.protolayout.expression.proto.FixedProto.FixedColor getColorVal() {
        return instance.getColorVal();
      }
      /**
       * <code>.androidx.wear.protolayout.expression.proto.FixedColor color_val = 5;</code>
       */
      public Builder setColorVal(androidx.wear.protolayout.expression.proto.FixedProto.FixedColor value) {
        copyOnWrite();
        instance.setColorVal(value);
        return this;
      }
      /**
       * <code>.androidx.wear.protolayout.expression.proto.FixedColor color_val = 5;</code>
       */
      public Builder setColorVal(
          androidx.wear.protolayout.expression.proto.FixedProto.FixedColor.Builder builderForValue) {
        copyOnWrite();
        instance.setColorVal(builderForValue.build());
        return this;
      }
      /**
       * <code>.androidx.wear.protolayout.expression.proto.FixedColor color_val = 5;</code>
       */
      public Builder mergeColorVal(androidx.wear.protolayout.expression.proto.FixedProto.FixedColor value) {
        copyOnWrite();
        instance.mergeColorVal(value);
        return this;
      }
      /**
       * <code>.androidx.wear.protolayout.expression.proto.FixedColor color_val = 5;</code>
       */
      public Builder clearColorVal() {
        copyOnWrite();
        instance.clearColorVal();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:androidx.wear.protolayout.expression.proto.DynamicDataValue)
    }
    @java.lang.Override
    @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
    protected final java.lang.Object dynamicMethod(
        com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
        java.lang.Object arg0, java.lang.Object arg1) {
      switch (method) {
        case NEW_MUTABLE_INSTANCE: {
          return new androidx.wear.protolayout.expression.proto.DynamicDataProto.DynamicDataValue();
        }
        case NEW_BUILDER: {
          return new Builder();
        }
        case BUILD_MESSAGE_INFO: {
            java.lang.Object[] objects = new java.lang.Object[] {
              "inner_",
              "innerCase_",
              androidx.wear.protolayout.expression.proto.FixedProto.FixedString.class,
              androidx.wear.protolayout.expression.proto.FixedProto.FixedInt32.class,
              androidx.wear.protolayout.expression.proto.FixedProto.FixedFloat.class,
              androidx.wear.protolayout.expression.proto.FixedProto.FixedBool.class,
              androidx.wear.protolayout.expression.proto.FixedProto.FixedColor.class,
            };
            java.lang.String info =
                "\u0000\u0005\u0001\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001<\u0000\u0002<" +
                "\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000";
            return newMessageInfo(DEFAULT_INSTANCE, info, objects);
        }
        // fall through
        case GET_DEFAULT_INSTANCE: {
          return DEFAULT_INSTANCE;
        }
        case GET_PARSER: {
          com.google.protobuf.Parser<androidx.wear.protolayout.expression.proto.DynamicDataProto.DynamicDataValue> parser = PARSER;
          if (parser == null) {
            synchronized (androidx.wear.protolayout.expression.proto.DynamicDataProto.DynamicDataValue.class) {
              parser = PARSER;
              if (parser == null) {
                parser =
                    new DefaultInstanceBasedParser<androidx.wear.protolayout.expression.proto.DynamicDataProto.DynamicDataValue>(
                        DEFAULT_INSTANCE);
                PARSER = parser;
              }
            }
          }
          return parser;
      }
      case GET_MEMOIZED_IS_INITIALIZED: {
        return (byte) 1;
      }
      case SET_MEMOIZED_IS_INITIALIZED: {
        return null;
      }
      }
      throw new UnsupportedOperationException();
    }


    // @@protoc_insertion_point(class_scope:androidx.wear.protolayout.expression.proto.DynamicDataValue)
    private static final androidx.wear.protolayout.expression.proto.DynamicDataProto.DynamicDataValue DEFAULT_INSTANCE;
    static {
      DynamicDataValue defaultInstance = new DynamicDataValue();
      // New instances are implicitly immutable so no need to make
      // immutable.
      DEFAULT_INSTANCE = defaultInstance;
      com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
        DynamicDataValue.class, defaultInstance);
    }

    public static androidx.wear.protolayout.expression.proto.DynamicDataProto.DynamicDataValue getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static volatile com.google.protobuf.Parser<DynamicDataValue> PARSER;

    public static com.google.protobuf.Parser<DynamicDataValue> parser() {
      return DEFAULT_INSTANCE.getParserForType();
    }
  }


  static {
  }

  // @@protoc_insertion_point(outer_class_scope)
}
