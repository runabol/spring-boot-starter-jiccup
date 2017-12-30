package com.creactiviti.jiccup;

import java.util.List;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class HiccupAutoConfiguration extends WebMvcConfigurerAdapter {

  @Override
  public void extendMessageConverters(List<HttpMessageConverter<?>> aConverters) {
    aConverters.add(new JiccupHttpMessageConverter());
  }
  
}
