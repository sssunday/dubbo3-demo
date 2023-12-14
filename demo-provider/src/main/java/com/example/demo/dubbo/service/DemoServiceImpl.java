package com.example.demo.dubbo.service;

import com.alibaba.fastjson2.JSON;
import com.example.demo.dubbo.api.DemoService;

import com.example.demo.dubbo.request.DemoRequest;
import com.example.demo.dubbo.response.DemoResponse;
import com.example.demo.dubbo.response.Teacher;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.DubboService;

@DubboService
@Slf4j
public class DemoServiceImpl implements DemoService {

    @Override
    public String sayHello(String name) {
        return "Hello " + name;
    }

    @Override
    public DemoResponse testDubbo(DemoRequest demoRequest){
        log.info("test dubbo param:" + JSON.toJSONString(demoRequest));
        DemoResponse demoResponse = new DemoResponse();
        demoResponse.setMsg("success");
        demoResponse.setTeacher(new Teacher());
        demoResponse.getTeacher().setTeacherName("teacher-A");
        demoResponse.getTeacher().setTeacherType(1);
        return demoResponse;
    }
}