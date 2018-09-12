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
 * Defines the HTTP configuration for an API service. It contains a list of HttpRule, each
 * specifying the mapping of an RPC method to one or more HTTP REST API methods.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Service Usage API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Http extends com.google.api.client.json.GenericJson {

  /**
   * When set to true, URL path parmeters will be fully URI-decoded except in cases of single
   * segment matches in reserved expansion, where "%2F" will be left encoded.
   *
   * The default behavior is to not decode RFC 6570 reserved characters in multi segment matches.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean fullyDecodeReservedExpansion;

  /**
   * A list of HTTP configuration rules that apply to individual API methods.
   *
   * **NOTE:** All service configuration rules follow "last one wins" order.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<HttpRule> rules;

  /**
   * When set to true, URL path parmeters will be fully URI-decoded except in cases of single
   * segment matches in reserved expansion, where "%2F" will be left encoded.
   *
   * The default behavior is to not decode RFC 6570 reserved characters in multi segment matches.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getFullyDecodeReservedExpansion() {
    return fullyDecodeReservedExpansion;
  }

  /**
   * When set to true, URL path parmeters will be fully URI-decoded except in cases of single
   * segment matches in reserved expansion, where "%2F" will be left encoded.
   *
   * The default behavior is to not decode RFC 6570 reserved characters in multi segment matches.
   * @param fullyDecodeReservedExpansion fullyDecodeReservedExpansion or {@code null} for none
   */
  public Http setFullyDecodeReservedExpansion(java.lang.Boolean fullyDecodeReservedExpansion) {
    this.fullyDecodeReservedExpansion = fullyDecodeReservedExpansion;
    return this;
  }

  /**
   * A list of HTTP configuration rules that apply to individual API methods.
   *
   * **NOTE:** All service configuration rules follow "last one wins" order.
   * @return value or {@code null} for none
   */
  public java.util.List<HttpRule> getRules() {
    return rules;
  }

  /**
   * A list of HTTP configuration rules that apply to individual API methods.
   *
   * **NOTE:** All service configuration rules follow "last one wins" order.
   * @param rules rules or {@code null} for none
   */
  public Http setRules(java.util.List<HttpRule> rules) {
    this.rules = rules;
    return this;
  }

  @Override
  public Http set(String fieldName, Object value) {
    return (Http) super.set(fieldName, value);
  }

  @Override
  public Http clone() {
    return (Http) super.clone();
  }

}
