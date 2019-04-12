package com.xiaojia;

import com.sun.org.apache.xpath.internal.SourceTree;
import com.xiaojia.bean.Drug;
import com.xiaojia.bean.DrugTotal;
import com.xiaojia.business.DrugSalesVolume;
import com.xiaojia.config.DuridConfig;
import com.xiaojia.mapper.DrugMapper;
import com.xiaojia.mapper.SalesMapper;
import com.xiaojia.service.DrugService;
import com.xiaojia.service.SalesService;
import com.xiaojia.service.ToJson;
import com.xiaojia.service.UserService;
import com.xiaojia.service.business.DrugUpdata;
import com.xiaojia.time.GetMonth;
import com.xiaojia.xiaojia.XiaojiaService;
import org.apache.tomcat.util.net.openssl.OpenSSLUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import javax.sql.DataSource;
import javax.xml.crypto.Data;
import javax.xml.transform.Source;
import java.sql.Struct;
import java.text.Collator;
import java.text.SimpleDateFormat;
import java.util.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {
	@Autowired
	DrugUpdata updata;
	@Autowired
	DrugService drugService;
	@Autowired
	SalesService salesService;
	@Autowired
	DrugSalesVolume volume;
	@Autowired
	XiaojiaService xiaojia;
	@Autowired
	private UserService userService;
	@Autowired
	@Test
	public void contextLoads() {
		System.out.println(userService.selece("1","1"));
	}


}
