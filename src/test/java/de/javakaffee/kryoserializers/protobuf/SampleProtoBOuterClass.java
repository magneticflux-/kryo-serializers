/*
 * Copyright 2018 Martin Grotzke
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an &quot;AS IS&quot; BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */
package de.javakaffee.kryoserializers.protobuf;

public final class SampleProtoBOuterClass {
	private SampleProtoBOuterClass() {}

	public static void registerAllExtensions(
			com.google.protobuf.ExtensionRegistry registry) {}

	public interface SampleProtoBOrBuilder extends
			// @@protoc_insertion_point(interface_extends:ProtocolBuffers.SampleProtoB)
			com.google.protobuf.MessageOrBuilder {

		/**
		 * <code>required uint32 identifier = 1;</code>
		 */
		boolean hasIdentifier();

		/**
		 * <code>required uint32 identifier = 1;</code>
		 */
		int getIdentifier();

		/**
		 * <code>required string state = 2;</code>
		 */
		boolean hasState();

		/**
		 * <code>required string state = 2;</code>
		 */
		java.lang.String getState();

		/**
		 * <code>required string state = 2;</code>
		 */
		com.google.protobuf.ByteString getStateBytes();

		/**
		 * <code>required string city = 3;</code>
		 */
		boolean hasCity();

		/**
		 * <code>required string city = 3;</code>
		 */
		java.lang.String getCity();

		/**
		 * <code>required string city = 3;</code>
		 */
		com.google.protobuf.ByteString getCityBytes();
	}

	/**
	 * Protobuf type {@code ProtocolBuffers.SampleProtoB}
	 */
	public static final class SampleProtoB extends
			com.google.protobuf.GeneratedMessage implements
			// @@protoc_insertion_point(message_implements:ProtocolBuffers.SampleProtoB)
			SampleProtoBOrBuilder {
		// Use SampleProtoB.newBuilder() to construct.
		private SampleProtoB(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
			super(builder);
			this.unknownFields = builder.getUnknownFields();
		}

		private SampleProtoB(boolean noInit) {
			this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance();
		}

		private static final SampleProtoB defaultInstance;

		public static SampleProtoB getDefaultInstance() {
			return defaultInstance;
		}

		public SampleProtoB getDefaultInstanceForType() {
			return defaultInstance;
		}

		private final com.google.protobuf.UnknownFieldSet unknownFields;

		@java.lang.Override
		public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
			return this.unknownFields;
		}

		private SampleProtoB(
				com.google.protobuf.CodedInputStream input,
				com.google.protobuf.ExtensionRegistryLite extensionRegistry)
				throws com.google.protobuf.InvalidProtocolBufferException {
			initFields();
			int mutable_bitField0_ = 0;
			com.google.protobuf.UnknownFieldSet.Builder unknownFields = com.google.protobuf.UnknownFieldSet.newBuilder();
			try {
				boolean done = false;
				while (!done) {
					int tag = input.readTag();
					switch (tag) {
					case 0:
						done = true;
						break;
					default: {
						if (!parseUnknownField(input, unknownFields,
								extensionRegistry, tag)) {
							done = true;
						}
						break;
					}
					case 8: {
						bitField0_ |= 0x00000001;
						identifier_ = input.readUInt32();
						break;
					}
					case 18: {
						com.google.protobuf.ByteString bs = input.readBytes();
						bitField0_ |= 0x00000002;
						state_ = bs;
						break;
					}
					case 26: {
						com.google.protobuf.ByteString bs = input.readBytes();
						bitField0_ |= 0x00000004;
						city_ = bs;
						break;
					}
					}
				}
			} catch (com.google.protobuf.InvalidProtocolBufferException e) {
				throw e.setUnfinishedMessage(this);
			} catch (java.io.IOException e) {
				throw new com.google.protobuf.InvalidProtocolBufferException(
						e.getMessage()).setUnfinishedMessage(this);
			} finally {
				this.unknownFields = unknownFields.build();
				makeExtensionsImmutable();
			}
		}

