package ua.lviv.lgs.amphibia;

public class Main {
    public static void main(String[] args) {
        Frog frog = new Frog();
        Amphibia frog2 = new Frog();


        frog.eat();
        frog.sleep();
        frog.swim();
        frog.walk();

        System.out.println();

        frog2.eat();
        frog2.sleep();
        frog2.swim();
        frog2.walk();
    }
}
