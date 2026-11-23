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
 * The createInstanceHsmDestination options.
 */
public class CreateInstanceHsmDestinationOptions extends GenericModel {

  /**
   * HSM vendor. Immutable after creation. Currently only `thales_luna` is accepted.
   */
  public interface Vendor {
    /** thales_luna. */
    String THALES_LUNA = "thales_luna";
  }

  protected String instanceId;
  protected String name;
  protected String vendor;
  protected String description;

  /**
   * Builder.
   */
  public static class Builder {
    private String instanceId;
    private String name;
    private String vendor;
    private String description;

    /**
     * Instantiates a new Builder from an existing CreateInstanceHsmDestinationOptions instance.
     *
     * @param createInstanceHsmDestinationOptions the instance to initialize the Builder with
     */
    private Builder(CreateInstanceHsmDestinationOptions createInstanceHsmDestinationOptions) {
      this.instanceId = createInstanceHsmDestinationOptions.instanceId;
      this.name = createInstanceHsmDestinationOptions.name;
      this.vendor = createInstanceHsmDestinationOptions.vendor;
      this.description = createInstanceHsmDestinationOptions.description;
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
     * @param name the name
     * @param vendor the vendor
     */
    public Builder(String instanceId, String name, String vendor) {
      this.instanceId = instanceId;
      this.name = name;
      this.vendor = vendor;
    }

    /**
     * Builds a CreateInstanceHsmDestinationOptions.
     *
     * @return the new CreateInstanceHsmDestinationOptions instance
     */
    public CreateInstanceHsmDestinationOptions build() {
      return new CreateInstanceHsmDestinationOptions(this);
    }

    /**
     * Set the instanceId.
     *
     * @param instanceId the instanceId
     * @return the CreateInstanceHsmDestinationOptions builder
     */
    public Builder instanceId(String instanceId) {
      this.instanceId = instanceId;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the CreateInstanceHsmDestinationOptions builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the vendor.
     *
     * @param vendor the vendor
     * @return the CreateInstanceHsmDestinationOptions builder
     */
    public Builder vendor(String vendor) {
      this.vendor = vendor;
      return this;
    }

    /**
     * Set the description.
     *
     * @param description the description
     * @return the CreateInstanceHsmDestinationOptions builder
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }
  }

  protected CreateInstanceHsmDestinationOptions() { }

  protected CreateInstanceHsmDestinationOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.instanceId,
      "instanceId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.name,
      "name cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.vendor,
      "vendor cannot be null");
    instanceId = builder.instanceId;
    name = builder.name;
    vendor = builder.vendor;
    description = builder.description;
  }

  /**
   * New builder.
   *
   * @return a CreateInstanceHsmDestinationOptions builder
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
   * Human-readable display name. Required.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the vendor.
   *
   * HSM vendor. Immutable after creation. Currently only `thales_luna` is accepted.
   *
   * @return the vendor
   */
  public String vendor() {
    return vendor;
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

