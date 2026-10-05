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

  protected String instanceId;
  protected CreateDestinationRequest destinationPrototype;

  /**
   * Builder.
   */
  public static class Builder {
    private String instanceId;
    private CreateDestinationRequest destinationPrototype;

    /**
     * Instantiates a new Builder from an existing CreateInstanceDestinationOptions instance.
     *
     * @param createInstanceDestinationOptions the instance to initialize the Builder with
     */
    private Builder(CreateInstanceDestinationOptions createInstanceDestinationOptions) {
      this.instanceId = createInstanceDestinationOptions.instanceId;
      this.destinationPrototype = createInstanceDestinationOptions.destinationPrototype;
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
     * @param destinationPrototype the destinationPrototype
     */
    public Builder(String instanceId, CreateDestinationRequest destinationPrototype) {
      this.instanceId = instanceId;
      this.destinationPrototype = destinationPrototype;
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
     * Set the destinationPrototype.
     *
     * @param destinationPrototype the destinationPrototype
     * @return the CreateInstanceDestinationOptions builder
     */
    public Builder destinationPrototype(CreateDestinationRequest destinationPrototype) {
      this.destinationPrototype = destinationPrototype;
      return this;
    }
  }

  protected CreateInstanceDestinationOptions() { }

  protected CreateInstanceDestinationOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.instanceId,
      "instanceId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.destinationPrototype,
      "destinationPrototype cannot be null");
    instanceId = builder.instanceId;
    destinationPrototype = builder.destinationPrototype;
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
   * Gets the destinationPrototype.
   *
   * Request body for creating a destination.
   *
   * @return the destinationPrototype
   */
  public CreateDestinationRequest destinationPrototype() {
    return destinationPrototype;
  }
}

