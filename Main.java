public class Main {

    public static void main(String[] args) {

        //Массив участников

        Action[] teamMember = new Action[4];
       teamMember[0] = new People();
       teamMember[1] = new Robot();
       teamMember[2] = new Cat();
       teamMember[3] = new People();

       // Массив препятствий

      Obstacles[] obstacles = new Obstacles[3];
      obstacles[0] = new Wall();
      obstacles[1] = new Treadmill();
      obstacles[2] = new Wall();



        // Прохождение участниками из массива teamMember препятствий из массива obstacles
        for (Action a:teamMember) {
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


        // Задачи 5 и 6
        Course c = new Course(6);
        Team team = new Team("DreamTeam", 8);
        c.doIt(team);
        team.showResults();








    }
}
