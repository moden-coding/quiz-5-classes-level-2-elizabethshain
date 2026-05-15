public class ArcadeGameCredit {
    private String gameName;
    private int credits;
    private int costPerPlay;
    private int playsCompleted;

    public ArcadeGameCredit(String s, int i, int k) {
        gameName = s;
        credits = i;
        costPerPlay = k;
        
    }

    public void playOnce() {
        if (credits >= costPerPlay) {
            credits = credits - costPerPlay;
        }
        if (credits < costPerPlay) {
            credits = credits;
        }
        if (credits < 0) {
            credits = 0;
        }
        if (costPerPlay <= 0) {
            costPerPlay = 1;
        }
        if (credits >= costPerPlay) {
            credits = credits - costPerPlay;
            playsCompleted++;
        }
        if (credits<costPerPlay){
            credits=credits;
            costPerPlay = costPerPlay;

        }
        
    }

    public int getTotalCreditsUsed() {
        return playsCompleted * costPerPlay;
    }

    public String toString() {
        return "Game: " + gameName + ", Credits: " + credits + ", Cost Per Play:" + costPerPlay;

    }

}
