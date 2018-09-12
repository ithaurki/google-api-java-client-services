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

package com.google.speech.v1.model;

/**
 * Provides information to the recognizer that specifies how to process the request.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Speech API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class RecognitionConfig extends com.google.api.client.json.GenericJson {

  /**
   * *Optional* If 'true', adds punctuation to recognition result hypotheses. This feature is only
   * available in select languages. Setting this for requests in other languages has no effect at
   * all. The default 'false' value does not add punctuation to result hypotheses. Note: This is
   * currently offered as an experimental service, complimentary to all users. In the future this
   * may be exclusively available as a premium feature.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean enableAutomaticPunctuation;

  /**
   * *Optional* If `true`, the top result includes a list of words and the start and end time
   * offsets (timestamps) for those words. If `false`, no word-level time offset information is
   * returned. The default is `false`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean enableWordTimeOffsets;

  /**
   * Encoding of audio data sent in all `RecognitionAudio` messages. This field is optional for
   * `FLAC` and `WAV` audio files and required for all other audio formats. For details, see
   * AudioEncoding.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String encoding;

  /**
   * *Required* The language of the supplied audio as a [BCP-47](https://www.rfc-
   * editor.org/rfc/bcp/bcp47.txt) language tag. Example: "en-US". See [Language Support](/speech-
   * to-text/docs/languages) for a list of the currently supported language codes.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String languageCode;

  /**
   * *Optional* Maximum number of recognition hypotheses to be returned. Specifically, the maximum
   * number of `SpeechRecognitionAlternative` messages within each `SpeechRecognitionResult`. The
   * server may return fewer than `max_alternatives`. Valid values are `0`-`30`. A value of `0` or
   * `1` will return a maximum of one. If omitted, will return a maximum of one.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer maxAlternatives;

  /**
   * *Optional* Which model to select for the given request. Select the model best suited to your
   * domain to get best results. If a model is not explicitly specified, then we auto-select a model
   * based on the parameters in the RecognitionConfig.
   *
   *        Model     Description           command_and_search     Best for short queries such as
   * voice commands or voice search.           phone_call     Best for audio that originated from a
   * phone call (typically     recorded at an 8khz sampling rate).           video     Best for
   * audio that originated from from video or includes multiple         speakers. Ideally the audio
   * is recorded at a 16khz or greater         sampling rate. This is a premium model that costs
   * more than the         standard rate.           default     Best for audio that is not one of
   * the specific audio models.         For example, long-form audio. Ideally the audio is high-
   * fidelity,         recorded at a 16khz or greater sampling rate.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String model;

  /**
   * *Optional* If set to `true`, the server will attempt to filter out profanities, replacing all
   * but the initial character in each filtered word with asterisks, e.g. "f***". If set to `false`
   * or omitted, profanities won't be filtered out.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean profanityFilter;

  /**
   * Sample rate in Hertz of the audio data sent in all `RecognitionAudio` messages. Valid values
   * are: 8000-48000. 16000 is optimal. For best results, set the sampling rate of the audio source
   * to 16000 Hz. If that's not possible, use the native sample rate of the audio source (instead of
   * re-sampling). This field is optional for `FLAC` and `WAV` audio files and required for all
   * other audio formats. For details, see AudioEncoding.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer sampleRateHertz;

  /**
   * *Optional* array of SpeechContext. A means to provide context to assist the speech recognition.
   * For more information, see [Phrase Hints](/speech-to-text/docs/basics#phrase-hints).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<SpeechContext> speechContexts;

  /**
   * *Optional* Set to true to use an enhanced model for speech recognition. You must also set the
   * `model` field to a valid, enhanced model. If `use_enhanced` is set to true and the `model`
   * field is not set, then `use_enhanced` is ignored. If `use_enhanced` is true and an enhanced
   * version of the specified model does not exist, then the speech is recognized using the standard
   * version of the specified model.
   *
   * Enhanced speech models require that you opt-in to data logging using instructions in the
   * [documentation](/speech-to-text/enable-data-logging). If you set `use_enhanced` to true and you
   * have not enabled audio logging, then you will receive an error.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean useEnhanced;

  /**
   * *Optional* If 'true', adds punctuation to recognition result hypotheses. This feature is only
   * available in select languages. Setting this for requests in other languages has no effect at
   * all. The default 'false' value does not add punctuation to result hypotheses. Note: This is
   * currently offered as an experimental service, complimentary to all users. In the future this
   * may be exclusively available as a premium feature.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getEnableAutomaticPunctuation() {
    return enableAutomaticPunctuation;
  }

  /**
   * *Optional* If 'true', adds punctuation to recognition result hypotheses. This feature is only
   * available in select languages. Setting this for requests in other languages has no effect at
   * all. The default 'false' value does not add punctuation to result hypotheses. Note: This is
   * currently offered as an experimental service, complimentary to all users. In the future this
   * may be exclusively available as a premium feature.
   * @param enableAutomaticPunctuation enableAutomaticPunctuation or {@code null} for none
   */
  public RecognitionConfig setEnableAutomaticPunctuation(java.lang.Boolean enableAutomaticPunctuation) {
    this.enableAutomaticPunctuation = enableAutomaticPunctuation;
    return this;
  }

  /**
   * *Optional* If `true`, the top result includes a list of words and the start and end time
   * offsets (timestamps) for those words. If `false`, no word-level time offset information is
   * returned. The default is `false`.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getEnableWordTimeOffsets() {
    return enableWordTimeOffsets;
  }

  /**
   * *Optional* If `true`, the top result includes a list of words and the start and end time
   * offsets (timestamps) for those words. If `false`, no word-level time offset information is
   * returned. The default is `false`.
   * @param enableWordTimeOffsets enableWordTimeOffsets or {@code null} for none
   */
  public RecognitionConfig setEnableWordTimeOffsets(java.lang.Boolean enableWordTimeOffsets) {
    this.enableWordTimeOffsets = enableWordTimeOffsets;
    return this;
  }

  /**
   * Encoding of audio data sent in all `RecognitionAudio` messages. This field is optional for
   * `FLAC` and `WAV` audio files and required for all other audio formats. For details, see
   * AudioEncoding.
   * @return value or {@code null} for none
   */
  public java.lang.String getEncoding() {
    return encoding;
  }

  /**
   * Encoding of audio data sent in all `RecognitionAudio` messages. This field is optional for
   * `FLAC` and `WAV` audio files and required for all other audio formats. For details, see
   * AudioEncoding.
   * @param encoding encoding or {@code null} for none
   */
  public RecognitionConfig setEncoding(java.lang.String encoding) {
    this.encoding = encoding;
    return this;
  }

  /**
   * *Required* The language of the supplied audio as a [BCP-47](https://www.rfc-
   * editor.org/rfc/bcp/bcp47.txt) language tag. Example: "en-US". See [Language Support](/speech-
   * to-text/docs/languages) for a list of the currently supported language codes.
   * @return value or {@code null} for none
   */
  public java.lang.String getLanguageCode() {
    return languageCode;
  }

  /**
   * *Required* The language of the supplied audio as a [BCP-47](https://www.rfc-
   * editor.org/rfc/bcp/bcp47.txt) language tag. Example: "en-US". See [Language Support](/speech-
   * to-text/docs/languages) for a list of the currently supported language codes.
   * @param languageCode languageCode or {@code null} for none
   */
  public RecognitionConfig setLanguageCode(java.lang.String languageCode) {
    this.languageCode = languageCode;
    return this;
  }

  /**
   * *Optional* Maximum number of recognition hypotheses to be returned. Specifically, the maximum
   * number of `SpeechRecognitionAlternative` messages within each `SpeechRecognitionResult`. The
   * server may return fewer than `max_alternatives`. Valid values are `0`-`30`. A value of `0` or
   * `1` will return a maximum of one. If omitted, will return a maximum of one.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getMaxAlternatives() {
    return maxAlternatives;
  }

  /**
   * *Optional* Maximum number of recognition hypotheses to be returned. Specifically, the maximum
   * number of `SpeechRecognitionAlternative` messages within each `SpeechRecognitionResult`. The
   * server may return fewer than `max_alternatives`. Valid values are `0`-`30`. A value of `0` or
   * `1` will return a maximum of one. If omitted, will return a maximum of one.
   * @param maxAlternatives maxAlternatives or {@code null} for none
   */
  public RecognitionConfig setMaxAlternatives(java.lang.Integer maxAlternatives) {
    this.maxAlternatives = maxAlternatives;
    return this;
  }

  /**
   * *Optional* Which model to select for the given request. Select the model best suited to your
   * domain to get best results. If a model is not explicitly specified, then we auto-select a model
   * based on the parameters in the RecognitionConfig.
   *
   *        Model     Description           command_and_search     Best for short queries such as
   * voice commands or voice search.           phone_call     Best for audio that originated from a
   * phone call (typically     recorded at an 8khz sampling rate).           video     Best for
   * audio that originated from from video or includes multiple         speakers. Ideally the audio
   * is recorded at a 16khz or greater         sampling rate. This is a premium model that costs
   * more than the         standard rate.           default     Best for audio that is not one of
   * the specific audio models.         For example, long-form audio. Ideally the audio is high-
   * fidelity,         recorded at a 16khz or greater sampling rate.
   * @return value or {@code null} for none
   */
  public java.lang.String getModel() {
    return model;
  }

  /**
   * *Optional* Which model to select for the given request. Select the model best suited to your
   * domain to get best results. If a model is not explicitly specified, then we auto-select a model
   * based on the parameters in the RecognitionConfig.
   *
   *        Model     Description           command_and_search     Best for short queries such as
   * voice commands or voice search.           phone_call     Best for audio that originated from a
   * phone call (typically     recorded at an 8khz sampling rate).           video     Best for
   * audio that originated from from video or includes multiple         speakers. Ideally the audio
   * is recorded at a 16khz or greater         sampling rate. This is a premium model that costs
   * more than the         standard rate.           default     Best for audio that is not one of
   * the specific audio models.         For example, long-form audio. Ideally the audio is high-
   * fidelity,         recorded at a 16khz or greater sampling rate.
   * @param model model or {@code null} for none
   */
  public RecognitionConfig setModel(java.lang.String model) {
    this.model = model;
    return this;
  }

  /**
   * *Optional* If set to `true`, the server will attempt to filter out profanities, replacing all
   * but the initial character in each filtered word with asterisks, e.g. "f***". If set to `false`
   * or omitted, profanities won't be filtered out.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getProfanityFilter() {
    return profanityFilter;
  }

  /**
   * *Optional* If set to `true`, the server will attempt to filter out profanities, replacing all
   * but the initial character in each filtered word with asterisks, e.g. "f***". If set to `false`
   * or omitted, profanities won't be filtered out.
   * @param profanityFilter profanityFilter or {@code null} for none
   */
  public RecognitionConfig setProfanityFilter(java.lang.Boolean profanityFilter) {
    this.profanityFilter = profanityFilter;
    return this;
  }

  /**
   * Sample rate in Hertz of the audio data sent in all `RecognitionAudio` messages. Valid values
   * are: 8000-48000. 16000 is optimal. For best results, set the sampling rate of the audio source
   * to 16000 Hz. If that's not possible, use the native sample rate of the audio source (instead of
   * re-sampling). This field is optional for `FLAC` and `WAV` audio files and required for all
   * other audio formats. For details, see AudioEncoding.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getSampleRateHertz() {
    return sampleRateHertz;
  }

  /**
   * Sample rate in Hertz of the audio data sent in all `RecognitionAudio` messages. Valid values
   * are: 8000-48000. 16000 is optimal. For best results, set the sampling rate of the audio source
   * to 16000 Hz. If that's not possible, use the native sample rate of the audio source (instead of
   * re-sampling). This field is optional for `FLAC` and `WAV` audio files and required for all
   * other audio formats. For details, see AudioEncoding.
   * @param sampleRateHertz sampleRateHertz or {@code null} for none
   */
  public RecognitionConfig setSampleRateHertz(java.lang.Integer sampleRateHertz) {
    this.sampleRateHertz = sampleRateHertz;
    return this;
  }

  /**
   * *Optional* array of SpeechContext. A means to provide context to assist the speech recognition.
   * For more information, see [Phrase Hints](/speech-to-text/docs/basics#phrase-hints).
   * @return value or {@code null} for none
   */
  public java.util.List<SpeechContext> getSpeechContexts() {
    return speechContexts;
  }

  /**
   * *Optional* array of SpeechContext. A means to provide context to assist the speech recognition.
   * For more information, see [Phrase Hints](/speech-to-text/docs/basics#phrase-hints).
   * @param speechContexts speechContexts or {@code null} for none
   */
  public RecognitionConfig setSpeechContexts(java.util.List<SpeechContext> speechContexts) {
    this.speechContexts = speechContexts;
    return this;
  }

  /**
   * *Optional* Set to true to use an enhanced model for speech recognition. You must also set the
   * `model` field to a valid, enhanced model. If `use_enhanced` is set to true and the `model`
   * field is not set, then `use_enhanced` is ignored. If `use_enhanced` is true and an enhanced
   * version of the specified model does not exist, then the speech is recognized using the standard
   * version of the specified model.
   *
   * Enhanced speech models require that you opt-in to data logging using instructions in the
   * [documentation](/speech-to-text/enable-data-logging). If you set `use_enhanced` to true and you
   * have not enabled audio logging, then you will receive an error.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getUseEnhanced() {
    return useEnhanced;
  }

  /**
   * *Optional* Set to true to use an enhanced model for speech recognition. You must also set the
   * `model` field to a valid, enhanced model. If `use_enhanced` is set to true and the `model`
   * field is not set, then `use_enhanced` is ignored. If `use_enhanced` is true and an enhanced
   * version of the specified model does not exist, then the speech is recognized using the standard
   * version of the specified model.
   *
   * Enhanced speech models require that you opt-in to data logging using instructions in the
   * [documentation](/speech-to-text/enable-data-logging). If you set `use_enhanced` to true and you
   * have not enabled audio logging, then you will receive an error.
   * @param useEnhanced useEnhanced or {@code null} for none
   */
  public RecognitionConfig setUseEnhanced(java.lang.Boolean useEnhanced) {
    this.useEnhanced = useEnhanced;
    return this;
  }

  @Override
  public RecognitionConfig set(String fieldName, Object value) {
    return (RecognitionConfig) super.set(fieldName, value);
  }

  @Override
  public RecognitionConfig clone() {
    return (RecognitionConfig) super.clone();
  }

}
