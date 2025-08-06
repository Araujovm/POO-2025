package edu.araujo;

public class App {
    public static void main(String[] args) {
        Circulo c1 = new Circulo();
        Circulo c2 = new Circulo();
        System.out.println(c1.toString());
        
        c1.zoom(4);
        c1.mover(4, 2);
        
        System.out.println(c1.toString());
        System.out.println("area do circulo"+c1.area());
        
        Circulo [] lista;
        lista = new Circulo[3];

        lista[0] = c1;
        lista [1] = c2;
        lista [2] = new Circulo(0,0,6);

        for(int i=0;i<lista.length;i++){
            System.out.println(lista[i].toString());
        }

        








    }
}

