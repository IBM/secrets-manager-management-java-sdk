# IBM Cloud Secrets Manager Management Java SDK 
A Java client library to interact with the IBM Cloud® Secrets Manager Instance Management APIs.

> **Important:** This SDK is for use with instances of the IBM Cloud Secrets Manager **Vault Enterprise plan only**. It is not compatible with other Secrets Manager plans.

<details>
<summary>Table of Contents</summary>

* [Overview](#overview)
* [Prerequisites](#prerequisites)
* [Installation](#installation)
* [Authentication](#authentication)
* [Using the SDK](#using-the-sdk)
* [Issues](#issues)
* [Contributing](#contributing)
* [License](#license)

</details>

## Overview
The IBM Cloud Secrets Manager Management Java SDK allows developers to programmatically interact with the following IBM Cloud services:

| Service name                              | Imported class name                    |
|-------------------------------------------|----------------------------------------|
| Secrets Manager Management | SecretsManagerInstanceManagement |

## Prerequisites

[ibm-cloud-onboarding]: https://cloud.ibm.com/registration

- An [IBM Cloud account](https://cloud.ibm.com/registration).
- A [Secrets Manager service instance](https://cloud.ibm.com/catalog/services/secrets-manager) with the **Vault Enterprise plan**.
- An [IBM Cloud API key](https://cloud.ibm.com/iam/apikeys) that allows the SDK to access your account.
- Java 11

## Installation
##### Maven

```xml
<dependency>
    <groupId>com.ibm.cloud</groupId>
    <artifactId>secrets-manager-instance-management</artifactId>
    <version>2.0.0</version>
</dependency>
```

##### Gradle

```gradle
'com.ibm.cloud:secrets-manager-instance-management:2.0.0'
```

## Authentication
Secrets Manager uses token-based Identity and Access Management (IAM) authentication.

With IAM authentication, you supply an API key that is used to generate an access token. Then, the access token is included in each API request to Secrets Manager. Access tokens are valid for a limited amount of time and must be regenerated.
Authentication for this SDK is accomplished by using [IAM authenticators](https://github.com/IBM/ibm-cloud-sdk-common/blob/master/README.md#authentication). Import authenticators from `com.ibm.cloud.sdk.core.security`.

### Examples

#### Programmatic credentials

```java
import com.ibm.cloud.sdk.core.security.IamAuthenticator;
...
IamAuthenticator iamAuthenticator = new IamAuthenticator.Builder()
        .apikey("<IBM_CLOUD_API_KEY>")
        .build();
```

To learn more about IAM authenticators and how to use them in your Java application, see
the [IBM Java SDK Core documentation](https://github.com/IBM/java-sdk-core/blob/master/Authentication.md).

## Using the SDK

### Basic usage
- Use the `setServiceUrl` method to set the endpoint URL that is specific to your Secrets Manager service instance. To find your endpoint URL, you can copy it from the **Endpoints** section on the **Overview** page in the Secrets Manager UI.

#### Examples

Construct a service client and use it to generate an admin token and get instance details.
Here's an example `main.java` class file:

```java
import com.ibm.cloud.secrets_manager_sdk_instance_management.secrets_manager_instance_management.v2.SecretsManagerInstanceManagement;
import com.ibm.cloud.secrets_manager_sdk_instance_management.secrets_manager_instance_management.v2.model.*;
import com.ibm.cloud.sdk.core.http.Response;
import com.ibm.cloud.sdk.core.security.IamAuthenticator;

public class main {

    protected static SecretsManagerInstanceManagement smim;
    protected static IamAuthenticator iamAuthenticator;

    public static void main(String[] args) { 
        iamAuthenticator = new IamAuthenticator.Builder()
              .apikey("<IBM_CLOUD_API_KEY>")
              .build();
        smim = new SecretsManagerInstanceManagement("Secrets Manager Instance Management", iamAuthenticator);
        smim.setServiceUrl("<SERVICE_URL>");

        // Generate admin token
        AdminTokenGenerateOptions adminTokenGenerateOptions = new AdminTokenGenerateOptions.Builder()
                .instanceCrn("<INSTANCE_CRN>")
                .build();
        Response<AdminToken> tokenResp = smim.adminTokenGenerate(adminTokenGenerateOptions).execute();
        
        System.out.println("Admin token generated!");
        
        // Get instance details
        InstanceDetailsOptions instanceDetailsOptions = new InstanceDetailsOptions.Builder()
                .instanceCrn("<INSTANCE_CRN>")
                .build();
        Response<Instance> instanceResp = smim.instanceDetails(instanceDetailsOptions).execute();
        
        System.out.println("Instance details: " + instanceResp.getResult());
    }

}
```

Replace the `IBM_CLOUD_API_KEY`, `SERVICE_URL`, and `INSTANCE_CRN` values. Then run your application.

For more information and IBM Cloud SDK usage examples for Java, see the [IBM Cloud SDK Common documentation](https://github.com/IBM/ibm-cloud-sdk-common/blob/master/README.md).

## Issues

If you encounter an issue with the project, you're welcome to submit a [bug report](https://github.com/IBM/secrets-manager-management-java-sdk/issues) to help us improve.

## Contributing

For general contribution guidelines, see [CONTRIBUTING](CONTRIBUTING.md).

## License

This SDK project is released under the Apache 2.0 license. The license's full text can be found in [LICENSE](LICENSE).
