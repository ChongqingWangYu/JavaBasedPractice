package duck;

/**
 * @ClassName Duck
 * @Description
 * @Author ChongqingWangYu
 * @DateTime 2019/9/11 15:02
 * @GitHub https://github.com/ChongqingWangYu
 */
public abstract class Duck
{
    private FlyBehavior flyBehavior;

    public Duck()
    {}

    public void fly()
    {
        this.flyBehavior.fly();
    }


    public void setFlyBehavior(FlyBehavior flyBehavior)
    {
        this.flyBehavior = flyBehavior;
    }

    public void swing()
    {
        System.out.println("Duck is swinging");
    }

    public abstract void display();
}