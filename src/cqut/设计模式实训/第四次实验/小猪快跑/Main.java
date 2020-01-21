package cqut.设计模式实训.第四次实验.小猪快跑;

/**
 * @ClassName Main
 * @Description
 * @Author ChongqingWangYu
 * @DateTime 2019/10/21 18:45
 * @GitHub https://github.com/ChongqingWangYu
 */
public class Main {
    public static void main(String[] args) {
        IUnit pig1 = new Pig(); //一只原生的小猪
        Monster m = new Monster();   //一只灰狼
        pig1.move(); //小猪开始跑
        //灰狼攻击小猪，调用小猪被攻击的方法，小猪生命减1并显示剩余的生命。
        m.attack(pig1);
        RedApple r = new RedApple();    //出现一只红苹果
        pig1 = r.change(pig1); //小猪吃到红苹果，红苹果把小猪用“保护罩”装饰成“受保护的小猪”
        pig1.move();
        m.attack(pig1); //此时灰狼再咬小猪的时候，发现小猪由于已经被“保护罩”装饰，并未减少生命力
        GreenApple g = new GreenApple();    //出现一只绿苹果
        pig1 = g.change(pig1); //有“保护罩”的小猪又吃了一个绿苹果，此时小猪既有“保护罩”装饰，又有“快速奔跑”装饰。
        pig1.move(); //显示小猪正在快速奔跑
        m.attack(pig1); //小猪受到攻击，生命力仍不减少。
        YellowApple y = new YellowApple(); //出现一只黄苹果
        pig1 = y.change(pig1); //“保护罩”“快速奔跑”的小猪又加上了“会游泳”这个包装。
        ((SwimPig)pig1).move();
        ((SwimPig)pig1).swim();   //小猪在游泳
        m.attack(pig1); //小猪受到攻击生命力仍不减
    }
}
