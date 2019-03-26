package com.xiaojia.config;

import com.xiaojia.component.LoginHandlerInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


/**
 * Created by 黄仕杰 on 2019/3/9.
 */
@Configuration
public class Myconfig implements WebMvcConfigurer {
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("login");
        registry.addViewController("/index.html").setViewName("login");
        //registry.addViewController("/xiaojia.html").setViewName("dashboard");
        registry.addViewController("/add.html").setViewName("emp/add");
    }
   // @Override
   // public void addInterceptors(InterceptorRegistry registry) {
    //    String[] strings = {"/xiaojia.html", "/", "/user/login","/static/**","/webjars/**"};
     //   registry.addInterceptor(new LoginHandlerInterceptor()).addPathPatterns("/**")
      //          .excludePathPatterns(strings);

    //}
}
