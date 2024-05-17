package com.pecf.entity;

import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@Builder
public class Friend {

    private Long id;

    private String name;

    private Date birthDate;

    private Long sex;

    private String comment;

    private String phone;

    private String qq;

    private String idCard;

    private String wechat;

    private String avatar;


}
