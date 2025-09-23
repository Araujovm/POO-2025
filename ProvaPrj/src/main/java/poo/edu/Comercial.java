package poo.edu;

public class Comercial extends Imovel {
    
    public Comercial(String proprietario, int areaConstruida, Geo localizacao){
        super(proprietario,areaConstruida, localizacao);
    }

    public double calculaImposto(){
        return 777;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        return sb.toString();
    }
}
