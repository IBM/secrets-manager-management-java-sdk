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

import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * A collection of HSM Destinations.
 */
public class HSMDestinationCollection extends GenericModel {

  @SerializedName("total_count")
  protected Long totalCount;
  @SerializedName("hsm_destinations")
  protected List<HSMDestination> hsmDestinations;

  protected HSMDestinationCollection() { }

  /**
   * Gets the totalCount.
   *
   * Total number of HSM Destinations in the collection.
   *
   * @return the totalCount
   */
  public Long getTotalCount() {
    return totalCount;
  }

  /**
   * Gets the hsmDestinations.
   *
   * The list of HSM Destinations. At most 5 destinations may exist per SM instance.
   *
   * @return the hsmDestinations
   */
  public List<HSMDestination> getHsmDestinations() {
    return hsmDestinations;
  }
}

