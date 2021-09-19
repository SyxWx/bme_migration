package com.bme.syx.cloud.web;


import com.bme.syx.cloud.service.CountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "count")
public class CountController {


    @Autowired
    private CountService countService;


    //http://localhost:8080/mig/count/export
    @RequestMapping(value="export")
    public String export(){

        String  result =  countService.export();
        return result;
    }

}
