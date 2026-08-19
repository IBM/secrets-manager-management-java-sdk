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
import com.ibm.cloud.secrets_manager_sdk_instance_management.secrets_manager_instance_management.v2.model.CreateInstanceDestinationOptions;
import com.ibm.cloud.secrets_manager_sdk_instance_management.secrets_manager_instance_management.v2.model.CreateVaultAdmintokenOptions;
import com.ibm.cloud.secrets_manager_sdk_instance_management.secrets_manager_instance_management.v2.model.DeleteInstanceAdmintokensOptions;
import com.ibm.cloud.secrets_manager_sdk_instance_management.secrets_manager_instance_management.v2.model.DeleteInstanceDestinationOptions;
import com.ibm.cloud.secrets_manager_sdk_instance_management.secrets_manager_instance_management.v2.model.DestinationCollection;
import com.ibm.cloud.secrets_manager_sdk_instance_management.secrets_manager_instance_management.v2.model.GetInstanceDestinationOptions;
import com.ibm.cloud.secrets_manager_sdk_instance_management.secrets_manager_instance_management.v2.model.GetInstanceOptions;
import com.ibm.cloud.secrets_manager_sdk_instance_management.secrets_manager_instance_management.v2.model.Instance;
import com.ibm.cloud.secrets_manager_sdk_instance_management.secrets_manager_instance_management.v2.model.ListInstanceDestinationsOptions;
import com.ibm.cloud.secrets_manager_sdk_instance_management.secrets_manager_instance_management.v2.model.Token;
import com.ibm.cloud.secrets_manager_sdk_instance_management.secrets_manager_instance_management.v2.model.UpdateInstanceDestinationOptions;
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
        .id("bfc50c2e-d66d-4f37-9ccf-9713f8325b39")
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
        .id("bfc50c2e-d66d-4f37-9ccf-9713f8325b39")
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
        .instanceId("bfc50c2e-d66d-4f37-9ccf-9713f8325b39")
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
      // begin-create_instance_destination
      CreateInstanceDestinationOptions createInstanceDestinationOptions = new CreateInstanceDestinationOptions.Builder()
        .instanceId("bfc50c2e-d66d-4f37-9ccf-9713f8325b39")
        .name("my-postgres")
        .type("ibm_cloud_database")
        .description("Production PostgreSQL database")
        .crn("crn:v1:bluemix:public:databases-for-postgresql:us-south:a/e91c8f42b3d74e1a9c2f05d8b67a3e10:3f8b1c7a-9d42-4e6f-b8a5-2c1d9e7f4b83::")
        .build();

      Response<Void> response = secretsManagerInstanceManagementService.createInstanceDestination(createInstanceDestinationOptions).execute();
      // end-create_instance_destination
      System.out.printf("createInstanceDestination() response status code: %d%n", response.getStatusCode());
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-get_instance_destination
      GetInstanceDestinationOptions getInstanceDestinationOptions = new GetInstanceDestinationOptions.Builder()
        .instanceId("bfc50c2e-d66d-4f37-9ccf-9713f8325b39")
        .destinationId("b2c3d4e5-f6a7-8901-bcde-f12345678901")
        .build();

      Response<Void> response = secretsManagerInstanceManagementService.getInstanceDestination(getInstanceDestinationOptions).execute();
      // end-get_instance_destination
      System.out.printf("getInstanceDestination() response status code: %d%n", response.getStatusCode());
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-update_instance_destination
      UpdateInstanceDestinationOptions updateInstanceDestinationOptions = new UpdateInstanceDestinationOptions.Builder()
        .instanceId("bfc50c2e-d66d-4f37-9ccf-9713f8325b39")
        .destinationId("b2c3d4e5-f6a7-8901-bcde-f12345678901")
        .requestBody(new java.util.HashMap<String, Object>())
        .build();

      Response<Void> response = secretsManagerInstanceManagementService.updateInstanceDestination(updateInstanceDestinationOptions).execute();
      // end-update_instance_destination
      System.out.printf("updateInstanceDestination() response status code: %d%n", response.getStatusCode());
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-delete_instance_admintokens
      DeleteInstanceAdmintokensOptions deleteInstanceAdmintokensOptions = new DeleteInstanceAdmintokensOptions.Builder()
        .id("bfc50c2e-d66d-4f37-9ccf-9713f8325b39")
        .build();

      Response<Void> response = secretsManagerInstanceManagementService.deleteInstanceAdmintokens(deleteInstanceAdmintokensOptions).execute();
      // end-delete_instance_admintokens
      System.out.printf("deleteInstanceAdmintokens() response status code: %d%n", response.getStatusCode());
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-delete_instance_destination
      DeleteInstanceDestinationOptions deleteInstanceDestinationOptions = new DeleteInstanceDestinationOptions.Builder()
        .instanceId("bfc50c2e-d66d-4f37-9ccf-9713f8325b39")
        .destinationId("b2c3d4e5-f6a7-8901-bcde-f12345678901")
        .build();

      Response<Void> response = secretsManagerInstanceManagementService.deleteInstanceDestination(deleteInstanceDestinationOptions).execute();
      // end-delete_instance_destination
      System.out.printf("deleteInstanceDestination() response status code: %d%n", response.getStatusCode());
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }
  }
}
