public class TestDemo {

    public static void main(String[] args) {

        System.out.print("Default Time: ");
        Time t1 = new Time();
        t1.displayTime();

        System.out.print("Time from 3665 seconds: ");
        Time t2 = new Time(3665);
        t2.displayTime();

        System.out.print("Time from Hours & Minutes: ");
        Time t3 = new Time(10, 45);
        t3.displayTime();

        System.out.print("Full Custom Time: ");
        Time t4 = new Time(14, 30, 15);
        t4.displayTime();
    }
}