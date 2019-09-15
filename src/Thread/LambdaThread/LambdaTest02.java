package Thread.LambdaThread;

/**
 * @ClassName LambdaTest01
 * @Description Lambda推导
 * @Author ChongqingWangYu
 * @DateTime 2019/9/14 20:53
 * @GitHub https://github.com/ChongqingWangYu
 */
public class LambdaTest02 {
    public static void main(String[] args) {
        ILove love = (int a) -> {
            System.out.println("i like lambda! ->" + a);
        };
        love.lambda(100);

        love = (a) -> {
            System.out.println("i like lambda! ->" + a);
        };
        love.lambda(50);

        love = a -> {
            System.out.println("i like lambda! ->" + a);
        };
        love.lambda(25);

        love = (a) -> System.out.println("i like lambda! ->" + a);
        love.lambda(12);
    }
}

interface ILove {
    void lambda(int a);
}

class Love implements ILove {

    @Override
    public void lambda(int a) {
        System.out.println("i like lambda! ->" + a);
    }
}
