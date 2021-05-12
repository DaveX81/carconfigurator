package net.pentzlin.CarConfigurator.controller;

import net.pentzlin.CarConfigurator.entity.car.Car;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class CarConfiguratorControllerTest {

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate testRestTemplate;

    private String url = "http://localhost:";

    @Test
    void testNumberOfCarModelsGreaterZero() {
        var response = testRestTemplate.getForObject(
                this.url + this.port + "/api/configuration/car", List.class);
        assertThat(response != null && !response.isEmpty());
    }
}
