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
 * Fields to update on the HSM Destination. Only supplied fields are changed (merge-patch semantics).
 */
public class HSMDestinationPatch extends GenericModel {

  protected String name;
  protected String description;

  /**
   * Builder.
   */
  public static class Builder {
    private String name;
    private String description;

    /**
     * Instantiates a new Builder from an existing HSMDestinationPatch instance.
     *
     * @param hsmDestinationPatch the instance to initialize the Builder with
     */
    private Builder(HSMDestinationPatch hsmDestinationPatch) {
      this.name = hsmDestinationPatch.name;
      this.description = hsmDestinationPatch.description;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a HSMDestinationPatch.
     *
     * @return the new HSMDestinationPatch instance
     */
    public HSMDestinationPatch build() {
      return new HSMDestinationPatch(this);
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the HSMDestinationPatch builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the description.
     *
     * @param description the description
     * @return the HSMDestinationPatch builder
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }
  }

  protected HSMDestinationPatch() { }

  protected HSMDestinationPatch(Builder builder) {
    name = builder.name;
    description = builder.description;
  }

  /**
   * New builder.
   *
   * @return a HSMDestinationPatch builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the name.
   *
   * Updated display name for the destination.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the description.
   *
   * Updated description for the destination. Set to empty string to clear.
   *
   * @return the description
   */
  public String description() {
    return description;
  }

  /**
   * Construct a JSON merge-patch from the HSMDestinationPatch.
   *
   * Note that properties of the HSMDestinationPatch with null values are not represented in the constructed
   * JSON merge-patch object, but can be explicitly set afterward to signify a property delete.
   *
   * @return a JSON merge-patch for the HSMDestinationPatch
   */
  public Map<String, Object> asPatch() {
    return GsonSingleton.getGson().fromJson(this.toString(), Map.class);
  }
}

