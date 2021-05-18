package Test2;

/**
 * @author: lydsgy699
 * @email: 337887790@qq.com
 * @date: 2021/5/18 23:01
 */
public class Student extends Person{
    private String major;
    public Student(String name,String major){
        super(name);
        this.major = major;
    }

    @Override
    public String getDescription() {
        return "a student majoring in"+major;
    }
}
