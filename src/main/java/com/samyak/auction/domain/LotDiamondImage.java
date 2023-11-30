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
@Table(name = "AU_LOT_DIAMONDIMAGE")
public class LotDiamondImage implements Serializable {


	private static final long serialVersionUID = 5817733238029421653L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	private Long id;

	@Column(name = "DIAMONIMAGEID")
	private UUID diamonImageId;
	
	@Column(name = "DIAMONDID")
	private UUID diamonId;
	
	@Column(name = "IMAGE")
	private String image;

	@Column(name = "VIDEO")
	private String vedeo;

	@Column(name = "REMARK")
	private String remark;

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

	public UUID getDiamonImageId() {
		return diamonImageId;
	}

	public void setDiamonImageId(UUID diamonImageId) {
		this.diamonImageId = diamonImageId;
	}

	public UUID getDiamonId() {
		return diamonId;
	}

	public void setDiamonId(UUID diamonId) {
		this.diamonId = diamonId;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getVedeo() {
		return vedeo;
	}

	public void setVedeo(String vedeo) {
		this.vedeo = vedeo;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
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
