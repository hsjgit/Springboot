package com.xiaojia.xiaojia;

import com.ibm.icu.text.Collator;
import com.sun.org.apache.regexp.internal.RE;
import com.xiaojia.bean.Drug;
import com.xiaojia.service.DrugService;
import com.xiaojia.service.SalesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.swing.*;
import java.util.*;

/**
 * 小贾要求的排序
 * @author 贾子璇
 * Created by 贾子璇 on 2019/3/12.
 */
@Component
public class XiaojiaService {
    @Autowired
    private DrugService drugService;

    /**
     * 按照给定的目标排序，升序
     * @param name 排序的的目标
     * @return 排完序后的集合
     */
    public List<Drug> sort(String name) {
        List<Drug> list = drugService.allDrug();
        List<Drug> sortlist = new ArrayList<>();
        if (name .equals("num") ) {
            Collections.sort(list, new Comparator<Drug>() {
                @Override
                public int compare(Drug o1, Drug o2) {
                    return o1.getNum()-o2.getNum();
                }
            });
        }
        if (name .equals("price") ) {
            Collections.sort(list, new Comparator<Drug>() {
                @Override
                public int compare(Drug o1, Drug o2) {
                    if (o1.getPrice()-o2.getPrice()>0){
                        return 1;
                    }else {
                        if (o1.getPrice() - o2.getPrice() < 0) {
                            return -1;
                        }else {
                            return 0;
                        }
                    }
                }
            });
        }
        if (name .equals("sales") ) {
            Collections.sort(list, new Comparator<Drug>() {
                @Override
                public int compare(Drug o1, Drug o2) {
                    return o1.getSales()-o2.getSales();
                }
            });
        }
        if (name .equals("code") ) {
            Collections.sort(list, new Comparator<Drug>() {
                @Override
                public int compare(Drug o1, Drug o2) {
                    Integer num1 = Integer.valueOf(o1.getCode().substring(1));
                    Integer num2 = Integer.valueOf(o2.getCode().substring(1));
                    return num1-num2;
                }
            });
        }
        if (name .equals("name") ) {
            Collections.sort(list, new Comparator<Drug>() {
                @Override
                public int compare(Drug o1, Drug o2) {
                    Comparator<Object> com = Collator.getInstance(java.util.Locale.CHINA);
                    return com.compare(o1.getName(), o2.getName());
                }
            });
        }
        return list;
    }

}
