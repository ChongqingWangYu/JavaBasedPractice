package Thread.StaticProxy;

/**
 * @ClassName StaticProxy
 * @Description 静态代理
 * 接口：
 * 1、真实角色
 * 2、代理角色
 * @Author ChongqingWangYu
 * @DateTime 2019/9/12 20:24
 * @GitHub https://github.com/ChongqingWangYu
 */
public class StaticProxy {
    public static void main(String[] args) {
        new WeddingCompany(new You()).happyMarry();
        //new Thread(线程对象).start();
    }
}

//结婚接口
interface Marry {
    void happyMarry();
}

//真实角色
class You implements Marry {

    @Override
    public void happyMarry() {
        System.out.println("你和嫦娥终于奔月了...");
    }
}

//代理角色（婚礼公司）
class WeddingCompany implements Marry {
    //真实角色
    private Marry target;

    public WeddingCompany(Marry target) {
        this.target = target;
    }

    @Override
    public void happyMarry() {
        ready();
        this.target.happyMarry();
        after();
    }

    private void ready() {
        System.out.println("布置猪窝...");
    }

    private void after() {
        System.out.println("闹玉兔...");
    }

}
