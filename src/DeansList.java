import java.util.ArrayList;

public class DeansList implements ICollection{
    private ArrayList<Student> studentList = new ArrayList<Student>();

    public DeansList(){
    }

    public DeansList(double studentGPA){
        if (studentGPA >= 3.7) {
            Student[]
        }
    }

    @Override
    public boolean add(Object newItem) {
        this.studentList.add(0, (Student) newItem);
        return false;
    }

    @Override
    public String getNext() {
        return null;
    }
}
