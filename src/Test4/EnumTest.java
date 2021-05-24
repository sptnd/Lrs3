package Test4;

import java.util.Scanner;

/**
 * @author: lydsgy699
 * @email: 337887790@qq.com
 * @date: 2021/5/24 23:12
 */
public class EnumTest {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a size:(SMALL,MEDIUM,LARGE,EXTRA_LARGE)");
        String input = in.next().toUpperCase();//toUpperCase() 字符转换为大写后的字符串。
        Size size = Enum.valueOf(Size.class,input);
        System.out.println("size="+size);
        System.out.println("lrss="+size.lrss);
        if (size==Size.EXTRA_LARGE){
            System.out.println("凌瑞松大帅哥呀！！！");
        }
    }
    enum Size{
        SMALL("L"),MEDIUM("R"),LARGE("S"),EXTRA_LARGE("LRS");
        private Size(String lrss){
            this.lrss = lrss;
        }
        public String getLrss(){
            return lrss;
        }
        private String lrss;
    }
}

