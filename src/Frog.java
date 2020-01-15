public class Frog {

    private enum LastJump {
        START,HIGH,MEDIUM,LOW
    }

    private LastJump lastJump = LastJump.START;

    private int distance = 0;

    private int time = 0;

    public void jump() {

        switch (lastJump) {
            case START:
                this.time = time + 0;
                this.distance = distance + 5;
                this.lastJump = LastJump.HIGH;
                break;

            case HIGH:
                this.time = time + 1;
                this.distance = distance + 3;
                this.lastJump = LastJump.MEDIUM;
                break;

            case MEDIUM:
                this.time = time + 3;
                this.distance = distance + 1;
                this.lastJump = LastJump.LOW;
                break;

            case LOW:
                this.time = time + 5;
                this.distance = distance + 5;
                this.lastJump = LastJump.HIGH;
                break;
        }
    }

    public int getDistance() {
        return distance;
    }

    public int getTime() {
        return time;
    }
}