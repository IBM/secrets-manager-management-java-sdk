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
import com.ibm.cloud.secrets_manager_sdk_instance_management.secrets_manager_instance_management.v2.model.DestinationPatch;
import com.ibm.cloud.secrets_manager_sdk_instance_management.secrets_manager_instance_management.v2.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the DestinationPatch model.
 */
public class DestinationPatchTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testDestinationPatch() throws Throwable {
    DestinationPatch destinationPatchModel = new DestinationPatch.Builder()
      .name("production-postgres-db")
      .description("Updated description for production database")
      .build();
    assertEquals(destinationPatchModel.name(), "production-postgres-db");
    assertEquals(destinationPatchModel.description(), "Updated description for production database");

    String json = TestUtilities.serialize(destinationPatchModel);

    DestinationPatch destinationPatchModelNew = TestUtilities.deserialize(json, DestinationPatch.class);
    assertTrue(destinationPatchModelNew instanceof DestinationPatch);
    assertEquals(destinationPatchModelNew.name(), "production-postgres-db");
    assertEquals(destinationPatchModelNew.description(), "Updated description for production database");
  }
  @Test
  public void testDestinationPatchAsPatch() throws Throwable {
    DestinationPatch destinationPatchModel = new DestinationPatch.Builder()
      .name("production-postgres-db")
      .description("Updated description for production database")
      .build();

    Map<String, Object> mergePatch = destinationPatchModel.asPatch();

    assertEquals(mergePatch.get("name"), "production-postgres-db");
    assertEquals(mergePatch.get("description"), "Updated description for production database");
  }

}