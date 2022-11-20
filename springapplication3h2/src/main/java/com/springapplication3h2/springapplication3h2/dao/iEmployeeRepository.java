package com.springapplication3h2.springapplication3h2.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springapplication3h2.springapplication3h2.entity.Employee;

public interface iEmployeeRepository extends JpaRepository<Employee, Long>{
  
  @Override
  // We override this function because we want to return Project type instead of generic type 
  public List<Employee> findAll();
}
