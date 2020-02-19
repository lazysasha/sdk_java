package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.exception.BunqException;
import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.http.BunqResponse;
import com.bunq.sdk.http.BunqResponseRaw;
import com.bunq.sdk.model.core.AnchorObjectInterface;
import com.bunq.sdk.model.core.BunqModel;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;

import java.util.List;
import java.util.Map;

/**
 * List a users automatic payment auto allocated settings.
 */
public class PaymentAutoAllocateUser extends BunqModel implements AnchorObjectInterface {

    /**
     * Error constants.
     */
    protected static final String ERROR_NULL_FIELDS = "All fields of an extended model or object are null.";

    /**
     * Endpoint constants.
     */
    protected static final String ENDPOINT_URL_LISTING = "user/%s/payment-auto-allocate";

    /**
     * Object type.
     */
    protected static final String OBJECT_TYPE_GET = "PaymentAutoAllocate";

    /**
     *
     */
    @Expose
    @SerializedName("PaymentAutoAllocate")
    private PaymentAutoAllocate paymentAutoAllocate;

    /**
     *
     */
    public static BunqResponse<List<PaymentAutoAllocateUser>> list(Map<String, String> params, Map<String, String> customHeaders) {
        ApiClient apiClient = new ApiClient(getApiContext());
        BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_LISTING, determineUserId()), params, customHeaders);

        return fromJsonList(PaymentAutoAllocateUser.class, responseRaw, OBJECT_TYPE_GET);
    }

    public static BunqResponse<List<PaymentAutoAllocateUser>> list() {
        return list(null, null);
    }

    public static BunqResponse<List<PaymentAutoAllocateUser>> list(Map<String, String> params) {
        return list(params, null);
    }

    /**
     *
     */
    public static PaymentAutoAllocateUser fromJsonReader(JsonReader reader) {
        return fromJsonReader(PaymentAutoAllocateUser.class, reader);
    }

    /**
     *
     */
    public PaymentAutoAllocate getPaymentAutoAllocate() {
        return this.paymentAutoAllocate;
    }

    public void setPaymentAutoAllocate(PaymentAutoAllocate paymentAutoAllocate) {
        this.paymentAutoAllocate = paymentAutoAllocate;
    }

    /**
     *
     */
    public BunqModel getReferencedObject() {
        if (this.paymentAutoAllocate != null) {
            return this.paymentAutoAllocate;
        }

        throw new BunqException(ERROR_NULL_FIELDS);
    }

    /**
     *
     */
    public boolean isAllFieldNull() {
        if (this.paymentAutoAllocate != null) {
            return false;
        }

        return true;
    }

}
