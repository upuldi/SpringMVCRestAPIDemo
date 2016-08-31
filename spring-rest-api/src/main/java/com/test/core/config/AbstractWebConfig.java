package com.test.core.config;

import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceView;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * Created by udoluweera on 7/26/16.
 */
public class AbstractWebConfig {

    @Bean
    public ViewResolver getViewResolvers() {
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("/WEB-INF/pages/");
        resolver.setSuffix(".html");
        return resolver;
    }




}
