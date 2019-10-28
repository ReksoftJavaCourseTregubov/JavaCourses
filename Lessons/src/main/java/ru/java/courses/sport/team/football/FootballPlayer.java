package ru.java.courses.sport.team.football;

import ru.java.courses.sport.Athlete;

public class FootballPlayer extends Athlete {
    private int goals;
    private PlayerRole role;

    public FootballPlayer(String name) {
        super(name);
    }

    public FootballPlayer(String name, PlayerRole role) {
        super(name);
        if (role == null) {
            throw new IllegalArgumentException("Invalid player role");
        }
        this.role = role;
    }

    public void score() {
        if (isActive()) {
            goals++;
        }
    }

    public int getScore() {
        return goals;
    }

    public int getGoals() {
        return goals;
    }

    public void setGoals(int goals) {
        this.goals = goals;
    }

    public PlayerRole getRole() {
        return role;
    }

    public void setRole(PlayerRole role) {
        if (role == null) {
            throw new IllegalArgumentException("Invalid player role");
        }
        this.role = role;
    }
}
