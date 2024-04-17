/*
 * Copyright 2024 Google LLC
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
// source: google/datastore/v1/query.proto

// Protobuf Java Version: 3.25.3
package com.google.datastore.v1;

public interface EntityResultOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.datastore.v1.EntityResult)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The resulting entity.
   * </pre>
   *
   * <code>.google.datastore.v1.Entity entity = 1;</code>
   *
   * @return Whether the entity field is set.
   */
  boolean hasEntity();
  /**
   *
   *
   * <pre>
   * The resulting entity.
   * </pre>
   *
   * <code>.google.datastore.v1.Entity entity = 1;</code>
   *
   * @return The entity.
   */
  com.google.datastore.v1.Entity getEntity();
  /**
   *
   *
   * <pre>
   * The resulting entity.
   * </pre>
   *
   * <code>.google.datastore.v1.Entity entity = 1;</code>
   */
  com.google.datastore.v1.EntityOrBuilder getEntityOrBuilder();

  /**
   *
   *
   * <pre>
   * The version of the entity, a strictly positive number that monotonically
   * increases with changes to the entity.
   *
   * This field is set for
   * [`FULL`][google.datastore.v1.EntityResult.ResultType.FULL] entity results.
   *
   * For [missing][google.datastore.v1.LookupResponse.missing] entities in
   * `LookupResponse`, this is the version of the snapshot that was used to look
   * up the entity, and it is always set except for eventually consistent reads.
   * </pre>
   *
   * <code>int64 version = 4;</code>
   *
   * @return The version.
   */
  long getVersion();

  /**
   *
   *
   * <pre>
   * The time at which the entity was created.
   * This field is set for
   * [`FULL`][google.datastore.v1.EntityResult.ResultType.FULL] entity results.
   * If this entity is missing, this field will not be set.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 6;</code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * The time at which the entity was created.
   * This field is set for
   * [`FULL`][google.datastore.v1.EntityResult.ResultType.FULL] entity results.
   * If this entity is missing, this field will not be set.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 6;</code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * The time at which the entity was created.
   * This field is set for
   * [`FULL`][google.datastore.v1.EntityResult.ResultType.FULL] entity results.
   * If this entity is missing, this field will not be set.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 6;</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * The time at which the entity was last changed.
   * This field is set for
   * [`FULL`][google.datastore.v1.EntityResult.ResultType.FULL] entity results.
   * If this entity is missing, this field will not be set.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 5;</code>
   *
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   *
   *
   * <pre>
   * The time at which the entity was last changed.
   * This field is set for
   * [`FULL`][google.datastore.v1.EntityResult.ResultType.FULL] entity results.
   * If this entity is missing, this field will not be set.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 5;</code>
   *
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   *
   *
   * <pre>
   * The time at which the entity was last changed.
   * This field is set for
   * [`FULL`][google.datastore.v1.EntityResult.ResultType.FULL] entity results.
   * If this entity is missing, this field will not be set.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 5;</code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * A cursor that points to the position after the result entity.
   * Set only when the `EntityResult` is part of a `QueryResultBatch` message.
   * </pre>
   *
   * <code>bytes cursor = 3;</code>
   *
   * @return The cursor.
   */
  com.google.protobuf.ByteString getCursor();
}
