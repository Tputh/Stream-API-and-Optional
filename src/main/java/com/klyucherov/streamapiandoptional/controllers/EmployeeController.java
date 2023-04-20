package com.klyucherov.streamapiandoptional.controllers;

import com.klyucherov.streamapiandoptional.model.Employee;

import com.klyucherov.streamapiandoptional.service.impl.EmployeeService;
import io.swagger.v3.oas.annotations.Operation;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//перевёлся на ваш курс недавно, не делал вашу курсовую, по этому импровезирую
@RestController


@Tag(name = "API по работе с сотрудниками", description = "журнал учёта сотрудников")
public class EmployeeController {
   private final EmployeeService employeeService;



    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/employee")
    public String welcome(){
        return "Hello";
    }


    @GetMapping("/employee/max")
    @Operation(summary = "возращает сотрудника с максимальной зарплатой")
    public Employee getMaxSalary(@RequestParam("department") Integer department) {
        return employeeService.max(department);
    }

    @GetMapping("/employee/min")
    @Operation(summary = "возращает сотрудника с минимальной зарплатой")
    public Employee getMinSalary(@RequestParam("department") Integer department) {
        return employeeService.min(department);
    }

    @GetMapping("/employee/staff")
    @Operation(summary = "возвращает всех сотрудников работающих в департаменте")
    public List<Employee> getStaff(@RequestParam(value = "department", required = false) Integer department){
               if (department == null){
                   return employeeService.getStaff();
               }
               return employeeService.getListOfEmployees(department);
    }



}
