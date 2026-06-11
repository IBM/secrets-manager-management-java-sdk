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
 * Instance.
 */
public class Instance extends GenericModel {

  protected VaultDedicatedInstanceMetadata instance;
  @SerializedName("vault_cluster")
  protected VaultDedicatedCluster vaultCluster;
  protected VaultDedicatedInstanceEndpoints endpoints;
  protected VaultDedicatedInstanceEncryption encryption;

  protected Instance() { }

  /**
   * Gets the instance.
   *
   * Instance metadata for Vault Dedicated instances.
   *
   * @return the instance
   */
  public VaultDedicatedInstanceMetadata getInstance() {
    return instance;
  }

  /**
   * Gets the vaultCluster.
   *
   * Vault cluster information for Vault Dedicated instances.
   *
   * @return the vaultCluster
   */
  public VaultDedicatedCluster getVaultCluster() {
    return vaultCluster;
  }

  /**
   * Gets the endpoints.
   *
   * Instance endpoints for Vault Dedicated instances.
   *
   * @return the endpoints
   */
  public VaultDedicatedInstanceEndpoints getEndpoints() {
    return endpoints;
  }

  /**
   * Gets the encryption.
   *
   * Vault encryption configuration for Vault Dedicated instances.
   *
   * @return the encryption
   */
  public VaultDedicatedInstanceEncryption getEncryption() {
    return encryption;
  }
}

