package org.deposito.builder;

public class Cliente {
    private DepositoBancario deposito;
    private TipoConta tipoConta;

    public Cliente(FabricaAbstrata fabrica){
        this.deposito = fabrica.criarDeposito();
        this.tipoConta = fabrica.criarTipoConta();
    }

    public float depositar(float valor){
        this.deposito.depositar(valor);
        return valor;
    }

    public float receber(float valor){
        this.tipoConta.receber(valor);
        return valor;
    }
}
