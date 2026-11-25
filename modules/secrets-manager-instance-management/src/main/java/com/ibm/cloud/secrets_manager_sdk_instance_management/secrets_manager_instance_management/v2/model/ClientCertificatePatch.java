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

package com.ibm.cloud.secrets_manager_sdk_instance_management.secrets_manager_instance_management.v2.model;

import java.util.Map;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;
import com.ibm.cloud.sdk.core.util.GsonSingleton;

/**
 * Fields to update on the client certificate. Only supplied fields are changed (merge-patch semantics).
 */
public class ClientCertificatePatch extends GenericModel {

  protected String name;
  protected String description;
  protected String status;
  @SerializedName("signed_cert")
  protected String signedCert;

  /**
   * Builder.
   */
  public static class Builder {
    private String name;
    private String description;
    private String status;
    private String signedCert;

    /**
     * Instantiates a new Builder from an existing ClientCertificatePatch instance.
     *
     * @param clientCertificatePatch the instance to initialize the Builder with
     */
    private Builder(ClientCertificatePatch clientCertificatePatch) {
      this.name = clientCertificatePatch.name;
      this.description = clientCertificatePatch.description;
      this.status = clientCertificatePatch.status;
      this.signedCert = clientCertificatePatch.signedCert;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a ClientCertificatePatch.
     *
     * @return the new ClientCertificatePatch instance
     */
    public ClientCertificatePatch build() {
      return new ClientCertificatePatch(this);
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the ClientCertificatePatch builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the description.
     *
     * @param description the description
     * @return the ClientCertificatePatch builder
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * Set the status.
     *
     * @param status the status
     * @return the ClientCertificatePatch builder
     */
    public Builder status(String status) {
      this.status = status;
      return this;
    }

    /**
     * Set the signedCert.
     *
     * @param signedCert the signedCert
     * @return the ClientCertificatePatch builder
     */
    public Builder signedCert(String signedCert) {
      this.signedCert = signedCert;
      return this;
    }
  }

  protected ClientCertificatePatch() { }

  protected ClientCertificatePatch(Builder builder) {
    name = builder.name;
    description = builder.description;
    status = builder.status;
    signedCert = builder.signedCert;
  }

  /**
   * New builder.
   *
   * @return a ClientCertificatePatch builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the name.
   *
   * Updated display name for the certificate.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the description.
   *
   * Updated description. Set to empty string to clear.
   *
   * @return the description
   */
  public String description() {
    return description;
  }

  /**
   * Gets the status.
   *
   * Set to `active` to activate this certificate. Only `active` is allowed.
   *
   * @return the status
   */
  public String status() {
    return status;
  }

  /**
   * Gets the signedCert.
   *
   * CA-signed certificate (PEM). Makes cert eligible for activation.
   *
   * @return the signedCert
   */
  public String signedCert() {
    return signedCert;
  }

  /**
   * Construct a JSON merge-patch from the ClientCertificatePatch.
   *
   * Note that properties of the ClientCertificatePatch with null values are not represented in the constructed
   * JSON merge-patch object, but can be explicitly set afterward to signify a property delete.
   *
   * @return a JSON merge-patch for the ClientCertificatePatch
   */
  public Map<String, Object> asPatch() {
    return GsonSingleton.getGson().fromJson(this.toString(), Map.class);
  }
}

