package ro.starttrackit.hotel.rooms.server.loader;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import ro.starttrackit.hotel.rooms.server.entity.ReviewEntity;
import ro.starttrackit.hotel.rooms.server.entity.RoomEntity;
import ro.starttrackit.hotel.rooms.server.entity.RoomFacilitiesEntity;

import ro.starttrackit.hotel.rooms.server.repository.ReviewRepository;
import ro.starttrackit.hotel.rooms.server.repository.RoomFacilitiesRepository;
import ro.starttrackit.hotel.rooms.server.repository.RoomRepository;

import java.util.List;

@Slf4j
@Component
@RequiredArgsConstructor
public class DataLoader implements CommandLineRunner {

    private final RoomRepository roomRepository;
    private final RoomFacilitiesRepository repoRoomFaciliti;
    private final ReviewRepository reviewRepository;


    @Override
    public void run(String... args) {

        //var roomFacilitiesEntity = roomFacilitiRepository.save(new RoomFacilitiesEntity(true,true));

        List<RoomEntity> roomsData = roomRepository.saveAll(List.of(
                //new RoomEntity(10, 1, "Minerva"),
                //new RoomEntity(11, 1, "Minerva"),
                //new RoomEntity(12, 1, "Minerva"),
                //new RoomEntity(13, 1, "Minerva"),
                //new RoomEntity(14, 1, "Minerva"),
                //new RoomEntity(15, 1, "Minerva"),
                //new RoomEntity(16, 1, "Minerva")
                RoomEntity.builder()
                        .number(10)
                        .floor(1)
                        .hotelName("Minerva")
                        .roomFacilities(repoRoomFaciliti.save(new RoomFacilitiesEntity(true,false)))
                        .build(),
                RoomEntity.builder()
                        .number(11)
                        .floor(1)
                        .hotelName("Minerva")
                        .roomFacilities(repoRoomFaciliti.save(new RoomFacilitiesEntity(true,false)))
                        .build(),
                RoomEntity.builder()
                        .number(12)
                        .floor(1)
                        .hotelName("Minerva")
                        .roomFacilities(repoRoomFaciliti.save(new RoomFacilitiesEntity(true,true)))
                        .build(),
                RoomEntity.builder()
                        .number(13)
                        .floor(1)
                        .hotelName("Minerva")
                        .roomFacilities(repoRoomFaciliti.save(new RoomFacilitiesEntity(true,true)))
                        .build(),
                RoomEntity.builder()
                        .number(14)
                        .floor(1)
                        .hotelName("Minerva")
                        .roomFacilities(repoRoomFaciliti.save(new RoomFacilitiesEntity(true,true)))
                        .build(),
                RoomEntity.builder()
                        .number(16)
                        .floor(1)
                        .hotelName("Minerva")
                        .roomFacilities(repoRoomFaciliti.save(new RoomFacilitiesEntity(false,true)))
                        .build()
        ));
        //
        List<ReviewEntity> reviewData = reviewRepository.saveAll(List.of(
                new ReviewEntity("Bun", 4, "Georgel", roomsData.get(0)),
                new ReviewEntity("Foarte bun", 5, "Aurelia", roomsData.get(0)),
                new ReviewEntity("Acceptabil", 2, "Gheorghe", roomsData.get(0)),
                new ReviewEntity("Bad", 1, "Anabel", roomsData.get(0))
        ));

    }
}
