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
 * The updateInstanceHsmDestination options.
 */
public class UpdateInstanceHsmDestinationOptions extends GenericModel {

  protected String instanceId;
  protected String destinationId;
  protected Map<String, Object> hsmDestinationPatch;

  /**
   * Builder.
   */
  public static class Builder {
    private String instanceId;
    private String destinationId;
    private Map<String, Object> hsmDestinationPatch;

    /**
     * Instantiates a new Builder from an existing UpdateInstanceHsmDestinationOptions instance.
     *
     * @param updateInstanceHsmDestinationOptions the instance to initialize the Builder with
     */
    private Builder(UpdateInstanceHsmDestinationOptions updateInstanceHsmDestinationOptions) {
      this.instanceId = updateInstanceHsmDestinationOptions.instanceId;
      this.destinationId = updateInstanceHsmDestinationOptions.destinationId;
      this.hsmDestinationPatch = updateInstanceHsmDestinationOptions.hsmDestinationPatch;
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
     * @param hsmDestinationPatch the hsmDestinationPatch
     */
    public Builder(String instanceId, String destinationId, Map<String, Object> hsmDestinationPatch) {
      this.instanceId = instanceId;
      this.destinationId = destinationId;
      this.hsmDestinationPatch = hsmDestinationPatch;
    }

    /**
     * Builds a UpdateInstanceHsmDestinationOptions.
     *
     * @return the new UpdateInstanceHsmDestinationOptions instance
     */
    public UpdateInstanceHsmDestinationOptions build() {
      return new UpdateInstanceHsmDestinationOptions(this);
    }

    /**
     * Set the instanceId.
     *
     * @param instanceId the instanceId
     * @return the UpdateInstanceHsmDestinationOptions builder
     */
    public Builder instanceId(String instanceId) {
      this.instanceId = instanceId;
      return this;
    }

    /**
     * Set the destinationId.
     *
     * @param destinationId the destinationId
     * @return the UpdateInstanceHsmDestinationOptions builder
     */
    public Builder destinationId(String destinationId) {
      this.destinationId = destinationId;
      return this;
    }

    /**
     * Set the hsmDestinationPatch.
     *
     * @param hsmDestinationPatch the hsmDestinationPatch
     * @return the UpdateInstanceHsmDestinationOptions builder
     */
    public Builder hsmDestinationPatch(Map<String, Object> hsmDestinationPatch) {
      this.hsmDestinationPatch = hsmDestinationPatch;
      return this;
    }
  }

  protected UpdateInstanceHsmDestinationOptions() { }

  protected UpdateInstanceHsmDestinationOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.instanceId,
      "instanceId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.destinationId,
      "destinationId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.hsmDestinationPatch,
      "hsmDestinationPatch cannot be null");
    instanceId = builder.instanceId;
    destinationId = builder.destinationId;
    hsmDestinationPatch = builder.hsmDestinationPatch;
  }

  /**
   * New builder.
   *
   * @return a UpdateInstanceHsmDestinationOptions builder
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
   * Gets the hsmDestinationPatch.
   *
   * JSON Merge-Patch content for update_instance_hsm_destination.
   *
   * @return the hsmDestinationPatch
   */
  public Map<String, Object> hsmDestinationPatch() {
    return hsmDestinationPatch;
  }
}

