package ro.starttrackit.hotel.rooms.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ro.starttrackit.hotel.rooms.server.entity.ReviewEntity;

public interface ReviewRepository extends JpaRepository<ReviewEntity, Integer> {
}
