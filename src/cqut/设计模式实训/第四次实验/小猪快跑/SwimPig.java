package cqut.设计模式实训.第四次实验.小猪快跑;

/**
 * @ClassName SwimPig
 * @Description 小猪游泳
 * @Author ChongqingWangYu
 * @DateTime 2019/10/21 18:41
 * @GitHub https://github.com/ChongqingWangYu
 */
public class SwimPig extends PigDecorator{
    public SwimPig(IUnit p) {
        super(p);
    }

    @Override
    public void move() {
        pig.move();
    }

    @Override
    public void attacked() {
        pig.attacked();
    }
    public void swim(){
        System.out.println("小猪快游！");
    }
}
