package com.pecf.controller;

import com.pecf.entity.Friend;
import org.springframework.web.bind.annotation.*;

/**
 * 描述：
 * 作者：31734
 * 创建日期：2024/4/15
 * 修改日期：2024/4/15
 */
@RestController("/friend")
public class FriendController {

    @PostMapping("/add")
    public void add(@RequestBody Friend friend) {

    }

    @DeleteMapping("/{id}")
    public void del(@PathVariable("id") Long id) {

    }

    @GetMapping("/list")
    public void list() {

    }

    @GetMapping("/info")
    public String info() {
        return "信息";
    }

    @PutMapping("/update")
    public void update() {

    }
}
