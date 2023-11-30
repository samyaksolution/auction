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
@Table(name = "AU_AUCTION")
public class Auction implements Serializable {

	private static final long serialVersionUID = -5180205245550232767L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	private Long id;
	@Column(name = "AUCTIONID")
	private UUID auctionId;
	@Column(name = "NAME")
	private String name;
	@Column(name = "INVENTORY")
	private String inventory;
	@Column(name = "VIEWINGDATETIME")
	private Timestamp viewingDateTime;
	@Column(name = "STARTDATETIME")
	private Timestamp startDateTime;
	@Column(name = "ENDDATETIME")
	private Timestamp endDateTime;
	@Column(name = "BIDINCREMENTBY")
	private Double bidIncrementBy;
	@Column(name = "RESULTDATETIME")
	private Timestamp resultDatetime;
	@Column(name = "BULKBID")
	private String bulkbId;
	@Column(name = "PROXYBID")
	private String proxybId;
	@Column(name = "POPCORNBID")
	private String popCornBid;
	@Column(name = "EXTENDDEADLINETYPE")
	private Integer extendDeadLineType;
	@Column(name = "EXTENDDEADLINEVALUE")
	private Integer extendDeadLineValue;
	@Column(name = "NOOFTIMESBIDEXTEND")
	private Integer noOfTimesBidExtend;
	@Column(name = "AUCTIONMODE")
	private String auctionMode;
	@Column(name = "RECORDSTATUS")
	private String recordStatus;
	@Column(name = "DESCRIPTION")
	private String description;
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
	public UUID getAuctionId() {
		return auctionId;
	}
	public void setAuctionId(UUID auctionId) {
		this.auctionId = auctionId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getInventory() {
		return inventory;
	}
	public void setInventory(String inventory) {
		this.inventory = inventory;
	}
	public Timestamp getViewingDateTime() {
		return viewingDateTime;
	}
	public void setViewingDateTime(Timestamp viewingDateTime) {
		this.viewingDateTime = viewingDateTime;
	}
	public Timestamp getStartDateTime() {
		return startDateTime;
	}
	public void setStartDateTime(Timestamp startDateTime) {
		this.startDateTime = startDateTime;
	}
	public Timestamp getEndDateTime() {
		return endDateTime;
	}
	public void setEndDateTime(Timestamp endDateTime) {
		this.endDateTime = endDateTime;
	}
	public Double getBidIncrementBy() {
		return bidIncrementBy;
	}
	public void setBidIncrementBy(Double bidIncrementBy) {
		this.bidIncrementBy = bidIncrementBy;
	}
	public Timestamp getResultDatetime() {
		return resultDatetime;
	}
	public void setResultDatetime(Timestamp resultDatetime) {
		this.resultDatetime = resultDatetime;
	}
	public String getBulkbId() {
		return bulkbId;
	}
	public void setBulkbId(String bulkbId) {
		this.bulkbId = bulkbId;
	}
	public String getProxybId() {
		return proxybId;
	}
	public void setProxybId(String proxybId) {
		this.proxybId = proxybId;
	}
	public String getPopCornBid() {
		return popCornBid;
	}
	public void setPopCornBid(String popCornBid) {
		this.popCornBid = popCornBid;
	}
	public Integer getExtendDeadLineType() {
		return extendDeadLineType;
	}
	public void setExtendDeadLineType(Integer extendDeadLineType) {
		this.extendDeadLineType = extendDeadLineType;
	}
	public Integer getExtendDeadLineValue() {
		return extendDeadLineValue;
	}
	public void setExtendDeadLineValue(Integer extendDeadLineValue) {
		this.extendDeadLineValue = extendDeadLineValue;
	}
	public Integer getNoOfTimesBidExtend() {
		return noOfTimesBidExtend;
	}
	public void setNoOfTimesBidExtend(Integer noOfTimesBidExtend) {
		this.noOfTimesBidExtend = noOfTimesBidExtend;
	}
	public String getAuctionMode() {
		return auctionMode;
	}
	public void setAuctionMode(String auctionMode) {
		this.auctionMode = auctionMode;
	}
	public String getRecordStatus() {
		return recordStatus;
	}
	public void setRecordStatus(String recordStatus) {
		this.recordStatus = recordStatus;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
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
