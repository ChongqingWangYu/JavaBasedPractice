package cqut.设计模式实训.第五次实验.Observer;

/**
 * @ClassName Student
 * @Description 学生
 * @Author ChongqingWangYu
 * @DateTime 2019/10/29 8:43
 * @GitHub https://github.com/ChongqingWangYu
 */
public class Student implements Observer {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        System.out.println(getName()+"同学听到上课铃响了，跑进了教室。");
    }
}
