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
 * An HSM Destination resource.
 */
public class HSMDestination extends GenericModel {

  /**
   * HSM vendor. Immutable after creation.
   */
  public interface Vendor {
    /** thales_luna. */
    String THALES_LUNA = "thales_luna";
  }

  /**
   * Lifecycle state of the destination:
   * - `completed`: Destination created and available for configuration. Initial state on POST.
   * - `deleting`: Hard delete initiated; asynchronous cleanup in progress.
   * - `deletion_failed`: Asynchronous delete failed; the destination still exists. Retry DELETE to re-initiate.
   */
  public interface ProvisioningState {
    /** completed. */
    String COMPLETED = "completed";
    /** deleting. */
    String DELETING = "deleting";
    /** deletion_failed. */
    String DELETION_FAILED = "deletion_failed";
  }

  /**
   * AS OF (point-in-time) health state. Written exclusively by POST …/health and POST …/apply:
   * - `unknown`: Health check not yet performed, or destination is deleting/deletion_failed.
   * - `evaluating`: A health check (POST …/health) is in progress. Set on acceptance; replaced when the check
   * completes.
   * - `in_progress`: An apply operation (POST …/apply) is running. Set on acceptance; replaced by the health check
   * result once apply completes (or set to `unknown` on failure).
   * - `not_configured`: Prerequisites not met (needs ≥1 HA Group, ≥1 path with active non-expired Server CA, and ≥1
   * active non-expired client certificate).
   * - `healthy`: All non-`not_configured` HSM HA Groups are `healthy` or `degraded`.
   * - `degraded`: Some non-`not_configured` HSM HA Groups are `unhealthy`/`unknown` AND at least one is `healthy`.
   * - `unhealthy`: All non-`not_configured` HSM HA Groups are `unhealthy` or `unknown`.
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
  @SerializedName("account_id")
  protected String accountId;
  protected String name;
  protected String description;
  protected String vendor;
  @SerializedName("provisioning_state")
  protected String provisioningState;
  @SerializedName("health_state")
  protected String healthState;
  @SerializedName("health_as_of")
  protected Date healthAsOf;
  @SerializedName("created_at")
  protected Date createdAt;
  @SerializedName("updated_at")
  protected Date updatedAt;
  @SerializedName("created_by")
  protected String createdBy;
  @SerializedName("updated_by")
  protected String updatedBy;

  protected HSMDestination() { }

  /**
   * Gets the id.
   *
   * Destination ID. Immutable. System-managed.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the href.
   *
   * URL of the destination resource.
   *
   * @return the href
   */
  public String getHref() {
    return href;
  }

  /**
   * Gets the accountId.
   *
   * IBM Cloud account ID. System-managed. Required for account policy setup.
   *
   * @return the accountId
   */
  public String getAccountId() {
    return accountId;
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
   * Gets the vendor.
   *
   * HSM vendor. Immutable after creation.
   *
   * @return the vendor
   */
  public String getVendor() {
    return vendor;
  }

  /**
   * Gets the provisioningState.
   *
   * Lifecycle state of the destination:
   * - `completed`: Destination created and available for configuration. Initial state on POST.
   * - `deleting`: Hard delete initiated; asynchronous cleanup in progress.
   * - `deletion_failed`: Asynchronous delete failed; the destination still exists. Retry DELETE to re-initiate.
   *
   * @return the provisioningState
   */
  public String getProvisioningState() {
    return provisioningState;
  }

  /**
   * Gets the healthState.
   *
   * AS OF (point-in-time) health state. Written exclusively by POST …/health and POST …/apply:
   * - `unknown`: Health check not yet performed, or destination is deleting/deletion_failed.
   * - `evaluating`: A health check (POST …/health) is in progress. Set on acceptance; replaced when the check
   * completes.
   * - `in_progress`: An apply operation (POST …/apply) is running. Set on acceptance; replaced by the health check
   * result once apply completes (or set to `unknown` on failure).
   * - `not_configured`: Prerequisites not met (needs ≥1 HA Group, ≥1 path with active non-expired Server CA, and ≥1
   * active non-expired client certificate).
   * - `healthy`: All non-`not_configured` HSM HA Groups are `healthy` or `degraded`.
   * - `degraded`: Some non-`not_configured` HSM HA Groups are `unhealthy`/`unknown` AND at least one is `healthy`.
   * - `unhealthy`: All non-`not_configured` HSM HA Groups are `unhealthy` or `unknown`.
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
   * Gets the createdAt.
   *
   * Computed field. When the resource was created.
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
   * IAM identity of creator. Computed field.
   *
   * @return the createdBy
   */
  public String getCreatedBy() {
    return createdBy;
  }

  /**
   * Gets the updatedBy.
   *
   * IAM identity of last updater. Computed field. Omitted until first update.
   *
   * @return the updatedBy
   */
  public String getUpdatedBy() {
    return updatedBy;
  }
}

