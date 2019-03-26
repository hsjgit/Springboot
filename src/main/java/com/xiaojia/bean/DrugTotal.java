package com.xiaojia.bean;

import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * Created by 黄仕杰 on 2019/3/10.
 */
@Component
@Data
public class DrugTotal {
    private int id;
    private String day;
    private double total;
}
