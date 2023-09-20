// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: version.proto

package androidx.wear.protolayout.expression.proto;

public final class VersionProto {
  private VersionProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }
  public interface VersionInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:androidx.wear.protolayout.expression.proto.VersionInfo)
      com.google.protobuf.MessageLiteOrBuilder {

    /**
     * <pre>
     * Major version. Incremented on breaking changes (i.e. compatibility is not
     * guaranteed across major versions).
     * </pre>
     *
     * <code>uint32 major = 1;</code>
     * @return The major.
     */
    int getMajor();

    /**
     * <pre>
     * Minor version. Incremented on non-breaking changes (e.g. schema additions).
     * Anything consuming a payload can safely consume anything with a lower
     * minor version.
     * </pre>
     *
     * <code>uint32 minor = 2;</code>
     * @return The minor.
     */
    int getMinor();
  }
  /**
   * <pre>
   * Version information. This is used to encode the schema version of a payload
   * (e.g. inside of a layout).
   * </pre>
   *
   * Protobuf type {@code androidx.wear.protolayout.expression.proto.VersionInfo}
   */
  public  static final class VersionInfo extends
      com.google.protobuf.GeneratedMessageLite<
          VersionInfo, VersionInfo.Builder> implements
      // @@protoc_insertion_point(message_implements:androidx.wear.protolayout.expression.proto.VersionInfo)
      VersionInfoOrBuilder {
    private VersionInfo() {
    }
    public static final int MAJOR_FIELD_NUMBER = 1;
    private int major_;
    /**
     * <pre>
     * Major version. Incremented on breaking changes (i.e. compatibility is not
     * guaranteed across major versions).
     * </pre>
     *
     * <code>uint32 major = 1;</code>
     * @return The major.
     */
    @java.lang.Override
    public int getMajor() {
      return major_;
    }
    /**
     * <pre>
     * Major version. Incremented on breaking changes (i.e. compatibility is not
     * guaranteed across major versions).
     * </pre>
     *
     * <code>uint32 major = 1;</code>
     * @param value The major to set.
     */
    private void setMajor(int value) {
      
      major_ = value;
    }
    /**
     * <pre>
     * Major version. Incremented on breaking changes (i.e. compatibility is not
     * guaranteed across major versions).
     * </pre>
     *
     * <code>uint32 major = 1;</code>
     */
    private void clearMajor() {

      major_ = 0;
    }

    public static final int MINOR_FIELD_NUMBER = 2;
    private int minor_;
    /**
     * <pre>
     * Minor version. Incremented on non-breaking changes (e.g. schema additions).
     * Anything consuming a payload can safely consume anything with a lower
     * minor version.
     * </pre>
     *
     * <code>uint32 minor = 2;</code>
     * @return The minor.
     */
    @java.lang.Override
    public int getMinor() {
      return minor_;
    }
    /**
     * <pre>
     * Minor version. Incremented on non-breaking changes (e.g. schema additions).
     * Anything consuming a payload can safely consume anything with a lower
     * minor version.
     * </pre>
     *
     * <code>uint32 minor = 2;</code>
     * @param value The minor to set.
     */
    private void setMinor(int value) {
      
      minor_ = value;
    }
    /**
     * <pre>
     * Minor version. Incremented on non-breaking changes (e.g. schema additions).
     * Anything consuming a payload can safely consume anything with a lower
     * minor version.
     * </pre>
     *
     * <code>uint32 minor = 2;</code>
     */
    private void clearMinor() {

      minor_ = 0;
    }

    public static androidx.wear.protolayout.expression.proto.VersionProto.VersionInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static androidx.wear.protolayout.expression.proto.VersionProto.VersionInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static androidx.wear.protolayout.expression.proto.VersionProto.VersionInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static androidx.wear.protolayout.expression.proto.VersionProto.VersionInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static androidx.wear.protolayout.expression.proto.VersionProto.VersionInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static androidx.wear.protolayout.expression.proto.VersionProto.VersionInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static androidx.wear.protolayout.expression.proto.VersionProto.VersionInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static androidx.wear.protolayout.expression.proto.VersionProto.VersionInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static androidx.wear.protolayout.expression.proto.VersionProto.VersionInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }

    public static androidx.wear.protolayout.expression.proto.VersionProto.VersionInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static androidx.wear.protolayout.expression.proto.VersionProto.VersionInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static androidx.wear.protolayout.expression.proto.VersionProto.VersionInfo parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return (Builder) DEFAULT_INSTANCE.createBuilder();
    }
    public static Builder newBuilder(androidx.wear.protolayout.expression.proto.VersionProto.VersionInfo prototype) {
      return DEFAULT_INSTANCE.createBuilder(prototype);
    }

    /**
     * <pre>
     * Version information. This is used to encode the schema version of a payload
     * (e.g. inside of a layout).
     * </pre>
     *
     * Protobuf type {@code androidx.wear.protolayout.expression.proto.VersionInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageLite.Builder<
          androidx.wear.protolayout.expression.proto.VersionProto.VersionInfo, Builder> implements
        // @@protoc_insertion_point(builder_implements:androidx.wear.protolayout.expression.proto.VersionInfo)
        androidx.wear.protolayout.expression.proto.VersionProto.VersionInfoOrBuilder {
      // Construct using androidx.wear.protolayout.expression.proto.VersionProto.VersionInfo.newBuilder()
      private Builder() {
        super(DEFAULT_INSTANCE);
      }


      /**
       * <pre>
       * Major version. Incremented on breaking changes (i.e. compatibility is not
       * guaranteed across major versions).
       * </pre>
       *
       * <code>uint32 major = 1;</code>
       * @return The major.
       */
      @java.lang.Override
      public int getMajor() {
        return instance.getMajor();
      }
      /**
       * <pre>
       * Major version. Incremented on breaking changes (i.e. compatibility is not
       * guaranteed across major versions).
       * </pre>
       *
       * <code>uint32 major = 1;</code>
       * @param value The major to set.
       * @return This builder for chaining.
       */
      public Builder setMajor(int value) {
        copyOnWrite();
        instance.setMajor(value);
        return this;
      }
      /**
       * <pre>
       * Major version. Incremented on breaking changes (i.e. compatibility is not
       * guaranteed across major versions).
       * </pre>
       *
       * <code>uint32 major = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearMajor() {
        copyOnWrite();
        instance.clearMajor();
        return this;
      }

      /**
       * <pre>
       * Minor version. Incremented on non-breaking changes (e.g. schema additions).
       * Anything consuming a payload can safely consume anything with a lower
       * minor version.
       * </pre>
       *
       * <code>uint32 minor = 2;</code>
       * @return The minor.
       */
      @java.lang.Override
      public int getMinor() {
        return instance.getMinor();
      }
      /**
       * <pre>
       * Minor version. Incremented on non-breaking changes (e.g. schema additions).
       * Anything consuming a payload can safely consume anything with a lower
       * minor version.
       * </pre>
       *
       * <code>uint32 minor = 2;</code>
       * @param value The minor to set.
       * @return This builder for chaining.
       */
      public Builder setMinor(int value) {
        copyOnWrite();
        instance.setMinor(value);
        return this;
      }
      /**
       * <pre>
       * Minor version. Incremented on non-breaking changes (e.g. schema additions).
       * Anything consuming a payload can safely consume anything with a lower
       * minor version.
       * </pre>
       *
       * <code>uint32 minor = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearMinor() {
        copyOnWrite();
        instance.clearMinor();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:androidx.wear.protolayout.expression.proto.VersionInfo)
    }
    @java.lang.Override
    @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
    protected final java.lang.Object dynamicMethod(
        com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
        java.lang.Object arg0, java.lang.Object arg1) {
      switch (method) {
        case NEW_MUTABLE_INSTANCE: {
          return new androidx.wear.protolayout.expression.proto.VersionProto.VersionInfo();
        }
        case NEW_BUILDER: {
          return new Builder();
        }
        case BUILD_MESSAGE_INFO: {
            java.lang.Object[] objects = new java.lang.Object[] {
              "major_",
              "minor_",
            };
            java.lang.String info =
                "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b" +
                "";
            return newMessageInfo(DEFAULT_INSTANCE, info, objects);
        }
        // fall through
        case GET_DEFAULT_INSTANCE: {
          return DEFAULT_INSTANCE;
        }
        case GET_PARSER: {
          com.google.protobuf.Parser<androidx.wear.protolayout.expression.proto.VersionProto.VersionInfo> parser = PARSER;
          if (parser == null) {
            synchronized (androidx.wear.protolayout.expression.proto.VersionProto.VersionInfo.class) {
              parser = PARSER;
              if (parser == null) {
                parser =
                    new DefaultInstanceBasedParser<androidx.wear.protolayout.expression.proto.VersionProto.VersionInfo>(
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


    // @@protoc_insertion_point(class_scope:androidx.wear.protolayout.expression.proto.VersionInfo)
    private static final androidx.wear.protolayout.expression.proto.VersionProto.VersionInfo DEFAULT_INSTANCE;
    static {
      VersionInfo defaultInstance = new VersionInfo();
      // New instances are implicitly immutable so no need to make
      // immutable.
      DEFAULT_INSTANCE = defaultInstance;
      com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
        VersionInfo.class, defaultInstance);
    }

    public static androidx.wear.protolayout.expression.proto.VersionProto.VersionInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static volatile com.google.protobuf.Parser<VersionInfo> PARSER;

    public static com.google.protobuf.Parser<VersionInfo> parser() {
      return DEFAULT_INSTANCE.getParserForType();
    }
  }


  static {
  }

  // @@protoc_insertion_point(outer_class_scope)
}