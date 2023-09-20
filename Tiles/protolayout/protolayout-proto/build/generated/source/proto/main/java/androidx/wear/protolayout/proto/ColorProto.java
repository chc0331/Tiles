// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: color.proto

package androidx.wear.protolayout.proto;

public final class ColorProto {
  private ColorProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }
  public interface ColorPropOrBuilder extends
      // @@protoc_insertion_point(interface_extends:androidx.wear.protolayout.proto.ColorProp)
      com.google.protobuf.MessageLiteOrBuilder {

    /**
     * <pre>
     * The static color value, in ARGB format. If a dynamic value is also set and the
     * renderer supports dynamic values for the corresponding field, this static
     * value will be ignored. If the static value is not specified, zero
     * (equivalent to {&#64;link Color#TRANSPARENT}) will be used instead.
     * </pre>
     *
     * <code>uint32 argb = 1;</code>
     * @return Whether the argb field is set.
     */
    boolean hasArgb();
    /**
     * <pre>
     * The static color value, in ARGB format. If a dynamic value is also set and the
     * renderer supports dynamic values for the corresponding field, this static
     * value will be ignored. If the static value is not specified, zero
     * (equivalent to {&#64;link Color#TRANSPARENT}) will be used instead.
     * </pre>
     *
     * <code>uint32 argb = 1;</code>
     * @return The argb.
     */
    int getArgb();

    /**
     * <pre>
     * The dynamic value. Note that when setting this value, the static value is
     * still required to be set to support older renderers that only read the
     * static value. If {&#64;code dynamicValue} has an invalid result, the provided
     * static value will be used instead.
     * </pre>
     *
     * <code>.androidx.wear.protolayout.expression.proto.DynamicColor dynamic_value = 2;</code>
     * @return Whether the dynamicValue field is set.
     */
    boolean hasDynamicValue();
    /**
     * <pre>
     * The dynamic value. Note that when setting this value, the static value is
     * still required to be set to support older renderers that only read the
     * static value. If {&#64;code dynamicValue} has an invalid result, the provided
     * static value will be used instead.
     * </pre>
     *
     * <code>.androidx.wear.protolayout.expression.proto.DynamicColor dynamic_value = 2;</code>
     * @return The dynamicValue.
     */
    androidx.wear.protolayout.expression.proto.DynamicProto.DynamicColor getDynamicValue();

    public androidx.wear.protolayout.proto.ColorProto.ColorProp.OptionalArgbCase getOptionalArgbCase();
  }
  /**
   * <pre>
   * A property defining a color.
   * </pre>
   *
   * Protobuf type {@code androidx.wear.protolayout.proto.ColorProp}
   */
  public  static final class ColorProp extends
      com.google.protobuf.GeneratedMessageLite<
          ColorProp, ColorProp.Builder> implements
      // @@protoc_insertion_point(message_implements:androidx.wear.protolayout.proto.ColorProp)
      ColorPropOrBuilder {
    private ColorProp() {
    }
    private int bitField0_;
    private int optionalArgbCase_ = 0;
    private java.lang.Object optionalArgb_;
    public enum OptionalArgbCase {
      ARGB(1),
      OPTIONALARGB_NOT_SET(0);
      private final int value;
      private OptionalArgbCase(int value) {
        this.value = value;
      }
      /**
       * @deprecated Use {@link #forNumber(int)} instead.
       */
      @java.lang.Deprecated
      public static OptionalArgbCase valueOf(int value) {
        return forNumber(value);
      }

      public static OptionalArgbCase forNumber(int value) {
        switch (value) {
          case 1: return ARGB;
          case 0: return OPTIONALARGB_NOT_SET;
          default: return null;
        }
      }
      public int getNumber() {
        return this.value;
      }
    };

    @java.lang.Override
    public OptionalArgbCase
    getOptionalArgbCase() {
      return OptionalArgbCase.forNumber(
          optionalArgbCase_);
    }

    private void clearOptionalArgb() {
      optionalArgbCase_ = 0;
      optionalArgb_ = null;
    }

    public static final int ARGB_FIELD_NUMBER = 1;
    /**
     * <pre>
     * The static color value, in ARGB format. If a dynamic value is also set and the
     * renderer supports dynamic values for the corresponding field, this static
     * value will be ignored. If the static value is not specified, zero
     * (equivalent to {&#64;link Color#TRANSPARENT}) will be used instead.
     * </pre>
     *
     * <code>uint32 argb = 1;</code>
     * @return Whether the argb field is set.
     */
    @java.lang.Override
    public boolean hasArgb() {
      return optionalArgbCase_ == 1;
    }
    /**
     * <pre>
     * The static color value, in ARGB format. If a dynamic value is also set and the
     * renderer supports dynamic values for the corresponding field, this static
     * value will be ignored. If the static value is not specified, zero
     * (equivalent to {&#64;link Color#TRANSPARENT}) will be used instead.
     * </pre>
     *
     * <code>uint32 argb = 1;</code>
     * @return The argb.
     */
    @java.lang.Override
    public int getArgb() {
      if (optionalArgbCase_ == 1) {
        return (java.lang.Integer) optionalArgb_;
      }
      return 0;
    }
    /**
     * <pre>
     * The static color value, in ARGB format. If a dynamic value is also set and the
     * renderer supports dynamic values for the corresponding field, this static
     * value will be ignored. If the static value is not specified, zero
     * (equivalent to {&#64;link Color#TRANSPARENT}) will be used instead.
     * </pre>
     *
     * <code>uint32 argb = 1;</code>
     * @param value The argb to set.
     */
    private void setArgb(int value) {
      optionalArgbCase_ = 1;
      optionalArgb_ = value;
    }
    /**
     * <pre>
     * The static color value, in ARGB format. If a dynamic value is also set and the
     * renderer supports dynamic values for the corresponding field, this static
     * value will be ignored. If the static value is not specified, zero
     * (equivalent to {&#64;link Color#TRANSPARENT}) will be used instead.
     * </pre>
     *
     * <code>uint32 argb = 1;</code>
     */
    private void clearArgb() {
      if (optionalArgbCase_ == 1) {
        optionalArgbCase_ = 0;
        optionalArgb_ = null;
      }
    }

    public static final int DYNAMIC_VALUE_FIELD_NUMBER = 2;
    private androidx.wear.protolayout.expression.proto.DynamicProto.DynamicColor dynamicValue_;
    /**
     * <pre>
     * The dynamic value. Note that when setting this value, the static value is
     * still required to be set to support older renderers that only read the
     * static value. If {&#64;code dynamicValue} has an invalid result, the provided
     * static value will be used instead.
     * </pre>
     *
     * <code>.androidx.wear.protolayout.expression.proto.DynamicColor dynamic_value = 2;</code>
     */
    @java.lang.Override
    public boolean hasDynamicValue() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * The dynamic value. Note that when setting this value, the static value is
     * still required to be set to support older renderers that only read the
     * static value. If {&#64;code dynamicValue} has an invalid result, the provided
     * static value will be used instead.
     * </pre>
     *
     * <code>.androidx.wear.protolayout.expression.proto.DynamicColor dynamic_value = 2;</code>
     */
    @java.lang.Override
    public androidx.wear.protolayout.expression.proto.DynamicProto.DynamicColor getDynamicValue() {
      return dynamicValue_ == null ? androidx.wear.protolayout.expression.proto.DynamicProto.DynamicColor.getDefaultInstance() : dynamicValue_;
    }
    /**
     * <pre>
     * The dynamic value. Note that when setting this value, the static value is
     * still required to be set to support older renderers that only read the
     * static value. If {&#64;code dynamicValue} has an invalid result, the provided
     * static value will be used instead.
     * </pre>
     *
     * <code>.androidx.wear.protolayout.expression.proto.DynamicColor dynamic_value = 2;</code>
     */
    private void setDynamicValue(androidx.wear.protolayout.expression.proto.DynamicProto.DynamicColor value) {
      value.getClass();
  dynamicValue_ = value;
      bitField0_ |= 0x00000001;
      }
    /**
     * <pre>
     * The dynamic value. Note that when setting this value, the static value is
     * still required to be set to support older renderers that only read the
     * static value. If {&#64;code dynamicValue} has an invalid result, the provided
     * static value will be used instead.
     * </pre>
     *
     * <code>.androidx.wear.protolayout.expression.proto.DynamicColor dynamic_value = 2;</code>
     */
    @java.lang.SuppressWarnings({"ReferenceEquality"})
    private void mergeDynamicValue(androidx.wear.protolayout.expression.proto.DynamicProto.DynamicColor value) {
      value.getClass();
  if (dynamicValue_ != null &&
          dynamicValue_ != androidx.wear.protolayout.expression.proto.DynamicProto.DynamicColor.getDefaultInstance()) {
        dynamicValue_ =
          androidx.wear.protolayout.expression.proto.DynamicProto.DynamicColor.newBuilder(dynamicValue_).mergeFrom(value).buildPartial();
      } else {
        dynamicValue_ = value;
      }
      bitField0_ |= 0x00000001;
    }
    /**
     * <pre>
     * The dynamic value. Note that when setting this value, the static value is
     * still required to be set to support older renderers that only read the
     * static value. If {&#64;code dynamicValue} has an invalid result, the provided
     * static value will be used instead.
     * </pre>
     *
     * <code>.androidx.wear.protolayout.expression.proto.DynamicColor dynamic_value = 2;</code>
     */
    private void clearDynamicValue() {  dynamicValue_ = null;
      bitField0_ = (bitField0_ & ~0x00000001);
    }

    public static androidx.wear.protolayout.proto.ColorProto.ColorProp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static androidx.wear.protolayout.proto.ColorProto.ColorProp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static androidx.wear.protolayout.proto.ColorProto.ColorProp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static androidx.wear.protolayout.proto.ColorProto.ColorProp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static androidx.wear.protolayout.proto.ColorProto.ColorProp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static androidx.wear.protolayout.proto.ColorProto.ColorProp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static androidx.wear.protolayout.proto.ColorProto.ColorProp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static androidx.wear.protolayout.proto.ColorProto.ColorProp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static androidx.wear.protolayout.proto.ColorProto.ColorProp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }

    public static androidx.wear.protolayout.proto.ColorProto.ColorProp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static androidx.wear.protolayout.proto.ColorProto.ColorProp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static androidx.wear.protolayout.proto.ColorProto.ColorProp parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return (Builder) DEFAULT_INSTANCE.createBuilder();
    }
    public static Builder newBuilder(androidx.wear.protolayout.proto.ColorProto.ColorProp prototype) {
      return DEFAULT_INSTANCE.createBuilder(prototype);
    }

    /**
     * <pre>
     * A property defining a color.
     * </pre>
     *
     * Protobuf type {@code androidx.wear.protolayout.proto.ColorProp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageLite.Builder<
          androidx.wear.protolayout.proto.ColorProto.ColorProp, Builder> implements
        // @@protoc_insertion_point(builder_implements:androidx.wear.protolayout.proto.ColorProp)
        androidx.wear.protolayout.proto.ColorProto.ColorPropOrBuilder {
      // Construct using androidx.wear.protolayout.proto.ColorProto.ColorProp.newBuilder()
      private Builder() {
        super(DEFAULT_INSTANCE);
      }

      @java.lang.Override
      public OptionalArgbCase
          getOptionalArgbCase() {
        return instance.getOptionalArgbCase();
      }

      public Builder clearOptionalArgb() {
        copyOnWrite();
        instance.clearOptionalArgb();
        return this;
      }


      /**
       * <pre>
       * The static color value, in ARGB format. If a dynamic value is also set and the
       * renderer supports dynamic values for the corresponding field, this static
       * value will be ignored. If the static value is not specified, zero
       * (equivalent to {&#64;link Color#TRANSPARENT}) will be used instead.
       * </pre>
       *
       * <code>uint32 argb = 1;</code>
       * @return Whether the argb field is set.
       */
      @java.lang.Override
      public boolean hasArgb() {
        return instance.hasArgb();
      }
      /**
       * <pre>
       * The static color value, in ARGB format. If a dynamic value is also set and the
       * renderer supports dynamic values for the corresponding field, this static
       * value will be ignored. If the static value is not specified, zero
       * (equivalent to {&#64;link Color#TRANSPARENT}) will be used instead.
       * </pre>
       *
       * <code>uint32 argb = 1;</code>
       * @return The argb.
       */
      @java.lang.Override
      public int getArgb() {
        return instance.getArgb();
      }
      /**
       * <pre>
       * The static color value, in ARGB format. If a dynamic value is also set and the
       * renderer supports dynamic values for the corresponding field, this static
       * value will be ignored. If the static value is not specified, zero
       * (equivalent to {&#64;link Color#TRANSPARENT}) will be used instead.
       * </pre>
       *
       * <code>uint32 argb = 1;</code>
       * @param value The argb to set.
       * @return This builder for chaining.
       */
      public Builder setArgb(int value) {
        copyOnWrite();
        instance.setArgb(value);
        return this;
      }
      /**
       * <pre>
       * The static color value, in ARGB format. If a dynamic value is also set and the
       * renderer supports dynamic values for the corresponding field, this static
       * value will be ignored. If the static value is not specified, zero
       * (equivalent to {&#64;link Color#TRANSPARENT}) will be used instead.
       * </pre>
       *
       * <code>uint32 argb = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearArgb() {
        copyOnWrite();
        instance.clearArgb();
        return this;
      }

      /**
       * <pre>
       * The dynamic value. Note that when setting this value, the static value is
       * still required to be set to support older renderers that only read the
       * static value. If {&#64;code dynamicValue} has an invalid result, the provided
       * static value will be used instead.
       * </pre>
       *
       * <code>.androidx.wear.protolayout.expression.proto.DynamicColor dynamic_value = 2;</code>
       */
      @java.lang.Override
      public boolean hasDynamicValue() {
        return instance.hasDynamicValue();
      }
      /**
       * <pre>
       * The dynamic value. Note that when setting this value, the static value is
       * still required to be set to support older renderers that only read the
       * static value. If {&#64;code dynamicValue} has an invalid result, the provided
       * static value will be used instead.
       * </pre>
       *
       * <code>.androidx.wear.protolayout.expression.proto.DynamicColor dynamic_value = 2;</code>
       */
      @java.lang.Override
      public androidx.wear.protolayout.expression.proto.DynamicProto.DynamicColor getDynamicValue() {
        return instance.getDynamicValue();
      }
      /**
       * <pre>
       * The dynamic value. Note that when setting this value, the static value is
       * still required to be set to support older renderers that only read the
       * static value. If {&#64;code dynamicValue} has an invalid result, the provided
       * static value will be used instead.
       * </pre>
       *
       * <code>.androidx.wear.protolayout.expression.proto.DynamicColor dynamic_value = 2;</code>
       */
      public Builder setDynamicValue(androidx.wear.protolayout.expression.proto.DynamicProto.DynamicColor value) {
        copyOnWrite();
        instance.setDynamicValue(value);
        return this;
        }
      /**
       * <pre>
       * The dynamic value. Note that when setting this value, the static value is
       * still required to be set to support older renderers that only read the
       * static value. If {&#64;code dynamicValue} has an invalid result, the provided
       * static value will be used instead.
       * </pre>
       *
       * <code>.androidx.wear.protolayout.expression.proto.DynamicColor dynamic_value = 2;</code>
       */
      public Builder setDynamicValue(
          androidx.wear.protolayout.expression.proto.DynamicProto.DynamicColor.Builder builderForValue) {
        copyOnWrite();
        instance.setDynamicValue(builderForValue.build());
        return this;
      }
      /**
       * <pre>
       * The dynamic value. Note that when setting this value, the static value is
       * still required to be set to support older renderers that only read the
       * static value. If {&#64;code dynamicValue} has an invalid result, the provided
       * static value will be used instead.
       * </pre>
       *
       * <code>.androidx.wear.protolayout.expression.proto.DynamicColor dynamic_value = 2;</code>
       */
      public Builder mergeDynamicValue(androidx.wear.protolayout.expression.proto.DynamicProto.DynamicColor value) {
        copyOnWrite();
        instance.mergeDynamicValue(value);
        return this;
      }
      /**
       * <pre>
       * The dynamic value. Note that when setting this value, the static value is
       * still required to be set to support older renderers that only read the
       * static value. If {&#64;code dynamicValue} has an invalid result, the provided
       * static value will be used instead.
       * </pre>
       *
       * <code>.androidx.wear.protolayout.expression.proto.DynamicColor dynamic_value = 2;</code>
       */
      public Builder clearDynamicValue() {  copyOnWrite();
        instance.clearDynamicValue();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:androidx.wear.protolayout.proto.ColorProp)
    }
    @java.lang.Override
    @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
    protected final java.lang.Object dynamicMethod(
        com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
        java.lang.Object arg0, java.lang.Object arg1) {
      switch (method) {
        case NEW_MUTABLE_INSTANCE: {
          return new androidx.wear.protolayout.proto.ColorProto.ColorProp();
        }
        case NEW_BUILDER: {
          return new Builder();
        }
        case BUILD_MESSAGE_INFO: {
            java.lang.Object[] objects = new java.lang.Object[] {
              "optionalArgb_",
              "optionalArgbCase_",
              "bitField0_",
              "dynamicValue_",
            };
            java.lang.String info =
                "\u0000\u0002\u0001\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001>\u0000\u0002\u1009" +
                "\u0000";
            return newMessageInfo(DEFAULT_INSTANCE, info, objects);
        }
        // fall through
        case GET_DEFAULT_INSTANCE: {
          return DEFAULT_INSTANCE;
        }
        case GET_PARSER: {
          com.google.protobuf.Parser<androidx.wear.protolayout.proto.ColorProto.ColorProp> parser = PARSER;
          if (parser == null) {
            synchronized (androidx.wear.protolayout.proto.ColorProto.ColorProp.class) {
              parser = PARSER;
              if (parser == null) {
                parser =
                    new DefaultInstanceBasedParser<androidx.wear.protolayout.proto.ColorProto.ColorProp>(
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


    // @@protoc_insertion_point(class_scope:androidx.wear.protolayout.proto.ColorProp)
    private static final androidx.wear.protolayout.proto.ColorProto.ColorProp DEFAULT_INSTANCE;
    static {
      ColorProp defaultInstance = new ColorProp();
      // New instances are implicitly immutable so no need to make
      // immutable.
      DEFAULT_INSTANCE = defaultInstance;
      com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
        ColorProp.class, defaultInstance);
    }

    public static androidx.wear.protolayout.proto.ColorProto.ColorProp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static volatile com.google.protobuf.Parser<ColorProp> PARSER;

    public static com.google.protobuf.Parser<ColorProp> parser() {
      return DEFAULT_INSTANCE.getParserForType();
    }
  }


  static {
  }

  // @@protoc_insertion_point(outer_class_scope)
}