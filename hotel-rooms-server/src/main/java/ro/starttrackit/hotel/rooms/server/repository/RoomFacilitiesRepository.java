package ro.starttrackit.hotel.rooms.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ro.starttrackit.hotel.rooms.server.entity.RoomFacilitiesEntity;

public interface RoomFacilitiesRepository extends JpaRepository<RoomFacilitiesEntity, Integer> {
}
