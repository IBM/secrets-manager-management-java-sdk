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

/*
 * IBM OpenAPI SDK Code Generator Version: 3.114.4-9b56d441-20260612-210048
 */

package com.ibm.cloud.secrets_manager_sdk_instance_management.secrets_manager_instance_management.v2;

import com.ibm.cloud.sdk.core.http.RequestBuilder;
import com.ibm.cloud.sdk.core.http.ResponseConverter;
import com.ibm.cloud.sdk.core.http.ServiceCall;
import com.ibm.cloud.sdk.core.security.Authenticator;
import com.ibm.cloud.sdk.core.security.ConfigBasedAuthenticatorFactory;
import com.ibm.cloud.sdk.core.service.BaseService;
import com.ibm.cloud.sdk.core.util.ResponseConverterUtils;
import com.ibm.cloud.secrets_manager_sdk_instance_management.common.SdkCommon;
import com.ibm.cloud.secrets_manager_sdk_instance_management.secrets_manager_instance_management.v2.model.CreateVaultAdmintokenOptions;
import com.ibm.cloud.secrets_manager_sdk_instance_management.secrets_manager_instance_management.v2.model.DeleteInstanceAdmintokensOptions;
import com.ibm.cloud.secrets_manager_sdk_instance_management.secrets_manager_instance_management.v2.model.GetInstanceOptions;
import com.ibm.cloud.secrets_manager_sdk_instance_management.secrets_manager_instance_management.v2.model.Instance;
import com.ibm.cloud.secrets_manager_sdk_instance_management.secrets_manager_instance_management.v2.model.Token;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 * With IBM Cloud® Secrets Manager Instance Management API, you can manage service instances of the Vault Dedicated
 * plan. Use the API for the following operations:
 * - Get service instance details including cluster state, endpoints, and key management service.
 * - Generate a Vault admin token for authenticating to your Vault Dedicated cluster.
 * - Revoke all active Vault admin tokens.
 *
 * API Version: 2.0.0
 * See: https://cloud.ibm.com/docs/secrets-manager
 */
public class SecretsManagerInstanceManagement extends BaseService {

  /**
   * Default service name used when configuring the `SecretsManagerInstanceManagement` client.
   */
  public static final String DEFAULT_SERVICE_NAME = "secrets_manager_instance_management";

  /**
   * Default service endpoint URL.
   */
  public static final String DEFAULT_SERVICE_URL = "https://us-south.secrets-manager.cloud.ibm.com";

  /**
   * The parameterized service endpoint URL.
   */
  public static final String PARAMETERIZED_SERVICE_URL = "https://{region}.secrets-manager.cloud.ibm.com";

  private static final Map<String, String> defaultUrlVariables = createDefaultUrlVariables();

  private static Map<String, String> createDefaultUrlVariables() {
    Map<String, String> map = new HashMap<>();
    map.put("region", "us-south");
    return map;
  }

 /**
   * Class method which constructs an instance of the `SecretsManagerInstanceManagement` client.
   * The default service name is used to configure the client instance.
   *
   * @return an instance of the `SecretsManagerInstanceManagement` client using external configuration
   */
  public static SecretsManagerInstanceManagement newInstance() {
    return newInstance(DEFAULT_SERVICE_NAME);
  }

  /**
   * Class method which constructs an instance of the `SecretsManagerInstanceManagement` client.
   * The specified service name is used to configure the client instance.
   *
   * @param serviceName the service name to be used when configuring the client instance
   * @return an instance of the `SecretsManagerInstanceManagement` client using external configuration
   */
  public static SecretsManagerInstanceManagement newInstance(String serviceName) {
    Authenticator authenticator = ConfigBasedAuthenticatorFactory.getAuthenticator(serviceName);
    SecretsManagerInstanceManagement service = new SecretsManagerInstanceManagement(serviceName, authenticator);
    service.configureService(serviceName);
    return service;
  }

  /**
   * Constructs an instance of the `SecretsManagerInstanceManagement` client.
   * The specified service name and authenticator are used to configure the client instance.
   *
   * @param serviceName the service name to be used when configuring the client instance
   * @param authenticator the {@link Authenticator} instance to be configured for this client
   */
  public SecretsManagerInstanceManagement(String serviceName, Authenticator authenticator) {
    super(serviceName, authenticator);
    setServiceUrl(DEFAULT_SERVICE_URL);
  }

  /**
   * Constructs a service URL by formatting the parameterized service URL.
   *
   * The parameterized service URL is:
   * 'https://{region}.secrets-manager.cloud.ibm.com'
   *
   * The default variable values are:
   * - 'region': 'us-south'
   *
   * @param providedUrlVariables map from variable names to desired values.
   *   If a variable is not provided in this map,
   *   the default variable value will be used instead.
   * @return the formatted URL with all variable placeholders replaced by values.
   */
  public static String constructServiceUrl(Map<String, String> providedUrlVariables) {
    return BaseService.constructServiceUrl(PARAMETERIZED_SERVICE_URL, defaultUrlVariables, providedUrlVariables);
  }

  /**
   * Generate admin token.
   *
   * Generate a Vault admin token for authenticating to your Vault Dedicated cluster. The token is valid for 1 hour and
   * grants administrative privileges. Use only for initial setup and cluster management, then revoke immediately.
   *
   * @param createVaultAdmintokenOptions the {@link CreateVaultAdmintokenOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Token}
   */
  public ServiceCall<Token> createVaultAdmintoken(CreateVaultAdmintokenOptions createVaultAdmintokenOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createVaultAdmintokenOptions,
      "createVaultAdmintokenOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("instance_id", createVaultAdmintokenOptions.instanceId());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/api/v2/instances/{instance_id}/admintokens", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("secrets_manager_instance_management", "v2", "createVaultAdmintoken");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<Token> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Token>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Revoke admin tokens.
   *
   * Revoke all active Vault admin tokens. This immediately invalidates all existing admin tokens.
   *
   * @param deleteInstanceAdmintokensOptions the {@link DeleteInstanceAdmintokensOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteInstanceAdmintokens(DeleteInstanceAdmintokensOptions deleteInstanceAdmintokensOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteInstanceAdmintokensOptions,
      "deleteInstanceAdmintokensOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("instance_id", deleteInstanceAdmintokensOptions.instanceId());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/api/v2/instances/{instance_id}/admintokens", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("secrets_manager_instance_management", "v2", "deleteInstanceAdmintokens");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get instance details.
   *
   * Get service instance details including cluster state, endpoints, and key management service.
   *
   * @param getInstanceOptions the {@link GetInstanceOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Instance}
   */
  public ServiceCall<Instance> getInstance(GetInstanceOptions getInstanceOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getInstanceOptions,
      "getInstanceOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("instance_id", getInstanceOptions.instanceId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/api/v2/instances/{instance_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("secrets_manager_instance_management", "v2", "getInstance");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<Instance> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Instance>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

}
