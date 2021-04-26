package com.bme.syx.cloud.entity;


import lombok.Data;

//排放源清单
@Data
public class EissionSource {

    private String emission_source_no ;
    private String emission_source_name ;
    private String emission_source_type ;
    private int customer_id ;
    private String branch_factory ;
    private String production_line ;
    private String processes ;
    private String process_section ;
    private String longitude ;
    private String latitude ;
    private String static_production_name ;
    private String static_production_info ;
    private String close_detail ;
    private String materiel ;
    private String image_url ;
    private String organization_type ;
    private String display_name ;
    private String remark ;
    private String production_describe ;
    private String government_describe ;
    private String monitor_describe ;
}
