package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author GinPonson
 * @since 2017/10/21
 */
@Service
public class RestService {

    @Autowired
    RestTemplate restTemplate;

    public String rest(){
        return  restTemplate.getForObject("http://SERVICE-HI/hi",String.class);
    }


}
