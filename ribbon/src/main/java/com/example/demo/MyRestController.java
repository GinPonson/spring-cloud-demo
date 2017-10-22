package com.example.demo;

import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author GinPonson
 * @since 2017/10/21
 */
@RestController
public class MyRestController {

    @Autowired
    RestService restService;

    @GetMapping(value = "/rest")
    public String rest(){
        return  restService.rest();
    }


}
