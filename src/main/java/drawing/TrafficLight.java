package drawing;

public enum TrafficLight {

    RED(4), YELLOW(2), GREEN(10);
    private int duration;

    TrafficLight(int duration) {
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }
}
