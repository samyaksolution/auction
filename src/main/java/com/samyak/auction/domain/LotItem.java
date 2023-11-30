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
@Table(name = "AU_LOT_ITEM")
public class LotItem implements Serializable {


	private static final long serialVersionUID = -8984469501885408691L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	private Long id;
	
	@Column(name = "LOTITEMID")
	private UUID lotItemId;
	
	@Column(name = "LOTID")
	private UUID lotId;
	
	@Column(name = "QUANTITY")
	private Double quantity;
	@Column(name = "SKU")
	private String sku;
	@Column(name = "CONDITION")
	private String condition;
	
	@Column(name = "CERTIFICATENUMBER")
	private String certificateNumber;
	
	@Column(name = "STARTINGBID")
	private Double startingBid;
	
	@Column(name = "ITEMSTATUS")
	private UUID itemStatus;
	
	
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

	public UUID getLotItemId() {
		return lotItemId;
	}

	public void setLotItemId(UUID lotItemId) {
		this.lotItemId = lotItemId;
	}

	public UUID getLotId() {
		return lotId;
	}

	public void setLotId(UUID lotId) {
		this.lotId = lotId;
	}

	public Double getQuantity() {
		return quantity;
	}

	public void setQuantity(Double quantity) {
		this.quantity = quantity;
	}

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public String getCondition() {
		return condition;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}

	public String getCertificateNumber() {
		return certificateNumber;
	}

	public void setCertificateNumber(String certificateNumber) {
		this.certificateNumber = certificateNumber;
	}

	public Double getStartingBid() {
		return startingBid;
	}

	public void setStartingBid(Double startingBid) {
		this.startingBid = startingBid;
	}

	public UUID getItemStatus() {
		return itemStatus;
	}

	public void setItemStatus(UUID itemStatus) {
		this.itemStatus = itemStatus;
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
