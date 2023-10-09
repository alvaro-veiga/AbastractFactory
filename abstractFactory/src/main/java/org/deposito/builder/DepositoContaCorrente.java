package org.deposito.builder;

public class DepositoContaCorrente implements DepositoBancario{
    @Override
    public void depositar(float valor) {
        valor = valor - 0.10f;
        System.out.println("Depositando na conta corrente: " + valor);
    }
}
