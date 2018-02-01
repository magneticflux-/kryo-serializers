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

public final class SampleProtoAOuterClass {
	private SampleProtoAOuterClass() {}

	public static void registerAllExtensions(
			com.google.protobuf.ExtensionRegistry registry) {}

	public interface SampleProtoAOrBuilder extends
			// @@protoc_insertion_point(interface_extends:ProtocolBuffers.SampleProtoA)
			com.google.protobuf.MessageOrBuilder {

		/**
		 * <code>optional string name = 1;</code>
		 */
		boolean hasName();

		/**
		 * <code>optional string name = 1;</code>
		 */
		java.lang.String getName();

		/**
		 * <code>optional string name = 1;</code>
		 */
		com.google.protobuf.ByteString getNameBytes();

		/**
		 * <code>optional uint32 message_id = 2;</code>
		 */
		boolean hasMessageId();

		/**
		 * <code>optional uint32 message_id = 2;</code>
		 */
		int getMessageId();
	}

	/**
	 * Protobuf type {@code ProtocolBuffers.SampleProtoA}
	 */
	public static final class SampleProtoA extends
			com.google.protobuf.GeneratedMessage implements
			// @@protoc_insertion_point(message_implements:ProtocolBuffers.SampleProtoA)
			SampleProtoAOrBuilder {
		// Use SampleProtoA.newBuilder() to construct.
		private SampleProtoA(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
			super(builder);
			this.unknownFields = builder.getUnknownFields();
		}

		private SampleProtoA(boolean noInit) {
			this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance();
		}

		private static final SampleProtoA defaultInstance;

		public static SampleProtoA getDefaultInstance() {
			return defaultInstance;
		}

		public SampleProtoA getDefaultInstanceForType() {
			return defaultInstance;
		}

		private final com.google.protobuf.UnknownFieldSet unknownFields;

		@java.lang.Override
		public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
			return this.unknownFields;
		}

		private SampleProtoA(
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
					case 10: {
						com.google.protobuf.ByteString bs = input.readBytes();
						bitField0_ |= 0x00000001;
						name_ = bs;
						break;
					}
					case 16: {
						bitField0_ |= 0x00000002;
						messageId_ = input.readUInt32();
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
			return de.javakaffee.kryoserializers.protobuf.SampleProtoAOuterClass.internal_static_ProtocolBuffers_SampleProtoA_descriptor;
		}

		protected com.google.protobuf.GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
			return de.javakaffee.kryoserializers.protobuf.SampleProtoAOuterClass.internal_static_ProtocolBuffers_SampleProtoA_fieldAccessorTable
					.ensureFieldAccessorsInitialized(
							de.javakaffee.kryoserializers.protobuf.SampleProtoAOuterClass.SampleProtoA.class, de.javakaffee.kryoserializers.protobuf.SampleProtoAOuterClass.SampleProtoA.Builder.class);
		}

		public static com.google.protobuf.Parser<SampleProtoA> PARSER = new com.google.protobuf.AbstractParser<SampleProtoA>() {
			public SampleProtoA parsePartialFrom(
					com.google.protobuf.CodedInputStream input,
					com.google.protobuf.ExtensionRegistryLite extensionRegistry)
					throws com.google.protobuf.InvalidProtocolBufferException {
				return new SampleProtoA(input, extensionRegistry);
			}
		};

		@java.lang.Override
		public com.google.protobuf.Parser<SampleProtoA> getParserForType() {
			return PARSER;
		}

		private int bitField0_;
		public static final int NAME_FIELD_NUMBER = 1;
		private java.lang.Object name_;

		/**
		 * <code>optional string name = 1;</code>
		 */
		public boolean hasName() {
			return ((bitField0_ & 0x00000001) == 0x00000001);
		}

		/**
		 * <code>optional string name = 1;</code>
		 */
		public java.lang.String getName() {
			java.lang.Object ref = name_;
			if (ref instanceof java.lang.String) {
				return (java.lang.String) ref;
			} else {
				com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
				java.lang.String s = bs.toStringUtf8();
				if (bs.isValidUtf8()) {
					name_ = s;
				}
				return s;
			}
		}

		/**
		 * <code>optional string name = 1;</code>
		 */
		public com.google.protobuf.ByteString getNameBytes() {
			java.lang.Object ref = name_;
			if (ref instanceof java.lang.String) {
				com.google.protobuf.ByteString b = com.google.protobuf.ByteString.copyFromUtf8(
						(java.lang.String) ref);
				name_ = b;
				return b;
			} else {
				return (com.google.protobuf.ByteString) ref;
			}
		}

