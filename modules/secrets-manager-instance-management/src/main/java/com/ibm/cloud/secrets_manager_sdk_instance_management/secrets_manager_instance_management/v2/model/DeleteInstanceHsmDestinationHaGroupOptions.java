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
 * The deleteInstanceHsmDestinationHaGroup options.
 */
public class DeleteInstanceHsmDestinationHaGroupOptions extends GenericModel {

  protected String instanceId;
  protected String destinationId;
  protected String haGroupId;

  /**
   * Builder.
   */
  public static class Builder {
    private String instanceId;
    private String destinationId;
    private String haGroupId;

    /**
     * Instantiates a new Builder from an existing DeleteInstanceHsmDestinationHaGroupOptions instance.
     *
     * @param deleteInstanceHsmDestinationHaGroupOptions the instance to initialize the Builder with
     */
    private Builder(DeleteInstanceHsmDestinationHaGroupOptions deleteInstanceHsmDestinationHaGroupOptions) {
      this.instanceId = deleteInstanceHsmDestinationHaGroupOptions.instanceId;
      this.destinationId = deleteInstanceHsmDestinationHaGroupOptions.destinationId;
      this.haGroupId = deleteInstanceHsmDestinationHaGroupOptions.haGroupId;
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
     * @param haGroupId the haGroupId
     */
    public Builder(String instanceId, String destinationId, String haGroupId) {
      this.instanceId = instanceId;
      this.destinationId = destinationId;
      this.haGroupId = haGroupId;
    }

    /**
     * Builds a DeleteInstanceHsmDestinationHaGroupOptions.
     *
     * @return the new DeleteInstanceHsmDestinationHaGroupOptions instance
     */
    public DeleteInstanceHsmDestinationHaGroupOptions build() {
      return new DeleteInstanceHsmDestinationHaGroupOptions(this);
    }

    /**
     * Set the instanceId.
     *
     * @param instanceId the instanceId
     * @return the DeleteInstanceHsmDestinationHaGroupOptions builder
     */
    public Builder instanceId(String instanceId) {
      this.instanceId = instanceId;
      return this;
    }

    /**
     * Set the destinationId.
     *
     * @param destinationId the destinationId
     * @return the DeleteInstanceHsmDestinationHaGroupOptions builder
     */
    public Builder destinationId(String destinationId) {
      this.destinationId = destinationId;
      return this;
    }

    /**
     * Set the haGroupId.
     *
     * @param haGroupId the haGroupId
     * @return the DeleteInstanceHsmDestinationHaGroupOptions builder
     */
    public Builder haGroupId(String haGroupId) {
      this.haGroupId = haGroupId;
      return this;
    }
  }

  protected DeleteInstanceHsmDestinationHaGroupOptions() { }

  protected DeleteInstanceHsmDestinationHaGroupOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.instanceId,
      "instanceId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.destinationId,
      "destinationId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.haGroupId,
      "haGroupId cannot be empty");
    instanceId = builder.instanceId;
    destinationId = builder.destinationId;
    haGroupId = builder.haGroupId;
  }

  /**
   * New builder.
   *
   * @return a DeleteInstanceHsmDestinationHaGroupOptions builder
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
   * Gets the haGroupId.
   *
   * The identifier of the HA Group to operate on. Matches the `id` field in the `HSMHAGroup` response schema.
   *
   * @return the haGroupId
   */
  public String haGroupId() {
    return haGroupId;
  }
}

