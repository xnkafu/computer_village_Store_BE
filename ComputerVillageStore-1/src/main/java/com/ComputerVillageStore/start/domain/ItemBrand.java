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
public class ItemBrand {
	
	@Id
	@GeneratedValue
	private String id;
	@Column
	private String name;

}