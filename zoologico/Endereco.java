package zoologico;

public class Endereco {

    private String rua;
    private String bairro;
    private String referencia;
    private int numero;
   
    public Endereco(String rua, String bairro, String referencia, int numero, int cep) {
        this.rua = rua;
        this.bairro = bairro;
        this.referencia = referencia;
        this.numero = numero;
        this.cep = cep;
    }
    private int cep;
    public String getRua() {
        return rua;
    }
    public void setRua(String rua) {
        this.rua = rua;
    }
    public String getBairro() {
        return bairro;
    }
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    public String getReferencia() {
        return referencia;
    }
    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public int getCep() {
        return cep;
    }
    public void setCep(int cep) {
        this.cep = cep;
    } 
    
}
