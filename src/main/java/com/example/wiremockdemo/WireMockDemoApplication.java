package com.example.wiremockdemo;

import com.github.tomakehurst.wiremock.core.Options;
import com.github.tomakehurst.wiremock.core.WireMockConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.contract.wiremock.AutoConfigureWireMock;
import org.springframework.cloud.contract.wiremock.WireMockSpring;
import org.springframework.context.annotation.Bean;

import java.io.IOException;

@SpringBootApplication
@AutoConfigureWireMock()
public class WireMockDemoApplication  {

    public static void main(String[] args) {
        SpringApplication.run(WireMockDemoApplication.class, args);
    }

    @Bean
    public Options wireMockOptions() throws IOException {

        final WireMockConfiguration options = WireMockSpring.options();
        options.port(8080);

        System.out.println(getClass().getProtectionDomain().getCodeSource().getLocation());

        return options;
    }
}
