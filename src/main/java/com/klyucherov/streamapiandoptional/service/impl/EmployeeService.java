
package com.klyucherov.streamapiandoptional.service.impl;

import com.klyucherov.streamapiandoptional.model.Employee;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;




//перевёлся на ваш курс недавно, не делал вашу курсовую, по этому импровезирую
@Service
public class EmployeeService {
      private Map<String, Employee> employeeMap = new HashMap<>();

     EmployeeService() {
     //   this.employeeMap = Map.of(FRONTEND,new Employee ("Ivan", FRONTEND, 200000)
             //   , BACKEND, new Employee ("Andrey", BACKEND, 1000000)
             //   , TESTERS, new Employee("Valera", TESTERS, 350000)
             //   , FRONTEND, new Employee("Alerksey", FRONTEND, 250000)
             //   , BACKEND, new Employee("Stasya", BACKEND , 2000000)
             //   , TESTERS, new Employee("Angela", TESTERS , 300000));
        employeeMap.put("FRONTEND",new Employee ("Ivan", 3, 200000));
        employeeMap.put("BACKEND", new Employee ("Andrey",1, 1000000));
        employeeMap.put("TESTERS", new Employee("Valera", 2, 350000));
        employeeMap.put("FRONTEND", new Employee("Alerksey", 3, 250000));
        employeeMap.put("BACKEND", new Employee("Stasya", 1 , 2000000));
        employeeMap.put("TESTERS", new Employee("Angela", 2 , 300000));
    }






    public Employee max(int department) {
      return   employeeMap.values().stream()
              .filter(e -> e.getDepartment() == department)
              .max(Comparator.comparingDouble(Employee::getSalary))
              .get();

    }


    public Employee min(int department) {
        return    employeeMap.values().stream()
                .filter(e -> e.getDepartment() == department)
                .min(Comparator.comparingDouble(Employee::getSalary))
                .get();
    }


    public List<Employee> getStaff() {
         return employeeMap.values().stream()
                .sorted(Comparator.comparingInt(Employee::getDepartment))
                .collect(Collectors.toList());

    }


    public List<Employee> getListOfEmployees(int department) {
       return employeeMap.values().stream()
                .filter(e -> e.getDepartment() == department)
                .collect(Collectors.toList());
    }


}


