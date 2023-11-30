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
@Table(name = "AU_LOT")
public class Lot implements Serializable {

	private static final long serialVersionUID = -8381496078100026221L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	private Long id;

	@Column(name = "LOTID")
	private UUID lotId;
	
	@Column(name = "AUCTIONID")
	private UUID auctionId;
	
	@Column(name = "USERID")
	private UUID userid;
	
	@Column(name = "LOTNO")
	private String lotNo;
	
	@Column(name = "DESCRIPTION")
	private String description;
	
	@Column(name = "RESERVEPRICE")
	private String reservePrice;
	
	@Column(name = "MRP")
	private String mrp;
	
	@Column(name = "SERIALNO")
	private String serialNo;
	
	@Column(name = "LOTCATEGORY")
	private String lotCategory;
	
	@Column(name = "LOTSTATUS")
	private String lotStatus;
	
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

	public UUID getLotId() {
		return lotId;
	}

	public void setLotId(UUID lotId) {
		this.lotId = lotId;
	}

	public UUID getAuctionId() {
		return auctionId;
	}

	public void setAuctionId(UUID auctionId) {
		this.auctionId = auctionId;
	}

	public UUID getUserid() {
		return userid;
	}

	public void setUserid(UUID userid) {
		this.userid = userid;
	}

	public String getLotNo() {
		return lotNo;
	}

	public void setLotNo(String lotNo) {
		this.lotNo = lotNo;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getReservePrice() {
		return reservePrice;
	}

	public void setReservePrice(String reservePrice) {
		this.reservePrice = reservePrice;
	}

	public String getMrp() {
		return mrp;
	}

	public void setMrp(String mrp) {
		this.mrp = mrp;
	}

	public String getSerialNo() {
		return serialNo;
	}

	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}

	public String getLotCategory() {
		return lotCategory;
	}

	public void setLotCategory(String lotCategory) {
		this.lotCategory = lotCategory;
	}

	public String getLotStatus() {
		return lotStatus;
	}

	public void setLotStatus(String lotStatus) {
		this.lotStatus = lotStatus;
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
