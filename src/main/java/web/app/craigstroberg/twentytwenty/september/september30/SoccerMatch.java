package web.app.craigstroberg.twentytwenty.september.september30;

import java.util.Date;

public class SoccerMatch {
    public static void main(String[] args) {

        Player jane = new Player();
        jane.setCaps("1");
        jane.setDateOfBirth(new Date());
        jane.setGoals("13");
        jane.setTrophies("5");
        jane.setName("Jane");

        Player pieter = new Player();
        jane.setCaps("1");
        jane.setDateOfBirth(new Date());
        jane.setGoals("13");
        jane.setTrophies("5");
        jane.setName("Pieter");

        Player[] players = {jane, pieter};

        SoccerTeam soccerTeam = new SoccerTeam();
        soccerTeam.setName("Chelsea");
        soccerTeam.setPlayers(players);

        System.out.println(soccerTeam);
    }
}
