package com.hana.hackathon.turkey.domain.user;


import com.hana.hackathon.turkey.domain.BaseEntity;
import com.hana.hackathon.turkey.domain.UserInGye;
import com.hana.hackathon.turkey.domain.gye.Gye;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class User extends BaseEntity {

	@Column(nullable = false)
	private String email;

	@Column(nullable = false)
	private String encryptedPwd;

	@Column(nullable = false)
	private String realName;

	@Column
	private String nickName;

	@OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
	private Set<UserInGye> rooms = new HashSet<>();

	// todo: 계좌에 대한 정보가 필요할수도 있음
}