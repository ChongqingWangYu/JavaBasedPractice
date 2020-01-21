package demo.笔试手写编程题;

/**
 * @ClassName 三个不同线程公用Foo实例
 * @Description 线程A会调用first()方法，并输出“1”
 * 线程B会调用second()方法，并输出“2”
 * 线程C会调用third()方法，并输出“3”
 * 请设计修改程序，以确保two()方法在one()方法之后被执行，
 * three()方法在two()方法之后被执行，最后输出结果为“123”。
 * @Author ChongqingWangYu
 * @DateTime 2019/10/11 9:02
 * @GitHub https://github.com/ChongqingWangYu
 */
public class 三个不同线程公用Foo实例 {
    public static void main(String[] args) throws InterruptedException {
        Foo foo = new Foo();
        Thread A = new Thread(new Runnable() {
            @Override
            public void run() {
                foo.first();
            }
        });
        Thread B = new Thread(new Runnable() {
            @Override
            public void run() {
                foo.second();
            }
        });
        Thread C = new Thread(new Runnable() {
            @Override
            public void run() {
                foo.third();
            }
        });
            A.start();
            A.join();
            B.start();
            B.join();
            C.start();
            C.join();
    }
}
