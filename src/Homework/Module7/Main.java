package Homework.Module7;

import Homework.Module4.Currency;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main{
    public static void main(String[] args) {
        User us = new User(14124, "firstName", "lastName", "Los Angels", 9999999);
        User us2 = new User(24124, "firstName2", "lastName2", "Los Angels", 9999999);
        User us3 = new User(34124, "firstName3", "lastName3", "Los Angeles", 9999999);
        User us4 = new User(44124, "firstName4", "lastName4", "Los Angels", 9999999);
        User us5 = new User(54124, "firstName5", "lastName5", "Los Angeles", 9999999);
        User us6 = new User(64124, "firstName6", "lastName6", "Los Angels", 9999999);
        User us7 = new User(74124, "firstName7", "lastName7", "Los Angeles", 9999999);
        User us8 = new User(84124, "firstName8", "lastName8", "Los Angeles", 9999999);
        User us9 = new User(94124, "firstName9", "lastName9", "Los Angels", 9999999);
        User us10 = new User(10124, "firstName10", "lastName10", "Los Angel", 9999999);

        Order rdr = new Order(91000001, 100, Currency.USD, "item", "Magazin", us);
        Order rdr2 = new Order(70000002, 100, Currency.EUR, "item2", "Magazin2", us2);
        Order rdr3 = new Order(20000003, 100, Currency.USD, "item3", "Magazin3", us3);
        Order rdr4 = new Order(60000004, 100, Currency.EUR, "item4", "Magazin4", us4);
        Order rdr5 = new Order(30000005, 100, Currency.USD, "item5", "Magazin5", us5);
        Order rdr6 = new Order(10000006, 100, Currency.EUR, "item6", "Magazin6", us6);
        Order rdr7 = new Order(10000007, 100, Currency.USD, "item7", "Magazin7", us7);
        Order rdr8 = new Order(10000008, 100, Currency.EUR, "item8", "Magazin8", us8);
        Order rdr9 = new Order(10000009, 100, Currency.USD, "item9", "Magazin9", us9);
        Order rdr10 = new Order(70040010, 100, Currency.EUR, "item10", "Magazin10", us10);

        List<Order> listOfOrder=new ArrayList<>();
        listOfOrder.add(rdr);
        listOfOrder.add(rdr2);
        listOfOrder.add(rdr3);
        listOfOrder.add(rdr4);
        listOfOrder.add(rdr5);
        listOfOrder.add(rdr6);
        listOfOrder.add(rdr7);
        listOfOrder.add(rdr8);
        listOfOrder.add(rdr9);
        listOfOrder.add(rdr10);

        System.out.println(listOfOrder);

        listOfOrder.sort(new Comparator<Order>() {
            @Override
            public int compare(Order o1, Order o2) {
                return 0;
            }
        });
    }
}
