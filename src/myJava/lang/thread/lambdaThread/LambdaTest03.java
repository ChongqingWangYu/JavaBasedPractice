package myJava.lang.thread.lambdaThread;

/**
 * @ClassName LambdaTest01
 * @Description Lambda推导
 * @Author ChongqingWangYu
 * @DateTime 2019/9/14 20:53
 * @GitHub https://github.com/ChongqingWangYu
 */
public class LambdaTest03 {
    public static void main(String[] args) {
        IInterest interest = (int a, int b) -> {
            System.out.println("i like lambda! ->" + (a + b));
            return a + b;
        };
        interest.lambda(100, 200);

        interest = (a, b) -> {
            System.out.println("i like lambda! ->" + (a + b));
            return a + b;
        };
        interest.lambda(50, 100);

        interest = (a, b) -> {
            return a + b;
        };
        int c;
        c=interest.lambda(25, 50);
        System.out.println(c);

        interest = (a, b) -> a + b;
        c=interest.lambda(12, 25);
        System.out.println(c);
    }
}

interface IInterest {
    int lambda(int a, int b);
}

class Interest implements IInterest {

    @Override
    public int lambda(int a, int b) {
        System.out.println("i like lambda! ->" + (a + b));
        return a + b;
    }
}
