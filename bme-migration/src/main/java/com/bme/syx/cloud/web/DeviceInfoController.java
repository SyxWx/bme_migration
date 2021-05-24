package com.bme.syx.cloud.web;


import com.bme.syx.cloud.service.DeviceInfoService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//设备表
@RestController
@RequestMapping(value = "device")
public class DeviceInfoController {


    @Autowired
    private DeviceInfoService deviceInfoService;


    ////http://localhost:8080/mig/device/import?customerId=8
    @RequestMapping(value="import")
    public String importDeviceInfo(String customerId){
        if(!StringUtils.isNotBlank(customerId)){
            customerId = "9999";
        }
        String  result =  deviceInfoService.insertDeviceInfo(customerId);
        return result;
    }


}
