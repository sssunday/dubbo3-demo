package com.example.demo.dubbo.response;

import lombok.Data;

import java.io.Serializable;

@Data
public class DemoResponse implements Serializable {

    private String msg;

    private Teacher teacher;
}
