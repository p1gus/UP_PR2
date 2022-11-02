package com.example.demo.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@Entity
@Table(name = "posts")
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String title, full_text;
    private Double cenastat;
    private Float hours;
    @Temporal(TemporalType.DATE)
    private Date datavihoda;

    private int views;

    public Post(String title, Date datavihoda, String full_text, Double cenastat, Float hours) {
        this.title = title;
        this.datavihoda = datavihoda;
        this.full_text = full_text;
        this.cenastat = cenastat;
        this.hours = hours;
    }

    public Post() {}

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFull_text() {
        return full_text;
    }

    public void setFull_text(String full_text) {
        this.full_text = full_text;
    }

    public int getViews() {
        return this.views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public Date getDatavihoda() {
        return datavihoda;
    }

    public void setDatavihoda(Date datavihoda) {
        this.datavihoda = datavihoda;
    }

    public Double getCenastat() {
        return cenastat;
    }

    public void setCenastat(Double cenastat) {
        this.cenastat = cenastat;
    }

    public void setHours(Float hours) {
        this.hours = hours;
    }
    public Float getHours() {
        return hours;
    }
}
