package com.springlearn.springbootlearn.controller;

import com.springlearn.springbootlearn.entity.Department;
import com.springlearn.springbootlearn.service.DepartmentService;
import com.springlearn.springbootlearn.service.DepartmentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class DepartmentController {

    @Autowired
    private DepartmentService deptService;

    @PostMapping("/department")
    public Department saveDepartment(@RequestBody Department dept){
            //DepartmentService deptService = new DepartmentServiceImpl();
        return deptService.saveDepartment(dept);
    };

}
