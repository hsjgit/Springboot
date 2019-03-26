package com.xiaojia.mapper;

import com.xiaojia.bean.User;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * Created by 黄仕杰 on 2019/2/17.
 */
public interface UserMapper {
    void save(Object o);
    void updata(Object o);
    void delete(Object o);
    User select(@Param("user") String user, @Param("password") String password);
    List<User> listall();
}
