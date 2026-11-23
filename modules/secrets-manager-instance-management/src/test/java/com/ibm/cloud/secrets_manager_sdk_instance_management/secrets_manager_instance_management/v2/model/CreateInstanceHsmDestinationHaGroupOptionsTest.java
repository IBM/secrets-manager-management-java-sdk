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
import com.ibm.cloud.secrets_manager_sdk_instance_management.secrets_manager_instance_management.v2.model.CreateInstanceHsmDestinationHaGroupOptions;
import com.ibm.cloud.secrets_manager_sdk_instance_management.secrets_manager_instance_management.v2.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the CreateInstanceHsmDestinationHaGroupOptions model.
 */
public class CreateInstanceHsmDestinationHaGroupOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testCreateInstanceHsmDestinationHaGroupOptions() throws Throwable {
    CreateInstanceHsmDestinationHaGroupOptions createInstanceHsmDestinationHaGroupOptionsModel = new CreateInstanceHsmDestinationHaGroupOptions.Builder()
      .instanceId("fe5c5c27-3e44-474a-9484-55892e12d6d1")
      .destinationId("b2c3d4e5-f6a7-8901-bcde-f12345678901")
      .name("production-ha-group")
      .groupLabel("prod_ha_group")
      .groupSerial("11323465009866")
      .memberSerials(java.util.Arrays.asList("123456", "123457"))
      .description("Primary HA Group for prod")
      .build();
    assertEquals(createInstanceHsmDestinationHaGroupOptionsModel.instanceId(), "fe5c5c27-3e44-474a-9484-55892e12d6d1");
    assertEquals(createInstanceHsmDestinationHaGroupOptionsModel.destinationId(), "b2c3d4e5-f6a7-8901-bcde-f12345678901");
    assertEquals(createInstanceHsmDestinationHaGroupOptionsModel.name(), "production-ha-group");
    assertEquals(createInstanceHsmDestinationHaGroupOptionsModel.groupLabel(), "prod_ha_group");
    assertEquals(createInstanceHsmDestinationHaGroupOptionsModel.groupSerial(), "11323465009866");
    assertEquals(createInstanceHsmDestinationHaGroupOptionsModel.memberSerials(), java.util.Arrays.asList("123456", "123457"));
    assertEquals(createInstanceHsmDestinationHaGroupOptionsModel.description(), "Primary HA Group for prod");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateInstanceHsmDestinationHaGroupOptionsError() throws Throwable {
    new CreateInstanceHsmDestinationHaGroupOptions.Builder().build();
  }

}