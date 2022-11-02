package com.example.demo.models;

import javax.persistence.*;
import java.util.Date;
@Entity
@Table(name = "chitateli")
public class Chitateli {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name, fam;
    private Double oklad;
    private Integer kolvostat;
    @Temporal(TemporalType.DATE)
    private Date denroj;

    private int views;

    public Chitateli(String name, String fam, Integer kolvostat, Date denroj, Double oklad) {
        this.name = name;
        this.fam = fam;
        this.kolvostat = kolvostat;
        this.denroj = denroj;
        this.oklad = oklad;
    }

    public Chitateli() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Double getOklad() {
        return oklad;
    }

    public void getOklad(Double oklad) {
        this.oklad = oklad;
    }



    public Date getDenroj() {
        return denroj;
    }

    public void setDenroj(Date denroj) {
        this.denroj = denroj;
    }

    public Integer getKolvostat() {
        return kolvostat;
    }

    public void setKolvostat(Integer kolvostat) {
        this.kolvostat = kolvostat;
    }
}
