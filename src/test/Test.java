package test;

import net.sourceforge.pinyin4j.PinyinHelper;
import test.util.Pinyin;

import java.text.Collator;
import java.util.*;

/**
 * @ClassName Test.Test
 * @Description 测试
 * @Author ChongqingWangYu
 * @DateTime 2019/6/23 9:34
 * @GitHub https://github.com/ChongqingWangYu
 */
public class Test {
    static String a;
    public static void main(String[] args) {
        List<Customer> list = new ArrayList<>();
        list.add(new Customer(1,"中山"));
        list.add(new Customer(1,"汕头"));
        list.add(new Customer(1,"广州"));
        list.add(new Customer(1,"安庆"));
        list.add(new Customer(1,"阳江"));
        list.add(new Customer(1,"南京"));
        list.add(new Customer(1,"武汉"));
        list.add(new Customer(1,"北京"));
        list.add(new Customer(1,"安阳"));
        list.add(new Customer(1,"北方"));
        list.add(new Customer(1,"a中山"));
        list.add(new Customer(1,"b中山"));
        list.add(new Customer(1,"c中山"));
        list.add(new Customer(1,"1中山"));
        list.add(new Customer(1,"2中山"));
        list.add(new Customer(1,"3中山"));
        list.add(new Customer(1,"Ⅰ中山"));
        list.add(new Customer(1,"Ⅱ中山"));
        list.add(new Customer(1,"Ⅲ中山"));
        list.add(new Customer(1,"A中山"));
        list.add(new Customer(1,"B中山"));
        list.add(new Customer(1,"C中山"));
        Comparator<Object> com= Collator.getInstance(java.util.Locale.CHINA);
        for(Customer i:list){
            System.out.print(i.getCusNo());
        }
    }
}