package com.security.demospringsecurity.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Collection;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "hotel")
public class Hotel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Size(min = 3,max =30)
    private String hotelName;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;
    @ManyToOne
    @JoinColumn(name = "address_id")
    private Address address;


    @OneToMany(mappedBy = "hotel",targetEntity = Room.class,cascade = CascadeType.ALL)
    private Set<Room> rooms;

    @OneToMany(mappedBy = "hotel",targetEntity = Facilities.class,cascade = CascadeType.ALL)
    private Set<Facilities> facilities;

    public Hotel(@NotBlank @Size(min = 3, max = 30) String hotelName, Address address, Set<Room> rooms, Set<Facilities> facilities, float rating) {
        this.hotelName = hotelName;
        this.address = address;
        this.rooms = rooms;
        this.facilities = facilities;
        this.rating = rating;
    }

    private float rating;

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public Hotel() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Collection<Room> getRooms() {
        return rooms;
    }

    public void setRooms(Set<Room> rooms) {
        this.rooms = rooms;
    }

    public Set<Facilities> getFacilities() {
        return facilities;
    }

    public void setFacilities(Set<Facilities> facilities) {
        this.facilities = facilities;
    }
}
