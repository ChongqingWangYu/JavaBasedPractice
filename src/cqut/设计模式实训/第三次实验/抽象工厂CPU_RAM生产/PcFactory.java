package cqut.设计模式实训.第三次实验.抽象工厂CPU_RAM生产;

/**
 * @ClassName PcFactory
 * @Description 具体工厂类
 * @Author ChongqingWangYu
 * @DateTime 2019/10/10 13:53
 * @GitHub https://github.com/ChongqingWangYu
 */
public class PcFactory extends AbstractFactory {
    private CPU cpu;
    private RAM ram;

    @Override
    public RAM getRAM() {
        ram = new PcRAM();
        return ram;
    }

    @Override
    public CPU getCPU() {
        cpu = new PcCPU();
        return cpu;
    }
}
