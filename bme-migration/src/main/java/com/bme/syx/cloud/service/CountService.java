package com.bme.syx.cloud.service;

import com.bme.syx.cloud.entity.CountEntity;
import org.springframework.stereotype.Service;

@Service
public class CountService {


    public String export(){

        CountEntity producDevcice  = new CountEntity();
        producDevcice.setTypeIds("1");

        return null;
    }


}
