package br.com.erichiroshi.magalums.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.erichiroshi.magalums.entity.Channel;

public interface ChannelRepository extends JpaRepository<Channel, Long> {
}
