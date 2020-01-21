package cqut.设计模式实训.第五次实验.Observer;

/**
 * @ClassName Teacher
 * @Description 老师
 * @Author ChongqingWangYu
 * @DateTime 2019/10/29 8:44
 * @GitHub https://github.com/ChongqingWangYu
 */
public class Teacher implements Observer {
    private String name;

    public Teacher(String name) {
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
        System.out.println(getName()+"老师听到上课铃响了，走进了教室。");
    }
}
