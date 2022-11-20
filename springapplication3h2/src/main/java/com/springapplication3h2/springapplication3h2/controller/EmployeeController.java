package com.springapplication3h2.springapplication3h2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springapplication3h2.springapplication3h2.dao.iEmployeeRepository;
import com.springapplication3h2.springapplication3h2.entity.Employee;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    iEmployeeRepository employeeRepository;
  
    @GetMapping("/new")
    public String displayEmployeeForm(Model model) {
        model.addAttribute("employee", new Employee());
        return "employee/new-employee";
    }

    @PostMapping("/save")
    // redirect クライアントに別リソースへの再要求を促すものです。
    public String createEmployee(Employee employee){
      employeeRepository.save(employee);
      // 29行目でsaveすると/employee/newに画面が戻るようになっている
      // この場合は、20行なので画面遷移はしない
      return "redirect:/employee/new";
    }
}
