package cqut.设计模式实训.第四次实验.小猪快跑;

/**
 * @ClassName ProtectedPig
 * @Description 给小猪加上保护罩
 * @Author ChongqingWangYu
 * @DateTime 2019/10/21 18:36
 * @GitHub https://github.com/ChongqingWangYu
 */
public class ProtectedPig extends PigDecorator {
    public ProtectedPig(IUnit p) {
        super(p);
    }

    @Override
    public void move() {
        pig.move();
    }

    @Override
    public void attacked() {
        //重写，不掉血
        System.out.println("保护罩！小猪还剩下"+pig.Count()+"点生命");
    }
}
