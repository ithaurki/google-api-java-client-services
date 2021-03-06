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

package com.google.api.services.apigateway.v1beta.model;

/**
 * Response message for ApiGatewayService.ListGateways
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the API Gateway API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ApigatewayListGatewaysResponse extends com.google.api.client.json.GenericJson {

  /**
   * Gateways.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<ApigatewayGateway> gateways;

  static {
    // hack to force ProGuard to consider ApigatewayGateway used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(ApigatewayGateway.class);
  }

  /**
   * Next page token.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * Locations that could not be reached.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> unreachableLocations;

  /**
   * Gateways.
   * @return value or {@code null} for none
   */
  public java.util.List<ApigatewayGateway> getGateways() {
    return gateways;
  }

  /**
   * Gateways.
   * @param gateways gateways or {@code null} for none
   */
  public ApigatewayListGatewaysResponse setGateways(java.util.List<ApigatewayGateway> gateways) {
    this.gateways = gateways;
    return this;
  }

  /**
   * Next page token.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * Next page token.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public ApigatewayListGatewaysResponse setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  /**
   * Locations that could not be reached.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getUnreachableLocations() {
    return unreachableLocations;
  }

  /**
   * Locations that could not be reached.
   * @param unreachableLocations unreachableLocations or {@code null} for none
   */
  public ApigatewayListGatewaysResponse setUnreachableLocations(java.util.List<java.lang.String> unreachableLocations) {
    this.unreachableLocations = unreachableLocations;
    return this;
  }

  @Override
  public ApigatewayListGatewaysResponse set(String fieldName, Object value) {
    return (ApigatewayListGatewaysResponse) super.set(fieldName, value);
  }

  @Override
  public ApigatewayListGatewaysResponse clone() {
    return (ApigatewayListGatewaysResponse) super.clone();
  }

}
