package com.pecf.entity;

import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@Builder
public class DailyFood {
    private Long id;
    private String title;
    private String images;
    private String remark;
    private Date ateTime;
    private Long ateTag;
}
