package com.bunq.sdk.model.generated.object;

import com.bunq.sdk.model.BunqModel;
import com.bunq.sdk.model.MonetaryAccountReference;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 */
public class Amount extends BunqModel {

  /**
   * The amount formatted to two decimal places.
   */
  @Expose
  @SerializedName("value")
  private String value;

  /**
   * The currency of the amount. It is an ISO 4217 formatted currency code.
   */
  @Expose
  @SerializedName("currency")
  private String currency;

  public Amount(String value, String currency) {
    this.value = value;
    this.currency = currency;
  }

  /**
   * The amount formatted to two decimal places.
   */
  public String getValue() {
    return this.value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  /**
   * The currency of the amount. It is an ISO 4217 formatted currency code.
   */
  public String getCurrency() {
    return this.currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

}
