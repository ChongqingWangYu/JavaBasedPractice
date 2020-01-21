package cqut.设计模式实训.第三次实验.抽象工厂CPU_RAM生产;

/**
 * @ClassName AbstractFactory
 * @Description 抽象工厂类
 * @Author ChongqingWangYu
 * @DateTime 2019/10/10 15:29
 * @GitHub https://github.com/ChongqingWangYu
 */
public abstract class AbstractFactory {
    public abstract RAM getRAM();
    public abstract CPU getCPU();
}
