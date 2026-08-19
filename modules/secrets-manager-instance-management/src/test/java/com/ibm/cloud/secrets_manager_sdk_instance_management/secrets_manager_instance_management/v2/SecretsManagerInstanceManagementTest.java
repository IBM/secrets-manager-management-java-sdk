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
import com.ibm.cloud.sdk.core.security.Authenticator;
import com.ibm.cloud.sdk.core.security.NoAuthAuthenticator;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import com.ibm.cloud.sdk.core.util.DateUtils;
import com.ibm.cloud.secrets_manager_sdk_instance_management.secrets_manager_instance_management.v2.SecretsManagerInstanceManagement;
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
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import okhttp3.mockwebserver.MockResponse;
import okhttp3.mockwebserver.MockWebServer;
import okhttp3.mockwebserver.RecordedRequest;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the SecretsManagerInstanceManagement service.
 */
public class SecretsManagerInstanceManagementTest {

  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  protected MockWebServer server;
  protected SecretsManagerInstanceManagement secretsManagerInstanceManagementService;

  // Construct the service with a null authenticator (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testConstructorWithNullAuthenticator() throws Throwable {
    final String serviceName = "testService";
    new SecretsManagerInstanceManagement(serviceName, null);
  }

  // Construct the service URL using the default server variable values
  @Test
  public void testConstructServiceURLwithDefaultValues() throws Throwable {
    String defaultFormattedUrl = "https://us-south.secrets-manager.cloud.ibm.com";
    String constructedUrl = SecretsManagerInstanceManagement.constructServiceUrl(null);
    assertEquals(constructedUrl, defaultFormattedUrl);
  }

  // Construct the service URL with an invalid server variable name (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testConstructServiceURLWithInvalidVariable() throws Throwable {
    Map<String, String> variables = new HashMap<>();
    variables.put("invalid_variable_name", "value");

    SecretsManagerInstanceManagement.constructServiceUrl(variables);
  }

  // Test the createVaultAdmintoken operation with a valid options model parameter
  @Test
  public void testCreateVaultAdmintokenWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"token\": \"hvs.CAESIIG_PILmULFYOsEyWHxkZ2mF2a8V...example...p3ZnpWbDF1RUNjUkNTZEg\"}";
    String createVaultAdmintokenPath = "/v2/instances/bfc50c2e-d66d-4f37-9ccf-9713f8325b39/admintokens";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(201)
      .setBody(mockResponseBody));

    // Construct an instance of the CreateVaultAdmintokenOptions model
    CreateVaultAdmintokenOptions createVaultAdmintokenOptionsModel = new CreateVaultAdmintokenOptions.Builder()
      .id("bfc50c2e-d66d-4f37-9ccf-9713f8325b39")
      .build();

    // Invoke createVaultAdmintoken() with a valid options model and verify the result
    Response<Token> response = secretsManagerInstanceManagementService.createVaultAdmintoken(createVaultAdmintokenOptionsModel).execute();
    assertNotNull(response);
    Token responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createVaultAdmintokenPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the createVaultAdmintoken operation with and without retries enabled
  @Test
  public void testCreateVaultAdmintokenWRetries() throws Throwable {
    secretsManagerInstanceManagementService.enableRetries(4, 30);
    testCreateVaultAdmintokenWOptions();

    secretsManagerInstanceManagementService.disableRetries();
    testCreateVaultAdmintokenWOptions();
  }

  // Test the createVaultAdmintoken operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateVaultAdmintokenNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    secretsManagerInstanceManagementService.createVaultAdmintoken(null).execute();
  }

  // Test the deleteInstanceAdmintokens operation with a valid options model parameter
  @Test
  public void testDeleteInstanceAdmintokensWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "";
    String deleteInstanceAdmintokensPath = "/v2/instances/bfc50c2e-d66d-4f37-9ccf-9713f8325b39/admintokens";
    server.enqueue(new MockResponse()
      .setResponseCode(204)
      .setBody(mockResponseBody));

    // Construct an instance of the DeleteInstanceAdmintokensOptions model
    DeleteInstanceAdmintokensOptions deleteInstanceAdmintokensOptionsModel = new DeleteInstanceAdmintokensOptions.Builder()
      .id("bfc50c2e-d66d-4f37-9ccf-9713f8325b39")
      .build();

    // Invoke deleteInstanceAdmintokens() with a valid options model and verify the result
    Response<Void> response = secretsManagerInstanceManagementService.deleteInstanceAdmintokens(deleteInstanceAdmintokensOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    assertNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteInstanceAdmintokensPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the deleteInstanceAdmintokens operation with and without retries enabled
  @Test
  public void testDeleteInstanceAdmintokensWRetries() throws Throwable {
    secretsManagerInstanceManagementService.enableRetries(4, 30);
    testDeleteInstanceAdmintokensWOptions();

    secretsManagerInstanceManagementService.disableRetries();
    testDeleteInstanceAdmintokensWOptions();
  }

  // Test the deleteInstanceAdmintokens operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteInstanceAdmintokensNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    secretsManagerInstanceManagementService.deleteInstanceAdmintokens(null).execute();
  }

  // Test the getInstance operation with a valid options model parameter
  @Test
  public void testGetInstanceWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"id\": \"9fab83da-98cb-4f18-a7ba-b6f0435c9673\", \"name\": \"name\", \"instance_crn\": \"crn:v1:bluemix:public:secrets-manager:us-south:a/791f3fb10486421e97aa8512f18b7e65:b49ad24d-81d4-5ebc-b9b9-b0937d1c84d5::\", \"plan\": \"dedicated\", \"vault_cluster\": {\"status\": \"healthy\", \"version\": \"1.21.2+ent.hsm\"}, \"endpoints\": {\"public\": {\"vault_api\": \"https://f85f512b-e21b-4a9a-ac45-7bbc2f5cew2e.us-south.secrets-manager.appdomain.cloud\", \"vault_ui\": \"https://f85f512b-e21b-4a9a-ac45-7bbc2f5cew2e.us-south.secrets-manager.appdomain.cloud/ui\"}, \"private\": {\"vault_api\": \"https://f85f512b-e21b-4a9a-ac45-7bbc2f5cew2e.us-south.secrets-manager.appdomain.cloud\", \"vault_ui\": \"https://f85f512b-e21b-4a9a-ac45-7bbc2f5cew2e.us-south.secrets-manager.appdomain.cloud/ui\"}}, \"encryption\": {\"mode\": \"service_managed\", \"provider\": \"key_protect\", \"key_crn\": \"crn:v1:bluemix:public:kms:us-south:a/791f5fb10986423e97aa8512f18b7e65:31639268-42e8-4420-9872-590a6ee20506:key:b4af8f76-e6ea-4dc5-89cc-5f1b9bb207cc\"}, \"href\": \"https://us-south.secrets-manager.cloud.ibm.com/v2/instances/bfc50c2e-d66d-4f37-9ccf-9713f8325b39\"}";
    String getInstancePath = "/v2/instances/bfc50c2e-d66d-4f37-9ccf-9713f8325b39";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetInstanceOptions model
    GetInstanceOptions getInstanceOptionsModel = new GetInstanceOptions.Builder()
      .id("bfc50c2e-d66d-4f37-9ccf-9713f8325b39")
      .build();

    // Invoke getInstance() with a valid options model and verify the result
    Response<Instance> response = secretsManagerInstanceManagementService.getInstance(getInstanceOptionsModel).execute();
    assertNotNull(response);
    Instance responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getInstancePath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getInstance operation with and without retries enabled
  @Test
  public void testGetInstanceWRetries() throws Throwable {
    secretsManagerInstanceManagementService.enableRetries(4, 30);
    testGetInstanceWOptions();

    secretsManagerInstanceManagementService.disableRetries();
    testGetInstanceWOptions();
  }

  // Test the getInstance operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetInstanceNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    secretsManagerInstanceManagementService.getInstance(null).execute();
  }

  // Test the listInstanceDestinations operation with a valid options model parameter
  @Test
  public void testListInstanceDestinationsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"destinations\": [{\"id\": \"9fab83da-98cb-4f18-a7ba-b6f0435c9673\", \"href\": \"https://us-south.secrets-manager.cloud.ibm.com/v2/instances/bfc50c2e-d66d-4f37-9ccf-9713f8325b39/destinations/ce8aa9a4-8cde-4b63-8156-d4a8b252beeb\", \"name\": \"name\", \"type\": \"ibm_cloud_database\", \"description\": \"description\", \"state\": \"not_started\", \"created_at\": \"2019-01-01T12:00:00.000Z\", \"updated_at\": \"2019-01-01T12:00:00.000Z\", \"created_by\": \"createdBy\", \"crn\": \"crn\"}], \"total\": 0}";
    String listInstanceDestinationsPath = "/v2/instances/bfc50c2e-d66d-4f37-9ccf-9713f8325b39/destinations";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ListInstanceDestinationsOptions model
    ListInstanceDestinationsOptions listInstanceDestinationsOptionsModel = new ListInstanceDestinationsOptions.Builder()
      .instanceId("bfc50c2e-d66d-4f37-9ccf-9713f8325b39")
      .state("not_started")
      .build();

    // Invoke listInstanceDestinations() with a valid options model and verify the result
    Response<DestinationCollection> response = secretsManagerInstanceManagementService.listInstanceDestinations(listInstanceDestinationsOptionsModel).execute();
    assertNotNull(response);
    DestinationCollection responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listInstanceDestinationsPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("state"), "not_started");
  }

  // Test the listInstanceDestinations operation with and without retries enabled
  @Test
  public void testListInstanceDestinationsWRetries() throws Throwable {
    secretsManagerInstanceManagementService.enableRetries(4, 30);
    testListInstanceDestinationsWOptions();

    secretsManagerInstanceManagementService.disableRetries();
    testListInstanceDestinationsWOptions();
  }

  // Test the listInstanceDestinations operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListInstanceDestinationsNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    secretsManagerInstanceManagementService.listInstanceDestinations(null).execute();
  }

  // Test the createInstanceDestination operation with a valid options model parameter
  @Test
  public void testCreateInstanceDestinationWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "";
    String createInstanceDestinationPath = "/v2/instances/bfc50c2e-d66d-4f37-9ccf-9713f8325b39/destinations";
    server.enqueue(new MockResponse()
      .setResponseCode(201)
      .setBody(mockResponseBody));

    // Construct an instance of the CreateInstanceDestinationOptions model
    CreateInstanceDestinationOptions createInstanceDestinationOptionsModel = new CreateInstanceDestinationOptions.Builder()
      .instanceId("bfc50c2e-d66d-4f37-9ccf-9713f8325b39")
      .name("my-postgres")
      .type("ibm_cloud_database")
      .description("Production PostgreSQL database")
      .crn("crn:v1:bluemix:public:databases-for-postgresql:us-south:a/e91c8f42b3d74e1a9c2f05d8b67a3e10:3f8b1c7a-9d42-4e6f-b8a5-2c1d9e7f4b83::")
      .build();

    // Invoke createInstanceDestination() with a valid options model and verify the result
    Response<Void> response = secretsManagerInstanceManagementService.createInstanceDestination(createInstanceDestinationOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    assertNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createInstanceDestinationPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the createInstanceDestination operation with and without retries enabled
  @Test
  public void testCreateInstanceDestinationWRetries() throws Throwable {
    secretsManagerInstanceManagementService.enableRetries(4, 30);
    testCreateInstanceDestinationWOptions();

    secretsManagerInstanceManagementService.disableRetries();
    testCreateInstanceDestinationWOptions();
  }

  // Test the createInstanceDestination operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateInstanceDestinationNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    secretsManagerInstanceManagementService.createInstanceDestination(null).execute();
  }

  // Test the getInstanceDestination operation with a valid options model parameter
  @Test
  public void testGetInstanceDestinationWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "";
    String getInstanceDestinationPath = "/v2/instances/bfc50c2e-d66d-4f37-9ccf-9713f8325b39/destinations/b2c3d4e5-f6a7-8901-bcde-f12345678901";
    server.enqueue(new MockResponse()
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetInstanceDestinationOptions model
    GetInstanceDestinationOptions getInstanceDestinationOptionsModel = new GetInstanceDestinationOptions.Builder()
      .instanceId("bfc50c2e-d66d-4f37-9ccf-9713f8325b39")
      .destinationId("b2c3d4e5-f6a7-8901-bcde-f12345678901")
      .build();

    // Invoke getInstanceDestination() with a valid options model and verify the result
    Response<Void> response = secretsManagerInstanceManagementService.getInstanceDestination(getInstanceDestinationOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    assertNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getInstanceDestinationPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getInstanceDestination operation with and without retries enabled
  @Test
  public void testGetInstanceDestinationWRetries() throws Throwable {
    secretsManagerInstanceManagementService.enableRetries(4, 30);
    testGetInstanceDestinationWOptions();

    secretsManagerInstanceManagementService.disableRetries();
    testGetInstanceDestinationWOptions();
  }

  // Test the getInstanceDestination operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetInstanceDestinationNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    secretsManagerInstanceManagementService.getInstanceDestination(null).execute();
  }

  // Test the updateInstanceDestination operation with a valid options model parameter
  @Test
  public void testUpdateInstanceDestinationWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "";
    String updateInstanceDestinationPath = "/v2/instances/bfc50c2e-d66d-4f37-9ccf-9713f8325b39/destinations/b2c3d4e5-f6a7-8901-bcde-f12345678901";
    server.enqueue(new MockResponse()
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the UpdateInstanceDestinationOptions model
    UpdateInstanceDestinationOptions updateInstanceDestinationOptionsModel = new UpdateInstanceDestinationOptions.Builder()
      .instanceId("bfc50c2e-d66d-4f37-9ccf-9713f8325b39")
      .destinationId("b2c3d4e5-f6a7-8901-bcde-f12345678901")
      .requestBody(java.util.Collections.singletonMap("anyKey", "anyValue"))
      .build();

    // Invoke updateInstanceDestination() with a valid options model and verify the result
    Response<Void> response = secretsManagerInstanceManagementService.updateInstanceDestination(updateInstanceDestinationOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    assertNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateInstanceDestinationPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the updateInstanceDestination operation with and without retries enabled
  @Test
  public void testUpdateInstanceDestinationWRetries() throws Throwable {
    secretsManagerInstanceManagementService.enableRetries(4, 30);
    testUpdateInstanceDestinationWOptions();

    secretsManagerInstanceManagementService.disableRetries();
    testUpdateInstanceDestinationWOptions();
  }

  // Test the updateInstanceDestination operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateInstanceDestinationNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    secretsManagerInstanceManagementService.updateInstanceDestination(null).execute();
  }

  // Test the deleteInstanceDestination operation with a valid options model parameter
  @Test
  public void testDeleteInstanceDestinationWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "";
    String deleteInstanceDestinationPath = "/v2/instances/bfc50c2e-d66d-4f37-9ccf-9713f8325b39/destinations/b2c3d4e5-f6a7-8901-bcde-f12345678901";
    server.enqueue(new MockResponse()
      .setResponseCode(204)
      .setBody(mockResponseBody));

    // Construct an instance of the DeleteInstanceDestinationOptions model
    DeleteInstanceDestinationOptions deleteInstanceDestinationOptionsModel = new DeleteInstanceDestinationOptions.Builder()
      .instanceId("bfc50c2e-d66d-4f37-9ccf-9713f8325b39")
      .destinationId("b2c3d4e5-f6a7-8901-bcde-f12345678901")
      .build();

    // Invoke deleteInstanceDestination() with a valid options model and verify the result
    Response<Void> response = secretsManagerInstanceManagementService.deleteInstanceDestination(deleteInstanceDestinationOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    assertNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteInstanceDestinationPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the deleteInstanceDestination operation with and without retries enabled
  @Test
  public void testDeleteInstanceDestinationWRetries() throws Throwable {
    secretsManagerInstanceManagementService.enableRetries(4, 30);
    testDeleteInstanceDestinationWOptions();

    secretsManagerInstanceManagementService.disableRetries();
    testDeleteInstanceDestinationWOptions();
  }

  // Test the deleteInstanceDestination operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteInstanceDestinationNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    secretsManagerInstanceManagementService.deleteInstanceDestination(null).execute();
  }

  // Perform setup needed before each test method
  @BeforeMethod
  public void beforeEachTest() {
    // Start the mock server.
    try {
      server = new MockWebServer();
      server.start();
    } catch (IOException err) {
      fail("Failed to instantiate mock web server");
    }

    // Construct an instance of the service
    constructClientService();
  }

  // Perform tear down after each test method
  @AfterMethod
  public void afterEachTest() throws IOException {
    server.shutdown();
    secretsManagerInstanceManagementService = null;
  }

  // Constructs an instance of the service to be used by the tests
  public void constructClientService() {
    System.setProperty("TESTSERVICE_AUTH_TYPE", "noAuth");
    final String serviceName = "testService";

    secretsManagerInstanceManagementService = SecretsManagerInstanceManagement.newInstance(serviceName);
    String url = server.url("/").toString();
    secretsManagerInstanceManagementService.setServiceUrl(url);
  }
}