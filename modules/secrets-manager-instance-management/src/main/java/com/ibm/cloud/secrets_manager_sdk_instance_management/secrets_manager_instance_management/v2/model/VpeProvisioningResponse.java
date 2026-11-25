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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Response body for POST .../paths/{path_id}/build (202 Accepted).
 */
public class VpeProvisioningResponse extends GenericModel {

  /**
   * Always `provisioning` on a 202 response.
   */
  public interface ProvisioningState {
    /** provisioning. */
    String PROVISIONING = "provisioning";
  }

  protected String id;
  @SerializedName("provisioning_state")
  protected String provisioningState;

  protected VpeProvisioningResponse() { }

  /**
   * Gets the id.
   *
   * ID of the path being provisioned.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the provisioningState.
   *
   * Always `provisioning` on a 202 response.
   *
   * @return the provisioningState
   */
  public String getProvisioningState() {
    return provisioningState;
  }
}

