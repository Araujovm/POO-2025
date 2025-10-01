package aagustini.poo;

public class ComunidadePuc implements VerificaPessoa {
    public boolean testar(Pessoa p) {
        return p.getEMail().contains("pucrs");
    }
}