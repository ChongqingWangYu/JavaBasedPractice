package cqut.设计模式实训.第四次实验.小猪快跑;

/**
 * @ClassName YellowApple
 * @Description 黄苹果
 * @Author ChongqingWangYu
 * @DateTime 2019/10/21 18:44
 * @GitHub https://github.com/ChongqingWangYu
 */
public class YellowApple {
    //用游泳的装饰器来包装小猪
    public SwimPig change(IUnit u)
    {
        System.out.println("吃到黄苹果！游泳！");
        SwimPig p = new SwimPig(u);
        return p;
    }
}
