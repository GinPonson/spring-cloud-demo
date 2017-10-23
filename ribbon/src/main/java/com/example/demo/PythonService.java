package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author panyongjian
 * @since 2017/10/23.
 */
@Service
public class PythonService {

    @Autowired
    RestTemplate restTemplate;

    public String rest(){
        return  restTemplate.getForObject("http://SERVICE-SIDECAR/rest",String.class);
    }
}
