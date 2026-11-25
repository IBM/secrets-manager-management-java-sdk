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
 * The createInstanceHsmDestinationPathServerCa options.
 */
public class CreateInstanceHsmDestinationPathServerCaOptions extends GenericModel {

  protected String instanceId;
  protected String destinationId;
  protected String pathId;
  protected String name;
  protected String certificate;
  protected String description;

  /**
   * Builder.
   */
  public static class Builder {
    private String instanceId;
    private String destinationId;
    private String pathId;
    private String name;
    private String certificate;
    private String description;

    /**
     * Instantiates a new Builder from an existing CreateInstanceHsmDestinationPathServerCaOptions instance.
     *
     * @param createInstanceHsmDestinationPathServerCaOptions the instance to initialize the Builder with
     */
    private Builder(CreateInstanceHsmDestinationPathServerCaOptions createInstanceHsmDestinationPathServerCaOptions) {
      this.instanceId = createInstanceHsmDestinationPathServerCaOptions.instanceId;
      this.destinationId = createInstanceHsmDestinationPathServerCaOptions.destinationId;
      this.pathId = createInstanceHsmDestinationPathServerCaOptions.pathId;
      this.name = createInstanceHsmDestinationPathServerCaOptions.name;
      this.certificate = createInstanceHsmDestinationPathServerCaOptions.certificate;
      this.description = createInstanceHsmDestinationPathServerCaOptions.description;
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
     * @param pathId the pathId
     * @param name the name
     * @param certificate the certificate
     */
    public Builder(String instanceId, String destinationId, String pathId, String name, String certificate) {
      this.instanceId = instanceId;
      this.destinationId = destinationId;
      this.pathId = pathId;
      this.name = name;
      this.certificate = certificate;
    }

    /**
     * Builds a CreateInstanceHsmDestinationPathServerCaOptions.
     *
     * @return the new CreateInstanceHsmDestinationPathServerCaOptions instance
     */
    public CreateInstanceHsmDestinationPathServerCaOptions build() {
      return new CreateInstanceHsmDestinationPathServerCaOptions(this);
    }

    /**
     * Set the instanceId.
     *
     * @param instanceId the instanceId
     * @return the CreateInstanceHsmDestinationPathServerCaOptions builder
     */
    public Builder instanceId(String instanceId) {
      this.instanceId = instanceId;
      return this;
    }

    /**
     * Set the destinationId.
     *
     * @param destinationId the destinationId
     * @return the CreateInstanceHsmDestinationPathServerCaOptions builder
     */
    public Builder destinationId(String destinationId) {
      this.destinationId = destinationId;
      return this;
    }

    /**
     * Set the pathId.
     *
     * @param pathId the pathId
     * @return the CreateInstanceHsmDestinationPathServerCaOptions builder
     */
    public Builder pathId(String pathId) {
      this.pathId = pathId;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the CreateInstanceHsmDestinationPathServerCaOptions builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the certificate.
     *
     * @param certificate the certificate
     * @return the CreateInstanceHsmDestinationPathServerCaOptions builder
     */
    public Builder certificate(String certificate) {
      this.certificate = certificate;
      return this;
    }

    /**
     * Set the description.
     *
     * @param description the description
     * @return the CreateInstanceHsmDestinationPathServerCaOptions builder
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }
  }

  protected CreateInstanceHsmDestinationPathServerCaOptions() { }

  protected CreateInstanceHsmDestinationPathServerCaOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.instanceId,
      "instanceId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.destinationId,
      "destinationId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.pathId,
      "pathId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.name,
      "name cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.certificate,
      "certificate cannot be null");
    instanceId = builder.instanceId;
    destinationId = builder.destinationId;
    pathId = builder.pathId;
    name = builder.name;
    certificate = builder.certificate;
    description = builder.description;
  }

  /**
   * New builder.
   *
   * @return a CreateInstanceHsmDestinationPathServerCaOptions builder
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
   * Gets the pathId.
   *
   * Path ID.
   *
   * @return the pathId
   */
  public String pathId() {
    return pathId;
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
   * Gets the certificate.
   *
   * PEM-encoded Server CA certificate. Immutable after creation.
   *
   * @return the certificate
   */
  public String certificate() {
    return certificate;
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

