package com.springlearn.springbootlearn.service;


import com.springlearn.springbootlearn.entity.Department;
import com.springlearn.springbootlearn.repository.DepartmentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentServiceImpl implements  DepartmentService{

    @Autowired
    private DepartmentRepo deptRepo;
    @Override
    public Department saveDepartment(Department dept) {
        return deptRepo.save(dept);
    }
}
