import domain.cuentas.Cliente;
import domain.cuentas.Control;
import domain.cuentas.Cuenta;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestCuentas {
    static Cliente cliente1;
    static Cliente cliente2;
    static Control control;
    static Cuenta cuenta1;
    static Cuenta cuenta2;
    static Cuenta cuenta3;

    @BeforeClass
    public static void init(){
        cliente1 = new Cliente("123456789");
        cliente2 = new Cliente("123345678");
        cuenta1 = new Cuenta(1000);
        cuenta2 = new Cuenta(1500);
        cuenta3 = new Cuenta(1200);
        control = new Control();

        cliente1.agregarCuenta(cuenta1);
        cliente1.agregarCuenta(cuenta2);
        cliente1.agregarCuenta(cuenta3);

        cliente2.agregarCuenta(cuenta2);

        control.agregarCliente(cliente1);
        control.agregarCliente(cliente2);
    }

    @Test
    public void cuentaSuperaValorDeterminado(){
        Assert.assertTrue(cuenta1.superaValorDeterminado(500));
    }

    @Test
    public void buscarCliente(){
        Assert.assertEquals(cliente1,control.buscarCliente("123456789"));
    }

    @Test
    public void cantidadDeCuentasDelClienteQueSuperaLos900(){
        Assert.assertEquals(3,control.cantidadDeCuentasDelClienteQueSuperaUn(900,"123456789"));
    }

    @Test
    public void cantidadDeCuentasDelClienteQueSuperaLos1300(){
        Assert.assertEquals(1,control.cantidadDeCuentasDelClienteQueSuperaUn(1300,"123456789"));
    }

    @Test
    public void cantidadDeCuentasDelClienteQueSuperaLos1000(){
        Assert.assertEquals(1,control.cantidadDeCuentasDelClienteQueSuperaUn(1300,"123345678"));
    }
}
