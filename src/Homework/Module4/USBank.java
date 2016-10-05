package Homework.Module4;

public class USBank extends Bank {

    public USBank(long id, Currency currency, int numberOfEmployee, double avrSalaryOfEmploee, long rating, long totalCapital) {
        super(id, currency, numberOfEmployee, avrSalaryOfEmploee, rating, totalCapital);
    }



    @Override
    int getLimitOfWithdrawal() {
        short limitW=0;
        if(this.getCurrency()==Currency.USD)limitW = 1000;
        if(this.getCurrency()==Currency.EUR)limitW = 1200;
        return limitW;
    }

    @Override
    int getLimitOfFunding() {
        int limitF=0;
        if(this.getCurrency()==Currency.USD)limitF = 2147483647;
        if(this.getCurrency()==Currency.EUR)limitF = 10000;
        return limitF;
    }

    @Override
    int getMonthlyRate() {
        int monthlyRate=0;
        if(this.getCurrency()==Currency.USD)monthlyRate=10;
        if(this.getCurrency()==Currency.EUR)monthlyRate=15;
        return monthlyRate;
    }

    @Override
    int getCommision(double withdraw) {
        int commision=0;
        if(this.getCurrency()==Currency.USD){
            if(withdraw<=1000)commision=50;
            else commision=70;
        }
        if(this.getCurrency()==Currency.EUR){
            if(withdraw<=1000)commision=60;
            else commision=80;
        }
        return commision;
    }
}