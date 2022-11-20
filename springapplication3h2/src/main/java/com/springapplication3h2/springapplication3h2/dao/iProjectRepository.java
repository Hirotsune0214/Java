package com.springapplication3h2.springapplication3h2.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.springapplication3h2.springapplication3h2.entity.Project;



public interface iProjectRepository extends CrudRepository<Project, Long>{
  
  @Override
  // We override this function because we want to return Project type instead of generic type 
  public List<Project> findAll();
}
