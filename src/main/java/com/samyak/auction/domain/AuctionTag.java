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
@Table(name = "UA_AUCTIONTAG")
public class AuctionTag implements Serializable {

	private static final long serialVersionUID = -8302192288967469397L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	private Long id;
	
	@Column(name = "AUCTIONTAGID")
	private UUID auctiontagId;
	
	@Column(name = "AUCTIONID")
	private UUID auctionId;
	
	@Column(name = "INCREMENTTAG")
	private String incrementTag;
	
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

	public UUID getAuctiontagId() {
		return auctiontagId;
	}

	public void setAuctiontagId(UUID auctiontagId) {
		this.auctiontagId = auctiontagId;
	}

	public UUID getAuctionId() {
		return auctionId;
	}

	public void setAuctionId(UUID auctionId) {
		this.auctionId = auctionId;
	}

	public String getIncrementTag() {
		return incrementTag;
	}

	public void setIncrementTag(String incrementTag) {
		this.incrementTag = incrementTag;
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
