package com.ComputerVillageStore.start.domain;

import java.util.Date;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table
public class Item {
	
	@Id
	@GeneratedValue
	private String id;
	@ManyToMany
	private ItemBrand itemBrand;
	@ManyToMany
	private ItemType itemType;
	@Column
	private String model;
	@Column
	private String processor;
	@Column
	private String ram;
	@Column
	private String description;
	@Column
	private String hdd;
	@Column
	private String size;
	@Column
	private long sellingPrice;
	@Column
	private long quantitySent;
	@Column
	private String quantitySold;
	@Column
	private Date shipmentDate;	
	@Column
	private Employee addedBy;	
	@Column
	private String condition;	
	@Transient
	private String barcode;	
	// https://www.baeldung.com/java-generating-barcodes-qr-codes
	

}