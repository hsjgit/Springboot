package com.xiaojia.service;

import com.alibaba.druid.sql.dialect.odps.ast.OdpsUDTFSQLSelectItem;
import com.xiaojia.bean.DrugTotal;
import com.xiaojia.mapper.SalesMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by 黄仕杰 on 2019/3/10.
 */
@Component
public class SalesService {
    @Autowired
    SalesMapper salesMapper;
    public void save(Object o){
        salesMapper.save(o);
    }
    public void updata(Object o){
        salesMapper.updata(o);
    }
    public double select(String day){
        return salesMapper.select(day);
    }
    public List<Double> listall(){
        List<Double> list = salesMapper.listall();
        return list;
    }
}
