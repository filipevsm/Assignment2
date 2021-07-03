public class DeansList implements ICollection {
    private Student[] studentList;

    public DeansList() {

    }

    public DeansList(int classSize) throws Exception {
        if (classSize <= 0) {
            IllegalArgumentException e = new IllegalArgumentException(String.valueOf(classSize));
        }
        else {
            this.studentList = new Student[classSize];
        }
    }

    @Override
    public boolean add(Object newItem) {
        return false;
    }

    @Override
    public String getNext() {
        return null;
    }
}
