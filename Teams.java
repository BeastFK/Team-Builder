public class Teams {
    public static int mostSR = 0;
    public static Player[] team = new Player[6];

    public static void printTeam(Player[] team) {
        System.out.println(team[0].getName() + "/" + team[0].getTag() + ": " + team[0].getTankSR());
        System.out.println(team[1].getName() + "/" + team[1].getTag() + ": " + team[1].getTankSR());
        System.out.println(team[2].getName() + "/" + team[2].getTag() + ": " + team[2].getDPSSR());
        System.out.println(team[3].getName() + "/" + team[3].getTag() + ": " + team[3].getDPSSR());
        System.out.println(team[4].getName() + "/" + team[4].getTag() + ": " + team[4].getSupportSR());
        System.out.println(team[5].getName() + "/" + team[5].getTag() + ": " + team[5].getSupportSR());

        System.out.println("Total SR: " + totalSR(team) + " | " + "Average SR: " + totalSR(team)/6);
    }

    public static Player[] compareTeams(Player[] teamOne, Player[] teamTwo) {

        if (totalSR(teamOne) > totalSR(teamTwo)) {
            return teamOne;
        }

        return teamTwo;
    }

    public static int totalSR(Player[] teamRating) {
        int teamSR = 0;

        teamSR += teamRating[0].getTankSR();
        teamSR += teamRating[1].getTankSR();
        teamSR += teamRating[2].getDPSSR();
        teamSR += teamRating[3].getDPSSR();
        teamSR += teamRating[4].getSupportSR();
        teamSR += teamRating[5].getSupportSR();

        if (teamSR > mostSR) {
            mostSR = teamSR;
            for (int i = 0; i < 6; i++) {
                team[i] = teamRating[i];
            }
        }

        return teamSR;
    }
}
