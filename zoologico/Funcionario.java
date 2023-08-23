package zoologico;

public class Funcionario {

    private String cargo;
    private Setor setor;
    private int senha;
    private int id;


    
    public Funcionario(Setor setor, int senha, int id) {
        this.setor = setor;
        this.senha = senha;
        this.id = id;
        this.cargo = cargo;
    }
    
    public Setor getSetor() {
        return setor;
    }
    
    public void setSetor(Setor setor) {
        this.setor = setor;
    }
    
    public int getSenha() {
        return senha;
    }
    
    public void setSenha(int senha) {
        this.senha = senha;
    }
    
    public String getCargo()
    {
        return cargo;
    }
    
    public void setCargo (String cargo) {
        this.cargo = cargo;
    }
    
    public int getId() {
            return id;
        }
    
        public void setId(int id) {
            this.id = id;
        }
    public class Funcionario extends Pessoa{
        

}
}

    

