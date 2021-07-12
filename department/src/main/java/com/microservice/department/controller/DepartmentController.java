package com.microservice.department.controller;

import com.microservice.department.entity.Department;
import com.microservice.department.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/department")
@Slf4j
public class DepartmentController {

    @Autowired
    DepartmentService departmentService;

    @PostMapping("/")
    public Department saveDepartment(@RequestBody Department department){
        log.info("In save Department in Department Controller");
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/{id}")
    public  Department findDepartmentByid(@PathVariable ("id") long departmentId){
        log.info("In Find Department in Department Controller");
        return  departmentService.findBydepartmentId(departmentId);
    }
}
