package com.springlearn.springbootlearn.repository;

import com.springlearn.springbootlearn.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepo extends JpaRepository<Department,Long> {
}
