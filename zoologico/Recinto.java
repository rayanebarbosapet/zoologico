package zoologico;

public class Recinto {

    private String nome;
    private String animal;
    private Funcionario id;
    private Setor idSetor;
   
    public Recinto(String nome, String animal) {
        this.nome = nome;
        this.animal = animal;
        this.id = id;
        this.idSetor = idSetor;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getAnimal() {
        return animal;
    }
    public void setAnimal(String animal) {
        this.animal = animal;
    }
    public Funcionario getId() {
        return id;
    }

    public void setId(Funcionario id) {
        this.id = id;
    }

    public Setor getIdSetor() {
        return idSetor;
    }

    public void setIdSetor(Setor idSetor) {
        this.idSetor = idSetor;
    }

    
}
