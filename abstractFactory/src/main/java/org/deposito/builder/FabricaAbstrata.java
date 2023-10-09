package org.deposito.builder;

public interface FabricaAbstrata {
    DepositoBancario criarDeposito();
    TipoConta criarTipoConta();
}
