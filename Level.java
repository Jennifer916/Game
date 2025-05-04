public class Level {
    private int points;
    private boolean goal;
    public boolean goalReached () {
        return goal;
    }
    public int getPoints () {
        return points;
    }
    public void setPoints (int p ) {
        points = p ;
    }
    public void reachGoal() {
        goal= true;
    }
}
