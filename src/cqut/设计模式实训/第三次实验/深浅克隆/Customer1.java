package cqut.设计模式实训.第三次实验.深浅克隆;

import com.sun.xml.internal.messaging.saaj.util.ByteInputStream;

import java.io.*;

/**
 * @ClassName Customer
 * @Description 深克隆
 * @Author ChongqingWangYu
 * @DateTime 2019/10/10 16:02
 * @GitHub https://github.com/ChongqingWangYu
 */
public class Customer1 implements Serializable {
    private Address address = null;

    public Customer1() {
        this.address = new Address();
    }

    //深克隆方法
    public Object deepClone() throws IOException, ClassNotFoundException {
        //将对象写入流中
        ByteArrayOutputStream bao = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bao);

        //将对象从流中取出
        ByteArrayInputStream bis = new ByteInputStream();
        ObjectInputStream ois = new ObjectInputStream(bis);

        return ois.readObject();

    }
}
