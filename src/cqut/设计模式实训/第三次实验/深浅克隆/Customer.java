package cqut.设计模式实训.第三次实验.深浅克隆;

/**
 * @ClassName Customer
 * @Description 浅克隆
 * @Author ChongqingWangYu
 * @DateTime 2019/10/10 16:02
 * @GitHub https://github.com/ChongqingWangYu
 */
public class Customer implements Cloneable {
    private Address address = null;

    public Customer() {
        this.address = new Address();
    }

    //浅克隆方法
    @Override
    public Object clone() {
        Object obj = null;
        try {
            obj = super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("Clone failure!");
        }
        return obj;
    }
}
