package domain;

import java.io.Serializable;

public class Location implements Serializable{
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private String name;
    private String XYposition;
    private boolean OftenUsed;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getXYposition() {
        return XYposition;
    }

    public void setXYposition(String XYposition) {
        this.XYposition = XYposition;
    }

    public boolean isOftenUsed() {
        return OftenUsed;
    }

    public void setOftenUsed(boolean oftenUsed) {
        OftenUsed = oftenUsed;
    }
}
