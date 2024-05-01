// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: JMFPBNKNHED.proto

package emu.grasscutter.net.proto;

public final class JMFPBNKNHEDOuterClass {
  private JMFPBNKNHEDOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface JMFPBNKNHEDOrBuilder extends
      // @@protoc_insertion_point(interface_extends:JMFPBNKNHED)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint64 start_time = 1;</code>
     * @return The startTime.
     */
    long getStartTime();

    /**
     * <code>uint32 IFFAGNNKDOB = 2;</code>
     * @return The iFFAGNNKDOB.
     */
    int getIFFAGNNKDOB();

    /**
     * <code>uint32 KHBBKMCEBKA = 3;</code>
     * @return The kHBBKMCEBKA.
     */
    int getKHBBKMCEBKA();

    /**
     * <code>float JLLNGEKIHMN = 4;</code>
     * @return The jLLNGEKIHMN.
     */
    float getJLLNGEKIHMN();

    /**
     * <code>float speed = 5;</code>
     * @return The speed.
     */
    float getSpeed();

    /**
     * <code>bool is_started = 6;</code>
     * @return The isStarted.
     */
    boolean getIsStarted();
  }
  /**
   * Protobuf type {@code JMFPBNKNHED}
   */
  public static final class JMFPBNKNHED extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:JMFPBNKNHED)
      JMFPBNKNHEDOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use JMFPBNKNHED.newBuilder() to construct.
    private JMFPBNKNHED(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private JMFPBNKNHED() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new JMFPBNKNHED();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private JMFPBNKNHED(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8: {

              startTime_ = input.readUInt64();
              break;
            }
            case 16: {

              iFFAGNNKDOB_ = input.readUInt32();
              break;
            }
            case 24: {

              kHBBKMCEBKA_ = input.readUInt32();
              break;
            }
            case 37: {

              jLLNGEKIHMN_ = input.readFloat();
              break;
            }
            case 45: {

              speed_ = input.readFloat();
              break;
            }
            case 48: {

              isStarted_ = input.readBool();
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.JMFPBNKNHEDOuterClass.internal_static_JMFPBNKNHED_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.JMFPBNKNHEDOuterClass.internal_static_JMFPBNKNHED_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.JMFPBNKNHEDOuterClass.JMFPBNKNHED.class, emu.grasscutter.net.proto.JMFPBNKNHEDOuterClass.JMFPBNKNHED.Builder.class);
    }

    public static final int START_TIME_FIELD_NUMBER = 1;
    private long startTime_;
    /**
     * <code>uint64 start_time = 1;</code>
     * @return The startTime.
     */
    @java.lang.Override
    public long getStartTime() {
      return startTime_;
    }

    public static final int IFFAGNNKDOB_FIELD_NUMBER = 2;
    private int iFFAGNNKDOB_;
    /**
     * <code>uint32 IFFAGNNKDOB = 2;</code>
     * @return The iFFAGNNKDOB.
     */
    @java.lang.Override
    public int getIFFAGNNKDOB() {
      return iFFAGNNKDOB_;
    }

    public static final int KHBBKMCEBKA_FIELD_NUMBER = 3;
    private int kHBBKMCEBKA_;
    /**
     * <code>uint32 KHBBKMCEBKA = 3;</code>
     * @return The kHBBKMCEBKA.
     */
    @java.lang.Override
    public int getKHBBKMCEBKA() {
      return kHBBKMCEBKA_;
    }

    public static final int JLLNGEKIHMN_FIELD_NUMBER = 4;
    private float jLLNGEKIHMN_;
    /**
     * <code>float JLLNGEKIHMN = 4;</code>
     * @return The jLLNGEKIHMN.
     */
    @java.lang.Override
    public float getJLLNGEKIHMN() {
      return jLLNGEKIHMN_;
    }

    public static final int SPEED_FIELD_NUMBER = 5;
    private float speed_;
    /**
     * <code>float speed = 5;</code>
     * @return The speed.
     */
    @java.lang.Override
    public float getSpeed() {
      return speed_;
    }

    public static final int IS_STARTED_FIELD_NUMBER = 6;
    private boolean isStarted_;
    /**
     * <code>bool is_started = 6;</code>
     * @return The isStarted.
     */
    @java.lang.Override
    public boolean getIsStarted() {
      return isStarted_;
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
      if (startTime_ != 0L) {
        output.writeUInt64(1, startTime_);
      }
      if (iFFAGNNKDOB_ != 0) {
        output.writeUInt32(2, iFFAGNNKDOB_);
      }
      if (kHBBKMCEBKA_ != 0) {
        output.writeUInt32(3, kHBBKMCEBKA_);
      }
      if (jLLNGEKIHMN_ != 0F) {
        output.writeFloat(4, jLLNGEKIHMN_);
      }
      if (speed_ != 0F) {
        output.writeFloat(5, speed_);
      }
      if (isStarted_ != false) {
        output.writeBool(6, isStarted_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (startTime_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(1, startTime_);
      }
      if (iFFAGNNKDOB_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, iFFAGNNKDOB_);
      }
      if (kHBBKMCEBKA_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, kHBBKMCEBKA_);
      }
      if (jLLNGEKIHMN_ != 0F) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(4, jLLNGEKIHMN_);
      }
      if (speed_ != 0F) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(5, speed_);
      }
      if (isStarted_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(6, isStarted_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof emu.grasscutter.net.proto.JMFPBNKNHEDOuterClass.JMFPBNKNHED)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.JMFPBNKNHEDOuterClass.JMFPBNKNHED other = (emu.grasscutter.net.proto.JMFPBNKNHEDOuterClass.JMFPBNKNHED) obj;

      if (getStartTime()
          != other.getStartTime()) return false;
      if (getIFFAGNNKDOB()
          != other.getIFFAGNNKDOB()) return false;
      if (getKHBBKMCEBKA()
          != other.getKHBBKMCEBKA()) return false;
      if (java.lang.Float.floatToIntBits(getJLLNGEKIHMN())
          != java.lang.Float.floatToIntBits(
              other.getJLLNGEKIHMN())) return false;
      if (java.lang.Float.floatToIntBits(getSpeed())
          != java.lang.Float.floatToIntBits(
              other.getSpeed())) return false;
      if (getIsStarted()
          != other.getIsStarted()) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + START_TIME_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getStartTime());
      hash = (37 * hash) + IFFAGNNKDOB_FIELD_NUMBER;
      hash = (53 * hash) + getIFFAGNNKDOB();
      hash = (37 * hash) + KHBBKMCEBKA_FIELD_NUMBER;
      hash = (53 * hash) + getKHBBKMCEBKA();
      hash = (37 * hash) + JLLNGEKIHMN_FIELD_NUMBER;
      hash = (53 * hash) + java.lang.Float.floatToIntBits(
          getJLLNGEKIHMN());
      hash = (37 * hash) + SPEED_FIELD_NUMBER;
      hash = (53 * hash) + java.lang.Float.floatToIntBits(
          getSpeed());
      hash = (37 * hash) + IS_STARTED_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsStarted());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.JMFPBNKNHEDOuterClass.JMFPBNKNHED parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.JMFPBNKNHEDOuterClass.JMFPBNKNHED parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.JMFPBNKNHEDOuterClass.JMFPBNKNHED parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.JMFPBNKNHEDOuterClass.JMFPBNKNHED parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.JMFPBNKNHEDOuterClass.JMFPBNKNHED parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.JMFPBNKNHEDOuterClass.JMFPBNKNHED parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.JMFPBNKNHEDOuterClass.JMFPBNKNHED parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.JMFPBNKNHEDOuterClass.JMFPBNKNHED parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.JMFPBNKNHEDOuterClass.JMFPBNKNHED parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.JMFPBNKNHEDOuterClass.JMFPBNKNHED parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.JMFPBNKNHEDOuterClass.JMFPBNKNHED parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.JMFPBNKNHEDOuterClass.JMFPBNKNHED parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.JMFPBNKNHEDOuterClass.JMFPBNKNHED prototype) {
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
     * Protobuf type {@code JMFPBNKNHED}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:JMFPBNKNHED)
        emu.grasscutter.net.proto.JMFPBNKNHEDOuterClass.JMFPBNKNHEDOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.JMFPBNKNHEDOuterClass.internal_static_JMFPBNKNHED_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.JMFPBNKNHEDOuterClass.internal_static_JMFPBNKNHED_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.JMFPBNKNHEDOuterClass.JMFPBNKNHED.class, emu.grasscutter.net.proto.JMFPBNKNHEDOuterClass.JMFPBNKNHED.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.JMFPBNKNHEDOuterClass.JMFPBNKNHED.newBuilder()
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
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        startTime_ = 0L;

        iFFAGNNKDOB_ = 0;

        kHBBKMCEBKA_ = 0;

        jLLNGEKIHMN_ = 0F;

        speed_ = 0F;

        isStarted_ = false;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.JMFPBNKNHEDOuterClass.internal_static_JMFPBNKNHED_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.JMFPBNKNHEDOuterClass.JMFPBNKNHED getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.JMFPBNKNHEDOuterClass.JMFPBNKNHED.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.JMFPBNKNHEDOuterClass.JMFPBNKNHED build() {
        emu.grasscutter.net.proto.JMFPBNKNHEDOuterClass.JMFPBNKNHED result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.JMFPBNKNHEDOuterClass.JMFPBNKNHED buildPartial() {
        emu.grasscutter.net.proto.JMFPBNKNHEDOuterClass.JMFPBNKNHED result = new emu.grasscutter.net.proto.JMFPBNKNHEDOuterClass.JMFPBNKNHED(this);
        result.startTime_ = startTime_;
        result.iFFAGNNKDOB_ = iFFAGNNKDOB_;
        result.kHBBKMCEBKA_ = kHBBKMCEBKA_;
        result.jLLNGEKIHMN_ = jLLNGEKIHMN_;
        result.speed_ = speed_;
        result.isStarted_ = isStarted_;
        onBuilt();
        return result;
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
        if (other instanceof emu.grasscutter.net.proto.JMFPBNKNHEDOuterClass.JMFPBNKNHED) {
          return mergeFrom((emu.grasscutter.net.proto.JMFPBNKNHEDOuterClass.JMFPBNKNHED)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.JMFPBNKNHEDOuterClass.JMFPBNKNHED other) {
        if (other == emu.grasscutter.net.proto.JMFPBNKNHEDOuterClass.JMFPBNKNHED.getDefaultInstance()) return this;
        if (other.getStartTime() != 0L) {
          setStartTime(other.getStartTime());
        }
        if (other.getIFFAGNNKDOB() != 0) {
          setIFFAGNNKDOB(other.getIFFAGNNKDOB());
        }
        if (other.getKHBBKMCEBKA() != 0) {
          setKHBBKMCEBKA(other.getKHBBKMCEBKA());
        }
        if (other.getJLLNGEKIHMN() != 0F) {
          setJLLNGEKIHMN(other.getJLLNGEKIHMN());
        }
        if (other.getSpeed() != 0F) {
          setSpeed(other.getSpeed());
        }
        if (other.getIsStarted() != false) {
          setIsStarted(other.getIsStarted());
        }
        this.mergeUnknownFields(other.unknownFields);
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
        emu.grasscutter.net.proto.JMFPBNKNHEDOuterClass.JMFPBNKNHED parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.JMFPBNKNHEDOuterClass.JMFPBNKNHED) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private long startTime_ ;
      /**
       * <code>uint64 start_time = 1;</code>
       * @return The startTime.
       */
      @java.lang.Override
      public long getStartTime() {
        return startTime_;
      }
      /**
       * <code>uint64 start_time = 1;</code>
       * @param value The startTime to set.
       * @return This builder for chaining.
       */
      public Builder setStartTime(long value) {
        
        startTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 start_time = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearStartTime() {
        
        startTime_ = 0L;
        onChanged();
        return this;
      }

      private int iFFAGNNKDOB_ ;
      /**
       * <code>uint32 IFFAGNNKDOB = 2;</code>
       * @return The iFFAGNNKDOB.
       */
      @java.lang.Override
      public int getIFFAGNNKDOB() {
        return iFFAGNNKDOB_;
      }
      /**
       * <code>uint32 IFFAGNNKDOB = 2;</code>
       * @param value The iFFAGNNKDOB to set.
       * @return This builder for chaining.
       */
      public Builder setIFFAGNNKDOB(int value) {
        
        iFFAGNNKDOB_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 IFFAGNNKDOB = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearIFFAGNNKDOB() {
        
        iFFAGNNKDOB_ = 0;
        onChanged();
        return this;
      }

      private int kHBBKMCEBKA_ ;
      /**
       * <code>uint32 KHBBKMCEBKA = 3;</code>
       * @return The kHBBKMCEBKA.
       */
      @java.lang.Override
      public int getKHBBKMCEBKA() {
        return kHBBKMCEBKA_;
      }
      /**
       * <code>uint32 KHBBKMCEBKA = 3;</code>
       * @param value The kHBBKMCEBKA to set.
       * @return This builder for chaining.
       */
      public Builder setKHBBKMCEBKA(int value) {
        
        kHBBKMCEBKA_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 KHBBKMCEBKA = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearKHBBKMCEBKA() {
        
        kHBBKMCEBKA_ = 0;
        onChanged();
        return this;
      }

      private float jLLNGEKIHMN_ ;
      /**
       * <code>float JLLNGEKIHMN = 4;</code>
       * @return The jLLNGEKIHMN.
       */
      @java.lang.Override
      public float getJLLNGEKIHMN() {
        return jLLNGEKIHMN_;
      }
      /**
       * <code>float JLLNGEKIHMN = 4;</code>
       * @param value The jLLNGEKIHMN to set.
       * @return This builder for chaining.
       */
      public Builder setJLLNGEKIHMN(float value) {
        
        jLLNGEKIHMN_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>float JLLNGEKIHMN = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearJLLNGEKIHMN() {
        
        jLLNGEKIHMN_ = 0F;
        onChanged();
        return this;
      }

      private float speed_ ;
      /**
       * <code>float speed = 5;</code>
       * @return The speed.
       */
      @java.lang.Override
      public float getSpeed() {
        return speed_;
      }
      /**
       * <code>float speed = 5;</code>
       * @param value The speed to set.
       * @return This builder for chaining.
       */
      public Builder setSpeed(float value) {
        
        speed_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>float speed = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearSpeed() {
        
        speed_ = 0F;
        onChanged();
        return this;
      }

      private boolean isStarted_ ;
      /**
       * <code>bool is_started = 6;</code>
       * @return The isStarted.
       */
      @java.lang.Override
      public boolean getIsStarted() {
        return isStarted_;
      }
      /**
       * <code>bool is_started = 6;</code>
       * @param value The isStarted to set.
       * @return This builder for chaining.
       */
      public Builder setIsStarted(boolean value) {
        
        isStarted_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_started = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsStarted() {
        
        isStarted_ = false;
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


      // @@protoc_insertion_point(builder_scope:JMFPBNKNHED)
    }

    // @@protoc_insertion_point(class_scope:JMFPBNKNHED)
    private static final emu.grasscutter.net.proto.JMFPBNKNHEDOuterClass.JMFPBNKNHED DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.JMFPBNKNHEDOuterClass.JMFPBNKNHED();
    }

    public static emu.grasscutter.net.proto.JMFPBNKNHEDOuterClass.JMFPBNKNHED getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<JMFPBNKNHED>
        PARSER = new com.google.protobuf.AbstractParser<JMFPBNKNHED>() {
      @java.lang.Override
      public JMFPBNKNHED parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new JMFPBNKNHED(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<JMFPBNKNHED> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<JMFPBNKNHED> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.JMFPBNKNHEDOuterClass.JMFPBNKNHED getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_JMFPBNKNHED_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_JMFPBNKNHED_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021JMFPBNKNHED.proto\"\203\001\n\013JMFPBNKNHED\022\022\n\ns" +
      "tart_time\030\001 \001(\004\022\023\n\013IFFAGNNKDOB\030\002 \001(\r\022\023\n\013" +
      "KHBBKMCEBKA\030\003 \001(\r\022\023\n\013JLLNGEKIHMN\030\004 \001(\002\022\r" +
      "\n\005speed\030\005 \001(\002\022\022\n\nis_started\030\006 \001(\010B\033\n\031emu" +
      ".grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_JMFPBNKNHED_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_JMFPBNKNHED_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_JMFPBNKNHED_descriptor,
        new java.lang.String[] { "StartTime", "IFFAGNNKDOB", "KHBBKMCEBKA", "JLLNGEKIHMN", "Speed", "IsStarted", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
