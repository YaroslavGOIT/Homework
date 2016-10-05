package Homework.Module5;

interface DAO {
    void save(Room room);
    boolean delete(Room room);
    Room update(Room room);
    Room findById(long id);
}
