package com.springapplication3h2.springapplication3h2.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;


@Entity //実体(箱)
public class Project {

  // Fields
  @Id
  // 主キー値を生成する
  @GeneratedValue(strategy = GenerationType.AUTO) // Used for autoinvrement
  private Long projectId;
  



  private String name;
  private String stage; // COMPLETED, CANCELLED, IN PROGRESS
  private String description;


  // @ManyToManyはブジェクト間のパラダイム(見方)の不一致を解消し簡単にマッピングしてくれるアノテーション。
  // Cascadeを指定すると複数のテーブルにまたがるDB操作を連鎖的に行うことが可能になります。
  @ManyToMany(cascade = {
    CascadeType.MERGE,
    CascadeType.REFRESH,
    CascadeType.PERSIST // 持続
  },
  // スクロールした際に新しいデータを取得してくれる
  fetch = FetchType.LAZY
  )
  // Merge tables
  @JoinTable(name="project_employee",
  joinColumns = @JoinColumn(name="projectId"),
  inverseJoinColumns = @JoinColumn(name="employeeId"))
  List<Employee> employees;

    // 引数なしのコンストラクタ
    public Project() {

    }

    public Long getProjectId() {
      return projectId;
    }
  
  
    public void setProjectId(Long projectId) {
      this.projectId = projectId;
    }

 

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getStage() {
    return stage;
  }

  public void setStage(String stage) {
    this.stage = stage;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  // 引数ありのコンストラクタ
  public Project(String name, String stage, String description) {
    this.name = name;
    this.stage = stage;
    this.description = description;
  }

  public List<Employee> getEmployees() {
    return employees;
  }

  public void setEmployees(List<Employee> employees) {
    this.employees = employees;
  }

}