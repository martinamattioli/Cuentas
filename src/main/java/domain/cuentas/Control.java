package domain.cuentas;

import java.util.ArrayList;
import java.util.List;

public class Control {
    private List<Cliente> clientes;

    public Control(){
        this.clientes = new ArrayList<Cliente>();
    }

    public void agregarCliente(Cliente cliente){
        this.clientes.add(cliente);
    }

    public Cliente buscarCliente(String nroDeDocumento){
        return this.clientes.stream()
                .filter(unCliente->unCliente.getNroDeDocumento().equals(nroDeDocumento))
                .findFirst()
                .get();
    }

    public long cantidadDeCuentasDelClienteQueSuperaUn(float valorDeterminado,String nroDeDocumento){
        return this.buscarCliente(nroDeDocumento).cuentasQueSuperanUnValorDeSaldo(valorDeterminado).count();
    }
}
