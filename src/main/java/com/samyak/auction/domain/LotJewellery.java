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
@Table(name = "AU_LOT_JEWELLERY")
public class LotJewellery implements Serializable {

	private static final long serialVersionUID = -1711888122436668344L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	private Long id;
	@Column(name = "JEWELLERYID")
	private UUID jewelleryId;
	@Column(name = "LOTID")
	private UUID lotId;
	
	@Column(name = "DIAMONDNAME")
	private String diamondName;
	@Column(name = "STOCKNUMBER")
	private Integer stockNumber;
	@Column(name = "STATUS")
	private String status;
	
	@Column(name = "JEWELLERYTYPE")
	private String jewelleryType;
	@Column(name = "GEMSTONE")
	private UUID gemStone;
	@Column(name = "MATERIAL")
	private UUID material;
	@Column(name = "BRAND")
	private String brand;
	
	@Column(name = "GROSSWEIGHT")
	private Double grossWeight;
	@Column(name = "LAB")
	private UUID lab;
	@Column(name = "STARTPRICE")
	private Double startPrice;
	
	@Column(name = "CERTIFICATE")
	private String certificate;
	
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

	public UUID getJewelleryId() {
		return jewelleryId;
	}

	public void setJewelleryId(UUID jewelleryId) {
		this.jewelleryId = jewelleryId;
	}

	public UUID getLotId() {
		return lotId;
	}

	public void setLotId(UUID lotId) {
		this.lotId = lotId;
	}

	public String getDiamondName() {
		return diamondName;
	}

	public void setDiamondName(String diamondName) {
		this.diamondName = diamondName;
	}

	public Integer getStockNumber() {
		return stockNumber;
	}

	public void setStockNumber(Integer stockNumber) {
		this.stockNumber = stockNumber;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getJewelleryType() {
		return jewelleryType;
	}

	public void setJewelleryType(String jewelleryType) {
		this.jewelleryType = jewelleryType;
	}

	public UUID getGemStone() {
		return gemStone;
	}

	public void setGemStone(UUID gemStone) {
		this.gemStone = gemStone;
	}

	public UUID getMaterial() {
		return material;
	}

	public void setMaterial(UUID material) {
		this.material = material;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Double getGrossWeight() {
		return grossWeight;
	}

	public void setGrossWeight(Double grossWeight) {
		this.grossWeight = grossWeight;
	}

	public UUID getLab() {
		return lab;
	}

	public void setLab(UUID lab) {
		this.lab = lab;
	}

	public Double getStartPrice() {
		return startPrice;
	}

	public void setStartPrice(Double startPrice) {
		this.startPrice = startPrice;
	}

	public String getCertificate() {
		return certificate;
	}

	public void setCertificate(String certificate) {
		this.certificate = certificate;
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
