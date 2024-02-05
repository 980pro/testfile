package com.example.testfile.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter
@Builder
@ToString
public class TodoVO {

    private Long tno;
    private int age;
    private String name;
    private String userid;
    private String  userpass;
    private String sex;
    private String hobby;
    private String travel;
    private String text;
}
