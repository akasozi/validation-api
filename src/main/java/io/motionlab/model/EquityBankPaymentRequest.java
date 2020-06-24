package io.motionlab.model;

import com.fasterxml.jackson.annotation.JsonSetter;

public class EquityBankPaymentRequest {

	private String username;
	private String password;
	private String billNumber;
	private String billAmount;
	
	private String customerRefNumber;
	private String bankreference;
	private String tranParticular;
	private String paymentMode;
	private String transactionDate;
	private String phonenumber;
	private String debitaccount;
	private String debitcustname;
	
	public EquityBankPaymentRequest() {
		
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getBillNumber() {
		return billNumber;
	}

	public void setBillNumber(String billNumber) {
		this.billNumber = billNumber;
	}

	public String getBillAmount() {
		return billAmount;
	}

	public void setBillAmount(String billAmount) {
		this.billAmount = billAmount;
	}

	public String getCustomerRefNumber() {
		return customerRefNumber;
	}

	@JsonSetter("CustomerRefNumber")
	public void setCustomerRefNumber(String customerRefNumber) {
		this.customerRefNumber = customerRefNumber;
	}

	public String getBankreference() {
		return bankreference;
	}

	public void setBankreference(String bankreference) {
		this.bankreference = bankreference;
	}

	public String getTranParticular() {
		return tranParticular;
	}

	public void setTranParticular(String tranParticular) {
		this.tranParticular = tranParticular;
	}

	public String getPaymentMode() {
		return paymentMode;
	}

	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}

	public String getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(String transactionDate) {
		this.transactionDate = transactionDate;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	public String getDebitaccount() {
		return debitaccount;
	}

	public void setDebitaccount(String debitaccount) {
		this.debitaccount = debitaccount;
	}

	public String getDebitcustname() {
		return debitcustname;
	}

	public void setDebitcustname(String debitcustname) {
		this.debitcustname = debitcustname;
	}

	@Override
	public String toString() {
		return "EquityBankPaymentRequest [username=" + username + ", password=" + password + ", billNumber="
				+ billNumber + ", billAmount=" + billAmount + ", customerRefNumber=" + customerRefNumber
				+ ", bankreference=" + bankreference + ", tranParticular=" + tranParticular + ", paymentMode="
				+ paymentMode + ", transactionDate=" + transactionDate + ", phonenumber=" + phonenumber
				+ ", debitaccount=" + debitaccount + ", debitcustname=" + debitcustname + "]";
	}	
}
