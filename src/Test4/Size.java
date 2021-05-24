package Test4;

/**
 * @author: lydsgy699
 * @email: 337887790@qq.com
 * @date: 2021/5/24 23:03
 */
public enum Size {
    Lrs("L"),LBR("R"),LYL("S");
    private String lrss;
    private Size(String lrss){
        this.lrss = lrss;
    }
    public String getLrss(){
        return lrss;
    }
}
