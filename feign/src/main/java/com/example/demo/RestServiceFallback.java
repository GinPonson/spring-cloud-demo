package com.example.demo;

import org.springframework.stereotype.Service;

/**
 * @author panyongjian
 * @since 2017/10/23.
 */
@Service
public class RestServiceFallback implements RestService {
    @Override
    public String sayHiFromClientOne() {
        return "oh,fallback";
    }
}
