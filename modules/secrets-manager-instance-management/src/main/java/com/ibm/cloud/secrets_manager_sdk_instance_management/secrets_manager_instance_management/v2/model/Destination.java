/*
 * (C) Copyright IBM Corp. 2026.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */

package com.ibm.cloud.secrets_manager_sdk_instance_management.secrets_manager_instance_management.v2.model;

import java.util.Date;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * A destination resource representing a private network link to a service instance on a Vault Dedicated cluster.
 */
public class Destination extends GenericModel {

  /**
   * Destination type.
   */
  public interface Type {
    /** ibm_cloud_database. */
    String IBM_CLOUD_DATABASE = "ibm_cloud_database";
  }

  /**
   * Destination state:
   * - `not_started`: Initial state before the first provisioning attempt begins
   * - `provisioning`: Provisioning in progress — poll until `succeeded` or `failed`
   * - `succeeded`: Destination ready and usable
   * - `failed`: Terminal state reached when provisioning or deletion fails. A `failed` destination still counts against
   * the per-instance quota until deleted.
   * - `deleting`: Deletion in progress.
   */
  public interface State {
    /** not_started. */
    String NOT_STARTED = "not_started";
    /** provisioning. */
    String PROVISIONING = "provisioning";
    /** succeeded. */
    String SUCCEEDED = "succeeded";
    /** failed. */
    String FAILED = "failed";
    /** deleting. */
    String DELETING = "deleting";
  }

  protected String id;
  protected String href;
  protected String name;
  protected String type;
  protected String description;
  protected String state;
  @SerializedName("created_at")
  protected Date createdAt;
  @SerializedName("updated_at")
  protected Date updatedAt;
  @SerializedName("created_by")
  protected String createdBy;
  protected String message;

  protected Destination() { }

  /**
   * Gets the id.
   *
   * Destination ID.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the href.
   *
   * The URL of the destination resource.
   *
   * @return the href
   */
  public String getHref() {
    return href;
  }

  /**
   * Gets the name.
   *
   * Destination name.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Gets the type.
   *
   * Destination type.
   *
   * @return the type
   */
  public String getType() {
    return type;
  }

  /**
   * Gets the description.
   *
   * Optional description.
   *
   * @return the description
   */
  public String getDescription() {
    return description;
  }

  /**
   * Gets the state.
   *
   * Destination state:
   * - `not_started`: Initial state before the first provisioning attempt begins
   * - `provisioning`: Provisioning in progress — poll until `succeeded` or `failed`
   * - `succeeded`: Destination ready and usable
   * - `failed`: Terminal state reached when provisioning or deletion fails. A `failed` destination still counts against
   * the per-instance quota until deleted.
   * - `deleting`: Deletion in progress.
   *
   * @return the state
   */
  public String getState() {
    return state;
  }

  /**
   * Gets the createdAt.
   *
   * Timestamp when the destination was created.
   *
   * @return the createdAt
   */
  public Date getCreatedAt() {
    return createdAt;
  }

  /**
   * Gets the updatedAt.
   *
   * Timestamp when the destination was last updated.
   *
   * @return the updatedAt
   */
  public Date getUpdatedAt() {
    return updatedAt;
  }

  /**
   * Gets the createdBy.
   *
   * IAM identity that created the destination.
   *
   * @return the createdBy
   */
  public String getCreatedBy() {
    return createdBy;
  }

  /**
   * Gets the message.
   *
   * Human-readable message providing additional context about the current state. Present only when non-empty — set when
   * `state` is `failed`, describing why provisioning or deletion failed.
   *
   * @return the message
   */
  public String getMessage() {
    return message;
  }
}

