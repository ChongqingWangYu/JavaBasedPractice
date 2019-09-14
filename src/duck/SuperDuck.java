package duck;

/**
 * @ClassName SupperDuck
 * @Description
 * @Author ChongqingWangYu
 * @DateTime 2019/9/11 15:10
 * @GitHub https://github.com/ChongqingWangYu
 */
public class SuperDuck extends Duck{
    public SuperDuck()
    {
        super.setFlyBehavior(new FlyWithRocketPower());
    }
    @Override
    public void display()
    {
        // TODO Auto-generated method stub
        System.out.println("This is a super duck. It can fly with rocket power to the moon.");
    }
}
