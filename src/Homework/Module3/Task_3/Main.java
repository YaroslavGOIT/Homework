package Homework.Module3.Task_3;
import java.util.Date;
public class Main {
    public static void main(String[] args) {
        Course ob01=new Course();
        ob01.setName("Mark");
        ob01.setHoursDuration(9999);
        ob01.setTeacherName("I know that you wath my code ^,^");
        Date startData=new Date(2024,12,7);

        Course ob2=new Course(startData,"Python");
        Course ob3=new Course(startData,"Java");
        Course ob4=new Course(345,"HTML","Beta");
        Course ob5=new Course(512,"JS","tu Vasa?");


        Student s1 = new Student("Karpus","Dimas",8);
        Student s2 = new Student("Nazarr","Ruslan",5);
        Student s3 = new Student("Dulda",new Course[]{ob2,ob3});
        Student s4 = new Student("Ratata",new Course[]{ob4,ob5});
        Student s5 = new Student();
        s5.setAge(23);
        s5.setCoursesTaken(new Course[]{ob2,ob01,ob4});
        s5.setFirstName("Boghdan");
        s5.setGroup(8);
        s5.setLastName("Kukaracha");

        CollegeStudent cs1=new CollegeStudent("sdgs","dhjd",6);
        CollegeStudent cs2=new CollegeStudent("asrhd",new Course[]{ob01,ob3});
        CollegeStudent cs3=new CollegeStudent("wefw",53,8376936646L);
        CollegeStudent cs4=new CollegeStudent("s","d",7);
        cs4.setCollegeName("Hogwarts");
        cs4.setRating(234);
        cs4.setId(234300768456L);

        SpecialStudent ss1=new SpecialStudent("fg","sadf",75);
        SpecialStudent ss2=new SpecialStudent("sadf",new Course[]{ob01,ob4});
        SpecialStudent ss3=new SpecialStudent(3458967L,"dsfg",624,3094876934L);
        SpecialStudent ss4=new SpecialStudent("sdf","werf",54);
        ss4.setSecretKey(234125L);
        ss4.setEmail("sad");

        //Print all
        System.out.println("\nCourse");
        System.out.println(ob01);
        System.out.println(ob2);
        System.out.println(ob3);
        System.out.println(ob4);
        System.out.println(ob5);

        System.out.println("\nStudent");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s5);

        System.out.println("\nCollege Student");
        System.out.println(cs1);
        System.out.println(cs2);
        System.out.println(cs3);
        System.out.println(cs4);

        System.out.println("\nSpecial Student");
        System.out.println(ss1);
        System.out.println(ss2);
        System.out.println(ss3);
        System.out.println(ss4);

    }
}
