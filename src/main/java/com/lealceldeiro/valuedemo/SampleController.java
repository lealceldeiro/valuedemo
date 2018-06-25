package com.lealceldeiro.valuedemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * SampleController
 *
 * @author Asiel Leal Celdeiro | lealceldeiro@gmail.com
 * @version 0.1
 */
@RestController
public class SampleController {

    private final ConfigClass config;

    public SampleController(ConfigClass configClass) {
        this.config = configClass;
    }

    @RequestMapping(value = "test")
    public String test() {
        return config.getAccessKey();
    }
}
