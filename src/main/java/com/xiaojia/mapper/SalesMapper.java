package com.xiaojia.mapper;

import com.xiaojia.bean.DrugTotal;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by 黄仕杰 on 2019/3/10.
 */
public interface SalesMapper {
    void save(Object o);
    void updata(Object o);
    double select(@Param("day") String day);
    List<Double> listall();
}
