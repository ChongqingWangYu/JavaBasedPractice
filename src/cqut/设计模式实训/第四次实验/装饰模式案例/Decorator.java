package cqut.设计模式实训.第四次实验.装饰模式案例;

/**
 * @ClassName Decorator
 * @Description
 * @Author ChongqingWangYu
 * @DateTime 2019/10/21 18:20
 * @GitHub https://github.com/ChongqingWangYu
 */
public class Decorator implements Component {
    protected Component comp;
    public Decorator(Component c){
        this.comp=c;
    }

    @Override
    public void Operation() {

    }
}
