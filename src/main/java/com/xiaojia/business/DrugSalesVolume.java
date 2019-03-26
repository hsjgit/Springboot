package com.xiaojia.business;

import com.xiaojia.bean.Drug;
import com.xiaojia.mapper.DrugMapper;
import com.xiaojia.service.DrugService;
import com.xiaojia.service.SalesService;
import com.xiaojia.service.business.DrugUpdata;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.w3c.dom.DOMImplementation;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by 黄仕杰 on 2019/3/10.
 */
@Component
public class DrugSalesVolume {
    @Autowired
    private DrugService drugService;
    @Autowired
    private SalesService salesService;
    /**
     * 查询全年的药品总销售额
     * @return
     */
    public double[] sigleDrugSales() {
        List<Double> list1 = salesService.listall();
        double[] doubles = new double[12];
        for (int i=0;i<list1.size();i++) {
            if (list1.get(i) != null) {
                doubles[i] = list1.get(i);
            }else {
                doubles[i] = 0;
            }
        }
        return doubles;
    }
    private double accuratedouble(double num,double num1) {
        BigDecimal a = new BigDecimal(num+"");
        BigDecimal b = new BigDecimal(num1+"");
        String s = a.multiply(b).toString();
        return Double.valueOf(s);
    }

    public List<String> getName() {
        List<Drug> list = drugService.allDrug();
        List<String> list1 = new ArrayList<>();
        for (Drug drug : list) {
            list1.add(drug.getName());
        }
        return list1;
    }
}
