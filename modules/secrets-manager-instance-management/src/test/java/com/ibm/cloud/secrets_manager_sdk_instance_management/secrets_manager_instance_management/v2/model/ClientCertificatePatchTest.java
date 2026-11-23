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
import com.ibm.cloud.secrets_manager_sdk_instance_management.secrets_manager_instance_management.v2.model.ClientCertificatePatch;
import com.ibm.cloud.secrets_manager_sdk_instance_management.secrets_manager_instance_management.v2.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the ClientCertificatePatch model.
 */
public class ClientCertificatePatchTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testClientCertificatePatch() throws Throwable {
    ClientCertificatePatch clientCertificatePatchModel = new ClientCertificatePatch.Builder()
      .name("testString")
      .description("testString")
      .status("testString")
      .signedCert("testString")
      .build();
    assertEquals(clientCertificatePatchModel.name(), "testString");
    assertEquals(clientCertificatePatchModel.description(), "testString");
    assertEquals(clientCertificatePatchModel.status(), "testString");
    assertEquals(clientCertificatePatchModel.signedCert(), "testString");

    String json = TestUtilities.serialize(clientCertificatePatchModel);

    ClientCertificatePatch clientCertificatePatchModelNew = TestUtilities.deserialize(json, ClientCertificatePatch.class);
    assertTrue(clientCertificatePatchModelNew instanceof ClientCertificatePatch);
    assertEquals(clientCertificatePatchModelNew.name(), "testString");
    assertEquals(clientCertificatePatchModelNew.description(), "testString");
    assertEquals(clientCertificatePatchModelNew.status(), "testString");
    assertEquals(clientCertificatePatchModelNew.signedCert(), "testString");
  }
  @Test
  public void testClientCertificatePatchAsPatch() throws Throwable {
    ClientCertificatePatch clientCertificatePatchModel = new ClientCertificatePatch.Builder()
      .name("testString")
      .description("testString")
      .status("testString")
      .signedCert("testString")
      .build();

    Map<String, Object> mergePatch = clientCertificatePatchModel.asPatch();

    assertEquals(mergePatch.get("name"), "testString");
    assertEquals(mergePatch.get("description"), "testString");
    assertEquals(mergePatch.get("status"), "testString");
    assertEquals(mergePatch.get("signed_cert"), "testString");
  }

}