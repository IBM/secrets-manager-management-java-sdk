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
 * The applyHsmDestination options.
 */
public class ApplyHsmDestinationOptions extends GenericModel {

  protected String instanceId;
  protected String destinationId;

  /**
   * Builder.
   */
  public static class Builder {
    private String instanceId;
    private String destinationId;

    /**
     * Instantiates a new Builder from an existing ApplyHsmDestinationOptions instance.
     *
     * @param applyHsmDestinationOptions the instance to initialize the Builder with
     */
    private Builder(ApplyHsmDestinationOptions applyHsmDestinationOptions) {
      this.instanceId = applyHsmDestinationOptions.instanceId;
      this.destinationId = applyHsmDestinationOptions.destinationId;
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
     */
    public Builder(String instanceId, String destinationId) {
      this.instanceId = instanceId;
      this.destinationId = destinationId;
    }

    /**
     * Builds a ApplyHsmDestinationOptions.
     *
     * @return the new ApplyHsmDestinationOptions instance
     */
    public ApplyHsmDestinationOptions build() {
      return new ApplyHsmDestinationOptions(this);
    }

    /**
     * Set the instanceId.
     *
     * @param instanceId the instanceId
     * @return the ApplyHsmDestinationOptions builder
     */
    public Builder instanceId(String instanceId) {
      this.instanceId = instanceId;
      return this;
    }

    /**
     * Set the destinationId.
     *
     * @param destinationId the destinationId
     * @return the ApplyHsmDestinationOptions builder
     */
    public Builder destinationId(String destinationId) {
      this.destinationId = destinationId;
      return this;
    }
  }

  protected ApplyHsmDestinationOptions() { }

  protected ApplyHsmDestinationOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.instanceId,
      "instanceId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.destinationId,
      "destinationId cannot be empty");
    instanceId = builder.instanceId;
    destinationId = builder.destinationId;
  }

  /**
   * New builder.
   *
   * @return a ApplyHsmDestinationOptions builder
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
}

