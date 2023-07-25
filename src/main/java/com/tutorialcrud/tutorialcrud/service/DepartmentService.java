package com.tutorialcrud.tutorialcrud.service;

import com.tutorialcrud.tutorialcrud.entity.Department;
import org.springframework.stereotype.Service;

import java.util.List;

public interface DepartmentService {
    Department saveDepartment(Department department);
    List<Department> fetchDepartmentList();
    Department updateDepartment(Department department,
                                Long departmentId);
    void deleteDepartmentById(Long departmentId);

}
