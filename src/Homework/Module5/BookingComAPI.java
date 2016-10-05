package Homework.Module5;
import java.util.Date;
class BookingComAPI implements API {
    private Room rooms[];

    public BookingComAPI() {
        Room rb1=new Room(13451L,124,5,new Date(12,325,4),"IUGYAse","Mistoland");
        Room rb2=new Room(13451L,124,5,new Date(12,325,4),"IUGYAse","Mistoland");
        Room rb3=new Room(13451L,124,5,new Date(12,325,4),"IUGYAse","Mistoland");
        Room rb4=new Room(13451L,124,5,new Date(12,325,4),"IUGYAse","Mistoland");
        Room rb5=new Room(13451L,124,5,new Date(12,325,4),"IUGYAse","Mistoland");
        rooms=new Room[]{rb1,rb2,rb3,rb4,rb5};
    }

    @Override
    public Room[] findRooms(int prace, int persons, String city, String hotel) {
        Room foundRoom[]=new Room[10];
        int cout=0;
        for(Room item:rooms){
            boolean cvr=item.getPrice()==prace && item.getPersons()==persons;
            boolean cvr1= city==item.getCityName() && item.getHotelName()==hotel;
            if(cvr&&cvr1){
                foundRoom[cout]=item;
                cout++;
            }
        }
        return foundRoom;
    }

    public Room[] getRooms() {
        return rooms;
    }

    public void setRooms(Room[] rooms) {
        this.rooms = rooms;
    }
}
