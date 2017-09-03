package com.bunq.sdk.model.generated;

import com.bunq.sdk.context.ApiContext;
import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.http.BunqResponse;
import com.bunq.sdk.http.BunqResponseRaw;
import com.bunq.sdk.model.BunqModel;
import com.bunq.sdk.model.generated.object.Address;
import com.bunq.sdk.model.generated.object.Amount;
import com.bunq.sdk.model.generated.object.Avatar;
import com.bunq.sdk.model.generated.object.NotificationFilter;
import com.bunq.sdk.model.generated.object.Pointer;
import com.bunq.sdk.model.generated.object.TaxResident;
import com.bunq.sdk.model.MonetaryAccountReference;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.lang.model.type.NullType;

/**
 * Show the authenticated user, if it is a person.
 */
public class UserPerson extends BunqModel {

  /**
   * Field constants.
   */
  public static final String FIELD_FIRST_NAME = "first_name";
  public static final String FIELD_MIDDLE_NAME = "middle_name";
  public static final String FIELD_LAST_NAME = "last_name";
  public static final String FIELD_PUBLIC_NICK_NAME = "public_nick_name";
  public static final String FIELD_ADDRESS_MAIN = "address_main";
  public static final String FIELD_ADDRESS_POSTAL = "address_postal";
  public static final String FIELD_AVATAR_UUID = "avatar_uuid";
  public static final String FIELD_TAX_RESIDENT = "tax_resident";
  public static final String FIELD_DOCUMENT_TYPE = "document_type";
  public static final String FIELD_DOCUMENT_NUMBER = "document_number";
  public static final String FIELD_DOCUMENT_COUNTRY_OF_ISSUANCE = "document_country_of_issuance";
  public static final String FIELD_DOCUMENT_FRONT_ATTACHMENT_ID = "document_front_attachment_id";
  public static final String FIELD_DOCUMENT_BACK_ATTACHMENT_ID = "document_back_attachment_id";
  public static final String FIELD_DATE_OF_BIRTH = "date_of_birth";
  public static final String FIELD_PLACE_OF_BIRTH = "place_of_birth";
  public static final String FIELD_COUNTRY_OF_BIRTH = "country_of_birth";
  public static final String FIELD_NATIONALITY = "nationality";
  public static final String FIELD_LANGUAGE = "language";
  public static final String FIELD_REGION = "region";
  public static final String FIELD_GENDER = "gender";
  public static final String FIELD_STATUS = "status";
  public static final String FIELD_SUB_STATUS = "sub_status";
  public static final String FIELD_LEGAL_GUARDIAN_ALIAS = "legal_guardian_alias";
  public static final String FIELD_SESSION_TIMEOUT = "session_timeout";
  public static final String FIELD_DAILY_LIMIT_WITHOUT_CONFIRMATION_LOGIN = "daily_limit_without_confirmation_login";
  public static final String FIELD_COUNTER_BANK_IBAN = "counter_bank_iban";
  public static final String FIELD_NOTIFICATION_FILTERS = "notification_filters";

  /**
   * Endpoint constants.
   */
  private static final String ENDPOINT_URL_READ = "user-person/%s";
  private static final String ENDPOINT_URL_UPDATE = "user-person/%s";

  /**
   * Object type.
   */
  private static final String OBJECT_TYPE = "UserPerson";

  /**
   * The id of the modified person object.
   */
  @Expose
  @SerializedName("id")
  private Integer id;

  /**
   * The timestamp of the person object's creation.
   */
  @Expose
  @SerializedName("created")
  private String created;

  /**
   * The timestamp of the person object's last update.
   */
  @Expose
  @SerializedName("updated")
  private String updated;

  /**
   * The person's public UUID.
   */
  @Expose
  @SerializedName("public_uuid")
  private String publicUuid;

  /**
   * The person's first name.
   */
  @Expose
  @SerializedName("first_name")
  private String firstName;

  /**
   * The person's middle name.
   */
  @Expose
  @SerializedName("middle_name")
  private String middleName;

