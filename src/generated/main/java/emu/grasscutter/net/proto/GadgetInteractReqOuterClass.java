// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GadgetInteractReq.proto

package emu.grasscutter.net.proto;

public final class GadgetInteractReqOuterClass {
  private GadgetInteractReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GadgetInteractReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GadgetInteractReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 ui_interact_id = 13;</code>
     * @return The uiInteractId.
     */
    int getUiInteractId();

    /**
     * <code>uint32 gadget_entity_id = 1;</code>
     * @return The gadgetEntityId.
     */
    int getGadgetEntityId();

    /**
     * <code>.ResinCostType resin_cost_type = 5;</code>
     * @return The enum numeric value on the wire for resinCostType.
     */
    int getResinCostTypeValue();
    /**
     * <code>.ResinCostType resin_cost_type = 5;</code>
     * @return The resinCostType.
     */
    emu.grasscutter.net.proto.ResinCostTypeOuterClass.ResinCostType getResinCostType();

    /**
     * <code>.InterOpType op_type = 7;</code>
     * @return The enum numeric value on the wire for opType.
     */
    int getOpTypeValue();
    /**
     * <code>.InterOpType op_type = 7;</code>
     * @return The opType.
     */
    emu.grasscutter.net.proto.InterOpTypeOuterClass.InterOpType getOpType();

    /**
     * <code>uint32 gadget_id = 2;</code>
     * @return The gadgetId.
     */
    int getGadgetId();

