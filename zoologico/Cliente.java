package zoologico;

public class Cliente {

    private String nome;
    private String cpf;
    private String endereco;
    private String tpIngresso;
    
    public Cliente(String nome, String cpf, String endereco, String tpIngresso) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.tpIngresso = tpIngresso;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public String getTpIngresso() {
        return tpIngresso;
    }
    public void setTpIngresso(String tpIngresso) {
        this.tpIngresso = tpIngresso;
    }
    
}
