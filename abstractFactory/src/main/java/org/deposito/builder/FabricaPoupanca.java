package org.deposito.builder;

public class FabricaPoupanca implements FabricaAbstrata{

    @Override
    public DepositoBancario criarDeposito() {
        return new DepositoContaPoupanca();
    }

    @Override
    public TipoConta criarTipoConta() {
        return new TipoContaPoupanca();
    }
}
