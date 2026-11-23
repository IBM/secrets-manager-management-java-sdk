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

import java.util.ArrayList;
import java.util.List;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The createInstanceHsmDestinationHaGroup options.
 */
public class CreateInstanceHsmDestinationHaGroupOptions extends GenericModel {

  protected String instanceId;
  protected String destinationId;
  protected String name;
  protected String groupLabel;
  protected String groupSerial;
  protected List<String> memberSerials;
  protected String description;

  /**
   * Builder.
   */
  public static class Builder {
    private String instanceId;
    private String destinationId;
    private String name;
    private String groupLabel;
    private String groupSerial;
    private List<String> memberSerials;
    private String description;

    /**
     * Instantiates a new Builder from an existing CreateInstanceHsmDestinationHaGroupOptions instance.
     *
     * @param createInstanceHsmDestinationHaGroupOptions the instance to initialize the Builder with
     */
    private Builder(CreateInstanceHsmDestinationHaGroupOptions createInstanceHsmDestinationHaGroupOptions) {
      this.instanceId = createInstanceHsmDestinationHaGroupOptions.instanceId;
      this.destinationId = createInstanceHsmDestinationHaGroupOptions.destinationId;
      this.name = createInstanceHsmDestinationHaGroupOptions.name;
      this.groupLabel = createInstanceHsmDestinationHaGroupOptions.groupLabel;
      this.groupSerial = createInstanceHsmDestinationHaGroupOptions.groupSerial;
      this.memberSerials = createInstanceHsmDestinationHaGroupOptions.memberSerials;
      this.description = createInstanceHsmDestinationHaGroupOptions.description;
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
     * @param name the name
     * @param groupLabel the groupLabel
     * @param groupSerial the groupSerial
     * @param memberSerials the memberSerials
     */
    public Builder(String instanceId, String destinationId, String name, String groupLabel, String groupSerial, List<String> memberSerials) {
      this.instanceId = instanceId;
      this.destinationId = destinationId;
      this.name = name;
      this.groupLabel = groupLabel;
      this.groupSerial = groupSerial;
      this.memberSerials = memberSerials;
    }

    /**
     * Builds a CreateInstanceHsmDestinationHaGroupOptions.
     *
     * @return the new CreateInstanceHsmDestinationHaGroupOptions instance
     */
    public CreateInstanceHsmDestinationHaGroupOptions build() {
      return new CreateInstanceHsmDestinationHaGroupOptions(this);
    }

    /**
     * Adds a new element to memberSerials.
     *
     * @param memberSerials the new element to be added
     * @return the CreateInstanceHsmDestinationHaGroupOptions builder
     */
    public Builder addMemberSerials(String memberSerials) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(memberSerials,
        "memberSerials cannot be null");
      if (this.memberSerials == null) {
        this.memberSerials = new ArrayList<String>();
      }
      this.memberSerials.add(memberSerials);
      return this;
    }

    /**
     * Set the instanceId.
     *
     * @param instanceId the instanceId
     * @return the CreateInstanceHsmDestinationHaGroupOptions builder
     */
    public Builder instanceId(String instanceId) {
      this.instanceId = instanceId;
      return this;
    }

    /**
     * Set the destinationId.
     *
     * @param destinationId the destinationId
     * @return the CreateInstanceHsmDestinationHaGroupOptions builder
     */
    public Builder destinationId(String destinationId) {
      this.destinationId = destinationId;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the CreateInstanceHsmDestinationHaGroupOptions builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the groupLabel.
     *
     * @param groupLabel the groupLabel
     * @return the CreateInstanceHsmDestinationHaGroupOptions builder
     */
    public Builder groupLabel(String groupLabel) {
      this.groupLabel = groupLabel;
      return this;
    }

    /**
     * Set the groupSerial.
     *
     * @param groupSerial the groupSerial
     * @return the CreateInstanceHsmDestinationHaGroupOptions builder
     */
    public Builder groupSerial(String groupSerial) {
      this.groupSerial = groupSerial;
      return this;
    }

    /**
     * Set the memberSerials.
     * Existing memberSerials will be replaced.
     *
     * @param memberSerials the memberSerials
     * @return the CreateInstanceHsmDestinationHaGroupOptions builder
     */
    public Builder memberSerials(List<String> memberSerials) {
      this.memberSerials = memberSerials;
      return this;
    }

    /**
     * Set the description.
     *
     * @param description the description
     * @return the CreateInstanceHsmDestinationHaGroupOptions builder
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }
  }

  protected CreateInstanceHsmDestinationHaGroupOptions() { }

  protected CreateInstanceHsmDestinationHaGroupOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.instanceId,
      "instanceId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.destinationId,
      "destinationId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.name,
      "name cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.groupLabel,
      "groupLabel cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.groupSerial,
      "groupSerial cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.memberSerials,
      "memberSerials cannot be null");
    instanceId = builder.instanceId;
    destinationId = builder.destinationId;
    name = builder.name;
    groupLabel = builder.groupLabel;
    groupSerial = builder.groupSerial;
    memberSerials = builder.memberSerials;
    description = builder.description;
  }

  /**
   * New builder.
   *
   * @return a CreateInstanceHsmDestinationHaGroupOptions builder
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
   * Gets the name.
   *
   * Human-readable display name. Required.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the groupLabel.
   *
   * HA Group virtual token label. Immutable after creation.
   *
   * @return the groupLabel
   */
  public String groupLabel() {
    return groupLabel;
  }

  /**
   * Gets the groupSerial.
   *
   * HA Group serial number. Immutable after creation.
   *
   * @return the groupSerial
   */
  public String groupSerial() {
    return groupSerial;
  }

  /**
   * Gets the memberSerials.
   *
   * Ordered list of HSM node member serial numbers for this HA Group. At least one entry required. Max 100 unique
   * members. Not linked to path resource IDs.
   *
   * @return the memberSerials
   */
  public List<String> memberSerials() {
    return memberSerials;
  }

  /**
   * Gets the description.
   *
   * Optional description.
   *
   * @return the description
   */
  public String description() {
    return description;
  }
}

