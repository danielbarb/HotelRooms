package ro.starttrackit.hotel.rooms.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ro.starttrackit.hotel.rooms.server.entity.RoomEntity;

public interface RoomRepository extends JpaRepository<RoomEntity, Integer> {
}
