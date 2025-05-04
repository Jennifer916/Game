public class Game {
    private Level levelOne; 
    private Level levelTwo;
    private Level levelThree; 
    private boolean bonus;
    public Game () {
        levelOne = new Level();
        levelTwo = new Level();
        levelThree = new Level();

    }
    public boolean isBonus () {
        return bonus;
    }
    public void makeBonus () {
         bonus=true;
    }
    public Level getLevel(int i ) {
        if (i==1) return levelOne;
        if (i==2) return levelTwo;
        if (i==3) return levelThree;
        return null;
    }
    public void play() {

    }
    public int getScore() {
        if (levelOne.goalReached()) {
            point+=levelOne.getPoints();
            if (levelTwo.goalReached()) {
                point+=levelTwo.getPoints();
                if (levelThree.goalReached()) {
                    point+=levelThree.getPoints(); 
                }
            }
        }
        return points;

    }
    public int playManyTimes (int num) {

    }
}