  /**
   * The person's last name.
   */
  @Expose
  @SerializedName("last_name")
  private String lastName;

  /**
   * The person's legal name.
   */
  @Expose
  @SerializedName("legal_name")
  private String legalName;

  /**
   * The display name for the person.
   */
  @Expose
  @SerializedName("display_name")
  private String displayName;

  /**
   * The public nick name for the person.
   */
  @Expose
  @SerializedName("public_nick_name")
  private String publicNickName;

  /**
   * The aliases of the user.
   */
  @Expose
  @SerializedName("alias")
  private List<Pointer> alias;

  /**
   * The user's tax residence numbers for different countries.
   */
  @Expose
  @SerializedName("tax_resident")
  private List<TaxResident> taxResident;

  /**
   * The type of identification document the person registered with.
   */
  @Expose
  @SerializedName("document_type")
  private String documentType;

  /**
   * The identification document number the person registered with.
   */
  @Expose
  @SerializedName("document_number")
  private String documentNumber;

  /**
   * The country which issued the identification document the person registered with.
   */
  @Expose
  @SerializedName("document_country_of_issuance")
  private String documentCountryOfIssuance;

  /**
   * The person's main address.
   */
  @Expose
  @SerializedName("address_main")
  private Address addressMain;

  /**
   * The person's postal address.
   */
  @Expose
  @SerializedName("address_postal")
  private Address addressPostal;

  /**
   * The person's date of birth. Accepts ISO8601 date formats.
   */
  @Expose
  @SerializedName("date_of_birth")
  private String dateOfBirth;

  /**
   * The person's place of birth.
   */
  @Expose
  @SerializedName("place_of_birth")
  private String placeOfBirth;

  /**
   * The person's country of birth. Formatted as a SO 3166-1 alpha-2 country code.
   */
  @Expose
  @SerializedName("country_of_birth")
  private String countryOfBirth;

  /**
   * The person's nationality. Formatted as a SO 3166-1 alpha-2 country code.
   */
  @Expose
  @SerializedName("nationality")
  private String nationality;

  /**
   * The person's preferred language. Formatted as a ISO 639-1 language code plus a ISO 3166-1
   * alpha-2 country code, seperated by an underscore.
   */
  @Expose
  @SerializedName("language")
  private String language;

  /**
   * The person's preferred region. Formatted as a ISO 639-1 language code plus a ISO 3166-1
   * alpha-2 country code, seperated by an underscore.
   */
  @Expose
  @SerializedName("region")
  private String region;

  /**
   * The person's gender. Can be MALE, FEMALE or UNKNOWN.
   */
  @Expose
  @SerializedName("gender")
  private String gender;

  /**
   * The user's avatar.
   */
  @Expose
  @SerializedName("avatar")
  private Avatar avatar;

  /**
   * The version of the terms of service accepted by the user.
   */
  @Expose
  @SerializedName("version_terms_of_service")
  private String versionTermsOfService;

  /**
   * The user status. The user status. Can be: ACTIVE, BLOCKED, SIGNUP, RECOVERY, DENIED or
   * ABORTED.
   */
  @Expose
  @SerializedName("status")
  private String status;

  /**
   * The user sub-status. Can be: NONE, FACE_RESET, APPROVAL, APPROVAL_DIRECTOR, APPROVAL_PARENT,
   * APPROVAL_SUPPORT, COUNTER_IBAN, IDEAL or SUBMIT.
   */
  @Expose
  @SerializedName("sub_status")
  private String subStatus;

  /**
   * The setting for the session timeout of the user in seconds.
   */
  @Expose
  @SerializedName("session_timeout")
  private Integer sessionTimeout;

  /**
   * The amount the user can pay in the session without asking for credentials.
   */
  @Expose
  @SerializedName("daily_limit_without_confirmation_login")
  private Amount dailyLimitWithoutConfirmationLogin;

  /**
   * The types of notifications that will result in a push notification or URL callback for this
   * UserPerson.
   */
  @Expose
  @SerializedName("notification_filters")
  private List<NotificationFilter> notificationFilters;

