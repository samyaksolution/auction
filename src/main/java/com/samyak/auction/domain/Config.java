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
@Table(name = "UA_CONFIG")
public class Config implements Serializable {

	private static final long serialVersionUID = 4229884409871995718L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	private Long id;

	@Column(name = "CONFIGID")
	private UUID configId;

	@Column(name = "NAME")
	private String desc;

	@Column(name = "DATA")
	private String code;

	@Column(name = "NOTE")
	private String note;

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

	public UUID getConfigId() {
		return configId;
	}

	public void setConfigId(UUID configId) {
		this.configId = configId;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
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
