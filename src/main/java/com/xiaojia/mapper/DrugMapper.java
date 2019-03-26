package com.xiaojia.mapper;

import com.xiaojia.bean.Drug;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by 黄仕杰 on 2019/3/9.
 */
public interface DrugMapper {
    void save(Object o);
    void updata(@Param("num") Integer num,@Param("price")Double price,
                @Param("name")String name,@Param("sales") Integer sales,@Param("code") String code);
    void delete(int id);
    Drug select(String name);
    List<Drug> listall();
}
