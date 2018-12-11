package fr.nevechris.sample.movie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableAutoConfiguration
@EnableDiscoveryClient
public class MovieServer {

    public static void main(String[] args) {
        System.setProperty("spring.config.name", "movie-server");
        SpringApplication.run(MovieServer.class, args);
    }
}