		public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
			return de.javakaffee.kryoserializers.protobuf.SampleProtoBOuterClass.internal_static_ProtocolBuffers_SampleProtoB_descriptor;
		}

		protected com.google.protobuf.GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
			return de.javakaffee.kryoserializers.protobuf.SampleProtoBOuterClass.internal_static_ProtocolBuffers_SampleProtoB_fieldAccessorTable
					.ensureFieldAccessorsInitialized(
							de.javakaffee.kryoserializers.protobuf.SampleProtoBOuterClass.SampleProtoB.class, de.javakaffee.kryoserializers.protobuf.SampleProtoBOuterClass.SampleProtoB.Builder.class);
		}

		public static com.google.protobuf.Parser<SampleProtoB> PARSER = new com.google.protobuf.AbstractParser<SampleProtoB>() {
			public SampleProtoB parsePartialFrom(
					com.google.protobuf.CodedInputStream input,
					com.google.protobuf.ExtensionRegistryLite extensionRegistry)
					throws com.google.protobuf.InvalidProtocolBufferException {
				return new SampleProtoB(input, extensionRegistry);
			}
		};

		@java.lang.Override
		public com.google.protobuf.Parser<SampleProtoB> getParserForType() {
			return PARSER;
		}

		private int bitField0_;
		public static final int IDENTIFIER_FIELD_NUMBER = 1;
		private int identifier_;

		/**
		 * <code>required uint32 identifier = 1;</code>
		 */
		public boolean hasIdentifier() {
			return ((bitField0_ & 0x00000001) == 0x00000001);
		}

		/**
		 * <code>required uint32 identifier = 1;</code>
		 */
		public int getIdentifier() {
			return identifier_;
		}

		public static final int STATE_FIELD_NUMBER = 2;
		private java.lang.Object state_;

		/**
		 * <code>required string state = 2;</code>
		 */
		public boolean hasState() {
			return ((bitField0_ & 0x00000002) == 0x00000002);
		}

		/**
		 * <code>required string state = 2;</code>
		 */
		public java.lang.String getState() {
			java.lang.Object ref = state_;
			if (ref instanceof java.lang.String) {
				return (java.lang.String) ref;
			} else {
				com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
				java.lang.String s = bs.toStringUtf8();
				if (bs.isValidUtf8()) {
					state_ = s;
				}
				return s;
			}
		}

		/**
		 * <code>required string state = 2;</code>
		 */
		public com.google.protobuf.ByteString getStateBytes() {
			java.lang.Object ref = state_;
			if (ref instanceof java.lang.String) {
				com.google.protobuf.ByteString b = com.google.protobuf.ByteString.copyFromUtf8(
						(java.lang.String) ref);
				state_ = b;
				return b;
			} else {
				return (com.google.protobuf.ByteString) ref;
			}
		}

		public static final int CITY_FIELD_NUMBER = 3;
		private java.lang.Object city_;

		/**
		 * <code>required string city = 3;</code>
		 */
		public boolean hasCity() {
			return ((bitField0_ & 0x00000004) == 0x00000004);
		}

		/**
		 * <code>required string city = 3;</code>
		 */
		public java.lang.String getCity() {
			java.lang.Object ref = city_;
			if (ref instanceof java.lang.String) {
				return (java.lang.String) ref;
			} else {
				com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
				java.lang.String s = bs.toStringUtf8();
				if (bs.isValidUtf8()) {
					city_ = s;
				}
				return s;
			}
		}

		/**
		 * <code>required string city = 3;</code>
		 */
		public com.google.protobuf.ByteString getCityBytes() {
			java.lang.Object ref = city_;
			if (ref instanceof java.lang.String) {
				com.google.protobuf.ByteString b = com.google.protobuf.ByteString.copyFromUtf8(
						(java.lang.String) ref);
				city_ = b;
				return b;
			} else {
				return (com.google.protobuf.ByteString) ref;
			}
		}

		private void initFields() {
			identifier_ = 0;
			state_ = "";
			city_ = "";
		}

		private byte memoizedIsInitialized = -1;

		public final boolean isInitialized() {
			byte isInitialized = memoizedIsInitialized;
			if (isInitialized == 1)
				return true;
			if (isInitialized == 0)
				return false;

			if (!hasIdentifier()) {
				memoizedIsInitialized = 0;
				return false;
			}
			if (!hasState()) {
				memoizedIsInitialized = 0;
				return false;
			}
			if (!hasCity()) {
				memoizedIsInitialized = 0;
				return false;
			}
			memoizedIsInitialized = 1;
			return true;
		}

		public void writeTo(com.google.protobuf.CodedOutputStream output)
				throws java.io.IOException {
			getSerializedSize();
			if (((bitField0_ & 0x00000001) == 0x00000001)) {
				output.writeUInt32(1, identifier_);
			}
			if (((bitField0_ & 0x00000002) == 0x00000002)) {
				output.writeBytes(2, getStateBytes());
			}
			if (((bitField0_ & 0x00000004) == 0x00000004)) {
				output.writeBytes(3, getCityBytes());
			}
			getUnknownFields().writeTo(output);
		}

		private int memoizedSerializedSize = -1;

		public int getSerializedSize() {
			int size = memoizedSerializedSize;
			if (size != -1)
				return size;

			size = 0;
			if (((bitField0_ & 0x00000001) == 0x00000001)) {
				size += com.google.protobuf.CodedOutputStream
						.computeUInt32Size(1, identifier_);
			}
			if (((bitField0_ & 0x00000002) == 0x00000002)) {
				size += com.google.protobuf.CodedOutputStream
						.computeBytesSize(2, getStateBytes());
			}
			if (((bitField0_ & 0x00000004) == 0x00000004)) {
				size += com.google.protobuf.CodedOutputStream
						.computeBytesSize(3, getCityBytes());
			}
			size += getUnknownFields().getSerializedSize();
			memoizedSerializedSize = size;
			return size;
		}

		private static final long serialVersionUID = 0L;

		@java.lang.Override
		protected java.lang.Object writeReplace()
				throws java.io.ObjectStreamException {
			return super.writeReplace();
		}

		public static de.javakaffee.kryoserializers.protobuf.SampleProtoBOuterClass.SampleProtoB parseFrom(
				com.google.protobuf.ByteString data)
				throws com.google.protobuf.InvalidProtocolBufferException {
			return PARSER.parseFrom(data);
		}

		public static de.javakaffee.kryoserializers.protobuf.SampleProtoBOuterClass.SampleProtoB parseFrom(
				com.google.protobuf.ByteString data,
				com.google.protobuf.ExtensionRegistryLite extensionRegistry)
				throws com.google.protobuf.InvalidProtocolBufferException {
			return PARSER.parseFrom(data, extensionRegistry);
		}

		public static de.javakaffee.kryoserializers.protobuf.SampleProtoBOuterClass.SampleProtoB parseFrom(byte[] data)
				throws com.google.protobuf.InvalidProtocolBufferException {
			return PARSER.parseFrom(data);
		}

		public static de.javakaffee.kryoserializers.protobuf.SampleProtoBOuterClass.SampleProtoB parseFrom(
				byte[] data,
				com.google.protobuf.ExtensionRegistryLite extensionRegistry)
				throws com.google.protobuf.InvalidProtocolBufferException {
			return PARSER.parseFrom(data, extensionRegistry);
		}

		public static de.javakaffee.kryoserializers.protobuf.SampleProtoBOuterClass.SampleProtoB parseFrom(java.io.InputStream input)
				throws java.io.IOException {
			return PARSER.parseFrom(input);
		}

		public static de.javakaffee.kryoserializers.protobuf.SampleProtoBOuterClass.SampleProtoB parseFrom(
				java.io.InputStream input,
				com.google.protobuf.ExtensionRegistryLite extensionRegistry)
				throws java.io.IOException {
			return PARSER.parseFrom(input, extensionRegistry);
		}

		public static de.javakaffee.kryoserializers.protobuf.SampleProtoBOuterClass.SampleProtoB parseDelimitedFrom(java.io.InputStream input)
				throws java.io.IOException {
			return PARSER.parseDelimitedFrom(input);
		}

		public static de.javakaffee.kryoserializers.protobuf.SampleProtoBOuterClass.SampleProtoB parseDelimitedFrom(
				java.io.InputStream input,
				com.google.protobuf.ExtensionRegistryLite extensionRegistry)
				throws java.io.IOException {
			return PARSER.parseDelimitedFrom(input, extensionRegistry);
		}

		public static de.javakaffee.kryoserializers.protobuf.SampleProtoBOuterClass.SampleProtoB parseFrom(
				com.google.protobuf.CodedInputStream input)
				throws java.io.IOException {
			return PARSER.parseFrom(input);
		}

		public static de.javakaffee.kryoserializers.protobuf.SampleProtoBOuterClass.SampleProtoB parseFrom(
				com.google.protobuf.CodedInputStream input,
				com.google.protobuf.ExtensionRegistryLite extensionRegistry)
				throws java.io.IOException {
			return PARSER.parseFrom(input, extensionRegistry);
		}

		public static Builder newBuilder() {
			return Builder.create();
		}

		public Builder newBuilderForType() {
			return newBuilder();
		}

		public static Builder newBuilder(de.javakaffee.kryoserializers.protobuf.SampleProtoBOuterClass.SampleProtoB prototype) {
			return newBuilder().mergeFrom(prototype);
		}

		public Builder toBuilder() {
			return newBuilder(this);
		}

		@java.lang.Override
		protected Builder newBuilderForType(
				com.google.protobuf.GeneratedMessage.BuilderParent parent) {
			Builder builder = new Builder(parent);
			return builder;
		}

		/**
		 * Protobuf type {@code ProtocolBuffers.SampleProtoB}
		 */
		public static final class Builder extends
				com.google.protobuf.GeneratedMessage.Builder<Builder> implements
				// @@protoc_insertion_point(builder_implements:ProtocolBuffers.SampleProtoB)
				de.javakaffee.kryoserializers.protobuf.SampleProtoBOuterClass.SampleProtoBOrBuilder {
			public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
				return de.javakaffee.kryoserializers.protobuf.SampleProtoBOuterClass.internal_static_ProtocolBuffers_SampleProtoB_descriptor;
			}

			protected com.google.protobuf.GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
				return de.javakaffee.kryoserializers.protobuf.SampleProtoBOuterClass.internal_static_ProtocolBuffers_SampleProtoB_fieldAccessorTable
						.ensureFieldAccessorsInitialized(
								de.javakaffee.kryoserializers.protobuf.SampleProtoBOuterClass.SampleProtoB.class, de.javakaffee.kryoserializers.protobuf.SampleProtoBOuterClass.SampleProtoB.Builder.class);
			}

			// Construct using de.javakaffee.kryoserializers.protobuf.SampleProtoBOuterClass.SampleProtoB.newBuilder()
			private Builder() {
				maybeForceBuilderInitialization();
			}

			private Builder(
					com.google.protobuf.GeneratedMessage.BuilderParent parent) {
				super(parent);
				maybeForceBuilderInitialization();
			}

			private void maybeForceBuilderInitialization() {
				if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {}
			}

			private static Builder create() {
				return new Builder();
			}

			public Builder clear() {
				super.clear();
				identifier_ = 0;
				bitField0_ = (bitField0_ & ~0x00000001);
				state_ = "";
				bitField0_ = (bitField0_ & ~0x00000002);
				city_ = "";
				bitField0_ = (bitField0_ & ~0x00000004);
				return this;
			}

			public Builder clone() {
				return create().mergeFrom(buildPartial());
			}

			public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
				return de.javakaffee.kryoserializers.protobuf.SampleProtoBOuterClass.internal_static_ProtocolBuffers_SampleProtoB_descriptor;
			}

			public de.javakaffee.kryoserializers.protobuf.SampleProtoBOuterClass.SampleProtoB getDefaultInstanceForType() {
				return de.javakaffee.kryoserializers.protobuf.SampleProtoBOuterClass.SampleProtoB.getDefaultInstance();
			}

			public de.javakaffee.kryoserializers.protobuf.SampleProtoBOuterClass.SampleProtoB build() {
				de.javakaffee.kryoserializers.protobuf.SampleProtoBOuterClass.SampleProtoB result = buildPartial();
				if (!result.isInitialized()) {
					throw newUninitializedMessageException(result);
				}
				return result;
			}

			public de.javakaffee.kryoserializers.protobuf.SampleProtoBOuterClass.SampleProtoB buildPartial() {
				de.javakaffee.kryoserializers.protobuf.SampleProtoBOuterClass.SampleProtoB result = new de.javakaffee.kryoserializers.protobuf.SampleProtoBOuterClass.SampleProtoB(this);
				int from_bitField0_ = bitField0_;
				int to_bitField0_ = 0;
				if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
					to_bitField0_ |= 0x00000001;
				}
				result.identifier_ = identifier_;
				if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
					to_bitField0_ |= 0x00000002;
				}
				result.state_ = state_;
				if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
					to_bitField0_ |= 0x00000004;
				}
				result.city_ = city_;
				result.bitField0_ = to_bitField0_;
				onBuilt();
				return result;
			}

			public Builder mergeFrom(com.google.protobuf.Message other) {
				if (other instanceof de.javakaffee.kryoserializers.protobuf.SampleProtoBOuterClass.SampleProtoB) {
					return mergeFrom((de.javakaffee.kryoserializers.protobuf.SampleProtoBOuterClass.SampleProtoB) other);
				} else {
					super.mergeFrom(other);
					return this;
				}
			}

			public Builder mergeFrom(de.javakaffee.kryoserializers.protobuf.SampleProtoBOuterClass.SampleProtoB other) {
				if (other == de.javakaffee.kryoserializers.protobuf.SampleProtoBOuterClass.SampleProtoB.getDefaultInstance())
					return this;
				if (other.hasIdentifier()) {
					setIdentifier(other.getIdentifier());
				}
				if (other.hasState()) {
					bitField0_ |= 0x00000002;
					state_ = other.state_;
					onChanged();
				}
				if (other.hasCity()) {
					bitField0_ |= 0x00000004;
					city_ = other.city_;
					onChanged();
				}
				this.mergeUnknownFields(other.getUnknownFields());
				return this;
			}

			public final boolean isInitialized() {
				if (!hasIdentifier()) {

					return false;
				}
				if (!hasState()) {

					return false;
				}
				if (!hasCity()) {

					return false;
				}
				return true;
			}

			public Builder mergeFrom(
					com.google.protobuf.CodedInputStream input,
					com.google.protobuf.ExtensionRegistryLite extensionRegistry)
					throws java.io.IOException {
				de.javakaffee.kryoserializers.protobuf.SampleProtoBOuterClass.SampleProtoB parsedMessage = null;
				try {
					parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
				} catch (com.google.protobuf.InvalidProtocolBufferException e) {
					parsedMessage = (de.javakaffee.kryoserializers.protobuf.SampleProtoBOuterClass.SampleProtoB) e.getUnfinishedMessage();
					throw e;
				} finally {
					if (parsedMessage != null) {
						mergeFrom(parsedMessage);
					}
				}
				return this;
			}

			private int bitField0_;

			private int identifier_;

			/**
			 * <code>required uint32 identifier = 1;</code>
			 */
			public boolean hasIdentifier() {
				return ((bitField0_ & 0x00000001) == 0x00000001);
			}

			/**
			 * <code>required uint32 identifier = 1;</code>
			 */
			public int getIdentifier() {
				return identifier_;
			}

			/**
			 * <code>required uint32 identifier = 1;</code>
			 */
			public Builder setIdentifier(int value) {
				bitField0_ |= 0x00000001;
				identifier_ = value;
				onChanged();
				return this;
			}

			/**
			 * <code>required uint32 identifier = 1;</code>
			 */
			public Builder clearIdentifier() {
				bitField0_ = (bitField0_ & ~0x00000001);
				identifier_ = 0;
				onChanged();
				return this;
			}

			private java.lang.Object state_ = "";

			/**
			 * <code>required string state = 2;</code>
			 */
			public boolean hasState() {
				return ((bitField0_ & 0x00000002) == 0x00000002);
			}

			/**
			 * <code>required string state = 2;</code>
			 */
			public java.lang.String getState() {
				java.lang.Object ref = state_;
				if (!(ref instanceof java.lang.String)) {
					com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
					java.lang.String s = bs.toStringUtf8();
					if (bs.isValidUtf8()) {
						state_ = s;
					}
					return s;
				} else {
					return (java.lang.String) ref;
				}
			}

			/**
			 * <code>required string state = 2;</code>
			 */
			public com.google.protobuf.ByteString getStateBytes() {
				java.lang.Object ref = state_;
				if (ref instanceof String) {
					com.google.protobuf.ByteString b = com.google.protobuf.ByteString.copyFromUtf8(
							(java.lang.String) ref);
					state_ = b;
					return b;
				} else {
					return (com.google.protobuf.ByteString) ref;
				}
			}

			/**
			 * <code>required string state = 2;</code>
			 */
			public Builder setState(
					java.lang.String value) {
				if (value == null) {
					throw new NullPointerException();
				}
				bitField0_ |= 0x00000002;
				state_ = value;
				onChanged();
				return this;
			}

			/**
			 * <code>required string state = 2;</code>
			 */
			public Builder clearState() {
				bitField0_ = (bitField0_ & ~0x00000002);
				state_ = getDefaultInstance().getState();
				onChanged();
				return this;
			}

			/**
			 * <code>required string state = 2;</code>
			 */
			public Builder setStateBytes(
					com.google.protobuf.ByteString value) {
				if (value == null) {
					throw new NullPointerException();
				}
				bitField0_ |= 0x00000002;
				state_ = value;
				onChanged();
				return this;
			}

			private java.lang.Object city_ = "";

			/**
			 * <code>required string city = 3;</code>
			 */
			public boolean hasCity() {
				return ((bitField0_ & 0x00000004) == 0x00000004);
			}

			/**
			 * <code>required string city = 3;</code>
			 */
			public java.lang.String getCity() {
				java.lang.Object ref = city_;
				if (!(ref instanceof java.lang.String)) {
					com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
					java.lang.String s = bs.toStringUtf8();
					if (bs.isValidUtf8()) {
						city_ = s;
					}
					return s;
				} else {
					return (java.lang.String) ref;
				}
			}

			/**
			 * <code>required string city = 3;</code>
			 */
			public com.google.protobuf.ByteString getCityBytes() {
				java.lang.Object ref = city_;
				if (ref instanceof String) {
					com.google.protobuf.ByteString b = com.google.protobuf.ByteString.copyFromUtf8(
							(java.lang.String) ref);
					city_ = b;
					return b;
				} else {
					return (com.google.protobuf.ByteString) ref;
				}
			}

			/**
			 * <code>required string city = 3;</code>
			 */
			public Builder setCity(
					java.lang.String value) {
				if (value == null) {
					throw new NullPointerException();
				}
				bitField0_ |= 0x00000004;
				city_ = value;
				onChanged();
				return this;
			}

			/**
			 * <code>required string city = 3;</code>
			 */
			public Builder clearCity() {
				bitField0_ = (bitField0_ & ~0x00000004);
				city_ = getDefaultInstance().getCity();
				onChanged();
				return this;
			}

			/**
			 * <code>required string city = 3;</code>
			 */
			public Builder setCityBytes(
					com.google.protobuf.ByteString value) {
				if (value == null) {
					throw new NullPointerException();
				}
				bitField0_ |= 0x00000004;
				city_ = value;
				onChanged();
				return this;
			}

			// @@protoc_insertion_point(builder_scope:ProtocolBuffers.SampleProtoB)
		}

		static {
			defaultInstance = new SampleProtoB(true);
			defaultInstance.initFields();
		}

		// @@protoc_insertion_point(class_scope:ProtocolBuffers.SampleProtoB)
	}

	private static final com.google.protobuf.Descriptors.Descriptor internal_static_ProtocolBuffers_SampleProtoB_descriptor;
	private static com.google.protobuf.GeneratedMessage.FieldAccessorTable internal_static_ProtocolBuffers_SampleProtoB_fieldAccessorTable;

	public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
		return descriptor;
	}

	private static com.google.protobuf.Descriptors.FileDescriptor descriptor;
	static {
		java.lang.String[] descriptorData = {
				"\n\022SampleProtoB.proto\022\017ProtocolBuffers\"?\n" +
						"\014SampleProtoB\022\022\n\nidentifier\030\001 \002(\r\022\r\n\005sta" +
						"te\030\002 \002(\t\022\014\n\004city\030\003 \002(\tB@\n&de.javakaffee." +
						"kryoserializers.protobufB\026SampleProtoBOu" +
						"terClass"
		};
		com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner = new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
			public com.google.protobuf.ExtensionRegistry assignDescriptors(
					com.google.protobuf.Descriptors.FileDescriptor root) {
				descriptor = root;
				return null;
			}
		};
		com.google.protobuf.Descriptors.FileDescriptor
				.internalBuildGeneratedFileFrom(descriptorData,
						new com.google.protobuf.Descriptors.FileDescriptor[]{
						}, assigner);
		internal_static_ProtocolBuffers_SampleProtoB_descriptor = getDescriptor().getMessageTypes().get(0);
		internal_static_ProtocolBuffers_SampleProtoB_fieldAccessorTable = new com.google.protobuf.GeneratedMessage.FieldAccessorTable(
				internal_static_ProtocolBuffers_SampleProtoB_descriptor,
				new java.lang.String[]{"Identifier", "State", "City",});
	}

	// @@protoc_insertion_point(outer_class_scope)
}
