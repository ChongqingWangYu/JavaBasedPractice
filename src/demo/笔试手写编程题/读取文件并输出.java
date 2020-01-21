package demo.笔试手写编程题;

import java.io.*;
import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName 读取文件并输出
 * @Description 有一个文本文件a.txt, 里面存有100个字符串（以逗号分隔）。
 * 这些字符串都是文件路径，比如/dir/dir2/a.txt。
 * 并且这些字符串已经按照字典顺序排序。
 * 请用java写一段完整的程序，要求能够读取a.txt中的字符串，
 * 并打印dir文件夹下的所有文件夹（不包括dir文件夹下的文件）
 * @Author ChongqingWangYu
 * @DateTime 2019/10/11 8:48
 * @GitHub https://github.com/ChongqingWangYu
 */
public class 读取文件并输出 {
    public static void main(String[] args) {
        Set set=new HashSet();
        //为了确保文件一定在之前是存在的，将字符串路径封装成File对象
        String fileName = "a";
        File file = new File("d:\\jsonfile\\" + fileName + ".txt");
        if (!file.exists()) {
            throw new RuntimeException("要读取的文件不存在");
        }
        BufferedReader reader = null;
        String laststr = "";
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, "UTF-8");
            reader = new BufferedReader(inputStreamReader);
            String tempString = null;
            while ((tempString = reader.readLine()) != null) {
                laststr += tempString;
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println("文件读取成功");
    }
}
