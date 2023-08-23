package zoologico;

public class Cliente {

    private String tpIngresso;
    
    
    public Cliente(String nome, String cpf, String endereco, String tpIngresso) {

        this.tpIngresso = tpIngresso;
    }

    public String getTpIngresso() {
        return tpIngresso;
    }
    public void setTpIngresso(String tpIngresso) {
        this.tpIngresso = tpIngresso;
    }
    
}
