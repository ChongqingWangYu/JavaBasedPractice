package cqut.设计模式实训.第四次实验.装饰模式案例;

/**
 * @ClassName ConcreteDecoratorB
 * @Description
 * @Author ChongqingWangYu
 * @DateTime 2019/10/21 18:24
 * @GitHub https://github.com/ChongqingWangYu
 */
public class ConcreteDecoratorB extends Decorator {
    public ConcreteDecoratorB(Component c) {
        super(c);
    }

    @Override
    public void Operation() {
        super.Operation();
        System.out.println("ConcreteDecoratorB cqut.operation ");
    }
    public void AddedBehavior()
    {
        System.out.println("This is Added Behavior");
    }
}
