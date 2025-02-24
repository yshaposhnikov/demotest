package com.example.demo.persistence;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class knihaEntity {

    @Id
    @GeneratedValue
    private int id;
    private String nazov;
    private String autor;
    private int pocetStran;

    public knihaEntity(String nazov, String autor, int pocetStran) {
        this.nazov = nazov;
        this.autor = autor;
        this.pocetStran = pocetStran;

    }

    public String getNazov() {
        return nazov;
    }

    public void setNazov(String nazov) {
        this.nazov = nazov;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getPocetStran() {
        return pocetStran;
    }

    public void setPocetStran(int pocetStran) {
        this.pocetStran = pocetStran;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
