package br.com.isaque.adapter.paypal;

import br.com.isaque.adapter.utils.Token;

public interface IPayPalPayments {

    Token authToken();
    void paypalPayment();
    void paypalReceived();
}
