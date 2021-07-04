/**
 * This class implements the Student object that is instantiated inside of DeansList. The Student object has a name and
 * a GPA.
 *
 * @author meghrigJAC
 */
public class Student {
    private String name;
    private double gpa;

    public Student(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    public double getGpa(){
        return gpa;
    }

    @Override
    public String toString()
    {
        return name + " has GPA " + gpa;
    }
}