package zoologico;

public class Animal {

    private  String nome;
    private Recinto recinto;
    private Setor setor;
    
    public Animal(String nome, Recinto recinto, Setor setor, int id) {
        this.nome = nome;
        this.recinto = recinto;
        this.setor = setor;
        this.id = id;
    }
    private int id;
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Recinto getRecinto() {
        return recinto;
    }
    public void setRecinto(Recinto recinto) {
        this.recinto = recinto;
    }
    public Setor getSetor() {
        return setor;
    }
    public void setSetor(Setor setor) {
        this.setor = setor;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    
}
