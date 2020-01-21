package cqut.设计模式实训.第四次实验.小猪快跑;

/**
 * @ClassName FasterPig
 * @Description 小猪加速
 * @Author ChongqingWangYu
 * @DateTime 2019/10/21 18:40
 * @GitHub https://github.com/ChongqingWangYu
 */
public class FasterPig extends PigDecorator {
    public FasterPig(IUnit p) {
        super(p);
    }

    @Override
    public void move() {
        System.out.println("小猪快飞！");
    }

    @Override
    public void attacked() {
        pig.attacked();
    }
}
