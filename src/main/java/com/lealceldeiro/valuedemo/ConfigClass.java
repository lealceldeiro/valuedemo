package com.lealceldeiro.valuedemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * ConfigClass
 *
 * @author Asiel Leal Celdeiro | lealceldeiro@gmail.com
 * @version 0.1
 */
@Component
public class ConfigClass {

    @Value("${bws.access.key}")
    private String accessKey;

    public void setAccessKey(String ak){
        this.accessKey = ak;
    }

    public String getAccessKey() {
        return this.accessKey;
    }
}
