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
import com.ibm.cloud.sdk.core.util.GsonSingleton;

/**
 * Fields to update on a destination. At least one field must be provided.
 */
public class DestinationPatch extends GenericModel {

  protected String name;
  protected String description;

  /**
   * Builder.
   */
  public static class Builder {
    private String name;
    private String description;

    /**
     * Instantiates a new Builder from an existing DestinationPatch instance.
     *
     * @param destinationPatch the instance to initialize the Builder with
     */
    private Builder(DestinationPatch destinationPatch) {
      this.name = destinationPatch.name;
      this.description = destinationPatch.description;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a DestinationPatch.
     *
     * @return the new DestinationPatch instance
     */
    public DestinationPatch build() {
      return new DestinationPatch(this);
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the DestinationPatch builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the description.
     *
     * @param description the description
     * @return the DestinationPatch builder
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }
  }

  protected DestinationPatch() { }

  protected DestinationPatch(Builder builder) {
    name = builder.name;
    description = builder.description;
  }

  /**
   * New builder.
   *
   * @return a DestinationPatch builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the name.
   *
   * Updated name.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the description.
   *
   * Updated description.
   *
   * @return the description
   */
  public String description() {
    return description;
  }

  /**
   * Construct a JSON merge-patch from the DestinationPatch.
   *
   * Note that properties of the DestinationPatch with null values are not represented in the constructed
   * JSON merge-patch object, but can be explicitly set afterward to signify a property delete.
   *
   * @return a JSON merge-patch for the DestinationPatch
   */
  public Map<String, Object> asPatch() {
    return GsonSingleton.getGson().fromJson(this.toString(), Map.class);
  }
}

