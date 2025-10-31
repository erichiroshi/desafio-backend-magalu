package com.erichiroshi.magalu.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.erichiroshi.magalu.entity.Channel;

public interface ChannelRepository extends JpaRepository<Channel, Long> {

}
