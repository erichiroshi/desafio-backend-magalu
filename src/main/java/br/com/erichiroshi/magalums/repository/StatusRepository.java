package br.com.erichiroshi.magalums.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.erichiroshi.magalums.entity.Status;

public interface StatusRepository extends JpaRepository<Status, Long> {
}