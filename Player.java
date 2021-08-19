public class Player {
    public final int CONSOLE_PENALTY = 350;

    private int tank_SR;
    private int dps_SR;
    private int supportSR;

    private String name;
    private String tag;

    public Player(String name, String tag, int tank_SR, int dps_SR, int supportSR, boolean isConsole) {
        this.name = name;
        this.tag = tag;
        this.tank_SR = tank_SR;
        this.dps_SR = dps_SR;
        this.supportSR = supportSR;
        if (isConsole) {
            this.tank_SR = tank_SR-CONSOLE_PENALTY;
            this.dps_SR = dps_SR-CONSOLE_PENALTY;
            this.supportSR = supportSR-CONSOLE_PENALTY;
        }

        Main.allPlayers.add(this);
    }

    public int getTankSR() {
        return tank_SR;
    }

    public int getDPSSR() {
        return dps_SR;
    }

    public int getSupportSR() {
        return supportSR;
    }

    public String getName() {
        return name;
    }

    public String getTag() {
        return tag;
    }
}
