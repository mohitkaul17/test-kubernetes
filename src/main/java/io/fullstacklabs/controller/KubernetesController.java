package io.fullstacklabs.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KubernetesController {

    @Value("${value.passed:no-value-passed}")
    private String value;

    @RequestMapping("/")
    public String init() {
        return "Variable Value passed from: " + value;
    }
}
