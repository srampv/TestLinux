/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.seo.testlinux;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 *
 * @author vpilaka
 */
@WebService(name = "TestLINUX", portName = "LinuxPort", serviceName = "LinuxService", targetNamespace = "com.seo.testlinux")
public class LinuxTest {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "execute")
    public String execute(@WebParam(name = "command") String command, @WebParam(name = "param1") String param1, @WebParam(name = "param2") String param2) {
        return command;
    }

}
