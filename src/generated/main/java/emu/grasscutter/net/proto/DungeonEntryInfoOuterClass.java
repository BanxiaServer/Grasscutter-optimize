// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: DungeonEntryInfo.proto

package emu.grasscutter.net.proto;

public final class DungeonEntryInfoOuterClass {
  private DungeonEntryInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface DungeonEntryInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:DungeonEntryInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.WeeklyBossResinDiscountInfo weekly_boss_resin_discount_info = 5;</code>
     * @return Whether the weeklyBossResinDiscountInfo field is set.
     */
    boolean hasWeeklyBossResinDiscountInfo();
    /**
     * <code>.WeeklyBossResinDiscountInfo weekly_boss_resin_discount_info = 5;</code>
     * @return The weeklyBossResinDiscountInfo.
     */
    emu.grasscutter.net.proto.WeeklyBossResinDiscountInfoOuterClass.WeeklyBossResinDiscountInfo getWeeklyBossResinDiscountInfo();
    /**
     * <code>.WeeklyBossResinDiscountInfo weekly_boss_resin_discount_info = 5;</code>
     */
    emu.grasscutter.net.proto.WeeklyBossResinDiscountInfoOuterClass.WeeklyBossResinDiscountInfoOrBuilder getWeeklyBossResinDiscountInfoOrBuilder();

    /**
     * <code>uint32 ACDENLCGGOG = 8;</code>
     * @return The aCDENLCGGOG.
     */
    int getACDENLCGGOG();

    /**
     * <code>bool is_passed = 12;</code>
     * @return The isPassed.
     */
    boolean getIsPassed();

    /**
     * <code>uint32 dungeon_id = 7;</code>
     * @return The dungeonId.
     */
    int getDungeonId();

    /**
     * <code>uint32 IOLIIMALAGH = 10;</code>
     * @return The iOLIIMALAGH.
     */
    int getIOLIIMALAGH();

