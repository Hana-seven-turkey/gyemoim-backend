package com.hana.hackathon.turkey.domain.account.history;

import com.hana.hackathon.turkey.domain.BaseEntity;
import com.hana.hackathon.turkey.domain.account.Account;

import javax.persistence.*;

@Entity
public class AccountTransaction extends BaseEntity {

	@Enumerated(EnumType.STRING)
	TransactionType transactionType;

	@ManyToOne
	private Account toAccount;

	@ManyToOne
	private Account fromAccount;

	@Column
	private long amount;
}
