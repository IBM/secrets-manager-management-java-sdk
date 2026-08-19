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
 * The listInstanceDestinations options.
 */
public class ListInstanceDestinationsOptions extends GenericModel {

  /**
   * Filter by destination state.
   */
  public interface State {
    /** not_started. */
    String NOT_STARTED = "not_started";
    /** provisioning. */
    String PROVISIONING = "provisioning";
    /** succeeded. */
    String SUCCEEDED = "succeeded";
    /** failed. */
    String FAILED = "failed";
  }

  protected String instanceId;
  protected String state;

  /**
   * Builder.
   */
  public static class Builder {
    private String instanceId;
    private String state;

    /**
     * Instantiates a new Builder from an existing ListInstanceDestinationsOptions instance.
     *
     * @param listInstanceDestinationsOptions the instance to initialize the Builder with
     */
    private Builder(ListInstanceDestinationsOptions listInstanceDestinationsOptions) {
      this.instanceId = listInstanceDestinationsOptions.instanceId;
      this.state = listInstanceDestinationsOptions.state;
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
     * Builds a ListInstanceDestinationsOptions.
     *
     * @return the new ListInstanceDestinationsOptions instance
     */
    public ListInstanceDestinationsOptions build() {
      return new ListInstanceDestinationsOptions(this);
    }

    /**
     * Set the instanceId.
     *
     * @param instanceId the instanceId
     * @return the ListInstanceDestinationsOptions builder
     */
    public Builder instanceId(String instanceId) {
      this.instanceId = instanceId;
      return this;
    }

    /**
     * Set the state.
     *
     * @param state the state
     * @return the ListInstanceDestinationsOptions builder
     */
    public Builder state(String state) {
      this.state = state;
      return this;
    }
  }

  protected ListInstanceDestinationsOptions() { }

  protected ListInstanceDestinationsOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.instanceId,
      "instanceId cannot be empty");
    instanceId = builder.instanceId;
    state = builder.state;
  }

  /**
   * New builder.
   *
   * @return a ListInstanceDestinationsOptions builder
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
   * Gets the state.
   *
   * Filter by destination state.
   *
   * @return the state
   */
  public String state() {
    return state;
  }
}

