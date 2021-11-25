public class Cat implements Jumping, Running {
    private int runVol = 3;
    private int jumpVol = 1;
    private boolean readyForAction = true;

    @Override
    public boolean getReadyForAction() {
        return readyForAction;
    }


        @Override
        public void runDistance (int distance){
            if (this.runVol>distance) {
                System.out.println("Кот прлобежал " + distance + " метров");
            } else {
                System.out.println("Кот не может пробежать " + distance + " метров и сошел с дистанции");
                readyForAction = false;
            }

    }
        @Override
        public void jumpHeight(int height){
        if (this.jumpVol>height) {
            System.out.println("Кот перепрыгнуть " + height + " метров");
        } else {
            System.out.println("Кот не может перепрыгнуть " + height + " метров и сошел с дистанции");
            readyForAction = false;
        }

    }
}
