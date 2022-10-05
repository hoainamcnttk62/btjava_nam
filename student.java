package person;

public class Student extends Person{
    double gpa;

    public Student(String name, int age, String address, double gpa) {
        super(name, age, address);
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "gpa=" + gpa +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }

    public void display(){
        System.out.println(this);

    }
}