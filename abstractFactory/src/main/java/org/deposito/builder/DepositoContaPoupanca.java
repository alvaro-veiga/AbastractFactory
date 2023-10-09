package org.deposito.builder;

public class DepositoContaPoupanca implements DepositoBancario{
    @Override
    public void depositar(float valor) {
        System.out.println("Depositando na conta poupanca: " + valor);
    }
}
