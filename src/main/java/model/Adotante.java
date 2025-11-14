package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Adotante {

    private int id;
    private String nome;
    private String cpf;
    private LocalDate dataNascimento;
    private String endereco;
    private final List<Adocao> historicoAdocoes;
    private TipoMoradia tipoMoradia;
    private boolean ambienteCalmo;

    public Adotante(int id, String nome, String cpf, LocalDate dataNascimento, String endereco, TipoMoradia tipoMoradia, boolean ambienteCalmo) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
        this.historicoAdocoes = new ArrayList<>();
        this.tipoMoradia = tipoMoradia;
        this.ambienteCalmo = ambienteCalmo;
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

    public TipoMoradia getTipoMoradia() {
        return tipoMoradia;
    }

    public void setTipoMoradia(TipoMoradia tipoMoradia) {
        this.tipoMoradia = tipoMoradia;
    }

    public boolean isAmbienteCalmo() {
        return ambienteCalmo;
    }

    public void setAmbienteCalmo(boolean ambienteCalmo) {
        this.ambienteCalmo = ambienteCalmo;
    }
    
    
}
