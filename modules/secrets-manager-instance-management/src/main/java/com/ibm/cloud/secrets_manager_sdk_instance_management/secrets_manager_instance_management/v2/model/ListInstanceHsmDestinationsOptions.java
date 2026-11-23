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
 * The listInstanceHsmDestinations options.
 */
public class ListInstanceHsmDestinationsOptions extends GenericModel {

  protected String instanceId;

  /**
   * Builder.
   */
  public static class Builder {
    private String instanceId;

    /**
     * Instantiates a new Builder from an existing ListInstanceHsmDestinationsOptions instance.
     *
     * @param listInstanceHsmDestinationsOptions the instance to initialize the Builder with
     */
    private Builder(ListInstanceHsmDestinationsOptions listInstanceHsmDestinationsOptions) {
      this.instanceId = listInstanceHsmDestinationsOptions.instanceId;
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
     * Builds a ListInstanceHsmDestinationsOptions.
     *
     * @return the new ListInstanceHsmDestinationsOptions instance
     */
    public ListInstanceHsmDestinationsOptions build() {
      return new ListInstanceHsmDestinationsOptions(this);
    }

    /**
     * Set the instanceId.
     *
     * @param instanceId the instanceId
     * @return the ListInstanceHsmDestinationsOptions builder
     */
    public Builder instanceId(String instanceId) {
      this.instanceId = instanceId;
      return this;
    }
  }

  protected ListInstanceHsmDestinationsOptions() { }

  protected ListInstanceHsmDestinationsOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.instanceId,
      "instanceId cannot be empty");
    instanceId = builder.instanceId;
  }

  /**
   * New builder.
   *
   * @return a ListInstanceHsmDestinationsOptions builder
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
}

