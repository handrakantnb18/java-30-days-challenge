package com.wjavacorecoding;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


class PersonDept {
    private String fName;
    private String lName;
    private  String address;
    private int contact;
    private int year;

    public PersonDept(String fName, String lName, String address, int contact, int year) {
        this.fName = fName;
        this.lName = lName;
        this.address = address;
        this.contact = contact;
        this.year = year;
    }

    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }

    public String getAddress() {
        return address;
    }

    public int getContact() {
        return contact;
    }

    public int getYear() {
        return year;
    }
}

class DRDept implements Comparator<PersonDept> {
    public int compare(PersonDept p1, PersonDept p2) {
        return Double.compare(p2.getYear(), p1.getContact());
    }
}

class NameCompare implements Comparator<PersonDept> {
    public int compare(PersonDept p1, PersonDept p2) {

        // Sort by name in alphabetical order
        return p1.getfName().compareTo(p2.getlName());
    }
}

public class ComparatorvsComparableMain {
    public static void main(String[] args) {
        ArrayList<PersonDept> l = new ArrayList<>();
        l.add(new PersonDept("Chandrakant", "Bhosale", "Pune", 987456321, 1995));
        l.add(new PersonDept("Priyanka", "Bhosale", "Sangli", 987654321, 1997));
        l.add(new PersonDept("Vijay", "bhosale", "Sangli", 963852741, 1998));
        l.add(new PersonDept("Ram", "Bhosale", "Mumbai", 963258147, 2025));

        Collections.shuffle(l);

        System.out.println("Movies after sorting by years : ");

        for (PersonDept p : l) {
            System.out.println(p.getfName()+ " "+ p.getlName()+ " "+p.getAddress()+" "+p.getContact()+ " "+p.getYear());

            ArrayList<PersonDept> m = new ArrayList<>();
            m.add(new PersonDept("Chandrakant", "Bhosale", "Pune", 987456321, 1995));
            m.add(new PersonDept("Priyanka", "Bhosale", "Sangli", 987654321, 1997));
            m.add(new PersonDept("Vijay", "bhosale", "Sangli", 963852741, 1998));
            m.add(new PersonDept("Ram", "Bhosale", "Mumbai", 963258147, 2025));

            Collections.sort(m, new DRDept());
            System.out.println("PersonDEPT sorted by Contact :");
            for (PersonDept m1 : m) {
                System.out.println(m1.getfName() + " " + m1.getlName() + " " + m1.getAddress()+ " " +m1.getContact()+ " "+m1.getYear());
            }

            Collections.sort(m, new NameCompare());
            System.out.println("PersonDEPT sorted by Name :");
            for (PersonDept m1 : m) {
                System.out.println(m1.getfName() + " " + m1.getlName() + " " + m1.getAddress()+ " " +m1.getContact()+ " "+m1.getYear());
            }
        }
    }

}
