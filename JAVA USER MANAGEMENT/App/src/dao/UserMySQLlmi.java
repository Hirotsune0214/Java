package dao;

import java.net.ConnectException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import dto.User;

//class クラス名 implements インターフェイス名 {} //インターフェイスを実行させる
public class UserMySQLlmi implements UserDAO {
  private Connection connection; // Connection使用時はimportが必要
  private PreparedStatement preparedStatement; // プログラム上で動的にSQL文を生成する必要があるとき、
  // 可変部分を変数のようにしたSQL文をあらかじめ作成しておき、値の挿入は処理系に行わせる方式
  private ResultSet resultSet; // SQL クエリーの実行結果を含む Java オブジェクト

  private static final String INSERT = "INSERT INTO user_table (name, lastName, email, password) values (?, ?, ?, ?)";
  private static final String UPDATE = "UPDATE user_table SET name = ?, lastname = ?, password = ?, email = ?, WHERE id = ?";
  private static final String DELETE = "DELETE FROM user_table WHERE id = ?";
  private static final String GET_BY_ID = "SELECT * FROM user_table WHERE id = ?"; // テーブルからIDを取得
  private static final String GET_ALL = "SELECT * FROM user_table";
  private static final String GET_BY_EMAIL_AND_PASSWORD = "SELECT * FROM user_table WHERE email = ? AND password = ?";
  // ?の意味

  public UserMySQLlmi() {
    try {
      connection = DriverManager.getConnection(UserDAO.URL, UserDAO.USER, UserDAO.PASSWORD);
      // connection = DriverManager.getConnection(UserDAO.URL, UserDAO.USER,
      // UserDAO.PASSWORD);
    } catch (SQLException e) {
      System.out.println("Unable to Connect !");
      e.printStackTrace();
    }
  }

  // スーパークラスで定義されているメソッドを、継承したサブクラスで同じメソッド名で書き換える
  @Override
  public void insert(User user) {
    // We are using this extra variable for our own understanding that whatever
    // operation we were doing was succesful,
    // and we want to tell the user or to us that these many rows were changed in
    // database
    int rowAffected = 0;

    try {
      // preparedstatement takes a parameter which is SQL where there maybe some
      // dynamic values which we need to add
      preparedStatement = connection.prepareStatement(INSERT); // SQL生成時に必要なので、INSERTを入れる

      // We are adding that values to the ? on the above queries we wrote by giving
      // the index where they were and the value we get from the user objects
      preparedStatement.setString(1, user.getName());
      preparedStatement.setString(2, user.getLastName());
      preparedStatement.setString(3, user.getEmail());
      preparedStatement.setString(4, user.getPassword());

      // This returns number of rows changed/affected that's we are assigning it to
      // our own variable
      rowAffected = preparedStatement.executeUpdate(); // updateのデータを返す
      System.out.println(rowAffected + " row(s) affected");

    } catch (Exception e) {
      System.out.println("Unable to insert data");
      e.printStackTrace();
    } finally {
      try {
        preparedStatement.close();
      } catch (SQLException e) {
        System.out.println("Unable to close the statement!");
        e.printStackTrace();
      }
    }

    if (rowAffected > 0) {
      System.out.println("Insert was succesfull");
    }

  }

  @Override
  public void update(User user) {
    int rowAffected = 0;

    try {
      preparedStatement = connection.prepareStatement(UPDATE); // SQL生成時に必要なので、INSERTを入れる
      preparedStatement.setString(1, user.getName());
      preparedStatement.setString(2, user.getLastName());
      preparedStatement.setString(3, user.getEmail());
      preparedStatement.setString(4, user.getPassword());
      preparedStatement.setInt(5, user.getId());

      rowAffected = preparedStatement.executeUpdate(); // updateのデータを返す
      System.out.println(rowAffected + " row(s) affected");

    } catch (Exception e) {
      System.out.println("Unable to update data");
      e.printStackTrace();
    } finally {
      try {
        preparedStatement.close();
      } catch (SQLException e) {
        System.out.println("Unable to close the statement!");
        e.printStackTrace();
      }
    }

    if (rowAffected > 0) {
      System.out.println("Update was succesfull");
    }

  }

