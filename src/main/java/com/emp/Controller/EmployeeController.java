package com.emp.Controller;

import com.emp.Model.Emp;
import com.emp.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {
        @Autowired
        private EmployeeService es;

        @PostMapping("addEmployee")
        public Emp createEmp(@RequestBody Emp emp){
            es.createEmp(emp);
            return emp;
        }

        @GetMapping("Employees")
        public List<Emp> getAllEmp(){
            return   es.allEmployees();

        }

        @PutMapping("Employee")
        public Emp updateEmp(@RequestBody Emp emp){
            es.updateEmployee(emp);

            return es.getEmployee(emp.getId());
        }

        @DeleteMapping("Employee/{empId}")
        public void deleteEmp(@PathVariable("empId") int empId){
            es.deleteEmployee(empId);
        }
        @GetMapping("Employee/{empId}")
        public Emp getEmpById(@PathVariable("empId") int empId){
           return es.getEmployee(empId);

        }

}
