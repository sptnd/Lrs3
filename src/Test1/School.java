package Test1;

/**
 * @author: lydsgy699
 * @email: 337887790@qq.com
 * @date: 2021/5/17 22:30
 */
public class School {
    private String name;
    private int age;
    private int grade;

    public School(String name,int age,int grade){
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public int getGrade(){
        return grade;
    }

//    public String txt(){
//        System.out.println("好好学习，天天向上。");
//        return txt();
//    }
    public void txt(){
        System.out.println("好好学习，天天向上!");
    }

    public void raiseAge(int byAge){
        int raise = age++;
        age+=raise;
    }
}
