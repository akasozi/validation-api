package io.motionlab.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "`outMessages`")
public class OutMessage {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "messageID")
	private long messageID;
	@Column(name = "messageTypeID")
	private int messageTypeID;
	@Column(name = "MSISDN")
	private String MSISDN;
	@Column(name = "senderID")
	private String senderID;
	private String messageContent;
	private int messageLength;
	private int messagePages = 0;
	private int statusCode;
	@Column(name = "thirdPartyMessageID")
	private String thirdPartyMessageID;
	private String thirdPartyMessageCost;
	private String thirdPartyNumber;
	@Column(name = "deliveryChannelID")
	private int deliveryChannelID;
	private int overalStatus;
	@Column(name = "bucketID")
	private int bucketID;
	private Date firstSend;
	private Date nextSend;
	private int numberOfSends;
	private Date dateCreated;
	private int createdBy;
	private Date dateModified;
	private int updatedBy;
	
	public OutMessage() {
		
	}
	
	public long getMessageID() {
		return messageID;
	}
	
	@Column(name = "MSISDN")
	public void setMessageID(long messageID) {
		this.messageID = messageID;
	}
	public int getMessageTypeID() {
		return messageTypeID;
	}
	public void setMessageTypeID(int messageTypeID) {
		this.messageTypeID = messageTypeID;
	}
	public String getMSISDN() {
		return MSISDN;
	}
	public void setMSISDN(String mSISDN) {
		MSISDN = mSISDN;
	}
	public String getSenderID() {
		return senderID;
	}
	public void setSenderID(String senderID) {
		this.senderID = senderID;
	}
	public String getMessageContent() {
		return messageContent;
	}
	public void setMessageContent(String messageContent) {
		this.messageContent = messageContent;
	}
	public int getMessageLength() {
		return messageLength;
	}
	public void setMessageLength(int messageLength) {
		this.messageLength = messageLength;
	}
	public int getMessagePages() {
		return messagePages;
	}
	public void setMessagePages(int messagePages) {
		this.messagePages = messagePages;
	}
	public int getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	public String getThirdPartyMessageID() {
		return thirdPartyMessageID;
	}
	public void setThirdPartyMessageID(String thirdPartyMessageID) {
		this.thirdPartyMessageID = thirdPartyMessageID;
	}
	public String getThirdPartyMessageCost() {
		return thirdPartyMessageCost;
	}
	public void setThirdPartyMessageCost(String thirdPartyMessageCost) {
		this.thirdPartyMessageCost = thirdPartyMessageCost;
	}
	public String getThirdPartyNumber() {
		return thirdPartyNumber;
	}
	public void setThirdPartyNumber(String thirdPartyNumber) {
		this.thirdPartyNumber = thirdPartyNumber;
	}
	public int getDeliveryChannelID() {
		return deliveryChannelID;
	}
	public void setDeliveryChannelID(int deliveryChannelID) {
		this.deliveryChannelID = deliveryChannelID;
	}
	public int getOveralStatus() {
		return overalStatus;
	}
	public void setOveralStatus(int overalStatus) {
		this.overalStatus = overalStatus;
	}
	public int getBucketID() {
		return bucketID;
	}
	public void setBucketID(int bucketID) {
		this.bucketID = bucketID;
	}
	public Date getFirstSend() {
		return firstSend;
	}
	public void setFirstSend(Date firstSend) {
		this.firstSend = firstSend;
	}
	public Date getNextSend() {
		return nextSend;
	}
	public void setNextSend(Date nextSend) {
		this.nextSend = nextSend;
	}
	public int getNumberOfSends() {
		return numberOfSends;
	}
	public void setNumberOfSends(int numberOfSends) {
		this.numberOfSends = numberOfSends;
	}
	public Date getDateCreated() {
		return dateCreated;
	}
	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}
	public int getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(int createdBy) {
		this.createdBy = createdBy;
	}
	public Date getDateModified() {
		return dateModified;
	}
	public void setDateModified(Date dateModified) {
		this.dateModified = dateModified;
	}
	public int getUpdatedBy() {
		return updatedBy;
	}
	public void setUpdatedBy(int updatedBy) {
		this.updatedBy = updatedBy;
	}
	@Override
	public String toString() {
		return "OutMessage [messageID=" + messageID + ", messageTypeID=" + messageTypeID + ", MSISDN=" + MSISDN
				+ ", senderID=" + senderID + ", messageContent=" + messageContent + ", messageLength=" + messageLength
				+ ", messagePages=" + messagePages + ", statusCode=" + statusCode + ", thirdPartyMessageID="
				+ thirdPartyMessageID + ", thirdPartyMessageCost=" + thirdPartyMessageCost + ", thirdPartyNumber="
				+ thirdPartyNumber + ", deliveryChannelID=" + deliveryChannelID + ", overalStatus=" + overalStatus
				+ ", bucketID=" + bucketID + ", firstSend=" + firstSend + ", nextSend=" + nextSend + ", numberOfSends="
				+ numberOfSends + ", dateCreated=" + dateCreated + ", createdBy=" + createdBy + ", dateModified="
				+ dateModified + ", updatedBy=" + updatedBy + "]";
	}
}

