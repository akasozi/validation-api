package io.motionlab.model;

public class EquityBankPaymentResponse {

	private String responseCode;
	private String responseMessage;
	
	public EquityBankPaymentResponse() {
		super();
	}
	public EquityBankPaymentResponse(String responseCode, String responseMessage) {
		super();
		this.responseCode = responseCode;
		this.responseMessage = responseMessage;
	}
	public String getResponseCode() {
		return responseCode;
	}
	public void setResponseCode(String responseCode) {
		this.responseCode = responseCode;
	}
	public String getResponseMessage() {
		return responseMessage;
	}
	public void setResponseMessage(String responseMessage) {
		this.responseMessage = responseMessage;
	}
	@Override
	public String toString() {
		return "EquityBankPaymentResponse [responseCode=" + responseCode + ", responseMessage=" + responseMessage + "]";
	}
}
