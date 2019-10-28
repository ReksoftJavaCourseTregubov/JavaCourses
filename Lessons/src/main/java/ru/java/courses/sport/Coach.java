package ru.java.courses.sport;

public class Coach {
    private int experience;
    private String name;

    public Coach(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Invalid coach name");
        }
        this.name = name;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Invalid coach name");
        }
        this.name = name;
    }
}
