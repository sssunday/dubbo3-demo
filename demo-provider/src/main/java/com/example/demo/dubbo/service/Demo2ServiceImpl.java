package com.example.demo.dubbo.service;

import com.alibaba.fastjson2.JSON;
import com.example.demo.dubbo.api.Demo2Service;
import com.example.demo.dubbo.request.DemoRequest;
import com.example.demo.dubbo.response.DemoResponse;
import com.example.demo.dubbo.response.Teacher;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.DubboService;

@DubboService
@Slf4j
public class Demo2ServiceImpl implements Demo2Service {

    @Override
    public String sayHello2(String name) {
        return "demo2 Hello " + name;
    }

    @Override
    public DemoResponse testDubbo2(DemoRequest demoRequest){
        log.info("test dubbo demo2 param:" + JSON.toJSONString(demoRequest));
        DemoResponse demoResponse = new DemoResponse();
        demoResponse.setMsg("success");
        demoResponse.setTeacher(new Teacher());
        demoResponse.getTeacher().setTeacherName("teacher-A");
        demoResponse.getTeacher().setTeacherType(1);
        return demoResponse;
    }
}
