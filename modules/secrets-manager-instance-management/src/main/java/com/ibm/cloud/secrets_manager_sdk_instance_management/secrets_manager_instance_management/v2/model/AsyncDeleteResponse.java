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
 * Response body for async DELETE operations (202 Accepted). The `type` field is intentionally omitted — the caller
 * knows which resource they deleted.
 */
public class AsyncDeleteResponse extends GenericModel {

  /**
   * Lifecycle state of the deleted resource. Always `deleting` on a 202 response.
   */
  public interface ProvisioningState {
    /** deleting. */
    String DELETING = "deleting";
  }

  protected String href;
  protected String id;
  @SerializedName("provisioning_state")
  protected String provisioningState;

  protected AsyncDeleteResponse() { }

  /**
   * Gets the href.
   *
   * URL of the resource being deleted.
   *
   * @return the href
   */
  public String getHref() {
    return href;
  }

  /**
   * Gets the id.
   *
   * ID of the resource being deleted.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the provisioningState.
   *
   * Lifecycle state of the deleted resource. Always `deleting` on a 202 response.
   *
   * @return the provisioningState
   */
  public String getProvisioningState() {
    return provisioningState;
  }
}

