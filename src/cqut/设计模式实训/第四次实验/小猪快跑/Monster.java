package cqut.设计模式实训.第四次实验.小猪快跑;

/**
 * @ClassName Monster
 * @Description 灰狼
 * @Author ChongqingWangYu
 * @DateTime 2019/10/21 18:45
 * @GitHub https://github.com/ChongqingWangYu
 */
public class Monster {
    //攻击小猪的方法
    public void attack(IUnit u)
    {
        //调用小猪被攻击的方法。
        System.out.println("咬到小猪！");
        u.attacked();
    }
}
