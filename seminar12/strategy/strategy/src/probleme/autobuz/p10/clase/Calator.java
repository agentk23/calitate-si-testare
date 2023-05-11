package probleme.autobuz.p10.clase;

public class Calator {
    private String nume;
    private TipPlata plataCalatorie;

    public Calator(String nume) {
        this.plataCalatorie = new CardCalatorie();
        this.nume = nume;
    }

    public void setPlataCalatorie(TipPlata plataCalatorie) {
        this.plataCalatorie = plataCalatorie;
    }
    public void plateste(double PretBilet) {
        this.plataCalatorie.plateste(PretBilet);
    }
}
