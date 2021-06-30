package br.com.isaque.lsp;

public interface IPaymentInstrument {
    void validate() throws Exception;
    void collectPayment();
}
