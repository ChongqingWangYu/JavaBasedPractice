package myJava.lang.thread.implementsCallable;

import java.util.concurrent.*;

/**
 * @ClassName Racer
 * @Description 模拟龟兔赛跑
 * @Author ChongqingWangYu
 * @DateTime 2019/9/12 19:39
 * @GitHub https://github.com/ChongqingWangYu
 */
public class CRacer implements Callable<Integer> {

    //胜利者
    private String winner;

    @Override
    public Integer call() throws InterruptedException {
        String threadName = Thread.currentThread().getName();
        for (int i = 0; i <= 100; i++) {
            if (threadName.equals("pool-1-myJava.lang.thread-1")) {
                //兔子跑得更快
                i++;
                //兔子喜欢睡觉
                if (i > 95) {
                    Thread.sleep(1);
                }
            }
            System.out.println(threadName + "-->" + i);
            //比赛是否结束
            boolean flag = gameOver(i, threadName);
            if (flag) {
                return i;
            }
        }
        return null;
    }

    private boolean gameOver(int i, String name) {
        if (winner != null) {
            return true;
        } else {
            if (i >= 100) {
                winner = name;
                System.out.println("winner -->" + name);
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CRacer racer = new CRacer();
        //创建执行服务
        ExecutorService ser = Executors.newFixedThreadPool(3);
        //提交执行
        Future<Integer> f1 = ser.submit(racer);
        Future<Integer> f2 = ser.submit(racer);
        //获取结果
        Integer r1 = f1.get();
        Integer r2 = f2.get();
        System.out.println(r1 + "-->" + r2);
        //关闭服务
        ser.shutdownNow();
    }
}
