package com.pecf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 描述：
 * 作者：31734
 * 创建日期：2024/4/15
 * 修改日期：2024/4/15
 */
@SpringBootApplication
public class MineManagerApplication {
    public static void main(String[] args) {
        SpringApplication.run(MineManagerApplication.class, args);
        System.out.println("系统启动成功");
    }
}