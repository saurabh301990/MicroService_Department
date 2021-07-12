package com.microservice.department.repository;

import com.microservice.department.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface DepartmentRepository extends JpaRepository<Department,Long> {
    Department findBydepartmentId(long departmentId);
}
