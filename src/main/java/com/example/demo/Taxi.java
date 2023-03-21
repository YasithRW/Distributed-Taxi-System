package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Taxi {

    @Id
    private Long id;
    private int cluster;

    private boolean isAvailable;

    public Taxi(Long id, int cluster, boolean isAvailable) {
        this.id = id;
        this.cluster = cluster;
        this.isAvailable = isAvailable;
    }

    public Taxi() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getCluster() {
        return cluster;
    }

    public void setCluster(int cluster) {
        this.cluster = cluster;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}
