package Test1;

/**
 * @author: lydsgy699
 * @email: 337887790@qq.com
 * @date: 2021/5/17 22:51
 */
public class Student extends School {

    private int ages;

    public Student(String name,int age,int grade){
        super(name, age, grade);
        ages = 0;
    }


    public int getAge() {
        int addAge = super.getAge();
        return addAge + ages;
    }

    public void setAges(int a){
        ages = a;
    }

    public void txt1(){
        System.out.println("意难平~");
    }
}
