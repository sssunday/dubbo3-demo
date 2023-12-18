/*
 * Copyright 2013-2018 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.demo.dubbo.consumer;

import com.alibaba.fastjson2.JSON;
import com.example.demo.dubbo.api.Demo2Service;
import com.example.demo.dubbo.api.DemoService;
import com.example.demo.dubbo.request.DemoRequest;
import com.example.demo.dubbo.request.School;
import com.example.demo.dubbo.response.DemoResponse;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author <a href="mailto:chenxilzx1@gmail.com">theonefx</a>
 */
@Controller
@Slf4j
public class Consumer2Controller {

    @DubboReference
    private Demo2Service demo2Service;

    @RequestMapping("/sayHello2")
    @ResponseBody
    public String sayHello(@RequestParam(name = "name", defaultValue = "unknown user") String name) {
        return demo2Service.sayHello2(name);
    }

    @RequestMapping("/testDubbo2")
    @ResponseBody
    public DemoResponse testDubbo() {
        DemoRequest demoRequest = new DemoRequest();
        demoRequest.setName("student-A");
        demoRequest.setAge(18);
        demoRequest.setScore(98.5d);
        demoRequest.setSchool(new School());
        demoRequest.getSchool().setSchoolName("School-S");
        demoRequest.getSchool().setSchoolType(3);
        DemoResponse demoResponse = demo2Service.testDubbo2(demoRequest);
        log.info("test dubbo resp:" + JSON.toJSONString(demoResponse));
        return demoResponse;
    }
}
