package Sync;

import java.util.concurrent.locks.Lock;

public class Substractor implements  Runnable {

    Counter counter;

    Substractor(Counter counter){
        this.counter=counter;


    }

    @Override
    public void run() {
        for(int i = 0 ; i < 10000 ; i++)
        {
            synchronized (counter) {
                counter.decrement(i);
            }
        }
    }
}
