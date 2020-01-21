package cqut.设计模式实训.第四次实验.小猪快跑;

/**
 * @ClassName Pig
 * @Description
 * @Author ChongqingWangYu
 * @DateTime 2019/10/21 18:33
 * @GitHub https://github.com/ChongqingWangYu
 */
public class Pig implements IUnit{
    private int pigCounts=5;
    @Override
    public int Count() {
        return pigCounts;
    }

    @Override
    public void move() {
        System.out.println("小猪快跑！");
    }

    @Override
    public void attacked() {
        if(pigCounts>0){
            pigCounts--;
        }
        System.out.println("小猪还剩下"+pigCounts+"点生命");
    }
}
