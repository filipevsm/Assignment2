import java.util.ArrayList;

/**
 * The DeansList class keeps a list of Students with GPAs greater or equal to 3.7.
 *
 * DeansList class implements the ICollection interface.
 */
public class DeansList implements ICollection {
    private ArrayList<Student> studentList;

    /**
     * DeansList constructor instantiate a list (ArrayList) of Students. This is the only constructor for the class.
     */
    public DeansList() {
        this.studentList = new ArrayList<Student>();
    }

    /**
     * This method adds a Student to the list if the Student has a GPA greater or equal to 3.7. It calls the method
     * getGpa() from Student class to check student's GPA prior to adding to the list. This is a custom implementation
     * of the add method first referenced at the ICollection interface.
     *
     * @param newItem This object represents a Student to be added to the list.
     * @return The add method returns true if the Student was added to the list successfully or false if not.
     */
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

    /**
     * This method returns the Student with the highest GPA among all students in the list. It calls the method
     * getGpa() from Student class to check student's GPA. This is a custom implementation of the add method first
     * referenced at the ICollection interface.
     *
     * @return It returns a String with the toString() call of Student class to show both student's name and GPA or
     * "false" if there is no students in the list.
     */
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
