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

package com.ibm.cloud.secrets_manager_sdk_instance_management.secrets_manager_instance_management.v2;

import com.ibm.cloud.sdk.core.http.Response;
import com.ibm.cloud.sdk.core.service.exception.ServiceResponseException;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import com.ibm.cloud.sdk.core.util.CredentialUtils;
import com.ibm.cloud.sdk.core.util.DateUtils;
import com.ibm.cloud.secrets_manager_sdk_instance_management.secrets_manager_instance_management.v2.model.CreateInstanceDestinationOptions;
import com.ibm.cloud.secrets_manager_sdk_instance_management.secrets_manager_instance_management.v2.model.CreateVaultAdmintokenOptions;
import com.ibm.cloud.secrets_manager_sdk_instance_management.secrets_manager_instance_management.v2.model.DeleteInstanceAdmintokensOptions;
import com.ibm.cloud.secrets_manager_sdk_instance_management.secrets_manager_instance_management.v2.model.DeleteInstanceDestinationOptions;
import com.ibm.cloud.secrets_manager_sdk_instance_management.secrets_manager_instance_management.v2.model.Destination;
import com.ibm.cloud.secrets_manager_sdk_instance_management.secrets_manager_instance_management.v2.model.DestinationCollection;
import com.ibm.cloud.secrets_manager_sdk_instance_management.secrets_manager_instance_management.v2.model.GetInstanceDestinationOptions;
import com.ibm.cloud.secrets_manager_sdk_instance_management.secrets_manager_instance_management.v2.model.GetInstanceOptions;
import com.ibm.cloud.secrets_manager_sdk_instance_management.secrets_manager_instance_management.v2.model.IbmCloudDatabaseDestination;
import com.ibm.cloud.secrets_manager_sdk_instance_management.secrets_manager_instance_management.v2.model.Instance;
import com.ibm.cloud.secrets_manager_sdk_instance_management.secrets_manager_instance_management.v2.model.ListInstanceDestinationsOptions;
import com.ibm.cloud.secrets_manager_sdk_instance_management.secrets_manager_instance_management.v2.model.Token;
import com.ibm.cloud.secrets_manager_sdk_instance_management.secrets_manager_instance_management.v2.model.UpdateInstanceDestinationOptions;
import com.ibm.cloud.secrets_manager_sdk_instance_management.secrets_manager_instance_management.v2.model.VaultDedicatedCluster;
import com.ibm.cloud.secrets_manager_sdk_instance_management.secrets_manager_instance_management.v2.model.VaultDedicatedEndpointsData;
import com.ibm.cloud.secrets_manager_sdk_instance_management.secrets_manager_instance_management.v2.model.VaultDedicatedInstanceEncryption;
import com.ibm.cloud.secrets_manager_sdk_instance_management.secrets_manager_instance_management.v2.model.VaultDedicatedInstanceEndpoints;
import com.ibm.cloud.secrets_manager_sdk_instance_management.secrets_manager_instance_management.v2.utils.TestUtilities;
import com.ibm.cloud.secrets_manager_sdk_instance_management.test.SdkIntegrationTestBase;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Integration test class for the SecretsManagerInstanceManagement service.
 */
public class SecretsManagerInstanceManagementIT extends SdkIntegrationTestBase {
  public SecretsManagerInstanceManagement service = null;
  public static Map<String, String> config = null;
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();
  /**
   * This method provides our config filename to the base class.
   */

  public String getConfigFilename() {
    return "../../secrets_manager_instance_management_v2.env";
  }

  @BeforeClass
  public void constructService() {
    // Ask super if we should skip the tests.
    if (skipTests()) {
      return;
    }

    service = SecretsManagerInstanceManagement.newInstance();
    assertNotNull(service);
    assertNotNull(service.getServiceUrl());

    // Load up our test-specific config properties.
    config = CredentialUtils.getServiceProperties(SecretsManagerInstanceManagement.DEFAULT_SERVICE_NAME);
    assertNotNull(config);
    assertFalse(config.isEmpty());
    assertEquals(service.getServiceUrl(), config.get("URL"));

    service.enableRetries(4, 30);

    System.out.println("Setup complete.");
  }

