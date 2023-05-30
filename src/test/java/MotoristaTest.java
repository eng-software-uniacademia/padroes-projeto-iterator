import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MotoristaTest {
    @Test
    void deveContarPassageirosOnibus() {
        Onibus onibus = new Onibus(
                new Passageiro("Jose", true),
                new Passageiro("Maria", true),
                new Passageiro("Joao", false),
                new Passageiro("Ronaldo", true),
                new Passageiro("Zina", true)
        );
        assertEquals(4, Motorista.contarPassageirosPresentesOnibus(onibus));
    }

    @Test
    void deveContarTotalPassageiros() {
        Onibus onibus = new Onibus(
                new Passageiro("Jose", true),
                new Passageiro("Maria", true),
                new Passageiro("Joao", false),
                new Passageiro("Ronaldo", true),
                new Passageiro("Zina", true)
        );
        assertEquals(5, Motorista.contarTotalPassageiros(onibus));
    }
}
