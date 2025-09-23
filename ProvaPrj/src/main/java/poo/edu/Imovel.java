package poo.edu;

public abstract class Imovel {
    
    private String proprietario;
    private static int VR;
    private int areaConstruida;
    private Geo localizacao;
    public Imovel(String proprietario, int areaConstruida, Geo localizacao){
        this.proprietario = proprietario;
        this.areaConstruida = areaConstruida;
        this.localizacao = localizacao;
    }

    public static int getVR(){
        return VR;
    }

    public static void setVR(int VR){
        Imovel.VR = VR;
    }

    public String getProprietario(){
        return proprietario;
    }   

    public int getAreaConstruida(){
        return areaConstruida;
    }
    public abstract double calculaImposto();

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Proprietario: ").append(proprietario)
            .append(" Area: ").append(areaConstruida)
                .append(" Localização").append(localizacao).append("\n");
    
    return sb.toString();
    }
}
