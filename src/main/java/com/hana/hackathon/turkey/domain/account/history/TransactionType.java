package com.hana.hackathon.turkey.domain.account.history;

enum TransactionType {
	DEPOSIT("입금"), WITHDRAWAL("출금"), REMITTANCE("송금");
	private String typeName;

	TransactionType(String typeName) {
		this.typeName = typeName;
	}
}
