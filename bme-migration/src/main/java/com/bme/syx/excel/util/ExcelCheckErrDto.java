package com.bme.syx.excel.util;

import lombok.Data;

@Data
public class ExcelCheckErrDto<T> {

    private T t;

    private String errMsg;

    public ExcelCheckErrDto(){}

    public ExcelCheckErrDto(T t, String errMsg){
        this.t = t;
        this.errMsg = errMsg;
    }
}
