package probleme.autobuz.p10.clase;

public class CardCalatorie implements TipPlata{

    @Override
    public void plateste(double PretBilet) {
        System.out.println("Plata cu cardul de calatorie in valoare de " + PretBilet + " lei a fost efectuata.");
    }
}
