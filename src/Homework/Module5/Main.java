package Homework.Module5;

public class Main {
    public static void main(String[] args) {
        Controller cntrl=new Controller();
        loop(cntrl.requestRooms(124,5,"Mistoland","IUGYAse"));
        loop(cntrl.check(new BookingComAPI(),new GoogleAPI()));

    }

    static void loop(Room[] rooms) {
        for (Room elements : rooms) {
            if(elements!=null)
            System.out.println(elements);
        }
        System.out.println("===================================================================\n");
    }
}