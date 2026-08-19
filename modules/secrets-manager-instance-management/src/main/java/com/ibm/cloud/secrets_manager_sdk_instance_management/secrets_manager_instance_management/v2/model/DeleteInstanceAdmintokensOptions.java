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
 * The deleteInstanceAdmintokens options.
 */
public class DeleteInstanceAdmintokensOptions extends GenericModel {

  protected String id;

  /**
   * Builder.
   */
  public static class Builder {
    private String id;

    /**
     * Instantiates a new Builder from an existing DeleteInstanceAdmintokensOptions instance.
     *
     * @param deleteInstanceAdmintokensOptions the instance to initialize the Builder with
     */
    private Builder(DeleteInstanceAdmintokensOptions deleteInstanceAdmintokensOptions) {
      this.id = deleteInstanceAdmintokensOptions.id;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param id the id
     */
    public Builder(String id) {
      this.id = id;
    }

    /**
     * Builds a DeleteInstanceAdmintokensOptions.
     *
     * @return the new DeleteInstanceAdmintokensOptions instance
     */
    public DeleteInstanceAdmintokensOptions build() {
      return new DeleteInstanceAdmintokensOptions(this);
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the DeleteInstanceAdmintokensOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }
  }

  protected DeleteInstanceAdmintokensOptions() { }

  protected DeleteInstanceAdmintokensOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    id = builder.id;
  }

  /**
   * New builder.
   *
   * @return a DeleteInstanceAdmintokensOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the id.
   *
   * Secrets Manager instance ID.
   *
   * @return the id
   */
  public String id() {
    return id;
  }
}

