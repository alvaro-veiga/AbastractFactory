import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.deposito.builder.Cliente;
import org.deposito.builder.FabricaAbstrata;
import org.deposito.builder.FabricaCorrente;
import org.deposito.builder.FabricaPoupanca;



public class ClienteTest {

    @Test
    public void deveRetornarDepositoContaCorrente() {
        FabricaAbstrata fabrica = new FabricaCorrente();
        Cliente cliente = new Cliente(fabrica);
        cliente.depositar(100);
        assertEquals(100, cliente.depositar(100));
    }

    @Test
    public void deveRetornarDepositoContaPoupanca() {
        FabricaAbstrata fabrica = new FabricaPoupanca();
        Cliente cliente = new Cliente(fabrica);
        cliente.depositar(50);
        assertEquals(50, cliente.depositar(50));
    }

    @Test
    public void deveRetornarReceberContaCorrente() {
        FabricaAbstrata fabrica = new FabricaCorrente();
        Cliente cliente = new Cliente(fabrica);
        cliente.receber(100);
        assertEquals(100, cliente.receber(100));
    }

    @Test
    public void deveRetornarReceberContaPoupanca() {
        FabricaAbstrata fabrica = new FabricaPoupanca();
        Cliente cliente = new Cliente(fabrica);
        cliente.receber(50);
        assertEquals(50, cliente.receber(50));
    }
}
