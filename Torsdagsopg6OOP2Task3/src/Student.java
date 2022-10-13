import java.util.ArrayList;

public class Student extends Person{

    ArrayList<String> passedCourses;
    ArrayList<String> currentCourses = new ArrayList<>();

    public Student(String name) {
        super(name);
        this.passedCourses = new ArrayList<>();
    }
    public Student(String name, String passedCourses) {
        super(name);
        this.passedCourses = new ArrayList<>();
    }


    @Override
    public boolean addCourse(String course) {
        if (passedCourses.contains(course)) {
            return false;
        } else {

            currentCourses.add(course);
        }
        return true;
    }

    @Override
    public String toString() {
        return "Student{" +
                "passedCourses=" + passedCourses +
                ", name='" + name + '\'' +
                '}';
    }
}
