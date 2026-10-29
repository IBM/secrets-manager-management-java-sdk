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
import com.ibm.cloud.secrets_manager_sdk_instance_management.secrets_manager_instance_management.v2.model.UpdateInstanceDestinationOptions;
import com.ibm.cloud.secrets_manager_sdk_instance_management.secrets_manager_instance_management.v2.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the UpdateInstanceDestinationOptions model.
 */
public class UpdateInstanceDestinationOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testUpdateInstanceDestinationOptions() throws Throwable {
    UpdateInstanceDestinationOptions updateInstanceDestinationOptionsModel = new UpdateInstanceDestinationOptions.Builder()
      .instanceId("bfc50c2e-d66d-4f37-9ccf-9713f8325b39")
      .destinationId("b2c3d4e5-f6a7-8901-bcde-f12345678901")
      .destinationPatch(java.util.Collections.singletonMap("anyKey", "anyValue"))
      .build();
    assertEquals(updateInstanceDestinationOptionsModel.instanceId(), "bfc50c2e-d66d-4f37-9ccf-9713f8325b39");
    assertEquals(updateInstanceDestinationOptionsModel.destinationId(), "b2c3d4e5-f6a7-8901-bcde-f12345678901");
    assertEquals(updateInstanceDestinationOptionsModel.destinationPatch(), java.util.Collections.singletonMap("anyKey", "anyValue"));
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateInstanceDestinationOptionsError() throws Throwable {
    new UpdateInstanceDestinationOptions.Builder().build();
  }

}