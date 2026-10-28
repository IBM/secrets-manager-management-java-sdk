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

/**
 * Request body for creating an IBM Cloud Database destination.
 */
public class CreateDestinationRequestIbmCloudDatabaseDestinationPrototype extends CreateDestinationRequest {

  /**
   * Destination type.
   */
  public interface Type {
    /** ibm_cloud_database. */
    String IBM_CLOUD_DATABASE = "ibm_cloud_database";
  }


  /**
   * Builder.
   */
  public static class Builder {
    private String name;
    private String type;
    private String description;
    private String crn;

    /**
     * Instantiates a new Builder from an existing CreateDestinationRequestIbmCloudDatabaseDestinationPrototype instance.
     *
     * @param createDestinationRequestIbmCloudDatabaseDestinationPrototype the instance to initialize the Builder with
     */
    public Builder(CreateDestinationRequest createDestinationRequestIbmCloudDatabaseDestinationPrototype) {
      this.name = createDestinationRequestIbmCloudDatabaseDestinationPrototype.name;
      this.type = createDestinationRequestIbmCloudDatabaseDestinationPrototype.type;
      this.description = createDestinationRequestIbmCloudDatabaseDestinationPrototype.description;
      this.crn = createDestinationRequestIbmCloudDatabaseDestinationPrototype.crn;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param name the name
     * @param type the type
     * @param crn the crn
     */
    public Builder(String name, String type, String crn) {
      this.name = name;
      this.type = type;
      this.crn = crn;
    }

    /**
     * Builds a CreateDestinationRequestIbmCloudDatabaseDestinationPrototype.
     *
     * @return the new CreateDestinationRequestIbmCloudDatabaseDestinationPrototype instance
     */
    public CreateDestinationRequestIbmCloudDatabaseDestinationPrototype build() {
      return new CreateDestinationRequestIbmCloudDatabaseDestinationPrototype(this);
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the CreateDestinationRequestIbmCloudDatabaseDestinationPrototype builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the type.
     *
     * @param type the type
     * @return the CreateDestinationRequestIbmCloudDatabaseDestinationPrototype builder
     */
    public Builder type(String type) {
      this.type = type;
      return this;
    }

    /**
     * Set the description.
     *
     * @param description the description
     * @return the CreateDestinationRequestIbmCloudDatabaseDestinationPrototype builder
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * Set the crn.
     *
     * @param crn the crn
     * @return the CreateDestinationRequestIbmCloudDatabaseDestinationPrototype builder
     */
    public Builder crn(String crn) {
      this.crn = crn;
      return this;
    }
  }

  protected CreateDestinationRequestIbmCloudDatabaseDestinationPrototype() { }

  protected CreateDestinationRequestIbmCloudDatabaseDestinationPrototype(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.name,
      "name cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.type,
      "type cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.crn,
      "crn cannot be null");
    name = builder.name;
    type = builder.type;
    description = builder.description;
    crn = builder.crn;
  }

  /**
   * New builder.
   *
   * @return a CreateDestinationRequestIbmCloudDatabaseDestinationPrototype builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

