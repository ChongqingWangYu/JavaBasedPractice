package 设计模式实训.第三次实验.工厂类女娲造人;

/**
 * @ClassName Nvwa
 * @Description 工厂类（女娲）
 * @Author ChongqingWangYu
 * @DateTime 2019/10/10 13:33
 * @GitHub https://github.com/ChongqingWangYu
 */
public class Nvwa {
    public static Person makePerson(char arg) {
        Person person = null;
        switch (arg) {
            case 'M':
                person = new Man();
                break;

            case 'W':
                person = new Woman();
                break;

            case 'R':
                person = new Robot();
                break;

        }
        return person;
    }
}
