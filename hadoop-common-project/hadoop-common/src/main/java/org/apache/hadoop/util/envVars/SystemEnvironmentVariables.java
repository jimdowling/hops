/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.hadoop.util.envVars;

import org.apache.hadoop.util.envVars.EnvironmentVariables;

import java.util.Map;

/**
 * Read system environment variables
 */
public class SystemEnvironmentVariables implements EnvironmentVariables {
  private final Map<String, String> environmentVariables;
  
  public SystemEnvironmentVariables() {
    environmentVariables = System.getenv();
  }
  
  public String getEnv(String variableName) {
    return environmentVariables.get(variableName);
  }
}