		public static final int MESSAGE_ID_FIELD_NUMBER = 2;
		private int messageId_;

		/**
		 * <code>optional uint32 message_id = 2;</code>
		 */
		public boolean hasMessageId() {
			return ((bitField0_ & 0x00000002) == 0x00000002);
		}

		/**
		 * <code>optional uint32 message_id = 2;</code>
		 */
		public int getMessageId() {
			return messageId_;
		}

		private void initFields() {
			name_ = "";
			messageId_ = 0;
		}

		private byte memoizedIsInitialized = -1;

		public final boolean isInitialized() {
			byte isInitialized = memoizedIsInitialized;
			if (isInitialized == 1)
				return true;
			if (isInitialized == 0)
				return false;

			memoizedIsInitialized = 1;
			return true;
		}

		public void writeTo(com.google.protobuf.CodedOutputStream output)
				throws java.io.IOException {
			getSerializedSize();
			if (((bitField0_ & 0x00000001) == 0x00000001)) {
				output.writeBytes(1, getNameBytes());
			}
			if (((bitField0_ & 0x00000002) == 0x00000002)) {
				output.writeUInt32(2, messageId_);
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
						.computeBytesSize(1, getNameBytes());
			}
			if (((bitField0_ & 0x00000002) == 0x00000002)) {
				size += com.google.protobuf.CodedOutputStream
						.computeUInt32Size(2, messageId_);
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

		public static de.javakaffee.kryoserializers.protobuf.SampleProtoAOuterClass.SampleProtoA parseFrom(
				com.google.protobuf.ByteString data)
				throws com.google.protobuf.InvalidProtocolBufferException {
			return PARSER.parseFrom(data);
		}

		public static de.javakaffee.kryoserializers.protobuf.SampleProtoAOuterClass.SampleProtoA parseFrom(
				com.google.protobuf.ByteString data,
				com.google.protobuf.ExtensionRegistryLite extensionRegistry)
				throws com.google.protobuf.InvalidProtocolBufferException {
			return PARSER.parseFrom(data, extensionRegistry);
		}

		public static de.javakaffee.kryoserializers.protobuf.SampleProtoAOuterClass.SampleProtoA parseFrom(byte[] data)
				throws com.google.protobuf.InvalidProtocolBufferException {
			return PARSER.parseFrom(data);
		}

		public static de.javakaffee.kryoserializers.protobuf.SampleProtoAOuterClass.SampleProtoA parseFrom(
				byte[] data,
				com.google.protobuf.ExtensionRegistryLite extensionRegistry)
				throws com.google.protobuf.InvalidProtocolBufferException {
			return PARSER.parseFrom(data, extensionRegistry);
		}

		public static de.javakaffee.kryoserializers.protobuf.SampleProtoAOuterClass.SampleProtoA parseFrom(java.io.InputStream input)
				throws java.io.IOException {
			return PARSER.parseFrom(input);
		}

		public static de.javakaffee.kryoserializers.protobuf.SampleProtoAOuterClass.SampleProtoA parseFrom(
				java.io.InputStream input,
				com.google.protobuf.ExtensionRegistryLite extensionRegistry)
				throws java.io.IOException {
			return PARSER.parseFrom(input, extensionRegistry);
		}

		public static de.javakaffee.kryoserializers.protobuf.SampleProtoAOuterClass.SampleProtoA parseDelimitedFrom(java.io.InputStream input)
				throws java.io.IOException {
			return PARSER.parseDelimitedFrom(input);
		}

		public static de.javakaffee.kryoserializers.protobuf.SampleProtoAOuterClass.SampleProtoA parseDelimitedFrom(
				java.io.InputStream input,
				com.google.protobuf.ExtensionRegistryLite extensionRegistry)
				throws java.io.IOException {
			return PARSER.parseDelimitedFrom(input, extensionRegistry);
		}

		public static de.javakaffee.kryoserializers.protobuf.SampleProtoAOuterClass.SampleProtoA parseFrom(
				com.google.protobuf.CodedInputStream input)
				throws java.io.IOException {
			return PARSER.parseFrom(input);
		}

		public static de.javakaffee.kryoserializers.protobuf.SampleProtoAOuterClass.SampleProtoA parseFrom(
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

		public static Builder newBuilder(de.javakaffee.kryoserializers.protobuf.SampleProtoAOuterClass.SampleProtoA prototype) {
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
		 * Protobuf type {@code ProtocolBuffers.SampleProtoA}
		 */
		public static final class Builder extends
				com.google.protobuf.GeneratedMessage.Builder<Builder> implements
				// @@protoc_insertion_point(builder_implements:ProtocolBuffers.SampleProtoA)
				de.javakaffee.kryoserializers.protobuf.SampleProtoAOuterClass.SampleProtoAOrBuilder {
			public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
				return de.javakaffee.kryoserializers.protobuf.SampleProtoAOuterClass.internal_static_ProtocolBuffers_SampleProtoA_descriptor;
			}

			protected com.google.protobuf.GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
				return de.javakaffee.kryoserializers.protobuf.SampleProtoAOuterClass.internal_static_ProtocolBuffers_SampleProtoA_fieldAccessorTable
						.ensureFieldAccessorsInitialized(
								de.javakaffee.kryoserializers.protobuf.SampleProtoAOuterClass.SampleProtoA.class, de.javakaffee.kryoserializers.protobuf.SampleProtoAOuterClass.SampleProtoA.Builder.class);
			}

			// Construct using de.javakaffee.kryoserializers.protobuf.SampleProtoAOuterClass.SampleProtoA.newBuilder()
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
				name_ = "";
				bitField0_ = (bitField0_ & ~0x00000001);
				messageId_ = 0;
				bitField0_ = (bitField0_ & ~0x00000002);
				return this;
			}

			public Builder clone() {
				return create().mergeFrom(buildPartial());
			}

			public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
				return de.javakaffee.kryoserializers.protobuf.SampleProtoAOuterClass.internal_static_ProtocolBuffers_SampleProtoA_descriptor;
			}

			public de.javakaffee.kryoserializers.protobuf.SampleProtoAOuterClass.SampleProtoA getDefaultInstanceForType() {
				return de.javakaffee.kryoserializers.protobuf.SampleProtoAOuterClass.SampleProtoA.getDefaultInstance();
			}

			public de.javakaffee.kryoserializers.protobuf.SampleProtoAOuterClass.SampleProtoA build() {
				de.javakaffee.kryoserializers.protobuf.SampleProtoAOuterClass.SampleProtoA result = buildPartial();
				if (!result.isInitialized()) {
					throw newUninitializedMessageException(result);
				}
				return result;
			}

			public de.javakaffee.kryoserializers.protobuf.SampleProtoAOuterClass.SampleProtoA buildPartial() {
				de.javakaffee.kryoserializers.protobuf.SampleProtoAOuterClass.SampleProtoA result = new de.javakaffee.kryoserializers.protobuf.SampleProtoAOuterClass.SampleProtoA(this);
				int from_bitField0_ = bitField0_;
				int to_bitField0_ = 0;
				if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
					to_bitField0_ |= 0x00000001;
				}
				result.name_ = name_;
				if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
					to_bitField0_ |= 0x00000002;
				}
				result.messageId_ = messageId_;
				result.bitField0_ = to_bitField0_;
				onBuilt();
				return result;
			}

			public Builder mergeFrom(com.google.protobuf.Message other) {
				if (other instanceof de.javakaffee.kryoserializers.protobuf.SampleProtoAOuterClass.SampleProtoA) {
					return mergeFrom((de.javakaffee.kryoserializers.protobuf.SampleProtoAOuterClass.SampleProtoA) other);
				} else {
					super.mergeFrom(other);
					return this;
				}
			}

			public Builder mergeFrom(de.javakaffee.kryoserializers.protobuf.SampleProtoAOuterClass.SampleProtoA other) {
				if (other == de.javakaffee.kryoserializers.protobuf.SampleProtoAOuterClass.SampleProtoA.getDefaultInstance())
					return this;
				if (other.hasName()) {
					bitField0_ |= 0x00000001;
					name_ = other.name_;
					onChanged();
				}
				if (other.hasMessageId()) {
					setMessageId(other.getMessageId());
				}
				this.mergeUnknownFields(other.getUnknownFields());
				return this;
			}

			public final boolean isInitialized() {
				return true;
			}

			public Builder mergeFrom(
					com.google.protobuf.CodedInputStream input,
					com.google.protobuf.ExtensionRegistryLite extensionRegistry)
					throws java.io.IOException {
				de.javakaffee.kryoserializers.protobuf.SampleProtoAOuterClass.SampleProtoA parsedMessage = null;
				try {
					parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
				} catch (com.google.protobuf.InvalidProtocolBufferException e) {
					parsedMessage = (de.javakaffee.kryoserializers.protobuf.SampleProtoAOuterClass.SampleProtoA) e.getUnfinishedMessage();
					throw e;
				} finally {
					if (parsedMessage != null) {
						mergeFrom(parsedMessage);
					}
				}
				return this;
			}

			private int bitField0_;

			private java.lang.Object name_ = "";

			/**
			 * <code>optional string name = 1;</code>
			 */
			public boolean hasName() {
				return ((bitField0_ & 0x00000001) == 0x00000001);
			}

			/**
			 * <code>optional string name = 1;</code>
			 */
			public java.lang.String getName() {
				java.lang.Object ref = name_;
				if (!(ref instanceof java.lang.String)) {
					com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
					java.lang.String s = bs.toStringUtf8();
					if (bs.isValidUtf8()) {
						name_ = s;
					}
					return s;
				} else {
					return (java.lang.String) ref;
				}
			}

			/**
			 * <code>optional string name = 1;</code>
			 */
			public com.google.protobuf.ByteString getNameBytes() {
				java.lang.Object ref = name_;
				if (ref instanceof String) {
					com.google.protobuf.ByteString b = com.google.protobuf.ByteString.copyFromUtf8(
							(java.lang.String) ref);
					name_ = b;
					return b;
				} else {
					return (com.google.protobuf.ByteString) ref;
				}
			}

			/**
			 * <code>optional string name = 1;</code>
			 */
			public Builder setName(
					java.lang.String value) {
				if (value == null) {
					throw new NullPointerException();
				}
				bitField0_ |= 0x00000001;
				name_ = value;
				onChanged();
				return this;
			}

			/**
			 * <code>optional string name = 1;</code>
			 */
			public Builder clearName() {
				bitField0_ = (bitField0_ & ~0x00000001);
				name_ = getDefaultInstance().getName();
				onChanged();
				return this;
			}

			/**
			 * <code>optional string name = 1;</code>
			 */
			public Builder setNameBytes(
					com.google.protobuf.ByteString value) {
				if (value == null) {
					throw new NullPointerException();
				}
				bitField0_ |= 0x00000001;
				name_ = value;
				onChanged();
				return this;
			}

			private int messageId_;

			/**
			 * <code>optional uint32 message_id = 2;</code>
			 */
			public boolean hasMessageId() {
				return ((bitField0_ & 0x00000002) == 0x00000002);
			}

			/**
			 * <code>optional uint32 message_id = 2;</code>
			 */
			public int getMessageId() {
				return messageId_;
			}

			/**
			 * <code>optional uint32 message_id = 2;</code>
			 */
			public Builder setMessageId(int value) {
				bitField0_ |= 0x00000002;
				messageId_ = value;
				onChanged();
				return this;
			}

			/**
			 * <code>optional uint32 message_id = 2;</code>
			 */
			public Builder clearMessageId() {
				bitField0_ = (bitField0_ & ~0x00000002);
				messageId_ = 0;
				onChanged();
				return this;
			}

			// @@protoc_insertion_point(builder_scope:ProtocolBuffers.SampleProtoA)
		}

		static {
			defaultInstance = new SampleProtoA(true);
			defaultInstance.initFields();
		}

		// @@protoc_insertion_point(class_scope:ProtocolBuffers.SampleProtoA)
	}

	private static final com.google.protobuf.Descriptors.Descriptor internal_static_ProtocolBuffers_SampleProtoA_descriptor;
	private static com.google.protobuf.GeneratedMessage.FieldAccessorTable internal_static_ProtocolBuffers_SampleProtoA_fieldAccessorTable;

	public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
		return descriptor;
	}

	private static com.google.protobuf.Descriptors.FileDescriptor descriptor;
	static {
		java.lang.String[] descriptorData = {
				"\n\022SampleProtoA.proto\022\017ProtocolBuffers\"0\n" +
						"\014SampleProtoA\022\014\n\004name\030\001 \001(\t\022\022\n\nmessage_i" +
						"d\030\002 \001(\rB@\n&de.javakaffee.kryoserializers" +
						".protobufB\026SampleProtoAOuterClass"
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
		internal_static_ProtocolBuffers_SampleProtoA_descriptor = getDescriptor().getMessageTypes().get(0);
		internal_static_ProtocolBuffers_SampleProtoA_fieldAccessorTable = new com.google.protobuf.GeneratedMessage.FieldAccessorTable(
				internal_static_ProtocolBuffers_SampleProtoA_descriptor,
				new java.lang.String[]{"Name", "MessageId",});
	}

	// @@protoc_insertion_point(outer_class_scope)
}
