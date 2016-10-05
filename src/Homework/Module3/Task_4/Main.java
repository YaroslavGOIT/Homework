package Homework.Module3.Task_4;

public class Main {
    public void main(String[] args) {
        User kolasic = new User("Kolia",3456,7,"Kirolavka",-76534,"jfg");//щутеечка :)
        System.out.println(kolasic.paySalary());
        System.out.println(kolasic.withdraw(367));
        System.out.println(kolasic.companyNameLength());
        System.out.println(kolasic.monthIncreaser(6));
    }
}
