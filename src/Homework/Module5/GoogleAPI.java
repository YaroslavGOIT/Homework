package Homework.Module5;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class GoogleAPI implements API {
    private List<Room> rooms = new ArrayList<>();

    GoogleAPI() {
        Room rt1 = new Room(13451L, 124, 5, new Date(12, 325, 4), "IUGYdse", "Mistoland");
        Room rt2 = new Room(13451L, 114, 5, new Date(12, 325, 4), "IUGYAse", "Mistoland");
        Room rt3 = new Room(13451L, 1904, 5, new Date(12, 325, 4), "IUGYAse", "Mistoland");
        Room rt4 = new Room(13451L, 124, 5, new Date(12, 325, 4), "IUGYAse", "Mistoland");
        Room rt5 = new Room(13451L, 164, 5, new Date(12, 325, 4), "IUGYAse", "Mistoland");

        rooms.add(rt1);
        rooms.add(rt2);
        rooms.add(rt3);
        rooms.add(rt4);
        rooms.add(rt5);
    }

    @Override
    public List<Room> findRooms(int prace, int persons, String city, String hotel) {
        List<Room> findRooms=new ArrayList<>();
        for(Room item:rooms){
            boolean cvr=item.getPrice()==prace && item.getPersons()==persons;
            boolean cvr1= city==item.getCityName() && item.getHotelName()==hotel;
            if(cvr&&cvr1){
                findRooms.add(item);
            }
        }
        return findRooms;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if(o == null /*|| getClass() != o.getClass()*/) return false;

        GoogleAPI googleAPI = (GoogleAPI) o;

        return rooms != null ? rooms.equals(googleAPI.rooms) : googleAPI.rooms == null;

    }

    @Override
    public int hashCode() {
        return rooms != null ? rooms.hashCode() : 0;
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }
}
