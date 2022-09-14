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
public class Customer {
	
	@Id
	@GeneratedValue
	private String id;
	@Column
	private String name;
	@Column
	private String phoneNumber1;
	@Column
	private String phoneNumber2;
	@Column
	private String phoneNumber3;
	@Column
	private String email;
	@OneToOne
	private Address address;
	
	

}
