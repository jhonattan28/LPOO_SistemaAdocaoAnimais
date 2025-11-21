package model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "animais")
public class Animal implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "animal_id")
    private int id;

    @Enumerated(EnumType.STRING)
    @Column(name = "animal_especie")
    private EspecieAnimal especie;

    @Column(name = "animal_nome", nullable = false)
    private String nome;

    @Column(name = "animal_idade")
    private String idade;

    @Enumerated(EnumType.STRING)
    @Column(name = "animal_sexo")
    private GenAnimal sexo;

    @Column(name = "animal_disponivel")
    private boolean disponivel;

    public Animal(int id, EspecieAnimal especie, String nome, String idade, GenAnimal sexo, boolean disponivel) {
        this.id = id;
        this.especie = especie;
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

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public GenAnimal getSexo() {
        return sexo;
    }

    public void setSexo(GenAnimal sexo) {
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

    public EspecieAnimal getEspecie() {
        return especie;
    }

    public void setEspecie(EspecieAnimal especie) {
        this.especie = especie;
    }

    public String exibirDados() {
        String aux = "Animal cadastrado:\n";
        aux += "Espécie: " + especie + "\n";
        aux += "Nome: " + nome + "\n";
        aux += "Idade: " + idade + "\n";
        aux += "Sexo: " + sexo + "\n";
        aux += disponivel ? "[DISPONIVEL]" : "[NÃO DISPONIVEL]";
        return aux;
    }

    @OneToMany(mappedBy = "animal")
    private List<Adocao> adocoes;

    public List<Adocao> getAdocoes() {
        return adocoes;
    }

    public void setAdocoes(List<Adocao> adocoes) {
        this.adocoes = adocoes;
    }

}
