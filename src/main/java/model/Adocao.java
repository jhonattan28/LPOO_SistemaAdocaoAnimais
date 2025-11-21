package model;

import java.io.Serializable;
import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import util.Util;

@Entity
@Table(name = "adocoes")
public class Adocao implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "adocao_id")
    private int id;

    @Column(name = "adocao_data_hora", nullable = false)
    private LocalDate dataAdocao;

    @ManyToOne
    @JoinColumn(name = "adocao_adotante")
    private Adotante adotante;

    @ManyToOne
    @JoinColumn(name = "adocao_animal")
    private Animal animal;

    public Adocao(int id, Adotante adotante, Animal animal) {
        this.id = id;
        this.dataAdocao = LocalDate.now();
        this.adotante = adotante;
        this.animal = animal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    @Override
    public String toString() {
        return Util.formatarDataHora(dataAdocao);
    }

    public String exibirDados() {
        String aux = "Dados da Adocao:\n";
        aux += "Data|Hora:" + Util.formatarDataHora(dataAdocao) + "\n";
        aux += "Veiculo" + getAdotante().getNome() + "\n";
        aux += "Cliente: " + getAnimal().getNome() + "\n";
        return aux;
    }
}
