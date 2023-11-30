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
@Table(name = "AU_LOTDIAMOND")
public class LotDiamond implements Serializable
{

			private static final long serialVersionUID = -5105880516400521980L;

			@Id
			@GeneratedValue(strategy = GenerationType.AUTO)
			@Column(name = "ID")
			private Long id;

			@Column(name = "DIAMONDID")
			private UUID diamondId;

			@Column(name = "LOTID")
			private UUID lotId;

			@Column(name = "DIAMONDNAME")
			private String diamondName;
			@Column(name = "STOCKNUMBER")
			private Integer stockNumber;
			@Column(name = "STATUS")
			private String status;

			@Column(name = "SHAPE")
			private UUID shape;
			@Column(name = "COLOR")
			private UUID color;

			@Column(name = "FANCYCOLOR")
			private String fancyColor;
			@Column(name = "CLARITY")
			private UUID clarity;

			@Column(name = "WEIGHT")
			private Double weight;
			@Column(name = "LAB")
			private UUID lab;

			@Column(name = "CERTNO")
			private Integer certNo;
			@Column(name = "CUT")
			private UUID cut;
			@Column(name = "POLISH")
			private UUID polish;
			@Column(name = "SYM")
			private UUID sym;

			@Column(name = "FLOUR")
			private UUID flour;

			@Column(name = "FLOURCOLOR")
			private String flourColor;
			@Column(name = "MEASUREMENT")
			private String measurement;

			@Column(name = "LENGTH")
			private Double length;
			@Column(name = "WIDTH")
			private Double width;
			@Column(name = "HEIGHT")
			private Double height;
			@Column(name = "RAP")
			private Double rap;
			@Column(name = "PPC")
			private Double ppc;
			@Column(name = "TPRICE")
			private Double tPrice;

			@Column(name = "STARTPRICE")
			private Double startPrice;
			@Column(name = "RESERVEPRICE")
			private Double reservePrice;

			@Column(name = "REMARKS")
			private String remarks;
			@Column(name = "ORIGIN")
			private String origin;

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

			public Long getId()
			{
						return id;
			}

			public void setId(Long id)
			{
						this.id = id;
			}

			public UUID getDiamondId()
			{
						return diamondId;
			}

			public void setDiamondId(UUID diamondId)
			{
						this.diamondId = diamondId;
			}

			public UUID getLotId()
			{
						return lotId;
			}

			public void setLotId(UUID lotId)
			{
						this.lotId = lotId;
			}

			public String getDiamondName()
			{
						return diamondName;
			}

			public void setDiamondName(String diamondName)
			{
						this.diamondName = diamondName;
			}

			public Integer getStockNumber()
			{
						return stockNumber;
			}

			public void setStockNumber(Integer stockNumber)
			{
						this.stockNumber = stockNumber;
			}

			public String getStatus()
			{
						return status;
			}

			public void setStatus(String status)
			{
						this.status = status;
			}

			public UUID getShape()
			{
						return shape;
			}

			public void setShape(UUID shape)
			{
						this.shape = shape;
			}

			public UUID getColor()
			{
						return color;
			}

			public void setColor(UUID color)
			{
						this.color = color;
			}

			public String getFancyColor()
			{
						return fancyColor;
			}

			public void setFancyColor(String fancyColor)
			{
						this.fancyColor = fancyColor;
			}

			public UUID getClarity()
			{
						return clarity;
			}

			public void setClarity(UUID clarity)
			{
						this.clarity = clarity;
			}

			public Double getWeight()
			{
						return weight;
			}

			public void setWeight(Double weight)
			{
						this.weight = weight;
			}

			public UUID getLab()
			{
						return lab;
			}

			public void setLab(UUID lab)
			{
						this.lab = lab;
			}

			public Integer getCertNo()
			{
						return certNo;
			}

			public void setCertNo(Integer certNo)
			{
						this.certNo = certNo;
			}

			public UUID getCut()
			{
						return cut;
			}

			public void setCut(UUID cut)
			{
						this.cut = cut;
			}

			public UUID getPolish()
			{
						return polish;
			}

			public void setPolish(UUID polish)
			{
						this.polish = polish;
			}

			public UUID getSym()
			{
						return sym;
			}

			public void setSym(UUID sym)
			{
						this.sym = sym;
			}

			public UUID getFlour()
			{
						return flour;
			}

			public void setFlour(UUID flour)
			{
						this.flour = flour;
			}

			public String getFlourColor()
			{
						return flourColor;
			}

			public void setFlourColor(String flourColor)
			{
						this.flourColor = flourColor;
			}

			public String getMeasurement()
			{
						return measurement;
			}

			public void setMeasurement(String measurement)
			{
						this.measurement = measurement;
			}

			public Double getLength()
			{
						return length;
			}

			public void setLength(Double length)
			{
						this.length = length;
			}

			public Double getWidth()
			{
						return width;
			}

			public void setWidth(Double width)
			{
						this.width = width;
			}

			public Double getHeight()
			{
						return height;
			}

			public void setHeight(Double height)
			{
						this.height = height;
			}

			public Double getRap()
			{
						return rap;
			}

			public void setRap(Double rap)
			{
						this.rap = rap;
			}

			public Double getPpc()
			{
						return ppc;
			}

			public void setPpc(Double ppc)
			{
						this.ppc = ppc;
			}

			public Double gettPrice()
			{
						return tPrice;
			}

			public void settPrice(Double tPrice)
			{
						this.tPrice = tPrice;
			}

			public Double getStartPrice()
			{
						return startPrice;
			}

			public void setStartPrice(Double startPrice)
			{
						this.startPrice = startPrice;
			}

			public Double getReservePrice()
			{
						return reservePrice;
			}

			public void setReservePrice(Double reservePrice)
			{
						this.reservePrice = reservePrice;
			}

			public String getRemarks()
			{
						return remarks;
			}

			public void setRemarks(String remarks)
			{
						this.remarks = remarks;
			}

			public String getOrigin()
			{
						return origin;
			}

			public void setOrigin(String origin)
			{
						this.origin = origin;
			}

			public Boolean getActive()
			{
						return active;
			}

			public void setActive(Boolean active)
			{
						this.active = active;
			}

			public String getCreateBy()
			{
						return createBy;
			}

			public void setCreateBy(String createBy)
			{
						this.createBy = createBy;
			}

			public String getUpdateBy()
			{
						return updateBy;
			}

			public void setUpdateBy(String updateBy)
			{
						this.updateBy = updateBy;
			}

			public Timestamp getCreated()
			{
						return created;
			}

			public void setCreated(Timestamp created)
			{
						this.created = created;
			}

			public Timestamp getUpdated()
			{
						return updated;
			}

			public void setUpdated(Timestamp updated)
			{
						this.updated = updated;
			}

}
