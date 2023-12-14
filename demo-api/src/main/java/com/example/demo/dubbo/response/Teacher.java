package com.example.demo.dubbo.response;

import lombok.Data;

import java.io.Serializable;

@Data
public class Teacher implements Serializable {

    private Integer teacherType;

    private String teacherName;
}
