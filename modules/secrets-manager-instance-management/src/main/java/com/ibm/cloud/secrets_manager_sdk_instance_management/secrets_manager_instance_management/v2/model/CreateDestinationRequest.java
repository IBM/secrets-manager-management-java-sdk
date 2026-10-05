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
 * Request body for creating a destination.
 *
 * Classes which extend this class:
 * - CreateDestinationRequestIbmCloudDatabaseDestinationPrototype
 */
public class CreateDestinationRequest extends GenericModel {
  @SuppressWarnings("unused")
  protected static String discriminatorPropertyName = "type";
  protected static java.util.Map<String, Class<?>> discriminatorMapping;
  static {
    discriminatorMapping = new java.util.HashMap<>();
    discriminatorMapping.put("ibm_cloud_database", CreateDestinationRequestIbmCloudDatabaseDestinationPrototype.class);
  }
  /**
   * Destination type.
   */
  public interface Type {
    /** ibm_cloud_database. */
    String IBM_CLOUD_DATABASE = "ibm_cloud_database";
  }

  protected String name;
  protected String type;
  protected String description;
  protected String crn;

  protected CreateDestinationRequest() { }

  /**
   * Gets the name.
   *
   * Destination name.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the type.
   *
   * Destination type.
   *
   * @return the type
   */
  public String type() {
    return type;
  }

  /**
   * Gets the description.
   *
   * Optional description.
   *
   * @return the description
   */
  public String description() {
    return description;
  }

  /**
   * Gets the crn.
   *
   * IBM Cloud Database service instance CRN.
   *
   * @return the crn
   */
  public String crn() {
    return crn;
  }
}

