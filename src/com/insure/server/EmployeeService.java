package com.insure.server;

import com.insure.commons.Employee;

import javax.jws.WebService;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@WebService
public class EmployeeService {
    static Map<Integer, Employee> data = new ConcurrentHashMap<>();

    public Employee getEmployee(int id) {
        Employee e = data.get(id);
        System.out.println(e.toString());
        return e;
    }

    public Employee updateEmployee(int id, String name) {
        Employee e = data.get(id);
        e.setFirstName(name);
        return e;
    }

    public boolean deleteEmployee(int id) {
        Employee res = data.remove(id);
        return (res !=null) ? true : false;
    }

    public Employee addEmployee(int id, String name) {
        Employee e = new Employee();
        e.setId(id);
        e.setFirstName(name);
        data.putIfAbsent(id,e);
        return e;
    }
}
