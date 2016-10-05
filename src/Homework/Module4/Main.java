
/** I can't run class  **/

package Homework.Module4;
public class Main {


    public static void main(String[] args) {
        Bank bank1=new USBank(2346L,Currency.valueOf("USD"),453,2345.0,24562L,43562345L);
        Bank bank2=new USBank(2346L,Currency.valueOf("EUR"),453,2345.0,24562L,43562345L);

        Bank bank3=new EUBank(2346L,Currency.valueOf("USD"),453,2345.0,24562L,43562345L);
        Bank bank4=new EUBank(2346L,Currency.valueOf("EUR"),453,2345.0,24562L,43562345L);

        Bank bank5=new ChinaBank(2346L,Currency.valueOf("USD"),453,2345.0,24562L,43562345L);
        Bank bank6=new ChinaBank(2346L,Currency.valueOf("EUR"),453,2345.0,24562L,43562345L);


        User user1=new User(234626L,"Vasa Pupkin",2345,7,"ryea",643,bank1,5);
        User user2=new User(234626L,"Vasa Pupkin",2345,7,"ryea",643,bank2,5);

        User user3=new User(234626L,"Vasa Pupkin",2345,7,"ryea",643,bank3,5);
        User user4=new User(234626L,"Vasa Pupkin",2345,7,"ryea",643,bank4,5);

        User user5=new User(234626L,"Vasa Pupkin",2345,7,"ryea",643,bank5,5);
        User user6=new User(234626L,"Vasa Pupkin",2345,7,"ryea",643,bank6,5);
        System.out.println(user1);
        System.out.println(user2);
        System.out.println(user3);
        System.out.println(user4);
        System.out.println(user5);
        System.out.println(user6 +"\n\n");

        BankSystemImpl bankSystemImpl=new BankSystemImpl();
        bankSystemImpl.withdrawOfUser(user1,34);
        bankSystemImpl.fundUser(user2,1523);
        bankSystemImpl.transferMoney(user3,user4,1342);
        bankSystemImpl.paySalary(user5);

        System.out.println(user1);
        System.out.println(user2);
        System.out.println(user3);
        System.out.println(user4);
        System.out.println(user5);
    }

}
