package Sync;

public class Counter {
    private int count =0;

    public int getCount(){
        return count;
    }

    synchronized public void decrement(int i)
    {
        count-=i;
    }

    synchronized public void increment(int i)
    {
        count+=i;
    }


}
