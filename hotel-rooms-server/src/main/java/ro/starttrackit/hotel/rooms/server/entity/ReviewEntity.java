package ro.starttrackit.hotel.rooms.server.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

@Entity
@Table(name = "reviews")
@Getter
@Setter
@AllArgsConstructor
public class ReviewEntity{
    @Id
    @GeneratedValue
    private int id;
    private String message;
    @Min(1)
    @Max(5)
    private int rating;
    private String touristName;
    @ManyToOne
    private RoomEntity room;

    ReviewEntity(){}

    public ReviewEntity(String message, Integer rating, String touristName, RoomEntity room){
        this.message = message;
        this.rating = rating;
        this.touristName = touristName;
        this.room = room;
    }
}
