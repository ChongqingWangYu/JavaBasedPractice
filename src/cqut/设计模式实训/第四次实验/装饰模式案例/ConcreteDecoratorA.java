package cqut.设计模式实训.第四次实验.装饰模式案例;

/**
 * @ClassName ConcreteDecoratorA
 * @Description
 * @Author ChongqingWangYu
 * @DateTime 2019/10/21 18:23
 * @GitHub https://github.com/ChongqingWangYu
 */
public class ConcreteDecoratorA extends Decorator {
    private String addedState;
    public ConcreteDecoratorA(Component c) {
        super(c);
    }

    @Override
    public void Operation() {
        super.Operation();
        System.out.println("ConcreteDecoratorA cqut.operation "+addedState);
    }
}
