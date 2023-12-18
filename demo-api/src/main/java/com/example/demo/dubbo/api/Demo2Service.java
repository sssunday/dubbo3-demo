package com.example.demo.dubbo.api;

import com.example.demo.dubbo.request.DemoRequest;
import com.example.demo.dubbo.response.DemoResponse;

public interface Demo2Service {

    String sayHello2(String name);
    DemoResponse testDubbo2(DemoRequest demoRequest);
}
