package Test4;
import java.util.ArrayList;
/**
 * @author: lydsgy699
 * @email: 337887790@qq.com
 * @date: 2021/5/24 22:38
 * 只能是引用对象才可以使用ArrayList 如果基本数据类型想使用的话需要使用装箱器
 */
public class LrsArrayList {
    public static void main(String[] args){
        var list = new java.util.ArrayList<Integer>();
//        list.add(3); 这个程序将自动转化为下面这句语句，称为自动装箱
        list.add(Integer.valueOf(3));

    }
}
