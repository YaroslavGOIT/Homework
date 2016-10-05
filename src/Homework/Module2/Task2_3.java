package Homework.Module2;
public class Task2_3 {
    public static void main(String[] args) {
        String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane","Candy"};
        //цикыл который выводит строку из метода bank
        for (int x = 0; x < ownerNames.length; x++)
            System.out.println(ownerNames[x] + " " + Task2_2.bank(Task2_2.balancesOfUsers[x], Task2_2.commision, Task2_2.withdrawals[x]));
    }
}
