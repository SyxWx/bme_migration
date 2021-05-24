package com.bme.syx.cloud.web;


import com.bme.syx.cloud.service.EmissionSourceService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//排放源清单
@RestController
@RequestMapping(value = "esc")
public class EmissionSourceController {



    @Autowired
    private EmissionSourceService eissionSourceService;


    //http://localhost:8080/mig/esc/import?customerId=8
    @GetMapping("import")
    public String eissionSourceImport(String customerId){

        if(!StringUtils.isNotBlank(customerId)){
            customerId = "9999";
        }
       String  result =  eissionSourceService.insertEissionSource(customerId);
       return result;
    }
}
