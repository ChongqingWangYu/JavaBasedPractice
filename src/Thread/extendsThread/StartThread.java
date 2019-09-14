package Thread.extendsThread;

/**
 * @ClassName StartThread
 * @Description 继承Therad实现多线程
 * @Author ChongqingWangYu
 * @DateTime 2019/9/12 19:02
 * @GitHub https://github.com/ChongqingWangYu
 */
public class StartThread extends Thread {
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
        StartThread st = new StartThread();
        //启动
        st.start();
        for (int i = 0; i < 20; i++) {
            System.out.println("一边敲代码");
            Thread.sleep(100);
        }
    }
}
