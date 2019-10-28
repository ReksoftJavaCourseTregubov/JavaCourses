package ru.java.courses.sport;

public class Athlete {
    private String name;
    private boolean active;

    public Athlete(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Invalid athlete name");
        }
        this.name = name;
        this.active = true;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Invalid athlete name");
        }
        this.name = name;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

}
