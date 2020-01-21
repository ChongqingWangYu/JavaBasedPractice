package cqut.设计模式实训.第五次实验.Comparator;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

/**
 * @ClassName StudentList
 * @Description 学生集合
 * @Author ChongqingWangYu
 * @DateTime 2019/10/23 10:47
 * @GitHub https://github.com/ChongqingWangYu
 */
public class StudentList {
    private ArrayList<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
    }

    public void displayStudents() {
        Comparator comparator = new MyComparator();
        Collections.sort(students, comparator);
        Iterator i = students.iterator();
        while (i.hasNext()) {
            Student student = (Student) i.next();
            System.out.println(student.toString());
        }
    }

    class MyComparator implements Comparator<Student> {

        @Override
        public int compare(Student s1, Student s2) {
            if (s1.getsAge() < s2.getsAge()) {
                return 1;
            } else if (s1.getsAge() == s2.getsAge()) {
                return 0;
            } else {
                return -1;
            }
        }
    }
}
