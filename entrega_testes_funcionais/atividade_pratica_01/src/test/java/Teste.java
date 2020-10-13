import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Teste {

    /*
     * Partições criadas:
     *      - Partição abaixo do salario médio (salario < 900);
     *      - Partição salario médio ( 900 < salario < 1200);
     *      - Partição acima do salario médio ( 1200 < salario);
     * */

    @Test
    public void testAbaixo() {
        Contas contas = new Contas();

        int calcularsalario = contas.calcularsalario(6,5);

        assertEquals(495, calcularsalario);
    }

    @Test
    public void testMedio() {
        Contas contas = new Contas();

        int calcularsalario = contas.calcularsalario(8,8);
        assertEquals(1057, calcularsalario);
    }

    @Test
    public void testAcima() {
        Contas contas = new Contas();

        int calcularsalario = contas.calcularsalario(8,10);
        assertEquals(1320, calcularsalario);
    }
}
