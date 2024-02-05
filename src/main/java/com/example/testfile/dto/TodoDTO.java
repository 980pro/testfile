package com.example.testfile.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TodoDTO {

    private int age;
    private String name;
    private String userid;
    private String userpass;
    private String sex;
    private String hobby;
    private String travel;
    private String text;

}