  @Test
  public void testCreateVaultAdmintoken() throws Exception {
    try {
      CreateVaultAdmintokenOptions createVaultAdmintokenOptions = new CreateVaultAdmintokenOptions.Builder()
        .id("bfc50c2e-d66d-4f37-9ccf-9713f8325b39")
        .build();

      // Invoke operation
      Response<Token> response = service.createVaultAdmintoken(createVaultAdmintokenOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      Token tokenResult = response.getResult();
      assertNotNull(tokenResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreateVaultAdmintoken" })
  public void testGetInstance() throws Exception {
    try {
      GetInstanceOptions getInstanceOptions = new GetInstanceOptions.Builder()
        .id("bfc50c2e-d66d-4f37-9ccf-9713f8325b39")
        .build();

      // Invoke operation
      Response<Instance> response = service.getInstance(getInstanceOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      Instance instanceResult = response.getResult();
      assertNotNull(instanceResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetInstance" })
  public void testListInstanceDestinations() throws Exception {
    try {
      ListInstanceDestinationsOptions listInstanceDestinationsOptions = new ListInstanceDestinationsOptions.Builder()
        .instanceId("bfc50c2e-d66d-4f37-9ccf-9713f8325b39")
        .state("not_started")
        .build();

      // Invoke operation
      Response<DestinationCollection> response = service.listInstanceDestinations(listInstanceDestinationsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      DestinationCollection destinationCollectionResult = response.getResult();
      assertNotNull(destinationCollectionResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListInstanceDestinations" })
  public void testCreateInstanceDestination() throws Exception {
    try {
      CreateInstanceDestinationOptions createInstanceDestinationOptions = new CreateInstanceDestinationOptions.Builder()
        .instanceId("bfc50c2e-d66d-4f37-9ccf-9713f8325b39")
        .name("my-postgres")
        .type("ibm_cloud_database")
        .description("Production PostgreSQL database")
        .crn("crn:v1:bluemix:public:databases-for-postgresql:us-south:a/e91c8f42b3d74e1a9c2f05d8b67a3e10:3f8b1c7a-9d42-4e6f-b8a5-2c1d9e7f4b83::")
        .build();

      // Invoke operation
      Response<Void> response = service.createInstanceDestination(createInstanceDestinationOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreateInstanceDestination" })
  public void testGetInstanceDestination() throws Exception {
    try {
      GetInstanceDestinationOptions getInstanceDestinationOptions = new GetInstanceDestinationOptions.Builder()
        .instanceId("bfc50c2e-d66d-4f37-9ccf-9713f8325b39")
        .destinationId("b2c3d4e5-f6a7-8901-bcde-f12345678901")
        .build();

      // Invoke operation
      Response<Void> response = service.getInstanceDestination(getInstanceDestinationOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetInstanceDestination" })
  public void testUpdateInstanceDestination() throws Exception {
    try {
      UpdateInstanceDestinationOptions updateInstanceDestinationOptions = new UpdateInstanceDestinationOptions.Builder()
        .instanceId("bfc50c2e-d66d-4f37-9ccf-9713f8325b39")
        .destinationId("b2c3d4e5-f6a7-8901-bcde-f12345678901")
        .requestBody(java.util.Collections.singletonMap("anyKey", "anyValue"))
        .build();

      // Invoke operation
      Response<Void> response = service.updateInstanceDestination(updateInstanceDestinationOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testUpdateInstanceDestination" })
  public void testDeleteInstanceAdmintokens() throws Exception {
    try {
      DeleteInstanceAdmintokensOptions deleteInstanceAdmintokensOptions = new DeleteInstanceAdmintokensOptions.Builder()
        .id("bfc50c2e-d66d-4f37-9ccf-9713f8325b39")
        .build();

      // Invoke operation
      Response<Void> response = service.deleteInstanceAdmintokens(deleteInstanceAdmintokensOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testDeleteInstanceAdmintokens" })
  public void testDeleteInstanceDestination() throws Exception {
    try {
      DeleteInstanceDestinationOptions deleteInstanceDestinationOptions = new DeleteInstanceDestinationOptions.Builder()
        .instanceId("bfc50c2e-d66d-4f37-9ccf-9713f8325b39")
        .destinationId("b2c3d4e5-f6a7-8901-bcde-f12345678901")
        .build();

      // Invoke operation
      Response<Void> response = service.deleteInstanceDestination(deleteInstanceDestinationOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @AfterClass
  public void tearDown() {
    // Add any clean up logic here
    System.out.println("Clean up complete.");
  }
 }
