import java.util.Random;

class Number extends Thread {
    public void run() {
        Random r = new Random();
        for (int i = 1; i <= 5; i++) {
            int n = r.nextInt(1000);
            System.out.println("\nmain Number: " + n);
            if (n % 2 == 0)
                new Square(n).start();
            else
                new Cube(n).start();
            try {
                Thread.sleep(1000);
            } catch (Exception e) {}
        }
    }
}


class Square extends Thread {
    
    int n;
    Square(int n) {
        this.n = n;
    }
    @Override 
    public void run() {
        System.out.print("Square = " + n * n);
    }
}

class Cube extends Thread {
    int n;
    Cube(int n) {
        this.n = n;
    }
    @Override
    public void run() {
        System.out.print("Cube = " + n * n * n);
    }
}

public class Main {
    public static void main(String[] args) {
        Number t1 = new Number();
        t1.start();
    }
}