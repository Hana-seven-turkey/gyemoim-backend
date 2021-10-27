package com.hana.hackathon.turkey.domain.gye;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GyeRepository extends JpaRepository<Gye, Long> {
}
