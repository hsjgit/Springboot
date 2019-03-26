package com.xiaojia.service;
import com.xiaojia.bean.Drug;
import com.xiaojia.mapper.DrugMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

/**
 * @author 黄仕杰
 * Created by 黄仕杰 on 2019/3/9.
 */
@Component
public class DrugService {
    @Autowired
    private DrugMapper drugMapper;
    @Autowired
    private Drug drug;
    public void save(Object o){
        drugMapper.save(o);
    }
    public void updata(Integer num,Double price,String name,Integer sales,String code) {
        drugMapper.updata(num,price,name,sales,code);
    }

    public void delate(int id) {
        drugMapper.delete(id);
    }
    public Drug select(String name){
        return drugMapper.select(name);
    }
    public List<Drug> allDrug(){
        return drugMapper.listall();
    }
}
