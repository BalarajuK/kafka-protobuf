// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: src/main/resources/protobuf/stock_price.proto

// Protobuf Java Version: 3.25.1
package com.kadukuntla.KafkaProtobuf.protobuf;

public final class StockPriceOuterClass {
  private StockPriceOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface StockPriceOrBuilder extends
      // @@protoc_insertion_point(interface_extends:com.kadukuntla.KafkaProtobuf.protobuf.StockPrice)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string name = 1;</code>
     * @return The name.
     */
    java.lang.String getName();
    /**
     * <code>string name = 1;</code>
     * @return The bytes for name.
     */
    com.google.protobuf.ByteString
        getNameBytes();

    /**
     * <code>string instrument_token = 2;</code>
     * @return The instrumentToken.
     */
    java.lang.String getInstrumentToken();
    /**
     * <code>string instrument_token = 2;</code>
     * @return The bytes for instrumentToken.
     */
    com.google.protobuf.ByteString
        getInstrumentTokenBytes();

    /**
     * <code>double last_price = 3;</code>
     * @return The lastPrice.
     */
    double getLastPrice();
  }
  /**
   * <pre>
   *Example : {'NSE:RELIANCE': {'instrument_token': 738561, 'last_price': 2565.05}}
   * </pre>
   *
   * Protobuf type {@code com.kadukuntla.KafkaProtobuf.protobuf.StockPrice}
   */
  public static final class StockPrice extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:com.kadukuntla.KafkaProtobuf.protobuf.StockPrice)
      StockPriceOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use StockPrice.newBuilder() to construct.
    private StockPrice(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private StockPrice() {
      name_ = "";
      instrumentToken_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new StockPrice();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.kadukuntla.KafkaProtobuf.protobuf.StockPriceOuterClass.internal_static_com_kadukuntla_KafkaProtobuf_protobuf_StockPrice_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.kadukuntla.KafkaProtobuf.protobuf.StockPriceOuterClass.internal_static_com_kadukuntla_KafkaProtobuf_protobuf_StockPrice_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.kadukuntla.KafkaProtobuf.protobuf.StockPriceOuterClass.StockPrice.class, com.kadukuntla.KafkaProtobuf.protobuf.StockPriceOuterClass.StockPrice.Builder.class);
    }

    public static final int NAME_FIELD_NUMBER = 1;
    @SuppressWarnings("serial")
    private volatile java.lang.Object name_ = "";
    /**
     * <code>string name = 1;</code>
     * @return The name.
     */
    @java.lang.Override
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      }
    }
    /**
     * <code>string name = 1;</code>
     * @return The bytes for name.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int INSTRUMENT_TOKEN_FIELD_NUMBER = 2;
    @SuppressWarnings("serial")
    private volatile java.lang.Object instrumentToken_ = "";
    /**
     * <code>string instrument_token = 2;</code>
     * @return The instrumentToken.
     */
    @java.lang.Override
    public java.lang.String getInstrumentToken() {
      java.lang.Object ref = instrumentToken_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        instrumentToken_ = s;
        return s;
      }
    }
    /**
     * <code>string instrument_token = 2;</code>
     * @return The bytes for instrumentToken.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getInstrumentTokenBytes() {
      java.lang.Object ref = instrumentToken_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        instrumentToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int LAST_PRICE_FIELD_NUMBER = 3;
    private double lastPrice_ = 0D;
    /**
     * <code>double last_price = 3;</code>
     * @return The lastPrice.
     */
    @java.lang.Override
    public double getLastPrice() {
      return lastPrice_;
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
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(instrumentToken_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, instrumentToken_);
      }
      if (java.lang.Double.doubleToRawLongBits(lastPrice_) != 0) {
        output.writeDouble(3, lastPrice_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(instrumentToken_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, instrumentToken_);
      }
      if (java.lang.Double.doubleToRawLongBits(lastPrice_) != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeDoubleSize(3, lastPrice_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof com.kadukuntla.KafkaProtobuf.protobuf.StockPriceOuterClass.StockPrice)) {
        return super.equals(obj);
      }
      com.kadukuntla.KafkaProtobuf.protobuf.StockPriceOuterClass.StockPrice other = (com.kadukuntla.KafkaProtobuf.protobuf.StockPriceOuterClass.StockPrice) obj;

      if (!getName()
          .equals(other.getName())) return false;
      if (!getInstrumentToken()
          .equals(other.getInstrumentToken())) return false;
      if (java.lang.Double.doubleToLongBits(getLastPrice())
          != java.lang.Double.doubleToLongBits(
              other.getLastPrice())) return false;
      if (!getUnknownFields().equals(other.getUnknownFields())) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + NAME_FIELD_NUMBER;
      hash = (53 * hash) + getName().hashCode();
      hash = (37 * hash) + INSTRUMENT_TOKEN_FIELD_NUMBER;
      hash = (53 * hash) + getInstrumentToken().hashCode();
      hash = (37 * hash) + LAST_PRICE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          java.lang.Double.doubleToLongBits(getLastPrice()));
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.kadukuntla.KafkaProtobuf.protobuf.StockPriceOuterClass.StockPrice parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.kadukuntla.KafkaProtobuf.protobuf.StockPriceOuterClass.StockPrice parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.kadukuntla.KafkaProtobuf.protobuf.StockPriceOuterClass.StockPrice parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.kadukuntla.KafkaProtobuf.protobuf.StockPriceOuterClass.StockPrice parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.kadukuntla.KafkaProtobuf.protobuf.StockPriceOuterClass.StockPrice parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.kadukuntla.KafkaProtobuf.protobuf.StockPriceOuterClass.StockPrice parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.kadukuntla.KafkaProtobuf.protobuf.StockPriceOuterClass.StockPrice parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.kadukuntla.KafkaProtobuf.protobuf.StockPriceOuterClass.StockPrice parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static com.kadukuntla.KafkaProtobuf.protobuf.StockPriceOuterClass.StockPrice parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static com.kadukuntla.KafkaProtobuf.protobuf.StockPriceOuterClass.StockPrice parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.kadukuntla.KafkaProtobuf.protobuf.StockPriceOuterClass.StockPrice parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.kadukuntla.KafkaProtobuf.protobuf.StockPriceOuterClass.StockPrice parseFrom(
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
    public static Builder newBuilder(com.kadukuntla.KafkaProtobuf.protobuf.StockPriceOuterClass.StockPrice prototype) {
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
     *Example : {'NSE:RELIANCE': {'instrument_token': 738561, 'last_price': 2565.05}}
     * </pre>
     *
     * Protobuf type {@code com.kadukuntla.KafkaProtobuf.protobuf.StockPrice}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:com.kadukuntla.KafkaProtobuf.protobuf.StockPrice)
        com.kadukuntla.KafkaProtobuf.protobuf.StockPriceOuterClass.StockPriceOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.kadukuntla.KafkaProtobuf.protobuf.StockPriceOuterClass.internal_static_com_kadukuntla_KafkaProtobuf_protobuf_StockPrice_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.kadukuntla.KafkaProtobuf.protobuf.StockPriceOuterClass.internal_static_com_kadukuntla_KafkaProtobuf_protobuf_StockPrice_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.kadukuntla.KafkaProtobuf.protobuf.StockPriceOuterClass.StockPrice.class, com.kadukuntla.KafkaProtobuf.protobuf.StockPriceOuterClass.StockPrice.Builder.class);
      }

      // Construct using com.kadukuntla.KafkaProtobuf.protobuf.StockPriceOuterClass.StockPrice.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        bitField0_ = 0;
        name_ = "";
        instrumentToken_ = "";
        lastPrice_ = 0D;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.kadukuntla.KafkaProtobuf.protobuf.StockPriceOuterClass.internal_static_com_kadukuntla_KafkaProtobuf_protobuf_StockPrice_descriptor;
      }

      @java.lang.Override
      public com.kadukuntla.KafkaProtobuf.protobuf.StockPriceOuterClass.StockPrice getDefaultInstanceForType() {
        return com.kadukuntla.KafkaProtobuf.protobuf.StockPriceOuterClass.StockPrice.getDefaultInstance();
      }

      @java.lang.Override
      public com.kadukuntla.KafkaProtobuf.protobuf.StockPriceOuterClass.StockPrice build() {
        com.kadukuntla.KafkaProtobuf.protobuf.StockPriceOuterClass.StockPrice result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.kadukuntla.KafkaProtobuf.protobuf.StockPriceOuterClass.StockPrice buildPartial() {
        com.kadukuntla.KafkaProtobuf.protobuf.StockPriceOuterClass.StockPrice result = new com.kadukuntla.KafkaProtobuf.protobuf.StockPriceOuterClass.StockPrice(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(com.kadukuntla.KafkaProtobuf.protobuf.StockPriceOuterClass.StockPrice result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.name_ = name_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.instrumentToken_ = instrumentToken_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.lastPrice_ = lastPrice_;
        }
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
        if (other instanceof com.kadukuntla.KafkaProtobuf.protobuf.StockPriceOuterClass.StockPrice) {
          return mergeFrom((com.kadukuntla.KafkaProtobuf.protobuf.StockPriceOuterClass.StockPrice)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.kadukuntla.KafkaProtobuf.protobuf.StockPriceOuterClass.StockPrice other) {
        if (other == com.kadukuntla.KafkaProtobuf.protobuf.StockPriceOuterClass.StockPrice.getDefaultInstance()) return this;
        if (!other.getName().isEmpty()) {
          name_ = other.name_;
          bitField0_ |= 0x00000001;
          onChanged();
        }
        if (!other.getInstrumentToken().isEmpty()) {
          instrumentToken_ = other.instrumentToken_;
          bitField0_ |= 0x00000002;
          onChanged();
        }
        if (other.getLastPrice() != 0D) {
          setLastPrice(other.getLastPrice());
        }
        this.mergeUnknownFields(other.getUnknownFields());
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
        if (extensionRegistry == null) {
          throw new java.lang.NullPointerException();
        }
        try {
          boolean done = false;
          while (!done) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                done = true;
                break;
              case 10: {
                name_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
              case 18: {
                instrumentToken_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
              case 25: {
                lastPrice_ = input.readDouble();
                bitField0_ |= 0x00000004;
                break;
              } // case 25
              default: {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
            } // switch (tag)
          } // while (!done)
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.unwrapIOException();
        } finally {
          onChanged();
        } // finally
        return this;
      }
      private int bitField0_;

      private java.lang.Object name_ = "";
      /**
       * <code>string name = 1;</code>
       * @return The name.
       */
      public java.lang.String getName() {
        java.lang.Object ref = name_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          name_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string name = 1;</code>
       * @return The bytes for name.
       */
      public com.google.protobuf.ByteString
          getNameBytes() {
        java.lang.Object ref = name_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          name_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string name = 1;</code>
       * @param value The name to set.
       * @return This builder for chaining.
       */
      public Builder setName(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        name_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>string name = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearName() {
        name_ = getDefaultInstance().getName();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }
      /**
       * <code>string name = 1;</code>
       * @param value The bytes for name to set.
       * @return This builder for chaining.
       */
      public Builder setNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        checkByteStringIsUtf8(value);
        name_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }

      private java.lang.Object instrumentToken_ = "";
      /**
       * <code>string instrument_token = 2;</code>
       * @return The instrumentToken.
       */
      public java.lang.String getInstrumentToken() {
        java.lang.Object ref = instrumentToken_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          instrumentToken_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string instrument_token = 2;</code>
       * @return The bytes for instrumentToken.
       */
      public com.google.protobuf.ByteString
          getInstrumentTokenBytes() {
        java.lang.Object ref = instrumentToken_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          instrumentToken_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string instrument_token = 2;</code>
       * @param value The instrumentToken to set.
       * @return This builder for chaining.
       */
      public Builder setInstrumentToken(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        instrumentToken_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>string instrument_token = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearInstrumentToken() {
        instrumentToken_ = getDefaultInstance().getInstrumentToken();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
        return this;
      }
      /**
       * <code>string instrument_token = 2;</code>
       * @param value The bytes for instrumentToken to set.
       * @return This builder for chaining.
       */
      public Builder setInstrumentTokenBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        checkByteStringIsUtf8(value);
        instrumentToken_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }

      private double lastPrice_ ;
      /**
       * <code>double last_price = 3;</code>
       * @return The lastPrice.
       */
      @java.lang.Override
      public double getLastPrice() {
        return lastPrice_;
      }
      /**
       * <code>double last_price = 3;</code>
       * @param value The lastPrice to set.
       * @return This builder for chaining.
       */
      public Builder setLastPrice(double value) {

        lastPrice_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>double last_price = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearLastPrice() {
        bitField0_ = (bitField0_ & ~0x00000004);
        lastPrice_ = 0D;
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


      // @@protoc_insertion_point(builder_scope:com.kadukuntla.KafkaProtobuf.protobuf.StockPrice)
    }

    // @@protoc_insertion_point(class_scope:com.kadukuntla.KafkaProtobuf.protobuf.StockPrice)
    private static final com.kadukuntla.KafkaProtobuf.protobuf.StockPriceOuterClass.StockPrice DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.kadukuntla.KafkaProtobuf.protobuf.StockPriceOuterClass.StockPrice();
    }

    public static com.kadukuntla.KafkaProtobuf.protobuf.StockPriceOuterClass.StockPrice getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<StockPrice>
        PARSER = new com.google.protobuf.AbstractParser<StockPrice>() {
      @java.lang.Override
      public StockPrice parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        Builder builder = newBuilder();
        try {
          builder.mergeFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.setUnfinishedMessage(builder.buildPartial());
        } catch (com.google.protobuf.UninitializedMessageException e) {
          throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
        } catch (java.io.IOException e) {
          throw new com.google.protobuf.InvalidProtocolBufferException(e)
              .setUnfinishedMessage(builder.buildPartial());
        }
        return builder.buildPartial();
      }
    };

    public static com.google.protobuf.Parser<StockPrice> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<StockPrice> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.kadukuntla.KafkaProtobuf.protobuf.StockPriceOuterClass.StockPrice getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_kadukuntla_KafkaProtobuf_protobuf_StockPrice_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_kadukuntla_KafkaProtobuf_protobuf_StockPrice_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n-src/main/resources/protobuf/stock_pric" +
      "e.proto\022%com.kadukuntla.KafkaProtobuf.pr" +
      "otobuf\"H\n\nStockPrice\022\014\n\004name\030\001 \001(\t\022\030\n\020in" +
      "strument_token\030\002 \001(\t\022\022\n\nlast_price\030\003 \001(\001" +
      "b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_com_kadukuntla_KafkaProtobuf_protobuf_StockPrice_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_kadukuntla_KafkaProtobuf_protobuf_StockPrice_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_kadukuntla_KafkaProtobuf_protobuf_StockPrice_descriptor,
        new java.lang.String[] { "Name", "InstrumentToken", "LastPrice", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
