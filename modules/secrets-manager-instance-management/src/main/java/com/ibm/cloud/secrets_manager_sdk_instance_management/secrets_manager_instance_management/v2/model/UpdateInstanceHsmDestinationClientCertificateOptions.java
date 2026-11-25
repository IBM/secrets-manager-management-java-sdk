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

import java.util.Map;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The updateInstanceHsmDestinationClientCertificate options.
 */
public class UpdateInstanceHsmDestinationClientCertificateOptions extends GenericModel {

  protected String instanceId;
  protected String destinationId;
  protected String certId;
  protected Map<String, Object> clientCertificatePatch;

  /**
   * Builder.
   */
  public static class Builder {
    private String instanceId;
    private String destinationId;
    private String certId;
    private Map<String, Object> clientCertificatePatch;

    /**
     * Instantiates a new Builder from an existing UpdateInstanceHsmDestinationClientCertificateOptions instance.
     *
     * @param updateInstanceHsmDestinationClientCertificateOptions the instance to initialize the Builder with
     */
    private Builder(UpdateInstanceHsmDestinationClientCertificateOptions updateInstanceHsmDestinationClientCertificateOptions) {
      this.instanceId = updateInstanceHsmDestinationClientCertificateOptions.instanceId;
      this.destinationId = updateInstanceHsmDestinationClientCertificateOptions.destinationId;
      this.certId = updateInstanceHsmDestinationClientCertificateOptions.certId;
      this.clientCertificatePatch = updateInstanceHsmDestinationClientCertificateOptions.clientCertificatePatch;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param instanceId the instanceId
     * @param destinationId the destinationId
     * @param certId the certId
     * @param clientCertificatePatch the clientCertificatePatch
     */
    public Builder(String instanceId, String destinationId, String certId, Map<String, Object> clientCertificatePatch) {
      this.instanceId = instanceId;
      this.destinationId = destinationId;
      this.certId = certId;
      this.clientCertificatePatch = clientCertificatePatch;
    }

    /**
     * Builds a UpdateInstanceHsmDestinationClientCertificateOptions.
     *
     * @return the new UpdateInstanceHsmDestinationClientCertificateOptions instance
     */
    public UpdateInstanceHsmDestinationClientCertificateOptions build() {
      return new UpdateInstanceHsmDestinationClientCertificateOptions(this);
    }

    /**
     * Set the instanceId.
     *
     * @param instanceId the instanceId
     * @return the UpdateInstanceHsmDestinationClientCertificateOptions builder
     */
    public Builder instanceId(String instanceId) {
      this.instanceId = instanceId;
      return this;
    }

    /**
     * Set the destinationId.
     *
     * @param destinationId the destinationId
     * @return the UpdateInstanceHsmDestinationClientCertificateOptions builder
     */
    public Builder destinationId(String destinationId) {
      this.destinationId = destinationId;
      return this;
    }

    /**
     * Set the certId.
     *
     * @param certId the certId
     * @return the UpdateInstanceHsmDestinationClientCertificateOptions builder
     */
    public Builder certId(String certId) {
      this.certId = certId;
      return this;
    }

    /**
     * Set the clientCertificatePatch.
     *
     * @param clientCertificatePatch the clientCertificatePatch
     * @return the UpdateInstanceHsmDestinationClientCertificateOptions builder
     */
    public Builder clientCertificatePatch(Map<String, Object> clientCertificatePatch) {
      this.clientCertificatePatch = clientCertificatePatch;
      return this;
    }
  }

  protected UpdateInstanceHsmDestinationClientCertificateOptions() { }

  protected UpdateInstanceHsmDestinationClientCertificateOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.instanceId,
      "instanceId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.destinationId,
      "destinationId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.certId,
      "certId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.clientCertificatePatch,
      "clientCertificatePatch cannot be null");
    instanceId = builder.instanceId;
    destinationId = builder.destinationId;
    certId = builder.certId;
    clientCertificatePatch = builder.clientCertificatePatch;
  }

  /**
   * New builder.
   *
   * @return a UpdateInstanceHsmDestinationClientCertificateOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the instanceId.
   *
   * Secrets Manager instance ID.
   *
   * @return the instanceId
   */
  public String instanceId() {
    return instanceId;
  }

  /**
   * Gets the destinationId.
   *
   * Destination ID.
   *
   * @return the destinationId
   */
  public String destinationId() {
    return destinationId;
  }

  /**
   * Gets the certId.
   *
   * The identifier of the Client Certificate to operate on. Matches the `id` field in the `ClientCertificate` response
   * schema.
   *
   * @return the certId
   */
  public String certId() {
    return certId;
  }

  /**
   * Gets the clientCertificatePatch.
   *
   * JSON Merge-Patch content for update_instance_hsm_destination_client_certificate.
   *
   * @return the clientCertificatePatch
   */
  public Map<String, Object> clientCertificatePatch() {
    return clientCertificatePatch;
  }
}

