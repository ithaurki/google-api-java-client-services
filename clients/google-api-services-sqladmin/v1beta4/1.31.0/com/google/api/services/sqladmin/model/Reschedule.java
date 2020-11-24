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

package com.google.api.services.sqladmin.model;

/**
 * Model definition for Reschedule.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud SQL Admin API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Reschedule extends com.google.api.client.json.GenericJson {

  /**
   * Required. The type of the reschedule.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String rescheduleType;

  /**
   * Optional. Timestamp when the maintenance shall be rescheduled to if
   * reschedule_type=SPECIFIC_TIME, in RFC 3339 format, for example *2012-11-15T16:19:00.094Z*.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String scheduleTime;

  /**
   * Required. The type of the reschedule.
   * @return value or {@code null} for none
   */
  public java.lang.String getRescheduleType() {
    return rescheduleType;
  }

  /**
   * Required. The type of the reschedule.
   * @param rescheduleType rescheduleType or {@code null} for none
   */
  public Reschedule setRescheduleType(java.lang.String rescheduleType) {
    this.rescheduleType = rescheduleType;
    return this;
  }

  /**
   * Optional. Timestamp when the maintenance shall be rescheduled to if
   * reschedule_type=SPECIFIC_TIME, in RFC 3339 format, for example *2012-11-15T16:19:00.094Z*.
   * @return value or {@code null} for none
   */
  public String getScheduleTime() {
    return scheduleTime;
  }

  /**
   * Optional. Timestamp when the maintenance shall be rescheduled to if
   * reschedule_type=SPECIFIC_TIME, in RFC 3339 format, for example *2012-11-15T16:19:00.094Z*.
   * @param scheduleTime scheduleTime or {@code null} for none
   */
  public Reschedule setScheduleTime(String scheduleTime) {
    this.scheduleTime = scheduleTime;
    return this;
  }

  @Override
  public Reschedule set(String fieldName, Object value) {
    return (Reschedule) super.set(fieldName, value);
  }

  @Override
  public Reschedule clone() {
    return (Reschedule) super.clone();
  }

}
