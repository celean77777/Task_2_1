public class Robot implements Jumping, Running {
    private int runVol = 20;
    private int jumpVol = 10;
    private boolean readyForAction = true;

    @Override
    public boolean getReadyForAction() {
        return readyForAction;
    }

        @Override
        public void runDistance(int distance) {
            if (this.runVol>distance) {
                System.out.println("Робот прлобежал " + distance + " метров");
            } else {
                System.out.println("Робот не может пробежать " + distance + " метров и сошел с дистанции");
                readyForAction = false;
            }

    }
        @Override
        public void jumpHeight(int height) {
            if (this.jumpVol>height) {
                System.out.println("Робот перепрыгнул " + height + " метров");
            } else {
                System.out.println("Робот не может перепрыгнуть " + height + " метров и сошел с дистанции");
                readyForAction = false;
            }
    }
}
