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
 * The listInstanceHsmDestinationPathServerCas options.
 */
public class ListInstanceHsmDestinationPathServerCasOptions extends GenericModel {

  protected String instanceId;
  protected String destinationId;
  protected String pathId;

  /**
   * Builder.
   */
  public static class Builder {
    private String instanceId;
    private String destinationId;
    private String pathId;

    /**
     * Instantiates a new Builder from an existing ListInstanceHsmDestinationPathServerCasOptions instance.
     *
     * @param listInstanceHsmDestinationPathServerCasOptions the instance to initialize the Builder with
     */
    private Builder(ListInstanceHsmDestinationPathServerCasOptions listInstanceHsmDestinationPathServerCasOptions) {
      this.instanceId = listInstanceHsmDestinationPathServerCasOptions.instanceId;
      this.destinationId = listInstanceHsmDestinationPathServerCasOptions.destinationId;
      this.pathId = listInstanceHsmDestinationPathServerCasOptions.pathId;
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
     */
    public Builder(String instanceId, String destinationId, String pathId) {
      this.instanceId = instanceId;
      this.destinationId = destinationId;
      this.pathId = pathId;
    }

    /**
     * Builds a ListInstanceHsmDestinationPathServerCasOptions.
     *
     * @return the new ListInstanceHsmDestinationPathServerCasOptions instance
     */
    public ListInstanceHsmDestinationPathServerCasOptions build() {
      return new ListInstanceHsmDestinationPathServerCasOptions(this);
    }

    /**
     * Set the instanceId.
     *
     * @param instanceId the instanceId
     * @return the ListInstanceHsmDestinationPathServerCasOptions builder
     */
    public Builder instanceId(String instanceId) {
      this.instanceId = instanceId;
      return this;
    }

    /**
     * Set the destinationId.
     *
     * @param destinationId the destinationId
     * @return the ListInstanceHsmDestinationPathServerCasOptions builder
     */
    public Builder destinationId(String destinationId) {
      this.destinationId = destinationId;
      return this;
    }

    /**
     * Set the pathId.
     *
     * @param pathId the pathId
     * @return the ListInstanceHsmDestinationPathServerCasOptions builder
     */
    public Builder pathId(String pathId) {
      this.pathId = pathId;
      return this;
    }
  }

  protected ListInstanceHsmDestinationPathServerCasOptions() { }

  protected ListInstanceHsmDestinationPathServerCasOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.instanceId,
      "instanceId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.destinationId,
      "destinationId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.pathId,
      "pathId cannot be empty");
    instanceId = builder.instanceId;
    destinationId = builder.destinationId;
    pathId = builder.pathId;
  }

  /**
   * New builder.
   *
   * @return a ListInstanceHsmDestinationPathServerCasOptions builder
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
}

