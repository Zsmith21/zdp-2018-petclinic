package edu.springframework.zdppetclinic.model;

import java.time.LocalDate;

public class Pet extends BaseEntity{

    public PetType getPetType() {
        return petType;
    }

    public void setPetType(PetType petType) {
        this.petType = petType;
    }

    public Owner getMyOwner() {
        return myOwner;
    }

    public void setMyOwner(Owner myOwner) {
        this.myOwner = myOwner;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    private PetType petType;
    private Owner myOwner;
    private LocalDate date;
}
