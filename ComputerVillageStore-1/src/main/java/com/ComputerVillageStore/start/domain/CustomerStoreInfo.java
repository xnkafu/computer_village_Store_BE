package com.ComputerVillageStore.start.domain;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table
public class CustomerStoreInfo {
	
	@Id
	@GeneratedValue
	private String Id;
	@Column
	private String storeName;
	@Column
	private String phoneNumber1;
	@Column
	private String phoneNumber2;
	@Column
	private String phoneNumber3;
	@Column
	private Address address;
	@Column
	private String email;

}
