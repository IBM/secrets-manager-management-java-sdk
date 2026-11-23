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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * HA Group summary within a DestinationHealthSnapshot.
 */
public class HealthSnapshotHSMHAGroup extends GenericModel {

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
  protected String name;
  @SerializedName("health_state")
  protected String healthState;

  protected HealthSnapshotHSMHAGroup() { }

  /**
   * Gets the id.
   *
   * HA Group ID.
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
}

