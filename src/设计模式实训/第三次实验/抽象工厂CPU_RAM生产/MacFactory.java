package 设计模式实训.第三次实验.抽象工厂CPU_RAM生产;

/**
 * @ClassName MacFactory
 * @Description 具体工厂类
 * @Author ChongqingWangYu
 * @DateTime 2019/10/10 15:34
 * @GitHub https://github.com/ChongqingWangYu
 */
public class MacFactory extends AbstractFactory {
    private CPU cpu;
    private RAM ram;

    @Override
    public RAM getRAM() {
        ram = new MacRAM();
        return ram;
    }

    @Override
    public CPU getCPU() {
        cpu = new MacCPU();
        return cpu;
    }
}
