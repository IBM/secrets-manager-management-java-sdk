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
import com.ibm.cloud.secrets_manager_sdk_instance_management.secrets_manager_instance_management.v2.model.ApplyHsmDestinationOptions;
import com.ibm.cloud.secrets_manager_sdk_instance_management.secrets_manager_instance_management.v2.model.AsyncDeleteResponse;
import com.ibm.cloud.secrets_manager_sdk_instance_management.secrets_manager_instance_management.v2.model.AsyncHealthAckResponse;
import com.ibm.cloud.secrets_manager_sdk_instance_management.secrets_manager_instance_management.v2.model.AsyncHealthCheckAckResponse;
import com.ibm.cloud.secrets_manager_sdk_instance_management.secrets_manager_instance_management.v2.model.ClientCertificate;
import com.ibm.cloud.secrets_manager_sdk_instance_management.secrets_manager_instance_management.v2.model.ClientCertificateCollection;
import com.ibm.cloud.secrets_manager_sdk_instance_management.secrets_manager_instance_management.v2.model.ClientCertificatePatch;
import com.ibm.cloud.secrets_manager_sdk_instance_management.secrets_manager_instance_management.v2.model.CreateDestinationRequest;
import com.ibm.cloud.secrets_manager_sdk_instance_management.secrets_manager_instance_management.v2.model.CreateDestinationRequestIbmCloudDatabaseDestinationPrototype;
import com.ibm.cloud.secrets_manager_sdk_instance_management.secrets_manager_instance_management.v2.model.CreateInstanceDestinationOptions;
import com.ibm.cloud.secrets_manager_sdk_instance_management.secrets_manager_instance_management.v2.model.CreateInstanceHsmDestinationClientCertificateOptions;
import com.ibm.cloud.secrets_manager_sdk_instance_management.secrets_manager_instance_management.v2.model.CreateInstanceHsmDestinationHaGroupOptions;
import com.ibm.cloud.secrets_manager_sdk_instance_management.secrets_manager_instance_management.v2.model.CreateInstanceHsmDestinationOptions;
import com.ibm.cloud.secrets_manager_sdk_instance_management.secrets_manager_instance_management.v2.model.CreateInstanceHsmDestinationPathOptions;
import com.ibm.cloud.secrets_manager_sdk_instance_management.secrets_manager_instance_management.v2.model.CreateInstanceHsmDestinationPathServerCaOptions;
import com.ibm.cloud.secrets_manager_sdk_instance_management.secrets_manager_instance_management.v2.model.CreatePathBuildOptions;
import com.ibm.cloud.secrets_manager_sdk_instance_management.secrets_manager_instance_management.v2.model.CreateVaultAdmintokenOptions;
import com.ibm.cloud.secrets_manager_sdk_instance_management.secrets_manager_instance_management.v2.model.DeleteInstanceDestinationOptions;
import com.ibm.cloud.secrets_manager_sdk_instance_management.secrets_manager_instance_management.v2.model.DeleteInstanceHsmDestinationClientCertificateOptions;
import com.ibm.cloud.secrets_manager_sdk_instance_management.secrets_manager_instance_management.v2.model.DeleteInstanceHsmDestinationHaGroupOptions;
import com.ibm.cloud.secrets_manager_sdk_instance_management.secrets_manager_instance_management.v2.model.DeleteInstanceHsmDestinationOptions;
import com.ibm.cloud.secrets_manager_sdk_instance_management.secrets_manager_instance_management.v2.model.DeleteInstanceHsmDestinationPathOptions;
import com.ibm.cloud.secrets_manager_sdk_instance_management.secrets_manager_instance_management.v2.model.DeleteInstanceHsmDestinationPathServerCaOptions;
import com.ibm.cloud.secrets_manager_sdk_instance_management.secrets_manager_instance_management.v2.model.DeleteVaultAdmintokensOptions;
import com.ibm.cloud.secrets_manager_sdk_instance_management.secrets_manager_instance_management.v2.model.Destination;
import com.ibm.cloud.secrets_manager_sdk_instance_management.secrets_manager_instance_management.v2.model.DestinationCollection;
import com.ibm.cloud.secrets_manager_sdk_instance_management.secrets_manager_instance_management.v2.model.DestinationHealthSnapshot;
import com.ibm.cloud.secrets_manager_sdk_instance_management.secrets_manager_instance_management.v2.model.DestinationPatch;
import com.ibm.cloud.secrets_manager_sdk_instance_management.secrets_manager_instance_management.v2.model.GetHsmDestinationHealthSnapshotOptions;
import com.ibm.cloud.secrets_manager_sdk_instance_management.secrets_manager_instance_management.v2.model.GetInstanceDestinationOptions;
import com.ibm.cloud.secrets_manager_sdk_instance_management.secrets_manager_instance_management.v2.model.GetInstanceHsmDestinationClientCertificateOptions;
import com.ibm.cloud.secrets_manager_sdk_instance_management.secrets_manager_instance_management.v2.model.GetInstanceHsmDestinationHaGroupOptions;
import com.ibm.cloud.secrets_manager_sdk_instance_management.secrets_manager_instance_management.v2.model.GetInstanceHsmDestinationOptions;
import com.ibm.cloud.secrets_manager_sdk_instance_management.secrets_manager_instance_management.v2.model.GetInstanceHsmDestinationPathOptions;
import com.ibm.cloud.secrets_manager_sdk_instance_management.secrets_manager_instance_management.v2.model.GetInstanceHsmDestinationPathServerCaOptions;
import com.ibm.cloud.secrets_manager_sdk_instance_management.secrets_manager_instance_management.v2.model.GetInstanceOptions;
import com.ibm.cloud.secrets_manager_sdk_instance_management.secrets_manager_instance_management.v2.model.GetPathVpeStatusOptions;
import com.ibm.cloud.secrets_manager_sdk_instance_management.secrets_manager_instance_management.v2.model.HSMDestination;
import com.ibm.cloud.secrets_manager_sdk_instance_management.secrets_manager_instance_management.v2.model.HSMDestinationCollection;
import com.ibm.cloud.secrets_manager_sdk_instance_management.secrets_manager_instance_management.v2.model.HSMDestinationPatch;
import com.ibm.cloud.secrets_manager_sdk_instance_management.secrets_manager_instance_management.v2.model.HSMHAGroup;
import com.ibm.cloud.secrets_manager_sdk_instance_management.secrets_manager_instance_management.v2.model.HSMHAGroupCollection;
import com.ibm.cloud.secrets_manager_sdk_instance_management.secrets_manager_instance_management.v2.model.HSMHAGroupPatch;
import com.ibm.cloud.secrets_manager_sdk_instance_management.secrets_manager_instance_management.v2.model.HSMPathReset;
import com.ibm.cloud.secrets_manager_sdk_instance_management.secrets_manager_instance_management.v2.model.HealthSnapshotClientCert;
import com.ibm.cloud.secrets_manager_sdk_instance_management.secrets_manager_instance_management.v2.model.HealthSnapshotConnection;
import com.ibm.cloud.secrets_manager_sdk_instance_management.secrets_manager_instance_management.v2.model.HealthSnapshotHSMHAGroup;
import com.ibm.cloud.secrets_manager_sdk_instance_management.secrets_manager_instance_management.v2.model.HealthSnapshotServerCa;
import com.ibm.cloud.secrets_manager_sdk_instance_management.secrets_manager_instance_management.v2.model.IbmCloudDatabaseDestination;
import com.ibm.cloud.secrets_manager_sdk_instance_management.secrets_manager_instance_management.v2.model.Instance;
import com.ibm.cloud.secrets_manager_sdk_instance_management.secrets_manager_instance_management.v2.model.ListInstanceDestinationsOptions;
import com.ibm.cloud.secrets_manager_sdk_instance_management.secrets_manager_instance_management.v2.model.ListInstanceHsmDestinationClientCertificatesOptions;
import com.ibm.cloud.secrets_manager_sdk_instance_management.secrets_manager_instance_management.v2.model.ListInstanceHsmDestinationHaGroupsOptions;
import com.ibm.cloud.secrets_manager_sdk_instance_management.secrets_manager_instance_management.v2.model.ListInstanceHsmDestinationPathServerCasOptions;
import com.ibm.cloud.secrets_manager_sdk_instance_management.secrets_manager_instance_management.v2.model.ListInstanceHsmDestinationPathsOptions;
import com.ibm.cloud.secrets_manager_sdk_instance_management.secrets_manager_instance_management.v2.model.ListInstanceHsmDestinationsOptions;
import com.ibm.cloud.secrets_manager_sdk_instance_management.secrets_manager_instance_management.v2.model.Path;
import com.ibm.cloud.secrets_manager_sdk_instance_management.secrets_manager_instance_management.v2.model.PathCollection;
import com.ibm.cloud.secrets_manager_sdk_instance_management.secrets_manager_instance_management.v2.model.PathPatch;
import com.ibm.cloud.secrets_manager_sdk_instance_management.secrets_manager_instance_management.v2.model.ResetHsmDestinationPathOptions;
import com.ibm.cloud.secrets_manager_sdk_instance_management.secrets_manager_instance_management.v2.model.RunHsmDestinationHealthCheckOptions;
import com.ibm.cloud.secrets_manager_sdk_instance_management.secrets_manager_instance_management.v2.model.ServerCa;
import com.ibm.cloud.secrets_manager_sdk_instance_management.secrets_manager_instance_management.v2.model.ServerCaCollection;
import com.ibm.cloud.secrets_manager_sdk_instance_management.secrets_manager_instance_management.v2.model.ServerCaPatch;
import com.ibm.cloud.secrets_manager_sdk_instance_management.secrets_manager_instance_management.v2.model.Token;
import com.ibm.cloud.secrets_manager_sdk_instance_management.secrets_manager_instance_management.v2.model.TokenPlainAdminToken;
import com.ibm.cloud.secrets_manager_sdk_instance_management.secrets_manager_instance_management.v2.model.TokenWrappedAdminToken;
import com.ibm.cloud.secrets_manager_sdk_instance_management.secrets_manager_instance_management.v2.model.UpdateInstanceDestinationOptions;
import com.ibm.cloud.secrets_manager_sdk_instance_management.secrets_manager_instance_management.v2.model.UpdateInstanceHsmDestinationClientCertificateOptions;
import com.ibm.cloud.secrets_manager_sdk_instance_management.secrets_manager_instance_management.v2.model.UpdateInstanceHsmDestinationHaGroupOptions;
import com.ibm.cloud.secrets_manager_sdk_instance_management.secrets_manager_instance_management.v2.model.UpdateInstanceHsmDestinationOptions;
import com.ibm.cloud.secrets_manager_sdk_instance_management.secrets_manager_instance_management.v2.model.UpdateInstanceHsmDestinationPathOptions;
import com.ibm.cloud.secrets_manager_sdk_instance_management.secrets_manager_instance_management.v2.model.UpdateInstanceHsmDestinationPathServerCaOptions;
import com.ibm.cloud.secrets_manager_sdk_instance_management.secrets_manager_instance_management.v2.model.VaultDedicatedCluster;
import com.ibm.cloud.secrets_manager_sdk_instance_management.secrets_manager_instance_management.v2.model.VaultDedicatedEndpointsData;
import com.ibm.cloud.secrets_manager_sdk_instance_management.secrets_manager_instance_management.v2.model.VaultDedicatedInstanceEncryption;
import com.ibm.cloud.secrets_manager_sdk_instance_management.secrets_manager_instance_management.v2.model.VaultDedicatedInstanceEndpoints;
import com.ibm.cloud.secrets_manager_sdk_instance_management.secrets_manager_instance_management.v2.model.VpeProvisioningResponse;
import com.ibm.cloud.secrets_manager_sdk_instance_management.secrets_manager_instance_management.v2.model.VpeStatusResult;
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
    String mockResponseBody = "{\"token\": \"hvs.CAESIC202dQW-jogohoywlivU-AMllTdeNT0QBiob9OBmyfnGigKImh2cy5yUkxpcmVaZURzTmw5cgtevFoyelBpYkguYW82SlMQyr0Q\"}";
    String createVaultAdmintokenPath = "/v2/instances/fe5c5c27-3e44-474a-9484-55892e12d6d1/admintokens";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(201)
      .setBody(mockResponseBody));

    // Construct an instance of the CreateVaultAdmintokenOptions model
    CreateVaultAdmintokenOptions createVaultAdmintokenOptionsModel = new CreateVaultAdmintokenOptions.Builder()
      .instanceId("fe5c5c27-3e44-474a-9484-55892e12d6d1")
      .responseWrapping(true)
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

  // Test the deleteVaultAdmintokens operation with a valid options model parameter
  @Test
  public void testDeleteVaultAdmintokensWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "";
    String deleteVaultAdmintokensPath = "/v2/instances/fe5c5c27-3e44-474a-9484-55892e12d6d1/admintokens";
    server.enqueue(new MockResponse()
      .setResponseCode(204)
      .setBody(mockResponseBody));

    // Construct an instance of the DeleteVaultAdmintokensOptions model
    DeleteVaultAdmintokensOptions deleteVaultAdmintokensOptionsModel = new DeleteVaultAdmintokensOptions.Builder()
      .instanceId("fe5c5c27-3e44-474a-9484-55892e12d6d1")
      .build();

    // Invoke deleteVaultAdmintokens() with a valid options model and verify the result
    Response<Void> response = secretsManagerInstanceManagementService.deleteVaultAdmintokens(deleteVaultAdmintokensOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    assertNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteVaultAdmintokensPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the deleteVaultAdmintokens operation with and without retries enabled
  @Test
  public void testDeleteVaultAdmintokensWRetries() throws Throwable {
    secretsManagerInstanceManagementService.enableRetries(4, 30);
    testDeleteVaultAdmintokensWOptions();

    secretsManagerInstanceManagementService.disableRetries();
    testDeleteVaultAdmintokensWOptions();
  }

  // Test the deleteVaultAdmintokens operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteVaultAdmintokensNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    secretsManagerInstanceManagementService.deleteVaultAdmintokens(null).execute();
  }

  // Test the getInstance operation with a valid options model parameter
  @Test
  public void testGetInstanceWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"id\": \"a1b2c3d4-e5f6-7890-abcd-ef1234567890\", \"name\": \"name\", \"instance_crn\": \"crn:v1:bluemix:public:secrets-manager:us-south:a/791f3fb10486421e97aa8512f18b7e65:b49ad24d-81d4-5ebc-b9b9-b0937d1c84d5::\", \"plan\": \"dedicated\", \"vault_cluster\": {\"status\": \"healthy\", \"version\": \"1.21.2+ent.hsm\"}, \"endpoints\": {\"public\": {\"vault_api\": \"https://f85f512b-e21b-4a9a-ac45-7bbc2f5cew2e.us-south.secrets-manager.appdomain.cloud\", \"vault_ui\": \"https://f85f512b-e21b-4a9a-ac45-7bbc2f5cew2e.us-south.secrets-manager.appdomain.cloud/ui\"}, \"private\": {\"vault_api\": \"https://f85f512b-e21b-4a9a-ac45-7bbc2f5cew2e.us-south.secrets-manager.appdomain.cloud\", \"vault_ui\": \"https://f85f512b-e21b-4a9a-ac45-7bbc2f5cew2e.us-south.secrets-manager.appdomain.cloud/ui\"}}, \"encryption\": {\"mode\": \"service_managed\", \"provider\": \"key_protect\", \"key_crn\": \"crn:v1:bluemix:public:kms:us-south:a/791f5fb10986423e97aa8512f18b7e65:31639268-42e8-4420-9872-590a6ee20506:key:b4af8f76-e6ea-4dc5-89cc-5f1b9bb207cc\"}, \"href\": \"https://us-south.secrets-manager.cloud.ibm.com/v2/instances/fe5c5c27-3e44-474a-9484-55892e12d6d1\"}";
    String getInstancePath = "/v2/instances/fe5c5c27-3e44-474a-9484-55892e12d6d1";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetInstanceOptions model
    GetInstanceOptions getInstanceOptionsModel = new GetInstanceOptions.Builder()
      .instanceId("fe5c5c27-3e44-474a-9484-55892e12d6d1")
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
    String mockResponseBody = "{\"destinations\": [{\"id\": \"a1b2c3d4-e5f6-7890-abcd-ef1234567890\", \"href\": \"https://us-south.secrets-manager.cloud.ibm.com/v2/instances/fe5c5c27-3e44-474a-9484-55892e12d6d1/destinations/ce8aa9a4-8cde-4b63-8156-d4a8b252beeb\", \"name\": \"name\", \"type\": \"ibm_cloud_database\", \"description\": \"description\", \"state\": \"not_started\", \"created_at\": \"2019-01-01T12:00:00.000Z\", \"updated_at\": \"2019-01-01T12:00:00.000Z\", \"created_by\": \"createdBy\", \"message\": \"failed to provision\"}], \"total\": 0}";
    String listInstanceDestinationsPath = "/v2/instances/fe5c5c27-3e44-474a-9484-55892e12d6d1/destinations";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ListInstanceDestinationsOptions model
    ListInstanceDestinationsOptions listInstanceDestinationsOptionsModel = new ListInstanceDestinationsOptions.Builder()
      .instanceId("fe5c5c27-3e44-474a-9484-55892e12d6d1")
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
    String mockResponseBody = "{\"id\": \"a1b2c3d4-e5f6-7890-abcd-ef1234567890\", \"href\": \"https://us-south.secrets-manager.cloud.ibm.com/v2/instances/fe5c5c27-3e44-474a-9484-55892e12d6d1/destinations/ce8aa9a4-8cde-4b63-8156-d4a8b252beeb\", \"name\": \"name\", \"type\": \"ibm_cloud_database\", \"description\": \"description\", \"state\": \"not_started\", \"created_at\": \"2019-01-01T12:00:00.000Z\", \"updated_at\": \"2019-01-01T12:00:00.000Z\", \"created_by\": \"createdBy\", \"message\": \"failed to provision\", \"crn\": \"crn\"}";
    String createInstanceDestinationPath = "/v2/instances/fe5c5c27-3e44-474a-9484-55892e12d6d1/destinations";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(202)
      .setBody(mockResponseBody));

    // Construct an instance of the CreateDestinationRequestIbmCloudDatabaseDestinationPrototype model
    CreateDestinationRequestIbmCloudDatabaseDestinationPrototype createDestinationRequestModel = new CreateDestinationRequestIbmCloudDatabaseDestinationPrototype.Builder()
      .name("my-postgres")
      .type("ibm_cloud_database")
      .description("Production PostgreSQL database")
      .crn("crn:v1:bluemix:public:databases-for-postgresql:us-south:a/e91c8f42b3d74e1a9c2f05d8b67a3e10:3f8b1c7a-9d42-4e6f-b8a5-2c1d9e7f4b83::")
      .build();

    // Construct an instance of the CreateInstanceDestinationOptions model
    CreateInstanceDestinationOptions createInstanceDestinationOptionsModel = new CreateInstanceDestinationOptions.Builder()
      .instanceId("fe5c5c27-3e44-474a-9484-55892e12d6d1")
      .destinationPrototype(createDestinationRequestModel)
      .build();

    // Invoke createInstanceDestination() with a valid options model and verify the result
    Response<IbmCloudDatabaseDestination> response = secretsManagerInstanceManagementService.createInstanceDestination(createInstanceDestinationOptionsModel).execute();
    assertNotNull(response);
    IbmCloudDatabaseDestination responseObj = response.getResult();
    assertNotNull(responseObj);

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
    String mockResponseBody = "{\"id\": \"a1b2c3d4-e5f6-7890-abcd-ef1234567890\", \"href\": \"https://us-south.secrets-manager.cloud.ibm.com/v2/instances/fe5c5c27-3e44-474a-9484-55892e12d6d1/destinations/ce8aa9a4-8cde-4b63-8156-d4a8b252beeb\", \"name\": \"name\", \"type\": \"ibm_cloud_database\", \"description\": \"description\", \"state\": \"not_started\", \"created_at\": \"2019-01-01T12:00:00.000Z\", \"updated_at\": \"2019-01-01T12:00:00.000Z\", \"created_by\": \"createdBy\", \"message\": \"failed to provision\", \"crn\": \"crn\"}";
    String getInstanceDestinationPath = "/v2/instances/fe5c5c27-3e44-474a-9484-55892e12d6d1/destinations/b2c3d4e5-f6a7-8901-bcde-f12345678901";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetInstanceDestinationOptions model
    GetInstanceDestinationOptions getInstanceDestinationOptionsModel = new GetInstanceDestinationOptions.Builder()
      .instanceId("fe5c5c27-3e44-474a-9484-55892e12d6d1")
      .destinationId("b2c3d4e5-f6a7-8901-bcde-f12345678901")
      .build();

    // Invoke getInstanceDestination() with a valid options model and verify the result
    Response<IbmCloudDatabaseDestination> response = secretsManagerInstanceManagementService.getInstanceDestination(getInstanceDestinationOptionsModel).execute();
    assertNotNull(response);
    IbmCloudDatabaseDestination responseObj = response.getResult();
    assertNotNull(responseObj);

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
    String mockResponseBody = "{\"id\": \"a1b2c3d4-e5f6-7890-abcd-ef1234567890\", \"href\": \"https://us-south.secrets-manager.cloud.ibm.com/v2/instances/fe5c5c27-3e44-474a-9484-55892e12d6d1/destinations/ce8aa9a4-8cde-4b63-8156-d4a8b252beeb\", \"name\": \"name\", \"type\": \"ibm_cloud_database\", \"description\": \"description\", \"state\": \"not_started\", \"created_at\": \"2019-01-01T12:00:00.000Z\", \"updated_at\": \"2019-01-01T12:00:00.000Z\", \"created_by\": \"createdBy\", \"message\": \"failed to provision\", \"crn\": \"crn\"}";
    String updateInstanceDestinationPath = "/v2/instances/fe5c5c27-3e44-474a-9484-55892e12d6d1/destinations/b2c3d4e5-f6a7-8901-bcde-f12345678901";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the DestinationPatch model
    DestinationPatch destinationPatchModel = new DestinationPatch.Builder()
      .name("my-postgres-updated")
      .description("Production PostgreSQL database")
      .build();
    Map<String, Object> destinationPatchModelAsPatch = destinationPatchModel.asPatch();

    // Construct an instance of the UpdateInstanceDestinationOptions model
    UpdateInstanceDestinationOptions updateInstanceDestinationOptionsModel = new UpdateInstanceDestinationOptions.Builder()
      .instanceId("fe5c5c27-3e44-474a-9484-55892e12d6d1")
      .destinationId("b2c3d4e5-f6a7-8901-bcde-f12345678901")
      .destinationPatch(destinationPatchModelAsPatch)
      .build();

    // Invoke updateInstanceDestination() with a valid options model and verify the result
    Response<IbmCloudDatabaseDestination> response = secretsManagerInstanceManagementService.updateInstanceDestination(updateInstanceDestinationOptionsModel).execute();
    assertNotNull(response);
    IbmCloudDatabaseDestination responseObj = response.getResult();
    assertNotNull(responseObj);

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
    String mockResponseBody = "{\"id\": \"a1b2c3d4-e5f6-7890-abcd-ef1234567890\", \"href\": \"https://us-south.secrets-manager.cloud.ibm.com/v2/instances/fe5c5c27-3e44-474a-9484-55892e12d6d1/destinations/ce8aa9a4-8cde-4b63-8156-d4a8b252beeb\", \"name\": \"name\", \"type\": \"ibm_cloud_database\", \"description\": \"description\", \"state\": \"not_started\", \"created_at\": \"2019-01-01T12:00:00.000Z\", \"updated_at\": \"2019-01-01T12:00:00.000Z\", \"created_by\": \"createdBy\", \"message\": \"failed to provision\", \"crn\": \"crn\"}";
    String deleteInstanceDestinationPath = "/v2/instances/fe5c5c27-3e44-474a-9484-55892e12d6d1/destinations/b2c3d4e5-f6a7-8901-bcde-f12345678901";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(202)
      .setBody(mockResponseBody));

    // Construct an instance of the DeleteInstanceDestinationOptions model
    DeleteInstanceDestinationOptions deleteInstanceDestinationOptionsModel = new DeleteInstanceDestinationOptions.Builder()
      .instanceId("fe5c5c27-3e44-474a-9484-55892e12d6d1")
      .destinationId("b2c3d4e5-f6a7-8901-bcde-f12345678901")
      .build();

    // Invoke deleteInstanceDestination() with a valid options model and verify the result
    Response<IbmCloudDatabaseDestination> response = secretsManagerInstanceManagementService.deleteInstanceDestination(deleteInstanceDestinationOptionsModel).execute();
    assertNotNull(response);
    IbmCloudDatabaseDestination responseObj = response.getResult();
    assertNotNull(responseObj);

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

  // Test the listInstanceHsmDestinations operation with a valid options model parameter
  @Test
  public void testListInstanceHsmDestinationsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"total_count\": 1, \"hsm_destinations\": [{\"id\": \"b49ad385-0cb7-3694-a71c-2579d6e94b02\", \"href\": \"https://us-south.secrets-manager.cloud.ibm.com/v2/instances/bfc50c2e-d66d-4f37-9ccf-9713f8325b39/hsm_destinations/b49ad385-0cb7-3694-a71c-2579d6e94b02\", \"account_id\": \"a/abc123def456\", \"name\": \"prod-hsm-destination\", \"description\": \"Primary Thales Luna destination\", \"vendor\": \"thales_luna\", \"provisioning_state\": \"completed\", \"health_state\": \"healthy\", \"health_as_of\": \"2026-07-09T15:30:00.000Z\", \"created_at\": \"2026-07-09T15:00:00.000Z\", \"updated_at\": \"2026-07-09T15:30:00.000Z\", \"created_by\": \"iam-ServiceId-abc123\", \"updated_by\": \"iam-ServiceId-abc123\"}]}";
    String listInstanceHsmDestinationsPath = "/v2/instances/fe5c5c27-3e44-474a-9484-55892e12d6d1/hsm_destinations";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ListInstanceHsmDestinationsOptions model
    ListInstanceHsmDestinationsOptions listInstanceHsmDestinationsOptionsModel = new ListInstanceHsmDestinationsOptions.Builder()
      .instanceId("fe5c5c27-3e44-474a-9484-55892e12d6d1")
      .build();

    // Invoke listInstanceHsmDestinations() with a valid options model and verify the result
    Response<HSMDestinationCollection> response = secretsManagerInstanceManagementService.listInstanceHsmDestinations(listInstanceHsmDestinationsOptionsModel).execute();
    assertNotNull(response);
    HSMDestinationCollection responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listInstanceHsmDestinationsPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the listInstanceHsmDestinations operation with and without retries enabled
  @Test
  public void testListInstanceHsmDestinationsWRetries() throws Throwable {
    secretsManagerInstanceManagementService.enableRetries(4, 30);
    testListInstanceHsmDestinationsWOptions();

    secretsManagerInstanceManagementService.disableRetries();
    testListInstanceHsmDestinationsWOptions();
  }

  // Test the listInstanceHsmDestinations operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListInstanceHsmDestinationsNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    secretsManagerInstanceManagementService.listInstanceHsmDestinations(null).execute();
  }

  // Test the createInstanceHsmDestination operation with a valid options model parameter
  @Test
  public void testCreateInstanceHsmDestinationWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"id\": \"b49ad385-0cb7-3694-a71c-2579d6e94b02\", \"href\": \"https://us-south.secrets-manager.cloud.ibm.com/v2/instances/bfc50c2e-d66d-4f37-9ccf-9713f8325b39/hsm_destinations/b49ad385-0cb7-3694-a71c-2579d6e94b02\", \"account_id\": \"a/abc123def456\", \"name\": \"prod-hsm-destination\", \"description\": \"Primary Thales Luna destination\", \"vendor\": \"thales_luna\", \"provisioning_state\": \"completed\", \"health_state\": \"healthy\", \"health_as_of\": \"2026-07-09T15:30:00.000Z\", \"created_at\": \"2026-07-09T15:00:00.000Z\", \"updated_at\": \"2026-07-09T15:30:00.000Z\", \"created_by\": \"iam-ServiceId-abc123\", \"updated_by\": \"iam-ServiceId-abc123\"}";
    String createInstanceHsmDestinationPath = "/v2/instances/fe5c5c27-3e44-474a-9484-55892e12d6d1/hsm_destinations";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(201)
      .setBody(mockResponseBody));

    // Construct an instance of the CreateInstanceHsmDestinationOptions model
    CreateInstanceHsmDestinationOptions createInstanceHsmDestinationOptionsModel = new CreateInstanceHsmDestinationOptions.Builder()
      .instanceId("fe5c5c27-3e44-474a-9484-55892e12d6d1")
      .name("prod-hsm-destination")
      .vendor("thales_luna")
      .description("Primary Thales Luna destination")
      .build();

    // Invoke createInstanceHsmDestination() with a valid options model and verify the result
    Response<HSMDestination> response = secretsManagerInstanceManagementService.createInstanceHsmDestination(createInstanceHsmDestinationOptionsModel).execute();
    assertNotNull(response);
    HSMDestination responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createInstanceHsmDestinationPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the createInstanceHsmDestination operation with and without retries enabled
  @Test
  public void testCreateInstanceHsmDestinationWRetries() throws Throwable {
    secretsManagerInstanceManagementService.enableRetries(4, 30);
    testCreateInstanceHsmDestinationWOptions();

    secretsManagerInstanceManagementService.disableRetries();
    testCreateInstanceHsmDestinationWOptions();
  }

  // Test the createInstanceHsmDestination operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateInstanceHsmDestinationNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    secretsManagerInstanceManagementService.createInstanceHsmDestination(null).execute();
  }

  // Test the getInstanceHsmDestination operation with a valid options model parameter
  @Test
  public void testGetInstanceHsmDestinationWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"id\": \"b49ad385-0cb7-3694-a71c-2579d6e94b02\", \"href\": \"https://us-south.secrets-manager.cloud.ibm.com/v2/instances/bfc50c2e-d66d-4f37-9ccf-9713f8325b39/hsm_destinations/b49ad385-0cb7-3694-a71c-2579d6e94b02\", \"account_id\": \"a/abc123def456\", \"name\": \"prod-hsm-destination\", \"description\": \"Primary Thales Luna destination\", \"vendor\": \"thales_luna\", \"provisioning_state\": \"completed\", \"health_state\": \"healthy\", \"health_as_of\": \"2026-07-09T15:30:00.000Z\", \"created_at\": \"2026-07-09T15:00:00.000Z\", \"updated_at\": \"2026-07-09T15:30:00.000Z\", \"created_by\": \"iam-ServiceId-abc123\", \"updated_by\": \"iam-ServiceId-abc123\"}";
    String getInstanceHsmDestinationPath = "/v2/instances/fe5c5c27-3e44-474a-9484-55892e12d6d1/hsm_destinations/b2c3d4e5-f6a7-8901-bcde-f12345678901";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetInstanceHsmDestinationOptions model
    GetInstanceHsmDestinationOptions getInstanceHsmDestinationOptionsModel = new GetInstanceHsmDestinationOptions.Builder()
      .instanceId("fe5c5c27-3e44-474a-9484-55892e12d6d1")
      .destinationId("b2c3d4e5-f6a7-8901-bcde-f12345678901")
      .build();

    // Invoke getInstanceHsmDestination() with a valid options model and verify the result
    Response<HSMDestination> response = secretsManagerInstanceManagementService.getInstanceHsmDestination(getInstanceHsmDestinationOptionsModel).execute();
    assertNotNull(response);
    HSMDestination responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getInstanceHsmDestinationPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getInstanceHsmDestination operation with and without retries enabled
  @Test
  public void testGetInstanceHsmDestinationWRetries() throws Throwable {
    secretsManagerInstanceManagementService.enableRetries(4, 30);
    testGetInstanceHsmDestinationWOptions();

    secretsManagerInstanceManagementService.disableRetries();
    testGetInstanceHsmDestinationWOptions();
  }

  // Test the getInstanceHsmDestination operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetInstanceHsmDestinationNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    secretsManagerInstanceManagementService.getInstanceHsmDestination(null).execute();
  }

  // Test the updateInstanceHsmDestination operation with a valid options model parameter
  @Test
  public void testUpdateInstanceHsmDestinationWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"id\": \"b49ad385-0cb7-3694-a71c-2579d6e94b02\", \"href\": \"https://us-south.secrets-manager.cloud.ibm.com/v2/instances/bfc50c2e-d66d-4f37-9ccf-9713f8325b39/hsm_destinations/b49ad385-0cb7-3694-a71c-2579d6e94b02\", \"account_id\": \"a/abc123def456\", \"name\": \"prod-hsm-destination\", \"description\": \"Primary Thales Luna destination\", \"vendor\": \"thales_luna\", \"provisioning_state\": \"completed\", \"health_state\": \"healthy\", \"health_as_of\": \"2026-07-09T15:30:00.000Z\", \"created_at\": \"2026-07-09T15:00:00.000Z\", \"updated_at\": \"2026-07-09T15:30:00.000Z\", \"created_by\": \"iam-ServiceId-abc123\", \"updated_by\": \"iam-ServiceId-abc123\"}";
    String updateInstanceHsmDestinationPath = "/v2/instances/fe5c5c27-3e44-474a-9484-55892e12d6d1/hsm_destinations/b2c3d4e5-f6a7-8901-bcde-f12345678901";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the HSMDestinationPatch model
    HSMDestinationPatch hsmDestinationPatchModel = new HSMDestinationPatch.Builder()
      .name("my-hsm-destination")
      .description("testString")
      .build();
    Map<String, Object> hsmDestinationPatchModelAsPatch = hsmDestinationPatchModel.asPatch();

    // Construct an instance of the UpdateInstanceHsmDestinationOptions model
    UpdateInstanceHsmDestinationOptions updateInstanceHsmDestinationOptionsModel = new UpdateInstanceHsmDestinationOptions.Builder()
      .instanceId("fe5c5c27-3e44-474a-9484-55892e12d6d1")
      .destinationId("b2c3d4e5-f6a7-8901-bcde-f12345678901")
      .hsmDestinationPatch(hsmDestinationPatchModelAsPatch)
      .build();

    // Invoke updateInstanceHsmDestination() with a valid options model and verify the result
    Response<HSMDestination> response = secretsManagerInstanceManagementService.updateInstanceHsmDestination(updateInstanceHsmDestinationOptionsModel).execute();
    assertNotNull(response);
    HSMDestination responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateInstanceHsmDestinationPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the updateInstanceHsmDestination operation with and without retries enabled
  @Test
  public void testUpdateInstanceHsmDestinationWRetries() throws Throwable {
    secretsManagerInstanceManagementService.enableRetries(4, 30);
    testUpdateInstanceHsmDestinationWOptions();

    secretsManagerInstanceManagementService.disableRetries();
    testUpdateInstanceHsmDestinationWOptions();
  }

  // Test the updateInstanceHsmDestination operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateInstanceHsmDestinationNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    secretsManagerInstanceManagementService.updateInstanceHsmDestination(null).execute();
  }

  // Test the deleteInstanceHsmDestination operation with a valid options model parameter
  @Test
  public void testDeleteInstanceHsmDestinationWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"href\": \"https://us-south.secrets-manager.cloud.ibm.com/v2/instances/bfc50c2e-d66d-4f37-9ccf-9713f8325b39/hsm_destinations/b49ad385-0cb7-3694-a71c-2579d6e94b02\", \"id\": \"b49ad385-0cb7-3694-a71c-2579d6e94b02\", \"provisioning_state\": \"deleting\"}";
    String deleteInstanceHsmDestinationPath = "/v2/instances/fe5c5c27-3e44-474a-9484-55892e12d6d1/hsm_destinations/b2c3d4e5-f6a7-8901-bcde-f12345678901";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(202)
      .setBody(mockResponseBody));

    // Construct an instance of the DeleteInstanceHsmDestinationOptions model
    DeleteInstanceHsmDestinationOptions deleteInstanceHsmDestinationOptionsModel = new DeleteInstanceHsmDestinationOptions.Builder()
      .instanceId("fe5c5c27-3e44-474a-9484-55892e12d6d1")
      .destinationId("b2c3d4e5-f6a7-8901-bcde-f12345678901")
      .build();

    // Invoke deleteInstanceHsmDestination() with a valid options model and verify the result
    Response<AsyncDeleteResponse> response = secretsManagerInstanceManagementService.deleteInstanceHsmDestination(deleteInstanceHsmDestinationOptionsModel).execute();
    assertNotNull(response);
    AsyncDeleteResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteInstanceHsmDestinationPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the deleteInstanceHsmDestination operation with and without retries enabled
  @Test
  public void testDeleteInstanceHsmDestinationWRetries() throws Throwable {
    secretsManagerInstanceManagementService.enableRetries(4, 30);
    testDeleteInstanceHsmDestinationWOptions();

    secretsManagerInstanceManagementService.disableRetries();
    testDeleteInstanceHsmDestinationWOptions();
  }

  // Test the deleteInstanceHsmDestination operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteInstanceHsmDestinationNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    secretsManagerInstanceManagementService.deleteInstanceHsmDestination(null).execute();
  }

  // Test the getHsmDestinationHealthSnapshot operation with a valid options model parameter
  @Test
  public void testGetHsmDestinationHealthSnapshotWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"href\": \"https://us-south.secrets-manager.cloud.ibm.com/v2/instances/bfc50c2e-d66d-4f37-9ccf-9713f8325b39/hsm_destinations/b49ad385-0cb7-3694-a71c-2579d6e94b02/health\", \"destination_id\": \"b49ad385-0cb7-3694-a71c-2579d6e94b02\", \"health_state\": \"healthy\", \"health_as_of\": \"2026-07-09T15:30:00.000Z\", \"client_certificates\": [{\"id\": \"7c9e6679-7425-40de-944b-e07fc1f90ae7\", \"name\": \"hsm-client-cert-prod\", \"health_state\": \"valid\"}], \"ha_groups\": [{\"id\": \"ee52ebb6-1728-4580-8ede-13f6504e3ae0\", \"name\": \"production-ha-group\", \"health_state\": \"healthy\"}], \"paths\": [{\"id\": \"fa3d1234-0000-0000-0000-000000000001\", \"name\": \"hsm-node-1\", \"health_state\": \"healthy\", \"server_cas\": [{\"id\": \"5d1f3c2e-8a4b-4c6d-9e7f-0a1b2c3d4e5f\", \"name\": \"HSM1_Server_CA\", \"health_state\": \"valid\"}]}]}";
    String getHsmDestinationHealthSnapshotPath = "/v2/instances/fe5c5c27-3e44-474a-9484-55892e12d6d1/hsm_destinations/b2c3d4e5-f6a7-8901-bcde-f12345678901/health";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetHsmDestinationHealthSnapshotOptions model
    GetHsmDestinationHealthSnapshotOptions getHsmDestinationHealthSnapshotOptionsModel = new GetHsmDestinationHealthSnapshotOptions.Builder()
      .instanceId("fe5c5c27-3e44-474a-9484-55892e12d6d1")
      .destinationId("b2c3d4e5-f6a7-8901-bcde-f12345678901")
      .build();

    // Invoke getHsmDestinationHealthSnapshot() with a valid options model and verify the result
    Response<DestinationHealthSnapshot> response = secretsManagerInstanceManagementService.getHsmDestinationHealthSnapshot(getHsmDestinationHealthSnapshotOptionsModel).execute();
    assertNotNull(response);
    DestinationHealthSnapshot responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getHsmDestinationHealthSnapshotPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getHsmDestinationHealthSnapshot operation with and without retries enabled
  @Test
  public void testGetHsmDestinationHealthSnapshotWRetries() throws Throwable {
    secretsManagerInstanceManagementService.enableRetries(4, 30);
    testGetHsmDestinationHealthSnapshotWOptions();

    secretsManagerInstanceManagementService.disableRetries();
    testGetHsmDestinationHealthSnapshotWOptions();
  }

  // Test the getHsmDestinationHealthSnapshot operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetHsmDestinationHealthSnapshotNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    secretsManagerInstanceManagementService.getHsmDestinationHealthSnapshot(null).execute();
  }

  // Test the runHsmDestinationHealthCheck operation with a valid options model parameter
  @Test
  public void testRunHsmDestinationHealthCheckWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"href\": \"https://us-south.secrets-manager.cloud.ibm.com/v2/instances/bfc50c2e-d66d-4f37-9ccf-9713f8325b39/hsm_destinations/b49ad385-0cb7-3694-a71c-2579d6e94b02/health\", \"destination_id\": \"b49ad385-0cb7-3694-a71c-2579d6e94b02\", \"health_state\": \"healthy\", \"health_as_of\": \"2026-07-09T15:30:00.000Z\", \"client_certificates\": [{\"id\": \"7c9e6679-7425-40de-944b-e07fc1f90ae7\", \"name\": \"hsm-client-cert-prod\", \"health_state\": \"valid\"}], \"ha_groups\": [{\"id\": \"ee52ebb6-1728-4580-8ede-13f6504e3ae0\", \"name\": \"production-ha-group\", \"health_state\": \"healthy\"}], \"paths\": [{\"id\": \"fa3d1234-0000-0000-0000-000000000001\", \"name\": \"hsm-node-1\", \"health_state\": \"healthy\", \"server_cas\": [{\"id\": \"5d1f3c2e-8a4b-4c6d-9e7f-0a1b2c3d4e5f\", \"name\": \"HSM1_Server_CA\", \"health_state\": \"valid\"}]}]}";
    String runHsmDestinationHealthCheckPath = "/v2/instances/fe5c5c27-3e44-474a-9484-55892e12d6d1/hsm_destinations/b2c3d4e5-f6a7-8901-bcde-f12345678901/health";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(202)
      .setBody(mockResponseBody));

    // Construct an instance of the RunHsmDestinationHealthCheckOptions model
    RunHsmDestinationHealthCheckOptions runHsmDestinationHealthCheckOptionsModel = new RunHsmDestinationHealthCheckOptions.Builder()
      .instanceId("fe5c5c27-3e44-474a-9484-55892e12d6d1")
      .destinationId("b2c3d4e5-f6a7-8901-bcde-f12345678901")
      .build();

    // Invoke runHsmDestinationHealthCheck() with a valid options model and verify the result
    Response<AsyncHealthCheckAckResponse> response = secretsManagerInstanceManagementService.runHsmDestinationHealthCheck(runHsmDestinationHealthCheckOptionsModel).execute();
    assertNotNull(response);
    AsyncHealthCheckAckResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, runHsmDestinationHealthCheckPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the runHsmDestinationHealthCheck operation with and without retries enabled
  @Test
  public void testRunHsmDestinationHealthCheckWRetries() throws Throwable {
    secretsManagerInstanceManagementService.enableRetries(4, 30);
    testRunHsmDestinationHealthCheckWOptions();

    secretsManagerInstanceManagementService.disableRetries();
    testRunHsmDestinationHealthCheckWOptions();
  }

  // Test the runHsmDestinationHealthCheck operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testRunHsmDestinationHealthCheckNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    secretsManagerInstanceManagementService.runHsmDestinationHealthCheck(null).execute();
  }

  // Test the applyHsmDestination operation with a valid options model parameter
  @Test
  public void testApplyHsmDestinationWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"href\": \"https://us-south.secrets-manager.cloud.ibm.com/v2/instances/bfc50c2e-d66d-4f37-9ccf-9713f8325b39/hsm_destinations/b49ad385-0cb7-3694-a71c-2579d6e94b02/health\"}";
    String applyHsmDestinationPath = "/v2/instances/fe5c5c27-3e44-474a-9484-55892e12d6d1/hsm_destinations/b2c3d4e5-f6a7-8901-bcde-f12345678901/apply";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(202)
      .setBody(mockResponseBody));

    // Construct an instance of the ApplyHsmDestinationOptions model
    ApplyHsmDestinationOptions applyHsmDestinationOptionsModel = new ApplyHsmDestinationOptions.Builder()
      .instanceId("fe5c5c27-3e44-474a-9484-55892e12d6d1")
      .destinationId("b2c3d4e5-f6a7-8901-bcde-f12345678901")
      .build();

    // Invoke applyHsmDestination() with a valid options model and verify the result
    Response<AsyncHealthAckResponse> response = secretsManagerInstanceManagementService.applyHsmDestination(applyHsmDestinationOptionsModel).execute();
    assertNotNull(response);
    AsyncHealthAckResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, applyHsmDestinationPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the applyHsmDestination operation with and without retries enabled
  @Test
  public void testApplyHsmDestinationWRetries() throws Throwable {
    secretsManagerInstanceManagementService.enableRetries(4, 30);
    testApplyHsmDestinationWOptions();

    secretsManagerInstanceManagementService.disableRetries();
    testApplyHsmDestinationWOptions();
  }

  // Test the applyHsmDestination operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testApplyHsmDestinationNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    secretsManagerInstanceManagementService.applyHsmDestination(null).execute();
  }

  // Test the listInstanceHsmDestinationHaGroups operation with a valid options model parameter
  @Test
  public void testListInstanceHsmDestinationHaGroupsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"ha_groups\": [{\"id\": \"ee52ebb6-1728-4580-8ede-13f6504e3ae0\", \"href\": \"https://us-south.secrets-manager.cloud.ibm.com/v2/instances/bfc50c2e-d66d-4f37-9ccf-9713f8325b39/hsm_destinations/b49ad385-0cb7-3694-a71c-2579d6e94b02/ha_groups/ee52ebb6-1728-4580-8ede-13f6504e3ae0\", \"name\": \"production-ha-group\", \"description\": \"Primary HA Group for prod\", \"provisioning_state\": \"completed\", \"health_state\": \"healthy\", \"health_as_of\": \"2026-07-09T16:00:00.000Z\", \"group_label\": \"prod_ha_group\", \"group_serial\": \"11323465009866\", \"member_serials\": [\"memberSerials\"], \"created_at\": \"2026-07-09T15:00:00.000Z\", \"updated_at\": \"2026-07-09T16:00:00.000Z\", \"created_by\": \"iam-ServiceId-abc123\", \"updated_by\": \"iam-ServiceId-abc123\"}]}";
    String listInstanceHsmDestinationHaGroupsPath = "/v2/instances/fe5c5c27-3e44-474a-9484-55892e12d6d1/hsm_destinations/b2c3d4e5-f6a7-8901-bcde-f12345678901/ha_groups";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ListInstanceHsmDestinationHaGroupsOptions model
    ListInstanceHsmDestinationHaGroupsOptions listInstanceHsmDestinationHaGroupsOptionsModel = new ListInstanceHsmDestinationHaGroupsOptions.Builder()
      .instanceId("fe5c5c27-3e44-474a-9484-55892e12d6d1")
      .destinationId("b2c3d4e5-f6a7-8901-bcde-f12345678901")
      .build();

    // Invoke listInstanceHsmDestinationHaGroups() with a valid options model and verify the result
    Response<HSMHAGroupCollection> response = secretsManagerInstanceManagementService.listInstanceHsmDestinationHaGroups(listInstanceHsmDestinationHaGroupsOptionsModel).execute();
    assertNotNull(response);
    HSMHAGroupCollection responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listInstanceHsmDestinationHaGroupsPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the listInstanceHsmDestinationHaGroups operation with and without retries enabled
  @Test
  public void testListInstanceHsmDestinationHaGroupsWRetries() throws Throwable {
    secretsManagerInstanceManagementService.enableRetries(4, 30);
    testListInstanceHsmDestinationHaGroupsWOptions();

    secretsManagerInstanceManagementService.disableRetries();
    testListInstanceHsmDestinationHaGroupsWOptions();
  }

  // Test the listInstanceHsmDestinationHaGroups operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListInstanceHsmDestinationHaGroupsNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    secretsManagerInstanceManagementService.listInstanceHsmDestinationHaGroups(null).execute();
  }

  // Test the createInstanceHsmDestinationHaGroup operation with a valid options model parameter
  @Test
  public void testCreateInstanceHsmDestinationHaGroupWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"id\": \"ee52ebb6-1728-4580-8ede-13f6504e3ae0\", \"href\": \"https://us-south.secrets-manager.cloud.ibm.com/v2/instances/bfc50c2e-d66d-4f37-9ccf-9713f8325b39/hsm_destinations/b49ad385-0cb7-3694-a71c-2579d6e94b02/ha_groups/ee52ebb6-1728-4580-8ede-13f6504e3ae0\", \"name\": \"production-ha-group\", \"description\": \"Primary HA Group for prod\", \"provisioning_state\": \"completed\", \"health_state\": \"healthy\", \"health_as_of\": \"2026-07-09T16:00:00.000Z\", \"group_label\": \"prod_ha_group\", \"group_serial\": \"11323465009866\", \"member_serials\": [\"memberSerials\"], \"created_at\": \"2026-07-09T15:00:00.000Z\", \"updated_at\": \"2026-07-09T16:00:00.000Z\", \"created_by\": \"iam-ServiceId-abc123\", \"updated_by\": \"iam-ServiceId-abc123\"}";
    String createInstanceHsmDestinationHaGroupPath = "/v2/instances/fe5c5c27-3e44-474a-9484-55892e12d6d1/hsm_destinations/b2c3d4e5-f6a7-8901-bcde-f12345678901/ha_groups";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(201)
      .setBody(mockResponseBody));

    // Construct an instance of the CreateInstanceHsmDestinationHaGroupOptions model
    CreateInstanceHsmDestinationHaGroupOptions createInstanceHsmDestinationHaGroupOptionsModel = new CreateInstanceHsmDestinationHaGroupOptions.Builder()
      .instanceId("fe5c5c27-3e44-474a-9484-55892e12d6d1")
      .destinationId("b2c3d4e5-f6a7-8901-bcde-f12345678901")
      .name("production-ha-group")
      .groupLabel("prod_ha_group")
      .groupSerial("11323465009866")
      .memberSerials(java.util.Arrays.asList("123456", "123457"))
      .description("Primary HA Group for prod")
      .build();

    // Invoke createInstanceHsmDestinationHaGroup() with a valid options model and verify the result
    Response<HSMHAGroup> response = secretsManagerInstanceManagementService.createInstanceHsmDestinationHaGroup(createInstanceHsmDestinationHaGroupOptionsModel).execute();
    assertNotNull(response);
    HSMHAGroup responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createInstanceHsmDestinationHaGroupPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the createInstanceHsmDestinationHaGroup operation with and without retries enabled
  @Test
  public void testCreateInstanceHsmDestinationHaGroupWRetries() throws Throwable {
    secretsManagerInstanceManagementService.enableRetries(4, 30);
    testCreateInstanceHsmDestinationHaGroupWOptions();

    secretsManagerInstanceManagementService.disableRetries();
    testCreateInstanceHsmDestinationHaGroupWOptions();
  }

  // Test the createInstanceHsmDestinationHaGroup operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateInstanceHsmDestinationHaGroupNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    secretsManagerInstanceManagementService.createInstanceHsmDestinationHaGroup(null).execute();
  }

  // Test the getInstanceHsmDestinationHaGroup operation with a valid options model parameter
  @Test
  public void testGetInstanceHsmDestinationHaGroupWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"id\": \"ee52ebb6-1728-4580-8ede-13f6504e3ae0\", \"href\": \"https://us-south.secrets-manager.cloud.ibm.com/v2/instances/bfc50c2e-d66d-4f37-9ccf-9713f8325b39/hsm_destinations/b49ad385-0cb7-3694-a71c-2579d6e94b02/ha_groups/ee52ebb6-1728-4580-8ede-13f6504e3ae0\", \"name\": \"production-ha-group\", \"description\": \"Primary HA Group for prod\", \"provisioning_state\": \"completed\", \"health_state\": \"healthy\", \"health_as_of\": \"2026-07-09T16:00:00.000Z\", \"group_label\": \"prod_ha_group\", \"group_serial\": \"11323465009866\", \"member_serials\": [\"memberSerials\"], \"created_at\": \"2026-07-09T15:00:00.000Z\", \"updated_at\": \"2026-07-09T16:00:00.000Z\", \"created_by\": \"iam-ServiceId-abc123\", \"updated_by\": \"iam-ServiceId-abc123\"}";
    String getInstanceHsmDestinationHaGroupPath = "/v2/instances/fe5c5c27-3e44-474a-9484-55892e12d6d1/hsm_destinations/b2c3d4e5-f6a7-8901-bcde-f12345678901/ha_groups/ee52ebb6-1728-4580-8ede-13f6504e3ae0";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetInstanceHsmDestinationHaGroupOptions model
    GetInstanceHsmDestinationHaGroupOptions getInstanceHsmDestinationHaGroupOptionsModel = new GetInstanceHsmDestinationHaGroupOptions.Builder()
      .instanceId("fe5c5c27-3e44-474a-9484-55892e12d6d1")
      .destinationId("b2c3d4e5-f6a7-8901-bcde-f12345678901")
      .haGroupId("ee52ebb6-1728-4580-8ede-13f6504e3ae0")
      .build();

    // Invoke getInstanceHsmDestinationHaGroup() with a valid options model and verify the result
    Response<HSMHAGroup> response = secretsManagerInstanceManagementService.getInstanceHsmDestinationHaGroup(getInstanceHsmDestinationHaGroupOptionsModel).execute();
    assertNotNull(response);
    HSMHAGroup responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getInstanceHsmDestinationHaGroupPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getInstanceHsmDestinationHaGroup operation with and without retries enabled
  @Test
  public void testGetInstanceHsmDestinationHaGroupWRetries() throws Throwable {
    secretsManagerInstanceManagementService.enableRetries(4, 30);
    testGetInstanceHsmDestinationHaGroupWOptions();

    secretsManagerInstanceManagementService.disableRetries();
    testGetInstanceHsmDestinationHaGroupWOptions();
  }

  // Test the getInstanceHsmDestinationHaGroup operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetInstanceHsmDestinationHaGroupNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    secretsManagerInstanceManagementService.getInstanceHsmDestinationHaGroup(null).execute();
  }

  // Test the updateInstanceHsmDestinationHaGroup operation with a valid options model parameter
  @Test
  public void testUpdateInstanceHsmDestinationHaGroupWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"id\": \"ee52ebb6-1728-4580-8ede-13f6504e3ae0\", \"href\": \"https://us-south.secrets-manager.cloud.ibm.com/v2/instances/bfc50c2e-d66d-4f37-9ccf-9713f8325b39/hsm_destinations/b49ad385-0cb7-3694-a71c-2579d6e94b02/ha_groups/ee52ebb6-1728-4580-8ede-13f6504e3ae0\", \"name\": \"production-ha-group\", \"description\": \"Primary HA Group for prod\", \"provisioning_state\": \"completed\", \"health_state\": \"healthy\", \"health_as_of\": \"2026-07-09T16:00:00.000Z\", \"group_label\": \"prod_ha_group\", \"group_serial\": \"11323465009866\", \"member_serials\": [\"memberSerials\"], \"created_at\": \"2026-07-09T15:00:00.000Z\", \"updated_at\": \"2026-07-09T16:00:00.000Z\", \"created_by\": \"iam-ServiceId-abc123\", \"updated_by\": \"iam-ServiceId-abc123\"}";
    String updateInstanceHsmDestinationHaGroupPath = "/v2/instances/fe5c5c27-3e44-474a-9484-55892e12d6d1/hsm_destinations/b2c3d4e5-f6a7-8901-bcde-f12345678901/ha_groups/ee52ebb6-1728-4580-8ede-13f6504e3ae0";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the HSMHAGroupPatch model
    HSMHAGroupPatch hsmhaGroupPatchModel = new HSMHAGroupPatch.Builder()
      .name("dr-ha-group")
      .description("DR HA Group for failover")
      .memberSerials(java.util.Arrays.asList("123456", "123457", "123458"))
      .build();
    Map<String, Object> hsmhaGroupPatchModelAsPatch = hsmhaGroupPatchModel.asPatch();

    // Construct an instance of the UpdateInstanceHsmDestinationHaGroupOptions model
    UpdateInstanceHsmDestinationHaGroupOptions updateInstanceHsmDestinationHaGroupOptionsModel = new UpdateInstanceHsmDestinationHaGroupOptions.Builder()
      .instanceId("fe5c5c27-3e44-474a-9484-55892e12d6d1")
      .destinationId("b2c3d4e5-f6a7-8901-bcde-f12345678901")
      .haGroupId("ee52ebb6-1728-4580-8ede-13f6504e3ae0")
      .hsmhaGroupPatch(hsmhaGroupPatchModelAsPatch)
      .build();

    // Invoke updateInstanceHsmDestinationHaGroup() with a valid options model and verify the result
    Response<HSMHAGroup> response = secretsManagerInstanceManagementService.updateInstanceHsmDestinationHaGroup(updateInstanceHsmDestinationHaGroupOptionsModel).execute();
    assertNotNull(response);
    HSMHAGroup responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateInstanceHsmDestinationHaGroupPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the updateInstanceHsmDestinationHaGroup operation with and without retries enabled
  @Test
  public void testUpdateInstanceHsmDestinationHaGroupWRetries() throws Throwable {
    secretsManagerInstanceManagementService.enableRetries(4, 30);
    testUpdateInstanceHsmDestinationHaGroupWOptions();

    secretsManagerInstanceManagementService.disableRetries();
    testUpdateInstanceHsmDestinationHaGroupWOptions();
  }

  // Test the updateInstanceHsmDestinationHaGroup operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateInstanceHsmDestinationHaGroupNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    secretsManagerInstanceManagementService.updateInstanceHsmDestinationHaGroup(null).execute();
  }

  // Test the deleteInstanceHsmDestinationHaGroup operation with a valid options model parameter
  @Test
  public void testDeleteInstanceHsmDestinationHaGroupWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "";
    String deleteInstanceHsmDestinationHaGroupPath = "/v2/instances/fe5c5c27-3e44-474a-9484-55892e12d6d1/hsm_destinations/b2c3d4e5-f6a7-8901-bcde-f12345678901/ha_groups/ee52ebb6-1728-4580-8ede-13f6504e3ae0";
    server.enqueue(new MockResponse()
      .setResponseCode(204)
      .setBody(mockResponseBody));

    // Construct an instance of the DeleteInstanceHsmDestinationHaGroupOptions model
    DeleteInstanceHsmDestinationHaGroupOptions deleteInstanceHsmDestinationHaGroupOptionsModel = new DeleteInstanceHsmDestinationHaGroupOptions.Builder()
      .instanceId("fe5c5c27-3e44-474a-9484-55892e12d6d1")
      .destinationId("b2c3d4e5-f6a7-8901-bcde-f12345678901")
      .haGroupId("ee52ebb6-1728-4580-8ede-13f6504e3ae0")
      .build();

    // Invoke deleteInstanceHsmDestinationHaGroup() with a valid options model and verify the result
    Response<Void> response = secretsManagerInstanceManagementService.deleteInstanceHsmDestinationHaGroup(deleteInstanceHsmDestinationHaGroupOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    assertNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteInstanceHsmDestinationHaGroupPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the deleteInstanceHsmDestinationHaGroup operation with and without retries enabled
  @Test
  public void testDeleteInstanceHsmDestinationHaGroupWRetries() throws Throwable {
    secretsManagerInstanceManagementService.enableRetries(4, 30);
    testDeleteInstanceHsmDestinationHaGroupWOptions();

    secretsManagerInstanceManagementService.disableRetries();
    testDeleteInstanceHsmDestinationHaGroupWOptions();
  }

  // Test the deleteInstanceHsmDestinationHaGroup operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteInstanceHsmDestinationHaGroupNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    secretsManagerInstanceManagementService.deleteInstanceHsmDestinationHaGroup(null).execute();
  }

  // Test the listInstanceHsmDestinationPaths operation with a valid options model parameter
  @Test
  public void testListInstanceHsmDestinationPathsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"paths\": [{\"id\": \"fa3d1234-0000-0000-0000-000000000001\", \"href\": \"https://us-south.secrets-manager.cloud.ibm.com/v2/instances/bfc50c2e-d66d-4f37-9ccf-9713f8325b39/hsm_destinations/b49ad385-0cb7-3694-a71c-2579d6e94b02/paths/fa3d1234-0000-0000-0000-000000000001\", \"name\": \"hsm-node-1\", \"description\": \"Primary HSM node for prod\", \"crn\": \"crn:v1:bluemix:public:is:eu-fr2:a/customer123::private-path-service-gateway:hsm1\", \"provisioning_state\": \"completed\", \"health_state\": \"healthy\", \"health_as_of\": \"2026-07-09T15:30:00.000Z\", \"created_at\": \"2026-07-09T15:00:00.000Z\", \"updated_at\": \"2026-07-09T15:30:00.000Z\", \"created_by\": \"iam-ServiceId-abc123\", \"updated_by\": \"iam-ServiceId-abc123\"}]}";
    String listInstanceHsmDestinationPathsPath = "/v2/instances/fe5c5c27-3e44-474a-9484-55892e12d6d1/hsm_destinations/b2c3d4e5-f6a7-8901-bcde-f12345678901/paths";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ListInstanceHsmDestinationPathsOptions model
    ListInstanceHsmDestinationPathsOptions listInstanceHsmDestinationPathsOptionsModel = new ListInstanceHsmDestinationPathsOptions.Builder()
      .instanceId("fe5c5c27-3e44-474a-9484-55892e12d6d1")
      .destinationId("b2c3d4e5-f6a7-8901-bcde-f12345678901")
      .build();

    // Invoke listInstanceHsmDestinationPaths() with a valid options model and verify the result
    Response<PathCollection> response = secretsManagerInstanceManagementService.listInstanceHsmDestinationPaths(listInstanceHsmDestinationPathsOptionsModel).execute();
    assertNotNull(response);
    PathCollection responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listInstanceHsmDestinationPathsPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the listInstanceHsmDestinationPaths operation with and without retries enabled
  @Test
  public void testListInstanceHsmDestinationPathsWRetries() throws Throwable {
    secretsManagerInstanceManagementService.enableRetries(4, 30);
    testListInstanceHsmDestinationPathsWOptions();

    secretsManagerInstanceManagementService.disableRetries();
    testListInstanceHsmDestinationPathsWOptions();
  }

  // Test the listInstanceHsmDestinationPaths operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListInstanceHsmDestinationPathsNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    secretsManagerInstanceManagementService.listInstanceHsmDestinationPaths(null).execute();
  }

  // Test the createInstanceHsmDestinationPath operation with a valid options model parameter
  @Test
  public void testCreateInstanceHsmDestinationPathWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"id\": \"fa3d1234-0000-0000-0000-000000000001\", \"href\": \"https://us-south.secrets-manager.cloud.ibm.com/v2/instances/bfc50c2e-d66d-4f37-9ccf-9713f8325b39/hsm_destinations/b49ad385-0cb7-3694-a71c-2579d6e94b02/paths/fa3d1234-0000-0000-0000-000000000001\", \"name\": \"hsm-node-1\", \"description\": \"Primary HSM node for prod\", \"crn\": \"crn:v1:bluemix:public:is:eu-fr2:a/customer123::private-path-service-gateway:hsm1\", \"provisioning_state\": \"completed\", \"health_state\": \"healthy\", \"health_as_of\": \"2026-07-09T15:30:00.000Z\", \"created_at\": \"2026-07-09T15:00:00.000Z\", \"updated_at\": \"2026-07-09T15:30:00.000Z\", \"created_by\": \"iam-ServiceId-abc123\", \"updated_by\": \"iam-ServiceId-abc123\"}";
    String createInstanceHsmDestinationPathPath = "/v2/instances/fe5c5c27-3e44-474a-9484-55892e12d6d1/hsm_destinations/b2c3d4e5-f6a7-8901-bcde-f12345678901/paths";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(201)
      .setBody(mockResponseBody));

    // Construct an instance of the CreateInstanceHsmDestinationPathOptions model
    CreateInstanceHsmDestinationPathOptions createInstanceHsmDestinationPathOptionsModel = new CreateInstanceHsmDestinationPathOptions.Builder()
      .instanceId("fe5c5c27-3e44-474a-9484-55892e12d6d1")
      .destinationId("b2c3d4e5-f6a7-8901-bcde-f12345678901")
      .name("hsm-node-1")
      .crn("crn:v1:bluemix:public:is:eu-fr2:a/customer123::private-path-service-gateway:hsm1")
      .description("testString")
      .build();

    // Invoke createInstanceHsmDestinationPath() with a valid options model and verify the result
    Response<Path> response = secretsManagerInstanceManagementService.createInstanceHsmDestinationPath(createInstanceHsmDestinationPathOptionsModel).execute();
    assertNotNull(response);
    Path responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createInstanceHsmDestinationPathPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the createInstanceHsmDestinationPath operation with and without retries enabled
  @Test
  public void testCreateInstanceHsmDestinationPathWRetries() throws Throwable {
    secretsManagerInstanceManagementService.enableRetries(4, 30);
    testCreateInstanceHsmDestinationPathWOptions();

    secretsManagerInstanceManagementService.disableRetries();
    testCreateInstanceHsmDestinationPathWOptions();
  }

  // Test the createInstanceHsmDestinationPath operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateInstanceHsmDestinationPathNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    secretsManagerInstanceManagementService.createInstanceHsmDestinationPath(null).execute();
  }

  // Test the getInstanceHsmDestinationPath operation with a valid options model parameter
  @Test
  public void testGetInstanceHsmDestinationPathWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"id\": \"fa3d1234-0000-0000-0000-000000000001\", \"href\": \"https://us-south.secrets-manager.cloud.ibm.com/v2/instances/bfc50c2e-d66d-4f37-9ccf-9713f8325b39/hsm_destinations/b49ad385-0cb7-3694-a71c-2579d6e94b02/paths/fa3d1234-0000-0000-0000-000000000001\", \"name\": \"hsm-node-1\", \"description\": \"Primary HSM node for prod\", \"crn\": \"crn:v1:bluemix:public:is:eu-fr2:a/customer123::private-path-service-gateway:hsm1\", \"provisioning_state\": \"completed\", \"health_state\": \"healthy\", \"health_as_of\": \"2026-07-09T15:30:00.000Z\", \"created_at\": \"2026-07-09T15:00:00.000Z\", \"updated_at\": \"2026-07-09T15:30:00.000Z\", \"created_by\": \"iam-ServiceId-abc123\", \"updated_by\": \"iam-ServiceId-abc123\"}";
    String getInstanceHsmDestinationPathPath = "/v2/instances/fe5c5c27-3e44-474a-9484-55892e12d6d1/hsm_destinations/b2c3d4e5-f6a7-8901-bcde-f12345678901/paths/fa3d1234-0000-0000-0000-000000000001";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetInstanceHsmDestinationPathOptions model
    GetInstanceHsmDestinationPathOptions getInstanceHsmDestinationPathOptionsModel = new GetInstanceHsmDestinationPathOptions.Builder()
      .instanceId("fe5c5c27-3e44-474a-9484-55892e12d6d1")
      .destinationId("b2c3d4e5-f6a7-8901-bcde-f12345678901")
      .pathId("fa3d1234-0000-0000-0000-000000000001")
      .build();

    // Invoke getInstanceHsmDestinationPath() with a valid options model and verify the result
    Response<Path> response = secretsManagerInstanceManagementService.getInstanceHsmDestinationPath(getInstanceHsmDestinationPathOptionsModel).execute();
    assertNotNull(response);
    Path responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getInstanceHsmDestinationPathPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getInstanceHsmDestinationPath operation with and without retries enabled
  @Test
  public void testGetInstanceHsmDestinationPathWRetries() throws Throwable {
    secretsManagerInstanceManagementService.enableRetries(4, 30);
    testGetInstanceHsmDestinationPathWOptions();

    secretsManagerInstanceManagementService.disableRetries();
    testGetInstanceHsmDestinationPathWOptions();
  }

  // Test the getInstanceHsmDestinationPath operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetInstanceHsmDestinationPathNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    secretsManagerInstanceManagementService.getInstanceHsmDestinationPath(null).execute();
  }

  // Test the updateInstanceHsmDestinationPath operation with a valid options model parameter
  @Test
  public void testUpdateInstanceHsmDestinationPathWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"id\": \"fa3d1234-0000-0000-0000-000000000001\", \"href\": \"https://us-south.secrets-manager.cloud.ibm.com/v2/instances/bfc50c2e-d66d-4f37-9ccf-9713f8325b39/hsm_destinations/b49ad385-0cb7-3694-a71c-2579d6e94b02/paths/fa3d1234-0000-0000-0000-000000000001\", \"name\": \"hsm-node-1\", \"description\": \"Primary HSM node for prod\", \"crn\": \"crn:v1:bluemix:public:is:eu-fr2:a/customer123::private-path-service-gateway:hsm1\", \"provisioning_state\": \"completed\", \"health_state\": \"healthy\", \"health_as_of\": \"2026-07-09T15:30:00.000Z\", \"created_at\": \"2026-07-09T15:00:00.000Z\", \"updated_at\": \"2026-07-09T15:30:00.000Z\", \"created_by\": \"iam-ServiceId-abc123\", \"updated_by\": \"iam-ServiceId-abc123\"}";
    String updateInstanceHsmDestinationPathPath = "/v2/instances/fe5c5c27-3e44-474a-9484-55892e12d6d1/hsm_destinations/b2c3d4e5-f6a7-8901-bcde-f12345678901/paths/fa3d1234-0000-0000-0000-000000000001";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the PathPatch model
    PathPatch pathPatchModel = new PathPatch.Builder()
      .name("hsm-node-1-renamed")
      .description("testString")
      .build();
    Map<String, Object> pathPatchModelAsPatch = pathPatchModel.asPatch();

    // Construct an instance of the UpdateInstanceHsmDestinationPathOptions model
    UpdateInstanceHsmDestinationPathOptions updateInstanceHsmDestinationPathOptionsModel = new UpdateInstanceHsmDestinationPathOptions.Builder()
      .instanceId("fe5c5c27-3e44-474a-9484-55892e12d6d1")
      .destinationId("b2c3d4e5-f6a7-8901-bcde-f12345678901")
      .pathId("fa3d1234-0000-0000-0000-000000000001")
      .pathPatch(pathPatchModelAsPatch)
      .build();

    // Invoke updateInstanceHsmDestinationPath() with a valid options model and verify the result
    Response<Path> response = secretsManagerInstanceManagementService.updateInstanceHsmDestinationPath(updateInstanceHsmDestinationPathOptionsModel).execute();
    assertNotNull(response);
    Path responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateInstanceHsmDestinationPathPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the updateInstanceHsmDestinationPath operation with and without retries enabled
  @Test
  public void testUpdateInstanceHsmDestinationPathWRetries() throws Throwable {
    secretsManagerInstanceManagementService.enableRetries(4, 30);
    testUpdateInstanceHsmDestinationPathWOptions();

    secretsManagerInstanceManagementService.disableRetries();
    testUpdateInstanceHsmDestinationPathWOptions();
  }

  // Test the updateInstanceHsmDestinationPath operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateInstanceHsmDestinationPathNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    secretsManagerInstanceManagementService.updateInstanceHsmDestinationPath(null).execute();
  }

  // Test the deleteInstanceHsmDestinationPath operation with a valid options model parameter
  @Test
  public void testDeleteInstanceHsmDestinationPathWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"id\": \"fa3d1234-0000-0000-0000-000000000001\", \"href\": \"https://us-south.secrets-manager.cloud.ibm.com/v2/instances/bfc50c2e-d66d-4f37-9ccf-9713f8325b39/hsm_destinations/b49ad385-0cb7-3694-a71c-2579d6e94b02/paths/fa3d1234-0000-0000-0000-000000000001\", \"name\": \"hsm-node-1\", \"description\": \"Primary HSM node for prod\", \"crn\": \"crn:v1:bluemix:public:is:eu-fr2:a/customer123::private-path-service-gateway:hsm1\", \"provisioning_state\": \"completed\", \"health_state\": \"healthy\", \"health_as_of\": \"2026-07-09T15:30:00.000Z\", \"created_at\": \"2026-07-09T15:00:00.000Z\", \"updated_at\": \"2026-07-09T15:30:00.000Z\", \"created_by\": \"iam-ServiceId-abc123\", \"updated_by\": \"iam-ServiceId-abc123\"}";
    String deleteInstanceHsmDestinationPathPath = "/v2/instances/fe5c5c27-3e44-474a-9484-55892e12d6d1/hsm_destinations/b2c3d4e5-f6a7-8901-bcde-f12345678901/paths/fa3d1234-0000-0000-0000-000000000001";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(202)
      .setBody(mockResponseBody));

    // Construct an instance of the DeleteInstanceHsmDestinationPathOptions model
    DeleteInstanceHsmDestinationPathOptions deleteInstanceHsmDestinationPathOptionsModel = new DeleteInstanceHsmDestinationPathOptions.Builder()
      .instanceId("fe5c5c27-3e44-474a-9484-55892e12d6d1")
      .destinationId("b2c3d4e5-f6a7-8901-bcde-f12345678901")
      .pathId("fa3d1234-0000-0000-0000-000000000001")
      .build();

    // Invoke deleteInstanceHsmDestinationPath() with a valid options model and verify the result
    Response<Path> response = secretsManagerInstanceManagementService.deleteInstanceHsmDestinationPath(deleteInstanceHsmDestinationPathOptionsModel).execute();
    assertNotNull(response);
    Path responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteInstanceHsmDestinationPathPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the deleteInstanceHsmDestinationPath operation with and without retries enabled
  @Test
  public void testDeleteInstanceHsmDestinationPathWRetries() throws Throwable {
    secretsManagerInstanceManagementService.enableRetries(4, 30);
    testDeleteInstanceHsmDestinationPathWOptions();

    secretsManagerInstanceManagementService.disableRetries();
    testDeleteInstanceHsmDestinationPathWOptions();
  }

  // Test the deleteInstanceHsmDestinationPath operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteInstanceHsmDestinationPathNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    secretsManagerInstanceManagementService.deleteInstanceHsmDestinationPath(null).execute();
  }

  // Test the createPathBuild operation with a valid options model parameter
  @Test
  public void testCreatePathBuildWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"id\": \"fa3d1234-0000-0000-0000-000000000001\", \"provisioning_state\": \"provisioning\"}";
    String createPathBuildPath = "/v2/instances/fe5c5c27-3e44-474a-9484-55892e12d6d1/hsm_destinations/b2c3d4e5-f6a7-8901-bcde-f12345678901/paths/fa3d1234-0000-0000-0000-000000000001/build";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(202)
      .setBody(mockResponseBody));

    // Construct an instance of the CreatePathBuildOptions model
    CreatePathBuildOptions createPathBuildOptionsModel = new CreatePathBuildOptions.Builder()
      .instanceId("fe5c5c27-3e44-474a-9484-55892e12d6d1")
      .destinationId("b2c3d4e5-f6a7-8901-bcde-f12345678901")
      .pathId("fa3d1234-0000-0000-0000-000000000001")
      .build();

    // Invoke createPathBuild() with a valid options model and verify the result
    Response<VpeProvisioningResponse> response = secretsManagerInstanceManagementService.createPathBuild(createPathBuildOptionsModel).execute();
    assertNotNull(response);
    VpeProvisioningResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createPathBuildPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the createPathBuild operation with and without retries enabled
  @Test
  public void testCreatePathBuildWRetries() throws Throwable {
    secretsManagerInstanceManagementService.enableRetries(4, 30);
    testCreatePathBuildWOptions();

    secretsManagerInstanceManagementService.disableRetries();
    testCreatePathBuildWOptions();
  }

  // Test the createPathBuild operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreatePathBuildNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    secretsManagerInstanceManagementService.createPathBuild(null).execute();
  }

  // Test the getPathVpeStatus operation with a valid options model parameter
  @Test
  public void testGetPathVpeStatusWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"health_state\": \"healthy\", \"health_time_stamp\": \"2026-11-13T07:14:16.000Z\", \"provisioning_state\": \"completed\"}";
    String getPathVpeStatusPath = "/v2/instances/fe5c5c27-3e44-474a-9484-55892e12d6d1/hsm_destinations/b2c3d4e5-f6a7-8901-bcde-f12345678901/paths/fa3d1234-0000-0000-0000-000000000001/health_check";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetPathVpeStatusOptions model
    GetPathVpeStatusOptions getPathVpeStatusOptionsModel = new GetPathVpeStatusOptions.Builder()
      .instanceId("fe5c5c27-3e44-474a-9484-55892e12d6d1")
      .destinationId("b2c3d4e5-f6a7-8901-bcde-f12345678901")
      .pathId("fa3d1234-0000-0000-0000-000000000001")
      .build();

    // Invoke getPathVpeStatus() with a valid options model and verify the result
    Response<VpeStatusResult> response = secretsManagerInstanceManagementService.getPathVpeStatus(getPathVpeStatusOptionsModel).execute();
    assertNotNull(response);
    VpeStatusResult responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getPathVpeStatusPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getPathVpeStatus operation with and without retries enabled
  @Test
  public void testGetPathVpeStatusWRetries() throws Throwable {
    secretsManagerInstanceManagementService.enableRetries(4, 30);
    testGetPathVpeStatusWOptions();

    secretsManagerInstanceManagementService.disableRetries();
    testGetPathVpeStatusWOptions();
  }

  // Test the getPathVpeStatus operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetPathVpeStatusNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    secretsManagerInstanceManagementService.getPathVpeStatus(null).execute();
  }

  // Test the resetHsmDestinationPath operation with a valid options model parameter
  @Test
  public void testResetHsmDestinationPathWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"href\": \"href\", \"provisioning_state\": \"completed\"}";
    String resetHsmDestinationPathPath = "/v2/instances/fe5c5c27-3e44-474a-9484-55892e12d6d1/hsm_destinations/b2c3d4e5-f6a7-8901-bcde-f12345678901/paths/fa3d1234-0000-0000-0000-000000000001/reset";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ResetHsmDestinationPathOptions model
    ResetHsmDestinationPathOptions resetHsmDestinationPathOptionsModel = new ResetHsmDestinationPathOptions.Builder()
      .instanceId("fe5c5c27-3e44-474a-9484-55892e12d6d1")
      .destinationId("b2c3d4e5-f6a7-8901-bcde-f12345678901")
      .pathId("fa3d1234-0000-0000-0000-000000000001")
      .build();

    // Invoke resetHsmDestinationPath() with a valid options model and verify the result
    Response<HSMPathReset> response = secretsManagerInstanceManagementService.resetHsmDestinationPath(resetHsmDestinationPathOptionsModel).execute();
    assertNotNull(response);
    HSMPathReset responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, resetHsmDestinationPathPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the resetHsmDestinationPath operation with and without retries enabled
  @Test
  public void testResetHsmDestinationPathWRetries() throws Throwable {
    secretsManagerInstanceManagementService.enableRetries(4, 30);
    testResetHsmDestinationPathWOptions();

    secretsManagerInstanceManagementService.disableRetries();
    testResetHsmDestinationPathWOptions();
  }

  // Test the resetHsmDestinationPath operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testResetHsmDestinationPathNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    secretsManagerInstanceManagementService.resetHsmDestinationPath(null).execute();
  }

  // Test the listInstanceHsmDestinationPathServerCas operation with a valid options model parameter
  @Test
  public void testListInstanceHsmDestinationPathServerCasWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"server_cas\": [{\"id\": \"5d1f3c2e-8a4b-4c6d-9e7f-0a1b2c3d4e5f\", \"name\": \"HSM1_Server_CA\", \"description\": \"Primary CA for HSM node 1\", \"certificate\": \"-----BEGIN CERTIFICATE-----\nMIIDXTCCAkWg...\n-----END CERTIFICATE-----\", \"expires_at\": \"2028-07-09T15:10:00.000Z\", \"status\": \"active\", \"health_state\": \"valid\", \"health_as_of\": \"2026-07-09T15:30:00.000Z\", \"created_at\": \"2026-07-09T15:10:00.000Z\", \"updated_at\": \"2026-07-09T15:20:00.000Z\", \"created_by\": \"iam-ServiceId-abc123\", \"updated_by\": \"iam-ServiceId-abc123\"}]}";
    String listInstanceHsmDestinationPathServerCasPath = "/v2/instances/fe5c5c27-3e44-474a-9484-55892e12d6d1/hsm_destinations/b2c3d4e5-f6a7-8901-bcde-f12345678901/paths/fa3d1234-0000-0000-0000-000000000001/server_cas";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ListInstanceHsmDestinationPathServerCasOptions model
    ListInstanceHsmDestinationPathServerCasOptions listInstanceHsmDestinationPathServerCasOptionsModel = new ListInstanceHsmDestinationPathServerCasOptions.Builder()
      .instanceId("fe5c5c27-3e44-474a-9484-55892e12d6d1")
      .destinationId("b2c3d4e5-f6a7-8901-bcde-f12345678901")
      .pathId("fa3d1234-0000-0000-0000-000000000001")
      .build();

    // Invoke listInstanceHsmDestinationPathServerCas() with a valid options model and verify the result
    Response<ServerCaCollection> response = secretsManagerInstanceManagementService.listInstanceHsmDestinationPathServerCas(listInstanceHsmDestinationPathServerCasOptionsModel).execute();
    assertNotNull(response);
    ServerCaCollection responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listInstanceHsmDestinationPathServerCasPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the listInstanceHsmDestinationPathServerCas operation with and without retries enabled
  @Test
  public void testListInstanceHsmDestinationPathServerCasWRetries() throws Throwable {
    secretsManagerInstanceManagementService.enableRetries(4, 30);
    testListInstanceHsmDestinationPathServerCasWOptions();

    secretsManagerInstanceManagementService.disableRetries();
    testListInstanceHsmDestinationPathServerCasWOptions();
  }

  // Test the listInstanceHsmDestinationPathServerCas operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListInstanceHsmDestinationPathServerCasNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    secretsManagerInstanceManagementService.listInstanceHsmDestinationPathServerCas(null).execute();
  }

  // Test the createInstanceHsmDestinationPathServerCa operation with a valid options model parameter
  @Test
  public void testCreateInstanceHsmDestinationPathServerCaWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"id\": \"5d1f3c2e-8a4b-4c6d-9e7f-0a1b2c3d4e5f\", \"name\": \"HSM1_Server_CA\", \"description\": \"Primary CA for HSM node 1\", \"certificate\": \"-----BEGIN CERTIFICATE-----\nMIIDXTCCAkWg...\n-----END CERTIFICATE-----\", \"expires_at\": \"2028-07-09T15:10:00.000Z\", \"status\": \"active\", \"health_state\": \"valid\", \"health_as_of\": \"2026-07-09T15:30:00.000Z\", \"created_at\": \"2026-07-09T15:10:00.000Z\", \"updated_at\": \"2026-07-09T15:20:00.000Z\", \"created_by\": \"iam-ServiceId-abc123\", \"updated_by\": \"iam-ServiceId-abc123\"}";
    String createInstanceHsmDestinationPathServerCaPath = "/v2/instances/fe5c5c27-3e44-474a-9484-55892e12d6d1/hsm_destinations/b2c3d4e5-f6a7-8901-bcde-f12345678901/paths/fa3d1234-0000-0000-0000-000000000001/server_cas";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(201)
      .setBody(mockResponseBody));

    // Construct an instance of the CreateInstanceHsmDestinationPathServerCaOptions model
    CreateInstanceHsmDestinationPathServerCaOptions createInstanceHsmDestinationPathServerCaOptionsModel = new CreateInstanceHsmDestinationPathServerCaOptions.Builder()
      .instanceId("fe5c5c27-3e44-474a-9484-55892e12d6d1")
      .destinationId("b2c3d4e5-f6a7-8901-bcde-f12345678901")
      .pathId("fa3d1234-0000-0000-0000-000000000001")
      .name("HSM1_Server_CA")
      .certificate("-----BEGIN CERTIFICATE-----\nMIIDXTCCAkWg...\n-----END CERTIFICATE-----")
      .description("testString")
      .build();

    // Invoke createInstanceHsmDestinationPathServerCa() with a valid options model and verify the result
    Response<ServerCa> response = secretsManagerInstanceManagementService.createInstanceHsmDestinationPathServerCa(createInstanceHsmDestinationPathServerCaOptionsModel).execute();
    assertNotNull(response);
    ServerCa responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createInstanceHsmDestinationPathServerCaPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the createInstanceHsmDestinationPathServerCa operation with and without retries enabled
  @Test
  public void testCreateInstanceHsmDestinationPathServerCaWRetries() throws Throwable {
    secretsManagerInstanceManagementService.enableRetries(4, 30);
    testCreateInstanceHsmDestinationPathServerCaWOptions();

    secretsManagerInstanceManagementService.disableRetries();
    testCreateInstanceHsmDestinationPathServerCaWOptions();
  }

  // Test the createInstanceHsmDestinationPathServerCa operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateInstanceHsmDestinationPathServerCaNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    secretsManagerInstanceManagementService.createInstanceHsmDestinationPathServerCa(null).execute();
  }

  // Test the getInstanceHsmDestinationPathServerCa operation with a valid options model parameter
  @Test
  public void testGetInstanceHsmDestinationPathServerCaWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"id\": \"5d1f3c2e-8a4b-4c6d-9e7f-0a1b2c3d4e5f\", \"name\": \"HSM1_Server_CA\", \"description\": \"Primary CA for HSM node 1\", \"certificate\": \"-----BEGIN CERTIFICATE-----\nMIIDXTCCAkWg...\n-----END CERTIFICATE-----\", \"expires_at\": \"2028-07-09T15:10:00.000Z\", \"status\": \"active\", \"health_state\": \"valid\", \"health_as_of\": \"2026-07-09T15:30:00.000Z\", \"created_at\": \"2026-07-09T15:10:00.000Z\", \"updated_at\": \"2026-07-09T15:20:00.000Z\", \"created_by\": \"iam-ServiceId-abc123\", \"updated_by\": \"iam-ServiceId-abc123\"}";
    String getInstanceHsmDestinationPathServerCaPath = "/v2/instances/fe5c5c27-3e44-474a-9484-55892e12d6d1/hsm_destinations/b2c3d4e5-f6a7-8901-bcde-f12345678901/paths/fa3d1234-0000-0000-0000-000000000001/server_cas/5d1f3c2e-8a4b-4c6d-9e7f-0a1b2c3d4e5f";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetInstanceHsmDestinationPathServerCaOptions model
    GetInstanceHsmDestinationPathServerCaOptions getInstanceHsmDestinationPathServerCaOptionsModel = new GetInstanceHsmDestinationPathServerCaOptions.Builder()
      .instanceId("fe5c5c27-3e44-474a-9484-55892e12d6d1")
      .destinationId("b2c3d4e5-f6a7-8901-bcde-f12345678901")
      .pathId("fa3d1234-0000-0000-0000-000000000001")
      .serverCaId("5d1f3c2e-8a4b-4c6d-9e7f-0a1b2c3d4e5f")
      .build();

    // Invoke getInstanceHsmDestinationPathServerCa() with a valid options model and verify the result
    Response<ServerCa> response = secretsManagerInstanceManagementService.getInstanceHsmDestinationPathServerCa(getInstanceHsmDestinationPathServerCaOptionsModel).execute();
    assertNotNull(response);
    ServerCa responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getInstanceHsmDestinationPathServerCaPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getInstanceHsmDestinationPathServerCa operation with and without retries enabled
  @Test
  public void testGetInstanceHsmDestinationPathServerCaWRetries() throws Throwable {
    secretsManagerInstanceManagementService.enableRetries(4, 30);
    testGetInstanceHsmDestinationPathServerCaWOptions();

    secretsManagerInstanceManagementService.disableRetries();
    testGetInstanceHsmDestinationPathServerCaWOptions();
  }

  // Test the getInstanceHsmDestinationPathServerCa operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetInstanceHsmDestinationPathServerCaNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    secretsManagerInstanceManagementService.getInstanceHsmDestinationPathServerCa(null).execute();
  }

  // Test the updateInstanceHsmDestinationPathServerCa operation with a valid options model parameter
  @Test
  public void testUpdateInstanceHsmDestinationPathServerCaWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"id\": \"5d1f3c2e-8a4b-4c6d-9e7f-0a1b2c3d4e5f\", \"name\": \"HSM1_Server_CA\", \"description\": \"Primary CA for HSM node 1\", \"certificate\": \"-----BEGIN CERTIFICATE-----\nMIIDXTCCAkWg...\n-----END CERTIFICATE-----\", \"expires_at\": \"2028-07-09T15:10:00.000Z\", \"status\": \"active\", \"health_state\": \"valid\", \"health_as_of\": \"2026-07-09T15:30:00.000Z\", \"created_at\": \"2026-07-09T15:10:00.000Z\", \"updated_at\": \"2026-07-09T15:20:00.000Z\", \"created_by\": \"iam-ServiceId-abc123\", \"updated_by\": \"iam-ServiceId-abc123\"}";
    String updateInstanceHsmDestinationPathServerCaPath = "/v2/instances/fe5c5c27-3e44-474a-9484-55892e12d6d1/hsm_destinations/b2c3d4e5-f6a7-8901-bcde-f12345678901/paths/fa3d1234-0000-0000-0000-000000000001/server_cas/5d1f3c2e-8a4b-4c6d-9e7f-0a1b2c3d4e5f";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ServerCaPatch model
    ServerCaPatch serverCaPatchModel = new ServerCaPatch.Builder()
      .name("HSM1_Server_CA_renamed")
      .description("testString")
      .status("active")
      .build();
    Map<String, Object> serverCaPatchModelAsPatch = serverCaPatchModel.asPatch();

    // Construct an instance of the UpdateInstanceHsmDestinationPathServerCaOptions model
    UpdateInstanceHsmDestinationPathServerCaOptions updateInstanceHsmDestinationPathServerCaOptionsModel = new UpdateInstanceHsmDestinationPathServerCaOptions.Builder()
      .instanceId("fe5c5c27-3e44-474a-9484-55892e12d6d1")
      .destinationId("b2c3d4e5-f6a7-8901-bcde-f12345678901")
      .pathId("fa3d1234-0000-0000-0000-000000000001")
      .serverCaId("5d1f3c2e-8a4b-4c6d-9e7f-0a1b2c3d4e5f")
      .serverCaPatch(serverCaPatchModelAsPatch)
      .build();

    // Invoke updateInstanceHsmDestinationPathServerCa() with a valid options model and verify the result
    Response<ServerCa> response = secretsManagerInstanceManagementService.updateInstanceHsmDestinationPathServerCa(updateInstanceHsmDestinationPathServerCaOptionsModel).execute();
    assertNotNull(response);
    ServerCa responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateInstanceHsmDestinationPathServerCaPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the updateInstanceHsmDestinationPathServerCa operation with and without retries enabled
  @Test
  public void testUpdateInstanceHsmDestinationPathServerCaWRetries() throws Throwable {
    secretsManagerInstanceManagementService.enableRetries(4, 30);
    testUpdateInstanceHsmDestinationPathServerCaWOptions();

    secretsManagerInstanceManagementService.disableRetries();
    testUpdateInstanceHsmDestinationPathServerCaWOptions();
  }

  // Test the updateInstanceHsmDestinationPathServerCa operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateInstanceHsmDestinationPathServerCaNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    secretsManagerInstanceManagementService.updateInstanceHsmDestinationPathServerCa(null).execute();
  }

  // Test the deleteInstanceHsmDestinationPathServerCa operation with a valid options model parameter
  @Test
  public void testDeleteInstanceHsmDestinationPathServerCaWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "";
    String deleteInstanceHsmDestinationPathServerCaPath = "/v2/instances/fe5c5c27-3e44-474a-9484-55892e12d6d1/hsm_destinations/b2c3d4e5-f6a7-8901-bcde-f12345678901/paths/fa3d1234-0000-0000-0000-000000000001/server_cas/5d1f3c2e-8a4b-4c6d-9e7f-0a1b2c3d4e5f";
    server.enqueue(new MockResponse()
      .setResponseCode(204)
      .setBody(mockResponseBody));

    // Construct an instance of the DeleteInstanceHsmDestinationPathServerCaOptions model
    DeleteInstanceHsmDestinationPathServerCaOptions deleteInstanceHsmDestinationPathServerCaOptionsModel = new DeleteInstanceHsmDestinationPathServerCaOptions.Builder()
      .instanceId("fe5c5c27-3e44-474a-9484-55892e12d6d1")
      .destinationId("b2c3d4e5-f6a7-8901-bcde-f12345678901")
      .pathId("fa3d1234-0000-0000-0000-000000000001")
      .serverCaId("5d1f3c2e-8a4b-4c6d-9e7f-0a1b2c3d4e5f")
      .build();

    // Invoke deleteInstanceHsmDestinationPathServerCa() with a valid options model and verify the result
    Response<Void> response = secretsManagerInstanceManagementService.deleteInstanceHsmDestinationPathServerCa(deleteInstanceHsmDestinationPathServerCaOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    assertNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteInstanceHsmDestinationPathServerCaPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the deleteInstanceHsmDestinationPathServerCa operation with and without retries enabled
  @Test
  public void testDeleteInstanceHsmDestinationPathServerCaWRetries() throws Throwable {
    secretsManagerInstanceManagementService.enableRetries(4, 30);
    testDeleteInstanceHsmDestinationPathServerCaWOptions();

    secretsManagerInstanceManagementService.disableRetries();
    testDeleteInstanceHsmDestinationPathServerCaWOptions();
  }

  // Test the deleteInstanceHsmDestinationPathServerCa operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteInstanceHsmDestinationPathServerCaNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    secretsManagerInstanceManagementService.deleteInstanceHsmDestinationPathServerCa(null).execute();
  }

  // Test the listInstanceHsmDestinationClientCertificates operation with a valid options model parameter
  @Test
  public void testListInstanceHsmDestinationClientCertificatesWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"client_certificates\": [{\"id\": \"7c9e6679-7425-40de-944b-e07fc1f90ae7\", \"href\": \"https://us-south.secrets-manager.cloud.ibm.com/v2/instances/bfc50c2e-d66d-4f37-9ccf-9713f8325b39/hsm_destinations/b49ad385-0cb7-3694-a71c-2579d6e94b02/client_certificates/7c9e6679-7425-40de-944b-e07fc1f90ae7\", \"name\": \"hsm-client-cert-prod\", \"description\": \"Primary client cert for prod\", \"status\": \"status\", \"provisioning_state\": \"active\", \"health_state\": \"valid\", \"health_as_of\": \"2026-07-09T15:30:00.000Z\", \"csr\": \"-----BEGIN CERTIFICATE REQUEST-----\nMIICvDCCAaQCAQAwdzEL...\n-----END CERTIFICATE REQUEST-----\", \"csr_cn\": \"a1b2c3d4-e5f6-7890-abcd-ef1234567890\", \"signed_cert\": \"-----BEGIN CERTIFICATE-----\nMIIDXTCCAkWg...\n-----END CERTIFICATE-----\", \"expires_at\": \"2028-07-09T10:00:00.000Z\", \"created_at\": \"2026-07-09T10:00:00.000Z\", \"updated_at\": \"2026-07-09T11:00:00.000Z\", \"created_by\": \"iam-ServiceId-abc123\", \"updated_by\": \"iam-ServiceId-abc123\"}]}";
    String listInstanceHsmDestinationClientCertificatesPath = "/v2/instances/fe5c5c27-3e44-474a-9484-55892e12d6d1/hsm_destinations/b2c3d4e5-f6a7-8901-bcde-f12345678901/client_certificates";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ListInstanceHsmDestinationClientCertificatesOptions model
    ListInstanceHsmDestinationClientCertificatesOptions listInstanceHsmDestinationClientCertificatesOptionsModel = new ListInstanceHsmDestinationClientCertificatesOptions.Builder()
      .instanceId("fe5c5c27-3e44-474a-9484-55892e12d6d1")
      .destinationId("b2c3d4e5-f6a7-8901-bcde-f12345678901")
      .build();

    // Invoke listInstanceHsmDestinationClientCertificates() with a valid options model and verify the result
    Response<ClientCertificateCollection> response = secretsManagerInstanceManagementService.listInstanceHsmDestinationClientCertificates(listInstanceHsmDestinationClientCertificatesOptionsModel).execute();
    assertNotNull(response);
    ClientCertificateCollection responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listInstanceHsmDestinationClientCertificatesPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the listInstanceHsmDestinationClientCertificates operation with and without retries enabled
  @Test
  public void testListInstanceHsmDestinationClientCertificatesWRetries() throws Throwable {
    secretsManagerInstanceManagementService.enableRetries(4, 30);
    testListInstanceHsmDestinationClientCertificatesWOptions();

    secretsManagerInstanceManagementService.disableRetries();
    testListInstanceHsmDestinationClientCertificatesWOptions();
  }

  // Test the listInstanceHsmDestinationClientCertificates operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListInstanceHsmDestinationClientCertificatesNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    secretsManagerInstanceManagementService.listInstanceHsmDestinationClientCertificates(null).execute();
  }

  // Test the createInstanceHsmDestinationClientCertificate operation with a valid options model parameter
  @Test
  public void testCreateInstanceHsmDestinationClientCertificateWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"id\": \"7c9e6679-7425-40de-944b-e07fc1f90ae7\", \"href\": \"https://us-south.secrets-manager.cloud.ibm.com/v2/instances/bfc50c2e-d66d-4f37-9ccf-9713f8325b39/hsm_destinations/b49ad385-0cb7-3694-a71c-2579d6e94b02/client_certificates/7c9e6679-7425-40de-944b-e07fc1f90ae7\", \"name\": \"hsm-client-cert-prod\", \"description\": \"Primary client cert for prod\", \"status\": \"status\", \"provisioning_state\": \"active\", \"health_state\": \"valid\", \"health_as_of\": \"2026-07-09T15:30:00.000Z\", \"csr\": \"-----BEGIN CERTIFICATE REQUEST-----\nMIICvDCCAaQCAQAwdzEL...\n-----END CERTIFICATE REQUEST-----\", \"csr_cn\": \"a1b2c3d4-e5f6-7890-abcd-ef1234567890\", \"signed_cert\": \"-----BEGIN CERTIFICATE-----\nMIIDXTCCAkWg...\n-----END CERTIFICATE-----\", \"expires_at\": \"2028-07-09T10:00:00.000Z\", \"created_at\": \"2026-07-09T10:00:00.000Z\", \"updated_at\": \"2026-07-09T11:00:00.000Z\", \"created_by\": \"iam-ServiceId-abc123\", \"updated_by\": \"iam-ServiceId-abc123\"}";
    String createInstanceHsmDestinationClientCertificatePath = "/v2/instances/fe5c5c27-3e44-474a-9484-55892e12d6d1/hsm_destinations/b2c3d4e5-f6a7-8901-bcde-f12345678901/client_certificates";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(201)
      .setBody(mockResponseBody));

    // Construct an instance of the CreateInstanceHsmDestinationClientCertificateOptions model
    CreateInstanceHsmDestinationClientCertificateOptions createInstanceHsmDestinationClientCertificateOptionsModel = new CreateInstanceHsmDestinationClientCertificateOptions.Builder()
      .instanceId("fe5c5c27-3e44-474a-9484-55892e12d6d1")
      .destinationId("b2c3d4e5-f6a7-8901-bcde-f12345678901")
      .name("hsm-client-cert-prod")
      .description("testString")
      .build();

    // Invoke createInstanceHsmDestinationClientCertificate() with a valid options model and verify the result
    Response<ClientCertificate> response = secretsManagerInstanceManagementService.createInstanceHsmDestinationClientCertificate(createInstanceHsmDestinationClientCertificateOptionsModel).execute();
    assertNotNull(response);
    ClientCertificate responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createInstanceHsmDestinationClientCertificatePath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the createInstanceHsmDestinationClientCertificate operation with and without retries enabled
  @Test
  public void testCreateInstanceHsmDestinationClientCertificateWRetries() throws Throwable {
    secretsManagerInstanceManagementService.enableRetries(4, 30);
    testCreateInstanceHsmDestinationClientCertificateWOptions();

    secretsManagerInstanceManagementService.disableRetries();
    testCreateInstanceHsmDestinationClientCertificateWOptions();
  }

  // Test the createInstanceHsmDestinationClientCertificate operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateInstanceHsmDestinationClientCertificateNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    secretsManagerInstanceManagementService.createInstanceHsmDestinationClientCertificate(null).execute();
  }

  // Test the getInstanceHsmDestinationClientCertificate operation with a valid options model parameter
  @Test
  public void testGetInstanceHsmDestinationClientCertificateWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"id\": \"7c9e6679-7425-40de-944b-e07fc1f90ae7\", \"href\": \"https://us-south.secrets-manager.cloud.ibm.com/v2/instances/bfc50c2e-d66d-4f37-9ccf-9713f8325b39/hsm_destinations/b49ad385-0cb7-3694-a71c-2579d6e94b02/client_certificates/7c9e6679-7425-40de-944b-e07fc1f90ae7\", \"name\": \"hsm-client-cert-prod\", \"description\": \"Primary client cert for prod\", \"status\": \"status\", \"provisioning_state\": \"active\", \"health_state\": \"valid\", \"health_as_of\": \"2026-07-09T15:30:00.000Z\", \"csr\": \"-----BEGIN CERTIFICATE REQUEST-----\nMIICvDCCAaQCAQAwdzEL...\n-----END CERTIFICATE REQUEST-----\", \"csr_cn\": \"a1b2c3d4-e5f6-7890-abcd-ef1234567890\", \"signed_cert\": \"-----BEGIN CERTIFICATE-----\nMIIDXTCCAkWg...\n-----END CERTIFICATE-----\", \"expires_at\": \"2028-07-09T10:00:00.000Z\", \"created_at\": \"2026-07-09T10:00:00.000Z\", \"updated_at\": \"2026-07-09T11:00:00.000Z\", \"created_by\": \"iam-ServiceId-abc123\", \"updated_by\": \"iam-ServiceId-abc123\"}";
    String getInstanceHsmDestinationClientCertificatePath = "/v2/instances/fe5c5c27-3e44-474a-9484-55892e12d6d1/hsm_destinations/b2c3d4e5-f6a7-8901-bcde-f12345678901/client_certificates/7c9e6679-7425-40de-944b-e07fc1f90ae7";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetInstanceHsmDestinationClientCertificateOptions model
    GetInstanceHsmDestinationClientCertificateOptions getInstanceHsmDestinationClientCertificateOptionsModel = new GetInstanceHsmDestinationClientCertificateOptions.Builder()
      .instanceId("fe5c5c27-3e44-474a-9484-55892e12d6d1")
      .destinationId("b2c3d4e5-f6a7-8901-bcde-f12345678901")
      .certId("7c9e6679-7425-40de-944b-e07fc1f90ae7")
      .build();

    // Invoke getInstanceHsmDestinationClientCertificate() with a valid options model and verify the result
    Response<ClientCertificate> response = secretsManagerInstanceManagementService.getInstanceHsmDestinationClientCertificate(getInstanceHsmDestinationClientCertificateOptionsModel).execute();
    assertNotNull(response);
    ClientCertificate responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getInstanceHsmDestinationClientCertificatePath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getInstanceHsmDestinationClientCertificate operation with and without retries enabled
  @Test
  public void testGetInstanceHsmDestinationClientCertificateWRetries() throws Throwable {
    secretsManagerInstanceManagementService.enableRetries(4, 30);
    testGetInstanceHsmDestinationClientCertificateWOptions();

    secretsManagerInstanceManagementService.disableRetries();
    testGetInstanceHsmDestinationClientCertificateWOptions();
  }

  // Test the getInstanceHsmDestinationClientCertificate operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetInstanceHsmDestinationClientCertificateNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    secretsManagerInstanceManagementService.getInstanceHsmDestinationClientCertificate(null).execute();
  }

  // Test the updateInstanceHsmDestinationClientCertificate operation with a valid options model parameter
  @Test
  public void testUpdateInstanceHsmDestinationClientCertificateWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"id\": \"7c9e6679-7425-40de-944b-e07fc1f90ae7\", \"href\": \"https://us-south.secrets-manager.cloud.ibm.com/v2/instances/bfc50c2e-d66d-4f37-9ccf-9713f8325b39/hsm_destinations/b49ad385-0cb7-3694-a71c-2579d6e94b02/client_certificates/7c9e6679-7425-40de-944b-e07fc1f90ae7\", \"name\": \"hsm-client-cert-prod\", \"description\": \"Primary client cert for prod\", \"status\": \"status\", \"provisioning_state\": \"active\", \"health_state\": \"valid\", \"health_as_of\": \"2026-07-09T15:30:00.000Z\", \"csr\": \"-----BEGIN CERTIFICATE REQUEST-----\nMIICvDCCAaQCAQAwdzEL...\n-----END CERTIFICATE REQUEST-----\", \"csr_cn\": \"a1b2c3d4-e5f6-7890-abcd-ef1234567890\", \"signed_cert\": \"-----BEGIN CERTIFICATE-----\nMIIDXTCCAkWg...\n-----END CERTIFICATE-----\", \"expires_at\": \"2028-07-09T10:00:00.000Z\", \"created_at\": \"2026-07-09T10:00:00.000Z\", \"updated_at\": \"2026-07-09T11:00:00.000Z\", \"created_by\": \"iam-ServiceId-abc123\", \"updated_by\": \"iam-ServiceId-abc123\"}";
    String updateInstanceHsmDestinationClientCertificatePath = "/v2/instances/fe5c5c27-3e44-474a-9484-55892e12d6d1/hsm_destinations/b2c3d4e5-f6a7-8901-bcde-f12345678901/client_certificates/7c9e6679-7425-40de-944b-e07fc1f90ae7";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ClientCertificatePatch model
    ClientCertificatePatch clientCertificatePatchModel = new ClientCertificatePatch.Builder()
      .name("hsm-client-cert-renamed")
      .description("testString")
      .status("testString")
      .signedCert("testString")
      .build();
    Map<String, Object> clientCertificatePatchModelAsPatch = clientCertificatePatchModel.asPatch();

    // Construct an instance of the UpdateInstanceHsmDestinationClientCertificateOptions model
    UpdateInstanceHsmDestinationClientCertificateOptions updateInstanceHsmDestinationClientCertificateOptionsModel = new UpdateInstanceHsmDestinationClientCertificateOptions.Builder()
      .instanceId("fe5c5c27-3e44-474a-9484-55892e12d6d1")
      .destinationId("b2c3d4e5-f6a7-8901-bcde-f12345678901")
      .certId("7c9e6679-7425-40de-944b-e07fc1f90ae7")
      .clientCertificatePatch(clientCertificatePatchModelAsPatch)
      .build();

    // Invoke updateInstanceHsmDestinationClientCertificate() with a valid options model and verify the result
    Response<ClientCertificate> response = secretsManagerInstanceManagementService.updateInstanceHsmDestinationClientCertificate(updateInstanceHsmDestinationClientCertificateOptionsModel).execute();
    assertNotNull(response);
    ClientCertificate responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateInstanceHsmDestinationClientCertificatePath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the updateInstanceHsmDestinationClientCertificate operation with and without retries enabled
  @Test
  public void testUpdateInstanceHsmDestinationClientCertificateWRetries() throws Throwable {
    secretsManagerInstanceManagementService.enableRetries(4, 30);
    testUpdateInstanceHsmDestinationClientCertificateWOptions();

    secretsManagerInstanceManagementService.disableRetries();
    testUpdateInstanceHsmDestinationClientCertificateWOptions();
  }

  // Test the updateInstanceHsmDestinationClientCertificate operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateInstanceHsmDestinationClientCertificateNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    secretsManagerInstanceManagementService.updateInstanceHsmDestinationClientCertificate(null).execute();
  }

  // Test the deleteInstanceHsmDestinationClientCertificate operation with a valid options model parameter
  @Test
  public void testDeleteInstanceHsmDestinationClientCertificateWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "";
    String deleteInstanceHsmDestinationClientCertificatePath = "/v2/instances/fe5c5c27-3e44-474a-9484-55892e12d6d1/hsm_destinations/b2c3d4e5-f6a7-8901-bcde-f12345678901/client_certificates/7c9e6679-7425-40de-944b-e07fc1f90ae7";
    server.enqueue(new MockResponse()
      .setResponseCode(204)
      .setBody(mockResponseBody));

    // Construct an instance of the DeleteInstanceHsmDestinationClientCertificateOptions model
    DeleteInstanceHsmDestinationClientCertificateOptions deleteInstanceHsmDestinationClientCertificateOptionsModel = new DeleteInstanceHsmDestinationClientCertificateOptions.Builder()
      .instanceId("fe5c5c27-3e44-474a-9484-55892e12d6d1")
      .destinationId("b2c3d4e5-f6a7-8901-bcde-f12345678901")
      .certId("7c9e6679-7425-40de-944b-e07fc1f90ae7")
      .build();

    // Invoke deleteInstanceHsmDestinationClientCertificate() with a valid options model and verify the result
    Response<Void> response = secretsManagerInstanceManagementService.deleteInstanceHsmDestinationClientCertificate(deleteInstanceHsmDestinationClientCertificateOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    assertNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteInstanceHsmDestinationClientCertificatePath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the deleteInstanceHsmDestinationClientCertificate operation with and without retries enabled
  @Test
  public void testDeleteInstanceHsmDestinationClientCertificateWRetries() throws Throwable {
    secretsManagerInstanceManagementService.enableRetries(4, 30);
    testDeleteInstanceHsmDestinationClientCertificateWOptions();

    secretsManagerInstanceManagementService.disableRetries();
    testDeleteInstanceHsmDestinationClientCertificateWOptions();
  }

  // Test the deleteInstanceHsmDestinationClientCertificate operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteInstanceHsmDestinationClientCertificateNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    secretsManagerInstanceManagementService.deleteInstanceHsmDestinationClientCertificate(null).execute();
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