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
        .instanceId("fe5c5c27-3e44-474a-9484-55892e12d6d1")
        .responseWrapping(true)
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
        .instanceId("fe5c5c27-3e44-474a-9484-55892e12d6d1")
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
        .instanceId("fe5c5c27-3e44-474a-9484-55892e12d6d1")
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
      CreateDestinationRequestIbmCloudDatabaseDestinationPrototype createDestinationRequestModel = new CreateDestinationRequestIbmCloudDatabaseDestinationPrototype.Builder()
        .name("my-postgres")
        .type("ibm_cloud_database")
        .description("Production PostgreSQL database")
        .crn("crn:v1:staging:public:databases-for-postgresql:us-south:a/791f5fb10986423e97aa8512f18b7e65:11111111-0000-4000-8000-111111111111::")
        .build();

      CreateInstanceDestinationOptions createInstanceDestinationOptions = new CreateInstanceDestinationOptions.Builder()
        .instanceId("fe5c5c27-3e44-474a-9484-55892e12d6d1")
        .destinationPrototype(createDestinationRequestModel)
        .build();

      // Invoke operation
      Response<IbmCloudDatabaseDestination> response = service.createInstanceDestination(createInstanceDestinationOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 202);

      IbmCloudDatabaseDestination ibmCloudDatabaseDestinationResult = response.getResult();
      assertNotNull(ibmCloudDatabaseDestinationResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreateInstanceDestination" })
  public void testGetInstanceDestination() throws Exception {
    try {
      GetInstanceDestinationOptions getInstanceDestinationOptions = new GetInstanceDestinationOptions.Builder()
        .instanceId("fe5c5c27-3e44-474a-9484-55892e12d6d1")
        .destinationId("2aac4a89-df97-4b26-961a-3155564e48f6")
        .build();

      // Invoke operation
      Response<IbmCloudDatabaseDestination> response = service.getInstanceDestination(getInstanceDestinationOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      IbmCloudDatabaseDestination ibmCloudDatabaseDestinationResult = response.getResult();
      assertNotNull(ibmCloudDatabaseDestinationResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetInstanceDestination" })
  public void testUpdateInstanceDestination() throws Exception {
    try {
      DestinationPatch destinationPatchModel = new DestinationPatch.Builder()
        .name("my-postgres-updated")
        .description("Production PostgreSQL database")
        .build();
      Map<String, Object> destinationPatchModelAsPatch = destinationPatchModel.asPatch();

      UpdateInstanceDestinationOptions updateInstanceDestinationOptions = new UpdateInstanceDestinationOptions.Builder()
        .instanceId("fe5c5c27-3e44-474a-9484-55892e12d6d1")
        .destinationId("2aac4a89-df97-4b26-961a-3155564e48f6")
        .destinationPatch(destinationPatchModelAsPatch)
        .build();

      // Invoke operation
      Response<IbmCloudDatabaseDestination> response = service.updateInstanceDestination(updateInstanceDestinationOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      IbmCloudDatabaseDestination ibmCloudDatabaseDestinationResult = response.getResult();
      assertNotNull(ibmCloudDatabaseDestinationResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testUpdateInstanceDestination" })
  public void testListInstanceHsmDestinations() throws Exception {
    try {
      ListInstanceHsmDestinationsOptions listInstanceHsmDestinationsOptions = new ListInstanceHsmDestinationsOptions.Builder()
        .instanceId("fe5c5c27-3e44-474a-9484-55892e12d6d1")
        .build();

      // Invoke operation
      Response<HSMDestinationCollection> response = service.listInstanceHsmDestinations(listInstanceHsmDestinationsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      HSMDestinationCollection hsmDestinationCollectionResult = response.getResult();
      assertNotNull(hsmDestinationCollectionResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListInstanceHsmDestinations" })
  public void testCreateInstanceHsmDestination() throws Exception {
    try {
      CreateInstanceHsmDestinationOptions createInstanceHsmDestinationOptions = new CreateInstanceHsmDestinationOptions.Builder()
        .instanceId("fe5c5c27-3e44-474a-9484-55892e12d6d1")
        .name("prod-hsm-destination")
        .vendor("thales_luna")
        .description("Primary Thales Luna destination")
        .build();

      // Invoke operation
      Response<HSMDestination> response = service.createInstanceHsmDestination(createInstanceHsmDestinationOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      HSMDestination hsmDestinationResult = response.getResult();
      assertNotNull(hsmDestinationResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreateInstanceHsmDestination" })
  public void testGetInstanceHsmDestination() throws Exception {
    try {
      GetInstanceHsmDestinationOptions getInstanceHsmDestinationOptions = new GetInstanceHsmDestinationOptions.Builder()
        .instanceId("fe5c5c27-3e44-474a-9484-55892e12d6d1")
        .destinationId("2aac4a89-df97-4b26-961a-3155564e48f6")
        .build();

      // Invoke operation
      Response<HSMDestination> response = service.getInstanceHsmDestination(getInstanceHsmDestinationOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      HSMDestination hsmDestinationResult = response.getResult();
      assertNotNull(hsmDestinationResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetInstanceHsmDestination" })
  public void testUpdateInstanceHsmDestination() throws Exception {
    try {
      HSMDestinationPatch hsmDestinationPatchModel = new HSMDestinationPatch.Builder()
        .name("my-hsm-destination")
        .description("testString")
        .build();
      Map<String, Object> hsmDestinationPatchModelAsPatch = hsmDestinationPatchModel.asPatch();

      UpdateInstanceHsmDestinationOptions updateInstanceHsmDestinationOptions = new UpdateInstanceHsmDestinationOptions.Builder()
        .instanceId("fe5c5c27-3e44-474a-9484-55892e12d6d1")
        .destinationId("2aac4a89-df97-4b26-961a-3155564e48f6")
        .hsmDestinationPatch(hsmDestinationPatchModelAsPatch)
        .build();

      // Invoke operation
      Response<HSMDestination> response = service.updateInstanceHsmDestination(updateInstanceHsmDestinationOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      HSMDestination hsmDestinationResult = response.getResult();
      assertNotNull(hsmDestinationResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testUpdateInstanceHsmDestination" })
  public void testGetHsmDestinationHealthSnapshot() throws Exception {
    try {
      GetHsmDestinationHealthSnapshotOptions getHsmDestinationHealthSnapshotOptions = new GetHsmDestinationHealthSnapshotOptions.Builder()
        .instanceId("fe5c5c27-3e44-474a-9484-55892e12d6d1")
        .destinationId("2aac4a89-df97-4b26-961a-3155564e48f6")
        .build();

      // Invoke operation
      Response<DestinationHealthSnapshot> response = service.getHsmDestinationHealthSnapshot(getHsmDestinationHealthSnapshotOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      DestinationHealthSnapshot destinationHealthSnapshotResult = response.getResult();
      assertNotNull(destinationHealthSnapshotResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetHsmDestinationHealthSnapshot" })
  public void testRunHsmDestinationHealthCheck() throws Exception {
    try {
      RunHsmDestinationHealthCheckOptions runHsmDestinationHealthCheckOptions = new RunHsmDestinationHealthCheckOptions.Builder()
        .instanceId("fe5c5c27-3e44-474a-9484-55892e12d6d1")
        .destinationId("2aac4a89-df97-4b26-961a-3155564e48f6")
        .build();

      // Invoke operation
      Response<AsyncHealthCheckAckResponse> response = service.runHsmDestinationHealthCheck(runHsmDestinationHealthCheckOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 202);

      AsyncHealthCheckAckResponse asyncHealthCheckAckResponseResult = response.getResult();
      assertNotNull(asyncHealthCheckAckResponseResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testRunHsmDestinationHealthCheck" })
  public void testApplyHsmDestination() throws Exception {
    try {
      ApplyHsmDestinationOptions applyHsmDestinationOptions = new ApplyHsmDestinationOptions.Builder()
        .instanceId("fe5c5c27-3e44-474a-9484-55892e12d6d1")
        .destinationId("2aac4a89-df97-4b26-961a-3155564e48f6")
        .build();

      // Invoke operation
      Response<AsyncHealthAckResponse> response = service.applyHsmDestination(applyHsmDestinationOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 202);

      AsyncHealthAckResponse asyncHealthAckResponseResult = response.getResult();
      assertNotNull(asyncHealthAckResponseResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testApplyHsmDestination" })
  public void testListInstanceHsmDestinationHaGroups() throws Exception {
    try {
      ListInstanceHsmDestinationHaGroupsOptions listInstanceHsmDestinationHaGroupsOptions = new ListInstanceHsmDestinationHaGroupsOptions.Builder()
        .instanceId("fe5c5c27-3e44-474a-9484-55892e12d6d1")
        .destinationId("2aac4a89-df97-4b26-961a-3155564e48f6")
        .build();

      // Invoke operation
      Response<HSMHAGroupCollection> response = service.listInstanceHsmDestinationHaGroups(listInstanceHsmDestinationHaGroupsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      HSMHAGroupCollection hsmhaGroupCollectionResult = response.getResult();
      assertNotNull(hsmhaGroupCollectionResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListInstanceHsmDestinationHaGroups" })
  public void testCreateInstanceHsmDestinationHaGroup() throws Exception {
    try {
      CreateInstanceHsmDestinationHaGroupOptions createInstanceHsmDestinationHaGroupOptions = new CreateInstanceHsmDestinationHaGroupOptions.Builder()
        .instanceId("fe5c5c27-3e44-474a-9484-55892e12d6d1")
        .destinationId("2aac4a89-df97-4b26-961a-3155564e48f6")
        .name("production-ha-group")
        .groupLabel("prod_ha_group")
        .groupSerial("11323465009866")
        .memberSerials(java.util.Arrays.asList("123456", "123457"))
        .description("Primary HA Group for prod")
        .build();

      // Invoke operation
      Response<HSMHAGroup> response = service.createInstanceHsmDestinationHaGroup(createInstanceHsmDestinationHaGroupOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      HSMHAGroup hsmhaGroupResult = response.getResult();
      assertNotNull(hsmhaGroupResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreateInstanceHsmDestinationHaGroup" })
  public void testGetInstanceHsmDestinationHaGroup() throws Exception {
    try {
      GetInstanceHsmDestinationHaGroupOptions getInstanceHsmDestinationHaGroupOptions = new GetInstanceHsmDestinationHaGroupOptions.Builder()
        .instanceId("fe5c5c27-3e44-474a-9484-55892e12d6d1")
        .destinationId("2aac4a89-df97-4b26-961a-3155564e48f6")
        .haGroupId("fe5c5c27-3e44-474a-9484-55892e12d6d1")
        .build();

      // Invoke operation
      Response<HSMHAGroup> response = service.getInstanceHsmDestinationHaGroup(getInstanceHsmDestinationHaGroupOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      HSMHAGroup hsmhaGroupResult = response.getResult();
      assertNotNull(hsmhaGroupResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetInstanceHsmDestinationHaGroup" })
  public void testUpdateInstanceHsmDestinationHaGroup() throws Exception {
    try {
      HSMHAGroupPatch hsmhaGroupPatchModel = new HSMHAGroupPatch.Builder()
        .name("dr-ha-group")
        .description("DR HA Group for failover")
        .memberSerials(java.util.Arrays.asList("123456", "123457", "123458"))
        .build();
      Map<String, Object> hsmhaGroupPatchModelAsPatch = hsmhaGroupPatchModel.asPatch();

      UpdateInstanceHsmDestinationHaGroupOptions updateInstanceHsmDestinationHaGroupOptions = new UpdateInstanceHsmDestinationHaGroupOptions.Builder()
        .instanceId("fe5c5c27-3e44-474a-9484-55892e12d6d1")
        .destinationId("2aac4a89-df97-4b26-961a-3155564e48f6")
        .haGroupId("fe5c5c27-3e44-474a-9484-55892e12d6d1")
        .hsmhaGroupPatch(hsmhaGroupPatchModelAsPatch)
        .build();

      // Invoke operation
      Response<HSMHAGroup> response = service.updateInstanceHsmDestinationHaGroup(updateInstanceHsmDestinationHaGroupOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      HSMHAGroup hsmhaGroupResult = response.getResult();
      assertNotNull(hsmhaGroupResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testUpdateInstanceHsmDestinationHaGroup" })
  public void testListInstanceHsmDestinationPaths() throws Exception {
    try {
      ListInstanceHsmDestinationPathsOptions listInstanceHsmDestinationPathsOptions = new ListInstanceHsmDestinationPathsOptions.Builder()
        .instanceId("fe5c5c27-3e44-474a-9484-55892e12d6d1")
        .destinationId("2aac4a89-df97-4b26-961a-3155564e48f6")
        .build();

      // Invoke operation
      Response<PathCollection> response = service.listInstanceHsmDestinationPaths(listInstanceHsmDestinationPathsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      PathCollection pathCollectionResult = response.getResult();
      assertNotNull(pathCollectionResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListInstanceHsmDestinationPaths" })
  public void testCreateInstanceHsmDestinationPath() throws Exception {
    try {
      CreateInstanceHsmDestinationPathOptions createInstanceHsmDestinationPathOptions = new CreateInstanceHsmDestinationPathOptions.Builder()
        .instanceId("fe5c5c27-3e44-474a-9484-55892e12d6d1")
        .destinationId("2aac4a89-df97-4b26-961a-3155564e48f6")
        .name("hsm-node-1")
        .crn("crn:v1:staging:public:databases-for-postgresql:us-south:a/791f5fb10986423e97aa8512f18b7e65:11111111-0000-4000-8000-111111111111::")
        .description("testString")
        .build();

      // Invoke operation
      Response<Path> response = service.createInstanceHsmDestinationPath(createInstanceHsmDestinationPathOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      Path pathResult = response.getResult();
      assertNotNull(pathResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreateInstanceHsmDestinationPath" })
  public void testGetInstanceHsmDestinationPath() throws Exception {
    try {
      GetInstanceHsmDestinationPathOptions getInstanceHsmDestinationPathOptions = new GetInstanceHsmDestinationPathOptions.Builder()
        .instanceId("fe5c5c27-3e44-474a-9484-55892e12d6d1")
        .destinationId("2aac4a89-df97-4b26-961a-3155564e48f6")
        .pathId("fe5c5c27-3e44-474a-9484-55892e12d6d1")
        .build();

      // Invoke operation
      Response<Path> response = service.getInstanceHsmDestinationPath(getInstanceHsmDestinationPathOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      Path pathResult = response.getResult();
      assertNotNull(pathResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetInstanceHsmDestinationPath" })
  public void testUpdateInstanceHsmDestinationPath() throws Exception {
    try {
      PathPatch pathPatchModel = new PathPatch.Builder()
        .name("hsm-node-1-renamed")
        .description("testString")
        .build();
      Map<String, Object> pathPatchModelAsPatch = pathPatchModel.asPatch();

      UpdateInstanceHsmDestinationPathOptions updateInstanceHsmDestinationPathOptions = new UpdateInstanceHsmDestinationPathOptions.Builder()
        .instanceId("fe5c5c27-3e44-474a-9484-55892e12d6d1")
        .destinationId("2aac4a89-df97-4b26-961a-3155564e48f6")
        .pathId("fe5c5c27-3e44-474a-9484-55892e12d6d1")
        .pathPatch(pathPatchModelAsPatch)
        .build();

      // Invoke operation
      Response<Path> response = service.updateInstanceHsmDestinationPath(updateInstanceHsmDestinationPathOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      Path pathResult = response.getResult();
      assertNotNull(pathResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testUpdateInstanceHsmDestinationPath" })
  public void testCreatePathBuild() throws Exception {
    try {
      CreatePathBuildOptions createPathBuildOptions = new CreatePathBuildOptions.Builder()
        .instanceId("fe5c5c27-3e44-474a-9484-55892e12d6d1")
        .destinationId("2aac4a89-df97-4b26-961a-3155564e48f6")
        .pathId("fe5c5c27-3e44-474a-9484-55892e12d6d1")
        .build();

      // Invoke operation
      Response<VpeProvisioningResponse> response = service.createPathBuild(createPathBuildOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 202);

      VpeProvisioningResponse vpeProvisioningResponseResult = response.getResult();
      assertNotNull(vpeProvisioningResponseResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreatePathBuild" })
  public void testGetPathVpeStatus() throws Exception {
    try {
      GetPathVpeStatusOptions getPathVpeStatusOptions = new GetPathVpeStatusOptions.Builder()
        .instanceId("fe5c5c27-3e44-474a-9484-55892e12d6d1")
        .destinationId("2aac4a89-df97-4b26-961a-3155564e48f6")
        .pathId("fe5c5c27-3e44-474a-9484-55892e12d6d1")
        .build();

      // Invoke operation
      Response<VpeStatusResult> response = service.getPathVpeStatus(getPathVpeStatusOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      VpeStatusResult vpeStatusResultResult = response.getResult();
      assertNotNull(vpeStatusResultResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetPathVpeStatus" })
  public void testResetHsmDestinationPath() throws Exception {
    try {
      ResetHsmDestinationPathOptions resetHsmDestinationPathOptions = new ResetHsmDestinationPathOptions.Builder()
        .instanceId("fe5c5c27-3e44-474a-9484-55892e12d6d1")
        .destinationId("2aac4a89-df97-4b26-961a-3155564e48f6")
        .pathId("fe5c5c27-3e44-474a-9484-55892e12d6d1")
        .build();

      // Invoke operation
      Response<HSMPathReset> response = service.resetHsmDestinationPath(resetHsmDestinationPathOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      HSMPathReset hsmPathResetResult = response.getResult();
      assertNotNull(hsmPathResetResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testResetHsmDestinationPath" })
  public void testListInstanceHsmDestinationPathServerCas() throws Exception {
    try {
      ListInstanceHsmDestinationPathServerCasOptions listInstanceHsmDestinationPathServerCasOptions = new ListInstanceHsmDestinationPathServerCasOptions.Builder()
        .instanceId("fe5c5c27-3e44-474a-9484-55892e12d6d1")
        .destinationId("2aac4a89-df97-4b26-961a-3155564e48f6")
        .pathId("fe5c5c27-3e44-474a-9484-55892e12d6d1")
        .build();

      // Invoke operation
      Response<ServerCaCollection> response = service.listInstanceHsmDestinationPathServerCas(listInstanceHsmDestinationPathServerCasOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ServerCaCollection serverCaCollectionResult = response.getResult();
      assertNotNull(serverCaCollectionResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListInstanceHsmDestinationPathServerCas" })
  public void testCreateInstanceHsmDestinationPathServerCa() throws Exception {
    try {
      CreateInstanceHsmDestinationPathServerCaOptions createInstanceHsmDestinationPathServerCaOptions = new CreateInstanceHsmDestinationPathServerCaOptions.Builder()
        .instanceId("fe5c5c27-3e44-474a-9484-55892e12d6d1")
        .destinationId("2aac4a89-df97-4b26-961a-3155564e48f6")
        .pathId("fe5c5c27-3e44-474a-9484-55892e12d6d1")
        .name("HSM1_Server_CA")
        .certificate("-----BEGIN CERTIFICATE-----\nMIIDXTCCAkWg...\n-----END CERTIFICATE-----")
        .description("testString")
        .build();

      // Invoke operation
      Response<ServerCa> response = service.createInstanceHsmDestinationPathServerCa(createInstanceHsmDestinationPathServerCaOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      ServerCa serverCaResult = response.getResult();
      assertNotNull(serverCaResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreateInstanceHsmDestinationPathServerCa" })
  public void testGetInstanceHsmDestinationPathServerCa() throws Exception {
    try {
      GetInstanceHsmDestinationPathServerCaOptions getInstanceHsmDestinationPathServerCaOptions = new GetInstanceHsmDestinationPathServerCaOptions.Builder()
        .instanceId("fe5c5c27-3e44-474a-9484-55892e12d6d1")
        .destinationId("2aac4a89-df97-4b26-961a-3155564e48f6")
        .pathId("fe5c5c27-3e44-474a-9484-55892e12d6d1")
        .serverCaId("fe5c5c27-3e44-474a-9484-55892e12d6d1")
        .build();

      // Invoke operation
      Response<ServerCa> response = service.getInstanceHsmDestinationPathServerCa(getInstanceHsmDestinationPathServerCaOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ServerCa serverCaResult = response.getResult();
      assertNotNull(serverCaResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetInstanceHsmDestinationPathServerCa" })
  public void testUpdateInstanceHsmDestinationPathServerCa() throws Exception {
    try {
      ServerCaPatch serverCaPatchModel = new ServerCaPatch.Builder()
        .name("HSM1_Server_CA_renamed")
        .description("testString")
        .status("active")
        .build();
      Map<String, Object> serverCaPatchModelAsPatch = serverCaPatchModel.asPatch();

      UpdateInstanceHsmDestinationPathServerCaOptions updateInstanceHsmDestinationPathServerCaOptions = new UpdateInstanceHsmDestinationPathServerCaOptions.Builder()
        .instanceId("fe5c5c27-3e44-474a-9484-55892e12d6d1")
        .destinationId("2aac4a89-df97-4b26-961a-3155564e48f6")
        .pathId("fe5c5c27-3e44-474a-9484-55892e12d6d1")
        .serverCaId("fe5c5c27-3e44-474a-9484-55892e12d6d1")
        .serverCaPatch(serverCaPatchModelAsPatch)
        .build();

      // Invoke operation
      Response<ServerCa> response = service.updateInstanceHsmDestinationPathServerCa(updateInstanceHsmDestinationPathServerCaOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ServerCa serverCaResult = response.getResult();
      assertNotNull(serverCaResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testUpdateInstanceHsmDestinationPathServerCa" })
  public void testListInstanceHsmDestinationClientCertificates() throws Exception {
    try {
      ListInstanceHsmDestinationClientCertificatesOptions listInstanceHsmDestinationClientCertificatesOptions = new ListInstanceHsmDestinationClientCertificatesOptions.Builder()
        .instanceId("fe5c5c27-3e44-474a-9484-55892e12d6d1")
        .destinationId("2aac4a89-df97-4b26-961a-3155564e48f6")
        .build();

      // Invoke operation
      Response<ClientCertificateCollection> response = service.listInstanceHsmDestinationClientCertificates(listInstanceHsmDestinationClientCertificatesOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ClientCertificateCollection clientCertificateCollectionResult = response.getResult();
      assertNotNull(clientCertificateCollectionResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListInstanceHsmDestinationClientCertificates" })
  public void testCreateInstanceHsmDestinationClientCertificate() throws Exception {
    try {
      CreateInstanceHsmDestinationClientCertificateOptions createInstanceHsmDestinationClientCertificateOptions = new CreateInstanceHsmDestinationClientCertificateOptions.Builder()
        .instanceId("fe5c5c27-3e44-474a-9484-55892e12d6d1")
        .destinationId("2aac4a89-df97-4b26-961a-3155564e48f6")
        .name("hsm-client-cert-prod")
        .description("testString")
        .build();

      // Invoke operation
      Response<ClientCertificate> response = service.createInstanceHsmDestinationClientCertificate(createInstanceHsmDestinationClientCertificateOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      ClientCertificate clientCertificateResult = response.getResult();
      assertNotNull(clientCertificateResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreateInstanceHsmDestinationClientCertificate" })
  public void testGetInstanceHsmDestinationClientCertificate() throws Exception {
    try {
      GetInstanceHsmDestinationClientCertificateOptions getInstanceHsmDestinationClientCertificateOptions = new GetInstanceHsmDestinationClientCertificateOptions.Builder()
        .instanceId("fe5c5c27-3e44-474a-9484-55892e12d6d1")
        .destinationId("2aac4a89-df97-4b26-961a-3155564e48f6")
        .certId("fe5c5c27-3e44-474a-9484-55892e12d6d1")
        .build();

      // Invoke operation
      Response<ClientCertificate> response = service.getInstanceHsmDestinationClientCertificate(getInstanceHsmDestinationClientCertificateOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ClientCertificate clientCertificateResult = response.getResult();
      assertNotNull(clientCertificateResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetInstanceHsmDestinationClientCertificate" })
  public void testUpdateInstanceHsmDestinationClientCertificate() throws Exception {
    try {
      ClientCertificatePatch clientCertificatePatchModel = new ClientCertificatePatch.Builder()
        .name("hsm-client-cert-renamed")
        .description("testString")
        .status("testString")
        .signedCert("testString")
        .build();
      Map<String, Object> clientCertificatePatchModelAsPatch = clientCertificatePatchModel.asPatch();

      UpdateInstanceHsmDestinationClientCertificateOptions updateInstanceHsmDestinationClientCertificateOptions = new UpdateInstanceHsmDestinationClientCertificateOptions.Builder()
        .instanceId("fe5c5c27-3e44-474a-9484-55892e12d6d1")
        .destinationId("2aac4a89-df97-4b26-961a-3155564e48f6")
        .certId("fe5c5c27-3e44-474a-9484-55892e12d6d1")
        .clientCertificatePatch(clientCertificatePatchModelAsPatch)
        .build();

      // Invoke operation
      Response<ClientCertificate> response = service.updateInstanceHsmDestinationClientCertificate(updateInstanceHsmDestinationClientCertificateOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ClientCertificate clientCertificateResult = response.getResult();
      assertNotNull(clientCertificateResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testUpdateInstanceHsmDestinationClientCertificate" })
  public void testDeleteVaultAdmintokens() throws Exception {
    try {
      DeleteVaultAdmintokensOptions deleteVaultAdmintokensOptions = new DeleteVaultAdmintokensOptions.Builder()
        .instanceId("fe5c5c27-3e44-474a-9484-55892e12d6d1")
        .build();

      // Invoke operation
      Response<Void> response = service.deleteVaultAdmintokens(deleteVaultAdmintokensOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testDeleteVaultAdmintokens" })
  public void testDeleteInstanceDestination() throws Exception {
    try {
      DeleteInstanceDestinationOptions deleteInstanceDestinationOptions = new DeleteInstanceDestinationOptions.Builder()
        .instanceId("fe5c5c27-3e44-474a-9484-55892e12d6d1")
        .destinationId("2aac4a89-df97-4b26-961a-3155564e48f6")
        .build();

      // Invoke operation
      Response<IbmCloudDatabaseDestination> response = service.deleteInstanceDestination(deleteInstanceDestinationOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 202);

      IbmCloudDatabaseDestination ibmCloudDatabaseDestinationResult = response.getResult();
      assertNotNull(ibmCloudDatabaseDestinationResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testDeleteInstanceDestination" })
  public void testDeleteInstanceHsmDestination() throws Exception {
    try {
      DeleteInstanceHsmDestinationOptions deleteInstanceHsmDestinationOptions = new DeleteInstanceHsmDestinationOptions.Builder()
        .instanceId("fe5c5c27-3e44-474a-9484-55892e12d6d1")
        .destinationId("2aac4a89-df97-4b26-961a-3155564e48f6")
        .build();

      // Invoke operation
      Response<AsyncDeleteResponse> response = service.deleteInstanceHsmDestination(deleteInstanceHsmDestinationOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 202);

      AsyncDeleteResponse asyncDeleteResponseResult = response.getResult();
      assertNotNull(asyncDeleteResponseResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testDeleteInstanceHsmDestination" })
  public void testDeleteInstanceHsmDestinationHaGroup() throws Exception {
    try {
      DeleteInstanceHsmDestinationHaGroupOptions deleteInstanceHsmDestinationHaGroupOptions = new DeleteInstanceHsmDestinationHaGroupOptions.Builder()
        .instanceId("fe5c5c27-3e44-474a-9484-55892e12d6d1")
        .destinationId("2aac4a89-df97-4b26-961a-3155564e48f6")
        .haGroupId("fe5c5c27-3e44-474a-9484-55892e12d6d1")
        .build();

      // Invoke operation
      Response<Void> response = service.deleteInstanceHsmDestinationHaGroup(deleteInstanceHsmDestinationHaGroupOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testDeleteInstanceHsmDestinationHaGroup" })
  public void testDeleteInstanceHsmDestinationPath() throws Exception {
    try {
      DeleteInstanceHsmDestinationPathOptions deleteInstanceHsmDestinationPathOptions = new DeleteInstanceHsmDestinationPathOptions.Builder()
        .instanceId("fe5c5c27-3e44-474a-9484-55892e12d6d1")
        .destinationId("2aac4a89-df97-4b26-961a-3155564e48f6")
        .pathId("fe5c5c27-3e44-474a-9484-55892e12d6d1")
        .build();

      // Invoke operation
      Response<Path> response = service.deleteInstanceHsmDestinationPath(deleteInstanceHsmDestinationPathOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 202);

      Path pathResult = response.getResult();
      assertNotNull(pathResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testDeleteInstanceHsmDestinationPath" })
  public void testDeleteInstanceHsmDestinationPathServerCa() throws Exception {
    try {
      DeleteInstanceHsmDestinationPathServerCaOptions deleteInstanceHsmDestinationPathServerCaOptions = new DeleteInstanceHsmDestinationPathServerCaOptions.Builder()
        .instanceId("fe5c5c27-3e44-474a-9484-55892e12d6d1")
        .destinationId("2aac4a89-df97-4b26-961a-3155564e48f6")
        .pathId("fe5c5c27-3e44-474a-9484-55892e12d6d1")
        .serverCaId("fe5c5c27-3e44-474a-9484-55892e12d6d1")
        .build();

      // Invoke operation
      Response<Void> response = service.deleteInstanceHsmDestinationPathServerCa(deleteInstanceHsmDestinationPathServerCaOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testDeleteInstanceHsmDestinationPathServerCa" })
  public void testDeleteInstanceHsmDestinationClientCertificate() throws Exception {
    try {
      DeleteInstanceHsmDestinationClientCertificateOptions deleteInstanceHsmDestinationClientCertificateOptions = new DeleteInstanceHsmDestinationClientCertificateOptions.Builder()
        .instanceId("fe5c5c27-3e44-474a-9484-55892e12d6d1")
        .destinationId("2aac4a89-df97-4b26-961a-3155564e48f6")
        .certId("fe5c5c27-3e44-474a-9484-55892e12d6d1")
        .build();

      // Invoke operation
      Response<Void> response = service.deleteInstanceHsmDestinationClientCertificate(deleteInstanceHsmDestinationClientCertificateOptions).execute();
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
