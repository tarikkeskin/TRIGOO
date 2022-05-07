package com.trigoo.trigoo.Entity;

import java.io.Serializable;

public class Tractor implements Serializable {
    private int tractor_id;
    private String tractor_name;
    private String owner_name;
    private String tractor_image;
    private boolean tractor_active;
    private String location;

    public Tractor() {
    }

    public Tractor(int tractor_id, String tractor_name, String owner_name, String tractor_image, boolean tractor_active, String location) {
        this.tractor_id = tractor_id;
        this.tractor_name = tractor_name;
        this.owner_name = owner_name;
        this.tractor_image = tractor_image;
        this.tractor_active = tractor_active;
        this.location = location;
    }

    public int getTractor_id() {
        return tractor_id;
    }

    public void setTractor_id(int tractor_id) {
        this.tractor_id = tractor_id;
    }

    public String getTractor_name() {
        return tractor_name;
    }

    public void setTractor_name(String tractor_name) {
        this.tractor_name = tractor_name;
    }

    public String getOwner_name() {
        return owner_name;
    }

    public void setOwner_name(String owner_name) {
        this.owner_name = owner_name;
    }

    public String getTractor_image() {
        return tractor_image;
    }

    public void setTractor_image(String tractor_image) {
        this.tractor_image = tractor_image;
    }

    public boolean isTractor_active() {
        return tractor_active;
    }

    public void setTractor_active(boolean tractor_active) {
        this.tractor_active = tractor_active;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
