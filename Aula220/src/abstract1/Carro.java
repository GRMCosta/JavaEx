package abstract1;

public class Carro extends Vehicle {

    @Override
    boolean verificaSeguranca() {
        System.out.println("Verificando freio de mão");
        return Boolean.TRUE;
    }

    @Override
    boolean verificaLuzes() {
        System.out.println("Verificando bateria");
        return  Boolean.TRUE;
    }

    @Override
    boolean ligar() {
        System.out.println("Ligando...");
        return  Boolean.TRUE;
    }

}
