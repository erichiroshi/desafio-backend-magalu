package com.erichiroshi.magalu.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.erichiroshi.magalu.entity.Status;

public interface StatusRepository extends JpaRepository<Status, Long> {

}
