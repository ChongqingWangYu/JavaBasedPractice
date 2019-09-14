package AbstractClass;

public class Main {
    public static void main(String[] args) {
        Person[] people=new Person[2];
        people[0]=new Student();
        people[1]=new Employee();
        for (Person p : people) {
            System.out.println(p.getDescription());
        }
    }
}
