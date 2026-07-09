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
 * Vault encryption configuration for Vault Dedicated instances.
 */
public class VaultDedicatedInstanceEncryption extends GenericModel {

  /**
   * Vault encryption mode.
   */
  public interface Mode {
    /** customer_managed. */
    String CUSTOMER_MANAGED = "customer_managed";
    /** service_managed. */
    String SERVICE_MANAGED = "service_managed";
  }

  protected String mode;
  protected String provider;
  @SerializedName("key_crn")
  protected String keyCrn;

  protected VaultDedicatedInstanceEncryption() { }

  /**
   * Gets the mode.
   *
   * Vault encryption mode.
   *
   * @return the mode
   */
  public String getMode() {
    return mode;
  }

  /**
   * Gets the provider.
   *
   * Vault encryption provider (only present for customer_managed mode). Valid value - 'key_protect'.
   *
   * @return the provider
   */
  public String getProvider() {
    return provider;
  }

  /**
   * Gets the keyCrn.
   *
   * Vault encryption key CRN (only present for customer_managed mode).
   *
   * @return the keyCrn
   */
  public String getKeyCrn() {
    return keyCrn;
  }
}

