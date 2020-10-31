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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * ShippingOption
 */
@JsonPropertyOrder({
  ShippingOption.JSON_PROPERTY_NAME,
  ShippingOption.JSON_PROPERTY_AMOUNT,
  ShippingOption.JSON_PROPERTY_TOKEN,
  ShippingOption.JSON_PROPERTY_ESTIMATED_DAYS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-10-30T22:57:57.494324-07:00[America/Los_Angeles]")
public class ShippingOption {
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_AMOUNT = "amount";
  private Integer amount;

  public static final String JSON_PROPERTY_TOKEN = "token";
  private String token;

  public static final String JSON_PROPERTY_ESTIMATED_DAYS = "estimatedDays";
  private Integer estimatedDays;


  public ShippingOption name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public ShippingOption amount(Integer amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getAmount() {
    return amount;
  }


  public void setAmount(Integer amount) {
    this.amount = amount;
  }


  public ShippingOption token(String token) {
    
    this.token = token;
    return this;
  }

   /**
   * Get token
   * @return token
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_TOKEN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getToken() {
    return token;
  }


  public void setToken(String token) {
    this.token = token;
  }


  public ShippingOption estimatedDays(Integer estimatedDays) {
    
    this.estimatedDays = estimatedDays;
    return this;
  }

   /**
   * Get estimatedDays
   * @return estimatedDays
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_ESTIMATED_DAYS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getEstimatedDays() {
    return estimatedDays;
  }


  public void setEstimatedDays(Integer estimatedDays) {
    this.estimatedDays = estimatedDays;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShippingOption shippingOption = (ShippingOption) o;
    return Objects.equals(this.name, shippingOption.name) &&
        Objects.equals(this.amount, shippingOption.amount) &&
        Objects.equals(this.token, shippingOption.token) &&
        Objects.equals(this.estimatedDays, shippingOption.estimatedDays);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, amount, token, estimatedDays);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShippingOption {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    estimatedDays: ").append(toIndentedString(estimatedDays)).append("\n");
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

