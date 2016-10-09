package Homework.Module5;

import java.util.List;

public interface API {
    abstract List<Room> findRooms(int prace, int persons, String city, String hotel);
    public List<Room> getRooms();
    public boolean equals(Object o);
}
