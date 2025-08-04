package edu.araujo;

public class App {
    public static void main(String[] args) {
        Circulo c1 = new Circulo();
        System.out.println(c1.toString());
        c1.zoom(4);
        c1.mover(4, 2);
        System.out.println(c1.toString());
        System.out.println("area do circulo"+c1.area());
    }
}

