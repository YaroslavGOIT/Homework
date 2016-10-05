package Homework.Module4;

public class EUBank extends Bank {
    public EUBank(long id, Currency currency, int numberOfEmployee, double avrSalaryOfEmploee, long rating, long totalCapital) {
        super(id, currency, numberOfEmployee, avrSalaryOfEmploee, rating, totalCapital);
    }



    @Override
    int getLimitOfWithdrawal() {
        short limitW=0;
        if(this.getCurrency()==Currency.USD)limitW = 2000;
        if(this.getCurrency()==Currency.EUR)limitW = 2200;
        return limitW;
    }

    @Override
    int getLimitOfFunding() {
        int limitF=0;
        if(this.getCurrency()==Currency.USD)limitF = 10000;
        if(this.getCurrency()==Currency.EUR)limitF = 20000;
        return limitF;
    }

    @Override
    int getMonthlyRate() {
        int monthlyRate=0;
        if(this.getCurrency()==Currency.USD)monthlyRate=0;
        if(this.getCurrency()==Currency.EUR)monthlyRate=10;
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
            if(withdraw<=1000)commision=20;
            else commision=40;
        }
        return commision;
    }
}
