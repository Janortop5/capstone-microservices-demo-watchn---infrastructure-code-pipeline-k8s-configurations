/*
 * Checkout API
 * Checkout API
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.watchn.ui.clients.checkout.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.watchn.ui.clients.checkout.model.CheckoutRequest;
import com.watchn.ui.clients.checkout.model.ShippingRates;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Checkout
 */
@JsonPropertyOrder({
  Checkout.JSON_PROPERTY_REQUEST,
  Checkout.JSON_PROPERTY_SHIPPING_RATES,
  Checkout.JSON_PROPERTY_PAYMENT_ID,
  Checkout.JSON_PROPERTY_PAYMENT_TOKEN,
  Checkout.JSON_PROPERTY_SHIPPING,
  Checkout.JSON_PROPERTY_TAX,
  Checkout.JSON_PROPERTY_TOTAL
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-10-30T22:57:57.494324-07:00[America/Los_Angeles]")
public class Checkout {
  public static final String JSON_PROPERTY_REQUEST = "request";
  private CheckoutRequest request;

  public static final String JSON_PROPERTY_SHIPPING_RATES = "shippingRates";
  private ShippingRates shippingRates;

  public static final String JSON_PROPERTY_PAYMENT_ID = "paymentId";
  private String paymentId;

  public static final String JSON_PROPERTY_PAYMENT_TOKEN = "paymentToken";
  private String paymentToken;

  public static final String JSON_PROPERTY_SHIPPING = "shipping";
  private Integer shipping;

  public static final String JSON_PROPERTY_TAX = "tax";
  private Integer tax;

  public static final String JSON_PROPERTY_TOTAL = "total";
  private Integer total;


  public Checkout request(CheckoutRequest request) {
    
    this.request = request;
    return this;
  }

   /**
   * Get request
   * @return request
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_REQUEST)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public CheckoutRequest getRequest() {
    return request;
  }


  public void setRequest(CheckoutRequest request) {
    this.request = request;
  }


  public Checkout shippingRates(ShippingRates shippingRates) {
    
    this.shippingRates = shippingRates;
    return this;
  }

   /**
   * Get shippingRates
   * @return shippingRates
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_SHIPPING_RATES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public ShippingRates getShippingRates() {
    return shippingRates;
  }


  public void setShippingRates(ShippingRates shippingRates) {
    this.shippingRates = shippingRates;
  }


  public Checkout paymentId(String paymentId) {
    
    this.paymentId = paymentId;
    return this;
  }

   /**
   * Get paymentId
   * @return paymentId
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_PAYMENT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getPaymentId() {
    return paymentId;
  }


  public void setPaymentId(String paymentId) {
    this.paymentId = paymentId;
  }


  public Checkout paymentToken(String paymentToken) {
    
    this.paymentToken = paymentToken;
    return this;
  }

   /**
   * Get paymentToken
   * @return paymentToken
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_PAYMENT_TOKEN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getPaymentToken() {
    return paymentToken;
  }


  public void setPaymentToken(String paymentToken) {
    this.paymentToken = paymentToken;
  }


  public Checkout shipping(Integer shipping) {
    
    this.shipping = shipping;
    return this;
  }

   /**
   * Get shipping
   * minimum: -1
   * @return shipping
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_SHIPPING)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getShipping() {
    return shipping;
  }


  public void setShipping(Integer shipping) {
    this.shipping = shipping;
  }


  public Checkout tax(Integer tax) {
    
    this.tax = tax;
    return this;
  }

   /**
   * Get tax
   * minimum: -1
   * @return tax
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_TAX)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getTax() {
    return tax;
  }


  public void setTax(Integer tax) {
    this.tax = tax;
  }


  public Checkout total(Integer total) {
    
    this.total = total;
    return this;
  }

   /**
   * Get total
   * minimum: -1
   * @return total
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_TOTAL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getTotal() {
    return total;
  }


  public void setTotal(Integer total) {
    this.total = total;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Checkout checkout = (Checkout) o;
    return Objects.equals(this.request, checkout.request) &&
        Objects.equals(this.shippingRates, checkout.shippingRates) &&
        Objects.equals(this.paymentId, checkout.paymentId) &&
        Objects.equals(this.paymentToken, checkout.paymentToken) &&
        Objects.equals(this.shipping, checkout.shipping) &&
        Objects.equals(this.tax, checkout.tax) &&
        Objects.equals(this.total, checkout.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(request, shippingRates, paymentId, paymentToken, shipping, tax, total);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Checkout {\n");
    sb.append("    request: ").append(toIndentedString(request)).append("\n");
    sb.append("    shippingRates: ").append(toIndentedString(shippingRates)).append("\n");
    sb.append("    paymentId: ").append(toIndentedString(paymentId)).append("\n");
    sb.append("    paymentToken: ").append(toIndentedString(paymentToken)).append("\n");
    sb.append("    shipping: ").append(toIndentedString(shipping)).append("\n");
    sb.append("    tax: ").append(toIndentedString(tax)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

