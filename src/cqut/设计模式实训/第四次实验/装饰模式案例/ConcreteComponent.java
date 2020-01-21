package cqut.设计模式实训.第四次实验.装饰模式案例;

/**
 * @ClassName ConcreteComponent
 * @Description
 * @Author ChongqingWangYu
 * @DateTime 2019/10/21 18:19
 * @GitHub https://github.com/ChongqingWangYu
 */
public class ConcreteComponent implements Component {
    @Override
    public void Operation() {
        System.out.println("ConcreteComponent cqut.operation");
    }
}
