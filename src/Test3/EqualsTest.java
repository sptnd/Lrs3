package Test3;

/**
 * @author: lydsgy699
 * @email: 337887790@qq.com
 * @date: 2021/5/19 23:51
 */
public class EqualsTest {
    public static void main(String[] args){

        var lrs1 = new Employee("凌瑞松1",10000,1998,04,05);
        var lrs2 = lrs1;
        var lrs3 = new Employee("凌瑞松3",50000,1998,04,05);
        var lbr1 = new Employee("刘柏汝1",60000,1998,07,21);

        System.out.println("lrs1 == lrs2:" + (lrs1==lrs2));
        System.out.println("lrs1 == lrs3:" + (lrs1==lrs3));
        System.out.println("lrs1.equals(lrs3):" + lrs1.equals(lrs3));
        System.out.println("lrs1.equals(lbr1):" + lrs1.equals(lbr1));
        System.out.println("lbr1.toString():" + lbr1);

        var lrs = new Manager("凌瑞松",12000,1998,04,05);
        var lbr = new Manager("刘柏汝",12000,1998,07,21);
        lbr.setBonus(5000);
        System.out.println("lbr.toString():" +lbr);
        System.out.println("lrs.equals(lbr):"+lrs.equals(lbr));
        System.out.println("lrs1.hashCode():" +lrs1.hashCode());
        System.out.println("lrs3.hashCode():" +lrs3.hashCode());
        System.out.println("lbr1.hashCode():" +lbr1.hashCode());
        System.out.println("lrs.hashCode():" +lrs.hashCode());
    }
}
