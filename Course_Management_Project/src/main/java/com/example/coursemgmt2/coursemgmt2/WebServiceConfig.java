package com.example.coursemgmt2.coursemgmt2;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.WsdlDefinition;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

@EnableWs
@Configuration
public class WebServiceConfig {

//    dispatcherservlet
//          - application context
//    url ->/ws

    @Bean
    ServletRegistrationBean  messageDispatcherServlet(ApplicationContext applicationContext) {
        MessageDispatcherServlet servlet = new MessageDispatcherServlet();
        servlet.setApplicationContext(applicationContext);
        servlet.setTransformWsdlLocations(true);
        return new ServletRegistrationBean(servlet, "/ws/*");
    }


//    /ws/courses.wsdl
//    course port
//    namespace -
//    coursedetail.xsd
    @Bean (name="courses")
public DefaultWsdl11Definition defaultWsdl11Definition(XsdSchema xsdSchema) {
        DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
        wsdl11Definition.setPortTypeName("coursePort");
        wsdl11Definition.setTargetNamespace("http://example.com/courses");
        wsdl11Definition.setLocationUri("/ws");
        wsdl11Definition.setSchema(courseSchema());
        return wsdl11Definition;
    }
    @Bean
    XsdSchema courseSchema() {
        return new SimpleXsdSchema(new ClassPathResource("xsd/courseDetail.xsd"));
    }
}
