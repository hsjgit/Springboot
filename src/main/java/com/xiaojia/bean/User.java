package com.xiaojia.bean;

import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * Created by 黄仕杰 on 2019/2/17.
 */
@Data
@Component
public class User {
    private int id;
    private String user;
    private String password;
}
