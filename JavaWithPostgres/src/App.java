import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class App {
    public static void main(String[] args) throws Exception {
        final String URL = "jdbc:postgresql://localhost:5432/e0922";
        final String USER = "postgres"; 
        final String PASSWORD = "Hiro4";

        // try{
        //     （通常実行される文）
        //   }catch(例外クラス 変数名){
        //     （例外発生時に実行される文）
        //   }
        try {
            getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace(); //エラーが発生したときに表示される内容
        }
    }


    public static void getConnection(String URL, String USER, String PASSWORD) throws SQLException{
        Connection connection = DriverManager.getConnection(URL,USER, PASSWORD);
        Statement statement = connection.createStatement();

        // String INSERT_QUERY = "INSERT INTO employee_table (name, email) VALUES ('Mike', 'mike@gmail.com')";

        // statement.executeUpdate(INSERT_QUERY);

        // String DELETE_QUERY = "DELETE FROM employee_table where ID = 3";

        // statement.executeUpdate(DELETE_QUERY);

        //executeQueryの実行結果を、ResultSetで指定したオブジェクトに格納
        ResultSet resultSet = statement.executeQuery("SELECT * FROM employee_table");

        // Update a row postgres



        System.out.println("READ SUCCESFUL");

        while(resultSet.next()){
            System.out.println(resultSet.getString("name") + "|" + resultSet.getString("email"));
        }

        System.out.println("Connected!");
    }
}
