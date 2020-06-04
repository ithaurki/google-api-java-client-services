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

package com.google.api.services.content.model;

/**
 * Model definition for OrderShipment.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Content API for Shopping. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class OrderShipment extends com.google.api.client.json.GenericJson {

  /**
   * The carrier handling the shipment.
   *
   * For supported carriers, Google includes the carrier name and tracking URL in emails to
   * customers. For select supported carriers, Google also automatically updates the shipment status
   * based on the provided shipment ID. Note: You can also use unsupported carriers, but emails to
   * customers will not include the carrier name or tracking URL, and there will be no automatic
   * order status updates.  Supported carriers for US are:   - "`ups`" (United Parcel Service)
   * automatic status updates  - "`usps`" (United States Postal Service) automatic status updates  -
   * "`fedex`" (FedEx) automatic status updates   - "`dhl`" (DHL eCommerce) automatic status updates
   * (US only)  - "`ontrac`" (OnTrac) automatic status updates   - "`dhl express`" (DHL Express) -
   * "`deliv`" (Deliv)  - "`dynamex`" (TForce)  - "`lasership`" (LaserShip)  - "`mpx`" (Military
   * Parcel Xpress)  - "`uds`" (United Delivery Service)  - "`efw`" (Estes Forwarding Worldwide)  -
   * "`jd logistics`" (JD Logistics)  - "`yunexpress`" (YunExpress)  - "`china post`" (China Post)
   * - "`china ems`" (China Post Express Mail Service)  - "`singapore post`" (Singapore Post)  -
   * "`pos malaysia`" (Pos Malaysia)  - "`postnl`" (PostNL)  - "`ptt`" (PTT Turkish Post)  - "`eub`"
   * (ePacket)  - "`chukou1`" (Chukou1 Logistics)   Supported carriers for FR are:   - "`la poste`"
   * (La Poste) automatic status updates   - "`colissimo`" (Colissimo by La Poste) automatic status
   * updates  - "`ups`" (United Parcel Service) automatic status updates   - "`chronopost`"
   * (Chronopost by La Poste)  - "`gls`" (General Logistics Systems France)  - "`dpd`" (DPD Group by
   * GeoPost)  - "`bpost`" (Belgian Post Group)  - "`colis prive`" (Colis Privé)  - "`boxtal`"
   * (Boxtal)  - "`geodis`" (GEODIS)  - "`tnt`" (TNT)  - "`db schenker`" (DB Schenker)  - "`aramex`"
   * (Aramex)
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String carrier;

  /**
   * Date on which the shipment has been created, in ISO 8601 format.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String creationDate;

  /**
   * Date on which the shipment has been delivered, in ISO 8601 format. Present only if `status` is
   * `delivered`
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String deliveryDate;

  /**
   * The ID of the shipment.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String id;

  /**
   * The line items that are shipped.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<OrderShipmentLineItemShipment> lineItems;

  /**
   * Delivery details of the shipment if scheduling is needed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private OrderShipmentScheduledDeliveryDetails scheduledDeliveryDetails;

  /**
   * The status of the shipment.
   *
   * Acceptable values are:   - "`delivered`"  - "`readyForPickup`"  - "`shipped`"  -
   * "`undeliverable`"
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String status;

  /**
   * The tracking ID for the shipment.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String trackingId;

  /**
   * The carrier handling the shipment.
   *
   * For supported carriers, Google includes the carrier name and tracking URL in emails to
   * customers. For select supported carriers, Google also automatically updates the shipment status
   * based on the provided shipment ID. Note: You can also use unsupported carriers, but emails to
   * customers will not include the carrier name or tracking URL, and there will be no automatic
   * order status updates.  Supported carriers for US are:   - "`ups`" (United Parcel Service)
   * automatic status updates  - "`usps`" (United States Postal Service) automatic status updates  -
   * "`fedex`" (FedEx) automatic status updates   - "`dhl`" (DHL eCommerce) automatic status updates
   * (US only)  - "`ontrac`" (OnTrac) automatic status updates   - "`dhl express`" (DHL Express) -
   * "`deliv`" (Deliv)  - "`dynamex`" (TForce)  - "`lasership`" (LaserShip)  - "`mpx`" (Military
   * Parcel Xpress)  - "`uds`" (United Delivery Service)  - "`efw`" (Estes Forwarding Worldwide)  -
   * "`jd logistics`" (JD Logistics)  - "`yunexpress`" (YunExpress)  - "`china post`" (China Post)
   * - "`china ems`" (China Post Express Mail Service)  - "`singapore post`" (Singapore Post)  -
   * "`pos malaysia`" (Pos Malaysia)  - "`postnl`" (PostNL)  - "`ptt`" (PTT Turkish Post)  - "`eub`"
   * (ePacket)  - "`chukou1`" (Chukou1 Logistics)   Supported carriers for FR are:   - "`la poste`"
   * (La Poste) automatic status updates   - "`colissimo`" (Colissimo by La Poste) automatic status
   * updates  - "`ups`" (United Parcel Service) automatic status updates   - "`chronopost`"
   * (Chronopost by La Poste)  - "`gls`" (General Logistics Systems France)  - "`dpd`" (DPD Group by
   * GeoPost)  - "`bpost`" (Belgian Post Group)  - "`colis prive`" (Colis Privé)  - "`boxtal`"
   * (Boxtal)  - "`geodis`" (GEODIS)  - "`tnt`" (TNT)  - "`db schenker`" (DB Schenker)  - "`aramex`"
   * (Aramex)
   * @return value or {@code null} for none
   */
  public java.lang.String getCarrier() {
    return carrier;
  }

  /**
   * The carrier handling the shipment.
   *
   * For supported carriers, Google includes the carrier name and tracking URL in emails to
   * customers. For select supported carriers, Google also automatically updates the shipment status
   * based on the provided shipment ID. Note: You can also use unsupported carriers, but emails to
   * customers will not include the carrier name or tracking URL, and there will be no automatic
   * order status updates.  Supported carriers for US are:   - "`ups`" (United Parcel Service)
   * automatic status updates  - "`usps`" (United States Postal Service) automatic status updates  -
   * "`fedex`" (FedEx) automatic status updates   - "`dhl`" (DHL eCommerce) automatic status updates
   * (US only)  - "`ontrac`" (OnTrac) automatic status updates   - "`dhl express`" (DHL Express) -
   * "`deliv`" (Deliv)  - "`dynamex`" (TForce)  - "`lasership`" (LaserShip)  - "`mpx`" (Military
   * Parcel Xpress)  - "`uds`" (United Delivery Service)  - "`efw`" (Estes Forwarding Worldwide)  -
   * "`jd logistics`" (JD Logistics)  - "`yunexpress`" (YunExpress)  - "`china post`" (China Post)
   * - "`china ems`" (China Post Express Mail Service)  - "`singapore post`" (Singapore Post)  -
   * "`pos malaysia`" (Pos Malaysia)  - "`postnl`" (PostNL)  - "`ptt`" (PTT Turkish Post)  - "`eub`"
   * (ePacket)  - "`chukou1`" (Chukou1 Logistics)   Supported carriers for FR are:   - "`la poste`"
   * (La Poste) automatic status updates   - "`colissimo`" (Colissimo by La Poste) automatic status
   * updates  - "`ups`" (United Parcel Service) automatic status updates   - "`chronopost`"
   * (Chronopost by La Poste)  - "`gls`" (General Logistics Systems France)  - "`dpd`" (DPD Group by
   * GeoPost)  - "`bpost`" (Belgian Post Group)  - "`colis prive`" (Colis Privé)  - "`boxtal`"
   * (Boxtal)  - "`geodis`" (GEODIS)  - "`tnt`" (TNT)  - "`db schenker`" (DB Schenker)  - "`aramex`"
   * (Aramex)
   * @param carrier carrier or {@code null} for none
   */
  public OrderShipment setCarrier(java.lang.String carrier) {
    this.carrier = carrier;
    return this;
  }

  /**
   * Date on which the shipment has been created, in ISO 8601 format.
   * @return value or {@code null} for none
   */
  public java.lang.String getCreationDate() {
    return creationDate;
  }

  /**
   * Date on which the shipment has been created, in ISO 8601 format.
   * @param creationDate creationDate or {@code null} for none
   */
  public OrderShipment setCreationDate(java.lang.String creationDate) {
    this.creationDate = creationDate;
    return this;
  }

  /**
   * Date on which the shipment has been delivered, in ISO 8601 format. Present only if `status` is
   * `delivered`
   * @return value or {@code null} for none
   */
  public java.lang.String getDeliveryDate() {
    return deliveryDate;
  }

  /**
   * Date on which the shipment has been delivered, in ISO 8601 format. Present only if `status` is
   * `delivered`
   * @param deliveryDate deliveryDate or {@code null} for none
   */
  public OrderShipment setDeliveryDate(java.lang.String deliveryDate) {
    this.deliveryDate = deliveryDate;
    return this;
  }

  /**
   * The ID of the shipment.
   * @return value or {@code null} for none
   */
  public java.lang.String getId() {
    return id;
  }

  /**
   * The ID of the shipment.
   * @param id id or {@code null} for none
   */
  public OrderShipment setId(java.lang.String id) {
    this.id = id;
    return this;
  }

  /**
   * The line items that are shipped.
   * @return value or {@code null} for none
   */
  public java.util.List<OrderShipmentLineItemShipment> getLineItems() {
    return lineItems;
  }

  /**
   * The line items that are shipped.
   * @param lineItems lineItems or {@code null} for none
   */
  public OrderShipment setLineItems(java.util.List<OrderShipmentLineItemShipment> lineItems) {
    this.lineItems = lineItems;
    return this;
  }

  /**
   * Delivery details of the shipment if scheduling is needed.
   * @return value or {@code null} for none
   */
  public OrderShipmentScheduledDeliveryDetails getScheduledDeliveryDetails() {
    return scheduledDeliveryDetails;
  }

  /**
   * Delivery details of the shipment if scheduling is needed.
   * @param scheduledDeliveryDetails scheduledDeliveryDetails or {@code null} for none
   */
  public OrderShipment setScheduledDeliveryDetails(OrderShipmentScheduledDeliveryDetails scheduledDeliveryDetails) {
    this.scheduledDeliveryDetails = scheduledDeliveryDetails;
    return this;
  }

  /**
   * The status of the shipment.
   *
   * Acceptable values are:   - "`delivered`"  - "`readyForPickup`"  - "`shipped`"  -
   * "`undeliverable`"
   * @return value or {@code null} for none
   */
  public java.lang.String getStatus() {
    return status;
  }

  /**
   * The status of the shipment.
   *
   * Acceptable values are:   - "`delivered`"  - "`readyForPickup`"  - "`shipped`"  -
   * "`undeliverable`"
   * @param status status or {@code null} for none
   */
  public OrderShipment setStatus(java.lang.String status) {
    this.status = status;
    return this;
  }

  /**
   * The tracking ID for the shipment.
   * @return value or {@code null} for none
   */
  public java.lang.String getTrackingId() {
    return trackingId;
  }

  /**
   * The tracking ID for the shipment.
   * @param trackingId trackingId or {@code null} for none
   */
  public OrderShipment setTrackingId(java.lang.String trackingId) {
    this.trackingId = trackingId;
    return this;
  }

  @Override
  public OrderShipment set(String fieldName, Object value) {
    return (OrderShipment) super.set(fieldName, value);
  }

  @Override
  public OrderShipment clone() {
    return (OrderShipment) super.clone();
  }

}
