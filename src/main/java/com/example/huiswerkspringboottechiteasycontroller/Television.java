package com.example.huiswerkspringboottechiteasycontroller;
//
//import jakarta.persistence.Entity;
//import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//@Entity
@Getter
@Setter
@AllArgsConstructor // constructor met alles
@NoArgsConstructor // constructor zonder argumenten
        // er bestaat ook eentje met required argumenten
public class Television {
    String name;
    String brand;
    long id;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
