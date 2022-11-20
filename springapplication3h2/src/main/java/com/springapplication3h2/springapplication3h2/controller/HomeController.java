package com.springapplication3h2.springapplication3h2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.springapplication3h2.springapplication3h2.dao.iEmployeeRepository;
import com.springapplication3h2.springapplication3h2.dao.iProjectRepository;
import com.springapplication3h2.springapplication3h2.entity.Employee;
import com.springapplication3h2.springapplication3h2.entity.Project;

// UIからの入力に対する処理を担当
@Controller
public class HomeController {
  
  // We use autowired because we don't want to write our implementations for now of CRUD METHODS
  @Autowired
  iProjectRepository projectRepository;
  // ProjectControllerの保存先??

  @Autowired
  iEmployeeRepository employeeRepository;

  
  @GetMapping("/")
  public String displayHome(Model model) {
    
    List<Project> projects = projectRepository.findAll();
    List<Employee> employees = employeeRepository.findAll();
    model.addAttribute("projects", projects);
    model.addAttribute("employees", employees);
    return "home/index";
  }
}
