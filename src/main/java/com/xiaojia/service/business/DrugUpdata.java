package com.xiaojia.service.business;

import com.xiaojia.bean.Drug;
import com.xiaojia.bean.DrugTotal;
import com.xiaojia.service.DrugService;
import com.xiaojia.service.SalesService;
import com.xiaojia.time.GetMonth;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by 黄仕杰 on 2019/3/10.
 */
@Component
public class DrugUpdata {
    @Autowired
    private SalesService salesService;
    @Autowired
    private DrugService drugService;
    @Autowired
    DrugTotal drugTotal;
    @Transactional(rollbackFor = Exception.class)
    public boolean updata(String name ) {
        String day=GetMonth.getmonth();
        double total = salesService.select(day);
        Drug drug = drugService.select(name);
        double newDrugSales = accuratedouble(drug.getPrice(), drug.getSales()) + total;
        drugTotal.setTotal(newDrugSales);
        drugTotal.setDay(day);
        salesService.updata(drugTotal);
        if (total == salesService.select(day)) {
            try {
                throw new Exception("更新失败");
            } catch (Exception e) {
                e.printStackTrace();
            }finally {
                return false;
            }
        }
        return true;
    }
    private double accuratedouble(double num,double num1) {
        BigDecimal a = new BigDecimal(num+"");
        BigDecimal b = new BigDecimal(num1+"");
        String s = a.multiply(b).toString();
        return Double.valueOf(s);
    }
}
