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
 * Vault cluster information for Vault Dedicated instances.
 */
public class VaultDedicatedCluster extends GenericModel {

  /**
   * Vault cluster status. Possible values:
   * - sealed: The Vault cluster is sealed and requires unsealing to access secrets
   * - not_initialized: The Vault cluster has not been initialized yet
   * - healthy: The Vault cluster is operational and ready to serve requests.
   */
  public interface Status {
    /** sealed. */
    String SEALED = "sealed";
    /** not_initialized. */
    String NOT_INITIALIZED = "not_initialized";
    /** healthy. */
    String HEALTHY = "healthy";
  }

  protected String status;
  protected String version;

  protected VaultDedicatedCluster() { }

  /**
   * Gets the status.
   *
   * Vault cluster status. Possible values:
   * - sealed: The Vault cluster is sealed and requires unsealing to access secrets
   * - not_initialized: The Vault cluster has not been initialized yet
   * - healthy: The Vault cluster is operational and ready to serve requests.
   *
   * @return the status
   */
  public String getStatus() {
    return status;
  }

  /**
   * Gets the version.
   *
   * Vault cluster version.
   *
   * @return the version
   */
  public String getVersion() {
    return version;
  }
}

