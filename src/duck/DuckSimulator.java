package duck;

/**
 * @ClassName DuckSimulator
 * @Description
 * @Author ChongqingWangYu
 * @DateTime 2019/9/11 15:12
 * @GitHub https://github.com/ChongqingWangYu
 */
public class DuckSimulator {
    public static void main(String[] args) {
        Duck realDuck = new RealDuck();
        realDuck.fly();
        realDuck.display();
        System.out.println("============================");


        RubberDuck rubberDuck = new RubberDuck();
        rubberDuck.fly();
        rubberDuck.display();
        System.out.println("============================");


        SuperDuck superDuck = new SuperDuck();
        superDuck.fly();
        superDuck.display();
        System.out.println("============================");

        //upgrade rubber duck to rocket power
        rubberDuck.setFlyBehavior(new FlyWithRocketPower());
        rubberDuck.fly();
    }
}
