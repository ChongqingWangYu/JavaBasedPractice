package Thread.implementsRunnable;

/**
 * @ClassName StartThread
 * @Description 避免单继承的局限性，优先使用接口，方便共享资源
 * @Author ChongqingWangYu
 * @DateTime 2019/9/12 19:02
 * @GitHub https://github.com/ChongqingWangYu
 */
public class StartRun implements Runnable {
    /**
     * 线程入口点
     */
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println("一边听歌");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        //创建Thread子类对象
        StartRun st = new StartRun();
        //创建代理类对象
        Thread t = new Thread(st);
        //启动
        t.start();

//        new Thread(new StartRun()).start();
        for (int i = 0; i < 20; i++) {
            System.out.println("一边敲代码");
            Thread.sleep(100);
        }
    }
}
