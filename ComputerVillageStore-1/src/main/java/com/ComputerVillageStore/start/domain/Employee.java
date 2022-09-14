package com.ComputerVillageStore.start.domain;

import java.io.File;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table
public class Employee {
	
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
	@Column
	private String contactName;
	@Column
	private String contactPhoneNumber;
	@Column
	private File photoId;
	@Column
	private File educationCertificate;
	@OneToOne
	private Address address;

}
