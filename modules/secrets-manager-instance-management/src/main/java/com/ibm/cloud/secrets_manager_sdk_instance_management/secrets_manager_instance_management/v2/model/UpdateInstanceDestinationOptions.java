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

/**
 * The updateInstanceDestination options.
 */
public class UpdateInstanceDestinationOptions extends GenericModel {

  protected String instanceId;
  protected String destinationId;
  protected Map<String, Object> destinationPatch;

  /**
   * Builder.
   */
  public static class Builder {
    private String instanceId;
    private String destinationId;
    private Map<String, Object> destinationPatch;

    /**
     * Instantiates a new Builder from an existing UpdateInstanceDestinationOptions instance.
     *
     * @param updateInstanceDestinationOptions the instance to initialize the Builder with
     */
    private Builder(UpdateInstanceDestinationOptions updateInstanceDestinationOptions) {
      this.instanceId = updateInstanceDestinationOptions.instanceId;
      this.destinationId = updateInstanceDestinationOptions.destinationId;
      this.destinationPatch = updateInstanceDestinationOptions.destinationPatch;
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
     * @param destinationPatch the destinationPatch
     */
    public Builder(String instanceId, String destinationId, Map<String, Object> destinationPatch) {
      this.instanceId = instanceId;
      this.destinationId = destinationId;
      this.destinationPatch = destinationPatch;
    }

    /**
     * Builds a UpdateInstanceDestinationOptions.
     *
     * @return the new UpdateInstanceDestinationOptions instance
     */
    public UpdateInstanceDestinationOptions build() {
      return new UpdateInstanceDestinationOptions(this);
    }

    /**
     * Set the instanceId.
     *
     * @param instanceId the instanceId
     * @return the UpdateInstanceDestinationOptions builder
     */
    public Builder instanceId(String instanceId) {
      this.instanceId = instanceId;
      return this;
    }

    /**
     * Set the destinationId.
     *
     * @param destinationId the destinationId
     * @return the UpdateInstanceDestinationOptions builder
     */
    public Builder destinationId(String destinationId) {
      this.destinationId = destinationId;
      return this;
    }

    /**
     * Set the destinationPatch.
     *
     * @param destinationPatch the destinationPatch
     * @return the UpdateInstanceDestinationOptions builder
     */
    public Builder destinationPatch(Map<String, Object> destinationPatch) {
      this.destinationPatch = destinationPatch;
      return this;
    }
  }

  protected UpdateInstanceDestinationOptions() { }

  protected UpdateInstanceDestinationOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.instanceId,
      "instanceId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.destinationId,
      "destinationId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.destinationPatch,
      "destinationPatch cannot be null");
    instanceId = builder.instanceId;
    destinationId = builder.destinationId;
    destinationPatch = builder.destinationPatch;
  }

  /**
   * New builder.
   *
   * @return a UpdateInstanceDestinationOptions builder
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
   * Gets the destinationPatch.
   *
   * JSON Merge-Patch content for update_instance_destination.
   *
   * @return the destinationPatch
   */
  public Map<String, Object> destinationPatch() {
    return destinationPatch;
  }
}

