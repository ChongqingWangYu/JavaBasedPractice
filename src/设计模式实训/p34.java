package 设计模式实训;

/**
 * @ClassName p34
 * @Description 在某图形界面中，组件类之间相互产生教委复杂的引用关系，根据迪米特法则进行重构解耦合。
 * @Author ChongqingWangYu
 * @DateTime 2019/9/18 9:34
 * @GitHub https://github.com/ChongqingWangYu
 */
public class p34 {
    //改进，解耦合，中间类
    class Mediator {
        private Button button;
        private List list;
        private ComboBox comboBox;
        private TextBox textBox;
        private Label label;

        public void change(Button button) {
            list.update();
            comboBox.update();
            textBox.update();
            label.update();
        }

        public void change(List list) {
            comboBox.update();
            textBox.update();
        }

        public void change(ComboBox comboBox) {
            list.update();
            textBox.update();
        }

        public void change(TextBox textBox) {
            list.update();
            comboBox.update();
        }
    }

    class Button {
        private Mediator mediator;
//        private List list;
//        private ComboBox comboBox;
//        private TextBox textBox;
//        private Label label;

        public void change() {
            mediator.change(this);
//            list.update();
//            comboBox.update();
//            textBox.update();
//            label.update();
        }
    }

    class List {
        private Mediator mediator;
//        private ComboBox comboBox;
//        private TextBox textBox;

        public void change() {
            mediator.change(this);
//            comboBox.update();
//            textBox.update();
        }

        public void update() {
        }
    }

    class ComboBox {
        private Mediator mediator;
//        private List list;
//        private TextBox textBox;

        public void change() {
            mediator.change(this);
//            list.update();
//            textBox.update();
        }

        public void update() {
        }
    }

    class TextBox {
        private Mediator mediator;
//        private List list;
//        private ComboBox comboBox;

        public void change() {
            mediator.change(this);
//            list.update();
//            comboBox.update();
        }

        public void update() {
        }
    }

    class Label {

        public void update() {
        }
    }
}
