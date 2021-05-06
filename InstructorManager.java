public class InstructorManager extends UserManager{

    public void add(Instructor instructor){
        System.out.println(instructor.getFirstName()+instructor.getLastName()+" hoca eklendi");
    }
    public void update(Instructor instructor){
        System.out.println(instructor.getFirstName()+instructor.getLastName()+" hoca güncellendi");
    }
    public void delete(Instructor instructor){
        System.out.println(instructor.getFirstName()+instructor.getLastName()+" hoca silindi");

}

}
