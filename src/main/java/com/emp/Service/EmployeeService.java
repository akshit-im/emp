package com.emp.Service;

import com.emp.Model.Emp;
import com.emp.Respository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepo er;

    public void createEmp(Emp emp) {
        er.save(emp);
    }

    public List<Emp> allEmployees() {

        return er.findAll();
    }

    public void updateEmployee(Emp emp) {
        er.save(emp);

    }

    public void deleteEmployee(int empId) {
        er.deleteById(empId);
    }

    public Emp getEmployee(int empId) {
        Optional<Emp> obj = er.findById(empId);
        return obj.orElse(new Emp());
    }
}
