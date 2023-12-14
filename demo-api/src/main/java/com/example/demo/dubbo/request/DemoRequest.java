package com.example.demo.dubbo.request;

import lombok.Data;

import java.io.Serializable;

@Data
public class DemoRequest  implements Serializable {

    private String name;

    private Integer age;

    private Double score;

    private School school;
}
