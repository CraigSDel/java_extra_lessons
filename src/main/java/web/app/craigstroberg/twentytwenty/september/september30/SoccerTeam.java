package web.app.craigstroberg.twentytwenty.september.september30;

import java.util.Arrays;

public class SoccerTeam {

  private String name;
  private Player[] players = new Player[11];

  public SoccerTeam() {
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Player[] getPlayers() {
    return players;
  }

  public void setPlayers(Player[] players) {
    this.players = players;
  }

  @Override
  public String toString() {
    return "SoccerTeam{" +
            "name='" + name + '\'' +
            ", players=" + Arrays.toString(players) +
            '}';
  }
}
