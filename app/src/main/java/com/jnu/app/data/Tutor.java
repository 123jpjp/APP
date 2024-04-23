package com.jnu.app.data;

public class Tutor {
    private String name;
    private String level;
    private String category;
    private String direction;

    public Tutor(String name, String level, String category, String direction) {
        this.name = name;
        this.level = level;
        this.category = category;
        this.direction = direction;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }
}
