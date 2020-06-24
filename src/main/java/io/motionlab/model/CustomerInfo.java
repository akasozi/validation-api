package io.motionlab.model;

import com.fasterxml.jackson.annotation.JsonSetter;

public class CustomerInfo {
	
	private String VENDOR_NUMBER;
	private String NAME;
	private String NATIONAL_ID;
	private String DATE_OF_BIRTH;
	private String GENDER;
	private String MARITAL_STATUS;
	private String NAME_OF_SPOUSE;
	private String PHONE_NUMBER;
	private String POST_CODE;
	private String ADDRESS;
	private String CITY;
	private String EMAIL_ADDRESS;
	private String PENSIONABLE_SERVICE_START_DATE;
	private String NORMAL_RETIREMENT_DATE;
	private String IMAGE;
	private int AGE;
	
	public CustomerInfo() {
		super();
	}

	public CustomerInfo(String vENDOR_NUMBER, String nAME, String nATIONAL_ID, String dATE_OF_BIRTH, String gENDER,
			String mARITAL_STATUS, String nAME_OF_SPOUSE, String pHONE_NUMBER, String pOST_CODE, String aDDRESS,
			String cITY, String eMAIL_ADDRESS, String pENSIONABLE_SERVICE_START_DATE, String nORMAL_RETIREMENT_DATE,
			String iMAGE, int aGE) {
		super();
		VENDOR_NUMBER = vENDOR_NUMBER;
		NAME = nAME;
		NATIONAL_ID = nATIONAL_ID;
		DATE_OF_BIRTH = dATE_OF_BIRTH;
		GENDER = gENDER;
		MARITAL_STATUS = mARITAL_STATUS;
		NAME_OF_SPOUSE = nAME_OF_SPOUSE;
		PHONE_NUMBER = pHONE_NUMBER;
		POST_CODE = pOST_CODE;
		ADDRESS = aDDRESS;
		CITY = cITY;
		EMAIL_ADDRESS = eMAIL_ADDRESS;
		PENSIONABLE_SERVICE_START_DATE = pENSIONABLE_SERVICE_START_DATE;
		NORMAL_RETIREMENT_DATE = nORMAL_RETIREMENT_DATE;
		IMAGE = iMAGE;
		AGE = aGE;
	}

	public String getVENDOR_NUMBER() {
		return VENDOR_NUMBER;
	}

	@JsonSetter("VENDOR_NUMBER")
	public void setVENDOR_NUMBER(String x) {
		VENDOR_NUMBER = x;
	}

	public String getNAME() {
		return NAME;
	}

	@JsonSetter("NAME")
	public void setNAME(String nAME) {
		NAME = nAME;
	}

	public String getNATIONAL_ID() {
		return NATIONAL_ID;
	}

	@JsonSetter("NATIONAL_ID")
	public void setNATIONAL_ID(String nATIONAL_ID) {
		NATIONAL_ID = nATIONAL_ID;
	}

	public String getDATE_OF_BIRTH() {
		return DATE_OF_BIRTH;
	}
    
	@JsonSetter("DATE_OF_BIRTH")
	public void setDATE_OF_BIRTH(String dATE_OF_BIRTH) {
		DATE_OF_BIRTH = dATE_OF_BIRTH;
	}

	public String getGENDER() {
		return GENDER;
	}

	@JsonSetter("GENDER")
	public void setGENDER(String gENDER) {
		GENDER = gENDER;
	}

	public String getMARITAL_STATUS() {
		return MARITAL_STATUS;
	}

	@JsonSetter("MARITAL_STATUS")
	public void setMARITAL_STATUS(String mARITAL_STATUS) {
		MARITAL_STATUS = mARITAL_STATUS;
	}

	public String getNAME_OF_SPOUSE() {
		return NAME_OF_SPOUSE;
	}

	@JsonSetter("NAME_OF_SPOUSE")
	public void setNAME_OF_SPOUSE(String nAME_OF_SPOUSE) {
		NAME_OF_SPOUSE = nAME_OF_SPOUSE;
	}

	public String getPHONE_NUMBER() {
		return PHONE_NUMBER;
	}

	@JsonSetter("PHONE_NUMBER")
	public void setPHONE_NUMBER(String pHONE_NUMBER) {
		PHONE_NUMBER = pHONE_NUMBER;
	}

	public String getPOST_CODE() {
		return POST_CODE;
	}

	@JsonSetter("POST_CODE")
	public void setPOST_CODE(String pOST_CODE) {
		POST_CODE = pOST_CODE;
	}

	public String getADDRESS() {
		return ADDRESS;
	}

	@JsonSetter("ADDRESS")
	public void setADDRESS(String aDDRESS) {
		ADDRESS = aDDRESS;
	}

	public String getCITY() {
		return CITY;
	}

	@JsonSetter("CITY")
	public void setCITY(String cITY) {
		CITY = cITY;
	}

	public String getEMAIL_ADDRESS() {
		return EMAIL_ADDRESS;
	}

	@JsonSetter("EMAIL_ADDRESS")
	public void setEMAIL_ADDRESS(String eMAIL_ADDRESS) {
		EMAIL_ADDRESS = eMAIL_ADDRESS;
	}

	public String getPENSIONABLE_SERVICE_START_DATE() {
		return PENSIONABLE_SERVICE_START_DATE;
	}

	@JsonSetter("PENSIONABLE_SERVICE_START_DATE")
	public void setPENSIONABLE_SERVICE_START_DATE(String pENSIONABLE_SERVICE_START_DATE) {
		PENSIONABLE_SERVICE_START_DATE = pENSIONABLE_SERVICE_START_DATE;
	}

	public String getNORMAL_RETIREMENT_DATE() {
		return NORMAL_RETIREMENT_DATE;
	}

	@JsonSetter("NORMAL_RETIREMENT_DATE")
	public void setNORMAL_RETIREMENT_DATE(String nORMAL_RETIREMENT_DATE) {
		NORMAL_RETIREMENT_DATE = nORMAL_RETIREMENT_DATE;
	}

	public String getIMAGE() {
		return IMAGE;
	}

	@JsonSetter("IMAGE")
	public void setIMAGE(String iMAGE) {
		IMAGE = iMAGE;
	}

	public int getAGE() {
		return AGE;
	}

	@JsonSetter("AGE")
	public void setAGE(int aGE) {
		AGE = aGE;
	}

	@Override
	public String toString() {
		return "CustomerInfo [VENDOR_NUMBER=" + VENDOR_NUMBER + ", NAME=" + NAME + ", NATIONAL_ID=" + NATIONAL_ID
				+ ", DATE_OF_BIRTH=" + DATE_OF_BIRTH + ", GENDER=" + GENDER + ", MARITAL_STATUS=" + MARITAL_STATUS
				+ ", NAME_OF_SPOUSE=" + NAME_OF_SPOUSE + ", PHONE_NUMBER=" + PHONE_NUMBER + ", POST_CODE=" + POST_CODE
				+ ", ADDRESS=" + ADDRESS + ", CITY=" + CITY + ", EMAIL_ADDRESS=" + EMAIL_ADDRESS
				+ ", PENSIONABLE_SERVICE_START_DATE=" + PENSIONABLE_SERVICE_START_DATE + ", NORMAL_RETIREMENT_DATE="
				+ NORMAL_RETIREMENT_DATE + ", IMAGE=" + IMAGE + ", AGE=" + AGE + "]";
	}
	
	
}
