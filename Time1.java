public class Time1 {

    private int h;
    private int m;
    private int s;

    public Time() {
        this(0, 0, 0);
    }

    public Time(int totalSecs) {
        this(totalSecs / 3600, (totalSecs % 3600) / 60, totalSecs % 60);
    }

    public Time(int hr, int min) {
        this(hr, min, 0);
    }
    public Time(int hr, int min, int sec) {
        h = hr;
        m = min;
        s = sec;
    }
    public void displayTime() {
        System.out.printf("%02d:%02d:%02d%n", h, m, s);
    }
}
