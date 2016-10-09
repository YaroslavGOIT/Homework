package Homework.Module7;

import Homework.Module4.Currency;
import java.util.*;

public class Main_Task7_3 {
    public static void main(String[] args) {
        User us = new User(14124, "firstName", "lastName", "Los Angels", 9999999);
        User us2 = new User(24124, "firstName2", "lastName2", "Los Angels", 9999999);
        User us3 = new User(34124, "firstName3", "lastName3", "Los Angeles", 9999999);
        User us4 = new User(44124, "firstName4", "lastName4", "Los Angels", 9999999);
        User us5 = new User(54124, "firstName5", "lastName5", "Los Angeles", 9999999);
        User us7 = new User(74124, "firstName7", "lastName7", "Los Angeles", 9999999);
        User us8 = new User(84124, "firstName8", "lastName8", "Los Angeles", 9999999);
        User us9 = new User(94124, "firstName9", "lastName9", "Los Angels", 9999999);
        User us10 = new User(10124, "firstName10", "lastName10", "Los Angel", 9999999);

        Order rdr = new Order(91000001, 10, Currency.USD, "item", "Magazin", us);
        Order rdr2 = new Order(70000002, 900, Currency.EUR, "item2", "Magazin2", us2);
        Order rdr3 = new Order(20000003, 800, Currency.USD, "item3", "Magazin3", us3);
        Order rdr4 = new Order(60000004, 700, Currency.EUR, "item4", "Magazin4", us4);
        Order rdr5 = new Order(30000005, 400, Currency.USD, "item5", "Magazin5", us5);
        Order rdr6 = new Order(70000002, 900, Currency.EUR, "item2", "Magazin2", us2);
        Order rdr7 = new Order(10000007, 300, Currency.USD, "item7", "Magazin7", us7);
        Order rdr8 = new Order(10000008, 500, Currency.EUR, "item8", "Magazin8", us8);
        Order rdr9 = new Order(10000009, 200, Currency.USD, "item9", "Magazin9", us9);
        Order rdr10 = new Order(70040010, 100, Currency.EUR, "item10", "Magazin10", us10);

        Set<Order> setList=new TreeSet<>((o1, o2) -> o1.getPrice() - o2.getPrice());
        setList.add(rdr);
        setList.add(rdr2);
        setList.add(rdr3);
        setList.add(rdr4);
        setList.add(rdr5);
        setList.add(rdr6);
        setList.add(rdr7);
        setList.add(rdr8);
        setList.add(rdr9);
        setList.add(rdr10);


        //int kek=(int) setList.stream().filter(x -> (x.getUser().getLastName().equals("Petrov"))).count();
        int kek=0;
        for(Order list:setList){
            if(list.getUser().getCity().contains("Petrov")){
                kek++;
            }
        }
        if(kek>1) System.out.println("Found "+kek+" users with second name Petrov");
        if(kek==1) System.out.println("Found "+kek+" user with second name Petrov");
        if(kek<1) System.out.println("Didin't find users with second name Petrov");


        Set<Order> OrderWithMaxPrice=new TreeSet<>(((o1, o2) -> (o1.getPrice()-o2.getPrice())));
        OrderWithMaxPrice.add(maxPrice(setList));
        System.out.println(OrderWithMaxPrice);

        Iterator<Order> iter=setList.iterator();
        while(iter.hasNext()){
            if(iter.next().getCurrency()==Currency.USD){
                iter.remove();
            }
        }
        System.out.println(setList);
    }
    private static Order maxPrice(Set<Order> d){
        Order[] ord=new Order[1];
        int x=0;
        for (Order order:d){
            if(order.getPrice()>x){
                x=order.getPrice();
                ord[0]=order;
            }
        }
        Order order=ord[0];
        return order;
    }
}
