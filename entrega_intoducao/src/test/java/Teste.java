import junit.framework.TestCase;

public class Teste extends TestCase{

    public void testSalarioFinal() {

        Contas contas = new Contas();

        int calcularsalario = contas.calcularsalario(6,5);

        assertEquals(495, calcularsalario);
    }
}
