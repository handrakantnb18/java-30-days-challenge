package com.wjavacorecoding;

class Singleton {
    private static Singleton single_instance = null;

    public String s;

    private Singleton() {
        s = "Chandrakant bhosale Pune";
    }

    public static Singleton Singleton() {
        if (single_instance == null) {
            single_instance = new Singleton();
        }

        return single_instance;
    }

}

public class SingletonClass {

    public static void main(String[] args) {

        Singleton a = Singleton.Singleton();

        Singleton b = Singleton.Singleton();

        a.s = (a.s).toUpperCase();
        System.out.println("String from A : " + a.s + ", B : " + b.s);

        b.s = (b.s).toLowerCase();
        System.out.println("String from A : "+ a.s + " , B : " + b.s);
    }
}
