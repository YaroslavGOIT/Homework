package Homework.Module4;

public class BankSystemImpl implements BankSystem {
    @Override
    public void withdrawOfUser(User user, int amount) {
        double commision=amount/ 1000 * user.getBank().getCommision(amount);
        if(user.getBank().getLimitOfWithdrawal()>=amount && (user.getBalance()+user.getBank().getCommision(amount))>=amount){
            user.setBalance(user.getBalance()-(commision+amount));
        }
    }

    @Override
    public void fundUser(User user, int amount) {
        double commision=amount/ 1000 * user.getBank().getCommision(amount);
        if(user.getBank().getLimitOfFunding()>=amount){
            user.setBalance(user.getBalance()+amount-commision);
        }
    }

    @Override
    public void transferMoney(User fromUser, User toUser, int amount) {
        double commision=amount/ 1000 * fromUser.getBank().getCommision(amount);
        if(fromUser.getBalance()+commision>=amount) {
            fromUser.setBalance(fromUser.getBalance() - amount-commision);
            toUser.setBalance(toUser.getBalance() + amount);
        }
    }

    @Override
    public void paySalary(User user) {
        int getFromMonth=user.getMonthsOfEmployment()-user.getMonthOfPaidMoney();
        double money=getFromMonth*user.getSalary();
        user.setMonthOfPaidMoney(user.getMonthsOfEmployment()+getFromMonth);
        double commision=money/ 1000 * user.getBank().getCommision(money);
        user.setBalance(user.getBalance()+money-commision);
    }
}
