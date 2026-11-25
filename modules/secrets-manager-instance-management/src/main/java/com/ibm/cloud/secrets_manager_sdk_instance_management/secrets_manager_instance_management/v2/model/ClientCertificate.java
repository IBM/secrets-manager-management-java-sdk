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
 * A client certificate resource. csr, signed_cert, and expires_at are top-level fields. There is no vendor_config
 * wrapper. CSR and private key are platform-generated. CN (`csr_cn`) is set to the SM instance UUID. The private key is
 * stored securely and is NOT exposed in any API response. Max 10 inactive/csr_generated certificates at any time.
 * Active certificate cannot be deleted.
 * `csr` and `csr_cn` are populated on creation.
 */
public class ClientCertificate extends GenericModel {

  /**
   * Lifecycle state of the client certificate:
   * - `csr_generated`: CSR and private key generated successfully. `csr` and `csr_cn` are populated. Initial state on
   * POST. Waiting for signed_cert to be uploaded via PATCH.
   * - `inactive`: signed_cert has been uploaded but the certificate has not been activated yet.
   * - `active`: This certificate is the active client certificate for the destination. Only one can be active at a
   * time.
   */
  public interface ProvisioningState {
    /** csr_generated. */
    String CSR_GENERATED = "csr_generated";
    /** inactive. */
    String INACTIVE = "inactive";
    /** active. */
    String ACTIVE = "active";
  }

  /**
   * AS OF health state of the client certificate. Written exclusively by POST …/health:
   * - `unknown`: Initial state on creation, and for csr_generated certs with no signed_cert.
   * - `evaluating`: A health check is in progress for this client certificate.
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
  protected String href;
  protected String name;
  protected String description;
  protected String status;
  @SerializedName("provisioning_state")
  protected String provisioningState;
  @SerializedName("health_state")
  protected String healthState;
  @SerializedName("health_as_of")
  protected Date healthAsOf;
  protected String csr;
  @SerializedName("csr_cn")
  protected String csrCn;
  @SerializedName("signed_cert")
  protected String signedCert;
  @SerializedName("expires_at")
  protected Date expiresAt;
  @SerializedName("created_at")
  protected Date createdAt;
  @SerializedName("updated_at")
  protected Date updatedAt;
  @SerializedName("created_by")
  protected String createdBy;
  @SerializedName("updated_by")
  protected String updatedBy;

  protected ClientCertificate() { }

  /**
   * Gets the id.
   *
   * Certificate ID. Immutable.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the href.
   *
   * URL of the client certificate resource.
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
   * Gets the status.
   *
   * Request-only. Set to `active` in a PATCH to activate this certificate. Never returned; read the current state from
   * `provisioning_state`.
   *
   * @return the status
   */
  public String getStatus() {
    return status;
  }

  /**
   * Gets the provisioningState.
   *
   * Lifecycle state of the client certificate:
   * - `csr_generated`: CSR and private key generated successfully. `csr` and `csr_cn` are populated. Initial state on
   * POST. Waiting for signed_cert to be uploaded via PATCH.
   * - `inactive`: signed_cert has been uploaded but the certificate has not been activated yet.
   * - `active`: This certificate is the active client certificate for the destination. Only one can be active at a
   * time.
   *
   * @return the provisioningState
   */
  public String getProvisioningState() {
    return provisioningState;
  }

  /**
   * Gets the healthState.
   *
   * AS OF health state of the client certificate. Written exclusively by POST …/health:
   * - `unknown`: Initial state on creation, and for csr_generated certs with no signed_cert.
   * - `evaluating`: A health check is in progress for this client certificate.
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
   * Gets the csr.
   *
   * PEM-encoded CSR. Platform-generated. Immutable once set. Populated on creation (always present once the resource
   * exists).
   *
   * @return the csr
   */
  public String getCsr() {
    return csr;
  }

  /**
   * Gets the csrCn.
   *
   * Common Name embedded in the CSR. Set to the SM instance UUID at generation time. Immutable once set. Populated on
   * creation (always present once the resource exists).
   *
   * @return the csrCn
   */
  public String getCsrCn() {
    return csrCn;
  }

  /**
   * Gets the signedCert.
   *
   * CA-signed certificate (PEM). Omitted until uploaded via PATCH.
   *
   * @return the signedCert
   */
  public String getSignedCert() {
    return signedCert;
  }

  /**
   * Gets the expiresAt.
   *
   * Parsed from signed_cert NotAfter field. Omitted until signed_cert is uploaded.
   *
   * @return the expiresAt
   */
  public Date getExpiresAt() {
    return expiresAt;
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