    /**
     * <code>bool is_use_condense_resin = 4;</code>
     * @return The isUseCondenseResin.
     */
    boolean getIsUseCondenseResin();
  }
  /**
   * Protobuf type {@code GadgetInteractReq}
   */
  public static final class GadgetInteractReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GadgetInteractReq)
      GadgetInteractReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GadgetInteractReq.newBuilder() to construct.
    private GadgetInteractReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GadgetInteractReq() {
      resinCostType_ = 0;
      opType_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GadgetInteractReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GadgetInteractReq(
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

              gadgetEntityId_ = input.readUInt32();
              break;
            }
            case 16: {

              gadgetId_ = input.readUInt32();
              break;
            }
            case 32: {

              isUseCondenseResin_ = input.readBool();
              break;
            }
            case 40: {
              int rawValue = input.readEnum();

              resinCostType_ = rawValue;
              break;
            }
            case 56: {
              int rawValue = input.readEnum();

              opType_ = rawValue;
              break;
            }
            case 104: {

              uiInteractId_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.GadgetInteractReqOuterClass.internal_static_GadgetInteractReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.GadgetInteractReqOuterClass.internal_static_GadgetInteractReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.GadgetInteractReqOuterClass.GadgetInteractReq.class, emu.grasscutter.net.proto.GadgetInteractReqOuterClass.GadgetInteractReq.Builder.class);
    }

    public static final int UI_INTERACT_ID_FIELD_NUMBER = 13;
    private int uiInteractId_;
    /**
     * <code>uint32 ui_interact_id = 13;</code>
     * @return The uiInteractId.
     */
    @java.lang.Override
    public int getUiInteractId() {
      return uiInteractId_;
    }

    public static final int GADGET_ENTITY_ID_FIELD_NUMBER = 1;
    private int gadgetEntityId_;
    /**
     * <code>uint32 gadget_entity_id = 1;</code>
     * @return The gadgetEntityId.
     */
    @java.lang.Override
    public int getGadgetEntityId() {
      return gadgetEntityId_;
    }

    public static final int RESIN_COST_TYPE_FIELD_NUMBER = 5;
    private int resinCostType_;
    /**
     * <code>.ResinCostType resin_cost_type = 5;</code>
     * @return The enum numeric value on the wire for resinCostType.
     */
    @java.lang.Override public int getResinCostTypeValue() {
      return resinCostType_;
    }
    /**
     * <code>.ResinCostType resin_cost_type = 5;</code>
     * @return The resinCostType.
     */
    @java.lang.Override public emu.grasscutter.net.proto.ResinCostTypeOuterClass.ResinCostType getResinCostType() {
      @SuppressWarnings("deprecation")
      emu.grasscutter.net.proto.ResinCostTypeOuterClass.ResinCostType result = emu.grasscutter.net.proto.ResinCostTypeOuterClass.ResinCostType.valueOf(resinCostType_);
      return result == null ? emu.grasscutter.net.proto.ResinCostTypeOuterClass.ResinCostType.UNRECOGNIZED : result;
    }

    public static final int OP_TYPE_FIELD_NUMBER = 7;
    private int opType_;
    /**
     * <code>.InterOpType op_type = 7;</code>
     * @return The enum numeric value on the wire for opType.
     */
    @java.lang.Override public int getOpTypeValue() {
      return opType_;
    }
    /**
     * <code>.InterOpType op_type = 7;</code>
     * @return The opType.
     */
    @java.lang.Override public emu.grasscutter.net.proto.InterOpTypeOuterClass.InterOpType getOpType() {
      @SuppressWarnings("deprecation")
      emu.grasscutter.net.proto.InterOpTypeOuterClass.InterOpType result = emu.grasscutter.net.proto.InterOpTypeOuterClass.InterOpType.valueOf(opType_);
      return result == null ? emu.grasscutter.net.proto.InterOpTypeOuterClass.InterOpType.UNRECOGNIZED : result;
    }

    public static final int GADGET_ID_FIELD_NUMBER = 2;
    private int gadgetId_;
    /**
     * <code>uint32 gadget_id = 2;</code>
     * @return The gadgetId.
     */
    @java.lang.Override
    public int getGadgetId() {
      return gadgetId_;
    }

    public static final int IS_USE_CONDENSE_RESIN_FIELD_NUMBER = 4;
    private boolean isUseCondenseResin_;
    /**
     * <code>bool is_use_condense_resin = 4;</code>
     * @return The isUseCondenseResin.
     */
    @java.lang.Override
    public boolean getIsUseCondenseResin() {
      return isUseCondenseResin_;
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
      if (gadgetEntityId_ != 0) {
        output.writeUInt32(1, gadgetEntityId_);
      }
      if (gadgetId_ != 0) {
        output.writeUInt32(2, gadgetId_);
      }
      if (isUseCondenseResin_ != false) {
        output.writeBool(4, isUseCondenseResin_);
      }
      if (resinCostType_ != emu.grasscutter.net.proto.ResinCostTypeOuterClass.ResinCostType.RESIN_COST_TYPE_NONE.getNumber()) {
        output.writeEnum(5, resinCostType_);
      }
      if (opType_ != emu.grasscutter.net.proto.InterOpTypeOuterClass.InterOpType.INTER_OP_TYPE_FINISH.getNumber()) {
        output.writeEnum(7, opType_);
      }
      if (uiInteractId_ != 0) {
        output.writeUInt32(13, uiInteractId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (gadgetEntityId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, gadgetEntityId_);
      }
      if (gadgetId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, gadgetId_);
      }
      if (isUseCondenseResin_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(4, isUseCondenseResin_);
      }
      if (resinCostType_ != emu.grasscutter.net.proto.ResinCostTypeOuterClass.ResinCostType.RESIN_COST_TYPE_NONE.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(5, resinCostType_);
      }
      if (opType_ != emu.grasscutter.net.proto.InterOpTypeOuterClass.InterOpType.INTER_OP_TYPE_FINISH.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(7, opType_);
      }
      if (uiInteractId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, uiInteractId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.GadgetInteractReqOuterClass.GadgetInteractReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.GadgetInteractReqOuterClass.GadgetInteractReq other = (emu.grasscutter.net.proto.GadgetInteractReqOuterClass.GadgetInteractReq) obj;

      if (getUiInteractId()
          != other.getUiInteractId()) return false;
      if (getGadgetEntityId()
          != other.getGadgetEntityId()) return false;
      if (resinCostType_ != other.resinCostType_) return false;
      if (opType_ != other.opType_) return false;
      if (getGadgetId()
          != other.getGadgetId()) return false;
      if (getIsUseCondenseResin()
          != other.getIsUseCondenseResin()) return false;
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
      hash = (37 * hash) + UI_INTERACT_ID_FIELD_NUMBER;
      hash = (53 * hash) + getUiInteractId();
      hash = (37 * hash) + GADGET_ENTITY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getGadgetEntityId();
      hash = (37 * hash) + RESIN_COST_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + resinCostType_;
      hash = (37 * hash) + OP_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + opType_;
      hash = (37 * hash) + GADGET_ID_FIELD_NUMBER;
      hash = (53 * hash) + getGadgetId();
      hash = (37 * hash) + IS_USE_CONDENSE_RESIN_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsUseCondenseResin());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.GadgetInteractReqOuterClass.GadgetInteractReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GadgetInteractReqOuterClass.GadgetInteractReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GadgetInteractReqOuterClass.GadgetInteractReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GadgetInteractReqOuterClass.GadgetInteractReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GadgetInteractReqOuterClass.GadgetInteractReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GadgetInteractReqOuterClass.GadgetInteractReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GadgetInteractReqOuterClass.GadgetInteractReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GadgetInteractReqOuterClass.GadgetInteractReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GadgetInteractReqOuterClass.GadgetInteractReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GadgetInteractReqOuterClass.GadgetInteractReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GadgetInteractReqOuterClass.GadgetInteractReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GadgetInteractReqOuterClass.GadgetInteractReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.GadgetInteractReqOuterClass.GadgetInteractReq prototype) {
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
     * Protobuf type {@code GadgetInteractReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GadgetInteractReq)
        emu.grasscutter.net.proto.GadgetInteractReqOuterClass.GadgetInteractReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.GadgetInteractReqOuterClass.internal_static_GadgetInteractReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.GadgetInteractReqOuterClass.internal_static_GadgetInteractReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.GadgetInteractReqOuterClass.GadgetInteractReq.class, emu.grasscutter.net.proto.GadgetInteractReqOuterClass.GadgetInteractReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.GadgetInteractReqOuterClass.GadgetInteractReq.newBuilder()
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
        uiInteractId_ = 0;

        gadgetEntityId_ = 0;

        resinCostType_ = 0;

        opType_ = 0;

        gadgetId_ = 0;

        isUseCondenseResin_ = false;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.GadgetInteractReqOuterClass.internal_static_GadgetInteractReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GadgetInteractReqOuterClass.GadgetInteractReq getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.GadgetInteractReqOuterClass.GadgetInteractReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GadgetInteractReqOuterClass.GadgetInteractReq build() {
        emu.grasscutter.net.proto.GadgetInteractReqOuterClass.GadgetInteractReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GadgetInteractReqOuterClass.GadgetInteractReq buildPartial() {
        emu.grasscutter.net.proto.GadgetInteractReqOuterClass.GadgetInteractReq result = new emu.grasscutter.net.proto.GadgetInteractReqOuterClass.GadgetInteractReq(this);
        result.uiInteractId_ = uiInteractId_;
        result.gadgetEntityId_ = gadgetEntityId_;
        result.resinCostType_ = resinCostType_;
        result.opType_ = opType_;
        result.gadgetId_ = gadgetId_;
        result.isUseCondenseResin_ = isUseCondenseResin_;
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
        if (other instanceof emu.grasscutter.net.proto.GadgetInteractReqOuterClass.GadgetInteractReq) {
          return mergeFrom((emu.grasscutter.net.proto.GadgetInteractReqOuterClass.GadgetInteractReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.GadgetInteractReqOuterClass.GadgetInteractReq other) {
        if (other == emu.grasscutter.net.proto.GadgetInteractReqOuterClass.GadgetInteractReq.getDefaultInstance()) return this;
        if (other.getUiInteractId() != 0) {
          setUiInteractId(other.getUiInteractId());
        }
        if (other.getGadgetEntityId() != 0) {
          setGadgetEntityId(other.getGadgetEntityId());
        }
        if (other.resinCostType_ != 0) {
          setResinCostTypeValue(other.getResinCostTypeValue());
        }
        if (other.opType_ != 0) {
          setOpTypeValue(other.getOpTypeValue());
        }
        if (other.getGadgetId() != 0) {
          setGadgetId(other.getGadgetId());
        }
        if (other.getIsUseCondenseResin() != false) {
          setIsUseCondenseResin(other.getIsUseCondenseResin());
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
        emu.grasscutter.net.proto.GadgetInteractReqOuterClass.GadgetInteractReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.GadgetInteractReqOuterClass.GadgetInteractReq) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int uiInteractId_ ;
      /**
       * <code>uint32 ui_interact_id = 13;</code>
       * @return The uiInteractId.
       */
      @java.lang.Override
      public int getUiInteractId() {
        return uiInteractId_;
      }
      /**
       * <code>uint32 ui_interact_id = 13;</code>
       * @param value The uiInteractId to set.
       * @return This builder for chaining.
       */
      public Builder setUiInteractId(int value) {
        
        uiInteractId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 ui_interact_id = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearUiInteractId() {
        
        uiInteractId_ = 0;
        onChanged();
        return this;
      }

      private int gadgetEntityId_ ;
      /**
       * <code>uint32 gadget_entity_id = 1;</code>
       * @return The gadgetEntityId.
       */
      @java.lang.Override
      public int getGadgetEntityId() {
        return gadgetEntityId_;
      }
      /**
       * <code>uint32 gadget_entity_id = 1;</code>
       * @param value The gadgetEntityId to set.
       * @return This builder for chaining.
       */
      public Builder setGadgetEntityId(int value) {
        
        gadgetEntityId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 gadget_entity_id = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearGadgetEntityId() {
        
        gadgetEntityId_ = 0;
        onChanged();
        return this;
      }

      private int resinCostType_ = 0;
      /**
       * <code>.ResinCostType resin_cost_type = 5;</code>
       * @return The enum numeric value on the wire for resinCostType.
       */
      @java.lang.Override public int getResinCostTypeValue() {
        return resinCostType_;
      }
      /**
       * <code>.ResinCostType resin_cost_type = 5;</code>
       * @param value The enum numeric value on the wire for resinCostType to set.
       * @return This builder for chaining.
       */
      public Builder setResinCostTypeValue(int value) {
        
        resinCostType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.ResinCostType resin_cost_type = 5;</code>
       * @return The resinCostType.
       */
      @java.lang.Override
      public emu.grasscutter.net.proto.ResinCostTypeOuterClass.ResinCostType getResinCostType() {
        @SuppressWarnings("deprecation")
        emu.grasscutter.net.proto.ResinCostTypeOuterClass.ResinCostType result = emu.grasscutter.net.proto.ResinCostTypeOuterClass.ResinCostType.valueOf(resinCostType_);
        return result == null ? emu.grasscutter.net.proto.ResinCostTypeOuterClass.ResinCostType.UNRECOGNIZED : result;
      }
      /**
       * <code>.ResinCostType resin_cost_type = 5;</code>
       * @param value The resinCostType to set.
       * @return This builder for chaining.
       */
      public Builder setResinCostType(emu.grasscutter.net.proto.ResinCostTypeOuterClass.ResinCostType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        resinCostType_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.ResinCostType resin_cost_type = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearResinCostType() {
        
        resinCostType_ = 0;
        onChanged();
        return this;
      }

      private int opType_ = 0;
      /**
       * <code>.InterOpType op_type = 7;</code>
       * @return The enum numeric value on the wire for opType.
       */
      @java.lang.Override public int getOpTypeValue() {
        return opType_;
      }
      /**
       * <code>.InterOpType op_type = 7;</code>
       * @param value The enum numeric value on the wire for opType to set.
       * @return This builder for chaining.
       */
      public Builder setOpTypeValue(int value) {
        
        opType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.InterOpType op_type = 7;</code>
       * @return The opType.
       */
      @java.lang.Override
      public emu.grasscutter.net.proto.InterOpTypeOuterClass.InterOpType getOpType() {
        @SuppressWarnings("deprecation")
        emu.grasscutter.net.proto.InterOpTypeOuterClass.InterOpType result = emu.grasscutter.net.proto.InterOpTypeOuterClass.InterOpType.valueOf(opType_);
        return result == null ? emu.grasscutter.net.proto.InterOpTypeOuterClass.InterOpType.UNRECOGNIZED : result;
      }
      /**
       * <code>.InterOpType op_type = 7;</code>
       * @param value The opType to set.
       * @return This builder for chaining.
       */
      public Builder setOpType(emu.grasscutter.net.proto.InterOpTypeOuterClass.InterOpType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        opType_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.InterOpType op_type = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearOpType() {
        
        opType_ = 0;
        onChanged();
        return this;
      }

      private int gadgetId_ ;
      /**
       * <code>uint32 gadget_id = 2;</code>
       * @return The gadgetId.
       */
      @java.lang.Override
      public int getGadgetId() {
        return gadgetId_;
      }
      /**
       * <code>uint32 gadget_id = 2;</code>
       * @param value The gadgetId to set.
       * @return This builder for chaining.
       */
      public Builder setGadgetId(int value) {
        
        gadgetId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 gadget_id = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearGadgetId() {
        
        gadgetId_ = 0;
        onChanged();
        return this;
      }

      private boolean isUseCondenseResin_ ;
      /**
       * <code>bool is_use_condense_resin = 4;</code>
       * @return The isUseCondenseResin.
       */
      @java.lang.Override
      public boolean getIsUseCondenseResin() {
        return isUseCondenseResin_;
      }
      /**
       * <code>bool is_use_condense_resin = 4;</code>
       * @param value The isUseCondenseResin to set.
       * @return This builder for chaining.
       */
      public Builder setIsUseCondenseResin(boolean value) {
        
        isUseCondenseResin_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_use_condense_resin = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsUseCondenseResin() {
        
        isUseCondenseResin_ = false;
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


      // @@protoc_insertion_point(builder_scope:GadgetInteractReq)
    }

    // @@protoc_insertion_point(class_scope:GadgetInteractReq)
    private static final emu.grasscutter.net.proto.GadgetInteractReqOuterClass.GadgetInteractReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.GadgetInteractReqOuterClass.GadgetInteractReq();
    }

    public static emu.grasscutter.net.proto.GadgetInteractReqOuterClass.GadgetInteractReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GadgetInteractReq>
        PARSER = new com.google.protobuf.AbstractParser<GadgetInteractReq>() {
      @java.lang.Override
      public GadgetInteractReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GadgetInteractReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<GadgetInteractReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GadgetInteractReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.GadgetInteractReqOuterClass.GadgetInteractReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GadgetInteractReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GadgetInteractReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027GadgetInteractReq.proto\032\023ResinCostType" +
      ".proto\032\021InterOpType.proto\"\277\001\n\021GadgetInte" +
      "ractReq\022\026\n\016ui_interact_id\030\r \001(\r\022\030\n\020gadge" +
      "t_entity_id\030\001 \001(\r\022\'\n\017resin_cost_type\030\005 \001" +
      "(\0162\016.ResinCostType\022\035\n\007op_type\030\007 \001(\0162\014.In" +
      "terOpType\022\021\n\tgadget_id\030\002 \001(\r\022\035\n\025is_use_c" +
      "ondense_resin\030\004 \001(\010B\033\n\031emu.grasscutter.n" +
      "et.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.ResinCostTypeOuterClass.getDescriptor(),
          emu.grasscutter.net.proto.InterOpTypeOuterClass.getDescriptor(),
        });
    internal_static_GadgetInteractReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GadgetInteractReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GadgetInteractReq_descriptor,
        new java.lang.String[] { "UiInteractId", "GadgetEntityId", "ResinCostType", "OpType", "GadgetId", "IsUseCondenseResin", });
    emu.grasscutter.net.proto.ResinCostTypeOuterClass.getDescriptor();
    emu.grasscutter.net.proto.InterOpTypeOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
