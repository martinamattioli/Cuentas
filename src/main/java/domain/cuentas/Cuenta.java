package domain.cuentas;

public class Cuenta {
    private Float valorDeSaldo;

    public void setValorDeSaldo(Float valorDeSaldo) {
        this.valorDeSaldo = valorDeSaldo;
    }

    public Float getValorDeSaldo() {
        return valorDeSaldo;
    }

    public boolean superaValorDeterminado(Float valorASuperar){
        return valorDeSaldo > valorASuperar;
    }


}
