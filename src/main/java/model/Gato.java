package model;

public class Gato extends Animal {

    private boolean brigaComOutrosGatos;
    private boolean ficaDentroDeCasa;

    public Gato(int id, String nome, int idade, String sexo, boolean disponivel, boolean brigaComOutrosGatos, boolean ficaDentroDeCasa) {
        super(id, nome, idade, sexo, disponivel);
        this.brigaComOutrosGatos = brigaComOutrosGatos;
        this.ficaDentroDeCasa = ficaDentroDeCasa;
    }

    public boolean isBrigaComOutrosGatos() {
        return brigaComOutrosGatos;
    }

    public void setBrigaComOutrosGatos(boolean brigaComOutrosGatos) {
        this.brigaComOutrosGatos = brigaComOutrosGatos;
    }

    public boolean isFicaDentroDeCasa() {
        return ficaDentroDeCasa;
    }

    public void setFicaDentroDeCasa(boolean ficaDentroDeCasa) {
        this.ficaDentroDeCasa = ficaDentroDeCasa;
    }

    @Override
    public boolean verificarCriteriosAdocao(TipoMoradia tipoMoradiaAdotante, boolean ambienteCalmoAdotante) {
        if (this.brigaComOutrosGatos && !ambienteCalmoAdotante) {
            return false;
        }
        /*if (!this.ficaDentroDeCasa && tipoMoradiaAdotante == 2) {
            return false;
        }*/
        if (this.getIdade() > 7 && !ambienteCalmoAdotante) {
            return false;
        }

        return true;
    }
}
