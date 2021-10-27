package com.hana.hackathon.turkey.domain.account;

import com.hana.hackathon.turkey.domain.user.User;

import java.util.List;

public class SharedAccount extends Account {
	private List<User> owners;
}
