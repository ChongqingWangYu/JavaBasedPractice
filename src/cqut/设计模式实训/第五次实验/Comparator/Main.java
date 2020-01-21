package cqut.设计模式实训.第五次实验.Comparator;

/**
 * @ClassName Main
 * @Description
 * @Author ChongqingWangYu
 * @DateTime 2019/10/23 10:52
 * @GitHub https://github.com/ChongqingWangYu
 */
public class Main {
    public static void main(String[] args) {
        StudentList students = new StudentList();
        students.addStudent(new Student("王渔", 22, "男"));
        students.addStudent(new Student("尹以操", 21, "男"));
        students.addStudent(new Student("舒文涛", 25, "男"));
        students.addStudent(new Student("罗以健", 24, "男"));
        students.addStudent(new Student("徐健", 23, "男"));
        students.displayStudents();
    }
}
