package myJava.lang.thread.lambdaThread;

/**
 * @ClassName LambdaTest01
 * @Description Lambda推导
 * @Author ChongqingWangYu
 * @DateTime 2019/9/14 20:53
 * @GitHub https://github.com/ChongqingWangYu
 */
public class LambdaTest01 {
    static class Like2 implements ILike {
        @Override
        public void lambda() {
            System.out.println("i like lambda2!");
        }
    }

    public static void main(String[] args) {
        ILike like = new Like();
        like.lambda();

        ILike like2 = new Like2();
        like2.lambda();

        ILike like3 = new ILike() {
            @Override
            public void lambda() {
                System.out.println("i like lambda3!");
            }
        };
        like3.lambda();

        // lambda语法
        ILike like4 = () -> {
            System.out.println("i like lambda4!");
        };
        like4.lambda();

    }
}

interface ILike {
    void lambda();
}

class Like implements ILike {

    @Override
    public void lambda() {
        System.out.println("i like lambda!");
    }
}
