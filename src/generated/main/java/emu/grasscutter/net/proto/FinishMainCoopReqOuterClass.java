// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: FinishMainCoopReq.proto

package emu.grasscutter.net.proto;

public final class FinishMainCoopReqOuterClass {
  private FinishMainCoopReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface FinishMainCoopReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:FinishMainCoopReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 ending_save_point_id = 5;</code>
     * @return The endingSavePointId.
     */
    int getEndingSavePointId();

    /**
     * <code>uint32 id = 3;</code>
     * @return The id.
     */
    int getId();
  }
  /**
   * <pre>
   * CmdId: 20482
   * Obf: BCKINDNDCCJ
   * </pre>
   *
   * Protobuf type {@code FinishMainCoopReq}
   */
  public static final class FinishMainCoopReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:FinishMainCoopReq)
      FinishMainCoopReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use FinishMainCoopReq.newBuilder() to construct.
    private FinishMainCoopReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private FinishMainCoopReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new FinishMainCoopReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private FinishMainCoopReq(
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
            case 24: {

              id_ = input.readUInt32();
              break;
            }
            case 40: {

              endingSavePointId_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.FinishMainCoopReqOuterClass.internal_static_FinishMainCoopReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.FinishMainCoopReqOuterClass.internal_static_FinishMainCoopReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.FinishMainCoopReqOuterClass.FinishMainCoopReq.class, emu.grasscutter.net.proto.FinishMainCoopReqOuterClass.FinishMainCoopReq.Builder.class);
    }

    public static final int ENDING_SAVE_POINT_ID_FIELD_NUMBER = 5;
    private int endingSavePointId_;
    /**
     * <code>uint32 ending_save_point_id = 5;</code>
     * @return The endingSavePointId.
     */
    @java.lang.Override
    public int getEndingSavePointId() {
      return endingSavePointId_;
    }

    public static final int ID_FIELD_NUMBER = 3;
    private int id_;
    /**
     * <code>uint32 id = 3;</code>
     * @return The id.
     */
    @java.lang.Override
    public int getId() {
      return id_;
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
      if (id_ != 0) {
        output.writeUInt32(3, id_);
      }
      if (endingSavePointId_ != 0) {
        output.writeUInt32(5, endingSavePointId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (id_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, id_);
      }
      if (endingSavePointId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, endingSavePointId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.FinishMainCoopReqOuterClass.FinishMainCoopReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.FinishMainCoopReqOuterClass.FinishMainCoopReq other = (emu.grasscutter.net.proto.FinishMainCoopReqOuterClass.FinishMainCoopReq) obj;

      if (getEndingSavePointId()
          != other.getEndingSavePointId()) return false;
      if (getId()
          != other.getId()) return false;
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
      hash = (37 * hash) + ENDING_SAVE_POINT_ID_FIELD_NUMBER;
      hash = (53 * hash) + getEndingSavePointId();
      hash = (37 * hash) + ID_FIELD_NUMBER;
      hash = (53 * hash) + getId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.FinishMainCoopReqOuterClass.FinishMainCoopReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.FinishMainCoopReqOuterClass.FinishMainCoopReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FinishMainCoopReqOuterClass.FinishMainCoopReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.FinishMainCoopReqOuterClass.FinishMainCoopReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FinishMainCoopReqOuterClass.FinishMainCoopReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.FinishMainCoopReqOuterClass.FinishMainCoopReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FinishMainCoopReqOuterClass.FinishMainCoopReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.FinishMainCoopReqOuterClass.FinishMainCoopReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FinishMainCoopReqOuterClass.FinishMainCoopReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.FinishMainCoopReqOuterClass.FinishMainCoopReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FinishMainCoopReqOuterClass.FinishMainCoopReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.FinishMainCoopReqOuterClass.FinishMainCoopReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.FinishMainCoopReqOuterClass.FinishMainCoopReq prototype) {
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
     * <pre>
     * CmdId: 20482
     * Obf: BCKINDNDCCJ
     * </pre>
     *
     * Protobuf type {@code FinishMainCoopReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:FinishMainCoopReq)
        emu.grasscutter.net.proto.FinishMainCoopReqOuterClass.FinishMainCoopReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.FinishMainCoopReqOuterClass.internal_static_FinishMainCoopReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.FinishMainCoopReqOuterClass.internal_static_FinishMainCoopReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.FinishMainCoopReqOuterClass.FinishMainCoopReq.class, emu.grasscutter.net.proto.FinishMainCoopReqOuterClass.FinishMainCoopReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.FinishMainCoopReqOuterClass.FinishMainCoopReq.newBuilder()
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
        endingSavePointId_ = 0;

        id_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.FinishMainCoopReqOuterClass.internal_static_FinishMainCoopReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.FinishMainCoopReqOuterClass.FinishMainCoopReq getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.FinishMainCoopReqOuterClass.FinishMainCoopReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.FinishMainCoopReqOuterClass.FinishMainCoopReq build() {
        emu.grasscutter.net.proto.FinishMainCoopReqOuterClass.FinishMainCoopReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.FinishMainCoopReqOuterClass.FinishMainCoopReq buildPartial() {
        emu.grasscutter.net.proto.FinishMainCoopReqOuterClass.FinishMainCoopReq result = new emu.grasscutter.net.proto.FinishMainCoopReqOuterClass.FinishMainCoopReq(this);
        result.endingSavePointId_ = endingSavePointId_;
        result.id_ = id_;
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
        if (other instanceof emu.grasscutter.net.proto.FinishMainCoopReqOuterClass.FinishMainCoopReq) {
          return mergeFrom((emu.grasscutter.net.proto.FinishMainCoopReqOuterClass.FinishMainCoopReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.FinishMainCoopReqOuterClass.FinishMainCoopReq other) {
        if (other == emu.grasscutter.net.proto.FinishMainCoopReqOuterClass.FinishMainCoopReq.getDefaultInstance()) return this;
        if (other.getEndingSavePointId() != 0) {
          setEndingSavePointId(other.getEndingSavePointId());
        }
        if (other.getId() != 0) {
          setId(other.getId());
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
        emu.grasscutter.net.proto.FinishMainCoopReqOuterClass.FinishMainCoopReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.FinishMainCoopReqOuterClass.FinishMainCoopReq) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int endingSavePointId_ ;
      /**
       * <code>uint32 ending_save_point_id = 5;</code>
       * @return The endingSavePointId.
       */
      @java.lang.Override
      public int getEndingSavePointId() {
        return endingSavePointId_;
      }
      /**
       * <code>uint32 ending_save_point_id = 5;</code>
       * @param value The endingSavePointId to set.
       * @return This builder for chaining.
       */
      public Builder setEndingSavePointId(int value) {
        
        endingSavePointId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 ending_save_point_id = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearEndingSavePointId() {
        
        endingSavePointId_ = 0;
        onChanged();
        return this;
      }

      private int id_ ;
      /**
       * <code>uint32 id = 3;</code>
       * @return The id.
       */
      @java.lang.Override
      public int getId() {
        return id_;
      }
      /**
       * <code>uint32 id = 3;</code>
       * @param value The id to set.
       * @return This builder for chaining.
       */
      public Builder setId(int value) {
        
        id_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 id = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearId() {
        
        id_ = 0;
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


      // @@protoc_insertion_point(builder_scope:FinishMainCoopReq)
    }

    // @@protoc_insertion_point(class_scope:FinishMainCoopReq)
    private static final emu.grasscutter.net.proto.FinishMainCoopReqOuterClass.FinishMainCoopReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.FinishMainCoopReqOuterClass.FinishMainCoopReq();
    }

    public static emu.grasscutter.net.proto.FinishMainCoopReqOuterClass.FinishMainCoopReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<FinishMainCoopReq>
        PARSER = new com.google.protobuf.AbstractParser<FinishMainCoopReq>() {
      @java.lang.Override
      public FinishMainCoopReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new FinishMainCoopReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<FinishMainCoopReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<FinishMainCoopReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.FinishMainCoopReqOuterClass.FinishMainCoopReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_FinishMainCoopReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_FinishMainCoopReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027FinishMainCoopReq.proto\"=\n\021FinishMainC" +
      "oopReq\022\034\n\024ending_save_point_id\030\005 \001(\r\022\n\n\002" +
      "id\030\003 \001(\rB\033\n\031emu.grasscutter.net.protob\006p" +
      "roto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_FinishMainCoopReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_FinishMainCoopReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_FinishMainCoopReq_descriptor,
        new java.lang.String[] { "EndingSavePointId", "Id", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
