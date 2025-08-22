package com.rahul.poly.covarient;

class Animal {
}

class Monkey extends Animal {
}

public class AnimalSystem {

    public void m1(Animal a) {
        System.out.println("Animal version");
    }

    public void m1(Monkey m) {
        System.out.println("Monkey version");
    }

    public static void main(String[] args) {
    	AnimalSystem as = new AnimalSystem();

        Animal a = new Animal();
        as.m1(a);

        Monkey m = new Monkey();
        as.m1(m);

        Animal a1 = new Monkey();
        as.m1(a1);
    }
}