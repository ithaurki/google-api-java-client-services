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

package com.google.api.services.admob.v1.model;

/**
 * Specification of a single date range. Both dates are inclusive.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the AdMob API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class DateRange extends com.google.api.client.json.GenericJson {

  /**
   * End date of the date range, inclusive. Must be greater than or equal to the start date.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Date endDate;

  /**
   * Start date of the date range, inclusive. Must be less than or equal to the end date.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Date startDate;

  /**
   * End date of the date range, inclusive. Must be greater than or equal to the start date.
   * @return value or {@code null} for none
   */
  public Date getEndDate() {
    return endDate;
  }

  /**
   * End date of the date range, inclusive. Must be greater than or equal to the start date.
   * @param endDate endDate or {@code null} for none
   */
  public DateRange setEndDate(Date endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * Start date of the date range, inclusive. Must be less than or equal to the end date.
   * @return value or {@code null} for none
   */
  public Date getStartDate() {
    return startDate;
  }

  /**
   * Start date of the date range, inclusive. Must be less than or equal to the end date.
   * @param startDate startDate or {@code null} for none
   */
  public DateRange setStartDate(Date startDate) {
    this.startDate = startDate;
    return this;
  }

  @Override
  public DateRange set(String fieldName, Object value) {
    return (DateRange) super.set(fieldName, value);
  }

  @Override
  public DateRange clone() {
    return (DateRange) super.clone();
  }

}