package cqut.设计模式实训.第二次实验;

/**
 * @ClassName Component
 * @Description 抽象构件类
 * @Author ChongqingWangYu
 * @DateTime 2019/9/29 19:46
 * @GitHub https://github.com/ChongqingWangYu
 */
abstract class Component {
    protected Mediator mediator;

    public void change(){
        mediator.change(this);
    }
    public abstract void update();
}
class Button extends Component{
    @Override
    public void update() {
    }
}

class List extends Component{
    @Override
    public void update() {
    }
}

class ComboBox extends Component{
    @Override
    public void update() {
    }
}

class TextBox extends Component{
    @Override
    public void update() {
    }
}

class Label extends Component{
    @Override
    public void update() {
    }
}