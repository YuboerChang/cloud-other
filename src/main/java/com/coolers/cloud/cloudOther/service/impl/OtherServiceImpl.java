package com.coolers.cloud.cloudOther.service.impl;

import com.coolers.cloud.cloudOther.po.Other;
import com.coolers.cloud.cloudOther.service.OtherService;
import org.springframework.stereotype.Service;

@Service
public class OtherServiceImpl implements OtherService {
    @Override
    public Other getOther() {
        return new Other("002", "test");
    }
}
