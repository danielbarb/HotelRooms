package ro.starttrackit.hotel.rooms.server.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ro.starttrackit.hotel.rooms.server.entity.RoomEntity;
import ro.starttrackit.hotel.rooms.server.model.RoomFilter;
import ro.starttrackit.hotel.rooms.server.repository.RoomRepository;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class RoomService {
    private final RoomRepository roomRepository;

    public List<RoomEntity> getAll(RoomFilter filter){

        return roomRepository.findAll().stream()
                .filter(number -> filter.number() == null || number.getNumber() == filter.number())
                .filter(floor -> filter.floor() == null || floor.getFloor() == filter.floor())
                .filter(tv -> filter.tv() == null || tv.getRoomFacilities().isTv() == filter.tv().booleanValue())
                .filter(doubleBed-> filter.doubleBed() == null || doubleBed.getRoomFacilities().isDoubleBed() == filter.doubleBed().booleanValue())
                .filter(hotel-> filter.hotel()==null|| hotel.getHotelName() == filter.hotel())
                .toList();
    }

    public Optional<RoomEntity> getRoom(int roomNumber) {
        return  roomRepository.findById(roomNumber);
    }
}
