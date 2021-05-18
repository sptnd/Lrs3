package Test2;

/**
 * @author: lydsgy699
 * @email: 337887790@qq.com
 * @date: 2021/5/18 23:01
 */
public abstract class Person {

    public abstract String getDescription();
    private String name;

    public Person(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
}
