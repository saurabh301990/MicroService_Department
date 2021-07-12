package com.microservice.department.service;

import com.microservice.department.entity.Department;
import com.microservice.department.repository.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    public Department saveDepartment(Department department) {
        log.info("In save Department in Department Service");
        return departmentRepository.save(department);
    }

    public Department findBydepartmentId(long departmentId) {
        log.info("In find Department in Department service");
        return departmentRepository.findBydepartmentId(departmentId);
    }
}
