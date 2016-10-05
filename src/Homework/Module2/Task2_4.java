package Homework.Module2;
public class Task2_4 {
    public static void main(String[] args){
        double[] balancesOfUsers = {123.0, 543.23, 782.0, 461.0, 725.6203, 154.245, 2627.0};
        String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane","Candy"};
        double[] addMoney={13.09,345.56,234.356,756.0,234.0,653.56,945.0};
        for(short x=0;x<ownerNames.length;x++) {
            double afterAdd=balancesOfUsers[x] + addMoney[x];
            System.out.println(ownerNames[x] + ", you send to bank " + addMoney[x] + "$ " + "and you having " + afterAdd + "$ " + "now.");
        }
    }
}
