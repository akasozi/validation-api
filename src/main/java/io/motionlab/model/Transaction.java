package io.motionlab.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "transactions")
public class Transaction {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long trans_id;
	private String ipn_id;
	private String channel;
	private String destination;
	private Date  mtimestamp;
	private String customer_id;
	private String mpesa_code;
	private String mpesa_msisdn;
	private String mpesa_trx_date;
	private String mpesa_trx_time;
	private double mpesa_amt;
	private String mpesa_sender;
	private String business_number;
	private Date date_added;
	private Date last_updated;
	private int sms_send;
	private int printed;
	private String mpesa_acc;
	private int fetched_times;
	private String message;
	
	public Transaction() {
		super();
	}

	public Transaction(long trans_id, String ipn_id, String channel, String destination, Date mtimestamp,
			String customer_id, String mpesa_code, String mpesa_trx_date, String mpesa_trx_time, double mpesa_amt,
			String mpesa_sender, String business_number, Date date_added, Date last_updated, int sms_send, int printed,
			String mpesa_acc, int fetched_times) {
		super();
		this.trans_id = trans_id;
		this.ipn_id = ipn_id;
		this.channel = channel;
		this.destination = destination;
		this.mtimestamp = mtimestamp;
		this.customer_id = customer_id;
		this.mpesa_code = mpesa_code;
		this.mpesa_trx_date = mpesa_trx_date;
		this.mpesa_trx_time = mpesa_trx_time;
		this.mpesa_amt = mpesa_amt;
		this.mpesa_sender = mpesa_sender;
		this.business_number = business_number;
		this.date_added = date_added;
		this.last_updated = last_updated;
		this.sms_send = sms_send;
		this.printed = printed;
		this.mpesa_acc = mpesa_acc;
		this.fetched_times = fetched_times;
	}

	public long getTrans_id() {
		return trans_id;
	}

	public void setTrans_id(long trans_id) {
		this.trans_id = trans_id;
	}

	public String getIpn_id() {
		return ipn_id;
	}

	public void setIpn_id(String ipn_id) {
		this.ipn_id = ipn_id;
	}

	public String getChannel() {
		return channel;
	}

	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public Date getMtimestamp() {
		return mtimestamp;
	}

	public void setMtimestamp(Date mtimestamp) {
		this.mtimestamp = mtimestamp;
	}

	public String getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(String customer_id) {
		this.customer_id = customer_id;
	}

	public String getMpesa_code() {
		return mpesa_code;
	}

	public void setMpesa_code(String mpesa_code) {
		this.mpesa_code = mpesa_code;
	}

	public String getMpesa_trx_date() {
		return mpesa_trx_date;
	}

	public void setMpesa_trx_date(String mpesa_trx_date) {
		this.mpesa_trx_date = mpesa_trx_date;
	}

	public String getMpesa_trx_time() {
		return mpesa_trx_time;
	}

	public void setMpesa_trx_time(String mpesa_trx_time) {
		this.mpesa_trx_time = mpesa_trx_time;
	}

	public double getMpesa_amt() {
		return mpesa_amt;
	}

	public void setMpesa_amt(double mpesa_amt) {
		this.mpesa_amt = mpesa_amt;
	}

	public String getMpesa_sender() {
		return mpesa_sender;
	}

	public void setMpesa_sender(String mpesa_sender) {
		this.mpesa_sender = mpesa_sender;
	}

	public String getBusiness_number() {
		return business_number;
	}

	public void setBusiness_number(String business_number) {
		this.business_number = business_number;
	}

	public Date getDate_added() {
		return date_added;
	}

	public void setDate_added(Date date_added) {
		this.date_added = date_added;
	}

	public Date getLast_updated() {
		return last_updated;
	}

	public void setLast_updated(Date last_updated) {
		this.last_updated = last_updated;
	}

	public int getSms_send() {
		return sms_send;
	}

	public void setSms_send(int sms_send) {
		this.sms_send = sms_send;
	}

	public int getPrinted() {
		return printed;
	}

	public void setPrinted(int printed) {
		this.printed = printed;
	}

	public String getMpesa_acc() {
		return mpesa_acc;
	}

	public void setMpesa_acc(String mpesa_acc) {
		this.mpesa_acc = mpesa_acc;
	}

	public int getFetched_times() {
		return fetched_times;
	}

	public void setFetched_times(int fetched_times) {
		this.fetched_times = fetched_times;
	}
	
	public String getMpesa_msisdn() {
		return mpesa_msisdn;
	}

	public void setMpesa_msisdn(String mpesa_msisdn) {
		this.mpesa_msisdn = mpesa_msisdn;
	}
	
	

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "Transaction [trans_id=" + trans_id + ", ipn_id=" + ipn_id + ", channel=" + channel + ", destination="
				+ destination + ", mtimestamp=" + mtimestamp + ", customer_id=" + customer_id + ", mpesa_code="
				+ mpesa_code + ", mpesa_trx_date=" + mpesa_trx_date + ", mpesa_trx_time=" + mpesa_trx_time
				+ ", mpesa_amt=" + mpesa_amt + ", mpesa_sender=" + mpesa_sender + ", business_number=" + business_number
				+ ", date_added=" + date_added + ", last_updated=" + last_updated + ", sms_send=" + sms_send
				+ ", printed=" + printed + ", mpesa_acc=" + mpesa_acc + ", fetched_times=" + fetched_times + "]";
	}
		
}
