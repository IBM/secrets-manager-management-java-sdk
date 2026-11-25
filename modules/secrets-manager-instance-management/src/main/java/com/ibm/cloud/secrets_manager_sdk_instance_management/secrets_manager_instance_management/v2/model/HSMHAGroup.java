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
import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * An HA Group resource. All fields are top-level — no vendor_config wrapper.
 */
public class HSMHAGroup extends GenericModel {

  /**
   * Lifecycle state of the HA Group:
   * - `completed`: HA Group has been created and its config has been staged in the HSM config file. Initial and only
   * state.
   *
   * **Note:** New values may be added to this enumeration in future API versions. Clients MUST handle unknown values
   * gracefully and MUST NOT fail on unrecognised states.
   */
  public interface ProvisioningState {
    /** completed. */
    String COMPLETED = "completed";
  }

  /**
   * AS OF health state. Written exclusively by POST …/health and POST …/apply:
   * - `unknown`: Initial state on creation. No health check has been performed yet.
   * - `evaluating`: A health check is in progress for this resource.
   * - `in_progress`: An apply operation is running across the destination.
   * - `healthy`: Configured AND all member HSM nodes are healthy.
   * - `degraded`: Configured AND any one member is unhealthy (but not all).
   * - `unhealthy`: Configured AND all members are unhealthy or unknown.
   * - `not_configured`: Prerequisites not met (destination needs ≥1 path with active non-expired Server CA AND ≥1
   * active non-expired client certificate).
   */
  public interface HealthState {
    /** unknown. */
    String UNKNOWN = "unknown";
    /** evaluating. */
    String EVALUATING = "evaluating";
    /** in_progress. */
    String IN_PROGRESS = "in_progress";
    /** healthy. */
    String HEALTHY = "healthy";
    /** degraded. */
    String DEGRADED = "degraded";
    /** unhealthy. */
    String UNHEALTHY = "unhealthy";
    /** not_configured. */
    String NOT_CONFIGURED = "not_configured";
  }

  protected String id;
  protected String href;
  protected String name;
  protected String description;
  @SerializedName("provisioning_state")
  protected String provisioningState;
  @SerializedName("health_state")
  protected String healthState;
  @SerializedName("health_as_of")
  protected Date healthAsOf;
  @SerializedName("group_label")
  protected String groupLabel;
  @SerializedName("group_serial")
  protected String groupSerial;
  @SerializedName("member_serials")
  protected List<String> memberSerials;
  @SerializedName("created_at")
  protected Date createdAt;
  @SerializedName("updated_at")
  protected Date updatedAt;
  @SerializedName("created_by")
  protected String createdBy;
  @SerializedName("updated_by")
  protected String updatedBy;

  protected HSMHAGroup() { }

  /**
   * Gets the id.
   *
   * HA Group ID. Immutable. System-managed.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the href.
   *
   * URL of the HA Group resource.
   *
   * @return the href
   */
  public String getHref() {
    return href;
  }

  /**
   * Gets the name.
   *
   * Human-readable display name.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Gets the description.
   *
   * Optional description. Omitted if not set.
   *
   * @return the description
   */
  public String getDescription() {
    return description;
  }

  /**
   * Gets the provisioningState.
   *
   * Lifecycle state of the HA Group:
   * - `completed`: HA Group has been created and its config has been staged in the HSM config file. Initial and only
   * state.
   *
   * **Note:** New values may be added to this enumeration in future API versions. Clients MUST handle unknown values
   * gracefully and MUST NOT fail on unrecognised states.
   *
   * @return the provisioningState
   */
  public String getProvisioningState() {
    return provisioningState;
  }

  /**
   * Gets the healthState.
   *
   * AS OF health state. Written exclusively by POST …/health and POST …/apply:
   * - `unknown`: Initial state on creation. No health check has been performed yet.
   * - `evaluating`: A health check is in progress for this resource.
   * - `in_progress`: An apply operation is running across the destination.
   * - `healthy`: Configured AND all member HSM nodes are healthy.
   * - `degraded`: Configured AND any one member is unhealthy (but not all).
   * - `unhealthy`: Configured AND all members are unhealthy or unknown.
   * - `not_configured`: Prerequisites not met (destination needs ≥1 path with active non-expired Server CA AND ≥1
   * active non-expired client certificate).
   *
   * @return the healthState
   */
  public String getHealthState() {
    return healthState;
  }

  /**
   * Gets the healthAsOf.
   *
   * Timestamp of the last health evaluation. On creation equals `created_at`. Updated only by POST …/health.
   *
   * @return the healthAsOf
   */
  public Date getHealthAsOf() {
    return healthAsOf;
  }

  /**
   * Gets the groupLabel.
   *
   * HA Group virtual token label. Immutable after creation.
   *
   * @return the groupLabel
   */
  public String getGroupLabel() {
    return groupLabel;
  }

  /**
   * Gets the groupSerial.
   *
   * HA Group serial number. Immutable after creation.
   *
   * @return the groupSerial
   */
  public String getGroupSerial() {
    return groupSerial;
  }

  /**
   * Gets the memberSerials.
   *
   * Ordered list of HSM node member serial numbers for this HA Group. Max 100 unique members.
   *
   * @return the memberSerials
   */
  public List<String> getMemberSerials() {
    return memberSerials;
  }

  /**
   * Gets the createdAt.
   *
   * Computed field.
   *
   * @return the createdAt
   */
  public Date getCreatedAt() {
    return createdAt;
  }

  /**
   * Gets the updatedAt.
   *
   * Computed field. Omitted until first update.
   *
   * @return the updatedAt
   */
  public Date getUpdatedAt() {
    return updatedAt;
  }

  /**
   * Gets the createdBy.
   *
   * Computed field.
   *
   * @return the createdBy
   */
  public String getCreatedBy() {
    return createdBy;
  }

  /**
   * Gets the updatedBy.
   *
   * Computed field. Omitted until first update.
   *
   * @return the updatedBy
   */
  public String getUpdatedBy() {
    return updatedBy;
  }
}

