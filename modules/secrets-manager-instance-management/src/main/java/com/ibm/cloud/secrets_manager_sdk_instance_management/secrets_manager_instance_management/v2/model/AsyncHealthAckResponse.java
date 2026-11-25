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
 * Response body for the async apply operation (202 Accepted). The body is currently an empty object;
 * `href`, when present, is the `GET …/health` polling endpoint. Poll `GET …/health` until `health_state` is no longer
 * `in_progress`.
 */
public class AsyncHealthAckResponse extends GenericModel {

  protected String href;

  protected AsyncHealthAckResponse() { }

  /**
   * Gets the href.
   *
   * URL of the GET …/health snapshot endpoint to poll for results. Not currently returned.
   *
   * @return the href
   */
  public String getHref() {
    return href;
  }
}

