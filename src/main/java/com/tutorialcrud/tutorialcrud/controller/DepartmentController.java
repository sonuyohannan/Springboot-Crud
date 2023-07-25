package com.tutorialcrud.tutorialcrud.controller;

import com.tutorialcrud.tutorialcrud.entity.Department;
import com.tutorialcrud.tutorialcrud.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;


import java.util.List;

//annotation
@RestController
public class DepartmentController {
    @RequestMapping("/s")
    public ModelAndView welcome() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");
        return modelAndView;
    }


    @Autowired
    private DepartmentService departmentService;
    @PostMapping("/departments")
    public Department saveDepartment(@ModelAttribute  Department department)
    {
        return departmentService.saveDepartment(department);
    }

    // Read operation
    @GetMapping("/departments")
    public List<Department> fetchDepartmentList()
    {
        return departmentService.fetchDepartmentList();
    }

//    public String sonu(){
//        return "welcome sonu";
//    }

    // Update operation
    @PutMapping("/departments/{id}")
    public Department
    updateDepartment(@ModelAttribute Department department,
                     @PathVariable("id") Long departmentId)
    {
        return departmentService.updateDepartment(
                department, departmentId);
    }
    // Delete operation
    @DeleteMapping("/departments/{id}")
    public String deleteDepartmentById(@PathVariable("id")
                                       Long departmentId)
    {
        departmentService.deleteDepartmentById(
                departmentId);
        return "Deleted Successfully";
    }



}
