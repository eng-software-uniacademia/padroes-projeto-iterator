import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Onibus implements Iterable<Passageiro> {
    private List<Passageiro> passageiros = new ArrayList<>();

    public Onibus(Passageiro... passageiros) {
        this.passageiros = Arrays.asList(passageiros);
    }

    @Override
    public Iterator<Passageiro> iterator() {
        return passageiros.iterator();
    }
}
