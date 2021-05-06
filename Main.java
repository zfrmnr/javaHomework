public class Main {

    public static void main(String[] args) {

        Instructor instructor =new Instructor(1,"zafer","manar","zfrmnr",
                "abc123",1500);
        Student student=new Student(2,"ALİ","VELİ","aliveli",

                "abc123",87654321);
        InstructorManager instructorManager =new InstructorManager();
        instructorManager.add(instructor);
        instructorManager.delete(instructor);
        instructorManager.update(instructor);

        StudentManager studentManager=new StudentManager();
        studentManager.add(student);
        studentManager.delete(student);
        studentManager.update(student);




    }
}
