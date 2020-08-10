package testc.multithread.ex1;

class Example {


   public static void main(String[] args) throws InterruptedException {
        Printer printer = new Printer();
        Thread childThread = new Thread(printer);
   //    childThread.join();
   //    childThread.start();

        Printer printer1 = new Printer();
        Thread childThread1 = new Thread(printer1);
     //   childThread1.join();
     //   childThread1.start();


       childThread1.join();


       childThread.start();
       childThread1.start();



       // childThread.

    }




}
