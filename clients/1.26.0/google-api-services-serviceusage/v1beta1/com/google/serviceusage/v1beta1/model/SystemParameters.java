/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.serviceusage.v1beta1.model;

/**
 * ### System parameter configuration
 *
 * A system parameter is a special kind of parameter defined by the API system, not by an individual
 * API. It is typically mapped to an HTTP header and/or a URL query parameter. This configuration
 * specifies which methods change the names of the system parameters.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Service Usage API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SystemParameters extends com.google.api.client.json.GenericJson {

  /**
   * Define system parameters.
   *
   * The parameters defined here will override the default parameters implemented by the system. If
   * this field is missing from the service config, default system parameters will be used. Default
   * system parameters and names is implementation-dependent.
   *
   * Example: define api key for all methods
   *
   *     system_parameters       rules:         - selector: "*"           parameters:             -
   * name: api_key               url_query_parameter: api_key
   *
   * Example: define 2 api key names for a specific method.
   *
   *     system_parameters       rules:         - selector: "/ListShelves"           parameters:
   * - name: api_key               http_header: Api-Key1             - name: api_key
   * http_header: Api-Key2
   *
   * **NOTE:** All service configuration rules follow "last one wins" order.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<SystemParameterRule> rules;

  /**
   * Define system parameters.
   *
   * The parameters defined here will override the default parameters implemented by the system. If
   * this field is missing from the service config, default system parameters will be used. Default
   * system parameters and names is implementation-dependent.
   *
   * Example: define api key for all methods
   *
   *     system_parameters       rules:         - selector: "*"           parameters:             -
   * name: api_key               url_query_parameter: api_key
   *
   * Example: define 2 api key names for a specific method.
   *
   *     system_parameters       rules:         - selector: "/ListShelves"           parameters:
   * - name: api_key               http_header: Api-Key1             - name: api_key
   * http_header: Api-Key2
   *
   * **NOTE:** All service configuration rules follow "last one wins" order.
   * @return value or {@code null} for none
   */
  public java.util.List<SystemParameterRule> getRules() {
    return rules;
  }

  /**
   * Define system parameters.
   *
   * The parameters defined here will override the default parameters implemented by the system. If
   * this field is missing from the service config, default system parameters will be used. Default
   * system parameters and names is implementation-dependent.
   *
   * Example: define api key for all methods
   *
   *     system_parameters       rules:         - selector: "*"           parameters:             -
   * name: api_key               url_query_parameter: api_key
   *
   * Example: define 2 api key names for a specific method.
   *
   *     system_parameters       rules:         - selector: "/ListShelves"           parameters:
   * - name: api_key               http_header: Api-Key1             - name: api_key
   * http_header: Api-Key2
   *
   * **NOTE:** All service configuration rules follow "last one wins" order.
   * @param rules rules or {@code null} for none
   */
  public SystemParameters setRules(java.util.List<SystemParameterRule> rules) {
    this.rules = rules;
    return this;
  }

  @Override
  public SystemParameters set(String fieldName, Object value) {
    return (SystemParameters) super.set(fieldName, value);
  }

  @Override
  public SystemParameters clone() {
    return (SystemParameters) super.clone();
  }

}
