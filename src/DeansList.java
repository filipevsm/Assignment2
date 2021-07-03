import java.util.ArrayList;

public class DeansList implements ICollection {
    private ArrayList<Student> studentList;

    public DeansList() {
        this.studentList = new ArrayList<Student>();
    }

    @Override
    public boolean add(Object newItem) {
        Student newStudent = (Student) newItem;
        if (newStudent.getGpa() >= 3.7) {
            this.studentList.add(newStudent);
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public String getNext() {
        Student newStudent = new Student(null,0);
        int counter = 0;
        while (counter < this.studentList.size()) {
            if (this.studentList.get(counter).getGpa() > newStudent.getGpa()) {
                newStudent = this.studentList.get(counter);
            }
            counter++;
        }
        counter = 0;
        while (counter < this.studentList.size()) {
            if (this.studentList.get(counter).equals(newStudent)) {
                this.studentList.remove(counter);
                return newStudent.toString();
            }
            counter++;
        }
        return "false";
    }
}
