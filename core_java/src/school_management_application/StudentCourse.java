package school_management_application;

public class StudentCourse {

    private Student student;
    private Course course;

    public void setStudent(Student student) {
        this.student = student;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public void showStudentCourseDetails() {
    	
    	System.out.println("\n--------Student Details--------");
        System.out.println("Name       : " + student.getName());
        System.out.println("Age        : " + student.getAge());
        System.out.println("Roll No    : " + student.getRollNumber());
        System.out.println("Grade      : " + student.getGrade());
        System.out.println("Course ID  : " + course.getCourseId());
        System.out.println("Course Name: " + course.getCourseName());
    }

    public static void main(String[] args) {
    	
        Student s1 = new Student();
        s1.setName("Dinga");
        s1.setAge(21);
        s1.setRollNumber(101);
        s1.setGrade("A");
        
        Student s2 = new Student();
        s2.setName("Dingi");
        s2.setAge(21);
        s2.setRollNumber(102);
        s2.setGrade("A");

        Course c1 = new Course();
        c1.setCourseId(501);
        c1.setCourseName("Java Programming");
        
        Course c2 = new Course();
        c2.setCourseId(502);
        c2.setCourseName("Soft-Skills");

        StudentCourse sc1 = new StudentCourse();
        sc1.setStudent(s1);
        sc1.setCourse(c1);
        
        StudentCourse sc2 = new StudentCourse();
        sc2.setStudent(s2);
        sc2.setCourse(c2);

        sc1.showStudentCourseDetails();
        
        sc2.showStudentCourseDetails();
    }
}
