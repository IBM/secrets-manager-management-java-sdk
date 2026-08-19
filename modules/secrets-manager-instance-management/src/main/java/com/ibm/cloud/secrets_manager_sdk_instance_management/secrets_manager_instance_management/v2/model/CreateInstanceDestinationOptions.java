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
 * The createInstanceDestination options.
 */
public class CreateInstanceDestinationOptions extends GenericModel {

  /**
   * Destination type.
   */
  public interface Type {
    /** ibm_cloud_database. */
    String IBM_CLOUD_DATABASE = "ibm_cloud_database";
  }

  protected String instanceId;
  protected String name;
  protected String type;
  protected String description;
  protected String crn;

  /**
   * Builder.
   */
  public static class Builder {
    private String instanceId;
    private String name;
    private String type;
    private String description;
    private String crn;

    /**
     * Instantiates a new Builder from an existing CreateInstanceDestinationOptions instance.
     *
     * @param createInstanceDestinationOptions the instance to initialize the Builder with
     */
    private Builder(CreateInstanceDestinationOptions createInstanceDestinationOptions) {
      this.instanceId = createInstanceDestinationOptions.instanceId;
      this.name = createInstanceDestinationOptions.name;
      this.type = createInstanceDestinationOptions.type;
      this.description = createInstanceDestinationOptions.description;
      this.crn = createInstanceDestinationOptions.crn;
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
     */
    public Builder(String instanceId) {
      this.instanceId = instanceId;
    }

    /**
     * Builds a CreateInstanceDestinationOptions.
     *
     * @return the new CreateInstanceDestinationOptions instance
     */
    public CreateInstanceDestinationOptions build() {
      return new CreateInstanceDestinationOptions(this);
    }

    /**
     * Set the instanceId.
     *
     * @param instanceId the instanceId
     * @return the CreateInstanceDestinationOptions builder
     */
    public Builder instanceId(String instanceId) {
      this.instanceId = instanceId;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the CreateInstanceDestinationOptions builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the type.
     *
     * @param type the type
     * @return the CreateInstanceDestinationOptions builder
     */
    public Builder type(String type) {
      this.type = type;
      return this;
    }

    /**
     * Set the description.
     *
     * @param description the description
     * @return the CreateInstanceDestinationOptions builder
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * Set the crn.
     *
     * @param crn the crn
     * @return the CreateInstanceDestinationOptions builder
     */
    public Builder crn(String crn) {
      this.crn = crn;
      return this;
    }
  }

  protected CreateInstanceDestinationOptions() { }

  protected CreateInstanceDestinationOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.instanceId,
      "instanceId cannot be empty");
    instanceId = builder.instanceId;
    name = builder.name;
    type = builder.type;
    description = builder.description;
    crn = builder.crn;
  }

  /**
   * New builder.
   *
   * @return a CreateInstanceDestinationOptions builder
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
   * Gets the name.
   *
   * Destination name.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the type.
   *
   * Destination type.
   *
   * @return the type
   */
  public String type() {
    return type;
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

  /**
   * Gets the crn.
   *
   * IBM Cloud Database service instance CRN.
   *
   * @return the crn
   */
  public String crn() {
    return crn;
  }
}

