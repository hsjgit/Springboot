package com.xiaojia.bean;

import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * Created by 黄仕杰 on 2019/3/9.
 */
@Data
@Component
public class Drug {
    private int id;
    private int num;
    private double price;
    private String name;
    private int sales;
    private String code;
}
