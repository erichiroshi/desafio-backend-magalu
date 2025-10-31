package com.erichiroshi.magalu.config;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.erichiroshi.magalu.entity.Channel;
import com.erichiroshi.magalu.entity.Status;
import com.erichiroshi.magalu.repository.ChannelRepository;
import com.erichiroshi.magalu.repository.StatusRepository;

import lombok.RequiredArgsConstructor;

@Configuration
@RequiredArgsConstructor
public class DataLoader implements CommandLineRunner {

    private final ChannelRepository channelRepository;
    private final StatusRepository statusRepository;

    @Override
    public void run(String... args) throws Exception {
        Arrays.stream(Channel.Values.values()).map(Channel.Values::toChannel).forEach(channelRepository::save);

        Arrays.stream(Status.Values.values()).map(Status.Values::toStatus).forEach(statusRepository::save);
    }
}