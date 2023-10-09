package org.deposito.builder;

public class FabricaCorrente implements FabricaAbstrata{
    @Override
    public DepositoBancario criarDeposito() {
        return new DepositoContaCorrente();
    }

    @Override
    public TipoConta criarTipoConta() {
        return new TipoContaCorrente();
    }
}
