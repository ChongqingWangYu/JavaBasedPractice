package cqut.设计模式实训.第五次实验.Comparator;

/**
 * @ClassName Student
 * @Description 学生类
 * @Author ChongqingWangYu
 * @DateTime 2019/10/23 10:45
 * @GitHub https://github.com/ChongqingWangYu
 */
public class Student {
    private String sName;
    private int sAge;
    private String sSex;

    public Student(String sName, int sAge, String sSex) {
        this.sName = sName;
        this.sAge = sAge;
        this.sSex = sSex;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public int getsAge() {
        return sAge;
    }

    public void setsAge(int sAge) {
        this.sAge = sAge;
    }

    public String getsSex() {
        return sSex;
    }

    public void setsSex(String sSex) {
        this.sSex = sSex;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sName='" + sName + '\'' +
                ", sAge=" + sAge +
                ", sSex='" + sSex + '\'' +
                '}';
    }
}
