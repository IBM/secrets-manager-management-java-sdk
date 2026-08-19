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
 * IBM OpenAPI SDK Code Generator Version: 3.116.0-df613dbc-20260803-154903
 */

package com.ibm.cloud.secrets_manager_sdk_instance_management.secrets_manager_instance_management.v2;

import com.google.gson.JsonObject;
import com.ibm.cloud.sdk.core.http.RequestBuilder;
import com.ibm.cloud.sdk.core.http.ResponseConverter;
import com.ibm.cloud.sdk.core.http.ServiceCall;
import com.ibm.cloud.sdk.core.security.Authenticator;
import com.ibm.cloud.sdk.core.security.ConfigBasedAuthenticatorFactory;
import com.ibm.cloud.sdk.core.service.BaseService;
import com.ibm.cloud.sdk.core.util.ResponseConverterUtils;
import com.ibm.cloud.secrets_manager_sdk_instance_management.common.SdkCommon;
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
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 * Use the IBM  Cloud® Secrets Manager Instance Management API to manage service instances of the Vault Dedicated plan.
 * - Get service instance details including cluster state, endpoints, and key management service.
 * - Generate a Vault admin token for authenticating to your Vault Dedicated cluster.
 * - Revoke all active Vault admin tokens.
 * - Request payloads must not exceed 1 MB; requests larger than this limit will be rejected with a `413 Payload Too
 * Large` response.
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
   * Create admin token.
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
    pathParamsMap.put("id", createVaultAdmintokenOptions.id());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/instances/{id}/admintokens", pathParamsMap));
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
   * Delete admin tokens.
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
    pathParamsMap.put("id", deleteInstanceAdmintokensOptions.id());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/instances/{id}/admintokens", pathParamsMap));
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
    pathParamsMap.put("id", getInstanceOptions.id());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/instances/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("secrets_manager_instance_management", "v2", "getInstance");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<Instance> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Instance>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List destinations.
   *
   * List all destinations for your Vault Dedicated cluster.
   *
   * @param listInstanceDestinationsOptions the {@link ListInstanceDestinationsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link DestinationCollection}
   */
  public ServiceCall<DestinationCollection> listInstanceDestinations(ListInstanceDestinationsOptions listInstanceDestinationsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(listInstanceDestinationsOptions,
      "listInstanceDestinationsOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("instance_id", listInstanceDestinationsOptions.instanceId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/instances/{instance_id}/destinations", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("secrets_manager_instance_management", "v2", "listInstanceDestinations");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (listInstanceDestinationsOptions.state() != null) {
      builder.query("state", String.valueOf(listInstanceDestinationsOptions.state()));
    }
    ResponseConverter<DestinationCollection> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<DestinationCollection>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Create destination.
   *
   * Create a new destination between your Vault Dedicated cluster and an IBM Cloud service instance.
   *
   * Returns `202 Accepted` with `state: not_started`. Provisioning completes asynchronously — poll `GET
   * /destinations/{id}` until `state` transitions to `succeeded` or `failed`.
   *
   * **Beta**: Only Gen 1 (Classic) IBM Cloud Database service instances are supported. Gen 2 instances are rejected
   * with `422`. IBM Cloud Database service instances with no private endpoints are also rejected with `422`.
   *
   * **Rate Limit**: 10 requests per instance per minute
   * **Quota**: Maximum 20 destinations per instance.
   *
   * @param createInstanceDestinationOptions the {@link CreateInstanceDestinationOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> createInstanceDestination(CreateInstanceDestinationOptions createInstanceDestinationOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createInstanceDestinationOptions,
      "createInstanceDestinationOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("instance_id", createInstanceDestinationOptions.instanceId());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/instances/{instance_id}/destinations", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("secrets_manager_instance_management", "v2", "createInstanceDestination");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    final JsonObject contentJson = new JsonObject();
    if (createInstanceDestinationOptions.name() != null) {
      contentJson.addProperty("name", createInstanceDestinationOptions.name());
    }
    if (createInstanceDestinationOptions.type() != null) {
      contentJson.addProperty("type", createInstanceDestinationOptions.type());
    }
    if (createInstanceDestinationOptions.description() != null) {
      contentJson.addProperty("description", createInstanceDestinationOptions.description());
    }
    if (createInstanceDestinationOptions.crn() != null) {
      contentJson.addProperty("crn", createInstanceDestinationOptions.crn());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get destination details.
   *
   * Retrieve details and current state for a specific destination for your Vault Dedicated cluster.
   *
   * Returns `404` if the destination does not exist. A deleted destination is immediately absent from GET — the
   * `deleting` state is internal only and never returned to callers.
   *
   * @param getInstanceDestinationOptions the {@link GetInstanceDestinationOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> getInstanceDestination(GetInstanceDestinationOptions getInstanceDestinationOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getInstanceDestinationOptions,
      "getInstanceDestinationOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("instance_id", getInstanceDestinationOptions.instanceId());
    pathParamsMap.put("destination_id", getInstanceDestinationOptions.destinationId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/instances/{instance_id}/destinations/{destination_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("secrets_manager_instance_management", "v2", "getInstanceDestination");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update destination.
   *
   * Update mutable metadata fields (`name`, `description`) on a destination for your Vault Dedicated cluster. All other
   * fields are immutable after creation.
   *
   * @param updateInstanceDestinationOptions the {@link UpdateInstanceDestinationOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> updateInstanceDestination(UpdateInstanceDestinationOptions updateInstanceDestinationOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateInstanceDestinationOptions,
      "updateInstanceDestinationOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("instance_id", updateInstanceDestinationOptions.instanceId());
    pathParamsMap.put("destination_id", updateInstanceDestinationOptions.destinationId());
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/instances/{instance_id}/destinations/{destination_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("secrets_manager_instance_management", "v2", "updateInstanceDestination");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithSerializeNulls().toJson(updateInstanceDestinationOptions.requestBody()), "application/merge-patch+json");
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete destination.
   *
   * Delete a destination for your Vault Dedicated cluster. A deleted destination is immediately absent from GET after
   * this call returns 204.
   *
   * A `failed` destination still counts against the per-instance quota until deleted.
   *
   * **Rate Limit**: 10 requests per instance per minute.
   *
   * @param deleteInstanceDestinationOptions the {@link DeleteInstanceDestinationOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteInstanceDestination(DeleteInstanceDestinationOptions deleteInstanceDestinationOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteInstanceDestinationOptions,
      "deleteInstanceDestinationOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("instance_id", deleteInstanceDestinationOptions.instanceId());
    pathParamsMap.put("destination_id", deleteInstanceDestinationOptions.destinationId());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/instances/{instance_id}/destinations/{destination_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("secrets_manager_instance_management", "v2", "deleteInstanceDestination");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

}
