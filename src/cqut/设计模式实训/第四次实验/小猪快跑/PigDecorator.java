package cqut.设计模式实训.第四次实验.小猪快跑;

/**
 * @ClassName PigDecorator
 * @Description
 * @Author ChongqingWangYu
 * @DateTime 2019/10/21 18:34
 * @GitHub https://github.com/ChongqingWangYu
 */
public abstract class PigDecorator implements IUnit{
    protected IUnit pig;
    public PigDecorator(IUnit p){
        this.pig=p;
    }

    @Override
    public int Count() {
        return pig.Count();
    }
}
