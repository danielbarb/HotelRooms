package ro.starttrackit.hotel.rooms.server.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cleanup")
@Getter
@Setter
@AllArgsConstructor
public class CleanupEntity {

    @Id
    @GeneratedValue
    private int id;

}
