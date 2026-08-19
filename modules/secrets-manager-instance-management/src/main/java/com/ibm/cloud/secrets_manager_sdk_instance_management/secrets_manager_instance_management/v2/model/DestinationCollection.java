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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * List of destinations for a Vault Dedicated cluster.
 */
public class DestinationCollection extends GenericModel {

  protected List<Destination> destinations;
  protected Long total;

  protected DestinationCollection() { }

  /**
   * Gets the destinations.
   *
   * List of destinations.
   *
   * @return the destinations
   */
  public List<Destination> getDestinations() {
    return destinations;
  }

  /**
   * Gets the total.
   *
   * Total number of destinations. Maximum 20 per instance.
   *
   * @return the total
   */
  public Long getTotal() {
    return total;
  }
}

