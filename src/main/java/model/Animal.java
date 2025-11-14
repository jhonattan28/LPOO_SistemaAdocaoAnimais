package model;

public abstract class Animal {

    private int id;
    private String nome;
    private int idade;
    private String sexo;
    private boolean disponivel;

    public Animal(int id, String nome, int idade, String sexo, boolean disponivel) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.disponivel = disponivel;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public boolean verificarDisponibilidade() {
        return this.disponivel;
    }

    public abstract boolean verificarCriteriosAdocao(TipoMoradia tipoMoradiaAdotante, boolean ambienteCalmoAdotante);    
}
