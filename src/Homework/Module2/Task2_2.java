package Homework.Module2;
public class Task2_2 {
    static double[] balancesOfUsers = {100.0, 543.23, 782.0, 461.0, 725.6203, 154.245, 2627.0};
    static double[] withdrawals = {95.0, 654.5, 234.0, 13.0, 2435.452, 847.95, 1.6};
    static double commision = 5;
    public static void main(String[] args) {
        for (int x = 0; x < balancesOfUsers.length; x++) { //цикыл который выводит строку из метода bank
            System.out.println(bank(balancesOfUsers[x], commision, withdrawals[x]));
        }
    }
    static String bank(double balances, double comision, double withdrawal){
        String bank;
        double x=balances -((withdrawal / 100 * comision)+withdrawal);
        if (withdrawal<=balances && x>=0)
            bank = "OK " + (withdrawal / 100 * comision) + " " + x;
        else bank = "NO";
        return bank;
    }
}