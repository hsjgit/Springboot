package com.xiaojia.service;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.xiaojia.business.DrugSalesVolume;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 将java对象转换成json的数据形式
 * @author 黄仕杰
 * Created by 黄仕杰 on 2019/3/10.
 */
@Component
public class ToJson {
    public String json(Object o){
        ObjectMapper mapper = new ObjectMapper();
        String json = "";
        try {
            json=mapper.writeValueAsString(o);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return json;
    }

}
