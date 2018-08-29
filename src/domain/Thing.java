package domain;

import java.io.Serializable;

public class Thing implements Serializable {
    private int id ;
    private String name;
    private int position;
    private String location;
    private boolean oftenUsed;
    private int count;

    public Thing(String name, int position, String location, boolean oftenUsed, int count, String attrs) {
        this.name = name;
        this.position = position;
        this.location = location;
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

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
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
