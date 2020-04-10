package myJava.io;

import java.io.*;

/**
 * @author wangyu4017@sefonsoft.com
 * @title: FileIoStreamTest
 * @projectName BasedPractice
 * @description: TODO
 * @date 2020/4/7 17:36
 */
public class FileIoStreamTest {
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        sb.append("<?xml version=\"1.0\" encoding=\"utf-8\" ?>");
        sb.append("<templates>");
        for (int i = 97; i < 123; i++) {
            sb.append("<template>");
            sb.append("<id>" + i + "</id>");
            sb.append("<name>"+ String.valueOf((char) i) +"指标组" + i + "</name>");
            sb.append("<bigendian>True</bigendian>");
            sb.append("<description>描述" + i + "</description>");
            sb.append("<parameters>");
            for (int j = 97; j < 123; j++) {
                sb.append("<param name=\"" + String.valueOf((char) j) + "指标名" + j + "\" type=\"String(20)\" mask=\"0xFFFF\" length=\"2\" isoffset=\"True\">");
                sb.append("<calculatescript>@value=@ToEnumString(@code);</calculatescript>");
                sb.append("<enum>");
                for (int k = 0; k < 10; k++) {
                    sb.append("<item code=\"" + k + "\" value=\"枚举值" + k + "\" />");
                }
                sb.append("</enum>");
                sb.append("</param>");
            }
            sb.append("</parameters>");
            sb.append("</template>");
        }
        sb.append("</templates>");
//        String path="C:\\Users\\Administrator\\Desktop\\12资料xml";
        String path="./assets/";
        File file = new File(path);
        if (!file.exists()) {
            file.mkdirs();
        }
        FileOutputStream fos = new FileOutputStream(new File(path+File.separator+"大数据.xml"));
        fos.write(sb.toString().getBytes());
        fos.close();
    }
}
