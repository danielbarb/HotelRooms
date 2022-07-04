package ro.starttrackit.hotel.rooms.server.controller;

import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ro.starttrackit.hotel.rooms.server.entity.RoomEntity;
import ro.starttrackit.hotel.rooms.server.model.RoomFilter;
import ro.starttrackit.hotel.rooms.server.service.RoomService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("rooms")
@RequiredArgsConstructor
public class RoomController {
    private final RoomService roomService;

    @GetMapping
    List<RoomEntity> getAll(RoomFilter filter){
        return roomService.getAll(filter);
    }
    @GetMapping("{roomNumber}")
    Optional<RoomEntity> getOne(@PathVariable int roomNumber) {
        return roomService.getRoom(roomNumber);
    }

}
