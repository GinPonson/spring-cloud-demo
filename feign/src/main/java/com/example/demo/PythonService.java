package com.example.demo;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * sidecar 整合python接口的服务
 * @author panyongjian
 * @since 2017/10/23.
 */
@Service
@FeignClient("service-sidecar")
public interface PythonService {

    @GetMapping(value = "/rest")
    String helloPython();
}
