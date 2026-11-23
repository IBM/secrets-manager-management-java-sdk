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
 * Persisted AS-OF health snapshot for a destination. Returned by GET /hsm_destinations/{destination_id}/health and by
 * the async POST /hsm_destinations/{destination_id}/health and POST /hsm_destinations/{destination_id}/apply flows
 * (poll until health_state is no longer `evaluating` or `in_progress`). All health_state values reflect the last
 * completed evaluation.
 */
public class DestinationHealthSnapshot extends GenericModel {

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

  protected String href;
  @SerializedName("destination_id")
  protected String destinationId;
  @SerializedName("health_state")
  protected String healthState;
  @SerializedName("health_as_of")
  protected Date healthAsOf;
  @SerializedName("client_certificates")
  protected List<HealthSnapshotClientCert> clientCertificates;
  @SerializedName("ha_groups")
  protected List<HealthSnapshotHSMHAGroup> haGroups;
  protected List<HealthSnapshotConnection> paths;

  protected DestinationHealthSnapshot() { }

  /**
   * Gets the href.
   *
   * URL of the health snapshot endpoint for this destination.
   *
   * @return the href
   */
  public String getHref() {
    return href;
  }

  /**
   * Gets the destinationId.
   *
   * ID of the destination. Echoed from path param.
   *
   * @return the destinationId
   */
  public String getDestinationId() {
    return destinationId;
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
   * Timestamp of this health check — always the current time of the live probe.
   *
   * @return the healthAsOf
   */
  public Date getHealthAsOf() {
    return healthAsOf;
  }

  /**
   * Gets the clientCertificates.
   *
   * All client certificates for this destination (active, inactive, csr_generated). health_state freshly evaluated for
   * all certs with a signed_cert.
   *
   * @return the clientCertificates
   */
  public List<HealthSnapshotClientCert> getClientCertificates() {
    return clientCertificates;
  }

  /**
   * Gets the haGroups.
   *
   * All HSM HA Groups for this destination. Empty array if none exist.
   *
   * @return the haGroups
   */
  public List<HealthSnapshotHSMHAGroup> getHaGroups() {
    return haGroups;
  }

  /**
   * Gets the paths.
   *
   * All paths for this destination. Empty array if none exist.
   *
   * @return the paths
   */
  public List<HealthSnapshotConnection> getPaths() {
    return paths;
  }
}

