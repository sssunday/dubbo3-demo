package com.example.demo.dubbo.request;

import lombok.Data;

import java.io.Serializable;

@Data
public class School  implements Serializable {

    private String schoolName;

    private Integer schoolType;
}
