package com.hana.hackathon.turkey.domain.gye;

import com.hana.hackathon.turkey.domain.BaseEntity;
import com.hana.hackathon.turkey.domain.UserInGye;
import com.hana.hackathon.turkey.domain.account.Account;
import com.hana.hackathon.turkey.domain.stock.Stock;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;


@Entity
public class Gye extends BaseEntity {

	@Column
	private String name;

	@ManyToOne
	private Account account;

	@OneToMany(mappedBy = "gye", cascade = CascadeType.ALL)
	Set<UserInGye> usersInGye = new HashSet<>();

	@OneToMany
	private Set<Stock> stocks;
}