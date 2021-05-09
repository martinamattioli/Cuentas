package domain.cuentas;

public class Cuenta {
    private float valorDeSaldo;

    public Cuenta(float valorDeSaldo){
        this.valorDeSaldo = valorDeSaldo;
    }

    public float getValorDeSaldo() {
        return valorDeSaldo;
    }

    public boolean superaValorDeterminado(float valorASuperar){
            return valorDeSaldo > valorASuperar;
    }
}
