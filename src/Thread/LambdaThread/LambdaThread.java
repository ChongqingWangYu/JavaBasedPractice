package Thread.LambdaThread;

/**
 * @ClassName StartThread
 * @Description 避免单继承的局限性，优先使用接口，方便共享资源
 * @Author ChongqingWangYu
 * @DateTime 2019/9/12 19:02
 * @GitHub https://github.com/ChongqingWangYu
 */
public class LambdaThread {

    //静态内部类（不使用不编译，使用才编译）
    static class Test implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < 20; i++) {
                System.out.println("一边听歌");
            }
        }
    }

    public static void main(String[] args) {
        //局部内部类
        class Test2 implements Runnable {

            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println("一边敲代码");
                }
            }
        }
        new Thread(new Test()).start();
        new Thread(new Test2()).start();

        //匿名内部类 必须借助接口或者父类
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println("一边喝可乐");
                }
            }
        }).start();

        //jdk8 使用lambda表达式简化（只能有一个方法）
        new Thread(() -> {
            for (int i = 0; i < 20; i++) {
                System.out.println("一边看视频");
            }
        }).start();
    }
}
