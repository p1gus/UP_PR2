package com.example.demo.models;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "jornalists")
public class Jornalists {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name, fam ;
    private Double cena;
    private Integer kolvastat;
    @Temporal(TemporalType.DATE)
    private Date denroj;

    private int views;

    public Jornalists(String name, String fam, Integer kolvastat, Date denroj, Double cena) {
        this.name = name;
        this.fam = fam;
        this.kolvastat = kolvastat;
        this.denroj = denroj;
        this.cena = cena;
    }

    public Jornalists() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFam() {
        return fam;
    }

    public void setFam(String fam) {
        this.fam = fam;
    }

    public Double getCena() {
        return cena;
    }

    public void getCena(Double cena) {
        this.cena = cena;
    }

    public Integer getKolvastat() {
        return kolvastat;
    }

    public void setKolvastat(Integer kolvastat) {
        this.kolvastat = kolvastat;
    }

    public Date getDenroj() {
        return denroj;
    }
    public void setDenroj(Date denroj) {
        this.denroj = denroj;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}


