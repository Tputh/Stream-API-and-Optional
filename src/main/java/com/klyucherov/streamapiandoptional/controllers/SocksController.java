package com.klyucherov.streamapiandoptional.controllers;

import com.klyucherov.streamapiandoptional.controllers.dto.ResponseDto;
import com.klyucherov.streamapiandoptional.model.Department;
import com.klyucherov.streamapiandoptional.model.Employee;
import com.klyucherov.streamapiandoptional.service.EmployeeService;

import io.swagger.v3.oas.annotations.Operation;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

//перевёлся на ваш курс недавно не делал вашу курсовую, по этому импровезирую
@RestController
@RequestMapping("/employee")
@RequiredArgsConstructor
@Tag(name = "API по работе с сотрудниками", description = "журнал учёта сотрудников")
public class SocksController {
   private final EmployeeService employeeService;

   @GetMapping
   @Operation(summary = "возращает сотрудника с максимальной зарплатой")
   public ResponseEntity<ResponseDto> getMaxSalary(@RequestParam("отдел") Department department) {

    }

    @GetMapping
    @Operation(summary = "возращает сотрудника с минимальной зарплатой")
    public ResponseEntity<ResponseDto> getMinSalary(@RequestParam("отдел") Department department) {

    }

    @GetMapping
    @Operation(summary = "возвращает всех сотрудников работающих в департаменте")
    public ResponseEntity<ResponseDto> getStaff(@RequestParam("отдел") Department department){

    }

   @GetMapping
   @Operation(summary = "возвращает всех сотрудников с разделением на отделы")
   public ResponseEntity<ResponseDto> delete(@RequestParam("сотрудники") Employee employee) {

}
