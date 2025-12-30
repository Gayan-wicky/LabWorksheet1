package LW3.Q4;

public class Main {
    public static void main(String[] args) {

        Lecturer lec = new Lecturer();
        lec.setLecturerName("Mr.kseven");
        lec.setCourseTeaching("Object Oriented Programming");

        Course course = new Course();
        course.setCourseName("OOP");
        course.setCourseCode("CS2023");
        course.setLecturer(lec);

        Student stu = new Student();
        stu.setStudentName("Gayan");
        stu.setDegreeName("BSc Compter Science");
        stu.setCourseFollowing(course.getCourseName());

        System.out.println("Student Name: " + stu.getStudentName());
        System.out.println("Degree: " + stu.getDegreeName());
        System.out.println("Course: " + stu.getCourseFollowing());
        System.out.println("Lecturer: " + lec.getLecturerName());
    }
}
