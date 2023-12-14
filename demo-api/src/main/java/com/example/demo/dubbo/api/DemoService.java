package com.example.demo.dubbo.api;

import com.example.demo.dubbo.request.DemoRequest;
import com.example.demo.dubbo.response.DemoResponse;

public interface DemoService {

    String sayHello(String name);

    DemoResponse testDubbo(DemoRequest demoRequest);
}
