import java.util.Random;

public class Course {
    Random random = new Random();
    private int numOfObstacles;
    private Obstacles[] obstacles;
    private Team team;

    public Course (int numOfObstacles){
        this.numOfObstacles = numOfObstacles;
        obstacles = new Obstacles[numOfObstacles];
        for (int i = 0; i<numOfObstacles;i++){
            int choice = random.nextInt(2);
            if (choice==0) {
                obstacles[i] = new Wall();
            } else {
                obstacles[i] = new Treadmill();
        }
    }

    }
    public void doIt (Team team) {
        this.team = team;
        for (Action a:team.getTeam()) {
            for (Obstacles b:obstacles) {
                if (a.getReadyForAction()) {

                    if (a instanceof People) {

                        if (b instanceof Wall) {
                            ((Wall) b).setHeight(3);
                            ((People) a).jumpHeight(((Wall) b).getHeight());
                        } else {
                            ((Treadmill) b).setDistance(10);
                            ((People) a).runDistance(((Treadmill) b).getDistance());
                        }
                    } else if (a instanceof Robot) {
                        if (b instanceof Wall) {
                            ((Wall) b).setHeight(3);
                            ((Robot) a).jumpHeight(((Wall) b).getHeight());
                        } else {
                            ((Treadmill) b).setDistance(10);
                            ((Robot) a).runDistance(((Treadmill) b).getDistance());
                        }
                    } else {
                        if (b instanceof Wall) {
                            ((Wall) b).setHeight(3);
                            ((Cat) a).jumpHeight(((Wall) b).getHeight());
                        } else {
                            ((Treadmill) b).setDistance(10);
                            ((Cat) a).runDistance(((Treadmill) b).getDistance());
                        }
                    }
                } else break;
            }
        }
    }


}
