package io.motionlab.model;

public class MPESABillRequest {

	private String account_number;
	private String business_unit;
	private String vendor_code;

	public MPESABillRequest() {
		super();
	}
	
	public MPESABillRequest(String account_number, String business_unit, String vendor_code) {
		super();
		this.account_number = account_number;
		this.business_unit = business_unit;
		this.vendor_code = vendor_code;
	}
	
	public String getAccount_number() {
		return account_number;
	}
	public void setAccount_number(String account_number) {
		this.account_number = account_number;
	}
	public String getBusiness_unit() {
		return business_unit;
	}
	public void setBusiness_unit(String business_unit) {
		this.business_unit = business_unit;
	}
	public String getVendor_code() {
		return vendor_code;
	}
	public void setVendor_code(String vendor_code) {
		this.vendor_code = vendor_code;
	}

	@Override
	public String toString() {
		return "BillRequest [account_number=" + account_number + ", business_unit=" + business_unit + ", vendor_code="
				+ vendor_code + "]";
	}
	
}
