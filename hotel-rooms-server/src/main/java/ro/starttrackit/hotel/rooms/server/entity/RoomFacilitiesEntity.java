package ro.starttrackit.hotel.rooms.server.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
@Entity
@Table(name = "facilities")
@Getter
@Setter
@AllArgsConstructor
public class RoomFacilitiesEntity{
    @Id
    @GeneratedValue
    private int id;
    private boolean tv;
    private boolean doubleBed;

    RoomFacilitiesEntity() {}

    public RoomFacilitiesEntity(boolean tv, boolean doubleBed){
        this.tv = tv;
        this.doubleBed = doubleBed;
    }
    //@OneToOne
    //private RoomEntity roomEntity;
}
