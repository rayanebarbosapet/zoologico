package zoologico;

public class Pessoa {
    private String nome;
    private String cpf;
    private String endereco;
    private String email;
    private String tel;
    
    public Pessoa(String nome, String cpf, String endereco, String email, String tel) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.email = email;
        this.tel = tel;
    }
    public Pessoa(String nome2, String cpf2, String cargo) {
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
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getTel() {
        return tel;
    }
    public void setTel(String tel) {
        this.tel = tel;
    }

     public class Funcionario extends Pessoa{}

}
