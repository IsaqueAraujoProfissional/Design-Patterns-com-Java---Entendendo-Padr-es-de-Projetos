package br.com.isaque.adapter.payoneer;

import br.com.isaque.adapter.utils.Token;

public interface IPayoneerPayments {

    Token authToken();
    void sendPayment();
    void receivedPayment();
}
