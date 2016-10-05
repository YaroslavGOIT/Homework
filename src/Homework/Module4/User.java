package Homework.Module4;

public class User {
    private long id;
    private String name;
    private double balance;
    private int monthsOfEmployment;
    private String companyName;
    private int salary;
    private Bank bank;
    private int monthOfPaidMoney;

    public User(long id, String name, double balance, int monthsOfEmployment, String companyName, int salary, Bank bank,int monthOfPaidMoney) {
        this.id = id;
        this.name = name;
        this.balance = balance;
        this.monthsOfEmployment = monthsOfEmployment;
        this.companyName = companyName;
        this.salary = salary;
        this.bank = bank;
        this.monthOfPaidMoney=monthOfPaidMoney;
    }

    public int getMonthOfPaidMoney() {
        return monthOfPaidMoney;
    }

    public void setMonthOfPaidMoney(int monthOfPaidMoney) {
        this.monthOfPaidMoney = monthOfPaidMoney;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public int getMonthsOfEmployment() {
        return monthsOfEmployment;
    }

    public String getCompanyName() {
        return companyName;
    }

    public int getSalary() {
        return salary;
    }

    public Bank getBank() {
        return bank;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                ", monthsOfEmployment=" + monthsOfEmployment +
                ", companyName='" + companyName + '\'' +
                ", salary=" + salary +
                ", bank=" + bank +
                ", MonthOfPaidMoney="+monthOfPaidMoney+
                '}';
    }
}
