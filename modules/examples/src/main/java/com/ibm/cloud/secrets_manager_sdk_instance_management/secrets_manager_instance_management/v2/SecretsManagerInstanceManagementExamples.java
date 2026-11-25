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
import com.ibm.cloud.sdk.core.util.CredentialUtils;
import com.ibm.cloud.secrets_manager_sdk_instance_management.secrets_manager_instance_management.v2.model.ApplyHsmDestinationOptions;
import com.ibm.cloud.secrets_manager_sdk_instance_management.secrets_manager_instance_management.v2.model.AsyncDeleteResponse;
import com.ibm.cloud.secrets_manager_sdk_instance_management.secrets_manager_instance_management.v2.model.AsyncHealthAckResponse;
import com.ibm.cloud.secrets_manager_sdk_instance_management.secrets_manager_instance_management.v2.model.AsyncHealthCheckAckResponse;
import com.ibm.cloud.secrets_manager_sdk_instance_management.secrets_manager_instance_management.v2.model.ClientCertificate;
import com.ibm.cloud.secrets_manager_sdk_instance_management.secrets_manager_instance_management.v2.model.ClientCertificateCollection;
import com.ibm.cloud.secrets_manager_sdk_instance_management.secrets_manager_instance_management.v2.model.ClientCertificatePatch;
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
import com.ibm.cloud.secrets_manager_sdk_instance_management.secrets_manager_instance_management.v2.model.UpdateInstanceDestinationOptions;
import com.ibm.cloud.secrets_manager_sdk_instance_management.secrets_manager_instance_management.v2.model.UpdateInstanceHsmDestinationClientCertificateOptions;
import com.ibm.cloud.secrets_manager_sdk_instance_management.secrets_manager_instance_management.v2.model.UpdateInstanceHsmDestinationHaGroupOptions;
import com.ibm.cloud.secrets_manager_sdk_instance_management.secrets_manager_instance_management.v2.model.UpdateInstanceHsmDestinationOptions;
import com.ibm.cloud.secrets_manager_sdk_instance_management.secrets_manager_instance_management.v2.model.UpdateInstanceHsmDestinationPathOptions;
import com.ibm.cloud.secrets_manager_sdk_instance_management.secrets_manager_instance_management.v2.model.UpdateInstanceHsmDestinationPathServerCaOptions;
import com.ibm.cloud.secrets_manager_sdk_instance_management.secrets_manager_instance_management.v2.model.VpeProvisioningResponse;
import com.ibm.cloud.secrets_manager_sdk_instance_management.secrets_manager_instance_management.v2.model.VpeStatusResult;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * This class contains examples of how to use the secrets-manager-instance-management service.
 *
 * The following configuration properties are assumed to be defined:
 * SECRETS_MANAGER_INSTANCE_MANAGEMENT_URL=&lt;service base url&gt;
 * SECRETS_MANAGER_INSTANCE_MANAGEMENT_AUTH_TYPE=iam
 * SECRETS_MANAGER_INSTANCE_MANAGEMENT_APIKEY=&lt;IAM apikey&gt;
 * SECRETS_MANAGER_INSTANCE_MANAGEMENT_AUTH_URL=&lt;IAM token service base URL - omit this if using the production environment&gt;
 *
 * These configuration properties can be exported as environment variables, or stored
 * in a configuration file and then:
 * export IBM_CREDENTIALS_FILE=&lt;name of configuration file&gt;
 */
public class SecretsManagerInstanceManagementExamples {
  private static final Logger logger = LoggerFactory.getLogger(SecretsManagerInstanceManagementExamples.class);
  protected SecretsManagerInstanceManagementExamples() { }

  static {
    System.setProperty("IBM_CREDENTIALS_FILE", "../../secrets_manager_instance_management_v2.env");
  }

