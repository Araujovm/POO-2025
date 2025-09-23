package poo.edu;

public class App {
    public static void main(String[] args) {

        Imovel.setVR(15);
        Geo g1 = new Geo(1,2);
        Residencial r1 = new Residencial("Marco",894,g1,1000);
        Residencial r2 = new Residencial("Marco",600,g1,300);
        Residencial r3 = new Residencial("Marco",300,g1,500);
        Residencial r4 = new Residencial("co",160,g1,2000);
        Residencial r5 = new Residencial("o",700,g1,3000);
        Comercial c6 = new Comercial("Marco",576,g1);
        CadastroImoveis CI = new CadastroImoveis();
        CI.addImovel(r1);
        CI.addImovel(r2);
        CI.addImovel(r3);
        CI.addImovel(r4);
        CI.addImovel(r5);
        CI.addImovel(c6);

        System.out.println(CI.listarImoveis());
        System.out.println(CI.listarImoveis("Marco"));
        
    }
}
