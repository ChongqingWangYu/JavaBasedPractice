package 设计模式实训;

/**
 * @ClassName p34
 * @Description 题目：在某图形界面中，组件类之间相互产生教委复杂的引用关系，根据迪米特法则进行重构解耦合。
 * @Author ChongqingWangYu
 * @DateTime 2019/9/18 9:34
 * @GitHub https://github.com/ChongqingWangYu
 */
public class p34 {
    class Button {
        private List list;
        private ComboBox comboBox;
        private TextBox textBox;
        private Label label;

        public void change() {
            list.update();
            comboBox.update();
            textBox.update();
            label.update();
        }
    }

    class List {
        private ComboBox comboBox;
        private TextBox textBox;

        public void change() {
            comboBox.update();
            textBox.update();
        }

        public void update() {
        }
    }

    class ComboBox {
        private List list;
        private TextBox textBox;

        public void change() {
            list.update();
            textBox.update();
        }

        public void update() {
        }
    }

    class TextBox {
        private Mediator mediator;
        private List list;
        private ComboBox comboBox;

        public void change() {
            list.update();
            comboBox.update();
        }

        public void update() {
        }
    }

    class Label {

        public void update() {
        }
    }
}
