import People.Person;
import People.Student;


public class StuSample {
    public static void main(String[] args){
        Student stu = new Student();

        //スーパークラスのメソッド
        stu.setName("菅原");
        stu.display();

        //サブクラスのメソッド
        stu.setStuNo(1);
        stu.displayStuNo();
    }
}
