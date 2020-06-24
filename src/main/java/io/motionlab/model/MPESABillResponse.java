package io.motionlab.model;

public class MPESABillResponse {

	private String account_number;
	private String account_name;
	private double account_balance;
	private String due_date;
	private double amount_due;
	private String msisdn;
	private String last_invoice_date;
	
	public MPESABillResponse() {
		super();
	}
	
	public MPESABillResponse(String account_number, String account_name, double account_balance, String due_date,
			double amount_due, String msisdn, String last_invoice_date) {
		super();
		this.account_number = account_number;
		this.account_name = account_name;
		this.account_balance = account_balance;
		this.due_date = due_date;
		this.amount_due = amount_due;
		this.msisdn = msisdn;
		this.last_invoice_date = last_invoice_date;
	}
	
	public String getAccount_number() {
		return account_number;
	}
	public void setAccount_number(String account_number) {
		this.account_number = account_number;
	}
	public String getAccount_name() {
		return account_name;
	}
	public void setAccount_name(String account_name) {
		this.account_name = account_name;
	}
	public double getAccount_balance() {
		return account_balance;
	}
	public void setAccount_balance(double account_balance) {
		this.account_balance = account_balance;
	}
	public String getDue_date() {
		return due_date;
	}
	public void setDue_date(String due_date) {
		this.due_date = due_date;
	}
	public double getAmount_due() {
		return amount_due;
	}
	public void setAmount_due(double amount_due) {
		this.amount_due = amount_due;
	}
	public String getMsisdn() {
		return msisdn;
	}
	public void setMsisdn(String msisdn) {
		this.msisdn = msisdn;
	}
	public String getLast_invoice_date() {
		return last_invoice_date;
	}
	public void setLast_invoice_date(String last_invoice_date) {
		this.last_invoice_date = last_invoice_date;
	}

	@Override
	public String toString() {
		return "BillResponse [account_number=" + account_number + ", account_name=" + account_name
				+ ", account_balance=" + account_balance + ", due_date=" + due_date + ", amount_due=" + amount_due
				+ ", msisdn=" + msisdn + ", last_invoice_date=" + last_invoice_date + "]";
	}
	
}
