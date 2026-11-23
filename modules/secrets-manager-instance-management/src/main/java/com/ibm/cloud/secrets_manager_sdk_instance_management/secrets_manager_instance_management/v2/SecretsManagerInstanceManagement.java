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
 * IBM OpenAPI SDK Code Generator Version: 3.117.3-3e91ab11-20261028-182643
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
import com.ibm.cloud.secrets_manager_sdk_instance_management.secrets_manager_instance_management.v2.model.ApplyHsmDestinationOptions;
import com.ibm.cloud.secrets_manager_sdk_instance_management.secrets_manager_instance_management.v2.model.AsyncDeleteResponse;
import com.ibm.cloud.secrets_manager_sdk_instance_management.secrets_manager_instance_management.v2.model.AsyncHealthAckResponse;
import com.ibm.cloud.secrets_manager_sdk_instance_management.secrets_manager_instance_management.v2.model.AsyncHealthCheckAckResponse;
import com.ibm.cloud.secrets_manager_sdk_instance_management.secrets_manager_instance_management.v2.model.ClientCertificate;
import com.ibm.cloud.secrets_manager_sdk_instance_management.secrets_manager_instance_management.v2.model.ClientCertificateCollection;
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
import com.ibm.cloud.secrets_manager_sdk_instance_management.secrets_manager_instance_management.v2.model.HSMHAGroup;
import com.ibm.cloud.secrets_manager_sdk_instance_management.secrets_manager_instance_management.v2.model.HSMHAGroupCollection;
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
import com.ibm.cloud.secrets_manager_sdk_instance_management.secrets_manager_instance_management.v2.model.ResetHsmDestinationPathOptions;
import com.ibm.cloud.secrets_manager_sdk_instance_management.secrets_manager_instance_management.v2.model.RunHsmDestinationHealthCheckOptions;
import com.ibm.cloud.secrets_manager_sdk_instance_management.secrets_manager_instance_management.v2.model.ServerCa;
import com.ibm.cloud.secrets_manager_sdk_instance_management.secrets_manager_instance_management.v2.model.ServerCaCollection;
import com.ibm.cloud.secrets_manager_sdk_instance_management.secrets_manager_instance_management.v2.model.Token;
import com.ibm.cloud.secrets_manager_sdk_instance_management.secrets_manager_instance_management.v2.model.UpdateInstanceDestinationOptions;
import com.ibm.cloud.secrets_manager_sdk_instance_management.secrets_manager_instance_management.v2.model.UpdateInstanceHsmDestinationClientCertificateOptions;
import com.ibm.cloud.secrets_manager_sdk_instance_management.secrets_manager_instance_management.v2.model.UpdateInstanceHsmDestinationHaGroupOptions;
import com.ibm.cloud.secrets_manager_sdk_instance_management.secrets_manager_instance_management.v2.model.UpdateInstanceHsmDestinationOptions;
import com.ibm.cloud.secrets_manager_sdk_instance_management.secrets_manager_instance_management.v2.model.UpdateInstanceHsmDestinationPathOptions;
import com.ibm.cloud.secrets_manager_sdk_instance_management.secrets_manager_instance_management.v2.model.UpdateInstanceHsmDestinationPathServerCaOptions;
import com.ibm.cloud.secrets_manager_sdk_instance_management.secrets_manager_instance_management.v2.model.VpeProvisioningResponse;
import com.ibm.cloud.secrets_manager_sdk_instance_management.secrets_manager_instance_management.v2.model.VpeStatusResult;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 * Use the IBM  Cloud® Secrets Manager Instance Management API to manage service instances of the Vault Dedicated plan.
 * - Get service instance details including cluster state, endpoints, and key management service.
 * - Generate a Vault admin token for authenticating to your Vault Dedicated cluster.
 * - Delete all active Vault admin tokens.
 * - Manage destinations for your Vault Dedicated cluster.
 * - Manage HSM destinations and their related resources, including HA groups, paths, server CAs, and client
 * certificates.
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
   * grants administrative privileges. Use only for initial setup and cluster management, then delete immediately.
   * Optionally, set response_wrapping to true in the request body to receive a Vault response-wrapped token instead of
   * a plain admin token.
   *
   * @param createVaultAdmintokenOptions the {@link CreateVaultAdmintokenOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Token}
   */
  public ServiceCall<Token> createVaultAdmintoken(CreateVaultAdmintokenOptions createVaultAdmintokenOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createVaultAdmintokenOptions,
      "createVaultAdmintokenOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("instance_id", createVaultAdmintokenOptions.instanceId());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/instances/{instance_id}/admintokens", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("secrets_manager_instance_management", "v2", "createVaultAdmintoken");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    final JsonObject contentJson = new JsonObject();
    if (createVaultAdmintokenOptions.responseWrapping() != null) {
      contentJson.addProperty("response_wrapping", createVaultAdmintokenOptions.responseWrapping());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<Token> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Token>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete admin tokens.
   *
   * Delete all active Vault admin tokens. This immediately invalidates all existing admin tokens including wrapped
   * tokens.
   *
   * @param deleteVaultAdmintokensOptions the {@link DeleteVaultAdmintokensOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteVaultAdmintokens(DeleteVaultAdmintokensOptions deleteVaultAdmintokensOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteVaultAdmintokensOptions,
      "deleteVaultAdmintokensOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("instance_id", deleteVaultAdmintokensOptions.instanceId());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/instances/{instance_id}/admintokens", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("secrets_manager_instance_management", "v2", "deleteVaultAdmintokens");
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
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/instances/{instance_id}", pathParamsMap));
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
   * Returns `202 Accepted` with `state: provisioning`. Provisioning completes asynchronously — poll `GET
   * /destinations/{id}` until `state` transitions to `succeeded` or `failed`.
   *
   * **Beta**: Only Gen 1 (Classic) IBM Cloud Database service instances are supported. Gen 2 instances are rejected
   * with `422`. IBM Cloud Database service instances with no private endpoints are also rejected with `422`.
   *
   * **Rate Limit**: 10 requests per instance per minute
   * **Quota**: Maximum 20 destinations per instance.
   *
   * @param createInstanceDestinationOptions the {@link CreateInstanceDestinationOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link IbmCloudDatabaseDestination}
   */
  public ServiceCall<IbmCloudDatabaseDestination> createInstanceDestination(CreateInstanceDestinationOptions createInstanceDestinationOptions) {
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
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithoutPrettyPrinting().toJson(createInstanceDestinationOptions.destinationPrototype()), "application/json");
    ResponseConverter<IbmCloudDatabaseDestination> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<IbmCloudDatabaseDestination>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get destination details.
   *
   * Retrieve details and current state for a specific destination for your Vault Dedicated cluster.
   *
   * Returns `404` if the destination does not exist. A destination undergoing deletion may appear with a `deleting`
   * state before it is fully removed.
   *
   * @param getInstanceDestinationOptions the {@link GetInstanceDestinationOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link IbmCloudDatabaseDestination}
   */
  public ServiceCall<IbmCloudDatabaseDestination> getInstanceDestination(GetInstanceDestinationOptions getInstanceDestinationOptions) {
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
    ResponseConverter<IbmCloudDatabaseDestination> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<IbmCloudDatabaseDestination>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update destination.
   *
   * Update mutable metadata fields (`name`, `description`) on a destination for your Vault Dedicated cluster. All other
   * fields are immutable after creation.
   *
   * @param updateInstanceDestinationOptions the {@link UpdateInstanceDestinationOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link IbmCloudDatabaseDestination}
   */
  public ServiceCall<IbmCloudDatabaseDestination> updateInstanceDestination(UpdateInstanceDestinationOptions updateInstanceDestinationOptions) {
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
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithSerializeNulls().toJson(updateInstanceDestinationOptions.destinationPatch()), "application/merge-patch+json");
    ResponseConverter<IbmCloudDatabaseDestination> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<IbmCloudDatabaseDestination>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete destination.
   *
   * Delete a destination for your Vault Dedicated cluster. Returns `202 Accepted` and begins deletion asynchronously —
   * the destination is removed from `GET /destinations` once deletion completes.
   *
   * A `failed` destination still counts against the per-instance quota until deleted.
   *
   * **Rate Limit**: 10 requests per instance per minute.
   *
   * @param deleteInstanceDestinationOptions the {@link DeleteInstanceDestinationOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link IbmCloudDatabaseDestination}
   */
  public ServiceCall<IbmCloudDatabaseDestination> deleteInstanceDestination(DeleteInstanceDestinationOptions deleteInstanceDestinationOptions) {
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
    builder.header("Accept", "application/json");
    ResponseConverter<IbmCloudDatabaseDestination> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<IbmCloudDatabaseDestination>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List destinations.
   *
   * List all HSM Destinations for this SM instance. Typically returns a single entry since only one destination per
   * vendor is allowed.
   *
   * **Rate Limit**: 100 requests per instance per minute.
   *
   * @param listInstanceHsmDestinationsOptions the {@link ListInstanceHsmDestinationsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link HSMDestinationCollection}
   */
  public ServiceCall<HSMDestinationCollection> listInstanceHsmDestinations(ListInstanceHsmDestinationsOptions listInstanceHsmDestinationsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(listInstanceHsmDestinationsOptions,
      "listInstanceHsmDestinationsOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("instance_id", listInstanceHsmDestinationsOptions.instanceId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/instances/{instance_id}/hsm_destinations", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("secrets_manager_instance_management", "v2", "listInstanceHsmDestinations");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<HSMDestinationCollection> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<HSMDestinationCollection>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Create destination.
   *
   * Create the HSM Destination for this SM instance. Each SM instance may have exactly **one** HSM Destination per
   * vendor. Calling POST again returns `409 Conflict`.
   *
   * The response `account_id` is required for account policy setup on your gateway. Without this step, path
   * provisioning cannot proceed.
   *
   * **Rate Limit**: 5 requests per instance per minute.
   *
   * @param createInstanceHsmDestinationOptions the {@link CreateInstanceHsmDestinationOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link HSMDestination}
   */
  public ServiceCall<HSMDestination> createInstanceHsmDestination(CreateInstanceHsmDestinationOptions createInstanceHsmDestinationOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createInstanceHsmDestinationOptions,
      "createInstanceHsmDestinationOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("instance_id", createInstanceHsmDestinationOptions.instanceId());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/instances/{instance_id}/hsm_destinations", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("secrets_manager_instance_management", "v2", "createInstanceHsmDestination");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    final JsonObject contentJson = new JsonObject();
    contentJson.addProperty("name", createInstanceHsmDestinationOptions.name());
    contentJson.addProperty("vendor", createInstanceHsmDestinationOptions.vendor());
    if (createInstanceHsmDestinationOptions.description() != null) {
      contentJson.addProperty("description", createInstanceHsmDestinationOptions.description());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<HSMDestination> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<HSMDestination>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get destination.
   *
   * Retrieve a single HSM Destination by its ID.
   *
   * **Rate Limit**: 100 requests per instance per minute.
   *
   * @param getInstanceHsmDestinationOptions the {@link GetInstanceHsmDestinationOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link HSMDestination}
   */
  public ServiceCall<HSMDestination> getInstanceHsmDestination(GetInstanceHsmDestinationOptions getInstanceHsmDestinationOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getInstanceHsmDestinationOptions,
      "getInstanceHsmDestinationOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("instance_id", getInstanceHsmDestinationOptions.instanceId());
    pathParamsMap.put("destination_id", getInstanceHsmDestinationOptions.destinationId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/instances/{instance_id}/hsm_destinations/{destination_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("secrets_manager_instance_management", "v2", "getInstanceHsmDestination");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<HSMDestination> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<HSMDestination>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update destination.
   *
   * Update `name` or `description`. Does not stage any HSM config file changes. If `name` is omitted, the existing name
   * is preserved (merge-patch semantics).
   * `health_state` and `health_as_of` are read-only — if supplied they are silently ignored.
   *
   * **Rate Limit**: 5 requests per instance per minute.
   *
   * @param updateInstanceHsmDestinationOptions the {@link UpdateInstanceHsmDestinationOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link HSMDestination}
   */
  public ServiceCall<HSMDestination> updateInstanceHsmDestination(UpdateInstanceHsmDestinationOptions updateInstanceHsmDestinationOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateInstanceHsmDestinationOptions,
      "updateInstanceHsmDestinationOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("instance_id", updateInstanceHsmDestinationOptions.instanceId());
    pathParamsMap.put("destination_id", updateInstanceHsmDestinationOptions.destinationId());
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/instances/{instance_id}/hsm_destinations/{destination_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("secrets_manager_instance_management", "v2", "updateInstanceHsmDestination");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithSerializeNulls().toJson(updateInstanceHsmDestinationOptions.hsmDestinationPatch()), "application/merge-patch+json");
    ResponseConverter<HSMDestination> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<HSMDestination>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete a destination asynchronously.
   *
   * Initiate an asynchronous hard delete of the destination and all its sub-resources (HSM HA Groups, paths, Server
   * CAs, client certificates, private keys). Sets `provisioning_state` to `deleting`. Poll `GET …/{destination_id}`
   * until `404` to confirm completion. **This operation cannot be undone.**
   *
   * **Rate Limit**: 5 requests per instance per minute.
   *
   * @param deleteInstanceHsmDestinationOptions the {@link DeleteInstanceHsmDestinationOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link AsyncDeleteResponse}
   */
  public ServiceCall<AsyncDeleteResponse> deleteInstanceHsmDestination(DeleteInstanceHsmDestinationOptions deleteInstanceHsmDestinationOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteInstanceHsmDestinationOptions,
      "deleteInstanceHsmDestinationOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("instance_id", deleteInstanceHsmDestinationOptions.instanceId());
    pathParamsMap.put("destination_id", deleteInstanceHsmDestinationOptions.destinationId());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/instances/{instance_id}/hsm_destinations/{destination_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("secrets_manager_instance_management", "v2", "deleteInstanceHsmDestination");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<AsyncDeleteResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<AsyncDeleteResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get destination health snapshot.
   *
   * Return the persisted AS-OF health snapshot for this destination. Does not trigger a new evaluation. Poll until
   * `health_state` is no longer `evaluating` or `in_progress`.
   *
   * **Rate Limit**: 100 requests per instance per minute.
   *
   * @param getHsmDestinationHealthSnapshotOptions the {@link GetHsmDestinationHealthSnapshotOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link DestinationHealthSnapshot}
   */
  public ServiceCall<DestinationHealthSnapshot> getHsmDestinationHealthSnapshot(GetHsmDestinationHealthSnapshotOptions getHsmDestinationHealthSnapshotOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getHsmDestinationHealthSnapshotOptions,
      "getHsmDestinationHealthSnapshotOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("instance_id", getHsmDestinationHealthSnapshotOptions.instanceId());
    pathParamsMap.put("destination_id", getHsmDestinationHealthSnapshotOptions.destinationId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/instances/{instance_id}/hsm_destinations/{destination_id}/health", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("secrets_manager_instance_management", "v2", "getHsmDestinationHealthSnapshot");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<DestinationHealthSnapshot> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<DestinationHealthSnapshot>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Trigger an async destination health check.
   *
   * Start an asynchronous health check across all paths, HSM HA Groups, and client certificates. Sets `health_state` to
   * `evaluating` on the destination and all sub-resources immediately. Returns `202 Accepted`. Poll `GET …/health`
   * until `health_state` is no longer `evaluating`.
   *
   * Returns `409 health_check_in_progress` if `health_state` is already `evaluating` or `in_progress`.
   *
   * **Rate Limit**: 5 requests per instance per minute.
   *
   * @param runHsmDestinationHealthCheckOptions the {@link RunHsmDestinationHealthCheckOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link AsyncHealthCheckAckResponse}
   */
  public ServiceCall<AsyncHealthCheckAckResponse> runHsmDestinationHealthCheck(RunHsmDestinationHealthCheckOptions runHsmDestinationHealthCheckOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(runHsmDestinationHealthCheckOptions,
      "runHsmDestinationHealthCheckOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("instance_id", runHsmDestinationHealthCheckOptions.instanceId());
    pathParamsMap.put("destination_id", runHsmDestinationHealthCheckOptions.destinationId());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/instances/{instance_id}/hsm_destinations/{destination_id}/health", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("secrets_manager_instance_management", "v2", "runHsmDestinationHealthCheck");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<AsyncHealthCheckAckResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<AsyncHealthCheckAckResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Trigger an async HSM configuration apply.
   *
   * Applies the current configuration (paths, HSM HA Groups, Server CAs, and client certificates) of the destination.
   * Sets `health_state` to `in_progress` on the destination and all sub-resources immediately, then continues
   * asynchronously. Returns `202 Accepted`. On success, automatically triggers a health check. On failure, sets all
   * `health_state` to `unknown`.
   *
   * Returns `409 apply_not_allowed` if `health_state` is already `in_progress` or `evaluating`. Poll `GET …/health`
   * until `health_state` is no longer `in_progress`.
   *
   * **Rate Limit**: 5 requests per instance per minute.
   *
   * @param applyHsmDestinationOptions the {@link ApplyHsmDestinationOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link AsyncHealthAckResponse}
   */
  public ServiceCall<AsyncHealthAckResponse> applyHsmDestination(ApplyHsmDestinationOptions applyHsmDestinationOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(applyHsmDestinationOptions,
      "applyHsmDestinationOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("instance_id", applyHsmDestinationOptions.instanceId());
    pathParamsMap.put("destination_id", applyHsmDestinationOptions.destinationId());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/instances/{instance_id}/hsm_destinations/{destination_id}/apply", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("secrets_manager_instance_management", "v2", "applyHsmDestination");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<AsyncHealthAckResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<AsyncHealthAckResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List HSM HA Groups.
   *
   * List all HSM HA Groups for this destination. Returns an empty array if none have been created. Results are ordered
   * by creation time ascending.
   *
   * **Rate Limit**: 100 requests per instance per minute.
   *
   * @param listInstanceHsmDestinationHaGroupsOptions the {@link ListInstanceHsmDestinationHaGroupsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link HSMHAGroupCollection}
   */
  public ServiceCall<HSMHAGroupCollection> listInstanceHsmDestinationHaGroups(ListInstanceHsmDestinationHaGroupsOptions listInstanceHsmDestinationHaGroupsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(listInstanceHsmDestinationHaGroupsOptions,
      "listInstanceHsmDestinationHaGroupsOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("instance_id", listInstanceHsmDestinationHaGroupsOptions.instanceId());
    pathParamsMap.put("destination_id", listInstanceHsmDestinationHaGroupsOptions.destinationId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/instances/{instance_id}/hsm_destinations/{destination_id}/ha_groups", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("secrets_manager_instance_management", "v2", "listInstanceHsmDestinationHaGroups");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<HSMHAGroupCollection> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<HSMHAGroupCollection>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Create HA Group.
   *
   * Create a new HA Group. `group_label` must be unique within the destination — returns `409
   * group_label_already_exists` if duplicate. Max 20 HSM HA Groups per destination — returns `409
   * ha_group_limit_reached` if exceeded.
   *
   * **Rate Limit**: 5 requests per instance per minute.
   *
   * @param createInstanceHsmDestinationHaGroupOptions the {@link CreateInstanceHsmDestinationHaGroupOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link HSMHAGroup}
   */
  public ServiceCall<HSMHAGroup> createInstanceHsmDestinationHaGroup(CreateInstanceHsmDestinationHaGroupOptions createInstanceHsmDestinationHaGroupOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createInstanceHsmDestinationHaGroupOptions,
      "createInstanceHsmDestinationHaGroupOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("instance_id", createInstanceHsmDestinationHaGroupOptions.instanceId());
    pathParamsMap.put("destination_id", createInstanceHsmDestinationHaGroupOptions.destinationId());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/instances/{instance_id}/hsm_destinations/{destination_id}/ha_groups", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("secrets_manager_instance_management", "v2", "createInstanceHsmDestinationHaGroup");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    final JsonObject contentJson = new JsonObject();
    contentJson.addProperty("name", createInstanceHsmDestinationHaGroupOptions.name());
    contentJson.addProperty("group_label", createInstanceHsmDestinationHaGroupOptions.groupLabel());
    contentJson.addProperty("group_serial", createInstanceHsmDestinationHaGroupOptions.groupSerial());
    contentJson.add("member_serials", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createInstanceHsmDestinationHaGroupOptions.memberSerials()));
    if (createInstanceHsmDestinationHaGroupOptions.description() != null) {
      contentJson.addProperty("description", createInstanceHsmDestinationHaGroupOptions.description());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<HSMHAGroup> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<HSMHAGroup>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get HA Group.
   *
   * Retrieve a single HA Group by its ID.
   *
   * **Rate Limit**: 100 requests per instance per minute.
   *
   * @param getInstanceHsmDestinationHaGroupOptions the {@link GetInstanceHsmDestinationHaGroupOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link HSMHAGroup}
   */
  public ServiceCall<HSMHAGroup> getInstanceHsmDestinationHaGroup(GetInstanceHsmDestinationHaGroupOptions getInstanceHsmDestinationHaGroupOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getInstanceHsmDestinationHaGroupOptions,
      "getInstanceHsmDestinationHaGroupOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("instance_id", getInstanceHsmDestinationHaGroupOptions.instanceId());
    pathParamsMap.put("destination_id", getInstanceHsmDestinationHaGroupOptions.destinationId());
    pathParamsMap.put("ha_group_id", getInstanceHsmDestinationHaGroupOptions.haGroupId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/instances/{instance_id}/hsm_destinations/{destination_id}/ha_groups/{ha_group_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("secrets_manager_instance_management", "v2", "getInstanceHsmDestinationHaGroup");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<HSMHAGroup> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<HSMHAGroup>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update HA Group.
   *
   * Update an HA Group. `group_serial` and `group_label` are immutable after creation — return `400` if supplied. If
   * `name` is omitted, the existing name is preserved (merge-patch semantics). `name` cannot be set to `null`.
   * `member_serials` can be updated to add or remove members (at least one entry required).
   * `health_state` and `health_as_of` are read-only — silently ignored if supplied.
   *
   * **HSM Config File**: staged when `member_serials` is changed.
   *
   * **Rate Limit**: 5 requests per instance per minute.
   *
   * @param updateInstanceHsmDestinationHaGroupOptions the {@link UpdateInstanceHsmDestinationHaGroupOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link HSMHAGroup}
   */
  public ServiceCall<HSMHAGroup> updateInstanceHsmDestinationHaGroup(UpdateInstanceHsmDestinationHaGroupOptions updateInstanceHsmDestinationHaGroupOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateInstanceHsmDestinationHaGroupOptions,
      "updateInstanceHsmDestinationHaGroupOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("instance_id", updateInstanceHsmDestinationHaGroupOptions.instanceId());
    pathParamsMap.put("destination_id", updateInstanceHsmDestinationHaGroupOptions.destinationId());
    pathParamsMap.put("ha_group_id", updateInstanceHsmDestinationHaGroupOptions.haGroupId());
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/instances/{instance_id}/hsm_destinations/{destination_id}/ha_groups/{ha_group_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("secrets_manager_instance_management", "v2", "updateInstanceHsmDestinationHaGroup");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithSerializeNulls().toJson(updateInstanceHsmDestinationHaGroupOptions.hsmhaGroupPatch()), "application/merge-patch+json");
    ResponseConverter<HSMHAGroup> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<HSMHAGroup>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete HA Group (synchronous hard delete).
   *
   * Synchronous hard delete — returns 204 immediately.
   *
   * **Rate Limit**: 5 requests per instance per minute.
   *
   * @param deleteInstanceHsmDestinationHaGroupOptions the {@link DeleteInstanceHsmDestinationHaGroupOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteInstanceHsmDestinationHaGroup(DeleteInstanceHsmDestinationHaGroupOptions deleteInstanceHsmDestinationHaGroupOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteInstanceHsmDestinationHaGroupOptions,
      "deleteInstanceHsmDestinationHaGroupOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("instance_id", deleteInstanceHsmDestinationHaGroupOptions.instanceId());
    pathParamsMap.put("destination_id", deleteInstanceHsmDestinationHaGroupOptions.destinationId());
    pathParamsMap.put("ha_group_id", deleteInstanceHsmDestinationHaGroupOptions.haGroupId());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/instances/{instance_id}/hsm_destinations/{destination_id}/ha_groups/{ha_group_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("secrets_manager_instance_management", "v2", "deleteInstanceHsmDestinationHaGroup");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List paths.
   *
   * List all paths (nodes) for this destination. Returns an empty array if none have been created. Results are ordered
   * by creation time ascending.
   *
   * **Rate Limit**: 100 requests per instance per minute.
   *
   * @param listInstanceHsmDestinationPathsOptions the {@link ListInstanceHsmDestinationPathsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link PathCollection}
   */
  public ServiceCall<PathCollection> listInstanceHsmDestinationPaths(ListInstanceHsmDestinationPathsOptions listInstanceHsmDestinationPathsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(listInstanceHsmDestinationPathsOptions,
      "listInstanceHsmDestinationPathsOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("instance_id", listInstanceHsmDestinationPathsOptions.instanceId());
    pathParamsMap.put("destination_id", listInstanceHsmDestinationPathsOptions.destinationId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/instances/{instance_id}/hsm_destinations/{destination_id}/paths", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("secrets_manager_instance_management", "v2", "listInstanceHsmDestinationPaths");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<PathCollection> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<PathCollection>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Create path.
   *
   * Create a new path. `crn` is immutable. Must be unique within the destination — returns `409 crn_already_in_use` if
   * duplicate. Max 20 paths per destination — returns `409 path_limit_reached` if exceeded.
   *
   * **Rate Limit**: 5 requests per instance per minute.
   *
   * @param createInstanceHsmDestinationPathOptions the {@link CreateInstanceHsmDestinationPathOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Path}
   */
  public ServiceCall<Path> createInstanceHsmDestinationPath(CreateInstanceHsmDestinationPathOptions createInstanceHsmDestinationPathOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createInstanceHsmDestinationPathOptions,
      "createInstanceHsmDestinationPathOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("instance_id", createInstanceHsmDestinationPathOptions.instanceId());
    pathParamsMap.put("destination_id", createInstanceHsmDestinationPathOptions.destinationId());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/instances/{instance_id}/hsm_destinations/{destination_id}/paths", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("secrets_manager_instance_management", "v2", "createInstanceHsmDestinationPath");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    final JsonObject contentJson = new JsonObject();
    contentJson.addProperty("name", createInstanceHsmDestinationPathOptions.name());
    contentJson.addProperty("crn", createInstanceHsmDestinationPathOptions.crn());
    if (createInstanceHsmDestinationPathOptions.description() != null) {
      contentJson.addProperty("description", createInstanceHsmDestinationPathOptions.description());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<Path> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Path>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get path.
   *
   * Retrieve a single path by its ID.
   *
   * **Rate Limit**: 100 requests per instance per minute.
   *
   * @param getInstanceHsmDestinationPathOptions the {@link GetInstanceHsmDestinationPathOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Path}
   */
  public ServiceCall<Path> getInstanceHsmDestinationPath(GetInstanceHsmDestinationPathOptions getInstanceHsmDestinationPathOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getInstanceHsmDestinationPathOptions,
      "getInstanceHsmDestinationPathOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("instance_id", getInstanceHsmDestinationPathOptions.instanceId());
    pathParamsMap.put("destination_id", getInstanceHsmDestinationPathOptions.destinationId());
    pathParamsMap.put("path_id", getInstanceHsmDestinationPathOptions.pathId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/instances/{instance_id}/hsm_destinations/{destination_id}/paths/{path_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("secrets_manager_instance_management", "v2", "getInstanceHsmDestinationPath");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<Path> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Path>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update path.
   *
   * Update `name` or `description` (merge-patch semantics). `crn` is immutable.
   *
   * **Rate Limit**: 5 requests per instance per minute.
   *
   * @param updateInstanceHsmDestinationPathOptions the {@link UpdateInstanceHsmDestinationPathOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Path}
   */
  public ServiceCall<Path> updateInstanceHsmDestinationPath(UpdateInstanceHsmDestinationPathOptions updateInstanceHsmDestinationPathOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateInstanceHsmDestinationPathOptions,
      "updateInstanceHsmDestinationPathOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("instance_id", updateInstanceHsmDestinationPathOptions.instanceId());
    pathParamsMap.put("destination_id", updateInstanceHsmDestinationPathOptions.destinationId());
    pathParamsMap.put("path_id", updateInstanceHsmDestinationPathOptions.pathId());
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/instances/{instance_id}/hsm_destinations/{destination_id}/paths/{path_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("secrets_manager_instance_management", "v2", "updateInstanceHsmDestinationPath");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithSerializeNulls().toJson(updateInstanceHsmDestinationPathOptions.pathPatch()), "application/merge-patch+json");
    ResponseConverter<Path> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Path>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete path (async hard delete).
   *
   * Async hard delete of the path and its Server CAs. Sets `provisioning_state` to `deleting`. Poll `GET …/{path_id}`
   * until `404`.
   *
   * **This operation cannot be undone.**
   *
   * **Rate Limit**: 5 requests per instance per minute.
   *
   * @param deleteInstanceHsmDestinationPathOptions the {@link DeleteInstanceHsmDestinationPathOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Path}
   */
  public ServiceCall<Path> deleteInstanceHsmDestinationPath(DeleteInstanceHsmDestinationPathOptions deleteInstanceHsmDestinationPathOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteInstanceHsmDestinationPathOptions,
      "deleteInstanceHsmDestinationPathOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("instance_id", deleteInstanceHsmDestinationPathOptions.instanceId());
    pathParamsMap.put("destination_id", deleteInstanceHsmDestinationPathOptions.destinationId());
    pathParamsMap.put("path_id", deleteInstanceHsmDestinationPathOptions.pathId());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/instances/{instance_id}/hsm_destinations/{destination_id}/paths/{path_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("secrets_manager_instance_management", "v2", "deleteInstanceHsmDestinationPath");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<Path> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Path>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Build path (trigger provisioning).
   *
   * Trigger provisioning of the path. The customer must first approve the Secrets Manager account policy for the
   * gateway. Moves path from `pending_account_policy` → `provisioning`. Returns `409` if already `provisioning`.
   *
   * **Rate Limit**: 5 requests per instance per minute.
   *
   * @param createPathBuildOptions the {@link CreatePathBuildOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link VpeProvisioningResponse}
   */
  public ServiceCall<VpeProvisioningResponse> createPathBuild(CreatePathBuildOptions createPathBuildOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createPathBuildOptions,
      "createPathBuildOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("instance_id", createPathBuildOptions.instanceId());
    pathParamsMap.put("destination_id", createPathBuildOptions.destinationId());
    pathParamsMap.put("path_id", createPathBuildOptions.pathId());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/instances/{instance_id}/hsm_destinations/{destination_id}/paths/{path_id}/build", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("secrets_manager_instance_management", "v2", "createPathBuild");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<VpeProvisioningResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<VpeProvisioningResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Health check path (check provisioning status).
   *
   * Check the current provisioning status of this path. Can be called while the path is in `provisioning` or
   * `pending_approval` state. Returns the latest health state and the resulting path `provisioning_state`.
   *
   * **Rate Limit**: 5 requests per instance per minute.
   *
   * @param getPathVpeStatusOptions the {@link GetPathVpeStatusOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link VpeStatusResult}
   */
  public ServiceCall<VpeStatusResult> getPathVpeStatus(GetPathVpeStatusOptions getPathVpeStatusOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getPathVpeStatusOptions,
      "getPathVpeStatusOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("instance_id", getPathVpeStatusOptions.instanceId());
    pathParamsMap.put("destination_id", getPathVpeStatusOptions.destinationId());
    pathParamsMap.put("path_id", getPathVpeStatusOptions.pathId());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/instances/{instance_id}/hsm_destinations/{destination_id}/paths/{path_id}/health_check", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("secrets_manager_instance_management", "v2", "getPathVpeStatus");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<VpeStatusResult> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<VpeStatusResult>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Reset a path to its initial pending state.
   *
   * Reset path to `pending_account_policy` so `POST /build` can be retried. Allowed from `crn_already_in_use`,
   * `approval_declined`, `completed`, or `vpe_provisioning_failed`. Returns `409` otherwise.
   *
   * **Rate Limit**: 5 requests per instance per minute.
   *
   * @param resetHsmDestinationPathOptions the {@link ResetHsmDestinationPathOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link HSMPathReset}
   */
  public ServiceCall<HSMPathReset> resetHsmDestinationPath(ResetHsmDestinationPathOptions resetHsmDestinationPathOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(resetHsmDestinationPathOptions,
      "resetHsmDestinationPathOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("instance_id", resetHsmDestinationPathOptions.instanceId());
    pathParamsMap.put("destination_id", resetHsmDestinationPathOptions.destinationId());
    pathParamsMap.put("path_id", resetHsmDestinationPathOptions.pathId());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/instances/{instance_id}/hsm_destinations/{destination_id}/paths/{path_id}/reset", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("secrets_manager_instance_management", "v2", "resetHsmDestinationPath");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<HSMPathReset> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<HSMPathReset>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List Server CA certificates.
   *
   * List all Server CA certificates for this path. Returns an empty array if none have been added. At most one
   * certificate can be active at a time; up to 10 certificates total per path. Results are ordered by creation time
   * ascending.
   *
   * **Rate Limit**: 100 requests per instance per minute.
   *
   * @param listInstanceHsmDestinationPathServerCasOptions the {@link ListInstanceHsmDestinationPathServerCasOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ServerCaCollection}
   */
  public ServiceCall<ServerCaCollection> listInstanceHsmDestinationPathServerCas(ListInstanceHsmDestinationPathServerCasOptions listInstanceHsmDestinationPathServerCasOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(listInstanceHsmDestinationPathServerCasOptions,
      "listInstanceHsmDestinationPathServerCasOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("instance_id", listInstanceHsmDestinationPathServerCasOptions.instanceId());
    pathParamsMap.put("destination_id", listInstanceHsmDestinationPathServerCasOptions.destinationId());
    pathParamsMap.put("path_id", listInstanceHsmDestinationPathServerCasOptions.pathId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/instances/{instance_id}/hsm_destinations/{destination_id}/paths/{path_id}/server_cas", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("secrets_manager_instance_management", "v2", "listInstanceHsmDestinationPathServerCas");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<ServerCaCollection> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ServerCaCollection>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Add Server CA certificate.
   *
   * Add a Server CA (PEM). Starts `inactive`. Max 10 per path — returns `409 server_ca_limit_reached` if exceeded.
   * Certificate must not be expired — returns `400 cert_expired`.
   *
   * **Rate Limit**: 5 requests per instance per minute.
   *
   * @param createInstanceHsmDestinationPathServerCaOptions the {@link CreateInstanceHsmDestinationPathServerCaOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ServerCa}
   */
  public ServiceCall<ServerCa> createInstanceHsmDestinationPathServerCa(CreateInstanceHsmDestinationPathServerCaOptions createInstanceHsmDestinationPathServerCaOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createInstanceHsmDestinationPathServerCaOptions,
      "createInstanceHsmDestinationPathServerCaOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("instance_id", createInstanceHsmDestinationPathServerCaOptions.instanceId());
    pathParamsMap.put("destination_id", createInstanceHsmDestinationPathServerCaOptions.destinationId());
    pathParamsMap.put("path_id", createInstanceHsmDestinationPathServerCaOptions.pathId());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/instances/{instance_id}/hsm_destinations/{destination_id}/paths/{path_id}/server_cas", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("secrets_manager_instance_management", "v2", "createInstanceHsmDestinationPathServerCa");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    final JsonObject contentJson = new JsonObject();
    contentJson.addProperty("name", createInstanceHsmDestinationPathServerCaOptions.name());
    contentJson.addProperty("certificate", createInstanceHsmDestinationPathServerCaOptions.certificate());
    if (createInstanceHsmDestinationPathServerCaOptions.description() != null) {
      contentJson.addProperty("description", createInstanceHsmDestinationPathServerCaOptions.description());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<ServerCa> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ServerCa>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get Server CA certificate.
   *
   * Retrieve a single Server CA certificate by its ID.
   *
   * **Rate Limit**: 100 requests per instance per minute.
   *
   * @param getInstanceHsmDestinationPathServerCaOptions the {@link GetInstanceHsmDestinationPathServerCaOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ServerCa}
   */
  public ServiceCall<ServerCa> getInstanceHsmDestinationPathServerCa(GetInstanceHsmDestinationPathServerCaOptions getInstanceHsmDestinationPathServerCaOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getInstanceHsmDestinationPathServerCaOptions,
      "getInstanceHsmDestinationPathServerCaOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("instance_id", getInstanceHsmDestinationPathServerCaOptions.instanceId());
    pathParamsMap.put("destination_id", getInstanceHsmDestinationPathServerCaOptions.destinationId());
    pathParamsMap.put("path_id", getInstanceHsmDestinationPathServerCaOptions.pathId());
    pathParamsMap.put("server_ca_id", getInstanceHsmDestinationPathServerCaOptions.serverCaId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/instances/{instance_id}/hsm_destinations/{destination_id}/paths/{path_id}/server_cas/{server_ca_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("secrets_manager_instance_management", "v2", "getInstanceHsmDestinationPathServerCa");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<ServerCa> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ServerCa>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update or activate Server CA.
   *
   * Rename, update description, or activate a Server CA (merge-patch semantics). `certificate` is immutable. Activating
   * demotes the currently active CA to `inactive`.
   *
   * **Rate Limit**: 5 requests per instance per minute.
   *
   * @param updateInstanceHsmDestinationPathServerCaOptions the {@link UpdateInstanceHsmDestinationPathServerCaOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ServerCa}
   */
  public ServiceCall<ServerCa> updateInstanceHsmDestinationPathServerCa(UpdateInstanceHsmDestinationPathServerCaOptions updateInstanceHsmDestinationPathServerCaOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateInstanceHsmDestinationPathServerCaOptions,
      "updateInstanceHsmDestinationPathServerCaOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("instance_id", updateInstanceHsmDestinationPathServerCaOptions.instanceId());
    pathParamsMap.put("destination_id", updateInstanceHsmDestinationPathServerCaOptions.destinationId());
    pathParamsMap.put("path_id", updateInstanceHsmDestinationPathServerCaOptions.pathId());
    pathParamsMap.put("server_ca_id", updateInstanceHsmDestinationPathServerCaOptions.serverCaId());
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/instances/{instance_id}/hsm_destinations/{destination_id}/paths/{path_id}/server_cas/{server_ca_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("secrets_manager_instance_management", "v2", "updateInstanceHsmDestinationPathServerCa");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithSerializeNulls().toJson(updateInstanceHsmDestinationPathServerCaOptions.serverCaPatch()), "application/merge-patch+json");
    ResponseConverter<ServerCa> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ServerCa>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete Server CA certificate.
   *
   * Hard delete a Server CA certificate. Cannot delete the active Server CA — returns `409`. Synchronous (204, no
   * body).
   *
   * **Rate Limit**: 5 requests per instance per minute.
   *
   * @param deleteInstanceHsmDestinationPathServerCaOptions the {@link DeleteInstanceHsmDestinationPathServerCaOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteInstanceHsmDestinationPathServerCa(DeleteInstanceHsmDestinationPathServerCaOptions deleteInstanceHsmDestinationPathServerCaOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteInstanceHsmDestinationPathServerCaOptions,
      "deleteInstanceHsmDestinationPathServerCaOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("instance_id", deleteInstanceHsmDestinationPathServerCaOptions.instanceId());
    pathParamsMap.put("destination_id", deleteInstanceHsmDestinationPathServerCaOptions.destinationId());
    pathParamsMap.put("path_id", deleteInstanceHsmDestinationPathServerCaOptions.pathId());
    pathParamsMap.put("server_ca_id", deleteInstanceHsmDestinationPathServerCaOptions.serverCaId());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/instances/{instance_id}/hsm_destinations/{destination_id}/paths/{path_id}/server_cas/{server_ca_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("secrets_manager_instance_management", "v2", "deleteInstanceHsmDestinationPathServerCa");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List client certificates.
   *
   * List all client certificates for this destination. Returns an empty array if none have been created. At most one
   * certificate can be active; up to 10 inactive or pending certificates may exist in addition. Results are ordered by
   * creation time ascending.
   *
   * **Rate Limit**: 100 requests per instance per minute.
   *
   * @param listInstanceHsmDestinationClientCertificatesOptions the {@link ListInstanceHsmDestinationClientCertificatesOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ClientCertificateCollection}
   */
  public ServiceCall<ClientCertificateCollection> listInstanceHsmDestinationClientCertificates(ListInstanceHsmDestinationClientCertificatesOptions listInstanceHsmDestinationClientCertificatesOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(listInstanceHsmDestinationClientCertificatesOptions,
      "listInstanceHsmDestinationClientCertificatesOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("instance_id", listInstanceHsmDestinationClientCertificatesOptions.instanceId());
    pathParamsMap.put("destination_id", listInstanceHsmDestinationClientCertificatesOptions.destinationId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/instances/{instance_id}/hsm_destinations/{destination_id}/client_certificates", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("secrets_manager_instance_management", "v2", "listInstanceHsmDestinationClientCertificates");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<ClientCertificateCollection> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ClientCertificateCollection>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Generate client certificate (CSR).
   *
   * Generate an RSA private key and CSR. CSR is immediately available in the response. Max 10 inactive/csr_generated
   * certificates — returns `409 cert_limit_exceeded` if exceeded.
   *
   * **Rate Limit**: 5 requests per instance per minute.
   *
   * @param createInstanceHsmDestinationClientCertificateOptions the {@link CreateInstanceHsmDestinationClientCertificateOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ClientCertificate}
   */
  public ServiceCall<ClientCertificate> createInstanceHsmDestinationClientCertificate(CreateInstanceHsmDestinationClientCertificateOptions createInstanceHsmDestinationClientCertificateOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createInstanceHsmDestinationClientCertificateOptions,
      "createInstanceHsmDestinationClientCertificateOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("instance_id", createInstanceHsmDestinationClientCertificateOptions.instanceId());
    pathParamsMap.put("destination_id", createInstanceHsmDestinationClientCertificateOptions.destinationId());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/instances/{instance_id}/hsm_destinations/{destination_id}/client_certificates", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("secrets_manager_instance_management", "v2", "createInstanceHsmDestinationClientCertificate");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    final JsonObject contentJson = new JsonObject();
    contentJson.addProperty("name", createInstanceHsmDestinationClientCertificateOptions.name());
    if (createInstanceHsmDestinationClientCertificateOptions.description() != null) {
      contentJson.addProperty("description", createInstanceHsmDestinationClientCertificateOptions.description());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<ClientCertificate> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ClientCertificate>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get client certificate.
   *
   * Retrieve a single client certificate by its ID.
   *
   * **Rate Limit**: 100 requests per instance per minute.
   *
   * @param getInstanceHsmDestinationClientCertificateOptions the {@link GetInstanceHsmDestinationClientCertificateOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ClientCertificate}
   */
  public ServiceCall<ClientCertificate> getInstanceHsmDestinationClientCertificate(GetInstanceHsmDestinationClientCertificateOptions getInstanceHsmDestinationClientCertificateOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getInstanceHsmDestinationClientCertificateOptions,
      "getInstanceHsmDestinationClientCertificateOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("instance_id", getInstanceHsmDestinationClientCertificateOptions.instanceId());
    pathParamsMap.put("destination_id", getInstanceHsmDestinationClientCertificateOptions.destinationId());
    pathParamsMap.put("cert_id", getInstanceHsmDestinationClientCertificateOptions.certId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/instances/{instance_id}/hsm_destinations/{destination_id}/client_certificates/{cert_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("secrets_manager_instance_management", "v2", "getInstanceHsmDestinationClientCertificate");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<ClientCertificate> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ClientCertificate>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update, upload signed cert, and/or activate.
   *
   * Update name/description, upload `signed_cert`, or activate (merge-patch semantics). `signed_cert` must match the
   * generated CSR — returns `400 csr_mismatch` otherwise.
   *
   * **Rate Limit**: 5 requests per instance per minute.
   *
   * @param updateInstanceHsmDestinationClientCertificateOptions the {@link UpdateInstanceHsmDestinationClientCertificateOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ClientCertificate}
   */
  public ServiceCall<ClientCertificate> updateInstanceHsmDestinationClientCertificate(UpdateInstanceHsmDestinationClientCertificateOptions updateInstanceHsmDestinationClientCertificateOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateInstanceHsmDestinationClientCertificateOptions,
      "updateInstanceHsmDestinationClientCertificateOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("instance_id", updateInstanceHsmDestinationClientCertificateOptions.instanceId());
    pathParamsMap.put("destination_id", updateInstanceHsmDestinationClientCertificateOptions.destinationId());
    pathParamsMap.put("cert_id", updateInstanceHsmDestinationClientCertificateOptions.certId());
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/instances/{instance_id}/hsm_destinations/{destination_id}/client_certificates/{cert_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("secrets_manager_instance_management", "v2", "updateInstanceHsmDestinationClientCertificate");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithSerializeNulls().toJson(updateInstanceHsmDestinationClientCertificateOptions.clientCertificatePatch()), "application/merge-patch+json");
    ResponseConverter<ClientCertificate> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ClientCertificate>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete client certificate.
   *
   * Delete a client certificate and purge its private key from Vault. Cannot delete the active certificate — returns
   * `409 Conflict`. Synchronous (204, no body).
   *
   * **Rate Limit**: 5 requests per instance per minute.
   *
   * @param deleteInstanceHsmDestinationClientCertificateOptions the {@link DeleteInstanceHsmDestinationClientCertificateOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteInstanceHsmDestinationClientCertificate(DeleteInstanceHsmDestinationClientCertificateOptions deleteInstanceHsmDestinationClientCertificateOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteInstanceHsmDestinationClientCertificateOptions,
      "deleteInstanceHsmDestinationClientCertificateOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("instance_id", deleteInstanceHsmDestinationClientCertificateOptions.instanceId());
    pathParamsMap.put("destination_id", deleteInstanceHsmDestinationClientCertificateOptions.destinationId());
    pathParamsMap.put("cert_id", deleteInstanceHsmDestinationClientCertificateOptions.certId());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/instances/{instance_id}/hsm_destinations/{destination_id}/client_certificates/{cert_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("secrets_manager_instance_management", "v2", "deleteInstanceHsmDestinationClientCertificate");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

}
