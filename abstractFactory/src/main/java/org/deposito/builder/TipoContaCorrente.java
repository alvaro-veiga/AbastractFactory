package org.deposito.builder;

public class TipoContaCorrente implements TipoConta{
    @Override
    public void receber(float valor) {
        System.out.println("Recebendo na conta corrente: " + valor);
    }
}
