package com.bme.syx.cloud.dao;


import com.bme.syx.cloud.entity.CountEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CountMapper {



    List<CountEntity> selectCountByTypes(CountEntity count);


}
