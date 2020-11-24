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

package com.google.api.services.analytics.model;

/**
 * JSON template for a linked account.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Analytics API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AccountRef extends com.google.api.client.json.GenericJson {

  /**
   * Link for this account.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String href;

  /**
   * Account ID.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String id;

  /**
   * Analytics account reference.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * Account name.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Link for this account.
   * @return value or {@code null} for none
   */
  public java.lang.String getHref() {
    return href;
  }

  /**
   * Link for this account.
   * @param href href or {@code null} for none
   */
  public AccountRef setHref(java.lang.String href) {
    this.href = href;
    return this;
  }

  /**
   * Account ID.
   * @return value or {@code null} for none
   */
  public java.lang.String getId() {
    return id;
  }

  /**
   * Account ID.
   * @param id id or {@code null} for none
   */
  public AccountRef setId(java.lang.String id) {
    this.id = id;
    return this;
  }

  /**
   * Analytics account reference.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Analytics account reference.
   * @param kind kind or {@code null} for none
   */
  public AccountRef setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Account name.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Account name.
   * @param name name or {@code null} for none
   */
  public AccountRef setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  @Override
  public AccountRef set(String fieldName, Object value) {
    return (AccountRef) super.set(fieldName, value);
  }

  @Override
  public AccountRef clone() {
    return (AccountRef) super.clone();
  }

}
