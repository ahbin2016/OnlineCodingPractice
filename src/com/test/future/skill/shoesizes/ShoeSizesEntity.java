package com.test.future.skill.shoesizes;

public class ShoeSizesEntity {



    private int size;
    private String name;

    public ShoeSizesEntity(int size, String name) {

        this.size = size;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }
}
