package duck;

/**
 * @ClassName RubberDuck
 * @Description
 * @Author ChongqingWangYu
 * @DateTime 2019/9/11 15:10
 * @GitHub https://github.com/ChongqingWangYu
 */
public class RubberDuck extends Duck
{
    public RubberDuck()
    {
        super.setFlyBehavior(new FlyNoWay());
    }


    @Override
    public void display()
    {
        // TODO Auto-generated method stub
        System.out.println("This is a rubber duck. it cannot fly nor quack.");
    }

}