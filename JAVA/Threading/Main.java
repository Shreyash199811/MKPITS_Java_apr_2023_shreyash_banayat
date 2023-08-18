public class Main {
    public static void main(String[] args) {        //parent thread
//        System.out.println("Hi");
//        MyClass myClass=new MyClass("Suleman");
//        myClass.setName("Salman");
//        myClass.start();                            //child thread
//        System.out.println("bye");
//        System.out.println(myClass.getName());
//        System.out.println("myclass priority="+myClass.getPriority());
//        System.out.println("myclass name="+myClass.getName());
//        System.out.println("priority of main="+Thread.currentThread().getPriority());
//        System.out.println("name of current thread="+Thread.currentThread().getName());

        //Runnable interface
//        Thread runClass=new Thread(new RunClass(),"RunnableThread");
//        runClass.setPriority(1);
//        runClass.start();
//        System.out.println(Thread.currentThread().getPriority());
//        Thread.currentThread().setPriority(6);
//        System.out.println(Thread.currentThread().getPriority());
//        System.out.println(Thread.currentThread().getName());
//        runClass.start();

//        Thread runClass2=new Thread(new RunClass(),"RunTwo");
//        runClass.setPriority(9);
//        runClass2.start();

//        Thread evenNo=new Thread(new ThreadEven(),"evenNum");
//        Thread oddNo=new Thread(new ThreadOdd(),"oddNum");
//        evenNo.start();
//        oddNo.start();

//        Thread randomNumber=new Thread(new RandomNUmber(),"ranNum");
//        randomNumber.start();

//        MyThread threadOne=new MyThread();
//        threadOne.setName("thread1");
//
//        MyThread threadTwo=new MyThread();
//        threadTwo.setName("thread2");
//
//        threadOne.start();
//        try {
//            threadOne.join();
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        threadTwo.start();


//        Sender obj=new Sender();
//        ThreadedSend t1=new ThreadedSend("hi",obj);
//        ThreadedSend t2=new ThreadedSend("bye",obj);
//        t1.start();
//        t2.start();


//     Thread t2=new Thread(new YourThreadClass());
//     t2.start();

//        MyThreadClass t1=new MyThreadClass();
//        t1.start();
//
//        synchronized (t1){
//            try {
//                System.out.println("Waiting for t1 to complete addition...");
//                t1.wait();
//            } catch (InterruptedException e)
//            {
//
//            }
//            System.out.println("Total is "+t1.total);
//        }


   YourThreadClass yourThreadClass=new YourThreadClass();
   yourThreadClass.start();
   synchronized (yourThreadClass) {
       try {
           yourThreadClass.wait();
       } catch (InterruptedException e) {
           throw new RuntimeException(e);
       }
       System.out.println("Sum of first 10 number is=" + yourThreadClass.sum);
   }
    }
}

//This is a Multi-threaded application