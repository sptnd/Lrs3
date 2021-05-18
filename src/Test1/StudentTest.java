package Test1;

/**
 * @author: lydsgy699
 * @email: 337887790@qq.com
 * @date: 2021/5/17 23:26
 */
public class StudentTest {
    public static void main(String[] args){
        var lrs = new School[3];
//        School sc = new School().txt();
        lrs[0] = new School("凌瑞松1",23,3);
        lrs[1] = new School("凌瑞松2",23,3);
        lrs[2] = new School("凌瑞松3",23,3);
        for (School s:lrs
        ) {
            System.out.println("姓名："+s.getName()+",年龄："+s.getAge()+",年级："+s.getGrade());
        }
        lrs[0].txt();

        Student st = new Student("刘柏汝1",22,4);
        st.txt1();
    }
}
