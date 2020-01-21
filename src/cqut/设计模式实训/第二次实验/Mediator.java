package cqut.设计模式实训.第二次实验;

/**
 * @ClassName Mediator
 * @Description 中间类又称为中介者，封装了组件对象之间的交互关系
 * @Author ChongqingWangYu
 * @DateTime 2019/9/29 19:48
 * @GitHub https://github.com/ChongqingWangYu
 */
public class Mediator {

    private Button button;
    private List list;
    private ComboBox comboBox;
    private TextBox textBox;
    private Label label;

    public void change(Component component) {
        if(component==button){
            list.update();
            comboBox.update();
            textBox.update();
            label.update();
        }else if (component==list){
            textBox.update();
            comboBox.update();
        }else if(component==comboBox){
            list.update();
            textBox.update();
        }else if(component==textBox){
            list.update();
            comboBox.update();
        }
    }
}
