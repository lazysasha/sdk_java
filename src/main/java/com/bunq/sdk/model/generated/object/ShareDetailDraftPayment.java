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
public class ShareDetailDraftPayment extends BunqModel {

  /**
   * If set to true, the invited user will be able to make draft payments from the shared account.
   */
  @Expose
  @SerializedName("make_draft_payments")
  private Boolean makeDraftPayments;

  /**
   * If set to true, the invited user will be able to view the account balance.
   */
  @Expose
  @SerializedName("view_balance")
  private Boolean viewBalance;

  /**
   * If set to true, the invited user will be able to view events from before the share was
   * active.
   */
  @Expose
  @SerializedName("view_old_events")
  private Boolean viewOldEvents;

  /**
   * If set to true, the invited user will be able to view events starting from the time the share
   * became active.
   */
  @Expose
  @SerializedName("view_new_events")
  private Boolean viewNewEvents;

  public ShareDetailDraftPayment(Boolean makeDraftPayments, Boolean viewBalance, Boolean viewOldEvents, Boolean viewNewEvents) {
    this.makeDraftPayments = makeDraftPayments;
    this.viewBalance = viewBalance;
    this.viewOldEvents = viewOldEvents;
    this.viewNewEvents = viewNewEvents;
  }

  /**
   * If set to true, the invited user will be able to make draft payments from the shared account.
   */
  public Boolean getMakeDraftPayments() {
    return this.makeDraftPayments;
  }

  public void setMakeDraftPayments(Boolean makeDraftPayments) {
    this.makeDraftPayments = makeDraftPayments;
  }

  /**
   * If set to true, the invited user will be able to view the account balance.
   */
  public Boolean getViewBalance() {
    return this.viewBalance;
  }

  public void setViewBalance(Boolean viewBalance) {
    this.viewBalance = viewBalance;
  }

  /**
   * If set to true, the invited user will be able to view events from before the share was
   * active.
   */
  public Boolean getViewOldEvents() {
    return this.viewOldEvents;
  }

  public void setViewOldEvents(Boolean viewOldEvents) {
    this.viewOldEvents = viewOldEvents;
  }

  /**
   * If set to true, the invited user will be able to view events starting from the time the share
   * became active.
   */
  public Boolean getViewNewEvents() {
    return this.viewNewEvents;
  }

  public void setViewNewEvents(Boolean viewNewEvents) {
    this.viewNewEvents = viewNewEvents;
  }

}
