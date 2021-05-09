package com.bme.syx.cloud.web;


import com.bme.syx.cloud.service.EmissionSourceService;
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


    @GetMapping("import")
    public String eissionSourceImport(){

        System.out.println("import");

       String  result =  eissionSourceService.insertEissionSource();

       return result;
    }
}
