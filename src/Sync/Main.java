package Sync;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main{
    public static void main(String[] args) throws Exception
    {
        Counter counter=new Counter();

        Adder adder=new Adder(counter);
        Substractor substractor=new Substractor(counter);

        Thread t1=new Thread(adder);
        Thread t2=new Thread(substractor);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("The count value is = "+counter.getCount());

    }
}
