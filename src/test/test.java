package test;

/**
 * @ClassName test.test
 * @Description 测试
 * @Author ChongqingWangYu
 * @DateTime 2019/6/23 9:34
 * @GitHub https://github.com/ChongqingWangYu
 */
public class test {
    public static void main(String[] args) {
        String s1 = "Programming";
        String s2 = new String("Programming");
        String s3 = "Program" + "ming";
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s1 == s1.intern());
    }
}