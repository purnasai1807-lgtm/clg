class ProducerConsumer {
    int data;
    boolean flag = false;

    public synchronized void put(int value) {
        if (flag) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        data = value;
        System.out.println("Put: " + data);
        flag = true;
        notify();
    }
    public synchronized int get() {
        if (!flag) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }

        System.out.println("Get: " + data);
        flag = false;
        notify();
        return data;
    }
}
class Producer extends Thread {
    ProducerConsumer pc;
    Producer(ProducerConsumer pc) {
        this.pc = pc;
    }
    public void run() {
        for (int i =1;i<=10;i++) {
            pc.put(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}
class Consumer extends Thread {
    ProducerConsumer pc;
    Consumer(ProducerConsumer pc) {
        this.pc = pc;
    }
    public void run() {
        for (int i = 1; i <= 10; i++) {
            pc.get();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}
public class Javalab2 {
    public static void main(String[] args) {
        ProducerConsumer pc = new ProducerConsumer();
        Producer producer = new Producer(pc);
        Consumer consumer = new Consumer(pc);
        producer.start();
        consumer.start();
    }
}