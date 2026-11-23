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
 * The deleteInstanceHsmDestinationPathServerCa options.
 */
public class DeleteInstanceHsmDestinationPathServerCaOptions extends GenericModel {

  protected String instanceId;
  protected String destinationId;
  protected String pathId;
  protected String serverCaId;

  /**
   * Builder.
   */
  public static class Builder {
    private String instanceId;
    private String destinationId;
    private String pathId;
    private String serverCaId;

    /**
     * Instantiates a new Builder from an existing DeleteInstanceHsmDestinationPathServerCaOptions instance.
     *
     * @param deleteInstanceHsmDestinationPathServerCaOptions the instance to initialize the Builder with
     */
    private Builder(DeleteInstanceHsmDestinationPathServerCaOptions deleteInstanceHsmDestinationPathServerCaOptions) {
      this.instanceId = deleteInstanceHsmDestinationPathServerCaOptions.instanceId;
      this.destinationId = deleteInstanceHsmDestinationPathServerCaOptions.destinationId;
      this.pathId = deleteInstanceHsmDestinationPathServerCaOptions.pathId;
      this.serverCaId = deleteInstanceHsmDestinationPathServerCaOptions.serverCaId;
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
     * @param pathId the pathId
     * @param serverCaId the serverCaId
     */
    public Builder(String instanceId, String destinationId, String pathId, String serverCaId) {
      this.instanceId = instanceId;
      this.destinationId = destinationId;
      this.pathId = pathId;
      this.serverCaId = serverCaId;
    }

    /**
     * Builds a DeleteInstanceHsmDestinationPathServerCaOptions.
     *
     * @return the new DeleteInstanceHsmDestinationPathServerCaOptions instance
     */
    public DeleteInstanceHsmDestinationPathServerCaOptions build() {
      return new DeleteInstanceHsmDestinationPathServerCaOptions(this);
    }

    /**
     * Set the instanceId.
     *
     * @param instanceId the instanceId
     * @return the DeleteInstanceHsmDestinationPathServerCaOptions builder
     */
    public Builder instanceId(String instanceId) {
      this.instanceId = instanceId;
      return this;
    }

    /**
     * Set the destinationId.
     *
     * @param destinationId the destinationId
     * @return the DeleteInstanceHsmDestinationPathServerCaOptions builder
     */
    public Builder destinationId(String destinationId) {
      this.destinationId = destinationId;
      return this;
    }

    /**
     * Set the pathId.
     *
     * @param pathId the pathId
     * @return the DeleteInstanceHsmDestinationPathServerCaOptions builder
     */
    public Builder pathId(String pathId) {
      this.pathId = pathId;
      return this;
    }

    /**
     * Set the serverCaId.
     *
     * @param serverCaId the serverCaId
     * @return the DeleteInstanceHsmDestinationPathServerCaOptions builder
     */
    public Builder serverCaId(String serverCaId) {
      this.serverCaId = serverCaId;
      return this;
    }
  }

  protected DeleteInstanceHsmDestinationPathServerCaOptions() { }

  protected DeleteInstanceHsmDestinationPathServerCaOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.instanceId,
      "instanceId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.destinationId,
      "destinationId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.pathId,
      "pathId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.serverCaId,
      "serverCaId cannot be empty");
    instanceId = builder.instanceId;
    destinationId = builder.destinationId;
    pathId = builder.pathId;
    serverCaId = builder.serverCaId;
  }

  /**
   * New builder.
   *
   * @return a DeleteInstanceHsmDestinationPathServerCaOptions builder
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
   * Gets the pathId.
   *
   * Path ID.
   *
   * @return the pathId
   */
  public String pathId() {
    return pathId;
  }

  /**
   * Gets the serverCaId.
   *
   * The identifier of the Server CA to operate on. Matches the `id` field in the `ServerCa` response schema.
   *
   * @return the serverCaId
   */
  public String serverCaId() {
    return serverCaId;
  }
}

