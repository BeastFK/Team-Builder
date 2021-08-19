import java.util.ArrayList;
import java.util.List;

public class Main {
    public static List<Player> allPlayers = new ArrayList<>();

    public static void main(String args[]) {
        Player fill = new Player("fill", "fill", 0,0,0,false);

        PlayerInit.initPlayers();

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
                                                    i++;
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
        System.out.println();
        Teams.printTeam(Teams.team);
    }
}
