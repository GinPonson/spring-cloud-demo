package com.example.demo;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author GinPonson
 * @since 2017/10/21
 */
@Service
@FeignClient(value = "SERVICE-HI")
public interface RestService {

    @GetMapping(value = "/hi")
    String sayHiFromClientOne();
}
