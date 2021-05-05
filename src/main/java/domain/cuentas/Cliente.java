package domain.cuentas;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Cliente {
    private String nroDeDocumento;
    private List<Cuenta> cuentas;

    public Cliente(String nroDeDocumento) {
        this.nroDeDocumento = nroDeDocumento;
        this.cuentas = new ArrayList<Cuenta>();
    }

    public String getNroDeDocumento() {
        return nroDeDocumento;
    }

    public Stream<Cuenta> cuentasQueSuperanUnValorDeSaldo(Float valorDeSaldoASuperar){
        return this.cuentas.stream()
                .filter(unaCuenta -> unaCuenta.superaValorDeterminado(valorDeSaldoASuperar));
    }
}
