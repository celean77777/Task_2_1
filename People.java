public class People implements Jumping, Running {
    private int runVol = 11;
    private int jumpVol = 5;
    private boolean readyForAction = true;

    @Override
    public boolean getReadyForAction(){
        return readyForAction;
    }


    @Override
    public void runDistance(int distance){
        if (this.runVol>distance) {
            System.out.println("Человек прлобежал " + distance + " метров");
        } else {
            System.out.println("Человек не может пробежать " + distance + " метров и сошел с дистанции");
            readyForAction = false;
        }

    }

    @Override
    public void jumpHeight(int height){
        if (this.jumpVol>height) {
            System.out.println("Человек перепрыгнул " + height + " метров");
        } else {
            System.out.println("Человек не может перепрыгнуть " + height + " метров и сошел с дистанции");
            readyForAction = false;
        }

    }
}
