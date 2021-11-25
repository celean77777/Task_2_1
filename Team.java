import java.util.Random;

public class Team {
    Random random = new Random();
    private String name;
    private int numOfMembers;
    private Action[] team;
    private String[] nameOfMember;


    public Team (String name, int numOfMembers){
        this.name=name;
        this.numOfMembers = numOfMembers;
        team = new Action[numOfMembers];
        nameOfMember = new String [numOfMembers];
        for (int i = 0; i<numOfMembers;i++){
            int choice = random.nextInt(3);
            if (choice==0) {
                team[i] = new People();
                nameOfMember[i] = "Человек";
            } else if (choice==1){
                team[i] = new Cat();
                nameOfMember[i] = "Кошка";
            } else {
                team[i] = new Robot();
                nameOfMember[i] = "Робот";
            }
        }
    }

    public Action[] getTeam(){
        return team;
    }



    public void showResults () {
        System.out.println("________________________________________________________________________\n");
        System.out.println("В команде " + numOfMembers + " участников: \n" );
        for (String a:nameOfMember) {
            System.out.println(a + "\n");
        }
        System.out.println("Прошли дистанцию:\n");
        for (int i = 0; i<numOfMembers;i++) {
            if(team[i].getReadyForAction()){
                System.out.println(nameOfMember[i] + "\n");
            }
            
        }

    }


}
