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

import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import com.ibm.cloud.secrets_manager_sdk_instance_management.secrets_manager_instance_management.v2.model.CreateDestinationRequestIbmCloudDatabaseDestinationPrototype;
import com.ibm.cloud.secrets_manager_sdk_instance_management.secrets_manager_instance_management.v2.model.CreateInstanceDestinationOptions;
import com.ibm.cloud.secrets_manager_sdk_instance_management.secrets_manager_instance_management.v2.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the CreateInstanceDestinationOptions model.
 */
public class CreateInstanceDestinationOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testCreateInstanceDestinationOptions() throws Throwable {
    CreateDestinationRequestIbmCloudDatabaseDestinationPrototype createDestinationRequestModel = new CreateDestinationRequestIbmCloudDatabaseDestinationPrototype.Builder()
      .name("testString")
      .type("ibm_cloud_database")
      .description("Production PostgreSQL database")
      .crn("crn:v1:bluemix:public:databases-for-postgresql:us-south:a/e91c8f42b3d74e1a9c2f05d8b67a3e10:3f8b1c7a-9d42-4e6f-b8a5-2c1d9e7f4b83::")
      .build();
    assertEquals(createDestinationRequestModel.name(), "testString");
    assertEquals(createDestinationRequestModel.type(), "ibm_cloud_database");
    assertEquals(createDestinationRequestModel.description(), "Production PostgreSQL database");
    assertEquals(createDestinationRequestModel.crn(), "crn:v1:bluemix:public:databases-for-postgresql:us-south:a/e91c8f42b3d74e1a9c2f05d8b67a3e10:3f8b1c7a-9d42-4e6f-b8a5-2c1d9e7f4b83::");

    CreateInstanceDestinationOptions createInstanceDestinationOptionsModel = new CreateInstanceDestinationOptions.Builder()
      .instanceId("bfc50c2e-d66d-4f37-9ccf-9713f8325b39")
      .destinationPrototype(createDestinationRequestModel)
      .build();
    assertEquals(createInstanceDestinationOptionsModel.instanceId(), "bfc50c2e-d66d-4f37-9ccf-9713f8325b39");
    assertEquals(createInstanceDestinationOptionsModel.destinationPrototype(), createDestinationRequestModel);
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateInstanceDestinationOptionsError() throws Throwable {
    new CreateInstanceDestinationOptions.Builder().build();
  }

}