package com.example.Springboot.tutorial.service;

import com.example.Springboot.tutorial.entity.Department;
import com.example.Springboot.tutorial.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;
    @Override
    public Department saveDeppartment(Department department) {
        return departmentRepository.save(department);
    }
}
