package domain.cuentas;

import java.util.List;

public class Control {
    private List<Cliente> clientes;

    private Cliente buscarCliente(String nroDeDocumento){
        return this.clientes.stream()
                .filter(unCliente->unCliente.getNroDeDocumento().equals(nroDeDocumento))
                .findFirst()
                .get();
    }

    public Long cantidadDeCuentasDelClienteQueSuperaUn(Float valorDeterminado,String nroDeDocumento){
        return this.buscarCliente(nroDeDocumento).cuentasQueSuperanUnValorDeSaldo(valorDeterminado).count();
    }
}
