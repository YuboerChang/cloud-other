package com.coolers.cloud.cloudOther.controller;

import com.coolers.cloud.cloudOther.po.Other;
import com.coolers.cloud.cloudOther.service.OtherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/other")
public class OtherController {
    @Autowired
    private OtherService otherService;

    @GetMapping("/getOther")
    public Other getOther() {
        return otherService.getOther();
    }
}
