import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class PlayerInit {
    public static void initPlayers() {

        File file = new File("src/PlayerData/");

        for (File playerData : file.listFiles()) {
            String name = "fill";
            String tag = "fill";
            int tankSR = 0;
            int damageSR = 0;
            int supportSR = 0;
            boolean isConsole = false;

            try {
                Scanner scanner = new Scanner(playerData);

                String temp = scanner.nextLine();

                if (!temp.equals("void")) {
                    name = temp.substring(temp.lastIndexOf(":") + 1);
                    temp = scanner.nextLine();
                    tag = temp.substring(temp.lastIndexOf(":") + 1);
                    temp = scanner.nextLine();
                    tankSR = Integer.parseInt(temp.substring(temp.lastIndexOf(":") + 1));
                    temp = scanner.nextLine();
                    damageSR = Integer.parseInt(temp.substring(temp.lastIndexOf(":") + 1));
                    temp = scanner.nextLine();
                    supportSR = Integer.parseInt(temp.substring(temp.lastIndexOf(":") + 1));
                    temp = scanner.nextLine();
                    isConsole = Boolean.parseBoolean(temp.substring(temp.lastIndexOf(":") + 1));
                }

                scanner.close();
            } catch (Exception e) {
                e.printStackTrace();
            }

            new Player(name, tag, tankSR, damageSR, supportSR, isConsole);
        }
    }
}
