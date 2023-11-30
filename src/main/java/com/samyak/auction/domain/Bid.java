package com.samyak.auction.domain;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "UA_BID")
public class Bid implements Serializable {


	private static final long serialVersionUID = 2355230923420566240L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	private Long id;

	@Column(name = "BIDID")
	private UUID bidId;

	@Column(name = "LOTID")
	private UUID lotId;

	@Column(name = "AUCTIONID")
	private UUID actionId;

	@Column(name = "USERID")
	private UUID userId;

	@Column(name = "CURRENTBIDAMOUNT")
	private Double currencyBidAmount;

	@Column(name = "CURRENCYID")
	private UUID currencyId;

	@Column(name = "BIDDATETIME")
	private Double bidDateTime;

	@Column(name = "CLOSE")
	private Boolean close;

	@Column(name = "ACTIVE")
	private Boolean active;

	@Column(name = "CREATEBY")
	private String createBy;

	@Column(name = "UPDATEBY")
	private String updateBy;

	@Column(name = "CREATED")
	private Timestamp created;

	@Column(name = "UPDATED")
	private Timestamp updated;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public UUID getBidId() {
		return bidId;
	}

	public void setBidId(UUID bidId) {
		this.bidId = bidId;
	}

	public UUID getLotId() {
		return lotId;
	}

	public void setLotId(UUID lotId) {
		this.lotId = lotId;
	}

	public UUID getActionId() {
		return actionId;
	}

	public void setActionId(UUID actionId) {
		this.actionId = actionId;
	}

	public UUID getUserId() {
		return userId;
	}

	public void setUserId(UUID userId) {
		this.userId = userId;
	}

	public Double getCurrencyBidAmount() {
		return currencyBidAmount;
	}

	public void setCurrencyBidAmount(Double currencyBidAmount) {
		this.currencyBidAmount = currencyBidAmount;
	}

	public UUID getCurrencyId() {
		return currencyId;
	}

	public void setCurrencyId(UUID currencyId) {
		this.currencyId = currencyId;
	}

	public Double getBidDateTime() {
		return bidDateTime;
	}

	public void setBidDateTime(Double bidDateTime) {
		this.bidDateTime = bidDateTime;
	}

	public Boolean getClose() {
		return close;
	}

	public void setClose(Boolean close) {
		this.close = close;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public String getCreateBy() {
		return createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	public String getUpdateBy() {
		return updateBy;
	}

	public void setUpdateBy(String updateBy) {
		this.updateBy = updateBy;
	}

	public Timestamp getCreated() {
		return created;
	}

	public void setCreated(Timestamp created) {
		this.created = created;
	}

	public Timestamp getUpdated() {
		return updated;
	}

	public void setUpdated(Timestamp updated) {
		this.updated = updated;
	}
	
	
}
