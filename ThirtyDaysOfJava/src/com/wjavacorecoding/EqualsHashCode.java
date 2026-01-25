package com.wjavacorecoding;


class HashCodeM {
    public String name;
    public int id;

    HashCodeM(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj)
            return true;

        if (obj == null || obj.getClass() != this.getClass())
            return false;

        HashCodeM hc = (HashCodeM) obj;

        return (hc.name == this.name && hc.id == this.id);
    }

    @Override
    public int hashCode() {

        return this.id;
    }
}

public class EqualsHashCode {
    public static void main(String[] args) {

//        HashCodeM h1 = new HashCodeM("ABC", 101);
//        HashCodeM h2 = new HashCodeM("ABC", 101);

        HashCodeM h1 = new HashCodeM("ABC", 101);
        HashCodeM h2 = new HashCodeM("DEF", 102);

        if (h1.hashCode() == h2.hashCode()) {
            if (h1.equals(h2))
                System.out.println("Both Object are equales.");

            else
                System.out.println("Both Objects are not equals");
        }
        else
            System.out.println("Both Objects are not equals");
    }
}
