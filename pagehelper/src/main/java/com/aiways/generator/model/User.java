package com.aiways.generator.model;

import lombok.Data;

@Data
public class User extends BasePage{
    private String userid;

    private String password;

    private String name;

    private String sex;

}