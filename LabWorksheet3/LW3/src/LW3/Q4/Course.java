package LW3.Q4;

class Course {
    private String courseName;
    private String courseCode;
    private Lecturer lecturer;

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String name) {
        courseName = name;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String code) {
        courseCode = code;
    }

    public Lecturer getLecturer() {
        return lecturer;
    }

    public void setLecturer(Lecturer lecturer) {
        this.lecturer = lecturer;
    }
}
