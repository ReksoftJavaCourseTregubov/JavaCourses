package ru.java.courses.sport.team.football;

import ru.java.courses.sport.Coach;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FootballTeam {
    private List<FootballPlayer> players = new ArrayList<>();
    private String name;
    private Coach coach;

    private static int maxPlayersCount = 20;

    public FootballTeam(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Invalid team name");
        }
        this.name = name;
    }


    public List<FootballPlayer> getPlayers() {
        return players;
    }

    public void setPlayers(List<FootballPlayer> players) {
        this.players = players;
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

    public Coach getCoach() {
        return coach;
    }

    public void setCoach(Coach coach) {
        this.coach = coach;
    }

    public static int getMaxPlayersCount() {
        return maxPlayersCount;
    }

    public static void setMaxPlayersCount(int maxPlayersCount) {
        FootballTeam.maxPlayersCount = maxPlayersCount;
    }


    public void addPlayers(FootballPlayer... players) {
        for (FootballPlayer p : players) {
            addPlayer(p);
        }
    }

    public void addPlayer(FootballPlayer player) {
        if (players.size() + 1 > getMaxPlayersCount()) {
            throw new IllegalStateException("The limit of players in the team exceeded");
        }
        this.players.add(player);
    }

    public void removePlayer(FootballPlayer player) {
        this.players.remove(player);
    }

    public int getScore() {
        return players.stream().mapToInt(FootballPlayer::getScore).sum();
    }

    public int getPlayersCount() {
        return players.size();
    }

}
