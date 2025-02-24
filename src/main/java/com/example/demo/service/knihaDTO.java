package com.example.demo.service;



public class knihaDTO {

    private String nazov;
    private String autor;
    private int pocetStran;

    public knihaDTO(String nazov, String autor, int pocetStran) {
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
}
