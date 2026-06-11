package com.ibm.cloud.secrets_manager_sdk_instance_management.test;

import java.io.File;
import org.testng.SkipException;

/**
 * Minimal integration test base used by generated SDK integration tests.
 * It skips tests when the expected credentials file is not present.
 */
public abstract class SdkIntegrationTestBase {

  /**
   * Subclasses provide the relative path to the credentials file.
   *
   * @return relative config filename
   */
  public abstract String getConfigFilename();

  /**
   * Returns true when integration tests should be skipped.
   *
   * @return true if config file is missing
   */
  protected boolean skipTests() {
    String configFilename = getConfigFilename();
    if (configFilename == null || configFilename.isEmpty()) {
      throw new SkipException("Integration test config filename was not provided.");
    }

    File configFile = new File(configFilename);
    if (!configFile.exists()) {
      throw new SkipException("Skipping integration tests because config file was not found: " + configFilename);
    }

    return false;
  }
}

// Made with Bob
