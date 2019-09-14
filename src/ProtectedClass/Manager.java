package ProtectedClass;

import ProtectedClass.Protected.Employee;

public class Manager extends Employee {
    static {
        System.out.println(123);
    }
}
