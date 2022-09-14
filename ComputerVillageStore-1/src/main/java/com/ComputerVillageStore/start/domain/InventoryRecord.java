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
public class InventoryRecord {
	
	@Id
	@GeneratedValue
	private String id;
	@Column
	private ItemBrand itemBrand;
	@Column
	private ItemType itemType;
	@Column
	private long quantity;
	@Column
	private Date date;
	@Column
	private String description;
	@Column
	private Employee addedBy;
}