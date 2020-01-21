package myJava.lang.thread.implementsRunnable;

/**
 * @ClassName Racer
 * @Description 模拟龟兔赛跑
 * @Author ChongqingWangYu
 * @DateTime 2019/9/12 19:39
 * @GitHub https://github.com/ChongqingWangYu
 */
public class Racer implements Runnable {

    //胜利者
    private String winner;

    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        for (int i = 0; i <= 100; i++) {
            if (threadName.equals("rabbit")) {
                //兔子跑得更快
                i++;
                //兔子喜欢睡觉
                if (i > 95) {
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
            System.out.println(threadName + "-->" + i);
            //比赛是否结束
            boolean flag = gameOver(i, threadName);
            if (flag) {
                break;
            }
        }
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

    public static void main(String[] args) {
        Racer racer = new Racer();
        new Thread(racer, "tortoise").start();
        new Thread(racer, "rabbit").start();
    }
}
