package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Taxi {

    @Id
    private Long id;
    private int cluster;

    private boolean isAvailable;

    private String serverID;

    private String provider;

    public Taxi(Long id, int cluster, boolean isAvailable) {
        this.id = id;
        this.cluster = cluster;
        this.isAvailable = isAvailable;
    }

    public Taxi() {
    }

    public String getServerID() {
        return serverID;
    }

    public void setServerID(String serverID) {
        this.serverID = serverID;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String hostname) {
        this.provider = hostname;
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
