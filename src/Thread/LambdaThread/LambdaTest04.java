package Thread.LambdaThread;

/**
 * @ClassName LambdaTest04
 * @Description
 * @Author ChongqingWangYu
 * @DateTime 2019/9/14 21:20
 * @GitHub https://github.com/ChongqingWangYu
 */
public class LambdaTest04 {

    public static void main(String[] args) {
        new Thread(() -> {
            System.out.println("一边学习Lambda");
        }).start();

        new Thread(() -> System.out.println("一边学习奔溃")).start();
    }
}
