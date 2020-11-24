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

package com.google.api.services.safebrowsing.v4.model;

/**
 * A single resource related to a threat hit.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Safe Browsing API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ThreatSource extends com.google.api.client.json.GenericJson {

  /**
   * Referrer of the resource. Only set if the referrer is available.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String referrer;

  /**
   * The remote IP of the resource in ASCII format. Either IPv4 or IPv6.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String remoteIp;

  /**
   * The type of source reported.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * The URL of the resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String url;

  /**
   * Referrer of the resource. Only set if the referrer is available.
   * @return value or {@code null} for none
   */
  public java.lang.String getReferrer() {
    return referrer;
  }

  /**
   * Referrer of the resource. Only set if the referrer is available.
   * @param referrer referrer or {@code null} for none
   */
  public ThreatSource setReferrer(java.lang.String referrer) {
    this.referrer = referrer;
    return this;
  }

  /**
   * The remote IP of the resource in ASCII format. Either IPv4 or IPv6.
   * @return value or {@code null} for none
   */
  public java.lang.String getRemoteIp() {
    return remoteIp;
  }

  /**
   * The remote IP of the resource in ASCII format. Either IPv4 or IPv6.
   * @param remoteIp remoteIp or {@code null} for none
   */
  public ThreatSource setRemoteIp(java.lang.String remoteIp) {
    this.remoteIp = remoteIp;
    return this;
  }

  /**
   * The type of source reported.
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * The type of source reported.
   * @param type type or {@code null} for none
   */
  public ThreatSource setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  /**
   * The URL of the resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getUrl() {
    return url;
  }

  /**
   * The URL of the resource.
   * @param url url or {@code null} for none
   */
  public ThreatSource setUrl(java.lang.String url) {
    this.url = url;
    return this;
  }

  @Override
  public ThreatSource set(String fieldName, Object value) {
    return (ThreatSource) super.set(fieldName, value);
  }

  @Override
  public ThreatSource clone() {
    return (ThreatSource) super.clone();
  }

}
