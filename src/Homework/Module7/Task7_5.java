package Homework.Module7;

import java.util.*;

import static Homework.Module6.UserUtils.generatorInt;
import static Homework.Module6.UserUtils.generatorString;

public class Task7_5 {
    public static void main(String[] args) {
        List<Integer> integers=new ArrayList<>();
        List<String> strings=new LinkedList<>();



        System.out.println("Time of integers\n");
        //add();
        System.out.print("add():   ");
        double start01= System.currentTimeMillis();
        for(int integer=0;integer<1000;integer++){integers.add(generatorInt());}
        double finish01=System.currentTimeMillis();
        System.out.println(finish01-start01);
        //set();
        System.out.print("set():    ");
        double start02= System.currentTimeMillis();
        for(int integer=0;integer<1000;integer++){integers.set(integer,generatorInt());}
        double finish02=System.currentTimeMillis();
        System.out.println(finish02-start02);
        //get();
        System.out.print("get():    ");
        int x=0;
        double start03= System.currentTimeMillis();
        for(int integer=0;integer<1000;integer++){x=integers.get(integer);}
        double finish03=System.currentTimeMillis();
        System.out.println(finish03-start03);
        //remove();
        System.out.print("remove():    ");
        double start04= System.currentTimeMillis();
        for(int integer=0;integer<1000;integer++){integers.remove(0);}
        double finish04=System.currentTimeMillis();
        System.out.println(finish04-start04);



        System.out.println("\n\n\nTime of strings\n");
        //add();
        System.out.print("add():   ");
        double start11= System.currentTimeMillis();
        for(int string=0;string<10000;string++){strings.add(generatorString());}
        double finish11=System.currentTimeMillis();
        System.out.println(finish11-start11);
        //set();
        System.out.print("set():    ");
        double start12= System.currentTimeMillis();
        for(int string=0;string<10000;string++){strings.set(string,generatorString());}
        double finish12=System.currentTimeMillis();
        System.out.println(finish12-start12);
        //get();
        System.out.print("get():    ");
        double start13= System.currentTimeMillis();
        String strin="";
        for(int string=0;string<1000;string++){strin=strings.get(string);}
        double finish13=System.currentTimeMillis();
        System.out.println(finish13-start13);
        //remove();
        System.out.print("remove():    ");
        double start14= System.currentTimeMillis();
        for(int string=0;string<1000;string++){strings.remove(0);}
        double finish14=System.currentTimeMillis();
        System.out.println(finish14-start14);



    }
}
