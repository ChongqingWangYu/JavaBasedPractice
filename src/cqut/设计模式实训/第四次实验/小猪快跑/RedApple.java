package cqut.设计模式实训.第四次实验.小猪快跑;

/**
 * @ClassName RedApple
 * @Description 红苹果
 * @Author ChongqingWangYu
 * @DateTime 2019/10/21 18:44
 * @GitHub https://github.com/ChongqingWangYu
 */
public class RedApple {
    //用保护罩装饰器来包装小猪
    public ProtectedPig change(IUnit u)
    {
        System.out.println("吃到红苹果！保护罩！");
        ProtectedPig p = new ProtectedPig(u);
        return p;
    }
}
