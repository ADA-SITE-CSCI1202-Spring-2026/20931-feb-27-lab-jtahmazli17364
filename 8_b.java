public class Teacher extends Person {

    private String department;
    private String[] courses;

    public Teacher() {
        super();
    }

    public Teacher(String firstName, String lastName, String gender,
                   String department, String[] courses) {
        super(firstName, lastName, gender);
        this.department = department;
        this.courses = courses;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String[] getCourses() {
        return courses;
    }

    public void setCourses(String[] courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        String courseList = "";
        if (courses != null) {
            for (int i = 0; i < courses.length; i++) {
                courseList += courses[i];
                if (i < courses.length - 1) {
                    courseList += ", ";
                }
            }
        }
        return "Teacher[" +
                super.toString() +
                ", department=" + department +
                ", courses=" + courseList +
                "]";
    }

    public boolean equals(Teacher t) {
        if (t == null) return false;
        if (!super.equals(t)) return false;
        if (!department.equals(t.department)) return false;
        if (courses == null && t.courses == null) return true;
        if (courses == null || t.courses == null) return false;
        if (courses.length != t.courses.length) return false;
        for (int i = 0; i < courses.length; i++) {
            if (!courses[i].equals(t.courses[i])) return false;
        }
        return true;
    }
}