package model;

public class Coelho extends Animal{

    public Coelho(int id, String nome, int idade, String sexo, boolean disponivel) {
        super(id, nome, idade, sexo, disponivel);
    }

    @Override
    public boolean verificarCriteriosAdocao(TipoMoradia tipoMoradiaAdotante, boolean ambienteCalmoAdotante) {
        
        return false;
        
    }
    
}
