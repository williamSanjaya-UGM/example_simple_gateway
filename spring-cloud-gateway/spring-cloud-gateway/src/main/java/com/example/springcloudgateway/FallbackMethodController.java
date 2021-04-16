package com.example.springcloudgateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbackMethodController {

    @GetMapping("/catalogServiceFallback")
    public String catalogServiceFallBackMethod() {
        return "Catalog service is taking longer than expected"+
                "Please try again later";
    }
}
