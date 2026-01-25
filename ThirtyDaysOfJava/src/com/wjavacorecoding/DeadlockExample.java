package com.wjavacorecoding;

class Util {
    static void sleep(long millis) {
        try {
            Thread.sleep(millis);
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Shared {
    synchronized void test1(Shared s2) {
        System.out.println(Thread.currentThread().getName() + " Exists test1 of " + this);

        Util.sleep(1000);
        s2.test2();
        System.out.println(Thread.currentThread().getName() + " Exits text1 of " + this);
    }

    synchronized void test2()
    {
        System.out.println(Thread.currentThread().getName() + " Enters test2 of " +this);

        Util.sleep(1000);

        System.out.println(Thread.currentThread().getName() + "Exits test2 of " + this);
    }
}

class Thread1 extends Thread {
    private Shared s1;
    private  Shared s2;

    public Thread1(Shared s1 , Shared s2)
    {
        this.s1 = s1;
        this.s2 = s2;
    }
    @Override public void run() {
        s1.test1(s2);
    }
}

class Thread2 extends Thread {
    private Shared s1;
    private Shared s2;

    public Thread2(Shared s1, Shared s2)
    {
        this.s1 = s1;
        this.s2 = s2;
    }
    @Override public  void run() {
        s2.test1(s1);
    }
}

public class DeadlockExample {
    public static void main(String[] args) {

        Shared s1 = new Shared();
        Shared s2 = new Shared();

        Thread1 t1 = new Thread1(s1, s2);
        t1.setName("Thread1 ");
        t1.start();

        Thread2 t2 = new Thread2(s1, s2);
        t2.setName("Thread2");
        t2.start();
        Util.sleep(2000);
    }
}
