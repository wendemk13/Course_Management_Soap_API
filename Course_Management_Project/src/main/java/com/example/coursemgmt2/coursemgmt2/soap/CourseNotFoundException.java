package com.example.coursemgmt2.coursemgmt2.soap;

import org.springframework.ws.soap.server.endpoint.annotation.FaultCode;
import org.springframework.ws.soap.server.endpoint.annotation.SoapFault;

//@SoapFault(faultCode = FaultCode.CLIENT)

@SoapFault(faultCode = FaultCode.CUSTOM,customFaultCode="{http://example.com/courses},course not found")
public class CourseNotFoundException extends RuntimeException {
    public CourseNotFoundException(String s) {
        super(s);
    }
}
