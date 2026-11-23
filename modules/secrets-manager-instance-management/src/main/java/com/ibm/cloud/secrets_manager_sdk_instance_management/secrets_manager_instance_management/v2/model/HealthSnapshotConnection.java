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

import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Path summary within a DestinationHealthSnapshot.
 */
public class HealthSnapshotConnection extends GenericModel {

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

  protected String id;
  protected String name;
  @SerializedName("health_state")
  protected String healthState;
  @SerializedName("server_cas")
  protected List<HealthSnapshotServerCa> serverCas;

  protected HealthSnapshotConnection() { }

  /**
   * Gets the id.
   *
   * Path ID.
   *
   * @return the id
   */
  public String getId() {
    return id;
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
   * Gets the serverCas.
   *
   * All Server CAs for this path (active and inactive). Empty array if none.
   *
   * @return the serverCas
   */
  public List<HealthSnapshotServerCa> getServerCas() {
    return serverCas;
  }
}

