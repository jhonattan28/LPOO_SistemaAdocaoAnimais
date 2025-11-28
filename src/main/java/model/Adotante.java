package model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.time.format.DateTimeFormatter;

@Entity
@Table(name = "adotantes")
public class Adotante implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "adotante_id")
    private Long id;

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

    /*public Adotante(int id, String nome, String cpf, LocalDate dataNascimento, String endereco, String telefone) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
        this.telefone = telefone;
    }*/
    public Adotante() {
        adocoes = new ArrayList<>();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
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

    @Override
    public String toString() {
        return nome;
    }

    public String exibirDados() {
        DateTimeFormatter formatacao = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        String dataFormatada = dataNascimento.format(formatacao);

        String aux = "Adotante cadastrado:\n";
        aux += "Nome: " + nome + "\n";
        aux += "Cpf: " + cpf + "\n";
        aux += "Data de Nascimento: " + dataFormatada + "\n";
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

    @Override
    public int hashCode() {
        return (this.id != null ? this.id.hashCode() : 0);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }

        final Adotante other = (Adotante) obj;

        if (this.id == null || other.id == null) {
            return false;
        }
        return this.id.equals(other.id);
    }
}
