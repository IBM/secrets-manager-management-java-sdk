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

/**
 * A destination resource representing a private network link to an IBM Cloud Database service instance on a Vault
 * Dedicated cluster.
 */
public class IbmCloudDatabaseDestination extends Destination {

  /**
   * Destination type.
   */
  public interface Type {
    /** ibm_cloud_database. */
    String IBM_CLOUD_DATABASE = "ibm_cloud_database";
  }

  /**
   * Destination state:
   * - `not_started`: Job accepted, waiting to start provisioning
   * - `provisioning`: Provisioning in progress — poll until `succeeded` or `failed`
   * - `succeeded`: Destination ready and usable
   * - `failed`: Provisioning failed — terminal state; delete and recreate.
   *   A `failed` destination still counts against the per-instance quota until deleted.
   */
  public interface State {
    /** not_started. */
    String NOT_STARTED = "not_started";
    /** provisioning. */
    String PROVISIONING = "provisioning";
    /** succeeded. */
    String SUCCEEDED = "succeeded";
    /** failed. */
    String FAILED = "failed";
  }

  protected String crn;

  protected IbmCloudDatabaseDestination() { }

  /**
   * Gets the crn.
   *
   * IBM Cloud Database service instance CRN.
   *
   * @return the crn
   */
  public String getCrn() {
    return crn;
  }
}

