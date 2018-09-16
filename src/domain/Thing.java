package domain;

import java.io.Serializable;

public class Thing implements Serializable {
    private int id ;
    private String name;
    private int location;
    private String picture;
    private boolean oftenUsed;
    private int count;

    public Thing(String name, int location, String picture, boolean oftenUsed, int count, String attrs) {
        this.name = name;
        this.location = location;
        this.picture = picture;
        this.oftenUsed = oftenUsed;
        this.count = count;
        this.attrs = attrs;

    }

    private String attrs;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLocation() {
        return location;
    }

    public void setLocation(int location) {
        this.location = location;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public boolean isOftenUsed() {
        return oftenUsed;
    }

    public void setOftenUsed(boolean oftenUsed) {
        this.oftenUsed = oftenUsed;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getAttrs() {
        return attrs;
    }

    public void setAttrs(String attrs) {
        this.attrs = attrs;
    }
}
