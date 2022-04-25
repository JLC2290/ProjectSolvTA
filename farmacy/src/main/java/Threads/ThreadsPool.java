package Threads;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class ThreadsPool {
    public static void main(String[] args) {

        Car c = new Car();
        Car c1 = new Car();
        Car c3 = new Car();
        Car c4 = new Car();
        Car c44 = new Car();
        Car1 c5 = new Car1();
        Car1 c6 = new Car1();
        Car1 c7 = new Car1();


/**
 * ThreadPoolExecutor is an interface
 * that represents an object that executes provided tasks.
 */
        int nThreads = 5;
        ThreadPoolExecutor threadExecutor = (ThreadPoolExecutor) Executors.newFixedThreadPool(nThreads);


        threadExecutor.execute(c);
        threadExecutor.execute(c5);
        threadExecutor.execute(c44);
        threadExecutor.execute(c1);
        threadExecutor.execute(c3);
        threadExecutor.execute(c4);
        threadExecutor.execute(c6);
        threadExecutor.execute(c7);

        threadExecutor.shutdown();

    }


    public static class Car extends Thread {
        @Override
        public synchronized void run() {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();

            }

             System.out.println("this is the run called from the Car Class");
        }
    }

    public static class Car1 implements Runnable {
        @Override
        public void run() {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
             System.out.println("This is the run method from the Car1 Class");

        }
    }
}
