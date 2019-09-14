package duck;

/**
 * @ClassName RealDuck
 * @Description
 * @Author ChongqingWangYu
 * @DateTime 2019/9/11 15:10
 * @GitHub https://github.com/ChongqingWangYu
 */
public class RealDuck extends Duck
{
    public RealDuck()
    {
        super.setFlyBehavior(new FlyWithWing());
    }


    @Override
    public void display() {
        // TODO Auto-generated method stub
        System.out.println("This is a real duck");
    }

}