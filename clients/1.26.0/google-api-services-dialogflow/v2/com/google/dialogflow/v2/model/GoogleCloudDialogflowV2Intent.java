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
 * Represents an intent. Intents convert a number of user expressions or patterns into an action. An
 * action is an extraction of a user command or sentence semantics.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dialogflow API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDialogflowV2Intent extends com.google.api.client.json.GenericJson {

  /**
   * Optional. The name of the action associated with the intent. Note: The action name must not
   * contain whitespaces.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String action;

  /**
   * Optional. The list of platforms for which the first response will be taken from among the
   * messages assigned to the DEFAULT_PLATFORM.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> defaultResponsePlatforms;

  /**
   * Required. The name of this intent.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * Optional. The collection of event names that trigger the intent. If the collection of input
   * contexts is not empty, all of the contexts must be present in the active user session for an
   * event to trigger this intent.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> events;

  /**
   * Read-only. Information about all followup intents that have this intent as a direct or indirect
   * parent. We populate this field only in the output.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudDialogflowV2IntentFollowupIntentInfo> followupIntentInfo;

  static {
    // hack to force ProGuard to consider GoogleCloudDialogflowV2IntentFollowupIntentInfo used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GoogleCloudDialogflowV2IntentFollowupIntentInfo.class);
  }

  /**
   * Optional. The list of context names required for this intent to be triggered. Format:
   * `projects//agent/sessions/-/contexts/`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> inputContextNames;

  /**
   * Optional. Indicates whether this is a fallback intent.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean isFallback;

  /**
   * Optional. The collection of rich messages corresponding to the `Response` field in the
   * Dialogflow console.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudDialogflowV2IntentMessage> messages;

  static {
    // hack to force ProGuard to consider GoogleCloudDialogflowV2IntentMessage used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GoogleCloudDialogflowV2IntentMessage.class);
  }

  /**
   * Optional. Indicates whether Machine Learning is disabled for the intent. Note: If `ml_diabled`
   * setting is set to true, then this intent is not taken into account during inference in `ML
   * ONLY` match mode. Also, auto-markup in the UI is turned off.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean mlDisabled;

  /**
   * Required for all methods except `create` (`create` populates the name automatically. The unique
   * identifier of this intent. Format: `projects//agent/intents/`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Optional. The collection of contexts that are activated when the intent is matched. Context
   * messages in this collection should not set the parameters field. Setting the `lifespan_count`
   * to 0 will reset the context when the intent is matched. Format:
   * `projects//agent/sessions/-/contexts/`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudDialogflowV2Context> outputContexts;

  static {
    // hack to force ProGuard to consider GoogleCloudDialogflowV2Context used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GoogleCloudDialogflowV2Context.class);
  }

  /**
   * Optional. The collection of parameters associated with the intent.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudDialogflowV2IntentParameter> parameters;

  /**
   * Read-only after creation. The unique identifier of the parent intent in the chain of followup
   * intents. You can set this field when creating an intent, for example with CreateIntent or
   * BatchUpdateIntents, in order to make this intent a followup intent.
   *
   * It identifies the parent followup intent. Format: `projects//agent/intents/`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String parentFollowupIntentName;

  /**
   * Optional. The priority of this intent. Higher numbers represent higher priorities. Zero or
   * negative numbers mean that the intent is disabled.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer priority;

  /**
   * Optional. Indicates whether to delete all contexts in the current session when this intent is
   * matched.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean resetContexts;

  /**
   * Read-only. The unique identifier of the root intent in the chain of followup intents. It
   * identifies the correct followup intents chain for this intent. We populate this field only in
   * the output.
   *
   * Format: `projects//agent/intents/`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String rootFollowupIntentName;

  /**
   * Optional. The collection of examples/templates that the agent is trained on.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudDialogflowV2IntentTrainingPhrase> trainingPhrases;

  static {
    // hack to force ProGuard to consider GoogleCloudDialogflowV2IntentTrainingPhrase used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GoogleCloudDialogflowV2IntentTrainingPhrase.class);
  }

  /**
   * Optional. Indicates whether webhooks are enabled for the intent.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String webhookState;

  /**
   * Optional. The name of the action associated with the intent. Note: The action name must not
   * contain whitespaces.
   * @return value or {@code null} for none
   */
  public java.lang.String getAction() {
    return action;
  }

  /**
   * Optional. The name of the action associated with the intent. Note: The action name must not
   * contain whitespaces.
   * @param action action or {@code null} for none
   */
  public GoogleCloudDialogflowV2Intent setAction(java.lang.String action) {
    this.action = action;
    return this;
  }

  /**
   * Optional. The list of platforms for which the first response will be taken from among the
   * messages assigned to the DEFAULT_PLATFORM.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getDefaultResponsePlatforms() {
    return defaultResponsePlatforms;
  }

  /**
   * Optional. The list of platforms for which the first response will be taken from among the
   * messages assigned to the DEFAULT_PLATFORM.
   * @param defaultResponsePlatforms defaultResponsePlatforms or {@code null} for none
   */
  public GoogleCloudDialogflowV2Intent setDefaultResponsePlatforms(java.util.List<java.lang.String> defaultResponsePlatforms) {
    this.defaultResponsePlatforms = defaultResponsePlatforms;
    return this;
  }

  /**
   * Required. The name of this intent.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * Required. The name of this intent.
   * @param displayName displayName or {@code null} for none
   */
  public GoogleCloudDialogflowV2Intent setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * Optional. The collection of event names that trigger the intent. If the collection of input
   * contexts is not empty, all of the contexts must be present in the active user session for an
   * event to trigger this intent.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getEvents() {
    return events;
  }

  /**
   * Optional. The collection of event names that trigger the intent. If the collection of input
   * contexts is not empty, all of the contexts must be present in the active user session for an
   * event to trigger this intent.
   * @param events events or {@code null} for none
   */
  public GoogleCloudDialogflowV2Intent setEvents(java.util.List<java.lang.String> events) {
    this.events = events;
    return this;
  }

  /**
   * Read-only. Information about all followup intents that have this intent as a direct or indirect
   * parent. We populate this field only in the output.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudDialogflowV2IntentFollowupIntentInfo> getFollowupIntentInfo() {
    return followupIntentInfo;
  }

  /**
   * Read-only. Information about all followup intents that have this intent as a direct or indirect
   * parent. We populate this field only in the output.
   * @param followupIntentInfo followupIntentInfo or {@code null} for none
   */
  public GoogleCloudDialogflowV2Intent setFollowupIntentInfo(java.util.List<GoogleCloudDialogflowV2IntentFollowupIntentInfo> followupIntentInfo) {
    this.followupIntentInfo = followupIntentInfo;
    return this;
  }

  /**
   * Optional. The list of context names required for this intent to be triggered. Format:
   * `projects//agent/sessions/-/contexts/`.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getInputContextNames() {
    return inputContextNames;
  }

  /**
   * Optional. The list of context names required for this intent to be triggered. Format:
   * `projects//agent/sessions/-/contexts/`.
   * @param inputContextNames inputContextNames or {@code null} for none
   */
  public GoogleCloudDialogflowV2Intent setInputContextNames(java.util.List<java.lang.String> inputContextNames) {
    this.inputContextNames = inputContextNames;
    return this;
  }

  /**
   * Optional. Indicates whether this is a fallback intent.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getIsFallback() {
    return isFallback;
  }

  /**
   * Optional. Indicates whether this is a fallback intent.
   * @param isFallback isFallback or {@code null} for none
   */
  public GoogleCloudDialogflowV2Intent setIsFallback(java.lang.Boolean isFallback) {
    this.isFallback = isFallback;
    return this;
  }

  /**
   * Optional. The collection of rich messages corresponding to the `Response` field in the
   * Dialogflow console.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudDialogflowV2IntentMessage> getMessages() {
    return messages;
  }

  /**
   * Optional. The collection of rich messages corresponding to the `Response` field in the
   * Dialogflow console.
   * @param messages messages or {@code null} for none
   */
  public GoogleCloudDialogflowV2Intent setMessages(java.util.List<GoogleCloudDialogflowV2IntentMessage> messages) {
    this.messages = messages;
    return this;
  }

  /**
   * Optional. Indicates whether Machine Learning is disabled for the intent. Note: If `ml_diabled`
   * setting is set to true, then this intent is not taken into account during inference in `ML
   * ONLY` match mode. Also, auto-markup in the UI is turned off.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getMlDisabled() {
    return mlDisabled;
  }

  /**
   * Optional. Indicates whether Machine Learning is disabled for the intent. Note: If `ml_diabled`
   * setting is set to true, then this intent is not taken into account during inference in `ML
   * ONLY` match mode. Also, auto-markup in the UI is turned off.
   * @param mlDisabled mlDisabled or {@code null} for none
   */
  public GoogleCloudDialogflowV2Intent setMlDisabled(java.lang.Boolean mlDisabled) {
    this.mlDisabled = mlDisabled;
    return this;
  }

  /**
   * Required for all methods except `create` (`create` populates the name automatically. The unique
   * identifier of this intent. Format: `projects//agent/intents/`.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Required for all methods except `create` (`create` populates the name automatically. The unique
   * identifier of this intent. Format: `projects//agent/intents/`.
   * @param name name or {@code null} for none
   */
  public GoogleCloudDialogflowV2Intent setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Optional. The collection of contexts that are activated when the intent is matched. Context
   * messages in this collection should not set the parameters field. Setting the `lifespan_count`
   * to 0 will reset the context when the intent is matched. Format:
   * `projects//agent/sessions/-/contexts/`.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudDialogflowV2Context> getOutputContexts() {
    return outputContexts;
  }

  /**
   * Optional. The collection of contexts that are activated when the intent is matched. Context
   * messages in this collection should not set the parameters field. Setting the `lifespan_count`
   * to 0 will reset the context when the intent is matched. Format:
   * `projects//agent/sessions/-/contexts/`.
   * @param outputContexts outputContexts or {@code null} for none
   */
  public GoogleCloudDialogflowV2Intent setOutputContexts(java.util.List<GoogleCloudDialogflowV2Context> outputContexts) {
    this.outputContexts = outputContexts;
    return this;
  }

  /**
   * Optional. The collection of parameters associated with the intent.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudDialogflowV2IntentParameter> getParameters() {
    return parameters;
  }

  /**
   * Optional. The collection of parameters associated with the intent.
   * @param parameters parameters or {@code null} for none
   */
  public GoogleCloudDialogflowV2Intent setParameters(java.util.List<GoogleCloudDialogflowV2IntentParameter> parameters) {
    this.parameters = parameters;
    return this;
  }

  /**
   * Read-only after creation. The unique identifier of the parent intent in the chain of followup
   * intents. You can set this field when creating an intent, for example with CreateIntent or
   * BatchUpdateIntents, in order to make this intent a followup intent.
   *
   * It identifies the parent followup intent. Format: `projects//agent/intents/`.
   * @return value or {@code null} for none
   */
  public java.lang.String getParentFollowupIntentName() {
    return parentFollowupIntentName;
  }

  /**
   * Read-only after creation. The unique identifier of the parent intent in the chain of followup
   * intents. You can set this field when creating an intent, for example with CreateIntent or
   * BatchUpdateIntents, in order to make this intent a followup intent.
   *
   * It identifies the parent followup intent. Format: `projects//agent/intents/`.
   * @param parentFollowupIntentName parentFollowupIntentName or {@code null} for none
   */
  public GoogleCloudDialogflowV2Intent setParentFollowupIntentName(java.lang.String parentFollowupIntentName) {
    this.parentFollowupIntentName = parentFollowupIntentName;
    return this;
  }

  /**
   * Optional. The priority of this intent. Higher numbers represent higher priorities. Zero or
   * negative numbers mean that the intent is disabled.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getPriority() {
    return priority;
  }

  /**
   * Optional. The priority of this intent. Higher numbers represent higher priorities. Zero or
   * negative numbers mean that the intent is disabled.
   * @param priority priority or {@code null} for none
   */
  public GoogleCloudDialogflowV2Intent setPriority(java.lang.Integer priority) {
    this.priority = priority;
    return this;
  }

  /**
   * Optional. Indicates whether to delete all contexts in the current session when this intent is
   * matched.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getResetContexts() {
    return resetContexts;
  }

  /**
   * Optional. Indicates whether to delete all contexts in the current session when this intent is
   * matched.
   * @param resetContexts resetContexts or {@code null} for none
   */
  public GoogleCloudDialogflowV2Intent setResetContexts(java.lang.Boolean resetContexts) {
    this.resetContexts = resetContexts;
    return this;
  }

  /**
   * Read-only. The unique identifier of the root intent in the chain of followup intents. It
   * identifies the correct followup intents chain for this intent. We populate this field only in
   * the output.
   *
   * Format: `projects//agent/intents/`.
   * @return value or {@code null} for none
   */
  public java.lang.String getRootFollowupIntentName() {
    return rootFollowupIntentName;
  }

  /**
   * Read-only. The unique identifier of the root intent in the chain of followup intents. It
   * identifies the correct followup intents chain for this intent. We populate this field only in
   * the output.
   *
   * Format: `projects//agent/intents/`.
   * @param rootFollowupIntentName rootFollowupIntentName or {@code null} for none
   */
  public GoogleCloudDialogflowV2Intent setRootFollowupIntentName(java.lang.String rootFollowupIntentName) {
    this.rootFollowupIntentName = rootFollowupIntentName;
    return this;
  }

  /**
   * Optional. The collection of examples/templates that the agent is trained on.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudDialogflowV2IntentTrainingPhrase> getTrainingPhrases() {
    return trainingPhrases;
  }

  /**
   * Optional. The collection of examples/templates that the agent is trained on.
   * @param trainingPhrases trainingPhrases or {@code null} for none
   */
  public GoogleCloudDialogflowV2Intent setTrainingPhrases(java.util.List<GoogleCloudDialogflowV2IntentTrainingPhrase> trainingPhrases) {
    this.trainingPhrases = trainingPhrases;
    return this;
  }

  /**
   * Optional. Indicates whether webhooks are enabled for the intent.
   * @return value or {@code null} for none
   */
  public java.lang.String getWebhookState() {
    return webhookState;
  }

  /**
   * Optional. Indicates whether webhooks are enabled for the intent.
   * @param webhookState webhookState or {@code null} for none
   */
  public GoogleCloudDialogflowV2Intent setWebhookState(java.lang.String webhookState) {
    this.webhookState = webhookState;
    return this;
  }

  @Override
  public GoogleCloudDialogflowV2Intent set(String fieldName, Object value) {
    return (GoogleCloudDialogflowV2Intent) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDialogflowV2Intent clone() {
    return (GoogleCloudDialogflowV2Intent) super.clone();
  }

}
