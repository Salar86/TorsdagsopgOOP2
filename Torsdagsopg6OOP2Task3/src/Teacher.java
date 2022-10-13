import java.util.ArrayList;

public class Teacher extends Person{
    ArrayList<String> canTeach;
    ArrayList<String> currentCourses = new ArrayList<>();
    public Teacher(String name) {
        super(name);
        this.canTeach = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "canTeach=" + canTeach +
                ", name='" + name + '\'' +
                '}';
    }

    public Teacher(String name, String canTeach) {
        super(name);
        this.canTeach = new ArrayList<>();
    }
    @Override
    public boolean addCourse(String course) {
        if (canTeach.contains(course)) {
            currentCourses.add(course);
            return true;
        }
        return false;
    }
}
