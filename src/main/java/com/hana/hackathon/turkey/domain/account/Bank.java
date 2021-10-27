package com.hana.hackathon.turkey.domain.account;


enum Bank {
	HANA("하나");
	private String typeName;

	Bank(String typeName) {
		this.typeName = typeName;
	}
}
