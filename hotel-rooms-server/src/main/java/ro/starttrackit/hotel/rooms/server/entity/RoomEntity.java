package ro.starttrackit.hotel.rooms.server.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "rooms")
@Getter
@Setter
@With
@Builder
@AllArgsConstructor
public class RoomEntity {
    @Id
    @GeneratedValue
    private int id;
    private int number;
    private int floor;
    private String hotelName;

    RoomEntity(){}

    public RoomEntity(int number, int floor, String hotelName, RoomFacilitiesEntity roomFacilities){
        this.number = number;
        this.floor = floor;
        this.hotelName = hotelName;
        this.roomFacilities = roomFacilities;
    }
    @OneToOne
    private RoomFacilitiesEntity roomFacilities;
}
