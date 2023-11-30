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
@Table(name = "AU_LOT_EXT")
public class LotExt implements Serializable {

	private static final long serialVersionUID = -2064267418802722379L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	private Long id;
	@Column(name = "LOTID")
	private UUID LOTEXTID;
	@Column(name = "OPENINGBIDTIME")
	private Timestamp openingbidtime;
	@Column(name = "CLOSINGBIDTIME")
	private Timestamp closingbidtime;
	@Column(name = "EXTENDEDAUCTION")
	private String extendedauction;
	@Column(name = "BUYERID")
	private UUID buyerid;
	@Column(name = "SALEDATE")
	private Timestamp saledate;
	@Column(name = "PAYMENTDUEDATE")
	private Timestamp paymentduedate;
	@Column(name = "PAYMENTSSTATUS")
	private String paymentsstatus;

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

	public UUID getLOTEXTID() {
		return LOTEXTID;
	}

	public void setLOTEXTID(UUID lOTEXTID) {
		LOTEXTID = lOTEXTID;
	}

	public Timestamp getOpeningbidtime() {
		return openingbidtime;
	}

	public void setOpeningbidtime(Timestamp openingbidtime) {
		this.openingbidtime = openingbidtime;
	}

	public Timestamp getClosingbidtime() {
		return closingbidtime;
	}

	public void setClosingbidtime(Timestamp closingbidtime) {
		this.closingbidtime = closingbidtime;
	}

	public String getExtendedauction() {
		return extendedauction;
	}

	public void setExtendedauction(String extendedauction) {
		this.extendedauction = extendedauction;
	}

	public UUID getBuyerid() {
		return buyerid;
	}

	public void setBuyerid(UUID buyerid) {
		this.buyerid = buyerid;
	}

	public Timestamp getSaledate() {
		return saledate;
	}

	public void setSaledate(Timestamp saledate) {
		this.saledate = saledate;
	}

	public Timestamp getPaymentduedate() {
		return paymentduedate;
	}

	public void setPaymentduedate(Timestamp paymentduedate) {
		this.paymentduedate = paymentduedate;
	}

	public String getPaymentsstatus() {
		return paymentsstatus;
	}

	public void setPaymentsstatus(String paymentsstatus) {
		this.paymentsstatus = paymentsstatus;
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
