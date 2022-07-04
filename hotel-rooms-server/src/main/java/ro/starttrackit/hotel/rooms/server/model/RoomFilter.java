package ro.starttrackit.hotel.rooms.server.model;

public record RoomFilter(

    Integer number,
    Integer floor,
    String hotel,
    Boolean tv,
    Boolean doubleBed){

}
