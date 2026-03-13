package astoppello.msscbreweryclient.web;


import astoppello.msscbreweryclient.web.model.BeerDto;
import astoppello.msscbreweryclient.web.model.CustomerDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.net.URI;
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

    @Test
    void testSaveNewBeer() {
        BeerDto beerDto = BeerDto.builder().beerName("New Beer").build();
        URI uri = breweryClient.saveNewBeer(beerDto);
        assertThat(uri).isNotNull();
        System.out.println(uri.toString());
    }

    @Test
    void testUpdateBeer() {
        BeerDto beerDto = BeerDto.builder().beerName("New Beer").build();
        breweryClient.updateBeer(UUID.randomUUID(), beerDto);
    }

    @Test
    void testDeleteBeer() {
        breweryClient.deleteBeer(UUID.randomUUID());
    }

    //Customer
    @Test
    void testGetCustomerById() {
        CustomerDto customerById = breweryClient.getCustomerById(UUID.randomUUID());
        assertThat(customerById).isNotNull();
    }

    @Test
    void testSaveNewCustomer(){
        CustomerDto customerDto = CustomerDto.builder().name("New Customer").build();
        URI uri = breweryClient.saveNewCustomer(customerDto);
        assertThat(uri).isNotNull();
    }
    @Test
    void testUpdateCustomer() {
        CustomerDto customerDto = CustomerDto.builder().name("New Customer").build();
        breweryClient.updateCustomer(UUID.randomUUID(), customerDto);
    }

    @Test
    void testDeleteCustomer() {
        breweryClient.deleteCustomer(UUID.randomUUID());
    }
}