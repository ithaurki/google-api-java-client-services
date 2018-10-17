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

package com.google.dialogflow.v2.model;

/**
 * Represents a notification sent to Cloud Pub/Sub subscribers for conversation lifecycle events.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dialogflow API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDialogflowV2beta1ConversationEvent extends com.google.api.client.json.GenericJson {

  /**
   * Required. The unique identifier of the conversation this notification refers to. Format:
   * `projects//conversations/`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String conversation;

  /**
   * Optional. More detailed information about an error. Only set for type
   * UNRECOVERABLE_ERROR_IN_PHONE_CALL.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleRpcStatus errorStatus;

  /**
   * Required. The type of the event that this notification refers to.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * Required. The unique identifier of the conversation this notification refers to. Format:
   * `projects//conversations/`.
   * @return value or {@code null} for none
   */
  public java.lang.String getConversation() {
    return conversation;
  }

  /**
   * Required. The unique identifier of the conversation this notification refers to. Format:
   * `projects//conversations/`.
   * @param conversation conversation or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1ConversationEvent setConversation(java.lang.String conversation) {
    this.conversation = conversation;
    return this;
  }

  /**
   * Optional. More detailed information about an error. Only set for type
   * UNRECOVERABLE_ERROR_IN_PHONE_CALL.
   * @return value or {@code null} for none
   */
  public GoogleRpcStatus getErrorStatus() {
    return errorStatus;
  }

  /**
   * Optional. More detailed information about an error. Only set for type
   * UNRECOVERABLE_ERROR_IN_PHONE_CALL.
   * @param errorStatus errorStatus or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1ConversationEvent setErrorStatus(GoogleRpcStatus errorStatus) {
    this.errorStatus = errorStatus;
    return this;
  }

  /**
   * Required. The type of the event that this notification refers to.
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * Required. The type of the event that this notification refers to.
   * @param type type or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1ConversationEvent setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  @Override
  public GoogleCloudDialogflowV2beta1ConversationEvent set(String fieldName, Object value) {
    return (GoogleCloudDialogflowV2beta1ConversationEvent) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDialogflowV2beta1ConversationEvent clone() {
    return (GoogleCloudDialogflowV2beta1ConversationEvent) super.clone();
  }

}
