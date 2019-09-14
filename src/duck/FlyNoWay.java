package duck;

/**
 * @ClassName FlyNoWay
 * @Description
 * @Author ChongqingWangYu
 * @DateTime 2019/9/11 15:08
 * @GitHub https://github.com/ChongqingWangYu
 */
public class FlyNoWay implements FlyBehavior
{

    public void fly()
    {
        // TODO Auto-generated method stub
        System.out.println("Cannot fly.");
        //throw new Exception("can not fly");
    }
}