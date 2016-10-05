package Homework.Module4;
public abstract class Bank {
    private long id;
    private Currency currency;
    private int numberOfEmployee;
    private double avrSalaryOfEmploee;
    private long rating;
    private long totalCapital;


    abstract int getLimitOfWithdrawal();
    abstract int getLimitOfFunding();
    abstract int getMonthlyRate();
    abstract int getCommision(double withdraw);

    double moneyPaidMonthlyForSalary() {
        return 0;
    }

    public Bank(long id, Currency currency, int numberOfEmployee, double avrSalaryOfEmploee, long rating, long totalCapital) {
        this.id = id;
        this.currency = currency;
        this.numberOfEmployee = numberOfEmployee;
        this.avrSalaryOfEmploee = avrSalaryOfEmploee;
        this.rating = rating;
        this.totalCapital = totalCapital;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public int getNumberOfEmployee() {
        return numberOfEmployee;
    }

    public void setNumberOfEmployee(int numberOfEmployee) {
        this.numberOfEmployee = numberOfEmployee;
    }

    public double getAvrSalaryOfEmploee() {
        return avrSalaryOfEmploee;
    }

    public void setAvrSalaryOfEmploee(double avrSalaryOfEmploee) {
        this.avrSalaryOfEmploee = avrSalaryOfEmploee;
    }

    public long getRating() {
        return rating;
    }

    public void setRating(long rating) {
        this.rating = rating;
    }

    public long getTotalCapital() {
        return totalCapital;
    }

    public void setTotalCapital(long totalCapital) {
        this.totalCapital = totalCapital;
    }
}
