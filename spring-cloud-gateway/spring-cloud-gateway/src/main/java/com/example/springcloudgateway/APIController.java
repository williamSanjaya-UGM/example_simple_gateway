package com.example.springcloudgateway;

import com.example.springcloudgateway.dto.CatalogDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/")
@Slf4j
public class APIController {

    @Autowired
    private WebClient webClient;

    @GetMapping
    public Flux<UserDto> getAllUsers() {
        return webClient.get()
                .uri("https://jsonplaceholder.typicode.com/users")
                .retrieve()
                .bodyToFlux(UserDto.class);
    }

    @GetMapping("/giveMeCatalog")
    public Flux<CatalogDto> getAllCatalogs() {
        log.info("get Hit Second");
        return webClient.get()
                .uri("http://localhost:8084/catalog/smartphone")
                .retrieve()
                .bodyToFlux(CatalogDto.class);
    }


}
