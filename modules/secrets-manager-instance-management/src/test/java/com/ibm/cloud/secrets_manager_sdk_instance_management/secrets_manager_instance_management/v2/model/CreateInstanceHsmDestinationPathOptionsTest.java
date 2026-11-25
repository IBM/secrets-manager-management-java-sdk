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
import com.ibm.cloud.secrets_manager_sdk_instance_management.secrets_manager_instance_management.v2.model.CreateInstanceHsmDestinationPathOptions;
import com.ibm.cloud.secrets_manager_sdk_instance_management.secrets_manager_instance_management.v2.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the CreateInstanceHsmDestinationPathOptions model.
 */
public class CreateInstanceHsmDestinationPathOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testCreateInstanceHsmDestinationPathOptions() throws Throwable {
    CreateInstanceHsmDestinationPathOptions createInstanceHsmDestinationPathOptionsModel = new CreateInstanceHsmDestinationPathOptions.Builder()
      .instanceId("fe5c5c27-3e44-474a-9484-55892e12d6d1")
      .destinationId("b2c3d4e5-f6a7-8901-bcde-f12345678901")
      .name("hsm-node-1")
      .crn("crn:v1:bluemix:public:is:eu-fr2:a/customer123::private-path-service-gateway:hsm1")
      .description("Primary HSM node for prod")
      .build();
    assertEquals(createInstanceHsmDestinationPathOptionsModel.instanceId(), "fe5c5c27-3e44-474a-9484-55892e12d6d1");
    assertEquals(createInstanceHsmDestinationPathOptionsModel.destinationId(), "b2c3d4e5-f6a7-8901-bcde-f12345678901");
    assertEquals(createInstanceHsmDestinationPathOptionsModel.name(), "hsm-node-1");
    assertEquals(createInstanceHsmDestinationPathOptionsModel.crn(), "crn:v1:bluemix:public:is:eu-fr2:a/customer123::private-path-service-gateway:hsm1");
    assertEquals(createInstanceHsmDestinationPathOptionsModel.description(), "Primary HSM node for prod");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateInstanceHsmDestinationPathOptionsError() throws Throwable {
    new CreateInstanceHsmDestinationPathOptions.Builder().build();
  }

}