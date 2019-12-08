package com.security.demospringsecurity.model;

import javax.persistence.*;

@Entity
@Table(name = "facilities")
public class Facilities {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Facility facility;

    @ManyToOne
    @JoinColumn(name = "hotel_id")
    private Hotel hotel;

    public Facilities() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Facility getFacility() {
        return facility;
    }

    public void setFacility(Facility facility) {
        this.facility = facility;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }
}
