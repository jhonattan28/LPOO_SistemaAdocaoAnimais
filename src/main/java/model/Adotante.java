package model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "adotantes")
public class Adotante implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "adotante_id")
    private int id;

    @Column(name = "adotante_nome", nullable = false)
    private String nome;

    @Column(name = "adotante_cpf", nullable = false)
    private String cpf;

    @Column(name = "adotante_dataNascimento", nullable = false)
    private LocalDate dataNascimento;

    @Column(name = "adotante_endereco")
    private String endereco;

    @Column(name = "adotante_telefone")
    private String telefone;

    public Adotante(int id, String nome, String cpf, LocalDate dataNascimento, String endereco, String telefone) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
        this.telefone = telefone;
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String exibirDados() {
        String aux = "Adotante cadastrado:\n";
        aux += "Nome: " + nome + "\n";
        aux += "Cpf: " + cpf + "\n";
        aux += "Data de Nascimento: " + dataNascimento + "\n";
        aux += "Endereço: " + endereco + "\n";
        aux += "Telefone: " + telefone + "\n";
        return aux;
    }

    @OneToMany(mappedBy = "adotante")
    private List<Adocao> adocoes;

    public List<Adocao> getAdocoes() {
        return adocoes;
    }

    public void setAdocoes(List<Adocao> adocoes) {
        this.adocoes = adocoes;
    }
}
