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
@Table(name = "UA_AUCTIONDETAILS")
public class AuctionDetails implements Serializable {

	private static final long serialVersionUID = 5719227521952610166L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	private Long id;

	@Column(name = "AUCTIONID")
	private UUID auctionId;

	@Column(name = "AUCTIONNAME")
	private String auctionName;

	@Column(name = "FROMRANGE")
	private Long fromRange;

	@Column(name = "TORANGE")
	private Long toRange;

	@Column(name = "INCREMENTAMOUNT")
	private Double incrementAmount;

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

	public UUID getAuctionId() {
		return auctionId;
	}

	public void setAuctionId(UUID auctionId) {
		this.auctionId = auctionId;
	}

	public String getAuctionName() {
		return auctionName;
	}

	public void setAuctionName(String auctionName) {
		this.auctionName = auctionName;
	}

	public Long getFromRange() {
		return fromRange;
	}

	public void setFromRange(Long fromRange) {
		this.fromRange = fromRange;
	}

	public Long getToRange() {
		return toRange;
	}

	public void setToRange(Long toRange) {
		this.toRange = toRange;
	}

	public Double getIncrementAmount() {
		return incrementAmount;
	}

	public void setIncrementAmount(Double incrementAmount) {
		this.incrementAmount = incrementAmount;
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
