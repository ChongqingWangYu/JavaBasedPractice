package cqut.设计模式实训.第五次实验.Observer;

public interface Subject {
    void add(Observer o);
    void remove(Observer o);
    void notifyObserver();
}