  public static BunqResponse<UserPerson> get(ApiContext apiContext, Integer userPersonId) {
    return get(apiContext, userPersonId, new HashMap<>());
  }

  /**
   * Get a specific person.
   */
  public static BunqResponse<UserPerson> get(ApiContext apiContext, Integer userPersonId, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(apiContext);
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_READ, userPersonId), new HashMap<>(), customHeaders);

    return fromJson(UserPerson.class, responseRaw, OBJECT_TYPE);
  }

  public static BunqResponse<Integer> update(ApiContext apiContext, Map<String, Object> requestMap, Integer userPersonId) {
    return update(apiContext, requestMap, userPersonId, new HashMap<>());
  }

  /**
   * Modify a specific person object's data.
   */
  public static BunqResponse<Integer> update(ApiContext apiContext, Map<String, Object> requestMap, Integer userPersonId, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(apiContext);
    byte[] requestBytes = gson.toJson(requestMap).getBytes();
    BunqResponseRaw responseRaw = apiClient.put(String.format(ENDPOINT_URL_UPDATE, userPersonId), requestBytes, customHeaders);

    return processForId(responseRaw);
  }

  /**
   * The id of the modified person object.
   */
  public Integer getId() {
    return this.id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * The timestamp of the person object's creation.
   */
  public String getCreated() {
    return this.created;
  }

  public void setCreated(String created) {
    this.created = created;
  }

  /**
   * The timestamp of the person object's last update.
   */
  public String getUpdated() {
    return this.updated;
  }

  public void setUpdated(String updated) {
    this.updated = updated;
  }

  /**
   * The person's public UUID.
   */
  public String getPublicUuid() {
    return this.publicUuid;
  }

  public void setPublicUuid(String publicUuid) {
    this.publicUuid = publicUuid;
  }

  /**
   * The person's first name.
   */
  public String getFirstName() {
    return this.firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  /**
   * The person's middle name.
   */
  public String getMiddleName() {
    return this.middleName;
  }

  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }

  /**
   * The person's last name.
   */
  public String getLastName() {
    return this.lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  /**
   * The person's legal name.
   */
  public String getLegalName() {
    return this.legalName;
  }

  public void setLegalName(String legalName) {
    this.legalName = legalName;
  }

  /**
   * The display name for the person.
   */
  public String getDisplayName() {
    return this.displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  /**
   * The public nick name for the person.
   */
  public String getPublicNickName() {
    return this.publicNickName;
  }

  public void setPublicNickName(String publicNickName) {
    this.publicNickName = publicNickName;
  }

  /**
   * The aliases of the user.
   */
  public List<Pointer> getAlias() {
    return this.alias;
  }

  public void setAlias(List<Pointer> alias) {
    this.alias = alias;
  }

  /**
   * The user's tax residence numbers for different countries.
   */
  public List<TaxResident> getTaxResident() {
    return this.taxResident;
  }

  public void setTaxResident(List<TaxResident> taxResident) {
    this.taxResident = taxResident;
  }

  /**
   * The type of identification document the person registered with.
   */
  public String getDocumentType() {
    return this.documentType;
  }

  public void setDocumentType(String documentType) {
    this.documentType = documentType;
  }

  /**
   * The identification document number the person registered with.
   */
  public String getDocumentNumber() {
    return this.documentNumber;
  }

  public void setDocumentNumber(String documentNumber) {
    this.documentNumber = documentNumber;
  }

  /**
   * The country which issued the identification document the person registered with.
   */
  public String getDocumentCountryOfIssuance() {
    return this.documentCountryOfIssuance;
  }

  public void setDocumentCountryOfIssuance(String documentCountryOfIssuance) {
    this.documentCountryOfIssuance = documentCountryOfIssuance;
  }

  /**
   * The person's main address.
   */
  public Address getAddressMain() {
    return this.addressMain;
  }

  public void setAddressMain(Address addressMain) {
    this.addressMain = addressMain;
  }

  /**
   * The person's postal address.
   */
  public Address getAddressPostal() {
    return this.addressPostal;
  }

  public void setAddressPostal(Address addressPostal) {
    this.addressPostal = addressPostal;
  }

  /**
   * The person's date of birth. Accepts ISO8601 date formats.
   */
  public String getDateOfBirth() {
    return this.dateOfBirth;
  }

  public void setDateOfBirth(String dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }

  /**
   * The person's place of birth.
   */
  public String getPlaceOfBirth() {
    return this.placeOfBirth;
  }

  public void setPlaceOfBirth(String placeOfBirth) {
    this.placeOfBirth = placeOfBirth;
  }

  /**
   * The person's country of birth. Formatted as a SO 3166-1 alpha-2 country code.
   */
  public String getCountryOfBirth() {
    return this.countryOfBirth;
  }

  public void setCountryOfBirth(String countryOfBirth) {
    this.countryOfBirth = countryOfBirth;
  }

  /**
   * The person's nationality. Formatted as a SO 3166-1 alpha-2 country code.
   */
  public String getNationality() {
    return this.nationality;
  }

  public void setNationality(String nationality) {
    this.nationality = nationality;
  }

  /**
   * The person's preferred language. Formatted as a ISO 639-1 language code plus a ISO 3166-1
   * alpha-2 country code, seperated by an underscore.
   */
  public String getLanguage() {
    return this.language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  /**
   * The person's preferred region. Formatted as a ISO 639-1 language code plus a ISO 3166-1
   * alpha-2 country code, seperated by an underscore.
   */
  public String getRegion() {
    return this.region;
  }

  public void setRegion(String region) {
    this.region = region;
  }

  /**
   * The person's gender. Can be MALE, FEMALE or UNKNOWN.
   */
  public String getGender() {
    return this.gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  /**
   * The user's avatar.
   */
  public Avatar getAvatar() {
    return this.avatar;
  }

  public void setAvatar(Avatar avatar) {
    this.avatar = avatar;
  }

  /**
   * The version of the terms of service accepted by the user.
   */
  public String getVersionTermsOfService() {
    return this.versionTermsOfService;
  }

  public void setVersionTermsOfService(String versionTermsOfService) {
    this.versionTermsOfService = versionTermsOfService;
  }

  /**
   * The user status. The user status. Can be: ACTIVE, BLOCKED, SIGNUP, RECOVERY, DENIED or
   * ABORTED.
   */
  public String getStatus() {
    return this.status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * The user sub-status. Can be: NONE, FACE_RESET, APPROVAL, APPROVAL_DIRECTOR, APPROVAL_PARENT,
   * APPROVAL_SUPPORT, COUNTER_IBAN, IDEAL or SUBMIT.
   */
  public String getSubStatus() {
    return this.subStatus;
  }

  public void setSubStatus(String subStatus) {
    this.subStatus = subStatus;
  }

  /**
   * The setting for the session timeout of the user in seconds.
   */
  public Integer getSessionTimeout() {
    return this.sessionTimeout;
  }

  public void setSessionTimeout(Integer sessionTimeout) {
    this.sessionTimeout = sessionTimeout;
  }

  /**
   * The amount the user can pay in the session without asking for credentials.
   */
  public Amount getDailyLimitWithoutConfirmationLogin() {
    return this.dailyLimitWithoutConfirmationLogin;
  }

  public void setDailyLimitWithoutConfirmationLogin(Amount dailyLimitWithoutConfirmationLogin) {
    this.dailyLimitWithoutConfirmationLogin = dailyLimitWithoutConfirmationLogin;
  }

  /**
   * The types of notifications that will result in a push notification or URL callback for this
   * UserPerson.
   */
  public List<NotificationFilter> getNotificationFilters() {
    return this.notificationFilters;
  }

  public void setNotificationFilters(List<NotificationFilter> notificationFilters) {
    this.notificationFilters = notificationFilters;
  }

}
