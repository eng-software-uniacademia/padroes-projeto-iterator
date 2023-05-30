import java.util.Iterator;

public class Motorista {
    public static Integer contarPassageirosPresentesOnibus(Onibus onibus) {
        int quantidade = 0;
        for (Passageiro passageiro : onibus) {
            if (passageiro.isPresente()) {
                quantidade++;
            }
        }

        return quantidade;
    }

    public static Integer contarTotalPassageiros(Onibus onibus) {
        int quantidade = 0;
        for (Iterator a = onibus.iterator(); a.hasNext(); ) {
            quantidade++;
            a.next();
        }

        return quantidade;
    }
}
