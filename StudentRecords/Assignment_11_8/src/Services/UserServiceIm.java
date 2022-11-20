package Services;

import java.util.List;
import java.util.PropertyResourceBundle;

import dao.UserDAO;
import dao.UserMySQLlmi;
import dto.User;

public class UserServiceIm implements UserService {
  private UserDAO userDAO = new UserMySQLlmi();
  
  @Override
  public void insert(User user){
    userDAO.insert(user);
  }

  @Override
  public void update(User user) {
    userDAO.update(user);
  }

  @Override
  public void delete(int id){
    userDAO.delete(id);
  }

  @Override
  public User getUserById(int id) {
    return userDAO.getUserByID(id);
  }

  @Override
  public List<User> getAll() {
    return userDAO.getAll();
  }

  @Override
  public User getByEmailAndPassword(String email, String password){
    return userDAO.getByEmailAndPassword(email, password);
  }


}

