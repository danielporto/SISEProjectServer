package com.insure.server;


import javax.xml.ws.Endpoint;

public class Main {
    public static void main(String args[]){
        System.out.println("Project template - server");
        Endpoint.publish("http://0.0.0.0:8090/myservice",new EmployeeService());
    }

}
