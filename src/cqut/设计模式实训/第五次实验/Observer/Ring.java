package cqut.设计模式实训.第五次实验.Observer;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @ClassName Ring
 * @Description 上课铃
 * @Author ChongqingWangYu
 * @DateTime 2019/10/29 8:41
 * @GitHub https://github.com/ChongqingWangYu
 */
public class Ring implements Subject{
    private ArrayList<Observer> list=new ArrayList<>();
    @Override
    public void add(Observer o) {
        list.add(o);
    }

    @Override
    public void remove(Observer o) {
        list.remove(o);
    }

    @Override
    public void notifyObserver() {
        Iterator<Observer> iterator = list.iterator();
        while (iterator.hasNext()){
            iterator.next().update();
        }
    }

    public void ring(){
        notifyObserver();
    }

}
