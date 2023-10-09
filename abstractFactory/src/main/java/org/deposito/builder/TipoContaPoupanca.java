package org.deposito.builder;

public class TipoContaPoupanca implements TipoConta{
    @Override
    public void receber(float valor) {
        System.out.println("Recebendo na conta poupança: " + valor);
    }
}
