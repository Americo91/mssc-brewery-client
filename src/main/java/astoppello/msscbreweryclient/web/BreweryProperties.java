package astoppello.msscbreweryclient.web;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "sfg.brewery", ignoreUnknownFields = false)
public record BreweryProperties(String apihost) {
    // Using a Record is the modern, immutable way (Spring Boot 3+)
}