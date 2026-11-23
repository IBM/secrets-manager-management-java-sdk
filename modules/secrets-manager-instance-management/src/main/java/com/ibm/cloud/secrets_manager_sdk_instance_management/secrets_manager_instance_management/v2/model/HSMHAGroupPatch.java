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
import java.util.Map;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;
import com.ibm.cloud.sdk.core.util.GsonSingleton;

/**
 * Request body for updating an HA Group. group_serial and group_label are immutable — return 400 if supplied. If name
 * is omitted, existing name is preserved (merge-patch semantics). name cannot be set to null. HSM Config File is staged
 * when member_serials is changed.
 */
public class HSMHAGroupPatch extends GenericModel {

  protected String name;
  protected String description;
  @SerializedName("member_serials")
  protected List<String> memberSerials;

  /**
   * Builder.
   */
  public static class Builder {
    private String name;
    private String description;
    private List<String> memberSerials;

    /**
     * Instantiates a new Builder from an existing HSMHAGroupPatch instance.
     *
     * @param hsmhaGroupPatch the instance to initialize the Builder with
     */
    private Builder(HSMHAGroupPatch hsmhaGroupPatch) {
      this.name = hsmhaGroupPatch.name;
      this.description = hsmhaGroupPatch.description;
      this.memberSerials = hsmhaGroupPatch.memberSerials;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a HSMHAGroupPatch.
     *
     * @return the new HSMHAGroupPatch instance
     */
    public HSMHAGroupPatch build() {
      return new HSMHAGroupPatch(this);
    }

    /**
     * Adds a new element to memberSerials.
     *
     * @param memberSerials the new element to be added
     * @return the HSMHAGroupPatch builder
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
     * Set the name.
     *
     * @param name the name
     * @return the HSMHAGroupPatch builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the description.
     *
     * @param description the description
     * @return the HSMHAGroupPatch builder
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * Set the memberSerials.
     * Existing memberSerials will be replaced.
     *
     * @param memberSerials the memberSerials
     * @return the HSMHAGroupPatch builder
     */
    public Builder memberSerials(List<String> memberSerials) {
      this.memberSerials = memberSerials;
      return this;
    }
  }

  protected HSMHAGroupPatch() { }

  protected HSMHAGroupPatch(Builder builder) {
    name = builder.name;
    description = builder.description;
    memberSerials = builder.memberSerials;
  }

  /**
   * New builder.
   *
   * @return a HSMHAGroupPatch builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the name.
   *
   * Updated display name for the HA Group.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the description.
   *
   * Updated description for the HA Group. Set to empty string to clear.
   *
   * @return the description
   */
  public String description() {
    return description;
  }

  /**
   * Gets the memberSerials.
   *
   * Update the member serial list. At least one entry required if supplied. Max 100 unique serials. Stages HSM config
   * file change.
   *
   * @return the memberSerials
   */
  public List<String> memberSerials() {
    return memberSerials;
  }

  /**
   * Construct a JSON merge-patch from the HSMHAGroupPatch.
   *
   * Note that properties of the HSMHAGroupPatch with null values are not represented in the constructed
   * JSON merge-patch object, but can be explicitly set afterward to signify a property delete.
   *
   * @return a JSON merge-patch for the HSMHAGroupPatch
   */
  public Map<String, Object> asPatch() {
    return GsonSingleton.getGson().fromJson(this.toString(), Map.class);
  }
}

