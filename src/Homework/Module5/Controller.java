package Homework.Module5;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    private API apisk[]=new API[3];

    public Controller() {
        apisk[2]=new TripAdvisorAPI();
        apisk[0]=new BookingComAPI();
        apisk[1]=new GoogleAPI();

    }

    /**-------------------------------------------------------------------*/
    public List<Room> requestRooms(int prace, int persons, String city, String hotel){
        List<Room> rm2=apisk[0].findRooms(prace, persons, city, hotel);
        List<Room> rm3=apisk[1].findRooms(prace, persons, city, hotel);
        List<Room> rm1=apisk[2].findRooms(prace, persons, city, hotel);
        List<Room> rms=new ArrayList<>();

        ffor(rm1,rms);
        ffor(rm2,rms);
        ffor(rm3,rms);

        return rms;
    }

    private List<Room> ffor(List<Room> getFor,List<Room> finish){
        for(Room room:getFor){
            finish.add(room);
        }
        return finish;
    }
    /**-------------------------------------------------------------------*/

    public List<Room> check(API api1,API api2){
        List<Room> komnata=api1.getRooms();
        List<Room> komnata1=api2.getRooms();
        List<Room> roomiks=new ArrayList<>();

        for(Room komnata01:komnata) {
            for (Room komnata02 : komnata1) {
                if(komnata01.equals(komnata02)){
                    roomiks.add(komnata01);
                }
            }
        }

        return roomiks;
    }

}
