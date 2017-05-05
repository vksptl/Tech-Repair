package com.vikas.gadgetsrepair2;

/**
 * Created by Vikas on 3/16/2017.
 */
public class Gadget {
    private String name;
    private int numOfBrands;
    private int thumbnail;

    public Gadget() {
    }

    public Gadget(String name, int numOfBrands, int thumbnail) {
        this.name = name;
        this.numOfBrands = numOfBrands;
        this.thumbnail = thumbnail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumOfBrands() {
        return numOfBrands;
    }

    public void setNumOfBrands(int numOfBrands) {
        this.numOfBrands = numOfBrands;
    }

    public int getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(int thumbnail) {
        this.thumbnail = thumbnail;
    }
}
