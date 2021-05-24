package com.bme.syx.cloud.web;

import com.bme.syx.cloud.service.SignalService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="signal")
public class SignalController {


    @Autowired
    private SignalService signalService;


    //http://localhost:8080/mig/signal/import?customerId=8
    @RequestMapping(value="import")
    public String importSignal(String customerId){
        if(!StringUtils.isNotBlank(customerId)){
            customerId = "9999";
        }
        String  result =  signalService.insertSignalInfo(customerId);
        return result;
    }
}
