package astoppello.msscbreweryclient.web;


import astoppello.msscbreweryclient.web.model.BeerDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.UUID;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
class BreweryClientTest {

    @Autowired
    BreweryClient breweryClient;


    @Test
    void getBeerById() {
        BeerDto beerById = breweryClient.getBeerById(UUID.randomUUID());
        assertThat(beerById).isNotNull();
    }
}