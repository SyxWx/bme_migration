package com.bme.syx.cloud.service;


import com.bme.syx.cloud.dao.EmissionSourceMapper;
import com.bme.syx.cloud.entity.EmissionSource;
import littlebee.excel.ExcelImport;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmissionSourceService {
    


    @Autowired
    private EmissionSourceMapper emissionSourceMapper;

    @Transactional
    public  String  insertEissionSource() {

        List<EmissionSource> list = new ArrayList<>();
        ExcelImport middleExcel = new ExcelImport(EmissionSource.class,1,"E:\\import\\排放源基本信息表.xlsx");

        try {
            //取到list值
            list=middleExcel.getModelList(EmissionSource.class);
            String customerId = list.get(0).getCustomer_id();
            if(!StringUtils.isNotBlank(customerId)){
                customerId = "9999";
            }
            emissionSourceMapper.insertEmissionSource(list);

            emissionSourceMapper.updateEmissionType(customerId);

            emissionSourceMapper.updateEmissionFactory(customerId);

            emissionSourceMapper.updateEmissionLine(customerId);

            emissionSourceMapper.updateEmissionSection(customerId);

            emissionSourceMapper.updateEmissionOrganizationW(customerId);

            emissionSourceMapper.updateEmissionOrganizationY(customerId);



            System.out.println("111111");
        } catch (Exception e) {
            e.printStackTrace();
        }
        for (EmissionSource es :  list){
            System.out.println(es.toString());
        }
        return null;
    }
}
