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
import com.ibm.cloud.secrets_manager_sdk_instance_management.secrets_manager_instance_management.v2.model.HSMHAGroupPatch;
import com.ibm.cloud.secrets_manager_sdk_instance_management.secrets_manager_instance_management.v2.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the HSMHAGroupPatch model.
 */
public class HSMHAGroupPatchTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testHSMHAGroupPatch() throws Throwable {
    HSMHAGroupPatch hsmhaGroupPatchModel = new HSMHAGroupPatch.Builder()
      .name("dr-ha-group")
      .description("DR HA Group for failover")
      .memberSerials(java.util.Arrays.asList("123456", "123457", "123458"))
      .build();
    assertEquals(hsmhaGroupPatchModel.name(), "dr-ha-group");
    assertEquals(hsmhaGroupPatchModel.description(), "DR HA Group for failover");
    assertEquals(hsmhaGroupPatchModel.memberSerials(), java.util.Arrays.asList("123456", "123457", "123458"));

    String json = TestUtilities.serialize(hsmhaGroupPatchModel);

    HSMHAGroupPatch hsmhaGroupPatchModelNew = TestUtilities.deserialize(json, HSMHAGroupPatch.class);
    assertTrue(hsmhaGroupPatchModelNew instanceof HSMHAGroupPatch);
    assertEquals(hsmhaGroupPatchModelNew.name(), "dr-ha-group");
    assertEquals(hsmhaGroupPatchModelNew.description(), "DR HA Group for failover");
  }
  @Test
  public void testHSMHAGroupPatchAsPatch() throws Throwable {
    HSMHAGroupPatch hsmhaGroupPatchModel = new HSMHAGroupPatch.Builder()
      .name("dr-ha-group")
      .description("DR HA Group for failover")
      .memberSerials(java.util.Arrays.asList("123456", "123457", "123458"))
      .build();

    Map<String, Object> mergePatch = hsmhaGroupPatchModel.asPatch();

    assertEquals(mergePatch.get("name"), "dr-ha-group");
    assertEquals(mergePatch.get("description"), "DR HA Group for failover");
    assertTrue(mergePatch.containsKey("member_serials"));
  }

}