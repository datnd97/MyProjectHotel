package com.security.demospringsecurity.model;

import javax.persistence.*;
import java.util.Date;
import java.util.Locale;
import java.util.Set;
import java.time.LocalDate;

@Entity
@Table(name = "booking")
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long bookingId;
    private Long userId;
    private Long hotelId;

    public Set<Room> getRooms() {
        return rooms;
    }

    public void setRooms(Set<Room> rooms) {
        this.rooms = rooms;
    }

    @OneToMany(mappedBy = "booking",cascade = CascadeType.ALL)
    private Set<Room> rooms;

    @Column(name = "start_date")
    private LocalDate startDate;

    @Column(name="start_end")
    private LocalDate endDate;

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public Booking(Long userId, Long hotelId, Set<Room> rooms, LocalDate startDate, LocalDate endDate, int amount) {
        this.userId = userId;
        this.hotelId = hotelId;
        this.rooms = rooms;
        this.startDate = startDate;
        this.endDate = endDate;
        this.amount = amount;
    }

    private int amount;

    public Long getBookingId() {
        return bookingId;
    }

    public void setBookingId(Long bookingId) {
        this.bookingId = bookingId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getHotelId() {
        return hotelId;
    }

    public void setHotelId(Long hotelId) {
        this.hotelId = hotelId;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }



}
