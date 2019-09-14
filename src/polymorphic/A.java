package polymorphic;

/**
 * @ClassName A
 * @Description 多态的深入理解
 * @Author ChongqingWangYu
 * @DateTime 2019/9/11 14:48
 * @GitHub https://github.com/ChongqingWangYu
 */
public class A {
    public static void main(String args[]) {
        A a1 = new A();
        A a2 = new B();
        B b = new B();
        C c = new C();
        D d = new D();
        System.out.println(a1.show(b));//A and A
        System.out.println(a1.show(c));//A and A
        System.out.println(a1.show(d));//A and D
        System.out.println(a2.show(b));//B and A
        System.out.println(a2.show(c));//B and A
        System.out.println(a2.show(d));//A and D
        System.out.println(b.show(b));//B and B
        System.out.println(b.show(c));//B and B
        System.out.println(b.show(d));//A and D
    }

    public String show(D obj) {
        return ("A and D");
    }

    public String show(A obj) {
        return ("A and A");
    }
}

class B extends A {
    public String show(B obj) {
        return ("B and B");
    }

    public String show(A obj) {
        return ("B and A");
    }
}

class C extends B {
    public String show(D obj) {
        return ("A and D");
    }

    public String show(A obj) {
        return ("A and A");
    }
}

class D extends B {
    public String show(D obj) {
        return ("A and D");
    }

    public String show(A obj) {
        return ("A and A");
    }
}
