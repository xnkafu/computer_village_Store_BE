package com.ComputerVillageStore.start.domain;

import javax.persistence.*;
import javax.persistence.GeneratedValue;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table
public class Generation {
	
	@Id
	@GeneratedValue
	private String id;	@Column
	private String generationType ;
}