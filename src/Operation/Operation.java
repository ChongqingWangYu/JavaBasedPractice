package Operation;

/**
 * @ClassName OperationImpl
 * @Description 计算两数之和，两数之差
 * @Author ChongqingWangYu
 * @DateTime 2019/9/18 8:45
 * @GitHub https://github.com/ChongqingWangYu
 */
public class Operation implements IOperation {
    public static void main(String[] args) {
        IOperation operation = new Operation();
        System.out.println(operation.add(1, 2));//3.0
        System.out.println(operation.sub(2, 3));//-1.0
        System.out.println(operation.mul(3, 4));//12.0
        System.out.println(operation.div(5, 6));//0.83
    }

    @Override
    public double add(double a, double b) {
        return a + b;
    }

    @Override
    public double sub(double a, double b) {
        return a - b;
    }

    @Override
    public double mul(double a, double b) {
        return a * b;
    }

    @Override
    public double div(double a, double b) {
        return a / b;
    }
}
