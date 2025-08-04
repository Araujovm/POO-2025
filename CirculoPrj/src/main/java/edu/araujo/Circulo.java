package edu.araujo;


public class Circulo{
    private double cordX;
    private double cordY;
    private double raio;

    public Circulo(){
        this.cordX = 0;
        this.cordY = 0;
        this.raio = 1;
    }

    public Circulo(double umX, double umY,double umRaio){
        this.cordX = umX;
        this.cordY = umY;
        this.raio = umRaio;
    }

    public void mover(double novoX, double novoY){
        this.cordX = novoX;
        this.cordY = novoY;
    }

    public void zoom(double fator){
        this.raio = fator *raio;
    }

    public double area(){
       return Math.PI*Math.pow(raio,2);
    }
    public String toString(){
        return "Circulo de raio "+raio+" posição ("+cordX+","+cordY+")";
    }
}
