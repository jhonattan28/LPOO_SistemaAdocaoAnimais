package model;

import java.time.LocalDate;

public class Adocao {
    private int id;
    private final LocalDate dataSolicitacao;
    private String status;
    private LocalDate dataAdocao;
    private Adotante adotante;
    private Animal animal;

    public Adocao(int id, Adotante adotante, Animal animal) {
        this.id = id;
        this.dataSolicitacao = LocalDate.now();
        this.status = "Pendente";
        this.adotante = adotante;
        this.animal = animal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDate getDataAdocao() {
        return dataAdocao;
    }

    public void setDataAdocao(LocalDate dataAdocao) {
        this.dataAdocao = dataAdocao;
    }

    public Adotante getAdotante() {
        return adotante;
    }

    public void setAdotante(Adotante adotante) {
        this.adotante = adotante;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }
    
    
    
}
