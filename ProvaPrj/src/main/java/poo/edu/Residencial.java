package poo.edu;

public class Residencial extends Imovel{
    private int areaTerreno;

    public Residencial(String proprietario, int areaConstruida, Geo localizacao, int areaTerreno){
        super(proprietario,areaConstruida, localizacao);
        this.areaTerreno = areaTerreno;
    }
    
    @Override
    public double calculaImposto(){
        if(getAreaConstruida() <=200){
            return 0;
        }else if(areaTerreno<1000){
            return getVR() * (getAreaConstruida() - 200);
        }else{
            return getVR() * (getAreaConstruida() - 200) + 100 * getVR();
        }
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString()).append(" Imposto: ").append(calculaImposto()).append("\n");
        
    return sb.toString();
    }
}
