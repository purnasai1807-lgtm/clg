public class Time {
    
    private int h;
    private int m;
    private int s;

    public Time() { this(0, 0, 0); }

    public Time(int totalSecs) { this(totalSecs / 3600, (totalSecs % 3600) / 60, totalSecs % 60); }

    public Time(int hr, int min) { this(hr, min, 0); }

    public Time(int hr, int min, int sec) {
        this.h = hr; 
        this.m = min; 
        this.s = sec;
    }

    public void displayTime() {
        System.out.printf("%02d:%02d:%02d%n", h, m, s);
    }

    public static void main(String[] args) {
        System.out.print("Default Time: ");
        new Time().displayTime();

        System.out.print("Time from 3665 seconds: ");
        new Time(3665).displayTime();

        System.out.print("Time from Hours & Minutes: ");
        new Time(10, 45).displayTime();

        System.out.print("Full Custom Time: ");
        new Time(14, 30, 15).displayTime();
    }
}