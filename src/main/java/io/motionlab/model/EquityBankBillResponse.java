package io.motionlab.model;

import java.util.Date;

public class EquityBankBillResponse {

	public Long id;
	public double amount;
	private String billName;
	private String billNumber;
	private String billerCode;
	private Date createdOn;
	private String currencyCode;
	private String customerName;
	private String customerRefNumber;
	private String description;
	private Date dueDate;
	private String type;
	
	public EquityBankBillResponse() {
		super();
	}

	public EquityBankBillResponse(Long id, double amount, String billName, String billNumber, String billerCode,
			Date createdOn, String currencyCode, String customerName, String customerRefNumber, String description,
			Date dueDate, String type) {
		super();
		this.id = id;
		this.amount = amount;
		this.billName = billName;
		this.billNumber = billNumber;
		this.billerCode = billerCode;
		this.createdOn = createdOn;
		this.currencyCode = currencyCode;
		this.customerName = customerName;
		this.customerRefNumber = customerRefNumber;
		this.description = description;
		this.dueDate = dueDate;
		this.type = type;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getBillName() {
		return billName;
	}

	public void setBillName(String billName) {
		this.billName = billName;
	}

	public String getBillNumber() {
		return billNumber;
	}

	public void setBillNumber(String billNumber) {
		this.billNumber = billNumber;
	}

	public String getBillerCode() {
		return billerCode;
	}

	public void setBillerCode(String billerCode) {
		this.billerCode = billerCode;
	}

	public Date getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	public String getCurrencyCode() {
		return currencyCode;
	}

	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerRefNumber() {
		return customerRefNumber;
	}

	public void setCustomerRefNumber(String customerRefNumber) {
		this.customerRefNumber = customerRefNumber;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getDueDate() {
		return dueDate;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "EquityBankBillResponse [id=" + id + ", amount=" + amount + ", billName=" + billName + ", billNumber="
				+ billNumber + ", billerCode=" + billerCode + ", createdOn=" + createdOn + ", currencyCode="
				+ currencyCode + ", customerName=" + customerName + ", customerRefNumber=" + customerRefNumber
				+ ", description=" + description + ", dueDate=" + dueDate + ", type=" + type + "]";
	}
	
}
