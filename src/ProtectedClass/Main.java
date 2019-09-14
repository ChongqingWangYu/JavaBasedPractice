package ProtectedClass;

import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        Manager2 m2=new Manager2();
        m2.hireDay=1;
        Manager m=new Manager();
//        m.hireDay=2;//编译错误
        System.out.println(Objects.equals(null,null));
    }
}
