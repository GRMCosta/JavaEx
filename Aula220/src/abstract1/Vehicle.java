package abstract1;

public abstract class Vehicle {

    // Verificar segurança
    // Verificar luzes
    // Ligar

    public final void verificarELigar() {
        if (verificaSeguranca()) {
            if (verificaLuzes()) {
                ligar();
            }
        }
    }

    abstract boolean verificaSeguranca();

    abstract boolean verificaLuzes();

    abstract boolean ligar();

}
