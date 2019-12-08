package com.security.demospringsecurity.model;

import org.hibernate.annotations.NaturalId;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "room")
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @NaturalId
    @Column(length = 60)
    private RoomType roomType;

    @Enumerated(EnumType.STRING)
    @NaturalId
    @Column(length = 60)
    private RoomStatus roomStatus;

    @ManyToOne
    @JoinColumn(name = "hotel_id") // thông qua khóa ngoại hotel_id
    private Hotel hotel;

    public Hotel getHotel() {
        return hotel;
    }
    @ManyToOne
    @JoinColumn(name = "booking_id")
    private Booking booking;


    public Booking getBooking() {
        return booking;
    }

    public void setBooking(Booking booking) {
        this.booking = booking;
    }


    public Room(RoomType roomType, RoomStatus roomStatus, Hotel hotel) {
        this.roomType = roomType;
        this.roomStatus = roomStatus;
        this.hotel = hotel;
//        this.booking = booking;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public Room() {
    }


    public RoomType getRoomType() {
        return roomType;
    }

    public void setRoomType(RoomType roomType) {
        this.roomType = roomType;
    }

    public RoomStatus getRoomStatus() {
        return roomStatus;
    }

    public void setRoomStatus(RoomStatus roomStatus) {
        this.roomStatus = roomStatus;
    }
}
