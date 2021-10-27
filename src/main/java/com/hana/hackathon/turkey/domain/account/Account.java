package com.hana.hackathon.turkey.domain.account;

import com.hana.hackathon.turkey.domain.BaseEntity;
import com.hana.hackathon.turkey.domain.user.User;

import javax.persistence.*;

@Entity
public class Account extends BaseEntity { // todo: '공유계좌' 클래스는 따로 필요 없는지?
	@Enumerated(EnumType.STRING)
	private Bank bank;

	@Column(nullable = false)
	protected String number;

	@ManyToOne
	@JoinColumn(name = "user_id")
	protected User owner;

	@Column
	protected int balance; // todo: BigInteger 쓸 필요 있을 듯, ERD 변수명 변경 건의 [상훈]
}
