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
 * Monitoring configuration of the service.
 *
 * The example below shows how to configure monitored resources and metrics for monitoring. In the
 * example, a monitored resource and two metrics are defined. The
 * `library.googleapis.com/book/returned_count` metric is sent to both producer and consumer
 * projects, whereas the `library.googleapis.com/book/overdue_count` metric is only sent to the
 * consumer project.
 *
 *     monitored_resources:     - type: library.googleapis.com/branch       labels:       - key:
 * /city         description: The city where the library branch is located in.       - key: /name
 * description: The name of the branch.     metrics:     - name:
 * library.googleapis.com/book/returned_count       metric_kind: DELTA       value_type: INT64
 * labels:       - key: /customer_id     - name: library.googleapis.com/book/overdue_count
 * metric_kind: GAUGE       value_type: INT64       labels:       - key: /customer_id
 * monitoring:       producer_destinations:       - monitored_resource:
 * library.googleapis.com/branch         metrics:         -
 * library.googleapis.com/book/returned_count       consumer_destinations:       -
 * monitored_resource: library.googleapis.com/branch         metrics:         -
 * library.googleapis.com/book/returned_count         - library.googleapis.com/book/overdue_count
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Service Usage API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Monitoring extends com.google.api.client.json.GenericJson {

  /**
   * Monitoring configurations for sending metrics to the consumer project. There can be multiple
   * consumer destinations, each one must have a different monitored resource type. A metric can be
   * used in at most one consumer destination.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<MonitoringDestination> consumerDestinations;

  /**
   * Monitoring configurations for sending metrics to the producer project. There can be multiple
   * producer destinations, each one must have a different monitored resource type. A metric can be
   * used in at most one producer destination.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<MonitoringDestination> producerDestinations;

  /**
   * Monitoring configurations for sending metrics to the consumer project. There can be multiple
   * consumer destinations, each one must have a different monitored resource type. A metric can be
   * used in at most one consumer destination.
   * @return value or {@code null} for none
   */
  public java.util.List<MonitoringDestination> getConsumerDestinations() {
    return consumerDestinations;
  }

  /**
   * Monitoring configurations for sending metrics to the consumer project. There can be multiple
   * consumer destinations, each one must have a different monitored resource type. A metric can be
   * used in at most one consumer destination.
   * @param consumerDestinations consumerDestinations or {@code null} for none
   */
  public Monitoring setConsumerDestinations(java.util.List<MonitoringDestination> consumerDestinations) {
    this.consumerDestinations = consumerDestinations;
    return this;
  }

  /**
   * Monitoring configurations for sending metrics to the producer project. There can be multiple
   * producer destinations, each one must have a different monitored resource type. A metric can be
   * used in at most one producer destination.
   * @return value or {@code null} for none
   */
  public java.util.List<MonitoringDestination> getProducerDestinations() {
    return producerDestinations;
  }

  /**
   * Monitoring configurations for sending metrics to the producer project. There can be multiple
   * producer destinations, each one must have a different monitored resource type. A metric can be
   * used in at most one producer destination.
   * @param producerDestinations producerDestinations or {@code null} for none
   */
  public Monitoring setProducerDestinations(java.util.List<MonitoringDestination> producerDestinations) {
    this.producerDestinations = producerDestinations;
    return this;
  }

  @Override
  public Monitoring set(String fieldName, Object value) {
    return (Monitoring) super.set(fieldName, value);
  }

  @Override
  public Monitoring clone() {
    return (Monitoring) super.clone();
  }

}
