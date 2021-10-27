package com.hana.hackathon.turkey.domain;

import com.hana.hackathon.turkey.domain.gye.Gye;
import com.hana.hackathon.turkey.domain.user.User;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class UserInGye extends BaseEntity {

	@ManyToOne
	@JoinColumn(nullable = false)
	private User user;

	@ManyToOne
	@JoinColumn(nullable = false)
	private Gye gye;

	@Column
	private long amount;
}
