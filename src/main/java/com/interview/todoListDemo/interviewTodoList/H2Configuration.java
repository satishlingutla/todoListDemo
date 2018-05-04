package com.interview.todoListDemo.interviewTodoList;

import org.h2.server.web.WebServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created with IntelliJ IDEA.
 * User: satish
 * To change this template use File | Settings | File Templates.
 */

@Configuration
public class H2Configuration {
    @Bean
    ServletRegistrationBean dbservletConfiguration() {
        ServletRegistrationBean registrationBean = new ServletRegistrationBean(new WebServlet());
        registrationBean.addUrlMappings("/dblogin/*");
        return registrationBean;
    }

}
