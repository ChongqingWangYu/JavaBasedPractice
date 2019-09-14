package Thread.implementsCallable;

import Thread.extendsThread.WebDownloader;

import java.util.concurrent.*;

/**
 * @ClassName TDownloader
 * @Description
 * @Author ChongqingWangYu
 * @DateTime 2019/9/12 19:21
 * @GitHub https://github.com/ChongqingWangYu
 */
public class CDownloader implements Callable<Boolean> {
    private String url;//图片地址
    private String name;//图片名称

    public CDownloader(String url, String name) {
        this.url = url;
        this.name = name;
    }

    @Override
    public Boolean call() throws InterruptedException {
        WebDownloader wd = new WebDownloader();
        wd.download(url, name);
        System.out.println(name);
        return true;
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CDownloader cd1 = new CDownloader("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1568297556268&di=1ed6b9a68d3ec7bc3c4f7bda4ce09d05&imgtype=0&src=http%3A%2F%2Fgss0.baidu.com%2F-fo3dSag_xI4khGko9WTAnF6hhy%2Flvpics%2Fw%3D600%2Fsign%3D1350023d79899e51788e391472a5d990%2Fb21bb051f819861810d03e4448ed2e738ad4e65f.jpg", "夕阳.jpg");
        CDownloader cd2 = new CDownloader("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1568297556268&di=d4ffbe96790c3dffd9d64ab1f353232b&imgtype=0&src=http%3A%2F%2Fimg.alicdn.com%2Fimgextra%2Fi4%2F2735225488%2FTB2R1z.fxPI8KJjSspfXXcCFXXa_%2521%25212735225488-0-weitao.jpg", "海底.jpg");
        CDownloader cd3 = new CDownloader("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1568297556267&di=ab73860f23c512c7e9b7b1079141c5d2&imgtype=0&src=http%3A%2F%2Fa.hiphotos.baidu.com%2Flvpics%2Fh%3D800%2Fsign%3D2d496375d739b60052ce02b7d9513526%2Fa6efce1b9d16fdfa97d6a678b68f8c5495ee7be9.jpg", "公园.jpg");
        //创建执行服务
        ExecutorService ser = Executors.newFixedThreadPool(3);
        //提交执行
        Future<Boolean> f1 = ser.submit(cd1);
        Future<Boolean> f2 = ser.submit(cd2);
        Future<Boolean> f3 = ser.submit(cd3);
        //获取结果
        Boolean r1 = f1.get();
        Boolean r2 = f2.get();
        Boolean r3 = f3.get();
        System.out.println(r1);
        //关闭服务
        ser.shutdownNow();
    }
}