  @Override
  public void delete(int id) {
    int rowAffected = 0;

    try {
      preparedStatement = connection.prepareStatement(DELETE); // SQL生成時に必要なので、INSERTを入れる
      preparedStatement.setInt(1, id);

      rowAffected = preparedStatement.executeUpdate(); // updateのデータを返す
      System.out.println(rowAffected + " row(s) affected");

    } catch (Exception e) {
      System.out.println("Unable to delete data");
      e.printStackTrace();
    } finally {
      try {
        preparedStatement.close();
      } catch (SQLException e) {
        System.out.println("Unable to close the statement!");
        e.printStackTrace();
      }
    }

    if (rowAffected > 0) {
      System.out.println("Delete was succesfull");
    }

  }

  @Override
  public User getUserByID(int id) {
    User user = null;

    try {
      preparedStatement = connection.prepareStatement(GET_BY_ID); // SQL生成時に必要なので、INSERTを入れる
      preparedStatement.setInt(1, id);

      resultSet = preparedStatement.executeQuery(); // executeQuesryでreturn collection
      // executeQuery meaning
      while (resultSet.next()) {
        user = new User();
        user.setId(resultSet.getInt("id"));
        user.setName(resultSet.getString("name"));
        user.setLastName(resultSet.getString("lastname"));
        user.setEmail(resultSet.getString("email"));
        user.setPassword(resultSet.getString("password"));
      }
      // System.out.println(rowAffected + " row(s) affected");
    } catch (Exception e) {
      System.out.println("Unable to find user for given id");
      e.printStackTrace();
    } finally {
      try {
        preparedStatement.close();
      } catch (SQLException e) {
        System.out.println("Unable to close the statement!");
        e.printStackTrace();
      }
    }

    return user;
  }

  @Override
  public List<User> getAll() {
   

    List<User> userList = new LinkedList<>();

    try {
      preparedStatement = connection.prepareStatement(GET_ALL); // SQL生成時に必要なので、INSERTを入れる

      resultSet = preparedStatement.executeQuery(); // executeQuesryでreturn collection
      // executeQuery meaning
      while (resultSet.next()) {
        User user = new User();
        user.setId(resultSet.getInt("id"));
        user.setName(resultSet.getString("name"));
        user.setLastName(resultSet.getString("lastname"));
        user.setEmail(resultSet.getString("email"));
        user.setPassword(resultSet.getString("password"));
        userList.add(user);
      }
      // System.out.println(rowAffected + " row(s) affected");
    } catch (Exception e) {
      System.out.println("Unable to find list of all users");
      e.printStackTrace();
    } finally {
      try {
        preparedStatement.close();
      } catch (SQLException e) {
        System.out.println("Unable to close the statement!");
        e.printStackTrace();
      }
    }

    return userList;
  }

  @Override
  public User getByEmailAndPassword(String email, String password) {
    User user = null;

    try {
      preparedStatement = connection.prepareStatement(GET_BY_EMAIL_AND_PASSWORD); 
      preparedStatement.setString(1, email);
      preparedStatement.setString(2, password);

      resultSet = preparedStatement.executeQuery(); // executeQuesryでreturn collection
      // executeQuery meaning
      while (resultSet.next()) {
        user = new User();
        user.setId(resultSet.getInt("id"));
        user.setName(resultSet.getString("name"));
        user.setLastName(resultSet.getString("lastname"));
        user.setEmail(resultSet.getString("email"));
        user.setPassword(resultSet.getString("password"));
      }
      // System.out.println(rowAffected + " row(s) affected");
    } catch (Exception e) {
      System.out.println("Unable to find user for given id");
      e.printStackTrace();
    } finally {
      try {
        preparedStatement.close();
      } catch (SQLException e) {
        System.out.println("Unable to close the statement!");
        e.printStackTrace();
      }
    }

    return user;
  }

}
