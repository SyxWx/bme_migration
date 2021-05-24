package com.bme.syx.cloud.web;

import com.bme.syx.cloud.service.SignalService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

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

    //http://localhost:8080/mig/signal/import?customerId=8
    @RequestMapping(value="fileimport")
    @ResponseBody
    public String importFileSignal(String customerId, @RequestParam(value="file",required = false) MultipartFile file){
        if(!StringUtils.isNotBlank(customerId)){
            customerId = "9999";
        }
        String  result =  signalService.insertFileSignalInfo(customerId,file);
        return result;
    }
}
