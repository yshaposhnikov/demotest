package com.example.demo.service;



public class KnihaDTO {
    private Long id;
    private String nazov;
    private String autor;
    private int pocetStran;

    public KnihaDTO(Long id, String nazov, String autor, int pocetStran) {
        this.id = id;
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
