package Test2;

/**
 * @author: lydsgy699
 * @email: 337887790@qq.com
 * @date: 2021/5/18 23:01
 */
/*
1.仅对本类可见--private
2.对外部完全可见--public
3.对本包和所有子类可见--protected
4.对本包可见--默认，不需要修饰符
 */
public class abstractClasses {
    public static void main(String[] args){
        Person p = new Student("凌瑞松","电子信息科学与技术");
        Person p1 = new Employee("刘柏汝",50000.0,1998,7,21);
        System.out.println(p.getName()+","+p.getDescription());
        System.out.println(p1.getName()+","+p1.getDescription());
//        var people = new Person[2];
//
//        people[0] = new Employee("凌瑞松",50000,1998,04,05);
//        people[1] = new Student("刘柏汝","中药学");
//
//        for (Person p:people
//             ) {
//            System.out.println(p.getName()+","+p.getDescription());
//        }
    }
}
