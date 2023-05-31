package Sync;

import java.util.concurrent.locks.Lock;

public class Adder implements Runnable {

    Counter counter;


    Adder(Counter counter){

        this.counter=counter;

    }

    @Override
    public void run() {
        for(int i = 0 ; i < 10000 ; i++)
        {
            synchronized (counter){
                counter.increment(i);
            }
        }
    }
}
