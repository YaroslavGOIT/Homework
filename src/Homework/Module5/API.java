package Homework.Module5;

public interface API {
    abstract Room[] findRooms(int prace,int persons,String city,String hotel);

    Room[] getRooms();
}
