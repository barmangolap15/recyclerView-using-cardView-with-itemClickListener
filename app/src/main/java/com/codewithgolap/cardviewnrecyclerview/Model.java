package com.codewithgolap.cardviewnrecyclerview;

public class Model {
    int image;
    String name, tag;

    public Model() {
    }

    public Model(int image, String name, String tag) {
        this.image = image;
        this.name = name;
        this.tag = tag;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }
}
