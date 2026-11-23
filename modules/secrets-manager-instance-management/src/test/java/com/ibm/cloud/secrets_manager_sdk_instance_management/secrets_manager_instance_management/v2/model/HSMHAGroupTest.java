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
import com.ibm.cloud.secrets_manager_sdk_instance_management.secrets_manager_instance_management.v2.model.HSMHAGroup;
import com.ibm.cloud.secrets_manager_sdk_instance_management.secrets_manager_instance_management.v2.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the HSMHAGroup model.
 */
public class HSMHAGroupTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testHSMHAGroup() throws Throwable {
    HSMHAGroup hsmhaGroupModel = new HSMHAGroup();
    assertNull(hsmhaGroupModel.getName());
    assertNull(hsmhaGroupModel.getDescription());
    assertNull(hsmhaGroupModel.getProvisioningState());
    assertNull(hsmhaGroupModel.getHealthState());
    assertNull(hsmhaGroupModel.getHealthAsOf());
    assertNull(hsmhaGroupModel.getGroupLabel());
    assertNull(hsmhaGroupModel.getGroupSerial());
    assertNull(hsmhaGroupModel.getMemberSerials());
    assertNull(hsmhaGroupModel.getCreatedAt());
    assertNull(hsmhaGroupModel.getUpdatedAt());
    assertNull(hsmhaGroupModel.getCreatedBy());
    assertNull(hsmhaGroupModel.getUpdatedBy());
  }
}