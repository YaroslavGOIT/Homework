package Homework.Module5;
public class Controller {
    private API apisk[]=new API[3];

    public Controller() {
        apisk[2]=new TripAdvisorAPI();
        apisk[0]=new BookingComAPI();
        apisk[1]=new GoogleAPI();

    }


    public Room[] requestRooms(int prace, int persons, String city, String hotel){
        Room[] rm2=apisk[0].findRooms(prace, persons, city, hotel);
        Room[] rm3=apisk[1].findRooms(prace, persons, city, hotel);
        Room[] rm1=apisk[2].findRooms(prace, persons, city, hotel);
        Room[] rms=new Room[rm1.length+rm2.length+rm3.length];

        int cout=0;
        for(int i=0;i<rm1.length;i++){
            rms[cout]=rm1[i];
            cout++;
        }

        for(int i=0;i<rm2.length;i++){
            rms[cout]=rm2[i];
            cout++;
        }

        for(int i=0;i<rm3.length;i++){
            rms[cout]=rm3[i];
            cout++;
        }


        return rms;
    }



    public Room[] check(API api1,API api2){
        Room[] komnata=api1.getRooms();
        Room[] komnata1=api2.getRooms();

        Room[] roomiks=new Room[/*komnata.length+komnata1.length*/1000];
        int count=0;
        for(int i=0;i<komnata.length;i++){
            for (int j=0;j<komnata1.length;j++){
                if(komnata[i].equals(komnata1[j])&&j!=i){
                    roomiks[count]=komnata[i];
                    count++;
                }
            }
        }
        roomiks=deleteEmptyUsers(roomiks);

        return roomiks;
    }
    private static Room[] deleteEmptyUsers(Room[] users){
        int count=0;
        for(Room user:users){
            if(user!=null)count++;
        }
        Room[] afterUser=new Room[count];
        count=0;
        for(Room user:users){
            if(user!=null){
                afterUser[count]=user;
                count++;
            }
        }
        return afterUser;
    }
}
