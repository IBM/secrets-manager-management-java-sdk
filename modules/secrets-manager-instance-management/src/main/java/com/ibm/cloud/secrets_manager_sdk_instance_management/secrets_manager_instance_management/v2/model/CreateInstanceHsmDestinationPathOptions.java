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
 * The createInstanceHsmDestinationPath options.
 */
public class CreateInstanceHsmDestinationPathOptions extends GenericModel {

  protected String instanceId;
  protected String destinationId;
  protected String name;
  protected String crn;
  protected String description;

  /**
   * Builder.
   */
  public static class Builder {
    private String instanceId;
    private String destinationId;
    private String name;
    private String crn;
    private String description;

    /**
     * Instantiates a new Builder from an existing CreateInstanceHsmDestinationPathOptions instance.
     *
     * @param createInstanceHsmDestinationPathOptions the instance to initialize the Builder with
     */
    private Builder(CreateInstanceHsmDestinationPathOptions createInstanceHsmDestinationPathOptions) {
      this.instanceId = createInstanceHsmDestinationPathOptions.instanceId;
      this.destinationId = createInstanceHsmDestinationPathOptions.destinationId;
      this.name = createInstanceHsmDestinationPathOptions.name;
      this.crn = createInstanceHsmDestinationPathOptions.crn;
      this.description = createInstanceHsmDestinationPathOptions.description;
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
     * @param crn the crn
     */
    public Builder(String instanceId, String destinationId, String name, String crn) {
      this.instanceId = instanceId;
      this.destinationId = destinationId;
      this.name = name;
      this.crn = crn;
    }

    /**
     * Builds a CreateInstanceHsmDestinationPathOptions.
     *
     * @return the new CreateInstanceHsmDestinationPathOptions instance
     */
    public CreateInstanceHsmDestinationPathOptions build() {
      return new CreateInstanceHsmDestinationPathOptions(this);
    }

    /**
     * Set the instanceId.
     *
     * @param instanceId the instanceId
     * @return the CreateInstanceHsmDestinationPathOptions builder
     */
    public Builder instanceId(String instanceId) {
      this.instanceId = instanceId;
      return this;
    }

    /**
     * Set the destinationId.
     *
     * @param destinationId the destinationId
     * @return the CreateInstanceHsmDestinationPathOptions builder
     */
    public Builder destinationId(String destinationId) {
      this.destinationId = destinationId;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the CreateInstanceHsmDestinationPathOptions builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the crn.
     *
     * @param crn the crn
     * @return the CreateInstanceHsmDestinationPathOptions builder
     */
    public Builder crn(String crn) {
      this.crn = crn;
      return this;
    }

    /**
     * Set the description.
     *
     * @param description the description
     * @return the CreateInstanceHsmDestinationPathOptions builder
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }
  }

  protected CreateInstanceHsmDestinationPathOptions() { }

  protected CreateInstanceHsmDestinationPathOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.instanceId,
      "instanceId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.destinationId,
      "destinationId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.name,
      "name cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.crn,
      "crn cannot be null");
    instanceId = builder.instanceId;
    destinationId = builder.destinationId;
    name = builder.name;
    crn = builder.crn;
    description = builder.description;
  }

  /**
   * New builder.
   *
   * @return a CreateInstanceHsmDestinationPathOptions builder
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
   * Gets the crn.
   *
   * CRN of the gateway through which the HSM is reached. Immutable after creation.
   *
   * @return the crn
   */
  public String crn() {
    return crn;
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

