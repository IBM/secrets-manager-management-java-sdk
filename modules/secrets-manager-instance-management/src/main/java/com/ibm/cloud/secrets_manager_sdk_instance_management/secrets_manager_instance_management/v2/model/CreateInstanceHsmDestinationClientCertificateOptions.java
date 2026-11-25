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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The createInstanceHsmDestinationClientCertificate options.
 */
public class CreateInstanceHsmDestinationClientCertificateOptions extends GenericModel {

  protected String instanceId;
  protected String destinationId;
  protected String name;
  protected String description;

  /**
   * Builder.
   */
  public static class Builder {
    private String instanceId;
    private String destinationId;
    private String name;
    private String description;

    /**
     * Instantiates a new Builder from an existing CreateInstanceHsmDestinationClientCertificateOptions instance.
     *
     * @param createInstanceHsmDestinationClientCertificateOptions the instance to initialize the Builder with
     */
    private Builder(CreateInstanceHsmDestinationClientCertificateOptions createInstanceHsmDestinationClientCertificateOptions) {
      this.instanceId = createInstanceHsmDestinationClientCertificateOptions.instanceId;
      this.destinationId = createInstanceHsmDestinationClientCertificateOptions.destinationId;
      this.name = createInstanceHsmDestinationClientCertificateOptions.name;
      this.description = createInstanceHsmDestinationClientCertificateOptions.description;
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
     * @param name the name
     */
    public Builder(String instanceId, String destinationId, String name) {
      this.instanceId = instanceId;
      this.destinationId = destinationId;
      this.name = name;
    }

    /**
     * Builds a CreateInstanceHsmDestinationClientCertificateOptions.
     *
     * @return the new CreateInstanceHsmDestinationClientCertificateOptions instance
     */
    public CreateInstanceHsmDestinationClientCertificateOptions build() {
      return new CreateInstanceHsmDestinationClientCertificateOptions(this);
    }

    /**
     * Set the instanceId.
     *
     * @param instanceId the instanceId
     * @return the CreateInstanceHsmDestinationClientCertificateOptions builder
     */
    public Builder instanceId(String instanceId) {
      this.instanceId = instanceId;
      return this;
    }

    /**
     * Set the destinationId.
     *
     * @param destinationId the destinationId
     * @return the CreateInstanceHsmDestinationClientCertificateOptions builder
     */
    public Builder destinationId(String destinationId) {
      this.destinationId = destinationId;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the CreateInstanceHsmDestinationClientCertificateOptions builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the description.
     *
     * @param description the description
     * @return the CreateInstanceHsmDestinationClientCertificateOptions builder
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }
  }

  protected CreateInstanceHsmDestinationClientCertificateOptions() { }

  protected CreateInstanceHsmDestinationClientCertificateOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.instanceId,
      "instanceId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.destinationId,
      "destinationId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.name,
      "name cannot be null");
    instanceId = builder.instanceId;
    destinationId = builder.destinationId;
    name = builder.name;
    description = builder.description;
  }

  /**
   * New builder.
   *
   * @return a CreateInstanceHsmDestinationClientCertificateOptions builder
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
   * Gets the name.
   *
   * Human-readable display name. Required.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the description.
   *
   * Optional description.
   *
   * @return the description
   */
  public String description() {
    return description;
  }
}

