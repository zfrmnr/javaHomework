public class StudentManager extends UserManager {
    public void add(Student student){
        System.out.println(student.getFirstName()+student.getLastName()+" ogrenci eklendi");
    }
    public void update(Student student){
        System.out.println(student.getFirstName()+student.getLastName()+" ogrenci güncellendi");
    }
    public void delete(Student student){
        System.out.println(student.getFirstName()+student.getLastName()+" ogrenci silindi");
}

}
