package probleme.autobuz.p10.clase;

public class SMS implements TipPlata{

        @Override
        public void plateste(double PretBilet) {
            System.out.println("Plata cu SMS in valoare de " + PretBilet + " lei a fost efectuata");
        }
}
