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
 * A Server CA certificate resource. certificate and expires_at are top-level fields. There is no vendor_config wrapper.
 * Only one Server CA can be active per path. Constraint: Cannot leave a path with zero active Server CAs if a client
 * certificate is already active.
 */
public class ServerCa extends GenericModel {

  /**
   * Only one Server CA can be active per path. Starts inactive on creation.
   */
  public interface Status {
    /** active. */
    String ACTIVE = "active";
    /** inactive. */
    String INACTIVE = "inactive";
  }

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
  protected String description;
  protected String certificate;
  @SerializedName("expires_at")
  protected Date expiresAt;
  protected String status;
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

  protected ServerCa() { }

  /**
   * Gets the id.
   *
   * Server CA ID. Immutable.
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
   * Gets the certificate.
   *
   * PEM-encoded Server CA certificate. Immutable.
   *
   * @return the certificate
   */
  public String getCertificate() {
    return certificate;
  }

  /**
   * Gets the expiresAt.
   *
   * Expiry parsed from certificate NotAfter field. System-managed. Populated on creation.
   *
   * @return the expiresAt
   */
  public Date getExpiresAt() {
    return expiresAt;
  }

  /**
   * Gets the status.
   *
   * Only one Server CA can be active per path. Starts inactive on creation.
   *
   * @return the status
   */
  public String getStatus() {
    return status;
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

