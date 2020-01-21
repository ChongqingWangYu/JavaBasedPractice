package cqut.设计模式实训.第五次实验.Observer;

/**
 * @ClassName Main
 * @Description
 * @Author ChongqingWangYu
 * @DateTime 2019/10/29 8:45
 * @GitHub https://github.com/ChongqingWangYu
 */
public class Main {
    public static void main(String[] args) {
        Ring ring = new Ring();
        ring.add(new Student("王五"));
        ring.add(new Student("张三"));
        ring.add(new Student("李四"));
        ring.add(new Teacher("赵云"));
        ring.ring();
    }
}
