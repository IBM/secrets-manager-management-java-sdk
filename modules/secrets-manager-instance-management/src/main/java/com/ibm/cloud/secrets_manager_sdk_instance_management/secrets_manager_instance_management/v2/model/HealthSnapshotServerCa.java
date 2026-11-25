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
 * Server CA summary within a HealthSnapshotConnection.
 */
public class HealthSnapshotServerCa extends GenericModel {

  /**
   * AS OF health state of the Server CA certificate. Written exclusively by POST …/health:
   * - `unknown`: Initial state on creation. Health check not yet performed.
   * - `evaluating`: A health check is in progress for this Server CA.
   * - `valid`: Certificate is within its validity period (expires_at is in the future).
   * - `expired`: Certificate has passed its expires_at date.
   */
  public interface HealthState {
    /** unknown. */
    String UNKNOWN = "unknown";
    /** evaluating. */
    String EVALUATING = "evaluating";
    /** valid. */
    String VALID = "valid";
    /** expired. */
    String EXPIRED = "expired";
  }

  protected String id;
  protected String name;
  @SerializedName("health_state")
  protected String healthState;

  protected HealthSnapshotServerCa() { }

  /**
   * Gets the id.
   *
   * Server CA ID.
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
   * AS OF health state of the Server CA certificate. Written exclusively by POST …/health:
   * - `unknown`: Initial state on creation. Health check not yet performed.
   * - `evaluating`: A health check is in progress for this Server CA.
   * - `valid`: Certificate is within its validity period (expires_at is in the future).
   * - `expired`: Certificate has passed its expires_at date.
   *
   * @return the healthState
   */
  public String getHealthState() {
    return healthState;
  }
}

