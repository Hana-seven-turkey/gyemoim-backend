package com.hana.hackathon.turkey.domain.stock;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Stock {
	@Id
	private String code;

	@Column
	private String name;
}
