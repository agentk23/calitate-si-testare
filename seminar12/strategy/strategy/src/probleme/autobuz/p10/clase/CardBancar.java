package probleme.autobuz.p10.clase;

public class CardBancar implements TipPlata{

    @Override
    public void plateste(double PretBilet) {
        System.out.println("Plata cu cardul bancar in valoare de " + PretBilet + " lei a fost efectuata");
    }
}
