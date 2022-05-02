/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/datastore/v1/datastore.proto

package com.google.datastore.v1;

/**
 *
 *
 * <pre>
 * The result of applying a mutation.
 * </pre>
 *
 * Protobuf type {@code google.datastore.v1.MutationResult}
 */
public final class MutationResult extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.datastore.v1.MutationResult)
    MutationResultOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use MutationResult.newBuilder() to construct.
  private MutationResult(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private MutationResult() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new MutationResult();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private MutationResult(
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
          case 26:
            {
              com.google.datastore.v1.Key.Builder subBuilder = null;
              if (key_ != null) {
                subBuilder = key_.toBuilder();
              }
              key_ = input.readMessage(com.google.datastore.v1.Key.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(key_);
                key_ = subBuilder.buildPartial();
              }

              break;
            }
          case 32:
            {
              version_ = input.readInt64();
              break;
            }
          case 40:
            {
              conflictDetected_ = input.readBool();
              break;
            }
          case 50:
            {
              com.google.protobuf.Timestamp.Builder subBuilder = null;
              if (updateTime_ != null) {
                subBuilder = updateTime_.toBuilder();
              }
              updateTime_ =
                  input.readMessage(com.google.protobuf.Timestamp.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(updateTime_);
                updateTime_ = subBuilder.buildPartial();
              }

              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.datastore.v1.DatastoreProto
        .internal_static_google_datastore_v1_MutationResult_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.datastore.v1.DatastoreProto
        .internal_static_google_datastore_v1_MutationResult_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.datastore.v1.MutationResult.class,
            com.google.datastore.v1.MutationResult.Builder.class);
  }

  public static final int KEY_FIELD_NUMBER = 3;
  private com.google.datastore.v1.Key key_;
  /**
   *
   *
   * <pre>
   * The automatically allocated key.
   * Set only when the mutation allocated a key.
   * </pre>
   *
   * <code>.google.datastore.v1.Key key = 3;</code>
   *
   * @return Whether the key field is set.
   */
  @java.lang.Override
  public boolean hasKey() {
    return key_ != null;
  }
  /**
   *
   *
   * <pre>
   * The automatically allocated key.
   * Set only when the mutation allocated a key.
   * </pre>
   *
   * <code>.google.datastore.v1.Key key = 3;</code>
   *
   * @return The key.
   */
  @java.lang.Override
  public com.google.datastore.v1.Key getKey() {
    return key_ == null ? com.google.datastore.v1.Key.getDefaultInstance() : key_;
  }
  /**
   *
   *
   * <pre>
   * The automatically allocated key.
   * Set only when the mutation allocated a key.
   * </pre>
   *
   * <code>.google.datastore.v1.Key key = 3;</code>
   */
  @java.lang.Override
  public com.google.datastore.v1.KeyOrBuilder getKeyOrBuilder() {
    return getKey();
  }

  public static final int VERSION_FIELD_NUMBER = 4;
  private long version_;
  /**
   *
   *
   * <pre>
   * The version of the entity on the server after processing the mutation. If
   * the mutation doesn't change anything on the server, then the version will
   * be the version of the current entity or, if no entity is present, a version
   * that is strictly greater than the version of any previous entity and less
   * than the version of any possible future entity.
   * </pre>
   *
   * <code>int64 version = 4;</code>
   *
   * @return The version.
   */
  @java.lang.Override
  public long getVersion() {
    return version_;
  }

  public static final int UPDATE_TIME_FIELD_NUMBER = 6;
  private com.google.protobuf.Timestamp updateTime_;
  /**
   *
   *
   * <pre>
   * The update time of the entity on the server after processing the mutation.
   * If the mutation doesn't change anything on the server, then the timestamp
   * will be the update timestamp of the current entity. This field will not be
   * set after a 'delete'.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 6;</code>
   *
   * @return Whether the updateTime field is set.
   */
  @java.lang.Override
  public boolean hasUpdateTime() {
    return updateTime_ != null;
  }
  /**
   *
   *
   * <pre>
   * The update time of the entity on the server after processing the mutation.
   * If the mutation doesn't change anything on the server, then the timestamp
   * will be the update timestamp of the current entity. This field will not be
   * set after a 'delete'.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 6;</code>
   *
   * @return The updateTime.
   */
  @java.lang.Override
  public com.google.protobuf.Timestamp getUpdateTime() {
    return updateTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : updateTime_;
  }
  /**
   *
   *
   * <pre>
   * The update time of the entity on the server after processing the mutation.
   * If the mutation doesn't change anything on the server, then the timestamp
   * will be the update timestamp of the current entity. This field will not be
   * set after a 'delete'.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 6;</code>
   */
  @java.lang.Override
  public com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder() {
    return getUpdateTime();
  }

  public static final int CONFLICT_DETECTED_FIELD_NUMBER = 5;
  private boolean conflictDetected_;
  /**
   *
   *
   * <pre>
   * Whether a conflict was detected for this mutation. Always false when a
   * conflict detection strategy field is not set in the mutation.
   * </pre>
   *
   * <code>bool conflict_detected = 5;</code>
   *
   * @return The conflictDetected.
   */
  @java.lang.Override
  public boolean getConflictDetected() {
    return conflictDetected_;
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
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (key_ != null) {
      output.writeMessage(3, getKey());
    }
    if (version_ != 0L) {
      output.writeInt64(4, version_);
    }
    if (conflictDetected_ != false) {
      output.writeBool(5, conflictDetected_);
    }
    if (updateTime_ != null) {
      output.writeMessage(6, getUpdateTime());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (key_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(3, getKey());
    }
    if (version_ != 0L) {
      size += com.google.protobuf.CodedOutputStream.computeInt64Size(4, version_);
    }
    if (conflictDetected_ != false) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(5, conflictDetected_);
    }
    if (updateTime_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(6, getUpdateTime());
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
    if (!(obj instanceof com.google.datastore.v1.MutationResult)) {
      return super.equals(obj);
    }
    com.google.datastore.v1.MutationResult other = (com.google.datastore.v1.MutationResult) obj;

    if (hasKey() != other.hasKey()) return false;
    if (hasKey()) {
      if (!getKey().equals(other.getKey())) return false;
    }
    if (getVersion() != other.getVersion()) return false;
    if (hasUpdateTime() != other.hasUpdateTime()) return false;
    if (hasUpdateTime()) {
      if (!getUpdateTime().equals(other.getUpdateTime())) return false;
    }
    if (getConflictDetected() != other.getConflictDetected()) return false;
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
    if (hasKey()) {
      hash = (37 * hash) + KEY_FIELD_NUMBER;
      hash = (53 * hash) + getKey().hashCode();
    }
    hash = (37 * hash) + VERSION_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(getVersion());
    if (hasUpdateTime()) {
      hash = (37 * hash) + UPDATE_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getUpdateTime().hashCode();
    }
    hash = (37 * hash) + CONFLICT_DETECTED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getConflictDetected());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.datastore.v1.MutationResult parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.datastore.v1.MutationResult parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.datastore.v1.MutationResult parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.datastore.v1.MutationResult parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.datastore.v1.MutationResult parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.datastore.v1.MutationResult parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.datastore.v1.MutationResult parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.datastore.v1.MutationResult parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.datastore.v1.MutationResult parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.datastore.v1.MutationResult parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.datastore.v1.MutationResult parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.datastore.v1.MutationResult parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(com.google.datastore.v1.MutationResult prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * The result of applying a mutation.
   * </pre>
   *
   * Protobuf type {@code google.datastore.v1.MutationResult}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.datastore.v1.MutationResult)
      com.google.datastore.v1.MutationResultOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.datastore.v1.DatastoreProto
          .internal_static_google_datastore_v1_MutationResult_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.datastore.v1.DatastoreProto
          .internal_static_google_datastore_v1_MutationResult_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.datastore.v1.MutationResult.class,
              com.google.datastore.v1.MutationResult.Builder.class);
    }

    // Construct using com.google.datastore.v1.MutationResult.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (keyBuilder_ == null) {
        key_ = null;
      } else {
        key_ = null;
        keyBuilder_ = null;
      }
      version_ = 0L;

      if (updateTimeBuilder_ == null) {
        updateTime_ = null;
      } else {
        updateTime_ = null;
        updateTimeBuilder_ = null;
      }
      conflictDetected_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.datastore.v1.DatastoreProto
          .internal_static_google_datastore_v1_MutationResult_descriptor;
    }

    @java.lang.Override
    public com.google.datastore.v1.MutationResult getDefaultInstanceForType() {
      return com.google.datastore.v1.MutationResult.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.datastore.v1.MutationResult build() {
      com.google.datastore.v1.MutationResult result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.datastore.v1.MutationResult buildPartial() {
      com.google.datastore.v1.MutationResult result =
          new com.google.datastore.v1.MutationResult(this);
      if (keyBuilder_ == null) {
        result.key_ = key_;
      } else {
        result.key_ = keyBuilder_.build();
      }
      result.version_ = version_;
      if (updateTimeBuilder_ == null) {
        result.updateTime_ = updateTime_;
      } else {
        result.updateTime_ = updateTimeBuilder_.build();
      }
      result.conflictDetected_ = conflictDetected_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.datastore.v1.MutationResult) {
        return mergeFrom((com.google.datastore.v1.MutationResult) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.datastore.v1.MutationResult other) {
      if (other == com.google.datastore.v1.MutationResult.getDefaultInstance()) return this;
      if (other.hasKey()) {
        mergeKey(other.getKey());
      }
      if (other.getVersion() != 0L) {
        setVersion(other.getVersion());
      }
      if (other.hasUpdateTime()) {
        mergeUpdateTime(other.getUpdateTime());
      }
      if (other.getConflictDetected() != false) {
        setConflictDetected(other.getConflictDetected());
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
      com.google.datastore.v1.MutationResult parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.datastore.v1.MutationResult) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.datastore.v1.Key key_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.datastore.v1.Key,
            com.google.datastore.v1.Key.Builder,
            com.google.datastore.v1.KeyOrBuilder>
        keyBuilder_;
    /**
     *
     *
     * <pre>
     * The automatically allocated key.
     * Set only when the mutation allocated a key.
     * </pre>
     *
     * <code>.google.datastore.v1.Key key = 3;</code>
     *
     * @return Whether the key field is set.
     */
    public boolean hasKey() {
      return keyBuilder_ != null || key_ != null;
    }
    /**
     *
     *
     * <pre>
     * The automatically allocated key.
     * Set only when the mutation allocated a key.
     * </pre>
     *
     * <code>.google.datastore.v1.Key key = 3;</code>
     *
     * @return The key.
     */
    public com.google.datastore.v1.Key getKey() {
      if (keyBuilder_ == null) {
        return key_ == null ? com.google.datastore.v1.Key.getDefaultInstance() : key_;
      } else {
        return keyBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * The automatically allocated key.
     * Set only when the mutation allocated a key.
     * </pre>
     *
     * <code>.google.datastore.v1.Key key = 3;</code>
     */
    public Builder setKey(com.google.datastore.v1.Key value) {
      if (keyBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        key_ = value;
        onChanged();
      } else {
        keyBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The automatically allocated key.
     * Set only when the mutation allocated a key.
     * </pre>
     *
     * <code>.google.datastore.v1.Key key = 3;</code>
     */
    public Builder setKey(com.google.datastore.v1.Key.Builder builderForValue) {
      if (keyBuilder_ == null) {
        key_ = builderForValue.build();
        onChanged();
      } else {
        keyBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The automatically allocated key.
     * Set only when the mutation allocated a key.
     * </pre>
     *
     * <code>.google.datastore.v1.Key key = 3;</code>
     */
    public Builder mergeKey(com.google.datastore.v1.Key value) {
      if (keyBuilder_ == null) {
        if (key_ != null) {
          key_ = com.google.datastore.v1.Key.newBuilder(key_).mergeFrom(value).buildPartial();
        } else {
          key_ = value;
        }
        onChanged();
      } else {
        keyBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The automatically allocated key.
     * Set only when the mutation allocated a key.
     * </pre>
     *
     * <code>.google.datastore.v1.Key key = 3;</code>
     */
    public Builder clearKey() {
      if (keyBuilder_ == null) {
        key_ = null;
        onChanged();
      } else {
        key_ = null;
        keyBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The automatically allocated key.
     * Set only when the mutation allocated a key.
     * </pre>
     *
     * <code>.google.datastore.v1.Key key = 3;</code>
     */
    public com.google.datastore.v1.Key.Builder getKeyBuilder() {

      onChanged();
      return getKeyFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * The automatically allocated key.
     * Set only when the mutation allocated a key.
     * </pre>
     *
     * <code>.google.datastore.v1.Key key = 3;</code>
     */
    public com.google.datastore.v1.KeyOrBuilder getKeyOrBuilder() {
      if (keyBuilder_ != null) {
        return keyBuilder_.getMessageOrBuilder();
      } else {
        return key_ == null ? com.google.datastore.v1.Key.getDefaultInstance() : key_;
      }
    }
    /**
     *
     *
     * <pre>
     * The automatically allocated key.
     * Set only when the mutation allocated a key.
     * </pre>
     *
     * <code>.google.datastore.v1.Key key = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.datastore.v1.Key,
            com.google.datastore.v1.Key.Builder,
            com.google.datastore.v1.KeyOrBuilder>
        getKeyFieldBuilder() {
      if (keyBuilder_ == null) {
        keyBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.datastore.v1.Key,
                com.google.datastore.v1.Key.Builder,
                com.google.datastore.v1.KeyOrBuilder>(getKey(), getParentForChildren(), isClean());
        key_ = null;
      }
      return keyBuilder_;
    }

    private long version_;
    /**
     *
     *
     * <pre>
     * The version of the entity on the server after processing the mutation. If
     * the mutation doesn't change anything on the server, then the version will
     * be the version of the current entity or, if no entity is present, a version
     * that is strictly greater than the version of any previous entity and less
     * than the version of any possible future entity.
     * </pre>
     *
     * <code>int64 version = 4;</code>
     *
     * @return The version.
     */
    @java.lang.Override
    public long getVersion() {
      return version_;
    }
    /**
     *
     *
     * <pre>
     * The version of the entity on the server after processing the mutation. If
     * the mutation doesn't change anything on the server, then the version will
     * be the version of the current entity or, if no entity is present, a version
     * that is strictly greater than the version of any previous entity and less
     * than the version of any possible future entity.
     * </pre>
     *
     * <code>int64 version = 4;</code>
     *
     * @param value The version to set.
     * @return This builder for chaining.
     */
    public Builder setVersion(long value) {

      version_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The version of the entity on the server after processing the mutation. If
     * the mutation doesn't change anything on the server, then the version will
     * be the version of the current entity or, if no entity is present, a version
     * that is strictly greater than the version of any previous entity and less
     * than the version of any possible future entity.
     * </pre>
     *
     * <code>int64 version = 4;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearVersion() {

      version_ = 0L;
      onChanged();
      return this;
    }

    private com.google.protobuf.Timestamp updateTime_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp,
            com.google.protobuf.Timestamp.Builder,
            com.google.protobuf.TimestampOrBuilder>
        updateTimeBuilder_;
    /**
     *
     *
     * <pre>
     * The update time of the entity on the server after processing the mutation.
     * If the mutation doesn't change anything on the server, then the timestamp
     * will be the update timestamp of the current entity. This field will not be
     * set after a 'delete'.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp update_time = 6;</code>
     *
     * @return Whether the updateTime field is set.
     */
    public boolean hasUpdateTime() {
      return updateTimeBuilder_ != null || updateTime_ != null;
    }
    /**
     *
     *
     * <pre>
     * The update time of the entity on the server after processing the mutation.
     * If the mutation doesn't change anything on the server, then the timestamp
     * will be the update timestamp of the current entity. This field will not be
     * set after a 'delete'.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp update_time = 6;</code>
     *
     * @return The updateTime.
     */
    public com.google.protobuf.Timestamp getUpdateTime() {
      if (updateTimeBuilder_ == null) {
        return updateTime_ == null
            ? com.google.protobuf.Timestamp.getDefaultInstance()
            : updateTime_;
      } else {
        return updateTimeBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * The update time of the entity on the server after processing the mutation.
     * If the mutation doesn't change anything on the server, then the timestamp
     * will be the update timestamp of the current entity. This field will not be
     * set after a 'delete'.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp update_time = 6;</code>
     */
    public Builder setUpdateTime(com.google.protobuf.Timestamp value) {
      if (updateTimeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        updateTime_ = value;
        onChanged();
      } else {
        updateTimeBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The update time of the entity on the server after processing the mutation.
     * If the mutation doesn't change anything on the server, then the timestamp
     * will be the update timestamp of the current entity. This field will not be
     * set after a 'delete'.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp update_time = 6;</code>
     */
    public Builder setUpdateTime(com.google.protobuf.Timestamp.Builder builderForValue) {
      if (updateTimeBuilder_ == null) {
        updateTime_ = builderForValue.build();
        onChanged();
      } else {
        updateTimeBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The update time of the entity on the server after processing the mutation.
     * If the mutation doesn't change anything on the server, then the timestamp
     * will be the update timestamp of the current entity. This field will not be
     * set after a 'delete'.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp update_time = 6;</code>
     */
    public Builder mergeUpdateTime(com.google.protobuf.Timestamp value) {
      if (updateTimeBuilder_ == null) {
        if (updateTime_ != null) {
          updateTime_ =
              com.google.protobuf.Timestamp.newBuilder(updateTime_).mergeFrom(value).buildPartial();
        } else {
          updateTime_ = value;
        }
        onChanged();
      } else {
        updateTimeBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The update time of the entity on the server after processing the mutation.
     * If the mutation doesn't change anything on the server, then the timestamp
     * will be the update timestamp of the current entity. This field will not be
     * set after a 'delete'.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp update_time = 6;</code>
     */
    public Builder clearUpdateTime() {
      if (updateTimeBuilder_ == null) {
        updateTime_ = null;
        onChanged();
      } else {
        updateTime_ = null;
        updateTimeBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The update time of the entity on the server after processing the mutation.
     * If the mutation doesn't change anything on the server, then the timestamp
     * will be the update timestamp of the current entity. This field will not be
     * set after a 'delete'.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp update_time = 6;</code>
     */
    public com.google.protobuf.Timestamp.Builder getUpdateTimeBuilder() {

      onChanged();
      return getUpdateTimeFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * The update time of the entity on the server after processing the mutation.
     * If the mutation doesn't change anything on the server, then the timestamp
     * will be the update timestamp of the current entity. This field will not be
     * set after a 'delete'.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp update_time = 6;</code>
     */
    public com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder() {
      if (updateTimeBuilder_ != null) {
        return updateTimeBuilder_.getMessageOrBuilder();
      } else {
        return updateTime_ == null
            ? com.google.protobuf.Timestamp.getDefaultInstance()
            : updateTime_;
      }
    }
    /**
     *
     *
     * <pre>
     * The update time of the entity on the server after processing the mutation.
     * If the mutation doesn't change anything on the server, then the timestamp
     * will be the update timestamp of the current entity. This field will not be
     * set after a 'delete'.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp update_time = 6;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp,
            com.google.protobuf.Timestamp.Builder,
            com.google.protobuf.TimestampOrBuilder>
        getUpdateTimeFieldBuilder() {
      if (updateTimeBuilder_ == null) {
        updateTimeBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.protobuf.Timestamp,
                com.google.protobuf.Timestamp.Builder,
                com.google.protobuf.TimestampOrBuilder>(
                getUpdateTime(), getParentForChildren(), isClean());
        updateTime_ = null;
      }
      return updateTimeBuilder_;
    }

    private boolean conflictDetected_;
    /**
     *
     *
     * <pre>
     * Whether a conflict was detected for this mutation. Always false when a
     * conflict detection strategy field is not set in the mutation.
     * </pre>
     *
     * <code>bool conflict_detected = 5;</code>
     *
     * @return The conflictDetected.
     */
    @java.lang.Override
    public boolean getConflictDetected() {
      return conflictDetected_;
    }
    /**
     *
     *
     * <pre>
     * Whether a conflict was detected for this mutation. Always false when a
     * conflict detection strategy field is not set in the mutation.
     * </pre>
     *
     * <code>bool conflict_detected = 5;</code>
     *
     * @param value The conflictDetected to set.
     * @return This builder for chaining.
     */
    public Builder setConflictDetected(boolean value) {

      conflictDetected_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Whether a conflict was detected for this mutation. Always false when a
     * conflict detection strategy field is not set in the mutation.
     * </pre>
     *
     * <code>bool conflict_detected = 5;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearConflictDetected() {

      conflictDetected_ = false;
      onChanged();
      return this;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.datastore.v1.MutationResult)
  }

  // @@protoc_insertion_point(class_scope:google.datastore.v1.MutationResult)
  private static final com.google.datastore.v1.MutationResult DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.datastore.v1.MutationResult();
  }

  public static com.google.datastore.v1.MutationResult getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MutationResult> PARSER =
      new com.google.protobuf.AbstractParser<MutationResult>() {
        @java.lang.Override
        public MutationResult parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new MutationResult(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<MutationResult> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MutationResult> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.datastore.v1.MutationResult getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
