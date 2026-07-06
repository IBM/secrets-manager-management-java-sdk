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
import com.ibm.cloud.secrets_manager_sdk_instance_management.secrets_manager_instance_management.v2.model.CreateVaultAdmintokenOptions;
import com.ibm.cloud.secrets_manager_sdk_instance_management.secrets_manager_instance_management.v2.model.DeleteInstanceAdmintokensOptions;
import com.ibm.cloud.secrets_manager_sdk_instance_management.secrets_manager_instance_management.v2.model.GetInstanceOptions;
import com.ibm.cloud.secrets_manager_sdk_instance_management.secrets_manager_instance_management.v2.model.Instance;
import com.ibm.cloud.secrets_manager_sdk_instance_management.secrets_manager_instance_management.v2.model.Token;
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
        .instanceId("bfc50c2e-d66d-4f37-9ccf-9713f8325b39")
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
        .instanceId("bfc50c2e-d66d-4f37-9ccf-9713f8325b39")
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
      // begin-delete_instance_admintokens
      DeleteInstanceAdmintokensOptions deleteInstanceAdmintokensOptions = new DeleteInstanceAdmintokensOptions.Builder()
        .instanceId("bfc50c2e-d66d-4f37-9ccf-9713f8325b39")
        .build();

      Response<Void> response = secretsManagerInstanceManagementService.deleteInstanceAdmintokens(deleteInstanceAdmintokensOptions).execute();
      // end-delete_instance_admintokens
      System.out.printf("deleteInstanceAdmintokens() response status code: %d%n", response.getStatusCode());
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }
  }
}
