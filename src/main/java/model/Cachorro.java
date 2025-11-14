package model;

public class Cachorro extends Animal {

    private String porte;
    private boolean necessitaEspacoAberto;
    private boolean treinado;

    public Cachorro(int id, String nome, int idade, String sexo, boolean disponivel, String porte, boolean necessitaEspacoAberto, boolean treinado) {
        super(id, nome, idade, sexo, disponivel);
        this.porte = porte;
        this.necessitaEspacoAberto = necessitaEspacoAberto;
        this.treinado = treinado;
    }

    public String getPorte() {
        return porte;
    }

    public void setPorte(String porte) {
        this.porte = porte;
    }

    public boolean isNecessitaEspacoAberto() {
        return necessitaEspacoAberto;
    }

    public void setNecessitaEspacoAberto(boolean necessitaEspacoAberto) {
        this.necessitaEspacoAberto = necessitaEspacoAberto;
    }

    public boolean isTreinado() {
        return treinado;
    }

    public void setTreinado(boolean treinado) {
        this.treinado = treinado;
    }

    @Override
    public boolean verificarCriteriosAdocao(TipoMoradia tipoMoradiaAdotante, boolean ambienteCalmoAdotante) {

        /*if (this.necessitaEspacoAberto && tipoMoradiaAdotante == 2) {
            return false;
        }*/
        if (this.getIdade() > 7 && !ambienteCalmoAdotante) {
            return false;
        }

        return true;
    }
}
