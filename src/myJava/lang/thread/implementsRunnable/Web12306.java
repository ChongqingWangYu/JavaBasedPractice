package myJava.lang.thread.implementsRunnable;

/**
 * @ClassName Web12306
 * @Description 模拟抢票，共享资源，并发（线程安全）
 * @Author ChongqingWangYu
 * @DateTime 2019/9/12 19:34
 * @GitHub https://github.com/ChongqingWangYu
 */
public class Web12306 implements Runnable {
    //票数
    private int ticketNums = 99;

    @Override
    public void run() {
        while (true) {
            if (ticketNums <= 0) {
                break;
            }
            //当出现网络异常，票数会存在负数
//            try {
//                myJava.lang.thread.sleep(100);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
            System.out.println(Thread.currentThread().getName() + ticketNums--);
        }
    }

    public static void main(String[] args) {
        //一份资源
        Web12306 web = new Web12306();
        //多个代理
        new Thread(web, "张三").start();
        new Thread(web, "李四").start();
        new Thread(web, "赵五").start();
    }
}