  /**
   * The main() function invokes operations of the secrets-manager-instance-management service.
   * @param args command-line arguments
   * @throws Exception an error occurred
   */
  @SuppressWarnings("checkstyle:methodlength")
  public static void main(String[] args) throws Exception {
    SecretsManagerInstanceManagement secretsManagerInstanceManagementService = SecretsManagerInstanceManagement.newInstance();

    // Load up our test-specific config properties.
    Map<String, String> testConfigProperties = CredentialUtils.getServiceProperties(SecretsManagerInstanceManagement.DEFAULT_SERVICE_NAME);

    try {
      System.out.println("createVaultAdmintoken() result:");
      // begin-create_vault_admintoken
      CreateVaultAdmintokenOptions createVaultAdmintokenOptions = new CreateVaultAdmintokenOptions.Builder()
        .instanceId("fe5c5c27-3e44-474a-9484-55892e12d6d1")
        .build();

      Response<Token> response = secretsManagerInstanceManagementService.createVaultAdmintoken(createVaultAdmintokenOptions).execute();
      Token token = response.getResult();

      System.out.println(token);
      // end-create_vault_admintoken
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getInstance() result:");
      // begin-get_instance
      GetInstanceOptions getInstanceOptions = new GetInstanceOptions.Builder()
        .instanceId("fe5c5c27-3e44-474a-9484-55892e12d6d1")
        .build();

      Response<Instance> response = secretsManagerInstanceManagementService.getInstance(getInstanceOptions).execute();
      Instance instance = response.getResult();

      System.out.println(instance);
      // end-get_instance
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("listInstanceDestinations() result:");
      // begin-list_instance_destinations
      ListInstanceDestinationsOptions listInstanceDestinationsOptions = new ListInstanceDestinationsOptions.Builder()
        .instanceId("fe5c5c27-3e44-474a-9484-55892e12d6d1")
        .build();

      Response<DestinationCollection> response = secretsManagerInstanceManagementService.listInstanceDestinations(listInstanceDestinationsOptions).execute();
      DestinationCollection destinationCollection = response.getResult();

      System.out.println(destinationCollection);
      // end-list_instance_destinations
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("createInstanceDestination() result:");
      // begin-create_instance_destination
      CreateDestinationRequestIbmCloudDatabaseDestinationPrototype createDestinationRequestModel = new CreateDestinationRequestIbmCloudDatabaseDestinationPrototype.Builder()
        .name("my-postgres")
        .type("ibm_cloud_database")
        .description("Production PostgreSQL database")
        .crn("crn:v1:bluemix:public:databases-for-postgresql:us-south:a/e91c8f42b3d74e1a9c2f05d8b67a3e10:3f8b1c7a-9d42-4e6f-b8a5-2c1d9e7f4b83::")
        .build();
      CreateInstanceDestinationOptions createInstanceDestinationOptions = new CreateInstanceDestinationOptions.Builder()
        .instanceId("fe5c5c27-3e44-474a-9484-55892e12d6d1")
        .destinationPrototype(createDestinationRequestModel)
        .build();

      Response<IbmCloudDatabaseDestination> response = secretsManagerInstanceManagementService.createInstanceDestination(createInstanceDestinationOptions).execute();
      IbmCloudDatabaseDestination ibmCloudDatabaseDestination = response.getResult();

      System.out.println(ibmCloudDatabaseDestination);
      // end-create_instance_destination
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getInstanceDestination() result:");
      // begin-get_instance_destination
      GetInstanceDestinationOptions getInstanceDestinationOptions = new GetInstanceDestinationOptions.Builder()
        .instanceId("fe5c5c27-3e44-474a-9484-55892e12d6d1")
        .destinationId("b2c3d4e5-f6a7-8901-bcde-f12345678901")
        .build();

      Response<IbmCloudDatabaseDestination> response = secretsManagerInstanceManagementService.getInstanceDestination(getInstanceDestinationOptions).execute();
      IbmCloudDatabaseDestination ibmCloudDatabaseDestination = response.getResult();

      System.out.println(ibmCloudDatabaseDestination);
      // end-get_instance_destination
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("updateInstanceDestination() result:");
      // begin-update_instance_destination
      DestinationPatch destinationPatchModel = new DestinationPatch.Builder()
        .name("my-postgres-updated")
        .description("Production PostgreSQL database")
        .build();
      Map<String, Object> destinationPatchModelAsPatch = destinationPatchModel.asPatch();
      UpdateInstanceDestinationOptions updateInstanceDestinationOptions = new UpdateInstanceDestinationOptions.Builder()
        .instanceId("fe5c5c27-3e44-474a-9484-55892e12d6d1")
        .destinationId("b2c3d4e5-f6a7-8901-bcde-f12345678901")
        .destinationPatch(destinationPatchModelAsPatch)
        .build();

      Response<IbmCloudDatabaseDestination> response = secretsManagerInstanceManagementService.updateInstanceDestination(updateInstanceDestinationOptions).execute();
      IbmCloudDatabaseDestination ibmCloudDatabaseDestination = response.getResult();

      System.out.println(ibmCloudDatabaseDestination);
      // end-update_instance_destination
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("listInstanceHsmDestinations() result:");
      // begin-list_instance_hsm_destinations
      ListInstanceHsmDestinationsOptions listInstanceHsmDestinationsOptions = new ListInstanceHsmDestinationsOptions.Builder()
        .instanceId("fe5c5c27-3e44-474a-9484-55892e12d6d1")
        .build();

      Response<HSMDestinationCollection> response = secretsManagerInstanceManagementService.listInstanceHsmDestinations(listInstanceHsmDestinationsOptions).execute();
      HSMDestinationCollection hsmDestinationCollection = response.getResult();

      System.out.println(hsmDestinationCollection);
      // end-list_instance_hsm_destinations
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("createInstanceHsmDestination() result:");
      // begin-create_instance_hsm_destination
      CreateInstanceHsmDestinationOptions createInstanceHsmDestinationOptions = new CreateInstanceHsmDestinationOptions.Builder()
        .instanceId("fe5c5c27-3e44-474a-9484-55892e12d6d1")
        .name("prod-hsm-destination")
        .vendor("thales_luna")
        .description("Primary Thales Luna destination")
        .build();

      Response<HSMDestination> response = secretsManagerInstanceManagementService.createInstanceHsmDestination(createInstanceHsmDestinationOptions).execute();
      HSMDestination hsmDestination = response.getResult();

      System.out.println(hsmDestination);
      // end-create_instance_hsm_destination
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getInstanceHsmDestination() result:");
      // begin-get_instance_hsm_destination
      GetInstanceHsmDestinationOptions getInstanceHsmDestinationOptions = new GetInstanceHsmDestinationOptions.Builder()
        .instanceId("fe5c5c27-3e44-474a-9484-55892e12d6d1")
        .destinationId("b2c3d4e5-f6a7-8901-bcde-f12345678901")
        .build();

      Response<HSMDestination> response = secretsManagerInstanceManagementService.getInstanceHsmDestination(getInstanceHsmDestinationOptions).execute();
      HSMDestination hsmDestination = response.getResult();

      System.out.println(hsmDestination);
      // end-get_instance_hsm_destination
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("updateInstanceHsmDestination() result:");
      // begin-update_instance_hsm_destination
      HSMDestinationPatch hsmDestinationPatchModel = new HSMDestinationPatch.Builder()
        .name("my-hsm-destination")
        .build();
      Map<String, Object> hsmDestinationPatchModelAsPatch = hsmDestinationPatchModel.asPatch();
      UpdateInstanceHsmDestinationOptions updateInstanceHsmDestinationOptions = new UpdateInstanceHsmDestinationOptions.Builder()
        .instanceId("fe5c5c27-3e44-474a-9484-55892e12d6d1")
        .destinationId("b2c3d4e5-f6a7-8901-bcde-f12345678901")
        .hsmDestinationPatch(hsmDestinationPatchModelAsPatch)
        .build();

      Response<HSMDestination> response = secretsManagerInstanceManagementService.updateInstanceHsmDestination(updateInstanceHsmDestinationOptions).execute();
      HSMDestination hsmDestination = response.getResult();

      System.out.println(hsmDestination);
      // end-update_instance_hsm_destination
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getHsmDestinationHealthSnapshot() result:");
      // begin-get_hsm_destination_health_snapshot
      GetHsmDestinationHealthSnapshotOptions getHsmDestinationHealthSnapshotOptions = new GetHsmDestinationHealthSnapshotOptions.Builder()
        .instanceId("fe5c5c27-3e44-474a-9484-55892e12d6d1")
        .destinationId("b2c3d4e5-f6a7-8901-bcde-f12345678901")
        .build();

      Response<DestinationHealthSnapshot> response = secretsManagerInstanceManagementService.getHsmDestinationHealthSnapshot(getHsmDestinationHealthSnapshotOptions).execute();
      DestinationHealthSnapshot destinationHealthSnapshot = response.getResult();

      System.out.println(destinationHealthSnapshot);
      // end-get_hsm_destination_health_snapshot
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("runHsmDestinationHealthCheck() result:");
      // begin-run_hsm_destination_health_check
      RunHsmDestinationHealthCheckOptions runHsmDestinationHealthCheckOptions = new RunHsmDestinationHealthCheckOptions.Builder()
        .instanceId("fe5c5c27-3e44-474a-9484-55892e12d6d1")
        .destinationId("b2c3d4e5-f6a7-8901-bcde-f12345678901")
        .build();

      Response<AsyncHealthCheckAckResponse> response = secretsManagerInstanceManagementService.runHsmDestinationHealthCheck(runHsmDestinationHealthCheckOptions).execute();
      AsyncHealthCheckAckResponse asyncHealthCheckAckResponse = response.getResult();

      System.out.println(asyncHealthCheckAckResponse);
      // end-run_hsm_destination_health_check
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("applyHsmDestination() result:");
      // begin-apply_hsm_destination
      ApplyHsmDestinationOptions applyHsmDestinationOptions = new ApplyHsmDestinationOptions.Builder()
        .instanceId("fe5c5c27-3e44-474a-9484-55892e12d6d1")
        .destinationId("b2c3d4e5-f6a7-8901-bcde-f12345678901")
        .build();

      Response<AsyncHealthAckResponse> response = secretsManagerInstanceManagementService.applyHsmDestination(applyHsmDestinationOptions).execute();
      AsyncHealthAckResponse asyncHealthAckResponse = response.getResult();

      System.out.println(asyncHealthAckResponse);
      // end-apply_hsm_destination
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("listInstanceHsmDestinationHaGroups() result:");
      // begin-list_instance_hsm_destination_ha_groups
      ListInstanceHsmDestinationHaGroupsOptions listInstanceHsmDestinationHaGroupsOptions = new ListInstanceHsmDestinationHaGroupsOptions.Builder()
        .instanceId("fe5c5c27-3e44-474a-9484-55892e12d6d1")
        .destinationId("b2c3d4e5-f6a7-8901-bcde-f12345678901")
        .build();

      Response<HSMHAGroupCollection> response = secretsManagerInstanceManagementService.listInstanceHsmDestinationHaGroups(listInstanceHsmDestinationHaGroupsOptions).execute();
      HSMHAGroupCollection hsmhaGroupCollection = response.getResult();

      System.out.println(hsmhaGroupCollection);
      // end-list_instance_hsm_destination_ha_groups
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("createInstanceHsmDestinationHaGroup() result:");
      // begin-create_instance_hsm_destination_ha_group
      CreateInstanceHsmDestinationHaGroupOptions createInstanceHsmDestinationHaGroupOptions = new CreateInstanceHsmDestinationHaGroupOptions.Builder()
        .instanceId("fe5c5c27-3e44-474a-9484-55892e12d6d1")
        .destinationId("b2c3d4e5-f6a7-8901-bcde-f12345678901")
        .name("production-ha-group")
        .groupLabel("prod_ha_group")
        .groupSerial("11323465009866")
        .memberSerials(java.util.Arrays.asList("123456", "123457"))
        .description("Primary HA Group for prod")
        .build();

      Response<HSMHAGroup> response = secretsManagerInstanceManagementService.createInstanceHsmDestinationHaGroup(createInstanceHsmDestinationHaGroupOptions).execute();
      HSMHAGroup hsmhaGroup = response.getResult();

      System.out.println(hsmhaGroup);
      // end-create_instance_hsm_destination_ha_group
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getInstanceHsmDestinationHaGroup() result:");
      // begin-get_instance_hsm_destination_ha_group
      GetInstanceHsmDestinationHaGroupOptions getInstanceHsmDestinationHaGroupOptions = new GetInstanceHsmDestinationHaGroupOptions.Builder()
        .instanceId("fe5c5c27-3e44-474a-9484-55892e12d6d1")
        .destinationId("b2c3d4e5-f6a7-8901-bcde-f12345678901")
        .haGroupId("ee52ebb6-1728-4580-8ede-13f6504e3ae0")
        .build();

      Response<HSMHAGroup> response = secretsManagerInstanceManagementService.getInstanceHsmDestinationHaGroup(getInstanceHsmDestinationHaGroupOptions).execute();
      HSMHAGroup hsmhaGroup = response.getResult();

      System.out.println(hsmhaGroup);
      // end-get_instance_hsm_destination_ha_group
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("updateInstanceHsmDestinationHaGroup() result:");
      // begin-update_instance_hsm_destination_ha_group
      HSMHAGroupPatch hsmhaGroupPatchModel = new HSMHAGroupPatch.Builder()
        .name("dr-ha-group")
        .build();
      Map<String, Object> hsmhaGroupPatchModelAsPatch = hsmhaGroupPatchModel.asPatch();
      UpdateInstanceHsmDestinationHaGroupOptions updateInstanceHsmDestinationHaGroupOptions = new UpdateInstanceHsmDestinationHaGroupOptions.Builder()
        .instanceId("fe5c5c27-3e44-474a-9484-55892e12d6d1")
        .destinationId("b2c3d4e5-f6a7-8901-bcde-f12345678901")
        .haGroupId("ee52ebb6-1728-4580-8ede-13f6504e3ae0")
        .hsmhaGroupPatch(hsmhaGroupPatchModelAsPatch)
        .build();

      Response<HSMHAGroup> response = secretsManagerInstanceManagementService.updateInstanceHsmDestinationHaGroup(updateInstanceHsmDestinationHaGroupOptions).execute();
      HSMHAGroup hsmhaGroup = response.getResult();

      System.out.println(hsmhaGroup);
      // end-update_instance_hsm_destination_ha_group
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("listInstanceHsmDestinationPaths() result:");
      // begin-list_instance_hsm_destination_paths
      ListInstanceHsmDestinationPathsOptions listInstanceHsmDestinationPathsOptions = new ListInstanceHsmDestinationPathsOptions.Builder()
        .instanceId("fe5c5c27-3e44-474a-9484-55892e12d6d1")
        .destinationId("b2c3d4e5-f6a7-8901-bcde-f12345678901")
        .build();

      Response<PathCollection> response = secretsManagerInstanceManagementService.listInstanceHsmDestinationPaths(listInstanceHsmDestinationPathsOptions).execute();
      PathCollection pathCollection = response.getResult();

      System.out.println(pathCollection);
      // end-list_instance_hsm_destination_paths
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("createInstanceHsmDestinationPath() result:");
      // begin-create_instance_hsm_destination_path
      CreateInstanceHsmDestinationPathOptions createInstanceHsmDestinationPathOptions = new CreateInstanceHsmDestinationPathOptions.Builder()
        .instanceId("fe5c5c27-3e44-474a-9484-55892e12d6d1")
        .destinationId("b2c3d4e5-f6a7-8901-bcde-f12345678901")
        .name("hsm-node-1")
        .crn("crn:v1:bluemix:public:is:eu-fr2:a/customer123::private-path-service-gateway:hsm1")
        .build();

      Response<Path> response = secretsManagerInstanceManagementService.createInstanceHsmDestinationPath(createInstanceHsmDestinationPathOptions).execute();
      Path path = response.getResult();

      System.out.println(path);
      // end-create_instance_hsm_destination_path
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getInstanceHsmDestinationPath() result:");
      // begin-get_instance_hsm_destination_path
      GetInstanceHsmDestinationPathOptions getInstanceHsmDestinationPathOptions = new GetInstanceHsmDestinationPathOptions.Builder()
        .instanceId("fe5c5c27-3e44-474a-9484-55892e12d6d1")
        .destinationId("b2c3d4e5-f6a7-8901-bcde-f12345678901")
        .pathId("fa3d1234-0000-0000-0000-000000000001")
        .build();

      Response<Path> response = secretsManagerInstanceManagementService.getInstanceHsmDestinationPath(getInstanceHsmDestinationPathOptions).execute();
      Path path = response.getResult();

      System.out.println(path);
      // end-get_instance_hsm_destination_path
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("updateInstanceHsmDestinationPath() result:");
      // begin-update_instance_hsm_destination_path
      PathPatch pathPatchModel = new PathPatch.Builder()
        .name("hsm-node-1-renamed")
        .build();
      Map<String, Object> pathPatchModelAsPatch = pathPatchModel.asPatch();
      UpdateInstanceHsmDestinationPathOptions updateInstanceHsmDestinationPathOptions = new UpdateInstanceHsmDestinationPathOptions.Builder()
        .instanceId("fe5c5c27-3e44-474a-9484-55892e12d6d1")
        .destinationId("b2c3d4e5-f6a7-8901-bcde-f12345678901")
        .pathId("fa3d1234-0000-0000-0000-000000000001")
        .pathPatch(pathPatchModelAsPatch)
        .build();

      Response<Path> response = secretsManagerInstanceManagementService.updateInstanceHsmDestinationPath(updateInstanceHsmDestinationPathOptions).execute();
      Path path = response.getResult();

      System.out.println(path);
      // end-update_instance_hsm_destination_path
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("createPathBuild() result:");
      // begin-create_path_build
      CreatePathBuildOptions createPathBuildOptions = new CreatePathBuildOptions.Builder()
        .instanceId("fe5c5c27-3e44-474a-9484-55892e12d6d1")
        .destinationId("b2c3d4e5-f6a7-8901-bcde-f12345678901")
        .pathId("fa3d1234-0000-0000-0000-000000000001")
        .build();

      Response<VpeProvisioningResponse> response = secretsManagerInstanceManagementService.createPathBuild(createPathBuildOptions).execute();
      VpeProvisioningResponse vpeProvisioningResponse = response.getResult();

      System.out.println(vpeProvisioningResponse);
      // end-create_path_build
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getPathVpeStatus() result:");
      // begin-get_path_vpe_status
      GetPathVpeStatusOptions getPathVpeStatusOptions = new GetPathVpeStatusOptions.Builder()
        .instanceId("fe5c5c27-3e44-474a-9484-55892e12d6d1")
        .destinationId("b2c3d4e5-f6a7-8901-bcde-f12345678901")
        .pathId("fa3d1234-0000-0000-0000-000000000001")
        .build();

      Response<VpeStatusResult> response = secretsManagerInstanceManagementService.getPathVpeStatus(getPathVpeStatusOptions).execute();
      VpeStatusResult vpeStatusResult = response.getResult();

      System.out.println(vpeStatusResult);
      // end-get_path_vpe_status
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("resetHsmDestinationPath() result:");
      // begin-reset_hsm_destination_path
      ResetHsmDestinationPathOptions resetHsmDestinationPathOptions = new ResetHsmDestinationPathOptions.Builder()
        .instanceId("fe5c5c27-3e44-474a-9484-55892e12d6d1")
        .destinationId("b2c3d4e5-f6a7-8901-bcde-f12345678901")
        .pathId("fa3d1234-0000-0000-0000-000000000001")
        .build();

      Response<HSMPathReset> response = secretsManagerInstanceManagementService.resetHsmDestinationPath(resetHsmDestinationPathOptions).execute();
      HSMPathReset hsmPathReset = response.getResult();

      System.out.println(hsmPathReset);
      // end-reset_hsm_destination_path
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("listInstanceHsmDestinationPathServerCas() result:");
      // begin-list_instance_hsm_destination_path_server_cas
      ListInstanceHsmDestinationPathServerCasOptions listInstanceHsmDestinationPathServerCasOptions = new ListInstanceHsmDestinationPathServerCasOptions.Builder()
        .instanceId("fe5c5c27-3e44-474a-9484-55892e12d6d1")
        .destinationId("b2c3d4e5-f6a7-8901-bcde-f12345678901")
        .pathId("fa3d1234-0000-0000-0000-000000000001")
        .build();

      Response<ServerCaCollection> response = secretsManagerInstanceManagementService.listInstanceHsmDestinationPathServerCas(listInstanceHsmDestinationPathServerCasOptions).execute();
      ServerCaCollection serverCaCollection = response.getResult();

      System.out.println(serverCaCollection);
      // end-list_instance_hsm_destination_path_server_cas
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("createInstanceHsmDestinationPathServerCa() result:");
      // begin-create_instance_hsm_destination_path_server_ca
      CreateInstanceHsmDestinationPathServerCaOptions createInstanceHsmDestinationPathServerCaOptions = new CreateInstanceHsmDestinationPathServerCaOptions.Builder()
        .instanceId("fe5c5c27-3e44-474a-9484-55892e12d6d1")
        .destinationId("b2c3d4e5-f6a7-8901-bcde-f12345678901")
        .pathId("fa3d1234-0000-0000-0000-000000000001")
        .name("HSM1_Server_CA")
        .certificate("-----BEGIN CERTIFICATE-----\nMIIDXTCCAkWg...\n-----END CERTIFICATE-----")
        .build();

      Response<ServerCa> response = secretsManagerInstanceManagementService.createInstanceHsmDestinationPathServerCa(createInstanceHsmDestinationPathServerCaOptions).execute();
      ServerCa serverCa = response.getResult();

      System.out.println(serverCa);
      // end-create_instance_hsm_destination_path_server_ca
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getInstanceHsmDestinationPathServerCa() result:");
      // begin-get_instance_hsm_destination_path_server_ca
      GetInstanceHsmDestinationPathServerCaOptions getInstanceHsmDestinationPathServerCaOptions = new GetInstanceHsmDestinationPathServerCaOptions.Builder()
        .instanceId("fe5c5c27-3e44-474a-9484-55892e12d6d1")
        .destinationId("b2c3d4e5-f6a7-8901-bcde-f12345678901")
        .pathId("fa3d1234-0000-0000-0000-000000000001")
        .serverCaId("5d1f3c2e-8a4b-4c6d-9e7f-0a1b2c3d4e5f")
        .build();

      Response<ServerCa> response = secretsManagerInstanceManagementService.getInstanceHsmDestinationPathServerCa(getInstanceHsmDestinationPathServerCaOptions).execute();
      ServerCa serverCa = response.getResult();

      System.out.println(serverCa);
      // end-get_instance_hsm_destination_path_server_ca
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("updateInstanceHsmDestinationPathServerCa() result:");
      // begin-update_instance_hsm_destination_path_server_ca
      ServerCaPatch serverCaPatchModel = new ServerCaPatch.Builder()
        .name("HSM1_Server_CA_renamed")
        .build();
      Map<String, Object> serverCaPatchModelAsPatch = serverCaPatchModel.asPatch();
      UpdateInstanceHsmDestinationPathServerCaOptions updateInstanceHsmDestinationPathServerCaOptions = new UpdateInstanceHsmDestinationPathServerCaOptions.Builder()
        .instanceId("fe5c5c27-3e44-474a-9484-55892e12d6d1")
        .destinationId("b2c3d4e5-f6a7-8901-bcde-f12345678901")
        .pathId("fa3d1234-0000-0000-0000-000000000001")
        .serverCaId("5d1f3c2e-8a4b-4c6d-9e7f-0a1b2c3d4e5f")
        .serverCaPatch(serverCaPatchModelAsPatch)
        .build();

      Response<ServerCa> response = secretsManagerInstanceManagementService.updateInstanceHsmDestinationPathServerCa(updateInstanceHsmDestinationPathServerCaOptions).execute();
      ServerCa serverCa = response.getResult();

      System.out.println(serverCa);
      // end-update_instance_hsm_destination_path_server_ca
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("listInstanceHsmDestinationClientCertificates() result:");
      // begin-list_instance_hsm_destination_client_certificates
      ListInstanceHsmDestinationClientCertificatesOptions listInstanceHsmDestinationClientCertificatesOptions = new ListInstanceHsmDestinationClientCertificatesOptions.Builder()
        .instanceId("fe5c5c27-3e44-474a-9484-55892e12d6d1")
        .destinationId("b2c3d4e5-f6a7-8901-bcde-f12345678901")
        .build();

      Response<ClientCertificateCollection> response = secretsManagerInstanceManagementService.listInstanceHsmDestinationClientCertificates(listInstanceHsmDestinationClientCertificatesOptions).execute();
      ClientCertificateCollection clientCertificateCollection = response.getResult();

      System.out.println(clientCertificateCollection);
      // end-list_instance_hsm_destination_client_certificates
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("createInstanceHsmDestinationClientCertificate() result:");
      // begin-create_instance_hsm_destination_client_certificate
      CreateInstanceHsmDestinationClientCertificateOptions createInstanceHsmDestinationClientCertificateOptions = new CreateInstanceHsmDestinationClientCertificateOptions.Builder()
        .instanceId("fe5c5c27-3e44-474a-9484-55892e12d6d1")
        .destinationId("b2c3d4e5-f6a7-8901-bcde-f12345678901")
        .name("hsm-client-cert-prod")
        .build();

      Response<ClientCertificate> response = secretsManagerInstanceManagementService.createInstanceHsmDestinationClientCertificate(createInstanceHsmDestinationClientCertificateOptions).execute();
      ClientCertificate clientCertificate = response.getResult();

      System.out.println(clientCertificate);
      // end-create_instance_hsm_destination_client_certificate
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getInstanceHsmDestinationClientCertificate() result:");
      // begin-get_instance_hsm_destination_client_certificate
      GetInstanceHsmDestinationClientCertificateOptions getInstanceHsmDestinationClientCertificateOptions = new GetInstanceHsmDestinationClientCertificateOptions.Builder()
        .instanceId("fe5c5c27-3e44-474a-9484-55892e12d6d1")
        .destinationId("b2c3d4e5-f6a7-8901-bcde-f12345678901")
        .certId("7c9e6679-7425-40de-944b-e07fc1f90ae7")
        .build();

      Response<ClientCertificate> response = secretsManagerInstanceManagementService.getInstanceHsmDestinationClientCertificate(getInstanceHsmDestinationClientCertificateOptions).execute();
      ClientCertificate clientCertificate = response.getResult();

      System.out.println(clientCertificate);
      // end-get_instance_hsm_destination_client_certificate
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("updateInstanceHsmDestinationClientCertificate() result:");
      // begin-update_instance_hsm_destination_client_certificate
      ClientCertificatePatch clientCertificatePatchModel = new ClientCertificatePatch.Builder()
        .name("hsm-client-cert-renamed")
        .build();
      Map<String, Object> clientCertificatePatchModelAsPatch = clientCertificatePatchModel.asPatch();
      UpdateInstanceHsmDestinationClientCertificateOptions updateInstanceHsmDestinationClientCertificateOptions = new UpdateInstanceHsmDestinationClientCertificateOptions.Builder()
        .instanceId("fe5c5c27-3e44-474a-9484-55892e12d6d1")
        .destinationId("b2c3d4e5-f6a7-8901-bcde-f12345678901")
        .certId("7c9e6679-7425-40de-944b-e07fc1f90ae7")
        .clientCertificatePatch(clientCertificatePatchModelAsPatch)
        .build();

      Response<ClientCertificate> response = secretsManagerInstanceManagementService.updateInstanceHsmDestinationClientCertificate(updateInstanceHsmDestinationClientCertificateOptions).execute();
      ClientCertificate clientCertificate = response.getResult();

      System.out.println(clientCertificate);
      // end-update_instance_hsm_destination_client_certificate
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-delete_vault_admintokens
      DeleteVaultAdmintokensOptions deleteVaultAdmintokensOptions = new DeleteVaultAdmintokensOptions.Builder()
        .instanceId("fe5c5c27-3e44-474a-9484-55892e12d6d1")
        .build();

      Response<Void> response = secretsManagerInstanceManagementService.deleteVaultAdmintokens(deleteVaultAdmintokensOptions).execute();
      // end-delete_vault_admintokens
      System.out.printf("deleteVaultAdmintokens() response status code: %d%n", response.getStatusCode());
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("deleteInstanceDestination() result:");
      // begin-delete_instance_destination
      DeleteInstanceDestinationOptions deleteInstanceDestinationOptions = new DeleteInstanceDestinationOptions.Builder()
        .instanceId("fe5c5c27-3e44-474a-9484-55892e12d6d1")
        .destinationId("b2c3d4e5-f6a7-8901-bcde-f12345678901")
        .build();

      Response<IbmCloudDatabaseDestination> response = secretsManagerInstanceManagementService.deleteInstanceDestination(deleteInstanceDestinationOptions).execute();
      IbmCloudDatabaseDestination ibmCloudDatabaseDestination = response.getResult();

      System.out.println(ibmCloudDatabaseDestination);
      // end-delete_instance_destination
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("deleteInstanceHsmDestination() result:");
      // begin-delete_instance_hsm_destination
      DeleteInstanceHsmDestinationOptions deleteInstanceHsmDestinationOptions = new DeleteInstanceHsmDestinationOptions.Builder()
        .instanceId("fe5c5c27-3e44-474a-9484-55892e12d6d1")
        .destinationId("b2c3d4e5-f6a7-8901-bcde-f12345678901")
        .build();

      Response<AsyncDeleteResponse> response = secretsManagerInstanceManagementService.deleteInstanceHsmDestination(deleteInstanceHsmDestinationOptions).execute();
      AsyncDeleteResponse asyncDeleteResponse = response.getResult();

      System.out.println(asyncDeleteResponse);
      // end-delete_instance_hsm_destination
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-delete_instance_hsm_destination_ha_group
      DeleteInstanceHsmDestinationHaGroupOptions deleteInstanceHsmDestinationHaGroupOptions = new DeleteInstanceHsmDestinationHaGroupOptions.Builder()
        .instanceId("fe5c5c27-3e44-474a-9484-55892e12d6d1")
        .destinationId("b2c3d4e5-f6a7-8901-bcde-f12345678901")
        .haGroupId("ee52ebb6-1728-4580-8ede-13f6504e3ae0")
        .build();

      Response<Void> response = secretsManagerInstanceManagementService.deleteInstanceHsmDestinationHaGroup(deleteInstanceHsmDestinationHaGroupOptions).execute();
      // end-delete_instance_hsm_destination_ha_group
      System.out.printf("deleteInstanceHsmDestinationHaGroup() response status code: %d%n", response.getStatusCode());
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("deleteInstanceHsmDestinationPath() result:");
      // begin-delete_instance_hsm_destination_path
      DeleteInstanceHsmDestinationPathOptions deleteInstanceHsmDestinationPathOptions = new DeleteInstanceHsmDestinationPathOptions.Builder()
        .instanceId("fe5c5c27-3e44-474a-9484-55892e12d6d1")
        .destinationId("b2c3d4e5-f6a7-8901-bcde-f12345678901")
        .pathId("fa3d1234-0000-0000-0000-000000000001")
        .build();

      Response<Path> response = secretsManagerInstanceManagementService.deleteInstanceHsmDestinationPath(deleteInstanceHsmDestinationPathOptions).execute();
      Path path = response.getResult();

      System.out.println(path);
      // end-delete_instance_hsm_destination_path
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-delete_instance_hsm_destination_path_server_ca
      DeleteInstanceHsmDestinationPathServerCaOptions deleteInstanceHsmDestinationPathServerCaOptions = new DeleteInstanceHsmDestinationPathServerCaOptions.Builder()
        .instanceId("fe5c5c27-3e44-474a-9484-55892e12d6d1")
        .destinationId("b2c3d4e5-f6a7-8901-bcde-f12345678901")
        .pathId("fa3d1234-0000-0000-0000-000000000001")
        .serverCaId("5d1f3c2e-8a4b-4c6d-9e7f-0a1b2c3d4e5f")
        .build();

      Response<Void> response = secretsManagerInstanceManagementService.deleteInstanceHsmDestinationPathServerCa(deleteInstanceHsmDestinationPathServerCaOptions).execute();
      // end-delete_instance_hsm_destination_path_server_ca
      System.out.printf("deleteInstanceHsmDestinationPathServerCa() response status code: %d%n", response.getStatusCode());
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-delete_instance_hsm_destination_client_certificate
      DeleteInstanceHsmDestinationClientCertificateOptions deleteInstanceHsmDestinationClientCertificateOptions = new DeleteInstanceHsmDestinationClientCertificateOptions.Builder()
        .instanceId("fe5c5c27-3e44-474a-9484-55892e12d6d1")
        .destinationId("b2c3d4e5-f6a7-8901-bcde-f12345678901")
        .certId("7c9e6679-7425-40de-944b-e07fc1f90ae7")
        .build();

      Response<Void> response = secretsManagerInstanceManagementService.deleteInstanceHsmDestinationClientCertificate(deleteInstanceHsmDestinationClientCertificateOptions).execute();
      // end-delete_instance_hsm_destination_client_certificate
      System.out.printf("deleteInstanceHsmDestinationClientCertificate() response status code: %d%n", response.getStatusCode());
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }
  }
}
