package astoppello.msscbreweryclient.web;

import astoppello.msscbreweryclient.web.model.BeerDto;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.restclient.RestTemplateBuilder;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.UUID;


@Component
public class BreweryClient {

    public final String BEER_PATH_V1 = "/api/v1/beer/";
    private final RestTemplate restTemplate;
    private String apihost;

    public BreweryClient(RestTemplateBuilder restTemplateBuilder, BreweryProperties properties) {
        this.restTemplate = restTemplateBuilder.build();
        this.apihost = properties.apihost();
    }

    public BeerDto getBeerById(UUID uuid) {
        return restTemplate.getForObject(apihost + BEER_PATH_V1 + uuid.toString(), BeerDto.class);
    }


}

