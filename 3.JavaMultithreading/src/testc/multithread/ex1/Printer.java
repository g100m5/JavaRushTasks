package testc.multithread.ex1;



class Printer implements Runnable
{
    public void run()
    {
        System.out.println("I’m printer");
        System.out.println(Thread.currentThread().getName());
    }
}