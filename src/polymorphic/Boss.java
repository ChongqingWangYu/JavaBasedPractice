package polymorphic;

public class Boss extends Manager{
    public Boss(String name, double salary) {
        super(name, salary);
    }


    public void expel(Employee a){
        a.setSalary(0);
    }
}
