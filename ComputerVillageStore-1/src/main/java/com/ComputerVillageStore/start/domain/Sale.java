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
public class Sale {
	
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
	private long salePrice;
	@OneToMany
	private Employee soldBy;
	@Column
	private String quantitySold;
	@Column
	private Date saleDate;	
	
	

}
