package com.springapplication3h2.springapplication3h2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springapplication3h2.springapplication3h2.dao.iEmployeeRepository;
import com.springapplication3h2.springapplication3h2.dao.iProjectRepository;
import com.springapplication3h2.springapplication3h2.entity.Employee;
import com.springapplication3h2.springapplication3h2.entity.Project;

@Controller
@RequestMapping("/project")
public class ProjectController {

  @Autowired // 自動で
  // Spring 管理下のオブジェクトの中から、適切なものを変数に自動でセットしてもらうため、インスタンス変数に付けるアノテーション

  // Autowired is used to inject certain dependencies by type so that you are able
  // to use them
  iProjectRepository projectRepository;

  @Autowired
    iEmployeeRepository employeeRepository;

  // @RequestMapping(value = "", method = RequestMethod.GET)
  @GetMapping("/new") // 両方とも意味は同じである
  public String displayProjectForm(Model model) {
    model.addAttribute("project", new Project());

    List<Employee> employees = employeeRepository.findAll();
    model.addAttribute("employees", employees);

    return "project/new-project";
  }

    @PostMapping("/save")
    public String createProject(Project project, Model model) {
         projectRepository.save(project);
         return "redirect:/project/new";
    }
}