package cqut.设计模式实训.第四次实验.小猪快跑;

/**
 * @ClassName GreenApple
 * @Description 绿苹果
 * @Author ChongqingWangYu
 * @DateTime 2019/10/21 18:43
 * @GitHub https://github.com/ChongqingWangYu
 */
public class GreenApple {
    //让跑快的装饰器来包装小猪
    public FasterPig change(IUnit u){
        System.out.println("吃到绿苹果！加速！");
        FasterPig p=new FasterPig(u);
        return p;
    }
}
