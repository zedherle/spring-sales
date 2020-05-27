package com.zed.config;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;
//
//public class AppInitializer implements WebApplicationInitializer {
//    public void onStartup(ServletContext servletContext) throws ServletException {
//        System.out.print("Building First");
//
////        XmlWebApplicationContext webApplicationContext = new XmlWebApplicationContext();
////        webApplicationContext.setConfigLocations("classpath:application-context.xml");
//        AnnotationConfigWebApplicationContext annotationConfigWebApplicationContext = new AnnotationConfigWebApplicationContext();
//        annotationConfigWebApplicationContext.register(AppConfig.class);
//        DispatcherServlet dispatcherServlet = new DispatcherServlet(annotationConfigWebApplicationContext);
//        ServletRegistration.Dynamic servletRegistration = servletContext.addServlet("FrontController",dispatcherServlet);
//        servletRegistration.setLoadOnStartup(1);
//        servletRegistration.addMapping("/");
//    }
//}
