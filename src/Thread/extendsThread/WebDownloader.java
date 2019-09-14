package Thread.extendsThread;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.net.URL;

/**
 * @ClassName WebDownloader
 * @Description
 * @Author ChongqingWangYu
 * @DateTime 2019/9/12 19:10
 * @GitHub https://github.com/ChongqingWangYu
 */
public class WebDownloader {
    public static void main(String[] args) {

    }

    public void download(String url, String name) {
        try {
            FileUtils.copyURLToFile(new URL(url), new File(name));
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("下载失败");
        }
    }
}
