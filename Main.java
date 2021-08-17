import java.util.ArrayList;
import java.util.List;

public class Main {
    public static List<Player> allPlayers = new ArrayList<>();

    public static void main(String args[]) {
        Player fill = new Player("fill", "fill", 0,0,0,false);
        Player Reurkh = new Player("Grant","Reurkh",3000, 3060, 2900, false);
        Player Anhalyk = new Player("Ethan","Anhalyk",0, 2400, 2678, false);
        Player beastknight = new Player("Patrick","beastknight",2974, 2411, 3155, false);
        Player IcyMinx = new Player("Brooke","IcyMinx",2774, 2083, 2554, true);
        Player Bee = new Player("Eleanor","Bee127",0,0,2308, false);
        Player Ace = new Player("Connor", "Ace", 1392, 1659, 1589, false);
        Player DARTHNAGOL = new Player("Logan", "DARTHNAGOL", 2192, 0, 1985, false);
        Player Drago = new Player("Travis", "dragoboy1000", 2213, 1930, 2040, false);

        Player[] playerRoster = {fill, fill, fill, fill, fill, fill};

        int i = 0;

        for (int playerOne = 0; playerOne < allPlayers.size(); playerOne++) {
            Player[] newTeam = {fill, fill, fill, fill, fill, fill};
            newTeam[0] = allPlayers.get(playerOne);

            for (int playerTwo = 0; playerTwo < allPlayers.size(); playerTwo++) {
                if (playerOne != playerTwo) {
                    newTeam[1] = allPlayers.get(playerTwo);
                    for (int playerThree = 0; playerThree < allPlayers.size(); playerThree++) {
                        if (playerOne != playerThree && playerTwo != playerThree) {
                            newTeam[2] = allPlayers.get(playerThree);
                            for (int playerFour = 0; playerFour < allPlayers.size(); playerFour++) {
                                if (playerOne != playerFour && playerTwo != playerFour && playerThree != playerFour) {
                                    newTeam[3] = allPlayers.get(playerFour);
                                    for (int playerFive = 0; playerFive < allPlayers.size(); playerFive++) {
                                        if (playerOne != playerFive && playerTwo != playerFive && playerThree != playerFive && playerFour != playerFive) {
                                            newTeam[4] = allPlayers.get(playerFive);
                                            for (int playerSix = 0; playerSix < allPlayers.size(); playerSix++) {
                                                if (playerOne != playerSix && playerTwo != playerSix && playerThree != playerSix && playerFour != playerSix && playerFive != playerSix) {
                                                    newTeam[5] = allPlayers.get(playerSix);

                                                    playerRoster = Teams.compareTeams(playerRoster, newTeam);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        Teams.printTeam(playerRoster);
        System.out.println();
        Teams.printTeam(Teams.team);
        System.out.println(Teams.mostSR);
        System.out.println(i);
    }
}