    /**
     * <code>uint32 BNOMBDGDKCC = 9;</code>
     * @return The bNOMBDGDKCC.
     */
    int getBNOMBDGDKCC();
  }
  /**
   * Protobuf type {@code DungeonEntryInfo}
   */
  public static final class DungeonEntryInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:DungeonEntryInfo)
      DungeonEntryInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use DungeonEntryInfo.newBuilder() to construct.
    private DungeonEntryInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private DungeonEntryInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new DungeonEntryInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private DungeonEntryInfo(
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
            case 42: {
              emu.grasscutter.net.proto.WeeklyBossResinDiscountInfoOuterClass.WeeklyBossResinDiscountInfo.Builder subBuilder = null;
              if (weeklyBossResinDiscountInfo_ != null) {
                subBuilder = weeklyBossResinDiscountInfo_.toBuilder();
              }
              weeklyBossResinDiscountInfo_ = input.readMessage(emu.grasscutter.net.proto.WeeklyBossResinDiscountInfoOuterClass.WeeklyBossResinDiscountInfo.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(weeklyBossResinDiscountInfo_);
                weeklyBossResinDiscountInfo_ = subBuilder.buildPartial();
              }

              break;
            }
            case 56: {

              dungeonId_ = input.readUInt32();
              break;
            }
            case 64: {

              aCDENLCGGOG_ = input.readUInt32();
              break;
            }
            case 72: {

              bNOMBDGDKCC_ = input.readUInt32();
              break;
            }
            case 80: {

              iOLIIMALAGH_ = input.readUInt32();
              break;
            }
            case 96: {

              isPassed_ = input.readBool();
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
      return emu.grasscutter.net.proto.DungeonEntryInfoOuterClass.internal_static_DungeonEntryInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.DungeonEntryInfoOuterClass.internal_static_DungeonEntryInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.DungeonEntryInfoOuterClass.DungeonEntryInfo.class, emu.grasscutter.net.proto.DungeonEntryInfoOuterClass.DungeonEntryInfo.Builder.class);
    }

    public static final int WEEKLY_BOSS_RESIN_DISCOUNT_INFO_FIELD_NUMBER = 5;
    private emu.grasscutter.net.proto.WeeklyBossResinDiscountInfoOuterClass.WeeklyBossResinDiscountInfo weeklyBossResinDiscountInfo_;
    /**
     * <code>.WeeklyBossResinDiscountInfo weekly_boss_resin_discount_info = 5;</code>
     * @return Whether the weeklyBossResinDiscountInfo field is set.
     */
    @java.lang.Override
    public boolean hasWeeklyBossResinDiscountInfo() {
      return weeklyBossResinDiscountInfo_ != null;
    }
    /**
     * <code>.WeeklyBossResinDiscountInfo weekly_boss_resin_discount_info = 5;</code>
     * @return The weeklyBossResinDiscountInfo.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.WeeklyBossResinDiscountInfoOuterClass.WeeklyBossResinDiscountInfo getWeeklyBossResinDiscountInfo() {
      return weeklyBossResinDiscountInfo_ == null ? emu.grasscutter.net.proto.WeeklyBossResinDiscountInfoOuterClass.WeeklyBossResinDiscountInfo.getDefaultInstance() : weeklyBossResinDiscountInfo_;
    }
    /**
     * <code>.WeeklyBossResinDiscountInfo weekly_boss_resin_discount_info = 5;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.WeeklyBossResinDiscountInfoOuterClass.WeeklyBossResinDiscountInfoOrBuilder getWeeklyBossResinDiscountInfoOrBuilder() {
      return getWeeklyBossResinDiscountInfo();
    }

    public static final int ACDENLCGGOG_FIELD_NUMBER = 8;
    private int aCDENLCGGOG_;
    /**
     * <code>uint32 ACDENLCGGOG = 8;</code>
     * @return The aCDENLCGGOG.
     */
    @java.lang.Override
    public int getACDENLCGGOG() {
      return aCDENLCGGOG_;
    }

    public static final int IS_PASSED_FIELD_NUMBER = 12;
    private boolean isPassed_;
    /**
     * <code>bool is_passed = 12;</code>
     * @return The isPassed.
     */
    @java.lang.Override
    public boolean getIsPassed() {
      return isPassed_;
    }

    public static final int DUNGEON_ID_FIELD_NUMBER = 7;
    private int dungeonId_;
    /**
     * <code>uint32 dungeon_id = 7;</code>
     * @return The dungeonId.
     */
    @java.lang.Override
    public int getDungeonId() {
      return dungeonId_;
    }

    public static final int IOLIIMALAGH_FIELD_NUMBER = 10;
    private int iOLIIMALAGH_;
    /**
     * <code>uint32 IOLIIMALAGH = 10;</code>
     * @return The iOLIIMALAGH.
     */
    @java.lang.Override
    public int getIOLIIMALAGH() {
      return iOLIIMALAGH_;
    }

    public static final int BNOMBDGDKCC_FIELD_NUMBER = 9;
    private int bNOMBDGDKCC_;
    /**
     * <code>uint32 BNOMBDGDKCC = 9;</code>
     * @return The bNOMBDGDKCC.
     */
    @java.lang.Override
    public int getBNOMBDGDKCC() {
      return bNOMBDGDKCC_;
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
      if (weeklyBossResinDiscountInfo_ != null) {
        output.writeMessage(5, getWeeklyBossResinDiscountInfo());
      }
      if (dungeonId_ != 0) {
        output.writeUInt32(7, dungeonId_);
      }
      if (aCDENLCGGOG_ != 0) {
        output.writeUInt32(8, aCDENLCGGOG_);
      }
      if (bNOMBDGDKCC_ != 0) {
        output.writeUInt32(9, bNOMBDGDKCC_);
      }
      if (iOLIIMALAGH_ != 0) {
        output.writeUInt32(10, iOLIIMALAGH_);
      }
      if (isPassed_ != false) {
        output.writeBool(12, isPassed_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (weeklyBossResinDiscountInfo_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(5, getWeeklyBossResinDiscountInfo());
      }
      if (dungeonId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, dungeonId_);
      }
      if (aCDENLCGGOG_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(8, aCDENLCGGOG_);
      }
      if (bNOMBDGDKCC_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(9, bNOMBDGDKCC_);
      }
      if (iOLIIMALAGH_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, iOLIIMALAGH_);
      }
      if (isPassed_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(12, isPassed_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.DungeonEntryInfoOuterClass.DungeonEntryInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.DungeonEntryInfoOuterClass.DungeonEntryInfo other = (emu.grasscutter.net.proto.DungeonEntryInfoOuterClass.DungeonEntryInfo) obj;

      if (hasWeeklyBossResinDiscountInfo() != other.hasWeeklyBossResinDiscountInfo()) return false;
      if (hasWeeklyBossResinDiscountInfo()) {
        if (!getWeeklyBossResinDiscountInfo()
            .equals(other.getWeeklyBossResinDiscountInfo())) return false;
      }
      if (getACDENLCGGOG()
          != other.getACDENLCGGOG()) return false;
      if (getIsPassed()
          != other.getIsPassed()) return false;
      if (getDungeonId()
          != other.getDungeonId()) return false;
      if (getIOLIIMALAGH()
          != other.getIOLIIMALAGH()) return false;
      if (getBNOMBDGDKCC()
          != other.getBNOMBDGDKCC()) return false;
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
      if (hasWeeklyBossResinDiscountInfo()) {
        hash = (37 * hash) + WEEKLY_BOSS_RESIN_DISCOUNT_INFO_FIELD_NUMBER;
        hash = (53 * hash) + getWeeklyBossResinDiscountInfo().hashCode();
      }
      hash = (37 * hash) + ACDENLCGGOG_FIELD_NUMBER;
      hash = (53 * hash) + getACDENLCGGOG();
      hash = (37 * hash) + IS_PASSED_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsPassed());
      hash = (37 * hash) + DUNGEON_ID_FIELD_NUMBER;
      hash = (53 * hash) + getDungeonId();
      hash = (37 * hash) + IOLIIMALAGH_FIELD_NUMBER;
      hash = (53 * hash) + getIOLIIMALAGH();
      hash = (37 * hash) + BNOMBDGDKCC_FIELD_NUMBER;
      hash = (53 * hash) + getBNOMBDGDKCC();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.DungeonEntryInfoOuterClass.DungeonEntryInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.DungeonEntryInfoOuterClass.DungeonEntryInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DungeonEntryInfoOuterClass.DungeonEntryInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.DungeonEntryInfoOuterClass.DungeonEntryInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DungeonEntryInfoOuterClass.DungeonEntryInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.DungeonEntryInfoOuterClass.DungeonEntryInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DungeonEntryInfoOuterClass.DungeonEntryInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.DungeonEntryInfoOuterClass.DungeonEntryInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DungeonEntryInfoOuterClass.DungeonEntryInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.DungeonEntryInfoOuterClass.DungeonEntryInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DungeonEntryInfoOuterClass.DungeonEntryInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.DungeonEntryInfoOuterClass.DungeonEntryInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.DungeonEntryInfoOuterClass.DungeonEntryInfo prototype) {
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
     * Protobuf type {@code DungeonEntryInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:DungeonEntryInfo)
        emu.grasscutter.net.proto.DungeonEntryInfoOuterClass.DungeonEntryInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.DungeonEntryInfoOuterClass.internal_static_DungeonEntryInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.DungeonEntryInfoOuterClass.internal_static_DungeonEntryInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.DungeonEntryInfoOuterClass.DungeonEntryInfo.class, emu.grasscutter.net.proto.DungeonEntryInfoOuterClass.DungeonEntryInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.DungeonEntryInfoOuterClass.DungeonEntryInfo.newBuilder()
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
        if (weeklyBossResinDiscountInfoBuilder_ == null) {
          weeklyBossResinDiscountInfo_ = null;
        } else {
          weeklyBossResinDiscountInfo_ = null;
          weeklyBossResinDiscountInfoBuilder_ = null;
        }
        aCDENLCGGOG_ = 0;

        isPassed_ = false;

        dungeonId_ = 0;

        iOLIIMALAGH_ = 0;

        bNOMBDGDKCC_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.DungeonEntryInfoOuterClass.internal_static_DungeonEntryInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.DungeonEntryInfoOuterClass.DungeonEntryInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.DungeonEntryInfoOuterClass.DungeonEntryInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.DungeonEntryInfoOuterClass.DungeonEntryInfo build() {
        emu.grasscutter.net.proto.DungeonEntryInfoOuterClass.DungeonEntryInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.DungeonEntryInfoOuterClass.DungeonEntryInfo buildPartial() {
        emu.grasscutter.net.proto.DungeonEntryInfoOuterClass.DungeonEntryInfo result = new emu.grasscutter.net.proto.DungeonEntryInfoOuterClass.DungeonEntryInfo(this);
        if (weeklyBossResinDiscountInfoBuilder_ == null) {
          result.weeklyBossResinDiscountInfo_ = weeklyBossResinDiscountInfo_;
        } else {
          result.weeklyBossResinDiscountInfo_ = weeklyBossResinDiscountInfoBuilder_.build();
        }
        result.aCDENLCGGOG_ = aCDENLCGGOG_;
        result.isPassed_ = isPassed_;
        result.dungeonId_ = dungeonId_;
        result.iOLIIMALAGH_ = iOLIIMALAGH_;
        result.bNOMBDGDKCC_ = bNOMBDGDKCC_;
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
        if (other instanceof emu.grasscutter.net.proto.DungeonEntryInfoOuterClass.DungeonEntryInfo) {
          return mergeFrom((emu.grasscutter.net.proto.DungeonEntryInfoOuterClass.DungeonEntryInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.DungeonEntryInfoOuterClass.DungeonEntryInfo other) {
        if (other == emu.grasscutter.net.proto.DungeonEntryInfoOuterClass.DungeonEntryInfo.getDefaultInstance()) return this;
        if (other.hasWeeklyBossResinDiscountInfo()) {
          mergeWeeklyBossResinDiscountInfo(other.getWeeklyBossResinDiscountInfo());
        }
        if (other.getACDENLCGGOG() != 0) {
          setACDENLCGGOG(other.getACDENLCGGOG());
        }
        if (other.getIsPassed() != false) {
          setIsPassed(other.getIsPassed());
        }
        if (other.getDungeonId() != 0) {
          setDungeonId(other.getDungeonId());
        }
        if (other.getIOLIIMALAGH() != 0) {
          setIOLIIMALAGH(other.getIOLIIMALAGH());
        }
        if (other.getBNOMBDGDKCC() != 0) {
          setBNOMBDGDKCC(other.getBNOMBDGDKCC());
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
        emu.grasscutter.net.proto.DungeonEntryInfoOuterClass.DungeonEntryInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.DungeonEntryInfoOuterClass.DungeonEntryInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private emu.grasscutter.net.proto.WeeklyBossResinDiscountInfoOuterClass.WeeklyBossResinDiscountInfo weeklyBossResinDiscountInfo_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.WeeklyBossResinDiscountInfoOuterClass.WeeklyBossResinDiscountInfo, emu.grasscutter.net.proto.WeeklyBossResinDiscountInfoOuterClass.WeeklyBossResinDiscountInfo.Builder, emu.grasscutter.net.proto.WeeklyBossResinDiscountInfoOuterClass.WeeklyBossResinDiscountInfoOrBuilder> weeklyBossResinDiscountInfoBuilder_;
      /**
       * <code>.WeeklyBossResinDiscountInfo weekly_boss_resin_discount_info = 5;</code>
       * @return Whether the weeklyBossResinDiscountInfo field is set.
       */
      public boolean hasWeeklyBossResinDiscountInfo() {
        return weeklyBossResinDiscountInfoBuilder_ != null || weeklyBossResinDiscountInfo_ != null;
      }
      /**
       * <code>.WeeklyBossResinDiscountInfo weekly_boss_resin_discount_info = 5;</code>
       * @return The weeklyBossResinDiscountInfo.
       */
      public emu.grasscutter.net.proto.WeeklyBossResinDiscountInfoOuterClass.WeeklyBossResinDiscountInfo getWeeklyBossResinDiscountInfo() {
        if (weeklyBossResinDiscountInfoBuilder_ == null) {
          return weeklyBossResinDiscountInfo_ == null ? emu.grasscutter.net.proto.WeeklyBossResinDiscountInfoOuterClass.WeeklyBossResinDiscountInfo.getDefaultInstance() : weeklyBossResinDiscountInfo_;
        } else {
          return weeklyBossResinDiscountInfoBuilder_.getMessage();
        }
      }
      /**
       * <code>.WeeklyBossResinDiscountInfo weekly_boss_resin_discount_info = 5;</code>
       */
      public Builder setWeeklyBossResinDiscountInfo(emu.grasscutter.net.proto.WeeklyBossResinDiscountInfoOuterClass.WeeklyBossResinDiscountInfo value) {
        if (weeklyBossResinDiscountInfoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          weeklyBossResinDiscountInfo_ = value;
          onChanged();
        } else {
          weeklyBossResinDiscountInfoBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.WeeklyBossResinDiscountInfo weekly_boss_resin_discount_info = 5;</code>
       */
      public Builder setWeeklyBossResinDiscountInfo(
          emu.grasscutter.net.proto.WeeklyBossResinDiscountInfoOuterClass.WeeklyBossResinDiscountInfo.Builder builderForValue) {
        if (weeklyBossResinDiscountInfoBuilder_ == null) {
          weeklyBossResinDiscountInfo_ = builderForValue.build();
          onChanged();
        } else {
          weeklyBossResinDiscountInfoBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.WeeklyBossResinDiscountInfo weekly_boss_resin_discount_info = 5;</code>
       */
      public Builder mergeWeeklyBossResinDiscountInfo(emu.grasscutter.net.proto.WeeklyBossResinDiscountInfoOuterClass.WeeklyBossResinDiscountInfo value) {
        if (weeklyBossResinDiscountInfoBuilder_ == null) {
          if (weeklyBossResinDiscountInfo_ != null) {
            weeklyBossResinDiscountInfo_ =
              emu.grasscutter.net.proto.WeeklyBossResinDiscountInfoOuterClass.WeeklyBossResinDiscountInfo.newBuilder(weeklyBossResinDiscountInfo_).mergeFrom(value).buildPartial();
          } else {
            weeklyBossResinDiscountInfo_ = value;
          }
          onChanged();
        } else {
          weeklyBossResinDiscountInfoBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.WeeklyBossResinDiscountInfo weekly_boss_resin_discount_info = 5;</code>
       */
      public Builder clearWeeklyBossResinDiscountInfo() {
        if (weeklyBossResinDiscountInfoBuilder_ == null) {
          weeklyBossResinDiscountInfo_ = null;
          onChanged();
        } else {
          weeklyBossResinDiscountInfo_ = null;
          weeklyBossResinDiscountInfoBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.WeeklyBossResinDiscountInfo weekly_boss_resin_discount_info = 5;</code>
       */
      public emu.grasscutter.net.proto.WeeklyBossResinDiscountInfoOuterClass.WeeklyBossResinDiscountInfo.Builder getWeeklyBossResinDiscountInfoBuilder() {
        
        onChanged();
        return getWeeklyBossResinDiscountInfoFieldBuilder().getBuilder();
      }
      /**
       * <code>.WeeklyBossResinDiscountInfo weekly_boss_resin_discount_info = 5;</code>
       */
      public emu.grasscutter.net.proto.WeeklyBossResinDiscountInfoOuterClass.WeeklyBossResinDiscountInfoOrBuilder getWeeklyBossResinDiscountInfoOrBuilder() {
        if (weeklyBossResinDiscountInfoBuilder_ != null) {
          return weeklyBossResinDiscountInfoBuilder_.getMessageOrBuilder();
        } else {
          return weeklyBossResinDiscountInfo_ == null ?
              emu.grasscutter.net.proto.WeeklyBossResinDiscountInfoOuterClass.WeeklyBossResinDiscountInfo.getDefaultInstance() : weeklyBossResinDiscountInfo_;
        }
      }
      /**
       * <code>.WeeklyBossResinDiscountInfo weekly_boss_resin_discount_info = 5;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.WeeklyBossResinDiscountInfoOuterClass.WeeklyBossResinDiscountInfo, emu.grasscutter.net.proto.WeeklyBossResinDiscountInfoOuterClass.WeeklyBossResinDiscountInfo.Builder, emu.grasscutter.net.proto.WeeklyBossResinDiscountInfoOuterClass.WeeklyBossResinDiscountInfoOrBuilder> 
          getWeeklyBossResinDiscountInfoFieldBuilder() {
        if (weeklyBossResinDiscountInfoBuilder_ == null) {
          weeklyBossResinDiscountInfoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.WeeklyBossResinDiscountInfoOuterClass.WeeklyBossResinDiscountInfo, emu.grasscutter.net.proto.WeeklyBossResinDiscountInfoOuterClass.WeeklyBossResinDiscountInfo.Builder, emu.grasscutter.net.proto.WeeklyBossResinDiscountInfoOuterClass.WeeklyBossResinDiscountInfoOrBuilder>(
                  getWeeklyBossResinDiscountInfo(),
                  getParentForChildren(),
                  isClean());
          weeklyBossResinDiscountInfo_ = null;
        }
        return weeklyBossResinDiscountInfoBuilder_;
      }

      private int aCDENLCGGOG_ ;
      /**
       * <code>uint32 ACDENLCGGOG = 8;</code>
       * @return The aCDENLCGGOG.
       */
      @java.lang.Override
      public int getACDENLCGGOG() {
        return aCDENLCGGOG_;
      }
      /**
       * <code>uint32 ACDENLCGGOG = 8;</code>
       * @param value The aCDENLCGGOG to set.
       * @return This builder for chaining.
       */
      public Builder setACDENLCGGOG(int value) {
        
        aCDENLCGGOG_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 ACDENLCGGOG = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearACDENLCGGOG() {
        
        aCDENLCGGOG_ = 0;
        onChanged();
        return this;
      }

      private boolean isPassed_ ;
      /**
       * <code>bool is_passed = 12;</code>
       * @return The isPassed.
       */
      @java.lang.Override
      public boolean getIsPassed() {
        return isPassed_;
      }
      /**
       * <code>bool is_passed = 12;</code>
       * @param value The isPassed to set.
       * @return This builder for chaining.
       */
      public Builder setIsPassed(boolean value) {
        
        isPassed_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_passed = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsPassed() {
        
        isPassed_ = false;
        onChanged();
        return this;
      }

      private int dungeonId_ ;
      /**
       * <code>uint32 dungeon_id = 7;</code>
       * @return The dungeonId.
       */
      @java.lang.Override
      public int getDungeonId() {
        return dungeonId_;
      }
      /**
       * <code>uint32 dungeon_id = 7;</code>
       * @param value The dungeonId to set.
       * @return This builder for chaining.
       */
      public Builder setDungeonId(int value) {
        
        dungeonId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 dungeon_id = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearDungeonId() {
        
        dungeonId_ = 0;
        onChanged();
        return this;
      }

      private int iOLIIMALAGH_ ;
      /**
       * <code>uint32 IOLIIMALAGH = 10;</code>
       * @return The iOLIIMALAGH.
       */
      @java.lang.Override
      public int getIOLIIMALAGH() {
        return iOLIIMALAGH_;
      }
      /**
       * <code>uint32 IOLIIMALAGH = 10;</code>
       * @param value The iOLIIMALAGH to set.
       * @return This builder for chaining.
       */
      public Builder setIOLIIMALAGH(int value) {
        
        iOLIIMALAGH_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 IOLIIMALAGH = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearIOLIIMALAGH() {
        
        iOLIIMALAGH_ = 0;
        onChanged();
        return this;
      }

      private int bNOMBDGDKCC_ ;
      /**
       * <code>uint32 BNOMBDGDKCC = 9;</code>
       * @return The bNOMBDGDKCC.
       */
      @java.lang.Override
      public int getBNOMBDGDKCC() {
        return bNOMBDGDKCC_;
      }
      /**
       * <code>uint32 BNOMBDGDKCC = 9;</code>
       * @param value The bNOMBDGDKCC to set.
       * @return This builder for chaining.
       */
      public Builder setBNOMBDGDKCC(int value) {
        
        bNOMBDGDKCC_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 BNOMBDGDKCC = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearBNOMBDGDKCC() {
        
        bNOMBDGDKCC_ = 0;
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


      // @@protoc_insertion_point(builder_scope:DungeonEntryInfo)
    }

    // @@protoc_insertion_point(class_scope:DungeonEntryInfo)
    private static final emu.grasscutter.net.proto.DungeonEntryInfoOuterClass.DungeonEntryInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.DungeonEntryInfoOuterClass.DungeonEntryInfo();
    }

    public static emu.grasscutter.net.proto.DungeonEntryInfoOuterClass.DungeonEntryInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<DungeonEntryInfo>
        PARSER = new com.google.protobuf.AbstractParser<DungeonEntryInfo>() {
      @java.lang.Override
      public DungeonEntryInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new DungeonEntryInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<DungeonEntryInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<DungeonEntryInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.DungeonEntryInfoOuterClass.DungeonEntryInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_DungeonEntryInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_DungeonEntryInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026DungeonEntryInfo.proto\032!WeeklyBossResi" +
      "nDiscountInfo.proto\"\277\001\n\020DungeonEntryInfo" +
      "\022E\n\037weekly_boss_resin_discount_info\030\005 \001(" +
      "\0132\034.WeeklyBossResinDiscountInfo\022\023\n\013ACDEN" +
      "LCGGOG\030\010 \001(\r\022\021\n\tis_passed\030\014 \001(\010\022\022\n\ndunge" +
      "on_id\030\007 \001(\r\022\023\n\013IOLIIMALAGH\030\n \001(\r\022\023\n\013BNOM" +
      "BDGDKCC\030\t \001(\rB\033\n\031emu.grasscutter.net.pro" +
      "tob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.WeeklyBossResinDiscountInfoOuterClass.getDescriptor(),
        });
    internal_static_DungeonEntryInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_DungeonEntryInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_DungeonEntryInfo_descriptor,
        new java.lang.String[] { "WeeklyBossResinDiscountInfo", "ACDENLCGGOG", "IsPassed", "DungeonId", "IOLIIMALAGH", "BNOMBDGDKCC", });
    emu.grasscutter.net.proto.WeeklyBossResinDiscountInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
