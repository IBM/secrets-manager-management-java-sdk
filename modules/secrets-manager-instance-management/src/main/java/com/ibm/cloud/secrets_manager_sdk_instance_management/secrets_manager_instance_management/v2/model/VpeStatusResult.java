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
 * Response body for POST .../paths/{path_id}/health_check. Reflects the current health state and provisioning state of
 * the HSM path.
 */
public class VpeStatusResult extends GenericModel {

  /**
   * AS OF health state. Written exclusively by POST …/health and POST …/apply:
   * - `unknown`: Initial state on creation. Health check not yet performed, or path is deleting/deletion_failed.
   * - `evaluating`: A health check is in progress for this path.
   * - `in_progress`: An apply operation is running across the destination.
   * - `no_valid_server_ca`: Pre-check failed — no Server CA is active, or the active Server CA has expired.
   * - `not_configured`: Path is not yet provisioned (pending_account_policy, provisioning, pending_approval,
   * approval_declined, crn_already_in_use, vpe_provisioning_failed) — AND active Server CA is valid. If active CA is
   * missing or expired, no_valid_server_ca takes priority.
   * - `healthy`: Active Server CA valid AND connectivity check to the HSM succeeded.
   * - `unhealthy`: Active Server CA valid AND connectivity check to the HSM failed.
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
    /** unhealthy. */
    String UNHEALTHY = "unhealthy";
    /** no_valid_server_ca. */
    String NO_VALID_SERVER_CA = "no_valid_server_ca";
    /** not_configured. */
    String NOT_CONFIGURED = "not_configured";
  }

  /**
   * Lifecycle state of the path:
   * - `pending_server_ca`: Path created. Waiting for a Server CA to be added and activated.
   * - `pending_account_policy`: Server CA active. Customer must review and confirm the Secrets Manager account policy
   * for the gateway before proceeding.
   * - `provisioning`: Connectivity setup in progress (async). Triggered by POST /build.
   * - `pending_approval`: Connectivity created. Waiting for customer approval.
   * - `completed`: Connectivity established. Path fully operational.
   * - `vpe_provisioning_failed`: Connectivity setup failed. Call POST /reset then retry POST /build.
   * - `crn_already_in_use`: Connectivity setup failed — the gateway CRN is already in use by another Secrets Manager
   * instance in the same region. Obtain a new CRN and update via PATCH, then call POST /reset.
   * - `approval_declined`: Customer declined the pending approval. Call POST /reset.
   * - `deleting`: Delete initiated; async cleanup in progress.
   * - `deletion_failed`: Async deletion failed. Retry DELETE to re-initiate.
   */
  public interface ProvisioningState {
    /** pending_server_ca. */
    String PENDING_SERVER_CA = "pending_server_ca";
    /** pending_account_policy. */
    String PENDING_ACCOUNT_POLICY = "pending_account_policy";
    /** provisioning. */
    String PROVISIONING = "provisioning";
    /** pending_approval. */
    String PENDING_APPROVAL = "pending_approval";
    /** completed. */
    String COMPLETED = "completed";
    /** vpe_provisioning_failed. */
    String VPE_PROVISIONING_FAILED = "vpe_provisioning_failed";
    /** crn_already_in_use. */
    String CRN_ALREADY_IN_USE = "crn_already_in_use";
    /** approval_declined. */
    String APPROVAL_DECLINED = "approval_declined";
    /** deleting. */
    String DELETING = "deleting";
    /** deletion_failed. */
    String DELETION_FAILED = "deletion_failed";
  }

  @SerializedName("health_state")
  protected String healthState;
  @SerializedName("health_time_stamp")
  protected Date healthTimeStamp;
  @SerializedName("provisioning_state")
  protected String provisioningState;

  protected VpeStatusResult() { }

  /**
   * Gets the healthState.
   *
   * AS OF health state. Written exclusively by POST …/health and POST …/apply:
   * - `unknown`: Initial state on creation. Health check not yet performed, or path is deleting/deletion_failed.
   * - `evaluating`: A health check is in progress for this path.
   * - `in_progress`: An apply operation is running across the destination.
   * - `no_valid_server_ca`: Pre-check failed — no Server CA is active, or the active Server CA has expired.
   * - `not_configured`: Path is not yet provisioned (pending_account_policy, provisioning, pending_approval,
   * approval_declined, crn_already_in_use, vpe_provisioning_failed) — AND active Server CA is valid. If active CA is
   * missing or expired, no_valid_server_ca takes priority.
   * - `healthy`: Active Server CA valid AND connectivity check to the HSM succeeded.
   * - `unhealthy`: Active Server CA valid AND connectivity check to the HSM failed.
   *
   * @return the healthState
   */
  public String getHealthState() {
    return healthState;
  }

  /**
   * Gets the healthTimeStamp.
   *
   * RFC 3339 timestamp of the last health evaluation.
   *
   * @return the healthTimeStamp
   */
  public Date getHealthTimeStamp() {
    return healthTimeStamp;
  }

  /**
   * Gets the provisioningState.
   *
   * Lifecycle state of the path:
   * - `pending_server_ca`: Path created. Waiting for a Server CA to be added and activated.
   * - `pending_account_policy`: Server CA active. Customer must review and confirm the Secrets Manager account policy
   * for the gateway before proceeding.
   * - `provisioning`: Connectivity setup in progress (async). Triggered by POST /build.
   * - `pending_approval`: Connectivity created. Waiting for customer approval.
   * - `completed`: Connectivity established. Path fully operational.
   * - `vpe_provisioning_failed`: Connectivity setup failed. Call POST /reset then retry POST /build.
   * - `crn_already_in_use`: Connectivity setup failed — the gateway CRN is already in use by another Secrets Manager
   * instance in the same region. Obtain a new CRN and update via PATCH, then call POST /reset.
   * - `approval_declined`: Customer declined the pending approval. Call POST /reset.
   * - `deleting`: Delete initiated; async cleanup in progress.
   * - `deletion_failed`: Async deletion failed. Retry DELETE to re-initiate.
   *
   * @return the provisioningState
   */
  public String getProvisioningState() {
    return provisioningState;
  }
}

