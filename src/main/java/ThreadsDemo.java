package main.java;

public class ThreadsDemo {
    public static void main(String[] args) {

        //Thread
        //lifecycle
        // NEW -INITIALIZE
        //RUNNABLE -
        //RUNNING
        //DEAD -END OF EXECUTION
        // WAITING - sleep() ,wait()
        Thread thread= new Thread();
        thread.start();
        thread.run();
    }
}
