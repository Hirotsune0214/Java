package DAO;

import java.util.List;

import DTO.User;

 //dtoのデータを取得しないといけない

//interface = クラスがどのようなメソッドを持っているのかをあらかじめ定義する、いわば設計書のような存在です
public interface UserDAO{
  public static final String URL = "jdbc:mysql://localhost:3306/user"; //Connect to Database.どこに接続するかでuser
  public static final String USER = "root"; //create user to root
  public static final String PASSWORD = "Hiroyuki4";


  public void insert(User user);
  public void update(User user);
  public void delete(int id); //need just ID
  public List<User> getAll();



} 
