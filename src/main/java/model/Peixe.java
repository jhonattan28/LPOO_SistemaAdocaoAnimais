package model;

public class Peixe extends Animal {

    public Peixe(int id, String nome, int idade, String sexo, boolean disponivel) {
        super(id, nome, idade, sexo, disponivel);
    }

    @Override
    public boolean verificarCriteriosAdocao(TipoMoradia tipoMoradiaAdotante, boolean ambienteCalmoAdotante) {
        return false;
    }
    
}
